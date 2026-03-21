package l1;

import F0.K;
import F0.M;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class u implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K f8152f;
    public boolean i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8157l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8160o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8164s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8166u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8150d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0363p f8147a = new C0363p(2, new byte[15]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f8148b = new M();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f8149c = new C0363p();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f8161p = new v();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8162q = -2147483647;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8163r = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f8165t = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8155j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8158m = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f8153g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f8154h = -9.223372036854776E18d;

    @Override // l1.h
    public final void a() {
        this.f8150d = 0;
        this.f8157l = 0;
        this.f8147a.E(2);
        this.f8159n = 0;
        this.f8160o = 0;
        this.f8162q = -2147483647;
        this.f8163r = -1;
        this.f8164s = 0;
        this.f8165t = -1L;
        this.f8166u = false;
        this.i = false;
        this.f8158m = true;
        this.f8155j = true;
        this.f8153g = -9.223372036854776E18d;
        this.f8154h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0400  */
    @Override // l1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(d0.C0363p r23) throws a0.C0157H {
        /*
            Method dump skipped, instruction units count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.u.b(d0.p):void");
    }

    @Override // l1.h
    public final void d(F0.s sVar, E e5) {
        e5.a();
        e5.c();
        this.f8151e = (String) e5.f7921e;
        e5.c();
        this.f8152f = sVar.k(e5.f7919c, 1);
    }

    @Override // l1.h
    public final void e(long j5, int i) {
        this.f8156k = i;
        if (!this.f8155j && (this.f8160o != 0 || !this.f8158m)) {
            this.i = true;
        }
        if (j5 != -9223372036854775807L) {
            if (this.i) {
                this.f8154h = j5;
            } else {
                this.f8153g = j5;
            }
        }
    }

    @Override // l1.h
    public final void c(boolean z4) {
    }
}
