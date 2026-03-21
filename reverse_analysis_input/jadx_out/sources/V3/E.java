package V3;

/* JADX INFO: loaded from: classes.dex */
public final class E implements L {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2375l;

    public E(boolean z4) {
        this.f2375l = z4;
    }

    @Override // V3.L
    public final boolean a() {
        return this.f2375l;
    }

    @Override // V3.L
    public final a0 g() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f2375l ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
