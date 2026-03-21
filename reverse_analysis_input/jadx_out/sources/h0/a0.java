package h0;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d0 f6090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Pair f6091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u0.g f6092o;

    public /* synthetic */ a0(d0 d0Var, Pair pair, u0.g gVar, int i) {
        this.f6089l = i;
        this.f6090m = d0Var;
        this.f6091n = pair;
        this.f6092o = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6089l) {
            case 0:
                i0.c cVar = this.f6090m.f6113m.f6142h;
                Pair pair = this.f6091n;
                int iIntValue = ((Integer) pair.first).intValue();
                x0.H h2 = (x0.H) pair.second;
                h2.getClass();
                cVar.f(iIntValue, h2, this.f6092o);
                break;
            default:
                i0.c cVar2 = this.f6090m.f6113m.f6142h;
                Pair pair2 = this.f6091n;
                cVar2.c(((Integer) pair2.first).intValue(), (x0.H) pair2.second, this.f6092o);
                break;
        }
    }
}
