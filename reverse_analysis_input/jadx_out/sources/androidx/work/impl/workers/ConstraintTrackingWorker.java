package androidx.work.impl.workers;

import A3.c;
import N3.h;
import Q1.p;
import Q1.q;
import V1.b;
import V1.e;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import b2.k;
import d2.AbstractC0376a;
import q2.InterfaceFutureC0744b;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintTrackingWorker extends p implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WorkerParameters f4816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f4817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f4818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f4819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p f4820t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.e(context, "appContext");
        h.e(workerParameters, "workerParameters");
        this.f4816p = workerParameters;
        this.f4817q = new Object();
        this.f4819s = new k();
    }

    @Override // Q1.p
    public final void b() {
        p pVar = this.f4820t;
        if (pVar == null || pVar.f1834n != -256) {
            return;
        }
        pVar.d(Build.VERSION.SDK_INT >= 31 ? this.f1834n : 0);
    }

    @Override // Q1.p
    public final InterfaceFutureC0744b c() {
        this.f1833m.f4780c.execute(new c(this, 11));
        k kVar = this.f4819s;
        h.d(kVar, "future");
        return kVar;
    }

    @Override // V1.e
    public final void e(Z1.p pVar, V1.c cVar) {
        h.e(cVar, "state");
        q.d().a(AbstractC0376a.f5425a, "Constraints changed for " + pVar);
        if (cVar instanceof b) {
            synchronized (this.f4817q) {
                this.f4818r = true;
            }
        }
    }
}
