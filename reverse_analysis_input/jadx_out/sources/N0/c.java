package N0;

import F0.C0064k;
import F0.C0066m;
import F0.E;
import F0.K;
import F0.r;
import F0.s;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.io.EOFException;
import java.io.InterruptedIOException;
import k0.h;
import l0.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements r, s, h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f1573n;

    public /* synthetic */ c(long j5, Object obj, int i) {
        this.f1571l = i;
        this.f1572m = j5;
        this.f1573n = obj;
    }

    @Override // F0.r
    public void A(int i) throws EOFException, InterruptedIOException {
        ((C0066m) this.f1573n).a(i, false);
    }

    @Override // k0.h
    public long B(long j5, long j6) {
        return -9223372036854775807L;
    }

    @Override // k0.h
    public j C(long j5) {
        return new j(((C0064k) this.f1573n).f785c[(int) j5], r0.f784b[r8], null);
    }

    @Override // F0.r
    public long D() {
        return ((C0066m) this.f1573n).f799o - this.f1572m;
    }

    public int E(int i) {
        c cVar = (c) this.f1573n;
        if (cVar == null) {
            return i >= 64 ? Long.bitCount(this.f1572m) : Long.bitCount(this.f1572m & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f1572m & ((1 << i) - 1));
        }
        return Long.bitCount(this.f1572m) + cVar.E(i - 64);
    }

    public boolean F(int i) {
        if (i < 64) {
            return (this.f1572m & (1 << i)) != 0;
        }
        if (((c) this.f1573n) == null) {
            this.f1573n = new c();
        }
        return ((c) this.f1573n).F(i - 64);
    }

    public void G() {
        this.f1572m = 0L;
        c cVar = (c) this.f1573n;
        if (cVar != null) {
            cVar.G();
        }
    }

    @Override // k0.h
    public long a(long j5) {
        return ((C0064k) this.f1573n).f787e[(int) j5] - this.f1572m;
    }

    @Override // k0.h
    public long c(long j5, long j6) {
        return AbstractC0370w.e(((C0064k) this.f1573n).f787e, j5 + this.f1572m, true);
    }

    @Override // F0.s
    public void d(E e5) {
        ((s) this.f1573n).d(new d(this, e5, e5));
    }

    @Override // F0.r
    public void e() {
        ((C0066m) this.f1573n).f801q = 0;
    }

    @Override // F0.r
    public void f(int i) {
        ((C0066m) this.f1573n).f(i);
    }

    @Override // k0.h
    public boolean i() {
        return true;
    }

    @Override // F0.s
    public void j() {
        ((s) this.f1573n).j();
    }

    @Override // F0.s
    public K k(int i, int i5) {
        return ((s) this.f1573n).k(i, i5);
    }

    @Override // F0.r
    public boolean l(byte[] bArr, int i, int i5, boolean z4) {
        return ((C0066m) this.f1573n).l(bArr, 0, i5, z4);
    }

    @Override // k0.h
    public long m(long j5, long j6) {
        return ((C0064k) this.f1573n).f786d[(int) j5];
    }

    @Override // k0.h
    public long n() {
        return 0L;
    }

    @Override // F0.r
    public long q() {
        return ((C0066m) this.f1573n).f798n - this.f1572m;
    }

    @Override // a0.InterfaceC0182h
    public int read(byte[] bArr, int i, int i5) {
        return ((C0066m) this.f1573n).read(bArr, i, i5);
    }

    @Override // F0.r
    public void readFully(byte[] bArr, int i, int i5) throws EOFException, InterruptedIOException {
        ((C0066m) this.f1573n).l(bArr, i, i5, false);
    }

    @Override // k0.h
    public long s(long j5) {
        return ((C0064k) this.f1573n).f783a;
    }

    @Override // F0.r
    public boolean t(byte[] bArr, int i, int i5, boolean z4) {
        return ((C0066m) this.f1573n).t(bArr, i, i5, z4);
    }

    public String toString() {
        switch (this.f1571l) {
            case 4:
                if (((c) this.f1573n) == null) {
                    return Long.toBinaryString(this.f1572m);
                }
                return ((c) this.f1573n).toString() + "xx" + Long.toBinaryString(this.f1572m);
            default:
                return super.toString();
        }
    }

    @Override // k0.h
    public long u(long j5, long j6) {
        return ((C0064k) this.f1573n).f783a;
    }

    @Override // k0.h
    public long v(long j5, long j6) {
        return 0L;
    }

    @Override // F0.r
    public long w() {
        return ((C0066m) this.f1573n).w() - this.f1572m;
    }

    @Override // F0.r
    public void z(byte[] bArr, int i, int i5) {
        ((C0066m) this.f1573n).t(bArr, i, i5, false);
    }

    public /* synthetic */ c(Object obj, long j5, int i) {
        this.f1571l = i;
        this.f1573n = obj;
        this.f1572m = j5;
    }

    public c(C0066m c0066m, long j5) {
        this.f1571l = 1;
        this.f1573n = c0066m;
        AbstractC0360m.c(c0066m.f799o >= j5);
        this.f1572m = j5;
    }

    public c() {
        this.f1571l = 4;
        this.f1572m = 0L;
    }
}
