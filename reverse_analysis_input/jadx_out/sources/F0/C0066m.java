package F0;

import a0.AbstractC0151B;
import a0.InterfaceC0182h;
import d0.AbstractC0370w;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: F0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0066m implements r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC0182h f797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f799o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f802r;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f800p = new byte[65536];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f796l = new byte[4096];

    static {
        AbstractC0151B.a("media3.extractor");
    }

    public C0066m(InterfaceC0182h interfaceC0182h, long j5, long j6) {
        this.f797m = interfaceC0182h;
        this.f799o = j5;
        this.f798n = j6;
    }

    @Override // F0.r
    public final void A(int i) throws EOFException, InterruptedIOException {
        a(i, false);
    }

    @Override // F0.r
    public final long D() {
        return this.f799o;
    }

    public final boolean a(int i, boolean z4) throws EOFException, InterruptedIOException {
        c(i);
        int i5 = this.f802r - this.f801q;
        while (i5 < i) {
            i5 = i(this.f800p, this.f801q, i, i5, z4);
            if (i5 == -1) {
                return false;
            }
            this.f802r = this.f801q + i5;
        }
        this.f801q += i;
        return true;
    }

    public final void c(int i) {
        int i5 = this.f801q + i;
        byte[] bArr = this.f800p;
        if (i5 > bArr.length) {
            this.f800p = Arrays.copyOf(this.f800p, AbstractC0370w.i(bArr.length * 2, 65536 + i5, i5 + 524288));
        }
    }

    public final int d(byte[] bArr, int i, int i5) throws EOFException, InterruptedIOException {
        int iMin;
        c(i5);
        int i6 = this.f802r;
        int i7 = this.f801q;
        int i8 = i6 - i7;
        if (i8 == 0) {
            iMin = i(this.f800p, i7, i5, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f802r += iMin;
        } else {
            iMin = Math.min(i5, i8);
        }
        System.arraycopy(this.f800p, this.f801q, bArr, i, iMin);
        this.f801q += iMin;
        return iMin;
    }

    @Override // F0.r
    public final void e() {
        this.f801q = 0;
    }

    @Override // F0.r
    public final void f(int i) {
        int iMin = Math.min(this.f802r, i);
        k(iMin);
        int i5 = iMin;
        while (i5 < i && i5 != -1) {
            byte[] bArr = this.f796l;
            i5 = i(bArr, -i5, Math.min(i, bArr.length + i5), i5, false);
        }
        if (i5 != -1) {
            this.f799o += (long) i5;
        }
    }

    public final int i(byte[] bArr, int i, int i5, int i6, boolean z4) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i7 = this.f797m.read(bArr, i + i6, i5 - i6);
        if (i7 != -1) {
            return i6 + i7;
        }
        if (i6 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    public final int j(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f802r, i);
        k(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f796l;
            iMin = i(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.f799o += (long) iMin;
        }
        return iMin;
    }

    public final void k(int i) {
        int i5 = this.f802r - i;
        this.f802r = i5;
        this.f801q = 0;
        byte[] bArr = this.f800p;
        byte[] bArr2 = i5 < bArr.length - 524288 ? new byte[65536 + i5] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i5);
        this.f800p = bArr2;
    }

    @Override // F0.r
    public final boolean l(byte[] bArr, int i, int i5, boolean z4) throws EOFException, InterruptedIOException {
        int iMin;
        int i6 = this.f802r;
        if (i6 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i6, i5);
            System.arraycopy(this.f800p, 0, bArr, i, iMin);
            k(iMin);
        }
        int i7 = iMin;
        while (i7 < i5 && i7 != -1) {
            i7 = i(bArr, i, i5, i7, z4);
        }
        if (i7 != -1) {
            this.f799o += (long) i7;
        }
        return i7 != -1;
    }

    @Override // F0.r
    public final long q() {
        return this.f798n;
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) throws EOFException, InterruptedIOException {
        int i6 = this.f802r;
        int i7 = 0;
        if (i6 != 0) {
            int iMin = Math.min(i6, i5);
            System.arraycopy(this.f800p, 0, bArr, i, iMin);
            k(iMin);
            i7 = iMin;
        }
        if (i7 == 0) {
            i7 = i(bArr, i, i5, 0, true);
        }
        if (i7 != -1) {
            this.f799o += (long) i7;
        }
        return i7;
    }

    @Override // F0.r
    public final void readFully(byte[] bArr, int i, int i5) throws EOFException, InterruptedIOException {
        l(bArr, i, i5, false);
    }

    @Override // F0.r
    public final boolean t(byte[] bArr, int i, int i5, boolean z4) {
        if (!a(i5, z4)) {
            return false;
        }
        System.arraycopy(this.f800p, this.f801q - i5, bArr, i, i5);
        return true;
    }

    @Override // F0.r
    public final long w() {
        return this.f799o + ((long) this.f801q);
    }

    @Override // F0.r
    public final void z(byte[] bArr, int i, int i5) {
        t(bArr, i, i5, false);
    }
}
