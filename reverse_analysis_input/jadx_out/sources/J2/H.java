package J2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class H extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) {
        if (aVar.E() != 9) {
            return Float.valueOf((float) aVar.v());
        }
        aVar.A();
        return null;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            bVar.p();
            return;
        }
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(numberValueOf.floatValue());
        }
        bVar.x(numberValueOf);
    }
}
