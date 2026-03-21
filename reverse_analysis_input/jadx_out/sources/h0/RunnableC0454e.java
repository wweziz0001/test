package h0;

import a0.C0177c;
import b3.AbstractC0307a;
import java.util.Arrays;
import n3.C0707q;

/* JADX INFO: renamed from: h0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0454e implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f6115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f6116n;

    public /* synthetic */ RunnableC0454e(int i, int i5, Object obj) {
        this.f6114l = i5;
        this.f6116n = obj;
        this.f6115m = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6114l) {
            case 0:
                C0456g c0456g = ((C0455f) this.f6116n).f6121m;
                c0456g.getClass();
                int i = this.f6115m;
                if (i == -3 || i == -2) {
                    if (i != -2) {
                        C0177c c0177c = c0456g.f6130d;
                        if (!(c0177c != null && c0177c.f3323a == 1)) {
                            c0456g.c(4);
                        }
                    }
                    SurfaceHolderCallbackC0445D surfaceHolderCallbackC0445D = c0456g.f6129c;
                    if (surfaceHolderCallbackC0445D != null) {
                        C0448G c0448g = surfaceHolderCallbackC0445D.f5909l;
                        c0448g.a0(0, 1, c0448g.D());
                    }
                    c0456g.c(3);
                } else if (i == -1) {
                    SurfaceHolderCallbackC0445D surfaceHolderCallbackC0445D2 = c0456g.f6129c;
                    if (surfaceHolderCallbackC0445D2 != null) {
                        C0448G c0448g2 = surfaceHolderCallbackC0445D2.f5909l;
                        c0448g2.a0(-1, 2, c0448g2.D());
                    }
                    c0456g.a();
                    c0456g.c(1);
                } else if (i == 1) {
                    c0456g.c(2);
                    SurfaceHolderCallbackC0445D surfaceHolderCallbackC0445D3 = c0456g.f6129c;
                    if (surfaceHolderCallbackC0445D3 != null) {
                        C0448G c0448g3 = surfaceHolderCallbackC0445D3.f5909l;
                        c0448g3.a0(1, 1, c0448g3.D());
                    }
                } else {
                    AbstractC0307a.o(i, "Unknown focus change type: ", "AudioFocusManager");
                }
                break;
            case 1:
                N n4 = (N) this.f6116n;
                n4.f6024l[this.f6115m].getTrackType();
                i0.c cVar = n4.f6000I;
                cVar.l(cVar.k(), 1033, new C0473y(21));
                break;
            default:
                int i5 = this.f6115m & 4;
                io.flutter.plugin.platform.f fVar = ((io.flutter.plugin.platform.e) this.f6116n).f6753b;
                if (i5 != 0) {
                    Z1.l lVar = fVar.f6755b;
                    lVar.getClass();
                    ((C0707q) lVar.f3020l).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                } else {
                    Z1.l lVar2 = fVar.f6755b;
                    lVar2.getClass();
                    ((C0707q) lVar2.f3020l).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0454e(N n4, int i, boolean z4) {
        this.f6114l = 1;
        this.f6116n = n4;
        this.f6115m = i;
    }
}
