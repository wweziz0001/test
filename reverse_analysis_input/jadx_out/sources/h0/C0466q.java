package h0;

import a0.C0177c;
import android.content.Context;
import android.os.Looper;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0365r;
import d0.InterfaceC0348a;

/* JADX INFO: renamed from: h0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0466q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0365r f6255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2.h f6256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l2.h f6257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0453d f6258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l2.h f6259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0453d f6260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B0.l f6261h;
    public final Looper i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0177c f6263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t0 f6266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public O f6267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f6268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f6269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f6270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f6272t;

    public C0466q(Context context) {
        this(context, new C0453d(context, 4), new C0453d(context, 5));
    }

    public final C0448G a() {
        AbstractC0360m.h(!this.f6271s);
        this.f6271s = true;
        int i = AbstractC0370w.f5326a;
        return new C0448G(this);
    }

    public C0466q(Context context, l2.h hVar, l2.h hVar2) {
        C0453d c0453d = new C0453d(context, 2);
        D0.n nVar = new D0.n(1);
        C0453d c0453d2 = new C0453d(context, 3);
        B0.l lVar = new B0.l(29);
        context.getClass();
        this.f6254a = context;
        this.f6256c = hVar;
        this.f6257d = hVar2;
        this.f6258e = c0453d;
        this.f6259f = nVar;
        this.f6260g = c0453d2;
        this.f6261h = lVar;
        int i = AbstractC0370w.f5326a;
        Looper looperMyLooper = Looper.myLooper();
        this.i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f6263k = C0177c.f3322e;
        this.f6264l = 1;
        this.f6265m = true;
        this.f6266n = t0.f6280c;
        this.f6267o = new C0460k(0.97f, 1.03f, 1000L, 1.0E-7f, AbstractC0370w.M(20L), AbstractC0370w.M(500L), 0.999f);
        this.f6255b = InterfaceC0348a.f5270a;
        this.f6268p = 500L;
        this.f6269q = 2000L;
        this.f6270r = true;
        this.f6272t = "";
        this.f6262j = -1000;
    }
}
