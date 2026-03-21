package a0;

/* JADX INFO: renamed from: a0.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0161L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0188n f3224a;

    public C0161L(C0188n c0188n) {
        this.f3224a = c0188n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0161L) {
            return this.f3224a.equals(((C0161L) obj).f3224a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3224a.hashCode();
    }
}
