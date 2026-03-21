package M2;

import G2.r;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class f extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f1509b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f1510a;

    public f(r rVar) {
        this.f1510a = rVar;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) {
        Date date = (Date) this.f1510a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) {
        this.f1510a.c(bVar, (Timestamp) obj);
    }
}
