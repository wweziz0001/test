package D0;

import d0.AbstractC0370w;
import h0.C0448G;
import h0.C0473y;
import h0.SurfaceHolderCallbackC0445D;
import x0.H;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z1.c f534m;

    public /* synthetic */ x(Z1.c cVar, int i, long j5) {
        this.f533l = 1;
        this.f534m = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z1.c cVar = this.f534m;
        int i = this.f533l;
        cVar.getClass();
        switch (i) {
            case 0:
                int i5 = AbstractC0370w.f5326a;
                i0.c cVar2 = ((SurfaceHolderCallbackC0445D) ((A) cVar.f2997m)).f5909l.f5960r;
                cVar2.l(cVar2.k(), 1016, new i0.b(4));
                break;
            case 1:
                int i6 = AbstractC0370w.f5326a;
                i0.c cVar3 = ((SurfaceHolderCallbackC0445D) ((A) cVar.f2997m)).f5909l.f5960r;
                cVar3.l(cVar3.i((H) cVar3.f6365o.f10958e), 1018, new C0473y(18));
                break;
            case 2:
                int i7 = AbstractC0370w.f5326a;
                i0.c cVar4 = ((SurfaceHolderCallbackC0445D) ((A) cVar.f2997m)).f5909l.f5960r;
                cVar4.l(cVar4.i((H) cVar4.f6365o.f10958e), 1021, new C0473y(24));
                break;
            case 3:
                int i8 = AbstractC0370w.f5326a;
                i0.c cVar5 = ((SurfaceHolderCallbackC0445D) ((A) cVar.f2997m)).f5909l.f5960r;
                cVar5.l(cVar5.k(), 1030, new C0473y(8));
                break;
            case 4:
                int i9 = AbstractC0370w.f5326a;
                C0448G c0448g = ((SurfaceHolderCallbackC0445D) ((A) cVar.f2997m)).f5909l;
                c0448g.getClass();
                i0.c cVar6 = c0448g.f5960r;
                cVar6.l(cVar6.k(), 1015, new i0.b(0));
                break;
            default:
                int i10 = AbstractC0370w.f5326a;
                i0.c cVar7 = ((SurfaceHolderCallbackC0445D) ((A) cVar.f2997m)).f5909l.f5960r;
                cVar7.l(cVar7.k(), 1019, new C0473y(17));
                break;
        }
    }

    public /* synthetic */ x(Z1.c cVar, long j5, int i) {
        this.f533l = 2;
        this.f534m = cVar;
    }

    public /* synthetic */ x(Z1.c cVar, Object obj, int i) {
        this.f533l = i;
        this.f534m = cVar;
    }

    public /* synthetic */ x(Z1.c cVar, String str, long j5, long j6) {
        this.f533l = 0;
        this.f534m = cVar;
    }
}
