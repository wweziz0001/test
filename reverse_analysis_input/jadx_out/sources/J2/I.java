package J2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class I extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) {
        if (aVar.E() != 9) {
            return Double.valueOf(aVar.v());
        }
        aVar.A();
        return null;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.p();
        } else {
            bVar.u(number.doubleValue());
        }
    }
}
