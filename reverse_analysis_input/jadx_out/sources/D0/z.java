package D0;

import d0.AbstractC0370w;
import h0.C0448G;
import h0.C0473y;
import h0.SurfaceHolderCallbackC0445D;
import i0.C0477a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z1.c f538l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f539m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f540n;

    public /* synthetic */ z(Z1.c cVar, Object obj, long j5) {
        this.f538l = cVar;
        this.f539m = obj;
        this.f540n = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z1.c cVar = this.f538l;
        cVar.getClass();
        int i = AbstractC0370w.f5326a;
        C0448G c0448g = ((SurfaceHolderCallbackC0445D) ((A) cVar.f2997m)).f5909l;
        i0.c cVar2 = c0448g.f5960r;
        C0477a c0477aK = cVar2.k();
        long j5 = this.f540n;
        Object obj = this.f539m;
        cVar2.l(c0477aK, 26, new I2.g(c0477aK, obj, j5));
        if (c0448g.f5926N == obj) {
            c0448g.f5954l.e(26, new C0473y(1));
        }
    }
}
