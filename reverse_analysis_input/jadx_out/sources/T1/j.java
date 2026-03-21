package T1;

import Q1.C0118a;
import Q1.q;
import Q1.r;
import Z1.l;
import a2.C0204A;
import a2.s;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c2.ExecutorC0319a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j implements R1.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f2175v = q.f("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f2176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z1.i f2177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0204A f2178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final R1.f f2179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final R1.q f2180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f2181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f2182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Intent f2183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SystemAlarmService f2184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f2185u;

    public j(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f2176l = applicationContext;
        Z1.e eVar = new Z1.e(5, (byte) 0);
        R1.q qVarE0 = R1.q.E0(systemAlarmService);
        this.f2180p = qVarE0;
        C0118a c0118a = qVarE0.f1911d;
        this.f2181q = new c(applicationContext, (r) c0118a.f1801g, eVar);
        this.f2178n = new C0204A((B0.d) c0118a.f1803j);
        R1.f fVar = qVarE0.f1915h;
        this.f2179o = fVar;
        Z1.i iVar = qVarE0.f1913f;
        this.f2177m = iVar;
        this.f2185u = new l(fVar, iVar);
        fVar.a(this);
        this.f2182r = new ArrayList();
        this.f2183s = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i) {
        q qVarD = q.d();
        String str = f2175v;
        qVarD.a(str, "Adding command " + intent + " (" + i + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            q.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f2182r) {
                try {
                    Iterator it = this.f2182r.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f2182r) {
            try {
                boolean zIsEmpty = this.f2182r.isEmpty();
                this.f2182r.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // R1.c
    public final void c(Z1.j jVar, boolean z4) {
        ExecutorC0319a executorC0319a = (ExecutorC0319a) this.f2177m.f3015o;
        String str = c.f2141q;
        Intent intent = new Intent(this.f2176l, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z4);
        c.d(intent, jVar);
        executorC0319a.execute(new i(this, intent, 0, 0));
    }

    public final void d() {
        b();
        PowerManager.WakeLock wakeLockA = s.a(this.f2176l, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f2180p.f1913f.h(new h(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
