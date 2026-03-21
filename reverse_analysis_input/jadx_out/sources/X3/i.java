package X3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f2667a;

    public i(Throwable th) {
        this.f2667a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (N3.h.a(this.f2667a, ((i) obj).f2667a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f2667a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // X3.j
    public final String toString() {
        return "Closed(" + this.f2667a + ')';
    }
}
