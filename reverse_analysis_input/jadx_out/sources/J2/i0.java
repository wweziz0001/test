package J2;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) {
        return new AtomicBoolean(aVar.u());
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        bVar.z(((AtomicBoolean) obj).get());
    }
}
