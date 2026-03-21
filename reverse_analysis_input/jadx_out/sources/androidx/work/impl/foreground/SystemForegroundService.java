package androidx.work.impl.foreground;

import Q1.q;
import Y1.a;
import a2.b;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0281x;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0281x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f4810q = q.f("SystemFgService");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Handler f4811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f4813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public NotificationManager f4814p;

    public final void a() {
        this.f4811m = new Handler(Looper.getMainLooper());
        this.f4814p = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f4813o = aVar;
        if (aVar.f2733t != null) {
            q.d().b(a.f2724u, "A callback already exists.");
        } else {
            aVar.f2733t = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0281x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0281x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f4813o.f();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i5) {
        super.onStartCommand(intent, i, i5);
        boolean z4 = this.f4812n;
        String str = f4810q;
        if (z4) {
            q.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f4813o.f();
            a();
            this.f4812n = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f4813o;
        aVar.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = a.f2724u;
        if (zEquals) {
            q.d().e(str2, "Started foreground service " + intent);
            aVar.f2726m.h(new A.a(aVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 6, false));
            aVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            q.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = aVar.f2733t;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f4812n = true;
            q.d().a(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        q.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID uuidFromString = UUID.fromString(stringExtra);
        R1.q qVar = aVar.f2725l;
        qVar.getClass();
        qVar.f1913f.h(new b(qVar, uuidFromString, 0));
        return 3;
    }
}
