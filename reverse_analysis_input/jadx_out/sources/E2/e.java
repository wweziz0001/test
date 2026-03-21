package E2;

import Q1.C;
import a.AbstractC0149a;
import b3.AbstractC0307a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements r2.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f650c = Arrays.asList(64);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f651d = new byte[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f652e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.m f653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f654b;

    public e(byte[] bArr) throws GeneralSecurityException {
        if (!B0.e(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f650c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(AbstractC0307a.l(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f654b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f653a = new Z1.m(bArrCopyOfRange);
    }

    @Override // r2.c
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) j.f663b.f665a.a("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f654b, "AES"), new IvParameterSpec(bArr3));
        return AbstractC0149a.j(bArrC, cipher.doFinal(bArr));
    }

    @Override // r2.c
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) j.f663b.f665a.a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f654b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrO;
        int length = bArr.length;
        Z1.m mVar = this.f653a;
        if (length == 0) {
            return mVar.f(16, f652e);
        }
        byte[] bArrF = mVar.f(16, f651d);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrF = AbstractC0149a.O(C.l(bArrF), mVar.f(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrF.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrF.length;
            bArrO = Arrays.copyOf(bArr3, bArr3.length);
            for (int i5 = 0; i5 < bArrF.length; i5++) {
                int i6 = length2 + i5;
                bArrO[i6] = (byte) (bArrO[i6] ^ bArrF[i5]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrO = AbstractC0149a.O(bArrCopyOf, C.l(bArrF));
        }
        return mVar.f(16, bArrO);
    }
}
