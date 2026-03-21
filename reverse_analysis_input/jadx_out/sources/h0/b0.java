package h0;

import android.util.Pair;
import x0.C0984z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d0 f6097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Pair f6098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0984z f6099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u0.g f6100p;

    public /* synthetic */ b0(d0 d0Var, Pair pair, C0984z c0984z, u0.g gVar, int i) {
        this.f6096l = i;
        this.f6097m = d0Var;
        this.f6098n = pair;
        this.f6099o = c0984z;
        this.f6100p = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6096l) {
            case 0:
                i0.c cVar = this.f6097m.f6113m.f6142h;
                Pair pair = this.f6098n;
                cVar.a(((Integer) pair.first).intValue(), (x0.H) pair.second, this.f6099o, this.f6100p);
                break;
            case 1:
                i0.c cVar2 = this.f6097m.f6113m.f6142h;
                Pair pair2 = this.f6098n;
                cVar2.b(((Integer) pair2.first).intValue(), (x0.H) pair2.second, this.f6099o, this.f6100p);
                break;
            default:
                i0.c cVar3 = this.f6097m.f6113m.f6142h;
                Pair pair3 = this.f6098n;
                cVar3.d(((Integer) pair3.first).intValue(), (x0.H) pair3.second, this.f6099o, this.f6100p);
                break;
        }
    }
}
