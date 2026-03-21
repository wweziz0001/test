package a2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ R1.q f3534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f3535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f3536o;

    public c(R1.q qVar, String str, boolean z4) {
        this.f3534m = qVar;
        this.f3535n = str;
        this.f3536o = z4;
    }

    @Override // a2.e
    public final void b() {
        R1.q qVar = this.f3534m;
        WorkDatabase workDatabase = qVar.f1912e;
        workDatabase.c();
        try {
            Iterator it = workDatabase.t().k(this.f3535n).iterator();
            while (it.hasNext()) {
                e.a(qVar, (String) it.next());
            }
            workDatabase.o();
            workDatabase.k();
            if (this.f3536o) {
                R1.j.b(qVar.f1911d, qVar.f1912e, qVar.f1914g);
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
