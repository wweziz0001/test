package Q1;

import java.util.LinkedHashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class s extends D {
    @Override // Q1.D
    public final E d() {
        if (this.f1787a && ((Z1.p) this.f1789c).f3054j.f1810c) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new t((UUID) this.f1788b, (Z1.p) this.f1789c, (LinkedHashSet) this.f1790d);
    }

    @Override // Q1.D
    public final D f() {
        return this;
    }
}
