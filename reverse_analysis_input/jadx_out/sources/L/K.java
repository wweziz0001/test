package L;

import V3.C0129f;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class K extends N3.i implements M3.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1315n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(Object obj, int i) {
        super(1);
        this.f1314m = i;
        this.f1315n = obj;
    }

    @Override // M3.l
    public final Object c(Object obj) {
        switch (this.f1314m) {
            case 0:
                Throwable th = (Throwable) obj;
                P p4 = (P) this.f1315n;
                if (th != null) {
                    p4.f1338s.u(new Q(th));
                }
                if (p4.f1340u.f272m != B3.f.f274a) {
                    ((N.i) p4.f1340u.a()).close();
                }
                return B3.g.f275a;
            case 1:
                Throwable th2 = (Throwable) obj;
                Q1.k kVar = (Q1.k) this.f1315n;
                if (th2 == null) {
                    if (!kVar.f1829a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th2 instanceof CancellationException) {
                    kVar.f1829a.cancel(true);
                } else {
                    b2.k kVar2 = kVar.f1829a;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    kVar2.k(th2);
                }
                return B3.g.f275a;
            case 2:
                B3.g gVar = B3.g.f275a;
                ((C0129f) this.f1315n).j(gVar);
                return gVar;
            default:
                ((d4.h) this.f1315n).b();
                return B3.g.f275a;
        }
    }
}
