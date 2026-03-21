package a2;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3562a;

    static {
        String strF = Q1.q.f("WakeLocks");
        N3.h.d(strF, "tagWithPrefix(\"WakeLocks\")");
        f3562a = strF;
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        N3.h.e(context, "context");
        N3.h.e(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        N3.h.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (t.f3563a) {
        }
        N3.h.d(wakeLockNewWakeLock, "wakeLock");
        return wakeLockNewWakeLock;
    }
}
