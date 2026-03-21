package a2;

import android.content.Context;
import android.os.Build;
import c2.ExecutorC0319a;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f3565r = Q1.q.f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2.k f3566l = new b2.k();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f3567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z1.p f3568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Q1.p f3569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f3570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Z1.i f3571q;

    public u(Context context, Z1.p pVar, Q1.p pVar2, w wVar, Z1.i iVar) {
        this.f3567m = context;
        this.f3568n = pVar;
        this.f3569o = pVar2;
        this.f3570p = wVar;
        this.f3571q = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f3568n.f3061q || Build.VERSION.SDK_INT >= 31) {
            this.f3566l.j(null);
            return;
        }
        b2.k kVar = new b2.k();
        Z1.i iVar = this.f3571q;
        ((ExecutorC0319a) iVar.f3015o).execute(new D0.y(this, 11, kVar));
        kVar.a(new A.a(this, kVar, 8, false), (ExecutorC0319a) iVar.f3015o);
    }
}
