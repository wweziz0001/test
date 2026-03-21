package androidx.work.impl.background.systemalarm;

import Q1.q;
import T1.j;
import a2.s;
import a2.t;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0281x;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0281x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f4801o = q.f("SystemAlarmService");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f4802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4803n;

    public final void a() {
        this.f4803n = true;
        q.d().a(f4801o, "All commands completed in dispatcher");
        String str = s.f3562a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (t.f3563a) {
            linkedHashMap.putAll(t.f3564b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                q.d().g(s.f3562a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0281x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        j jVar = new j(this);
        this.f4802m = jVar;
        if (jVar.f2184t != null) {
            q.d().b(j.f2175v, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            jVar.f2184t = this;
        }
        this.f4803n = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0281x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f4803n = true;
        j jVar = this.f4802m;
        jVar.getClass();
        q.d().a(j.f2175v, "Destroying SystemAlarmDispatcher");
        jVar.f2179o.f(jVar);
        jVar.f2184t = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i5) {
        super.onStartCommand(intent, i, i5);
        if (this.f4803n) {
            q.d().e(f4801o, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            j jVar = this.f4802m;
            jVar.getClass();
            q qVarD = q.d();
            String str = j.f2175v;
            qVarD.a(str, "Destroying SystemAlarmDispatcher");
            jVar.f2179o.f(jVar);
            jVar.f2184t = null;
            j jVar2 = new j(this);
            this.f4802m = jVar2;
            if (jVar2.f2184t != null) {
                q.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                jVar2.f2184t = this;
            }
            this.f4803n = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4802m.a(intent, i5);
        return 3;
    }
}
