package J2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) {
        if (aVar.E() != 9) {
            return new StringBuffer(aVar.C());
        }
        aVar.A();
        return null;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        StringBuffer stringBuffer = (StringBuffer) obj;
        bVar.y(stringBuffer == null ? null : stringBuffer.toString());
    }
}
