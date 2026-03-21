package J2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        int iE = aVar.E();
        if (iE != 9) {
            return iE == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.C())) : Boolean.valueOf(aVar.u());
        }
        aVar.A();
        return null;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        bVar.w((Boolean) obj);
    }
}
