package a0;

import java.util.HashMap;
import java.util.HashSet;
import m2.C0640G;

/* JADX INFO: renamed from: a0.Y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0173Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3273a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3274b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3275c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3276d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3277e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3278f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3279g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m2.b0 f3280h;
    public m2.b0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m2.b0 f3283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0172X f3284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m2.b0 f3285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashMap f3287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet f3288q;

    public C0173Y() {
        C0640G c0640g = m2.I.f8549m;
        m2.b0 b0Var = m2.b0.f8583p;
        this.f3280h = b0Var;
        this.i = b0Var;
        this.f3281j = Integer.MAX_VALUE;
        this.f3282k = Integer.MAX_VALUE;
        this.f3283l = b0Var;
        this.f3284m = C0172X.f3269d;
        this.f3285n = b0Var;
        this.f3286o = 0;
        this.f3287p = new HashMap();
        this.f3288q = new HashSet();
    }

    public final void a(A0.m mVar) {
        this.f3273a = mVar.f3289a;
        this.f3274b = mVar.f3290b;
        this.f3275c = mVar.f3291c;
        this.f3276d = mVar.f3292d;
        this.f3277e = mVar.f3293e;
        this.f3278f = mVar.f3294f;
        this.f3279g = mVar.f3295g;
        this.f3280h = mVar.f3296h;
        this.i = mVar.i;
        this.f3281j = mVar.f3297j;
        this.f3282k = mVar.f3298k;
        this.f3283l = mVar.f3299l;
        this.f3284m = mVar.f3300m;
        this.f3285n = mVar.f3301n;
        this.f3286o = mVar.f3302o;
        this.f3288q = new HashSet(mVar.f3304q);
        this.f3287p = new HashMap(mVar.f3303p);
    }

    public C0173Y b(int i, int i5) {
        this.f3277e = i;
        this.f3278f = i5;
        this.f3279g = true;
        return this;
    }
}
