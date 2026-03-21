package a0;

import d0.AbstractC0370w;
import m2.C0640G;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f3320b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2.I f3321a;

    static {
        C0640G c0640g = m2.I.f8549m;
        f3320b = new b0(m2.b0.f8583p);
        AbstractC0370w.G(0);
    }

    public b0(m2.I i) {
        this.f3321a = m2.I.p(i);
    }

    public final m2.I a() {
        return this.f3321a;
    }

    public final boolean b(int i) {
        int i5 = 0;
        while (true) {
            m2.I i6 = this.f3321a;
            if (i5 >= i6.size()) {
                return false;
            }
            a0 a0Var = (a0) i6.get(i5);
            boolean[] zArr = a0Var.f3315e;
            int length = zArr.length;
            boolean z4 = false;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (zArr[i7]) {
                    z4 = true;
                    break;
                }
                i7++;
            }
            if (z4 && a0Var.f3312b.f3263c == i) {
                return true;
            }
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        return this.f3321a.equals(((b0) obj).f3321a);
    }

    public final int hashCode() {
        return this.f3321a.hashCode();
    }
}
