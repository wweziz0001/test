package J2;

import b3.AbstractC0307a;
import java.io.IOException;

/* JADX INFO: renamed from: J2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0086t extends G2.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0085s f1182b = new C0085s(new C0086t(G2.p.f909m), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G2.p f1183a;

    public C0086t(G2.p pVar) {
        this.f1183a = pVar;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        int iE = aVar.E();
        int iB = O.i.b(iE);
        if (iB == 5 || iB == 6) {
            return this.f1183a.a(aVar);
        }
        if (iB == 8) {
            aVar.A();
            return null;
        }
        throw new G2.h("Expecting number, got: " + AbstractC0307a.t(iE) + "; at path " + aVar.o());
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        bVar.x((Number) obj);
    }
}
