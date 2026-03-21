package L;

import V3.AbstractC0144v;
import V3.C0135l;
import V3.InterfaceC0143u;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class J extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P f1312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G3.f f1313s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(P p4, M3.p pVar, E3.d dVar) {
        super(2, dVar);
        this.f1312r = p4;
        this.f1313s = (G3.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G3.f, M3.p] */
    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        J j5 = new J(this.f1312r, this.f1313s, dVar);
        j5.f1311q = obj;
        return j5;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((J) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [G3.f, M3.p] */
    @Override // G3.b
    public final Object l(Object obj) throws Throwable {
        F3.a aVar = F3.a.f861l;
        int i = this.f1310p;
        if (i == 0) {
            i4.a.Y(obj);
            InterfaceC0143u interfaceC0143u = (InterfaceC0143u) this.f1311q;
            C0135l c0135l = new C0135l(true);
            c0135l.I(null);
            P p4 = this.f1312r;
            S s4 = new S(this.f1313s, c0135l, p4.f1338s.k(), interfaceC0143u.i());
            Z1.i iVar = p4.f1342w;
            Object objE = ((X3.d) iVar.f3014n).e(s4);
            if (objE instanceof X3.i) {
                X3.i iVar2 = objE instanceof X3.i ? (X3.i) objE : null;
                Throwable th = iVar2 != null ? iVar2.f2667a : null;
                if (th == null) {
                    throw new X3.n("Channel was closed normally");
                }
                throw th;
            }
            if (objE instanceof X3.j) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((B0.d) iVar.f3015o).f190l).getAndIncrement() == 0) {
                AbstractC0144v.j((InterfaceC0143u) iVar.f3012l, new V(iVar, null));
            }
            this.f1310p = 1;
            obj = c0135l.V(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4.a.Y(obj);
        }
        return obj;
    }
}
