package a0;

import android.util.Pair;
import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: renamed from: a0.U, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0169U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0166Q f3260a = new C0166Q();

    static {
        AbstractC0370w.G(0);
        AbstractC0370w.G(1);
        AbstractC0370w.G(2);
    }

    public int a(boolean z4) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z4) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, C0167S c0167s, C0168T c0168t, int i5, boolean z4) {
        int i6 = f(i, c0167s, false).f3238c;
        if (m(i6, c0168t, 0L).f3258o != i) {
            return i + 1;
        }
        int iE = e(i6, i5, z4);
        if (iE == -1) {
            return -1;
        }
        return m(iE, c0168t, 0L).f3257n;
    }

    public int e(int i, int i5, boolean z4) {
        if (i5 == 0) {
            if (i == c(z4)) {
                return -1;
            }
            return i + 1;
        }
        if (i5 == 1) {
            return i;
        }
        if (i5 == 2) {
            return i == c(z4) ? a(z4) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0169U)) {
            return false;
        }
        AbstractC0169U abstractC0169U = (AbstractC0169U) obj;
        if (abstractC0169U.o() != o() || abstractC0169U.h() != h()) {
            return false;
        }
        C0168T c0168t = new C0168T();
        C0167S c0167s = new C0167S();
        C0168T c0168t2 = new C0168T();
        C0167S c0167s2 = new C0167S();
        for (int i = 0; i < o(); i++) {
            if (!m(i, c0168t, 0L).equals(abstractC0169U.m(i, c0168t2, 0L))) {
                return false;
            }
        }
        for (int i5 = 0; i5 < h(); i5++) {
            if (!f(i5, c0167s, true).equals(abstractC0169U.f(i5, c0167s2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != abstractC0169U.a(true) || (iC = c(true)) != abstractC0169U.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != abstractC0169U.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public abstract C0167S f(int i, C0167S c0167s, boolean z4);

    public C0167S g(Object obj, C0167S c0167s) {
        return f(b(obj), c0167s, true);
    }

    public abstract int h();

    public final int hashCode() {
        C0168T c0168t = new C0168T();
        C0167S c0167s = new C0167S();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, c0168t, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i5 = 0; i5 < h(); i5++) {
            iH = (iH * 31) + f(i5, c0167s, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(C0168T c0168t, C0167S c0167s, int i, long j5) {
        Pair pairJ = j(c0168t, c0167s, i, j5, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(C0168T c0168t, C0167S c0167s, int i, long j5, long j6) {
        AbstractC0360m.e(i, o());
        m(i, c0168t, j6);
        if (j5 == -9223372036854775807L) {
            j5 = c0168t.f3255l;
            if (j5 == -9223372036854775807L) {
                return null;
            }
        }
        int i5 = c0168t.f3257n;
        f(i5, c0167s, false);
        while (i5 < c0168t.f3258o && c0167s.f3240e != j5) {
            int i6 = i5 + 1;
            if (f(i6, c0167s, false).f3240e > j5) {
                break;
            }
            i5 = i6;
        }
        f(i5, c0167s, true);
        long jMin = j5 - c0167s.f3240e;
        long j7 = c0167s.f3239d;
        if (j7 != -9223372036854775807L) {
            jMin = Math.min(jMin, j7 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c0167s.f3237b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i5, boolean z4) {
        if (i5 == 0) {
            if (i == a(z4)) {
                return -1;
            }
            return i - 1;
        }
        if (i5 == 1) {
            return i;
        }
        if (i5 == 2) {
            return i == a(z4) ? c(z4) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i);

    public abstract C0168T m(int i, C0168T c0168t, long j5);

    public final void n(int i, C0168T c0168t) {
        m(i, c0168t, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
