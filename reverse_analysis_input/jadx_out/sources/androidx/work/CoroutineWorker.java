package androidx.work;

import A3.c;
import D1.b;
import N3.h;
import Q1.C0122e;
import Q1.C0123f;
import Q1.p;
import V3.AbstractC0144v;
import V3.B;
import V3.T;
import a4.e;
import android.content.Context;
import b2.k;
import c4.d;
import q2.InterfaceFutureC0744b;

/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final T f4773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f4774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f4775r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.e(context, "appContext");
        h.e(workerParameters, "params");
        this.f4773p = AbstractC0144v.b();
        k kVar = new k();
        this.f4774q = kVar;
        kVar.a(new c(this, 4), (a2.p) workerParameters.f4781d.f3012l);
        this.f4775r = B.f2372a;
    }

    @Override // Q1.p
    public final InterfaceFutureC0744b a() {
        T tB = AbstractC0144v.b();
        d dVar = this.f4775r;
        dVar.getClass();
        e eVarA = AbstractC0144v.a(b.K(dVar, tB));
        Q1.k kVar = new Q1.k(tB);
        AbstractC0144v.j(eVarA, new C0122e(kVar, this, null));
        return kVar;
    }

    @Override // Q1.p
    public final void b() {
        this.f4774q.cancel(false);
    }

    @Override // Q1.p
    public final InterfaceFutureC0744b c() {
        T t4 = this.f4773p;
        d dVar = this.f4775r;
        dVar.getClass();
        AbstractC0144v.j(AbstractC0144v.a(b.K(dVar, t4)), new C0123f(this, null));
        return this.f4774q;
    }

    public abstract Object f();
}
