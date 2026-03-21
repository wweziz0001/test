package J2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class K extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        int iE = aVar.E();
        if (iE != 9) {
            return iE == 8 ? Boolean.toString(aVar.u()) : aVar.C();
        }
        aVar.A();
        return null;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        bVar.y((String) obj);
    }
}
