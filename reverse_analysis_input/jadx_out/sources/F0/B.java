package F0;

import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class B implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A.j f677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A.j f678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f679c;

    public B(long j5, long[] jArr, long[] jArr2) {
        AbstractC0360m.c(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f677a = new A.j(length, 4);
            this.f678b = new A.j(length, 4);
        } else {
            int i = length + 1;
            A.j jVar = new A.j(i, 4);
            this.f677a = jVar;
            A.j jVar2 = new A.j(i, 4);
            this.f678b = jVar2;
            jVar.f(0L);
            jVar2.f(0L);
        }
        this.f677a.g(jArr);
        this.f678b.g(jArr2);
        this.f679c = j5;
    }

    public final void b(long j5, long j6) {
        A.j jVar = this.f678b;
        int i = jVar.f26l;
        A.j jVar2 = this.f677a;
        if (i == 0 && j5 > 0) {
            jVar2.f(0L);
            jVar.f(0L);
        }
        jVar2.f(j6);
        jVar.f(j5);
    }

    @Override // F0.E
    public final boolean c() {
        return this.f678b.f26l > 0;
    }

    @Override // F0.E
    public final D g(long j5) {
        A.j jVar = this.f678b;
        if (jVar.f26l == 0) {
            F f2 = F.f689c;
            return new D(f2, f2);
        }
        int iB = AbstractC0370w.b(jVar, j5);
        long jI = jVar.i(iB);
        A.j jVar2 = this.f677a;
        F f5 = new F(jI, jVar2.i(iB));
        if (jI == j5 || iB == jVar.f26l - 1) {
            return new D(f5, f5);
        }
        int i = iB + 1;
        return new D(f5, new F(jVar.i(i), jVar2.i(i)));
    }

    @Override // F0.E
    public final long i() {
        return this.f679c;
    }
}
