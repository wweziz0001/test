package J2;

import b3.AbstractC0307a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: J2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0082o extends O2.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0081n f1165E = new C0081n();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Object f1166F = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Object[] f1167A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f1168B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String[] f1169C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int[] f1170D;

    @Override // O2.a
    public final void A() {
        N(9);
        S();
        int i = this.f1168B;
        if (i > 0) {
            int[] iArr = this.f1170D;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // O2.a
    public final String C() {
        int iE = E();
        if (iE != 6 && iE != 7) {
            throw new IllegalStateException("Expected " + AbstractC0307a.t(6) + " but was " + AbstractC0307a.t(iE) + P());
        }
        String strH = ((G2.k) S()).h();
        int i = this.f1168B;
        if (i > 0) {
            int[] iArr = this.f1170D;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return strH;
    }

    @Override // O2.a
    public final int E() {
        if (this.f1168B == 0) {
            return 10;
        }
        Object objR = R();
        if (objR instanceof Iterator) {
            boolean z4 = this.f1167A[this.f1168B - 2] instanceof G2.j;
            Iterator it = (Iterator) objR;
            if (!it.hasNext()) {
                return z4 ? 4 : 2;
            }
            if (z4) {
                return 5;
            }
            T(it.next());
            return E();
        }
        if (objR instanceof G2.j) {
            return 3;
        }
        if (objR instanceof G2.f) {
            return 1;
        }
        if (objR instanceof G2.k) {
            Serializable serializable = ((G2.k) objR).f907l;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objR instanceof G2.i) {
            return 9;
        }
        if (objR == f1166F) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new O2.c("Custom JsonElement subclass " + objR.getClass().getName() + " is not supported");
    }

    @Override // O2.a
    public final void K() {
        int iB = O.i.b(E());
        if (iB == 1) {
            k();
            return;
        }
        if (iB != 9) {
            if (iB == 3) {
                l();
                return;
            }
            if (iB == 4) {
                Q(true);
                return;
            }
            S();
            int i = this.f1168B;
            if (i > 0) {
                int[] iArr = this.f1170D;
                int i5 = i - 1;
                iArr[i5] = iArr[i5] + 1;
            }
        }
    }

    public final void N(int i) {
        if (E() == i) {
            return;
        }
        throw new IllegalStateException("Expected " + AbstractC0307a.t(i) + " but was " + AbstractC0307a.t(E()) + P());
    }

    public final String O(boolean z4) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i5 = this.f1168B;
            if (i >= i5) {
                return sb.toString();
            }
            Object[] objArr = this.f1167A;
            Object obj = objArr[i];
            if (obj instanceof G2.f) {
                i++;
                if (i < i5 && (objArr[i] instanceof Iterator)) {
                    int i6 = this.f1170D[i];
                    if (z4 && i6 > 0 && (i == i5 - 1 || i == i5 - 2)) {
                        i6--;
                    }
                    sb.append('[');
                    sb.append(i6);
                    sb.append(']');
                }
            } else if ((obj instanceof G2.j) && (i = i + 1) < i5 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.f1169C[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public final String P() {
        return " at path " + O(false);
    }

    public final String Q(boolean z4) {
        N(5);
        Map.Entry entry = (Map.Entry) ((Iterator) R()).next();
        String str = (String) entry.getKey();
        this.f1169C[this.f1168B - 1] = z4 ? "<skipped>" : str;
        T(entry.getValue());
        return str;
    }

    public final Object R() {
        return this.f1167A[this.f1168B - 1];
    }

    public final Object S() {
        Object[] objArr = this.f1167A;
        int i = this.f1168B - 1;
        this.f1168B = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void T(Object obj) {
        int i = this.f1168B;
        Object[] objArr = this.f1167A;
        if (i == objArr.length) {
            int i5 = i * 2;
            this.f1167A = Arrays.copyOf(objArr, i5);
            this.f1170D = Arrays.copyOf(this.f1170D, i5);
            this.f1169C = (String[]) Arrays.copyOf(this.f1169C, i5);
        }
        Object[] objArr2 = this.f1167A;
        int i6 = this.f1168B;
        this.f1168B = i6 + 1;
        objArr2[i6] = obj;
    }

    @Override // O2.a
    public final void a() {
        N(1);
        T(((G2.f) R()).f904l.iterator());
        this.f1170D[this.f1168B - 1] = 0;
    }

    @Override // O2.a
    public final void b() {
        N(3);
        T(((I2.n) ((G2.j) R()).f906l.entrySet()).iterator());
    }

    @Override // O2.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1167A = new Object[]{f1166F};
        this.f1168B = 1;
    }

    @Override // O2.a
    public final void k() {
        N(2);
        S();
        S();
        int i = this.f1168B;
        if (i > 0) {
            int[] iArr = this.f1170D;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // O2.a
    public final void l() {
        N(4);
        this.f1169C[this.f1168B - 1] = null;
        S();
        S();
        int i = this.f1168B;
        if (i > 0) {
            int[] iArr = this.f1170D;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // O2.a
    public final String o() {
        return O(false);
    }

    @Override // O2.a
    public final String q() {
        return O(true);
    }

    @Override // O2.a
    public final boolean r() {
        int iE = E();
        return (iE == 4 || iE == 2 || iE == 10) ? false : true;
    }

    @Override // O2.a
    public final String toString() {
        return C0082o.class.getSimpleName() + P();
    }

    @Override // O2.a
    public final boolean u() {
        N(8);
        boolean zF = ((G2.k) S()).f();
        int i = this.f1168B;
        if (i > 0) {
            int[] iArr = this.f1170D;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return zF;
    }

    @Override // O2.a
    public final double v() throws O2.c {
        int iE = E();
        if (iE != 7 && iE != 6) {
            throw new IllegalStateException("Expected " + AbstractC0307a.t(7) + " but was " + AbstractC0307a.t(iE) + P());
        }
        double dJ = ((G2.k) R()).j();
        if (this.f1650z != 1 && (Double.isNaN(dJ) || Double.isInfinite(dJ))) {
            throw new O2.c("JSON forbids NaN and infinities: " + dJ);
        }
        S();
        int i = this.f1168B;
        if (i > 0) {
            int[] iArr = this.f1170D;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return dJ;
    }

    @Override // O2.a
    public final int w() {
        int iE = E();
        if (iE != 7 && iE != 6) {
            throw new IllegalStateException("Expected " + AbstractC0307a.t(7) + " but was " + AbstractC0307a.t(iE) + P());
        }
        G2.k kVar = (G2.k) R();
        int iIntValue = kVar.f907l instanceof Number ? kVar.k().intValue() : Integer.parseInt(kVar.h());
        S();
        int i = this.f1168B;
        if (i > 0) {
            int[] iArr = this.f1170D;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return iIntValue;
    }

    @Override // O2.a
    public final long x() {
        int iE = E();
        if (iE != 7 && iE != 6) {
            throw new IllegalStateException("Expected " + AbstractC0307a.t(7) + " but was " + AbstractC0307a.t(iE) + P());
        }
        G2.k kVar = (G2.k) R();
        long jLongValue = kVar.f907l instanceof Number ? kVar.k().longValue() : Long.parseLong(kVar.h());
        S();
        int i = this.f1168B;
        if (i > 0) {
            int[] iArr = this.f1170D;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return jLongValue;
    }

    @Override // O2.a
    public final String y() {
        return Q(false);
    }
}
