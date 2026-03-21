package N3;

import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends c implements f, S3.a, B3.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1618s;

    public g(int i, Class cls, String str, String str2, int i5) {
        this(i, b.f1606l, cls, str, str2, i5);
    }

    @Override // N3.c
    public final S3.a a() {
        q.f1627a.getClass();
        return this;
    }

    @Override // N3.f
    public final int e() {
        return this.f1617r;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f1610o.equals(gVar.f1610o) && this.f1611p.equals(gVar.f1611p) && this.f1618s == gVar.f1618s && this.f1617r == gVar.f1617r && h.a(this.f1608m, gVar.f1608m) && b().equals(gVar.b());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        S3.a aVar = this.f1607l;
        if (aVar == null) {
            a();
            this.f1607l = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        b();
        return this.f1611p.hashCode() + AbstractC0307a.e(b().hashCode() * 31, this.f1610o, 31);
    }

    public final String toString() {
        S3.a aVar = this.f1607l;
        if (aVar == null) {
            a();
            this.f1607l = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f1610o;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0307a.k("function ", str, " (Kotlin reflection is not available)");
    }

    public g(int i, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f1617r = i;
        this.f1618s = 0;
    }
}
