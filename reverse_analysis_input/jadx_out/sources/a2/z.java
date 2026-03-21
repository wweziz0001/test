package a2;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0204A f3580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z1.j f3581m;

    public z(C0204A c0204a, Z1.j jVar) {
        this.f3580l = c0204a;
        this.f3581m = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3580l.f3529d) {
            try {
                if (((z) this.f3580l.f3527b.remove(this.f3581m)) != null) {
                    y yVar = (y) this.f3580l.f3528c.remove(this.f3581m);
                    if (yVar != null) {
                        Z1.j jVar = this.f3581m;
                        T1.g gVar = (T1.g) yVar;
                        Q1.q.d().a(T1.g.f2155z, "Exceeded time limits on execution for " + jVar);
                        gVar.f2163s.execute(new T1.f(gVar, 0));
                    }
                } else {
                    Q1.q.d().a("WrkTimerRunnable", "Timer with " + this.f3581m + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
