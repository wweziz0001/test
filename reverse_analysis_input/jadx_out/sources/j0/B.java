package j0;

import b0.AbstractC0301e;
import b0.C0298b;
import b0.C0299c;
import d0.AbstractC0370w;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0301e {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f7243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7245o;

    @Override // b0.AbstractC0301e, b0.InterfaceC0300d
    public final ByteBuffer b() {
        int i;
        if (super.isEnded() && (i = this.f7244n) > 0) {
            j(i).put(this.f7243m, 0, this.f7244n).flip();
            this.f7244n = 0;
        }
        return super.b();
    }

    @Override // b0.InterfaceC0300d
    public final void d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f7242l);
        this.f7245o += (long) (iMin / this.f4835b.f4833d);
        this.f7242l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f7242l > 0) {
            return;
        }
        int i5 = i - iMin;
        int length = (this.f7244n + i5) - this.f7243m.length;
        ByteBuffer byteBufferJ = j(length);
        int i6 = AbstractC0370w.i(length, 0, this.f7244n);
        byteBufferJ.put(this.f7243m, 0, i6);
        int i7 = AbstractC0370w.i(length - i6, 0, i5);
        byteBuffer.limit(byteBuffer.position() + i7);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i8 = i5 - i7;
        int i9 = this.f7244n - i6;
        this.f7244n = i9;
        byte[] bArr = this.f7243m;
        System.arraycopy(bArr, i6, bArr, 0, i9);
        byteBuffer.get(this.f7243m, this.f7244n, i8);
        this.f7244n += i8;
        byteBufferJ.flip();
    }

    @Override // b0.AbstractC0301e
    public final C0298b f(C0298b c0298b) throws C0299c {
        if (c0298b.f4832c != 2) {
            throw new C0299c(c0298b);
        }
        this.f7241k = true;
        return (this.i == 0 && this.f7240j == 0) ? C0298b.f4829e : c0298b;
    }

    @Override // b0.AbstractC0301e
    public final void g() {
        if (this.f7241k) {
            this.f7241k = false;
            int i = this.f7240j;
            int i5 = this.f4835b.f4833d;
            this.f7243m = new byte[i * i5];
            this.f7242l = this.i * i5;
        }
        this.f7244n = 0;
    }

    @Override // b0.AbstractC0301e
    public final void h() {
        if (this.f7241k) {
            int i = this.f7244n;
            if (i > 0) {
                this.f7245o += (long) (i / this.f4835b.f4833d);
            }
            this.f7244n = 0;
        }
    }

    @Override // b0.AbstractC0301e
    public final void i() {
        this.f7243m = AbstractC0370w.f5331f;
    }

    @Override // b0.AbstractC0301e, b0.InterfaceC0300d
    public final boolean isEnded() {
        return super.isEnded() && this.f7244n == 0;
    }
}
