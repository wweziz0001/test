package A3;

import N3.h;
import Z1.e;
import android.content.Context;
import j3.C0524a;
import n3.C0707q;
import n3.InterfaceC0696f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j3.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f173l;

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        h.d(interfaceC0696f, "getBinaryMessenger(...)");
        Context context = c0524a.f7453a;
        h.d(context, "getApplicationContext(...)");
        this.f173l = new C0707q(interfaceC0696f, "PonnamKarthik/fluttertoast");
        e eVar = new e((char) 0, 1);
        eVar.f3001m = context;
        C0707q c0707q = this.f173l;
        if (c0707q != null) {
            c0707q.b(eVar);
        }
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        h.e(c0524a, "p0");
        C0707q c0707q = this.f173l;
        if (c0707q != null) {
            c0707q.b(null);
        }
        this.f173l = null;
    }
}
