package J2;

import b3.AbstractC0307a;
import java.io.IOException;
import java.util.Currency;

/* JADX INFO: loaded from: classes.dex */
public final class W extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        String strC = aVar.C();
        try {
            return Currency.getInstance(strC);
        } catch (IllegalArgumentException e5) {
            StringBuilder sbM = AbstractC0307a.m("Failed parsing '", strC, "' as Currency; at path ");
            sbM.append(aVar.q());
            throw new G2.h(sbM.toString(), e5);
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        bVar.y(((Currency) obj).getCurrencyCode());
    }
}
