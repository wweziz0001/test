package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class H extends AbstractC0141s {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f2379q = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f2380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C3.d f2382p;

    public final void r(boolean z4) {
        long j5 = this.f2380n - (z4 ? 4294967296L : 1L);
        this.f2380n = j5;
        if (j5 <= 0 && this.f2381o) {
            y();
        }
    }

    public final void s(A a5) {
        C3.d dVar = this.f2382p;
        if (dVar == null) {
            dVar = new C3.d();
            this.f2382p = dVar;
        }
        dVar.addLast(a5);
    }

    public abstract Thread t();

    public final void u(boolean z4) {
        this.f2380n = (z4 ? 4294967296L : 1L) + this.f2380n;
        if (z4) {
            return;
        }
        this.f2381o = true;
    }

    public final boolean v() {
        return this.f2380n >= 4294967296L;
    }

    public abstract long w();

    public final boolean x() {
        C3.d dVar = this.f2382p;
        if (dVar == null) {
            return false;
        }
        A a5 = (A) (dVar.isEmpty() ? null : dVar.removeFirst());
        if (a5 == null) {
            return false;
        }
        a5.run();
        return true;
    }

    public abstract void y();
}
