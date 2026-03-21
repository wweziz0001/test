package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2421a = new ThreadLocal();

    public static H a() {
        ThreadLocal threadLocal = f2421a;
        H h2 = (H) threadLocal.get();
        if (h2 != null) {
            return h2;
        }
        C0127d c0127d = new C0127d(Thread.currentThread());
        threadLocal.set(c0127d);
        return c0127d;
    }
}
