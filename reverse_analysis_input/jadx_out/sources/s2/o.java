package s2;

import b3.AbstractC0307a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0794c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f9661e;

    public o(int i, int i5, int i6, j jVar) {
        this.f9658b = i;
        this.f9659c = i5;
        this.f9660d = i6;
        this.f9661e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f9658b == this.f9658b && oVar.f9659c == this.f9659c && oVar.f9660d == this.f9660d && oVar.f9661e == this.f9661e;
    }

    public final int hashCode() {
        return Objects.hash(o.class, Integer.valueOf(this.f9658b), Integer.valueOf(this.f9659c), Integer.valueOf(this.f9660d), this.f9661e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f9661e);
        sb.append(", ");
        sb.append(this.f9659c);
        sb.append("-byte IV, ");
        sb.append(this.f9660d);
        sb.append("-byte tag, and ");
        return AbstractC0307a.l(sb, this.f9658b, "-byte key)");
    }
}
