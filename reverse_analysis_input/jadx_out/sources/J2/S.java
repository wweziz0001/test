package J2;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class S extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        String strC = aVar.C();
        if (strC.equals("null")) {
            return null;
        }
        return new URL(strC);
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        URL url = (URL) obj;
        bVar.y(url == null ? null : url.toExternalForm());
    }
}
