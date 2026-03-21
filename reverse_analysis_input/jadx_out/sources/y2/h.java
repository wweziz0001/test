package y2;

import D2.X;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import w2.C0945a;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f10944b = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f10945a = new AtomicReference(new r(new Z1.i(17)));

    public final r2.b a(n nVar) {
        AtomicReference atomicReference = this.f10945a;
        r rVar = (r) atomicReference.get();
        rVar.getClass();
        F2.a aVar = (F2.a) nVar.f10955b;
        if (!rVar.f10966b.containsKey(new p(n.class, aVar))) {
            try {
                C0945a c0945a = new C0945a();
                ((X) nVar.f10957d).ordinal();
                return c0945a;
            } catch (GeneralSecurityException e5) {
                throw new A1.c("Creating a LegacyProtoKey failed", e5);
            }
        }
        r rVar2 = (r) atomicReference.get();
        rVar2.getClass();
        p pVar = new p(n.class, aVar);
        HashMap map = rVar2.f10966b;
        if (map.containsKey(pVar)) {
            return ((C1005a) map.get(pVar)).f10935b.b(nVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + pVar + " available");
    }

    public final synchronized void b(C1005a c1005a) {
        Z1.i iVar = new Z1.i((r) this.f10945a.get());
        iVar.u(c1005a);
        this.f10945a.set(new r(iVar));
    }

    public final synchronized void c(c cVar) {
        Z1.i iVar = new Z1.i((r) this.f10945a.get());
        iVar.w(cVar);
        this.f10945a.set(new r(iVar));
    }

    public final synchronized void d(i iVar) {
        Z1.i iVar2 = new Z1.i((r) this.f10945a.get());
        iVar2.y(iVar);
        this.f10945a.set(new r(iVar2));
    }

    public final synchronized void e(j jVar) {
        Z1.i iVar = new Z1.i((r) this.f10945a.get());
        iVar.z(jVar);
        this.f10945a.set(new r(iVar));
    }
}
