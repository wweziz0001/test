package j0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f7267d = new Z0.d().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7270c;

    public e(Z0.d dVar) {
        this.f7268a = dVar.f2832a;
        this.f7269b = dVar.f2833b;
        this.f7270c = dVar.f2834c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7268a == eVar.f7268a && this.f7269b == eVar.f7269b && this.f7270c == eVar.f7270c;
    }

    public final int hashCode() {
        return ((this.f7268a ? 1 : 0) << 2) + ((this.f7269b ? 1 : 0) << 1) + (this.f7270c ? 1 : 0);
    }
}
