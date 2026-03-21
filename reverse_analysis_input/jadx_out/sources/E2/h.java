package E2;

import a.AbstractC0149a;
import b3.AbstractC0307a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import r2.InterfaceC0781a;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC0781a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2.j f659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f660c;

    public h(k kVar, r2.j jVar, int i) {
        this.f658a = kVar;
        this.f659b = jVar;
        this.f660c = i;
    }

    @Override // r2.InterfaceC0781a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        b bVar = (b) this.f658a;
        bVar.getClass();
        int length = bArr.length;
        int i = bVar.f640b;
        int i5 = Integer.MAX_VALUE - i;
        if (length > i5) {
            throw new GeneralSecurityException(AbstractC0307a.i("plaintext length can not exceed ", i5));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrA = n.a(i);
        System.arraycopy(bArrA, 0, bArr3, 0, i);
        bVar.a(bArr, 0, bArr.length, bArr3, bVar.f640b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return AbstractC0149a.j(bArr3, this.f659b.b(AbstractC0149a.j(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // r2.InterfaceC0781a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f660c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f659b.a(bArrCopyOfRange2, AbstractC0149a.j(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        b bVar = (b) this.f658a;
        bVar.getClass();
        int length2 = bArrCopyOfRange.length;
        int i5 = bVar.f640b;
        if (length2 < i5) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i5];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i5);
        int length3 = bArrCopyOfRange.length;
        int i6 = bVar.f640b;
        byte[] bArr4 = new byte[length3 - i6];
        bVar.a(bArrCopyOfRange, i6, bArrCopyOfRange.length - i6, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
