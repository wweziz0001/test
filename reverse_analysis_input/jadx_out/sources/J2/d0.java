package J2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) {
        if (aVar.E() != 9) {
            return Boolean.valueOf(aVar.C());
        }
        aVar.A();
        return null;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        bVar.y(bool == null ? "null" : bool.toString());
    }
}
