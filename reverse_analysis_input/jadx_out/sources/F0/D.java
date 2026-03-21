package F0;

import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f688b;

    public D(F f2, F f5) {
        this.f687a = f2;
        this.f688b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d5 = (D) obj;
        return this.f687a.equals(d5.f687a) && this.f688b.equals(d5.f688b);
    }

    public final int hashCode() {
        return this.f688b.hashCode() + (this.f687a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        F f2 = this.f687a;
        sb.append(f2);
        F f5 = this.f688b;
        if (f2.equals(f5)) {
            str = "";
        } else {
            str = ", " + f5;
        }
        return B0.i(sb, str, "]");
    }
}
