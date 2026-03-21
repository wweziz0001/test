package j0;

import b0.AbstractC0301e;
import b0.C0298b;
import b0.C0299c;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0301e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7436o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f7438q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f7440s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f7443v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7439r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7441t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7442u = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f7433l = 100000;
    public final float i = 0.2f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f7434m = 2000000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7432k = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final short f7431j = 1024;

    public z() {
        byte[] bArr = AbstractC0370w.f5331f;
        this.f7440s = bArr;
        this.f7443v = bArr;
    }

    @Override // b0.AbstractC0301e, b0.InterfaceC0300d
    public final boolean a() {
        return super.a() && this.f7436o;
    }

    @Override // b0.InterfaceC0300d
    public final void d(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f4840g.hasRemaining()) {
            int i = this.f7437p;
            short s4 = this.f7431j;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f7440s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s4) {
                        int i5 = this.f7435n;
                        iPosition = ((iLimit3 / i5) * i5) + i5;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f7437p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                AbstractC0360m.h(this.f7441t < this.f7440s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s4) {
                        int i6 = this.f7435n;
                        iLimit = (iPosition2 / i6) * i6;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f7441t;
                int i7 = this.f7442u;
                int length2 = length + i7;
                byte[] bArr = this.f7440s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i7 - (bArr.length - length);
                }
                int i8 = length - length2;
                boolean z4 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i8);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f7440s, length2, iMin);
                int i9 = this.f7442u + iMin;
                this.f7442u = i9;
                AbstractC0360m.h(i9 <= this.f7440s.length);
                boolean z5 = z4 && iPosition3 < i8;
                l(z5);
                if (z5) {
                    this.f7437p = 0;
                    this.f7439r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // b0.AbstractC0301e
    public final C0298b f(C0298b c0298b) throws C0299c {
        if (c0298b.f4832c == 2) {
            return c0298b.f4830a == -1 ? C0298b.f4829e : c0298b;
        }
        throw new C0299c(c0298b);
    }

    @Override // b0.AbstractC0301e
    public final void g() {
        if (a()) {
            C0298b c0298b = this.f4835b;
            int i = c0298b.f4831b * 2;
            this.f7435n = i;
            int i5 = ((((int) ((this.f7433l * ((long) c0298b.f4830a)) / 1000000)) / 2) / i) * i * 2;
            if (this.f7440s.length != i5) {
                this.f7440s = new byte[i5];
                this.f7443v = new byte[i5];
            }
        }
        this.f7437p = 0;
        this.f7438q = 0L;
        this.f7439r = 0;
        this.f7441t = 0;
        this.f7442u = 0;
    }

    @Override // b0.AbstractC0301e
    public final void h() {
        if (this.f7442u > 0) {
            l(true);
            this.f7439r = 0;
        }
    }

    @Override // b0.AbstractC0301e
    public final void i() {
        this.f7436o = false;
        byte[] bArr = AbstractC0370w.f5331f;
        this.f7440s = bArr;
        this.f7443v = bArr;
    }

    public final int k(int i) {
        int length = ((((int) ((this.f7434m * ((long) this.f4835b.f4830a)) / 1000000)) - this.f7439r) * this.f7435n) - (this.f7440s.length / 2);
        AbstractC0360m.h(length >= 0);
        int iMin = (int) Math.min((i * this.i) + 0.5f, length);
        int i5 = this.f7435n;
        return (iMin / i5) * i5;
    }

    public final void l(boolean z4) {
        int length;
        int iK;
        int i = this.f7442u;
        byte[] bArr = this.f7440s;
        if (i == bArr.length || z4) {
            if (this.f7439r == 0) {
                if (z4) {
                    m(i, 3);
                    length = i;
                } else {
                    AbstractC0360m.h(i >= bArr.length / 2);
                    length = this.f7440s.length / 2;
                    m(length, 0);
                }
                iK = length;
            } else if (z4) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iK2 = k(length2) + (this.f7440s.length / 2);
                m(iK2, 2);
                iK = iK2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iK = k(length);
                m(iK, 1);
            }
            AbstractC0360m.g("bytesConsumed is not aligned to frame size: %s" + length, length % this.f7435n == 0);
            AbstractC0360m.h(i >= iK);
            this.f7442u -= length;
            int i5 = this.f7441t + length;
            this.f7441t = i5;
            this.f7441t = i5 % this.f7440s.length;
            int i6 = this.f7439r;
            int i7 = this.f7435n;
            this.f7439r = (iK / i7) + i6;
            this.f7438q += (long) ((length - iK) / i7);
        }
    }

    public final void m(int i, int i5) {
        if (i == 0) {
            return;
        }
        AbstractC0360m.c(this.f7442u >= i);
        if (i5 == 2) {
            int i6 = this.f7441t;
            int i7 = this.f7442u;
            int i8 = i6 + i7;
            byte[] bArr = this.f7440s;
            if (i8 <= bArr.length) {
                System.arraycopy(bArr, i8 - i, this.f7443v, 0, i);
            } else {
                int length = i7 - (bArr.length - i6);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f7443v, 0, i);
                } else {
                    int i9 = i - length;
                    System.arraycopy(bArr, bArr.length - i9, this.f7443v, 0, i9);
                    System.arraycopy(this.f7440s, 0, this.f7443v, i9, length);
                }
            }
        } else {
            int i10 = this.f7441t;
            int i11 = i10 + i;
            byte[] bArr2 = this.f7440s;
            if (i11 <= bArr2.length) {
                System.arraycopy(bArr2, i10, this.f7443v, 0, i);
            } else {
                int length2 = bArr2.length - i10;
                System.arraycopy(bArr2, i10, this.f7443v, 0, length2);
                System.arraycopy(this.f7440s, 0, this.f7443v, length2, i - length2);
            }
        }
        AbstractC0360m.b("sizeToOutput is not aligned to frame size: " + i, i % this.f7435n == 0);
        AbstractC0360m.h(this.f7441t < this.f7440s.length);
        byte[] bArr3 = this.f7443v;
        AbstractC0360m.b("byteOutput size is not aligned to frame size " + i, i % this.f7435n == 0);
        if (i5 != 3) {
            for (int i12 = 0; i12 < i; i12 += 2) {
                int i13 = i12 + 1;
                int i14 = (bArr3[i13] << 8) | (bArr3[i12] & 255);
                int i15 = this.f7432k;
                if (i5 == 0) {
                    i15 = ((((i12 * 1000) / (i - 1)) * (i15 - 100)) / 1000) + 100;
                } else if (i5 == 2) {
                    i15 += (((i12 * 1000) * (100 - i15)) / (i - 1)) / 1000;
                }
                int i16 = (i14 * i15) / 100;
                if (i16 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = 127;
                } else if (i16 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = -128;
                } else {
                    bArr3[i12] = (byte) (i16 & 255);
                    bArr3[i13] = (byte) (i16 >> 8);
                }
            }
        }
        j(i).put(bArr3, 0, i).flip();
    }
}
