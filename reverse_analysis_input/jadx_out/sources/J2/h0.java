package J2;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) {
        try {
            return new AtomicInteger(aVar.w());
        } catch (NumberFormatException e5) {
            throw new G2.h(e5);
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        bVar.v(((AtomicInteger) obj).get());
    }
}
