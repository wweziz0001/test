package N3;

import b3.AbstractC0307a;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends c implements S3.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f1622r;

    public l(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f1622r = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return b().equals(lVar.b()) && this.f1610o.equals(lVar.f1610o) && this.f1611p.equals(lVar.f1611p) && h.a(this.f1608m, lVar.f1608m);
        }
        if (obj instanceof S3.c) {
            return obj.equals(f());
        }
        return false;
    }

    public final S3.a f() {
        if (this.f1622r) {
            return this;
        }
        S3.a aVar = this.f1607l;
        if (aVar != null) {
            return aVar;
        }
        S3.a aVarA = a();
        this.f1607l = aVarA;
        return aVarA;
    }

    public final int hashCode() {
        return this.f1611p.hashCode() + AbstractC0307a.e(b().hashCode() * 31, this.f1610o, 31);
    }

    public final String toString() {
        S3.a aVarF = f();
        return aVarF != this ? aVarF.toString() : B0.i(new StringBuilder("property "), this.f1610o, " (Kotlin reflection is not available)");
    }
}
