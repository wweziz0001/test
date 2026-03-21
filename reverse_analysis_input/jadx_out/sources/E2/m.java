package E2;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class m implements r2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2.a f667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f668b;

    public m(C2.a aVar, int i) throws InvalidAlgorithmParameterException {
        this.f667a = aVar;
        this.f668b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.f(i, new byte[0]);
    }

    @Override // r2.j
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // r2.j
    public final byte[] b(byte[] bArr) {
        return this.f667a.f(this.f668b, bArr);
    }
}
