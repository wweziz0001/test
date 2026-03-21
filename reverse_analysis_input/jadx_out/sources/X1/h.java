package X1;

import Q1.q;
import a2.k;
import a2.m;
import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class h extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f2620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final W2.a f2621g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Z1.i iVar) {
        super(context, iVar);
        N3.h.e(iVar, "taskExecutor");
        Object systemService = this.f2615b.getSystemService("connectivity");
        N3.h.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f2620f = (ConnectivityManager) systemService;
        this.f2621g = new W2.a(this, 1);
    }

    @Override // X1.f
    public final Object a() {
        return i.a(this.f2620f);
    }

    @Override // X1.f
    public final void c() {
        try {
            q.d().a(i.f2622a, "Registering network callback");
            m.a(this.f2620f, this.f2621g);
        } catch (IllegalArgumentException e5) {
            q.d().c(i.f2622a, "Received exception while registering network callback", e5);
        } catch (SecurityException e6) {
            q.d().c(i.f2622a, "Received exception while registering network callback", e6);
        }
    }

    @Override // X1.f
    public final void d() {
        try {
            q.d().a(i.f2622a, "Unregistering network callback");
            k.c(this.f2620f, this.f2621g);
        } catch (IllegalArgumentException e5) {
            q.d().c(i.f2622a, "Received exception while unregistering network callback", e5);
        } catch (SecurityException e6) {
            q.d().c(i.f2622a, "Received exception while unregistering network callback", e6);
        }
    }
}
