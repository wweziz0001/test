package J2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class O extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) {
        if (aVar.E() != 9) {
            return new StringBuilder(aVar.C());
        }
        aVar.A();
        return null;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        StringBuilder sb = (StringBuilder) obj;
        bVar.y(sb == null ? null : sb.toString());
    }
}
