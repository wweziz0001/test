package V3;

/* JADX INFO: renamed from: V3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0146x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2455a = 0;

    static {
        String property;
        int i = a4.w.f3627a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (!(property != null ? Boolean.parseBoolean(property) : false)) {
            RunnableC0145w runnableC0145w = RunnableC0145w.f2453u;
            return;
        }
        c4.d dVar = B.f2372a;
        W3.c cVar = a4.o.f3618a;
        W3.c cVar2 = cVar.f2482q;
        if (cVar instanceof InterfaceC0147y) {
            return;
        }
        RunnableC0145w runnableC0145w2 = RunnableC0145w.f2453u;
    }
}
