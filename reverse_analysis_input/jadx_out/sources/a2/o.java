package a2;

import Q1.C;
import Q1.C0118a;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3553a;

    static {
        String strF = Q1.q.f("ProcessUtils");
        N3.h.d(strF, "tagWithPrefix(\"ProcessUtils\")");
        f3553a = strF;
    }

    public static final boolean a(Context context, C0118a c0118a) {
        String strA;
        Object next;
        Object objInvoke;
        N3.h.e(context, "context");
        N3.h.e(c0118a, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strA = C0205a.f3530a.a();
        } else {
            strA = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, C.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                N3.h.b(objInvoke);
            } catch (Throwable th) {
                if (Q1.q.d().f1838a <= 3) {
                    Log.d(f3553a, "Unable to check ActivityThread for processName", th);
                }
            }
            if (objInvoke instanceof String) {
                strA = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                N3.h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strA = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return N3.h.a(strA, context.getApplicationInfo().processName);
    }
}
