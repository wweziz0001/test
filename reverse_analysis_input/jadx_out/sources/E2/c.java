package E2;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m.B0;
import r2.InterfaceC0781a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0781a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f642e = new a(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f643f = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f647d;

    public c(int i, byte[] bArr) throws GeneralSecurityException {
        if (!B0.e(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f647d = i;
        o.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f646c = secretKeySpec;
        Cipher cipher = (Cipher) f642e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher.doFinal(new byte[16]));
        this.f644a = bArrC;
        this.f645b = c(bArrC);
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i5 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i5] & 255) >>> 7)) & 255);
            i = i5;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // r2.InterfaceC0781a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f647d;
        if (length > 2147483631 - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] bArrA = n.a(i);
        System.arraycopy(bArrA, 0, bArr3, 0, i);
        Cipher cipher = (Cipher) f642e.get();
        SecretKeySpec secretKeySpec = this.f646c;
        cipher.init(1, secretKeySpec);
        byte[] bArrD = d(cipher, 0, bArrA, 0, bArrA.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrD2 = d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f643f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrD));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f647d);
        byte[] bArrD3 = d(cipher, 2, bArr3, this.f647d, bArr.length);
        int length2 = bArr.length + i;
        for (int i5 = 0; i5 < 16; i5++) {
            bArr3[length2 + i5] = (byte) ((bArrD2[i5] ^ bArrD[i5]) ^ bArrD3[i5]);
        }
        return bArr3;
    }

    @Override // r2.InterfaceC0781a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f647d;
        int i5 = (length - i) - 16;
        if (i5 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f642e.get();
        SecretKeySpec secretKeySpec = this.f646c;
        cipher.init(1, secretKeySpec);
        byte[] bArrD = d(cipher, 0, bArr, 0, this.f647d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrD2 = d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrD3 = d(cipher, 2, bArr, this.f647d, i5);
        int length2 = bArr.length - 16;
        byte b4 = 0;
        for (int i6 = 0; i6 < 16; i6++) {
            b4 = (byte) (b4 | (((bArr[length2 + i6] ^ bArrD2[i6]) ^ bArrD[i6]) ^ bArrD3[i6]));
        }
        if (b4 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f643f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrD));
        return cipher2.doFinal(bArr, i, i5);
    }

    public final byte[] d(Cipher cipher, int i, byte[] bArr, int i5, int i6) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.f644a;
        if (i6 == 0) {
            return cipher.doFinal(e(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i7 = 0;
        while (i6 - i7 > 16) {
            for (int i8 = 0; i8 < 16; i8++) {
                bArrDoFinal[i8] = (byte) (bArrDoFinal[i8] ^ bArr[(i5 + i7) + i8]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i7 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i7 + i5, i5 + i6);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = e(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f645b, 16);
            for (int i9 = 0; i9 < bArrCopyOfRange.length; i9++) {
                bArrCopyOf[i9] = (byte) (bArrCopyOf[i9] ^ bArrCopyOfRange[i9]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        }
        return cipher.doFinal(e(bArrDoFinal, bArrCopyOf));
    }
}
