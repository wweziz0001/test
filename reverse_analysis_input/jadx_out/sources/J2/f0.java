package J2;

import java.io.IOException;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        try {
            int iW = aVar.w();
            if (iW <= 65535 && iW >= -32768) {
                return Short.valueOf((short) iW);
            }
            StringBuilder sbJ = B0.j(iW, "Lossy conversion from ", " to short; at path ");
            sbJ.append(aVar.q());
            throw new G2.h(sbJ.toString());
        } catch (NumberFormatException e5) {
            throw new G2.h(e5);
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            bVar.p();
        } else {
            bVar.v(r4.shortValue());
        }
    }
}
