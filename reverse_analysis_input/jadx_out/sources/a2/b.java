package a2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ R1.q f3532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f3533o;

    public /* synthetic */ b(R1.q qVar, Object obj, int i) {
        this.f3531m = i;
        this.f3532n = qVar;
        this.f3533o = obj;
    }

    @Override // a2.e
    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f3531m) {
            case 0:
                R1.q qVar = this.f3532n;
                workDatabase = qVar.f1912e;
                workDatabase.c();
                try {
                    e.a(qVar, ((UUID) this.f3533o).toString());
                    workDatabase.o();
                    workDatabase.k();
                    R1.j.b(qVar.f1911d, qVar.f1912e, qVar.f1914g);
                    return;
                } finally {
                    workDatabase.k();
                }
            default:
                R1.q qVar2 = this.f3532n;
                workDatabase = qVar2.f1912e;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.t().l((String) this.f3533o).iterator();
                    while (it.hasNext()) {
                        e.a(qVar2, (String) it.next());
                    }
                    workDatabase.o();
                    workDatabase.k();
                    R1.j.b(qVar2.f1911d, qVar2.f1912e, qVar2.f1914g);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
