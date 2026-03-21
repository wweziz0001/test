package J2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class G extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        try {
            return Long.valueOf(aVar.x());
        } catch (NumberFormatException e5) {
            throw new G2.h(e5);
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.p();
        } else {
            bVar.v(number.longValue());
        }
    }
}
