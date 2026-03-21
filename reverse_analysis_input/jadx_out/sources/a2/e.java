package a2;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z1.c f3538l = new Z1.c(5);

    public static void a(R1.q qVar, String str) {
        R1.u uVarB;
        WorkDatabase workDatabase = qVar.f1912e;
        Z1.q qVarT = workDatabase.t();
        Z1.c cVarF = workDatabase.f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iJ = qVarT.j(str2);
            if (iJ != 3 && iJ != 4) {
                WorkDatabase_Impl workDatabase_Impl = qVarT.f3068a;
                workDatabase_Impl.b();
                Z1.h hVar = qVarT.f3073f;
                y1.h hVarA = hVar.a();
                if (str2 == null) {
                    hVarA.g(1);
                } else {
                    hVarA.h(str2, 1);
                }
                workDatabase_Impl.c();
                try {
                    hVarA.a();
                    workDatabase_Impl.o();
                } finally {
                    workDatabase_Impl.k();
                    hVar.j(hVarA);
                }
            }
            linkedList.addAll(cVarF.g(str2));
        }
        R1.f fVar = qVar.f1915h;
        synchronized (fVar.f1886k) {
            Q1.q.d().a(R1.f.f1876l, "Processor cancelling " + str);
            fVar.i.add(str);
            uVarB = fVar.b(str);
        }
        R1.f.d(str, uVarB, 1);
        Iterator it = qVar.f1914g.iterator();
        while (it.hasNext()) {
            ((R1.h) it.next()).a(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        Z1.c cVar = this.f3538l;
        try {
            b();
            cVar.i(Q1.x.f1841d);
        } catch (Throwable th) {
            cVar.i(new Q1.u(th));
        }
    }
}
