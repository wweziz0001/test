package E2;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f638d = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f641c;

    public b(int i, byte[] bArr) throws GeneralSecurityException {
        if (!B0.f(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        o.a(bArr.length);
        this.f639a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f638d.get()).getBlockSize();
        this.f641c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f640b = i;
    }

    public final void a(byte[] bArr, int i, int i5, byte[] bArr2, int i6, byte[] bArr3, boolean z4) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f638d.get();
        byte[] bArr4 = new byte[this.f641c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f640b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f639a;
        if (z4) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i5, bArr2, i6) != i5) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
