package x0;

import a0.C0170V;
import a0.C0190p;
import java.util.List;
import y0.AbstractC0997e;

/* JADX INFO: loaded from: classes.dex */
public final class O implements A0.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0.w f10547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0170V f10548b;

    public O(A0.w wVar, C0170V c0170v) {
        this.f10547a = wVar;
        this.f10548b = c0170v;
    }

    @Override // A0.w
    public final int a() {
        return this.f10547a.a();
    }

    @Override // A0.w
    public final C0170V b() {
        return this.f10548b;
    }

    @Override // A0.w
    public final void c(boolean z4) {
        this.f10547a.c(z4);
    }

    @Override // A0.w
    public final C0190p d() {
        return this.f10548b.f3264d[this.f10547a.a()];
    }

    @Override // A0.w
    public final void disable() {
        this.f10547a.disable();
    }

    @Override // A0.w
    public final int e() {
        return this.f10547a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o4 = (O) obj;
        return this.f10547a.equals(o4.f10547a) && this.f10548b.equals(o4.f10548b);
    }

    @Override // A0.w
    public final int f() {
        return this.f10547a.f();
    }

    @Override // A0.w
    public final C0190p g(int i) {
        return this.f10548b.f3264d[this.f10547a.k(i)];
    }

    @Override // A0.w
    public final void h() {
        this.f10547a.h();
    }

    public final int hashCode() {
        return this.f10547a.hashCode() + ((this.f10548b.hashCode() + 527) * 31);
    }

    @Override // A0.w
    public final boolean i(long j5, AbstractC0997e abstractC0997e, List list) {
        return this.f10547a.i(j5, abstractC0997e, list);
    }

    @Override // A0.w
    public final void j(float f2) {
        this.f10547a.j(f2);
    }

    @Override // A0.w
    public final int k(int i) {
        return this.f10547a.k(i);
    }

    @Override // A0.w
    public final Object l() {
        return this.f10547a.l();
    }

    @Override // A0.w
    public final int length() {
        return this.f10547a.length();
    }

    @Override // A0.w
    public final void m() {
        this.f10547a.m();
    }

    @Override // A0.w
    public final int n(long j5, List list) {
        return this.f10547a.n(j5, list);
    }

    @Override // A0.w
    public final boolean o(long j5, int i) {
        return this.f10547a.o(j5, i);
    }

    @Override // A0.w
    public final int p(C0190p c0190p) {
        return this.f10547a.t(this.f10548b.b(c0190p));
    }

    @Override // A0.w
    public final boolean q(long j5, int i) {
        return this.f10547a.q(j5, i);
    }

    @Override // A0.w
    public final void r() {
        this.f10547a.r();
    }

    @Override // A0.w
    public final void s(long j5, long j6, long j7, List list, y0.m[] mVarArr) {
        this.f10547a.s(j5, j6, j7, list, mVarArr);
    }

    @Override // A0.w
    public final int t(int i) {
        return this.f10547a.t(i);
    }
}
