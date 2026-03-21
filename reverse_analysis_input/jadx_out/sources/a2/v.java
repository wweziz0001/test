package a2;

import android.content.Context;
import b2.C0305a;
import b3.AbstractC0307a;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b2.k f3572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UUID f3573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q1.h f3574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f3575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ w f3576p;

    public v(w wVar, b2.k kVar, UUID uuid, Q1.h hVar, Context context) {
        this.f3576p = wVar;
        this.f3572l = kVar;
        this.f3573m = uuid;
        this.f3574n = hVar;
        this.f3575o = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f3572l.f4903a instanceof C0305a)) {
                String string = this.f3573m.toString();
                Z1.p pVarM = this.f3576p.f3579c.m(string);
                if (pVarM == null || AbstractC0307a.b(pVarM.f3047b)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                this.f3576p.f3578b.g(string, this.f3574n);
                this.f3575o.startService(Y1.a.a(this.f3575o, D1.b.z(pVarM), this.f3574n));
            }
            this.f3572l.j(null);
        } catch (Throwable th) {
            this.f3572l.k(th);
        }
    }
}
