package z2;

import b3.AbstractC0307a;
import java.util.Objects;
import s2.AbstractC0794c;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0794c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f11177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f11178e;

    public k(int i, int i5, d dVar, d dVar2) {
        this.f11175b = i;
        this.f11176c = i5;
        this.f11177d = dVar;
        this.f11178e = dVar2;
    }

    public final int b() {
        d dVar = d.f11162o;
        int i = this.f11176c;
        d dVar2 = this.f11177d;
        if (dVar2 == dVar) {
            return i;
        }
        if (dVar2 == d.f11159l) {
            return i + 5;
        }
        if (dVar2 == d.f11160m) {
            return i + 5;
        }
        if (dVar2 == d.f11161n) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f11175b == this.f11175b && kVar.b() == b() && kVar.f11177d == this.f11177d && kVar.f11178e == this.f11178e;
    }

    public final int hashCode() {
        return Objects.hash(k.class, Integer.valueOf(this.f11175b), Integer.valueOf(this.f11176c), this.f11177d, this.f11178e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f11177d);
        sb.append(", hashType: ");
        sb.append(this.f11178e);
        sb.append(", ");
        sb.append(this.f11176c);
        sb.append("-byte tags, and ");
        return AbstractC0307a.l(sb, this.f11175b, "-byte key)");
    }
}
