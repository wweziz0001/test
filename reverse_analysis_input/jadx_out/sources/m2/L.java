package m2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0636C {
    @Override // m2.AbstractC0636C
    public final AbstractC0636C b(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final M g() {
        int i = this.f8538b;
        if (i == 0) {
            int i5 = M.f8554n;
            return h0.f8615u;
        }
        if (i != 1) {
            M mN = M.n(i, this.f8537a);
            this.f8538b = mN.size();
            this.f8539c = true;
            return mN;
        }
        Object obj = this.f8537a[0];
        Objects.requireNonNull(obj);
        int i6 = M.f8554n;
        return new o0(obj);
    }
}
