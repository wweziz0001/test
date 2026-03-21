package l1;

import d0.AbstractC0360m;
import d0.C0363p;
import h0.K;

/* JADX INFO: loaded from: classes.dex */
public final class m implements h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f8031l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.e f8032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0363p f8033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f8034c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f8035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K f8036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f8037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f8039h;
    public F0.K i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8041k;

    public m(Z1.e eVar) {
        this.f8032a = eVar;
        k kVar = new k();
        kVar.f8022e = new byte[128];
        this.f8035d = kVar;
        this.f8041k = -9223372036854775807L;
        this.f8036e = new K(178);
        this.f8033b = new C0363p();
    }

    @Override // l1.h
    public final void a() {
        e0.n.a(this.f8034c);
        k kVar = this.f8035d;
        kVar.f8018a = false;
        kVar.f8020c = 0;
        kVar.f8019b = 0;
        l lVar = this.f8037f;
        if (lVar != null) {
            lVar.f8024b = false;
            lVar.f8025c = false;
            lVar.f8026d = false;
            lVar.f8027e = -1;
        }
        K k4 = this.f8036e;
        if (k4 != null) {
            k4.d();
        }
        this.f8038g = 0L;
        this.f8041k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024d  */
    @Override // l1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(d0.C0363p r19) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.m.b(d0.p):void");
    }

    @Override // l1.h
    public final void c(boolean z4) {
        AbstractC0360m.i(this.f8037f);
        if (z4) {
            this.f8037f.b(0, this.f8038g, this.f8040j);
            l lVar = this.f8037f;
            lVar.f8024b = false;
            lVar.f8025c = false;
            lVar.f8026d = false;
            lVar.f8027e = -1;
        }
    }

    @Override // l1.h
    public final void d(F0.s sVar, E e5) {
        e5.a();
        e5.c();
        this.f8039h = (String) e5.f7921e;
        e5.c();
        F0.K k4 = sVar.k(e5.f7919c, 2);
        this.i = k4;
        this.f8037f = new l(k4);
        this.f8032a.n(sVar, e5);
    }

    @Override // l1.h
    public final void e(long j5, int i) {
        this.f8041k = j5;
    }
}
