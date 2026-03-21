package J2;

import b3.AbstractC0307a;
import java.io.IOException;
import java.util.BitSet;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        boolean zU;
        BitSet bitSet = new BitSet();
        aVar.a();
        int iE = aVar.E();
        int i = 0;
        while (iE != 2) {
            int iB = O.i.b(iE);
            if (iB == 5 || iB == 6) {
                int iW = aVar.w();
                if (iW == 0) {
                    zU = false;
                } else {
                    if (iW != 1) {
                        StringBuilder sbJ = B0.j(iW, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbJ.append(aVar.q());
                        throw new G2.h(sbJ.toString());
                    }
                    zU = true;
                }
            } else {
                if (iB != 7) {
                    throw new G2.h("Invalid bitset value type: " + AbstractC0307a.t(iE) + "; at path " + aVar.o());
                }
                zU = aVar.u();
            }
            if (zU) {
                bitSet.set(i);
            }
            i++;
            iE = aVar.E();
        }
        aVar.k();
        return bitSet;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        bVar.b();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            bVar.v(bitSet.get(i) ? 1L : 0L);
        }
        bVar.k();
    }
}
