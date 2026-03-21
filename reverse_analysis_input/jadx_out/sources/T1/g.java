package T1;

import Q1.q;
import R1.k;
import V3.J;
import V3.T;
import a2.C0204A;
import a2.p;
import a2.s;
import a2.y;
import a2.z;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c2.ExecutorC0319a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements V1.e, y {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f2155z = q.f("DelayMetCommandHandler");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f2156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z1.j f2158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f2159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V1.h f2160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f2161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f2163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ExecutorC0319a f2164t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PowerManager.WakeLock f2165u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2166v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f2167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final J f2168x;
    public volatile T y;

    public g(Context context, int i, j jVar, k kVar) {
        this.f2156l = context;
        this.f2157m = i;
        this.f2159o = jVar;
        this.f2158n = kVar.f1894a;
        this.f2167w = kVar;
        Z1.i iVar = jVar.f2180p.f1918l;
        Z1.i iVar2 = jVar.f2177m;
        this.f2163s = (p) iVar2.f3012l;
        this.f2164t = (ExecutorC0319a) iVar2.f3015o;
        this.f2168x = (J) iVar2.f3013m;
        this.f2160p = new V1.h(iVar);
        this.f2166v = false;
        this.f2162r = 0;
        this.f2161q = new Object();
    }

    public static void a(g gVar) {
        Z1.j jVar = gVar.f2158n;
        int i = gVar.f2162r;
        String str = jVar.f3016a;
        String str2 = f2155z;
        if (i >= 2) {
            q.d().a(str2, "Already stopped work for " + str);
            return;
        }
        gVar.f2162r = 2;
        q.d().a(str2, "Stopping work for WorkSpec " + str);
        Context context = gVar.f2156l;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.d(intent, jVar);
        j jVar2 = gVar.f2159o;
        int i5 = gVar.f2157m;
        i iVar = new i(jVar2, intent, i5, 0);
        ExecutorC0319a executorC0319a = gVar.f2164t;
        executorC0319a.execute(iVar);
        if (!jVar2.f2179o.e(str)) {
            q.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        q.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.d(intent2, jVar);
        executorC0319a.execute(new i(jVar2, intent2, i5, 0));
    }

    public static void b(g gVar) {
        if (gVar.f2162r != 0) {
            q.d().a(f2155z, "Already started work for " + gVar.f2158n);
            return;
        }
        gVar.f2162r = 1;
        q.d().a(f2155z, "onAllConstraintsMet for " + gVar.f2158n);
        if (!gVar.f2159o.f2179o.h(gVar.f2167w, null)) {
            gVar.c();
            return;
        }
        C0204A c0204a = gVar.f2159o.f2178n;
        Z1.j jVar = gVar.f2158n;
        synchronized (c0204a.f3529d) {
            q.d().a(C0204A.f3525e, "Starting timer for " + jVar);
            c0204a.a(jVar);
            z zVar = new z(c0204a, jVar);
            c0204a.f3527b.put(jVar, zVar);
            c0204a.f3528c.put(jVar, gVar);
            ((Handler) c0204a.f3526a.f190l).postDelayed(zVar, 600000L);
        }
    }

    public final void c() {
        synchronized (this.f2161q) {
            try {
                if (this.y != null) {
                    this.y.b(null);
                }
                this.f2159o.f2178n.a(this.f2158n);
                PowerManager.WakeLock wakeLock = this.f2165u;
                if (wakeLock != null && wakeLock.isHeld()) {
                    q.d().a(f2155z, "Releasing wakelock " + this.f2165u + "for WorkSpec " + this.f2158n);
                    this.f2165u.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str = this.f2158n.f3016a;
        this.f2165u = s.a(this.f2156l, str + " (" + this.f2157m + ")");
        q qVarD = q.d();
        String str2 = "Acquiring wakelock " + this.f2165u + "for WorkSpec " + str;
        String str3 = f2155z;
        qVarD.a(str3, str2);
        this.f2165u.acquire();
        Z1.p pVarM = this.f2159o.f2180p.f1912e.t().m(str);
        if (pVarM == null) {
            this.f2163s.execute(new f(this, 0));
            return;
        }
        boolean zC = pVarM.c();
        this.f2166v = zC;
        if (zC) {
            this.y = V1.k.a(this.f2160p, pVarM, this.f2168x, this);
            return;
        }
        q.d().a(str3, "No constraints for " + str);
        this.f2163s.execute(new f(this, 1));
    }

    @Override // V1.e
    public final void e(Z1.p pVar, V1.c cVar) {
        boolean z4 = cVar instanceof V1.a;
        p pVar2 = this.f2163s;
        if (z4) {
            pVar2.execute(new f(this, 1));
        } else {
            pVar2.execute(new f(this, 0));
        }
    }

    public final void f(boolean z4) {
        q qVarD = q.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        Z1.j jVar = this.f2158n;
        sb.append(jVar);
        sb.append(", ");
        sb.append(z4);
        qVarD.a(f2155z, sb.toString());
        c();
        int i = this.f2157m;
        j jVar2 = this.f2159o;
        ExecutorC0319a executorC0319a = this.f2164t;
        Context context = this.f2156l;
        if (z4) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.d(intent, jVar);
            executorC0319a.execute(new i(jVar2, intent, i, 0));
        }
        if (this.f2166v) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executorC0319a.execute(new i(jVar2, intent2, i, 0));
        }
    }
}
