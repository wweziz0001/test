package J2;

import b3.AbstractC0307a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class J extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        String strC = aVar.C();
        if (strC.length() == 1) {
            return Character.valueOf(strC.charAt(0));
        }
        StringBuilder sbM = AbstractC0307a.m("Expecting character, got: ", strC, "; at ");
        sbM.append(aVar.q());
        throw new G2.h(sbM.toString());
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        Character ch = (Character) obj;
        bVar.y(ch == null ? null : String.valueOf(ch));
    }
}
