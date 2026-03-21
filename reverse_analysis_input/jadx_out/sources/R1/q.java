package R1;

import Q1.C;
import Q1.C0118a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q extends C {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static q f1907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static q f1908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f1909o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0118a f1911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f1912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Z1.i f1913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f1914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f1915h;
    public final a2.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1916j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f1917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z1.i f1918l;

    static {
        Q1.q.f("WorkManagerImpl");
        f1907m = null;
        f1908n = null;
        f1909o = new Object();
    }

    public q(Context context, final C0118a c0118a, Z1.i iVar, final WorkDatabase workDatabase, final List list, f fVar, Z1.i iVar2) {
        Context applicationContext = context.getApplicationContext();
        if (p.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        Q1.q qVar = new Q1.q(c0118a.f1795a);
        synchronized (Q1.q.f1836b) {
            Q1.q.f1837c = qVar;
        }
        this.f1910c = applicationContext;
        this.f1913f = iVar;
        this.f1912e = workDatabase;
        this.f1915h = fVar;
        this.f1918l = iVar2;
        this.f1911d = c0118a;
        this.f1914g = list;
        this.i = new a2.j(workDatabase, 1);
        final a2.p pVar = (a2.p) iVar.f3012l;
        String str = j.f1893a;
        fVar.a(new c() { // from class: R1.i
            @Override // R1.c
            public final void c(Z1.j jVar, boolean z4) {
                pVar.execute(new P2.b(list, jVar, c0118a, workDatabase, 1));
            }
        });
        iVar.h(new a2.g(applicationContext, this));
    }

    public static q E0(Context context) {
        q qVar;
        Object obj = f1909o;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    qVar = f1907m;
                    if (qVar == null) {
                        qVar = f1908n;
                    }
                }
                return qVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (qVar != null) {
            return qVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final void F0() {
        synchronized (f1909o) {
            try {
                this.f1916j = true;
                BroadcastReceiver.PendingResult pendingResult = this.f1917k;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f1917k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void G0() {
        ArrayList arrayListE;
        String str = U1.b.f2273q;
        Context context = this.f1910c;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListE = U1.b.e(context, jobScheduler)) != null && !arrayListE.isEmpty()) {
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                U1.b.c(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.f1912e;
        Z1.q qVarT = workDatabase.t();
        WorkDatabase_Impl workDatabase_Impl = qVarT.f3068a;
        workDatabase_Impl.b();
        Z1.h hVar = qVarT.f3080n;
        y1.h hVarA = hVar.a();
        workDatabase_Impl.c();
        try {
            hVarA.a();
            workDatabase_Impl.o();
            workDatabase_Impl.k();
            hVar.j(hVarA);
            j.b(this.f1911d, workDatabase, this.f1914g);
        } catch (Throwable th) {
            workDatabase_Impl.k();
            hVar.j(hVarA);
            throw th;
        }
    }
}
