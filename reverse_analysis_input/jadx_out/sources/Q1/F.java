package Q1;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1794a = q.f("WorkerFactory");

    public static p a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f1794a;
        p pVar = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(p.class);
        } catch (Throwable th) {
            q.d().c(str2, "Invalid class: " + str, th);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                pVar = (p) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                q.d().c(str2, "Could not instantiate " + str, th2);
            }
        }
        if (pVar == null || !pVar.f1835o) {
            return pVar;
        }
        throw new IllegalStateException("WorkerFactory (" + F.class.getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
