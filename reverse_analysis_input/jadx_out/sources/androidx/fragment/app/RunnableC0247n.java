package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0247n implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f4396l;

    public /* synthetic */ RunnableC0247n(r rVar) {
        this.f4396l = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.f4396l;
        V v4 = rVar.f4434Z;
        v4.f4322p.b(rVar.f4442o);
        rVar.f4442o = null;
    }
}
