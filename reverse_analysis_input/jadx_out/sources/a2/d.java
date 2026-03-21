package a2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ R1.q f3537m;

    public d(R1.q qVar) {
        this.f3537m = qVar;
    }

    @Override // a2.e
    public final void b() {
        R1.q qVar = this.f3537m;
        WorkDatabase workDatabase = qVar.f1912e;
        workDatabase.c();
        try {
            Iterator it = workDatabase.t().e().iterator();
            while (it.hasNext()) {
                e.a(qVar, (String) it.next());
            }
            WorkDatabase workDatabase2 = qVar.f1912e;
            ((Q1.r) qVar.f1911d.f1801g).getClass();
            workDatabase2.l().s(new Z1.d("last_cancel_all_time_ms", Long.valueOf(System.currentTimeMillis())));
            workDatabase.o();
            workDatabase.k();
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
