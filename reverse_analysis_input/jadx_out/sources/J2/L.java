package J2;

import b3.AbstractC0307a;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class L extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        String strC = aVar.C();
        try {
            return I2.d.j(strC);
        } catch (NumberFormatException e5) {
            StringBuilder sbM = AbstractC0307a.m("Failed parsing '", strC, "' as BigDecimal; at path ");
            sbM.append(aVar.q());
            throw new G2.h(sbM.toString(), e5);
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        bVar.x((BigDecimal) obj);
    }
}
