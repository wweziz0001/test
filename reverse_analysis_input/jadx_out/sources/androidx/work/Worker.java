package androidx.work;

import A.a;
import A.b;
import Q1.n;
import Q1.p;
import android.content.Context;
import b2.k;
import q2.InterfaceFutureC0744b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f4777p;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // Q1.p
    public final InterfaceFutureC0744b a() {
        k kVar = new k();
        this.f1833m.f4780c.execute(new a(this, kVar, 2, false));
        return kVar;
    }

    @Override // Q1.p
    public final InterfaceFutureC0744b c() {
        this.f4777p = new k();
        this.f1833m.f4780c.execute(new b(this, 3));
        return this.f4777p;
    }

    public abstract n f();
}
