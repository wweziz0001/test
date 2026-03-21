package R1;

import Q1.C0118a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1893a = Q1.q.f("Schedulers");

    public static void a(Z1.q qVar, Q1.r rVar, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            rVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                qVar.o(((Z1.p) it.next()).f3046a, jCurrentTimeMillis);
            }
        }
    }

    public static void b(C0118a c0118a, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Z1.q qVarT = workDatabase.t();
        workDatabase.c();
        try {
            ArrayList arrayListG = qVarT.g();
            a(qVarT, (Q1.r) c0118a.f1801g, arrayListG);
            ArrayList arrayListF = qVarT.f(c0118a.f1798d);
            a(qVarT, (Q1.r) c0118a.f1801g, arrayListF);
            arrayListF.addAll(arrayListG);
            ArrayList arrayListD = qVarT.d();
            workDatabase.o();
            workDatabase.k();
            if (arrayListF.size() > 0) {
                Z1.p[] pVarArr = (Z1.p[]) arrayListF.toArray(new Z1.p[arrayListF.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.d()) {
                        hVar.b(pVarArr);
                    }
                }
            }
            if (arrayListD.size() > 0) {
                Z1.p[] pVarArr2 = (Z1.p[]) arrayListD.toArray(new Z1.p[arrayListD.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h hVar2 = (h) it2.next();
                    if (!hVar2.d()) {
                        hVar2.b(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
