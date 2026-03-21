package s2;

import b3.AbstractC0307a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0794c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f9651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f9652f;

    public k(int i, int i5, int i6, j jVar, j jVar2) {
        this.f9648b = i;
        this.f9649c = i5;
        this.f9650d = i6;
        this.f9651e = jVar;
        this.f9652f = jVar2;
    }

    public final int b() {
        j jVar = j.f9631j;
        int i = this.f9650d;
        j jVar2 = this.f9651e;
        if (jVar2 == jVar) {
            return i + 16;
        }
        if (jVar2 == j.f9630h || jVar2 == j.i) {
            return i + 21;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f9648b == this.f9648b && kVar.f9649c == this.f9649c && kVar.b() == b() && kVar.f9651e == this.f9651e && kVar.f9652f == this.f9652f;
    }

    public final int hashCode() {
        return Objects.hash(k.class, Integer.valueOf(this.f9648b), Integer.valueOf(this.f9649c), Integer.valueOf(this.f9650d), this.f9651e, this.f9652f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb.append(this.f9651e);
        sb.append(", hashType: ");
        sb.append(this.f9652f);
        sb.append(", ");
        sb.append(this.f9650d);
        sb.append("-byte tags, and ");
        sb.append(this.f9648b);
        sb.append("-byte AES key, and ");
        return AbstractC0307a.l(sb, this.f9649c, "-byte HMAC key)");
    }
}
