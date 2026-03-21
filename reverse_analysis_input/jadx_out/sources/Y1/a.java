package Y1;

import Q1.q;
import R1.f;
import R1.k;
import V1.e;
import V1.h;
import V3.P;
import Z1.i;
import Z1.j;
import Z1.p;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import b3.AbstractC0307a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e, R1.c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f2724u = q.f("SystemFgDispatcher");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final R1.q f2725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f2726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f2727n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f2728o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f2729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f2730q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap f2731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f2732s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SystemForegroundService f2733t;

    public a(Context context) {
        R1.q qVarE0 = R1.q.E0(context);
        this.f2725l = qVarE0;
        this.f2726m = qVarE0.f1913f;
        this.f2728o = null;
        this.f2729p = new LinkedHashMap();
        this.f2731r = new HashMap();
        this.f2730q = new HashMap();
        this.f2732s = new h(qVarE0.f1918l);
        qVarE0.f1915h.a(this);
    }

    public static Intent a(Context context, j jVar, Q1.h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f1825a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f1826b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f1827c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f3016a);
        intent.putExtra("KEY_GENERATION", jVar.f3017b);
        return intent;
    }

    public static Intent b(Context context, j jVar, Q1.h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f3016a);
        intent.putExtra("KEY_GENERATION", jVar.f3017b);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f1825a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f1826b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f1827c);
        return intent;
    }

    @Override // R1.c
    public final void c(j jVar, boolean z4) {
        Map.Entry entry;
        synchronized (this.f2727n) {
            try {
                P p4 = ((p) this.f2730q.remove(jVar)) != null ? (P) this.f2731r.remove(jVar) : null;
                if (p4 != null) {
                    p4.b(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Q1.h hVar = (Q1.h) this.f2729p.remove(jVar);
        if (jVar.equals(this.f2728o)) {
            if (this.f2729p.size() > 0) {
                Iterator it = this.f2729p.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f2728o = (j) entry.getKey();
                if (this.f2733t != null) {
                    Q1.h hVar2 = (Q1.h) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f2733t;
                    systemForegroundService.f4811m.post(new b(systemForegroundService, hVar2.f1825a, hVar2.f1827c, hVar2.f1826b));
                    SystemForegroundService systemForegroundService2 = this.f2733t;
                    systemForegroundService2.f4811m.post(new Q.h(systemForegroundService2, hVar2.f1825a));
                }
            } else {
                this.f2728o = null;
            }
        }
        SystemForegroundService systemForegroundService3 = this.f2733t;
        if (hVar == null || systemForegroundService3 == null) {
            return;
        }
        q.d().a(f2724u, "Removing Notification (id: " + hVar.f1825a + ", workSpecId: " + jVar + ", notificationType: " + hVar.f1826b);
        systemForegroundService3.f4811m.post(new Q.h(systemForegroundService3, hVar.f1825a));
    }

    public final void d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        q qVarD = q.d();
        StringBuilder sb = new StringBuilder("Notifying with (id:");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType :");
        qVarD.a(f2724u, AbstractC0307a.l(sb, intExtra2, ")"));
        if (notification == null || this.f2733t == null) {
            return;
        }
        Q1.h hVar = new Q1.h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f2729p;
        linkedHashMap.put(jVar, hVar);
        if (this.f2728o == null) {
            this.f2728o = jVar;
            SystemForegroundService systemForegroundService = this.f2733t;
            systemForegroundService.f4811m.post(new b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f2733t;
        systemForegroundService2.f4811m.post(new T1.i(systemForegroundService2, intExtra, notification, 1));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((Q1.h) ((Map.Entry) it.next()).getValue()).f1826b;
        }
        Q1.h hVar2 = (Q1.h) linkedHashMap.get(this.f2728o);
        if (hVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f2733t;
            systemForegroundService3.f4811m.post(new b(systemForegroundService3, hVar2.f1825a, hVar2.f1827c, i));
        }
    }

    @Override // V1.e
    public final void e(p pVar, V1.c cVar) {
        if (cVar instanceof V1.b) {
            q.d().a(f2724u, "Constraints unmet for WorkSpec " + pVar.f3046a);
            j jVarZ = D1.b.z(pVar);
            R1.q qVar = this.f2725l;
            qVar.getClass();
            k kVar = new k(jVarZ);
            f fVar = qVar.f1915h;
            N3.h.e(fVar, "processor");
            qVar.f1913f.h(new a2.q(fVar, kVar, true, -512));
        }
    }

    public final void f() {
        this.f2733t = null;
        synchronized (this.f2727n) {
            try {
                Iterator it = this.f2731r.values().iterator();
                while (it.hasNext()) {
                    ((P) it.next()).b(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2725l.f1915h.f(this);
    }
}
