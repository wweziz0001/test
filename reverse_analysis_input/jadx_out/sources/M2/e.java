package M2;

import G2.r;
import G2.s;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class e implements s {
    @Override // G2.s
    public final r create(G2.e eVar, N2.a aVar) {
        if (aVar.f1601a != Timestamp.class) {
            return null;
        }
        eVar.getClass();
        return new f(eVar.c(new N2.a(Date.class)));
    }
}
