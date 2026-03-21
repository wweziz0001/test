package J2;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes.dex */
public final class U extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) {
        if (aVar.E() != 9) {
            return InetAddress.getByName(aVar.C());
        }
        aVar.A();
        return null;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        bVar.y(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
