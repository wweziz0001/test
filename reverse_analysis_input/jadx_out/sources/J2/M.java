package J2;

import b3.AbstractC0307a;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class M extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        String strC = aVar.C();
        try {
            I2.d.d(strC);
            return new BigInteger(strC);
        } catch (NumberFormatException e5) {
            StringBuilder sbM = AbstractC0307a.m("Failed parsing '", strC, "' as BigInteger; at path ");
            sbM.append(aVar.q());
            throw new G2.h(sbM.toString(), e5);
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        bVar.x((BigInteger) obj);
    }
}
