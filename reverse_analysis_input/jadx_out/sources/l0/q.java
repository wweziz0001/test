package l0;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7884b;

    public q(long j5, long j6) {
        this.f7883a = j5;
        this.f7884b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f7883a == qVar.f7883a && this.f7884b == qVar.f7884b;
    }

    public final int hashCode() {
        return (((int) this.f7883a) * 31) + ((int) this.f7884b);
    }
}
