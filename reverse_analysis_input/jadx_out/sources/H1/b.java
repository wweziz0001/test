package H1;

import android.graphics.Rect;
import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f962d;

    public b(Rect rect) {
        int i = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        this.f959a = i;
        this.f960b = i5;
        this.f961c = i6;
        this.f962d = i7;
        if (i > i6) {
            throw new IllegalArgumentException(AbstractC0307a.g(i, i6, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i5 > i7) {
            throw new IllegalArgumentException(AbstractC0307a.g(i5, i7, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final int a() {
        return this.f962d - this.f960b;
    }

    public final int b() {
        return this.f961c - this.f959a;
    }

    public final Rect c() {
        return new Rect(this.f959a, this.f960b, this.f961c, this.f962d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        N3.h.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f959a == bVar.f959a && this.f960b == bVar.f960b && this.f961c == bVar.f961c && this.f962d == bVar.f962d;
    }

    public final int hashCode() {
        return (((((this.f959a * 31) + this.f960b) * 31) + this.f961c) * 31) + this.f962d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f959a);
        sb.append(',');
        sb.append(this.f960b);
        sb.append(',');
        sb.append(this.f961c);
        sb.append(',');
        return AbstractC0307a.l(sb, this.f962d, "] }");
    }
}
