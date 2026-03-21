package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: n.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0684d extends D1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8745a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f8746b = Executors.newFixedThreadPool(4, new ThreadFactoryC0682b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Handler f8747c;

    public static Handler X(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0683c.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
