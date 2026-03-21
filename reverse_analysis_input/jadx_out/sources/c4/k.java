package c4;

import a4.w;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f5099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f5102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f5103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f5104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f5105h;

    static {
        String property;
        int i = w.f3627a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f5098a = property;
        f5099b = a4.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i5 = w.f3627a;
        if (i5 < 2) {
            i5 = 2;
        }
        f5100c = a4.a.k("kotlinx.coroutines.scheduler.core.pool.size", i5, 1, 0, 8);
        f5101d = a4.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f5102e = TimeUnit.SECONDS.toNanos(a4.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5103f = f.f5092a;
        f5104g = new i(0);
        f5105h = new i(1);
    }
}
