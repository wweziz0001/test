package Q1;

import java.util.LinkedHashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class y extends D {
    @Override // Q1.D
    public final E d() {
        if (this.f1787a && ((Z1.p) this.f1789c).f3054j.f1810c) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        Z1.p pVar = (Z1.p) this.f1789c;
        if (pVar.f3061q) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new z((UUID) this.f1788b, pVar, (LinkedHashSet) this.f1790d);
    }

    @Override // Q1.D
    public final D f() {
        return this;
    }
}
