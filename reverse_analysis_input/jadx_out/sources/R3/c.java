package R3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f1962o = new c(1, 0, 1);

    @Override // R3.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f1955l == cVar.f1955l) {
                    if (this.f1956m == cVar.f1956m) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // R3.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1955l * 31) + this.f1956m;
    }

    @Override // R3.a
    public final boolean isEmpty() {
        return this.f1955l > this.f1956m;
    }

    @Override // R3.a
    public final String toString() {
        return this.f1955l + ".." + this.f1956m;
    }
}
