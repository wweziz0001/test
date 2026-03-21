package R1;

import D0.y;
import Q1.C0118a;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import b2.C0305a;
import c2.ExecutorC0319a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import m.W0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1876l = Q1.q.f("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0118a f1879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z1.i f1880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f1881e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f1883g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f1882f = new HashMap();
    public final HashSet i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f1885j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f1877a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f1886k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f1884h = new HashMap();

    public f(Context context, C0118a c0118a, Z1.i iVar, WorkDatabase workDatabase) {
        this.f1878b = context;
        this.f1879c = c0118a;
        this.f1880d = iVar;
        this.f1881e = workDatabase;
    }

    public static boolean d(String str, u uVar, int i) {
        if (uVar == null) {
            Q1.q.d().a(f1876l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        uVar.f1938B = i;
        uVar.h();
        uVar.f1937A.cancel(true);
        if (uVar.f1942o == null || !(uVar.f1937A.f4903a instanceof C0305a)) {
            Q1.q.d().a(u.f1936C, "WorkSpec " + uVar.f1941n + " is already done. Not interrupting.");
        } else {
            uVar.f1942o.d(i);
        }
        Q1.q.d().a(f1876l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f1886k) {
            this.f1885j.add(cVar);
        }
    }

    public final u b(String str) {
        u uVar = (u) this.f1882f.remove(str);
        boolean z4 = uVar != null;
        if (!z4) {
            uVar = (u) this.f1883g.remove(str);
        }
        this.f1884h.remove(str);
        if (z4) {
            synchronized (this.f1886k) {
                try {
                    if (this.f1882f.isEmpty()) {
                        Context context = this.f1878b;
                        String str2 = Y1.a.f2724u;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f1878b.startService(intent);
                        } catch (Throwable th) {
                            Q1.q.d().c(f1876l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f1877a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f1877a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return uVar;
    }

    public final u c(String str) {
        u uVar = (u) this.f1882f.get(str);
        return uVar == null ? (u) this.f1883g.get(str) : uVar;
    }

    public final boolean e(String str) {
        boolean z4;
        synchronized (this.f1886k) {
            z4 = c(str) != null;
        }
        return z4;
    }

    public final void f(c cVar) {
        synchronized (this.f1886k) {
            this.f1885j.remove(cVar);
        }
    }

    public final void g(String str, Q1.h hVar) {
        synchronized (this.f1886k) {
            try {
                Q1.q.d().e(f1876l, "Moving WorkSpec (" + str + ") to the foreground");
                u uVar = (u) this.f1883g.remove(str);
                if (uVar != null) {
                    if (this.f1877a == null) {
                        PowerManager.WakeLock wakeLockA = a2.s.a(this.f1878b, "ProcessorForegroundLck");
                        this.f1877a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f1882f.put(str, uVar);
                    i4.a.X(this.f1878b, Y1.a.b(this.f1878b, D1.b.z(uVar.f1941n), hVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(k kVar, Q1.r rVar) {
        Z1.j jVar = kVar.f1894a;
        final String str = jVar.f3016a;
        final ArrayList arrayList = new ArrayList();
        Z1.p pVar = (Z1.p) this.f1881e.n(new Callable() { // from class: R1.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.f1873a.f1881e;
                Z1.s sVarU = workDatabase.u();
                String str2 = str;
                arrayList.addAll(sVarU.I(str2));
                return workDatabase.t().m(str2);
            }
        });
        if (pVar == null) {
            Q1.q.d().g(f1876l, "Didn't find WorkSpec for id " + jVar);
            ((ExecutorC0319a) this.f1880d.f3015o).execute(new y(this, 4, jVar));
            return false;
        }
        synchronized (this.f1886k) {
            try {
                if (e(str)) {
                    Set set = (Set) this.f1884h.get(str);
                    if (((k) set.iterator().next()).f1894a.f3017b == jVar.f3017b) {
                        set.add(kVar);
                        Q1.q.d().a(f1876l, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        ((ExecutorC0319a) this.f1880d.f3015o).execute(new y(this, 4, jVar));
                    }
                    return false;
                }
                if (pVar.f3064t != jVar.f3017b) {
                    ((ExecutorC0319a) this.f1880d.f3015o).execute(new y(this, 4, jVar));
                    return false;
                }
                Context context = this.f1878b;
                C0118a c0118a = this.f1879c;
                Z1.i iVar = this.f1880d;
                WorkDatabase workDatabase = this.f1881e;
                W0 w02 = new W0();
                new Q1.r();
                w02.f8350a = context.getApplicationContext();
                w02.f8352c = iVar;
                w02.f8351b = this;
                w02.f8353d = c0118a;
                w02.f8354e = workDatabase;
                w02.f8355f = pVar;
                w02.f8356g = arrayList;
                u uVar = new u(w02);
                b2.k kVar2 = uVar.f1952z;
                kVar2.a(new Q.l(this, kVar2, uVar, 1), (ExecutorC0319a) this.f1880d.f3015o);
                this.f1883g.put(str, uVar);
                HashSet hashSet = new HashSet();
                hashSet.add(kVar);
                this.f1884h.put(str, hashSet);
                ((a2.p) this.f1880d.f3012l).execute(uVar);
                Q1.q.d().a(f1876l, f.class.getSimpleName() + ": processing " + jVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
