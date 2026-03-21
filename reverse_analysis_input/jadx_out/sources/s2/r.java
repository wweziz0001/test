package s2;

import b3.AbstractC0307a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0794c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f9669e;

    public r(int i, int i5, int i6, j jVar) {
        this.f9666b = i;
        this.f9667c = i5;
        this.f9668d = i6;
        this.f9669e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f9666b == this.f9666b && rVar.f9667c == this.f9667c && rVar.f9668d == this.f9668d && rVar.f9669e == this.f9669e;
    }

    public final int hashCode() {
        return Objects.hash(r.class, Integer.valueOf(this.f9666b), Integer.valueOf(this.f9667c), Integer.valueOf(this.f9668d), this.f9669e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f9669e);
        sb.append(", ");
        sb.append(this.f9667c);
        sb.append("-byte IV, ");
        sb.append(this.f9668d);
        sb.append("-byte tag, and ");
        return AbstractC0307a.l(sb, this.f9666b, "-byte key)");
    }
}
