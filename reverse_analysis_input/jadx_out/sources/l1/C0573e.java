package l1;

import F0.K;
import F0.M;
import a0.AbstractC0156G;
import a0.C0189o;
import d0.C0363p;
import java.util.Arrays;
import m.B0;

/* JADX INFO: renamed from: l1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0573e implements h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f7952w = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7953a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K f7959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public K f7960h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7964m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7968q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7970s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public K f7972u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f7973v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f7954b = new M(7, new byte[7]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f7955c = new C0363p(Arrays.copyOf(f7952w, 10));
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7961j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7962k = 256;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7965n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7966o = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7969r = -9223372036854775807L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7971t = -9223372036854775807L;

    public C0573e(int i, String str, boolean z4) {
        this.f7953a = z4;
        this.f7956d = str;
        this.f7957e = i;
    }

    @Override // l1.h
    public final void a() {
        this.f7971t = -9223372036854775807L;
        this.f7964m = false;
        this.i = 0;
        this.f7961j = 0;
        this.f7962k = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f7  */
    @Override // l1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(d0.C0363p r24) throws a0.C0157H {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C0573e.b(d0.p):void");
    }

    @Override // l1.h
    public final void d(F0.s sVar, E e5) {
        e5.a();
        e5.c();
        this.f7958f = (String) e5.f7921e;
        e5.c();
        K k4 = sVar.k(e5.f7919c, 1);
        this.f7959g = k4;
        this.f7972u = k4;
        if (!this.f7953a) {
            this.f7960h = new F0.o();
            return;
        }
        e5.a();
        e5.c();
        K k5 = sVar.k(e5.f7919c, 5);
        this.f7960h = k5;
        C0189o c0189o = new C0189o();
        e5.c();
        c0189o.f3376a = (String) e5.f7921e;
        c0189o.f3387m = AbstractC0156G.m("application/id3");
        B0.k(c0189o, k5);
    }

    @Override // l1.h
    public final void e(long j5, int i) {
        this.f7971t = j5;
    }

    @Override // l1.h
    public final void c(boolean z4) {
    }
}
