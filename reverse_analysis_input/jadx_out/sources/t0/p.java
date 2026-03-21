package t0;

import b3.AbstractC0307a;
import x0.e0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0858o f9936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B0.r f9937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f9938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f9941f;

    public p(q qVar, u uVar, int i, p1.b bVar) {
        this.f9941f = qVar;
        this.f9937b = new B0.r(AbstractC0307a.i("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ", i));
        e0 e0Var = new e0(qVar.f9949l, null, null);
        this.f9938c = e0Var;
        this.f9936a = new C0858o(qVar, uVar, i, e0Var, bVar);
        e0Var.f10687f = qVar.f9951n;
    }

    public final void a() {
        if (this.f9939d) {
            return;
        }
        this.f9936a.f9933b.f9871u = true;
        this.f9939d = true;
        q.w(this.f9941f);
    }

    public final void b() {
        this.f9937b.f(this.f9936a.f9933b, this.f9941f.f9951n, 0);
    }
}
