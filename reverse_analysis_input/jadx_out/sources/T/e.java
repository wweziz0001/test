package T;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2058b;

    public e(long j5, long j6) {
        if (j6 == 0) {
            this.f2057a = 0L;
            this.f2058b = 1L;
        } else {
            this.f2057a = j5;
            this.f2058b = j6;
        }
    }

    public final String toString() {
        return this.f2057a + "/" + this.f2058b;
    }
}
