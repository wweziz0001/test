package R3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterable, O3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1957n;

    public a(int i, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1955l = i;
        if (i6 > 0) {
            if (i < i5) {
                int i7 = i5 % i6;
                int i8 = i % i6;
                int i9 = ((i7 < 0 ? i7 + i6 : i7) - (i8 < 0 ? i8 + i6 : i8)) % i6;
                i5 -= i9 < 0 ? i9 + i6 : i9;
            }
        } else {
            if (i6 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i5) {
                int i10 = -i6;
                int i11 = i % i10;
                int i12 = i5 % i10;
                int i13 = ((i11 < 0 ? i11 + i10 : i11) - (i12 < 0 ? i12 + i10 : i12)) % i10;
                i5 += i13 < 0 ? i13 + i10 : i13;
            }
        }
        this.f1956m = i5;
        this.f1957n = i6;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f1955l != aVar.f1955l || this.f1956m != aVar.f1956m || this.f1957n != aVar.f1957n) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1955l * 31) + this.f1956m) * 31) + this.f1957n;
    }

    public boolean isEmpty() {
        int i = this.f1957n;
        int i5 = this.f1956m;
        int i6 = this.f1955l;
        if (i > 0) {
            if (i6 <= i5) {
                return false;
            }
        } else if (i6 >= i5) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f1955l, this.f1956m, this.f1957n);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f1956m;
        int i5 = this.f1955l;
        int i6 = this.f1957n;
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i6);
        } else {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i6);
        }
        return sb.toString();
    }
}
