package s2;

import b3.AbstractC0307a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0794c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f9675c;

    public u(int i, j jVar) {
        this.f9674b = i;
        this.f9675c = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return uVar.f9674b == this.f9674b && uVar.f9675c == this.f9675c;
    }

    public final int hashCode() {
        return Objects.hash(u.class, Integer.valueOf(this.f9674b), this.f9675c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f9675c);
        sb.append(", ");
        return AbstractC0307a.l(sb, this.f9674b, "-byte key)");
    }
}
