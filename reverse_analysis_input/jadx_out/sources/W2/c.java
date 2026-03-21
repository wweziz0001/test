package W2;

import B0.d;
import Z1.s;
import android.content.Context;
import android.net.ConnectivityManager;
import j3.C0524a;
import n3.C0707q;
import n3.InterfaceC0696f;

/* JADX INFO: loaded from: classes.dex */
public class c implements j3.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f2476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s f2477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f2478n;

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        this.f2476l = new C0707q(interfaceC0696f, "dev.fluttercommunity.plus/connectivity");
        this.f2477m = new s(interfaceC0696f, "dev.fluttercommunity.plus/connectivity_status");
        Context context = c0524a.f7453a;
        d dVar = new d((ConnectivityManager) context.getSystemService("connectivity"));
        d dVar2 = new d(dVar);
        this.f2478n = new b(context, dVar);
        this.f2476l.b(dVar2);
        this.f2477m.Q(this.f2478n);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        this.f2476l.b(null);
        this.f2477m.Q(null);
        this.f2478n.onCancel(null);
        this.f2476l = null;
        this.f2477m = null;
        this.f2478n = null;
    }
}
