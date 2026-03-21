package u2;

import E2.n;
import E2.o;
import b3.AbstractC0307a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import r2.InterfaceC0781a;

/* JADX INFO: renamed from: u2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0894a implements InterfaceC0781a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E2.a f10251b = new E2.a(6);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f10252c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f10253a;

    static {
        boolean z4;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f10252c = z4;
    }

    public C0894a(byte[] bArr) throws InvalidAlgorithmParameterException {
        o.a(bArr.length);
        this.f10253a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(int i, byte[] bArr) throws GeneralSecurityException {
        if (f10252c) {
            return new GCMParameterSpec(128, bArr, 0, i);
        }
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            return new IvParameterSpec(bArr, 0, i);
        }
        throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
    }

    @Override // r2.InterfaceC0781a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = n.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrA.length, bArrA);
        E2.a aVar = f10251b;
        ((Cipher) aVar.get()).init(1, this.f10253a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) aVar.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) aVar.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(AbstractC0307a.h(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // r2.InterfaceC0781a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(12, bArr);
        E2.a aVar = f10251b;
        ((Cipher) aVar.get()).init(2, this.f10253a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) aVar.get()).updateAAD(bArr2);
        }
        return ((Cipher) aVar.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
