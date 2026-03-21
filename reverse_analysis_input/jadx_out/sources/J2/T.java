package J2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes.dex */
public final class T extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        try {
            String strC = aVar.C();
            if (strC.equals("null")) {
                return null;
            }
            return new URI(strC);
        } catch (URISyntaxException e5) {
            throw new G2.h(e5);
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        bVar.y(uri == null ? null : uri.toASCIIString());
    }
}
