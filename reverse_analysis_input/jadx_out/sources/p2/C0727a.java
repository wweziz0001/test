package p2;

import java.io.Serializable;

/* JADX INFO: renamed from: p2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0727a implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f9194n = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f9195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9196m;

    static {
        new C0727a(new int[0]);
    }

    public C0727a(int[] iArr) {
        int length = iArr.length;
        this.f9195l = iArr;
        this.f9196m = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0727a)) {
            return false;
        }
        C0727a c0727a = (C0727a) obj;
        int i = c0727a.f9196m;
        int i5 = this.f9196m;
        if (i5 != i) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            D1.b.l(i6, i5);
            int i7 = this.f9195l[i6];
            D1.b.l(i6, c0727a.f9196m);
            if (i7 != c0727a.f9195l[i6]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i5 = 0; i5 < this.f9196m; i5++) {
            i = (i * 31) + this.f9195l[i5];
        }
        return i;
    }

    public final String toString() {
        int i = this.f9196m;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f9195l;
        sb.append(iArr[0]);
        for (int i5 = 1; i5 < i; i5++) {
            sb.append(", ");
            sb.append(iArr[i5]);
        }
        sb.append(']');
        return sb.toString();
    }
}
