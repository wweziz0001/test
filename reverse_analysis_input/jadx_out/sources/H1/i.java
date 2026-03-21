package H1;

import U3.l;
import b3.AbstractC0307a;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i f975q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B3.e f980p = new B3.e(new G1.a(this, 1));

    static {
        new i(0, 0, 0, "");
        f975q = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i, int i5, int i6, String str) {
        this.f976l = i;
        this.f977m = i5;
        this.f978n = i6;
        this.f979o = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        N3.h.e(iVar, "other");
        Object objA = this.f980p.a();
        N3.h.d(objA, "<get-bigInteger>(...)");
        Object objA2 = iVar.f980p.a();
        N3.h.d(objA2, "<get-bigInteger>(...)");
        return ((BigInteger) objA).compareTo((BigInteger) objA2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f976l == iVar.f976l && this.f977m == iVar.f977m && this.f978n == iVar.f978n;
    }

    public final int hashCode() {
        return ((((527 + this.f976l) * 31) + this.f977m) * 31) + this.f978n;
    }

    public final String toString() {
        String str = this.f979o;
        String strJ = !l.i0(str) ? AbstractC0307a.j("-", str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f976l);
        sb.append('.');
        sb.append(this.f977m);
        sb.append('.');
        return AbstractC0307a.l(sb, this.f978n, strJ);
    }
}
