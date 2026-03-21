package V3;

/* JADX INFO: renamed from: V3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0138o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M3.l f2435b;

    public C0138o(Object obj, M3.l lVar) {
        this.f2434a = obj;
        this.f2435b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0138o)) {
            return false;
        }
        C0138o c0138o = (C0138o) obj;
        return N3.h.a(this.f2434a, c0138o.f2434a) && N3.h.a(this.f2435b, c0138o.f2435b);
    }

    public final int hashCode() {
        Object obj = this.f2434a;
        return this.f2435b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f2434a + ", onCancellation=" + this.f2435b + ')';
    }
}
