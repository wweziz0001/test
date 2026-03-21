package j0;

import b0.AbstractC0301e;
import b0.C0298b;
import b0.C0299c;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0301e {
    public int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f7327j;

    @Override // b0.InterfaceC0300d
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr = this.f7327j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f4835b.f4833d) * this.f4836c.f4833d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f4835b.f4833d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // b0.AbstractC0301e
    public final C0298b f(C0298b c0298b) throws C0299c {
        int[] iArr = this.i;
        if (iArr == null) {
            return C0298b.f4829e;
        }
        if (c0298b.f4832c != 2) {
            throw new C0299c(c0298b);
        }
        int length = iArr.length;
        int i = c0298b.f4831b;
        boolean z4 = i != length;
        int i5 = 0;
        while (i5 < iArr.length) {
            int i6 = iArr[i5];
            if (i6 >= i) {
                throw new C0299c(c0298b);
            }
            z4 |= i6 != i5;
            i5++;
        }
        return z4 ? new C0298b(c0298b.f4830a, iArr.length, 2) : C0298b.f4829e;
    }

    @Override // b0.AbstractC0301e
    public final void g() {
        this.f7327j = this.i;
    }

    @Override // b0.AbstractC0301e
    public final void i() {
        this.f7327j = null;
        this.i = null;
    }
}
