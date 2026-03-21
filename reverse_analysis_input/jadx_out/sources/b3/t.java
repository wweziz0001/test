package b3;

import android.content.Context;
import j3.C0524a;
import n3.C0707q;
import n3.InterfaceC0696f;

/* JADX INFO: loaded from: classes.dex */
public final class t implements j3.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f4951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Q.n f4952m;

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        N3.h.e(c0524a, "binding");
        Context context = c0524a.f7453a;
        N3.h.d(context, "getApplicationContext(...)");
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        N3.h.d(interfaceC0696f, "getBinaryMessenger(...)");
        this.f4952m = new Q.n(context, 1);
        C0707q c0707q = new C0707q(interfaceC0696f, "be.tramckrijte.workmanager/foreground_channel_work_manager");
        this.f4951l = c0707q;
        c0707q.b(this.f4952m);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        N3.h.e(c0524a, "binding");
        C0707q c0707q = this.f4951l;
        if (c0707q != null) {
            c0707q.b(null);
        }
        this.f4951l = null;
        this.f4952m = null;
    }
}
