package m2;

import b3.AbstractC0307a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends AbstractC0637D implements Set {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f8554n = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient I f8555m;

    public static int m(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static M n(int i, Object... objArr) {
        if (i == 0) {
            return h0.f8615u;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new o0(obj);
        }
        int iM = m(i);
        Object[] objArr2 = new Object[iM];
        int i5 = iM - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC0307a.i("at index ", i8));
            }
            int iHashCode = obj2.hashCode();
            int iS = r.s(iHashCode);
            while (true) {
                int i9 = iS & i5;
                Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i9] = obj2;
                    i6 += iHashCode;
                    i7++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iS++;
            }
        }
        Arrays.fill(objArr, i7, i, (Object) null);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o0(obj4);
        }
        if (m(i7) < iM / 2) {
            return n(i7, objArr);
        }
        int length = objArr.length;
        if (i7 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new h0(i6, i5, i7, objArr, objArr2);
    }

    public static M o(Collection collection) {
        if ((collection instanceof M) && !(collection instanceof SortedSet)) {
            M m4 = (M) collection;
            if (!m4.k()) {
                return m4;
            }
        }
        Object[] array = collection.toArray();
        return n(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof M) && (this instanceof h0)) {
            M m4 = (M) obj;
            m4.getClass();
            if ((m4 instanceof h0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return r.i(this, obj);
    }

    @Override // m2.AbstractC0637D
    public I f() {
        I i = this.f8555m;
        if (i != null) {
            return i;
        }
        I iP = p();
        this.f8555m = iP;
        return iP;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return r.m(this);
    }

    public I p() {
        Object[] array = toArray(AbstractC0637D.f8540l);
        C0640G c0640g = I.f8549m;
        return I.m(array.length, array);
    }
}
