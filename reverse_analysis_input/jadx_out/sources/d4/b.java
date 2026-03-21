package d4;

import L.K;
import L.L;
import M3.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class b extends N3.i implements l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5430o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i, Object obj2) {
        super(1);
        this.f5428m = i;
        this.f5429n = obj;
        this.f5430o = obj2;
    }

    @Override // M3.l
    public final Object c(Object obj) {
        B3.g gVar;
        B3.g gVar2;
        switch (this.f5428m) {
            case 0:
                ((c) this.f5430o).getClass();
                ((d) this.f5429n).e(null);
                return B3.g.f275a;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f5433g;
                ((c) this.f5430o).getClass();
                d dVar = (d) this.f5429n;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return B3.g.f275a;
            default:
                Throwable th = (Throwable) obj;
                ((K) this.f5429n).c(th);
                Z1.i iVar = (Z1.i) this.f5430o;
                ((X3.d) iVar.f3014n).h(th, false);
                do {
                    Object objD = ((X3.d) iVar.f3014n).d();
                    gVar = null;
                    if (objD instanceof X3.j) {
                        objD = null;
                    }
                    gVar2 = B3.g.f275a;
                    if (objD != null) {
                        L.f1316m.i(objD, th);
                        gVar = gVar2;
                    }
                } while (gVar != null);
                return gVar2;
        }
    }
}
