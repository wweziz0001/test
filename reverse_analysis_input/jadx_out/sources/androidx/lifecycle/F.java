package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC0278u {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final F f4475t = new F();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4477m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Handler f4480p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4478n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4479o = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0280w f4481q = new C0280w(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A3.c f4482r = new A3.c(this, 9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final E f4483s = new E(this, 0);

    public final void a() {
        int i = this.f4477m + 1;
        this.f4477m = i;
        if (i == 1) {
            if (this.f4478n) {
                this.f4481q.e(EnumC0272n.ON_RESUME);
                this.f4478n = false;
            } else {
                Handler handler = this.f4480p;
                N3.h.b(handler);
                handler.removeCallbacks(this.f4482r);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0278u
    public final AbstractC0274p getLifecycle() {
        return this.f4481q;
    }
}
