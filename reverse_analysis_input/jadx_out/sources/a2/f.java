package a2;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f3539n = Q1.q.f("EnqueueRunnable");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final R1.l f3540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z1.c f3541m;

    public f(R1.l lVar, Z1.c cVar) {
        this.f3540l = lVar;
        this.f3541m = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(R1.l r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.f.a(R1.l):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        Z1.c cVar = this.f3541m;
        R1.l lVar = this.f3540l;
        try {
            lVar.getClass();
            R1.q qVar = lVar.f1895a;
            HashSet hashSet = new HashSet();
            hashSet.addAll(lVar.f1899e);
            HashSet hashSetR = R1.l.R(lVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(lVar.f1899e);
                    z4 = false;
                    break;
                } else if (hashSetR.contains((String) it.next())) {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                throw new IllegalStateException("WorkContinuation has cycles (" + lVar + ")");
            }
            WorkDatabase workDatabase = qVar.f1912e;
            workDatabase.c();
            try {
                i4.a.k(workDatabase, qVar.f1911d, lVar);
                boolean zA = a(lVar);
                workDatabase.o();
                if (zA) {
                    n.a(qVar.f1910c, RescheduleReceiver.class, true);
                    R1.j.b(qVar.f1911d, qVar.f1912e, qVar.f1914g);
                }
                cVar.i(Q1.x.f1841d);
            } finally {
                workDatabase.k();
            }
        } catch (Throwable th) {
            cVar.i(new Q1.u(th));
        }
    }
}
