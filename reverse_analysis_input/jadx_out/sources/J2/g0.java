package J2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        try {
            return Integer.valueOf(aVar.w());
        } catch (NumberFormatException e5) {
            throw new G2.h(e5);
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            bVar.p();
        } else {
            bVar.v(r4.intValue());
        }
    }
}
