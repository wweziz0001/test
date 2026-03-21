package A0;

/* JADX INFO: renamed from: A0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0000a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46b;

    public C0000a(long j5, long j6) {
        this.f45a = j5;
        this.f46b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0000a)) {
            return false;
        }
        C0000a c0000a = (C0000a) obj;
        return this.f45a == c0000a.f45a && this.f46b == c0000a.f46b;
    }

    public final int hashCode() {
        return (((int) this.f45a) * 31) + ((int) this.f46b);
    }
}
