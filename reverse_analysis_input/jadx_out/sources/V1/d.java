package V1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2355d;

    public d(boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f2352a = z4;
        this.f2353b = z5;
        this.f2354c = z6;
        this.f2355d = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2352a == dVar.f2352a && this.f2353b == dVar.f2353b && this.f2354c == dVar.f2354c && this.f2355d == dVar.f2355d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        boolean z4 = this.f2352a;
        ?? r12 = z4;
        if (z4) {
            r12 = 1;
        }
        int i = r12 * 31;
        boolean z5 = this.f2353b;
        ?? r22 = z5;
        if (z5) {
            r22 = 1;
        }
        int i5 = (i + r22) * 31;
        boolean z6 = this.f2354c;
        ?? r23 = z6;
        if (z6) {
            r23 = 1;
        }
        int i6 = (i5 + r23) * 31;
        boolean z7 = this.f2355d;
        return i6 + (z7 ? 1 : z7);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f2352a + ", isValidated=" + this.f2353b + ", isMetered=" + this.f2354c + ", isNotRoaming=" + this.f2355d + ')';
    }
}
