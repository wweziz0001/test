package X3;

import V3.InterfaceC0128e;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f2646a = new l(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f2647b = a4.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f2648c = a4.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F0.p f2649d = new F0.p(1, "BUFFERED", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F0.p f2650e = new F0.p(1, "SHOULD_BUFFER", false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F0.p f2651f = new F0.p(1, "S_RESUMING_BY_RCV", false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final F0.p f2652g = new F0.p(1, "RESUMING_BY_EB", false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final F0.p f2653h = new F0.p(1, "POISONED", false);
    public static final F0.p i = new F0.p(1, "DONE_RCV", false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final F0.p f2654j = new F0.p(1, "INTERRUPTED_SEND", false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final F0.p f2655k = new F0.p(1, "INTERRUPTED_RCV", false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final F0.p f2656l = new F0.p(1, "CHANNEL_CLOSED", false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final F0.p f2657m = new F0.p(1, "SUSPEND", false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final F0.p f2658n = new F0.p(1, "SUSPEND_NO_WAITER", false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final F0.p f2659o = new F0.p(1, "FAILED", false);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final F0.p f2660p = new F0.p(1, "NO_RECEIVE_RESULT", false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final F0.p f2661q = new F0.p(1, "CLOSE_HANDLER_CLOSED", false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final F0.p f2662r = new F0.p(1, "CLOSE_HANDLER_INVOKED", false);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final F0.p f2663s = new F0.p(1, "NO_CLOSE_CAUSE", false);

    public static final boolean a(InterfaceC0128e interfaceC0128e, Object obj, M3.l lVar) {
        F0.p pVarH = interfaceC0128e.h(obj, lVar);
        if (pVarH == null) {
            return false;
        }
        interfaceC0128e.p(pVarH);
        return true;
    }
}
