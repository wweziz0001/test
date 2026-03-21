package K1;

import D.b0;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H1.b f1261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f1262b;

    public m(H1.b bVar, b0 b0Var) {
        N3.h.e(b0Var, "_windowInsetsCompat");
        this.f1261a = bVar;
        this.f1262b = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        N3.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        m mVar = (m) obj;
        return N3.h.a(this.f1261a, mVar.f1261a) && N3.h.a(this.f1262b, mVar.f1262b);
    }

    public final int hashCode() {
        return this.f1262b.hashCode() + (this.f1261a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1261a + ", windowInsetsCompat=" + this.f1262b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Rect rect, b0 b0Var) {
        this(new H1.b(rect), b0Var);
        N3.h.e(b0Var, "insets");
    }
}
