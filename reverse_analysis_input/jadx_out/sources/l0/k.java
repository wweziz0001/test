package l0;

import a0.C0190p;
import java.util.ArrayList;
import m2.I;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements k0.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f7866q;

    public k(long j5, C0190p c0190p, I i, n nVar, ArrayList arrayList) {
        super(c0190p, i, nVar, arrayList);
        this.f7866q = nVar;
    }

    @Override // k0.h
    public final long B(long j5, long j6) {
        n nVar = this.f7866q;
        if (nVar.f7876f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j5, j6) + nVar.c(j5, j6);
        return (nVar.e(jB, j5) + nVar.g(jB)) - nVar.i;
    }

    @Override // k0.h
    public final j C(long j5) {
        return this.f7866q.h(this, j5);
    }

    @Override // k0.h
    public final long a(long j5) {
        return this.f7866q.g(j5);
    }

    @Override // l0.m
    public final String b() {
        return null;
    }

    @Override // k0.h
    public final long c(long j5, long j6) {
        return this.f7866q.f(j5, j6);
    }

    @Override // l0.m
    public final j e() {
        return null;
    }

    @Override // k0.h
    public final boolean i() {
        return this.f7866q.i();
    }

    @Override // k0.h
    public final long m(long j5, long j6) {
        return this.f7866q.e(j5, j6);
    }

    @Override // k0.h
    public final long n() {
        return this.f7866q.f7874d;
    }

    @Override // k0.h
    public final long s(long j5) {
        return this.f7866q.d(j5);
    }

    @Override // k0.h
    public final long u(long j5, long j6) {
        return this.f7866q.b(j5, j6);
    }

    @Override // k0.h
    public final long v(long j5, long j6) {
        return this.f7866q.c(j5, j6);
    }

    @Override // l0.m
    public final k0.h d() {
        return this;
    }
}
