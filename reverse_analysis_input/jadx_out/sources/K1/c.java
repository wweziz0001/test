package K1;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H1.b f1238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1240c;

    public c(H1.b bVar, b bVar2, b bVar3) {
        this.f1238a = bVar;
        this.f1239b = bVar2;
        this.f1240c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f959a != 0 && bVar.f960b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        N3.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return N3.h.a(this.f1238a, cVar.f1238a) && N3.h.a(this.f1239b, cVar.f1239b) && N3.h.a(this.f1240c, cVar.f1240c);
    }

    public final int hashCode() {
        return this.f1240c.hashCode() + ((this.f1239b.hashCode() + (this.f1238a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f1238a + ", type=" + this.f1239b + ", state=" + this.f1240c + " }";
    }
}
