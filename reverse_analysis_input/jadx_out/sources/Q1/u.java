package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class u extends Z1.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Throwable f1840q;

    public u(Throwable th) {
        super(8);
        this.f1840q = th;
    }

    @Override // Z1.f
    public final String toString() {
        return "FAILURE (" + this.f1840q.getMessage() + ")";
    }
}
