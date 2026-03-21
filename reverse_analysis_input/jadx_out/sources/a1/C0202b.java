package a1;

import F0.E;
import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: renamed from: a1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0202b implements g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f3471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f3472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f3473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f3474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f3476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f3477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f3478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f3479t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f3480u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f3481v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f3482w;

    public C0202b(i iVar, long j5, long j6, long j7, long j8, boolean z4) {
        AbstractC0360m.c(j5 >= 0 && j6 > j5);
        this.f3474o = iVar;
        this.f3472m = j5;
        this.f3473n = j6;
        if (j7 == j6 - j5 || z4) {
            this.f3476q = j8;
            this.f3475p = 4;
        } else {
            this.f3475p = 0;
        }
        this.f3471l = new f();
    }

    @Override // a1.g
    public final E e() {
        if (this.f3476q != 0) {
            return new C0201a(this);
        }
        return null;
    }

    @Override // a1.g
    public final void j(long j5) {
        this.f3478s = AbstractC0370w.j(j5, 0L, this.f3476q - 1);
        this.f3475p = 2;
        this.f3479t = this.f3472m;
        this.f3480u = this.f3473n;
        this.f3481v = 0L;
        this.f3482w = this.f3476q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // a1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(F0.C0066m r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0202b.k(F0.m):long");
    }
}
