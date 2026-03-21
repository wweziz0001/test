package h0;

import a0.AbstractC0169U;
import a0.C0167S;
import a0.C0168T;
import android.util.Pair;

/* JADX INFO: renamed from: h0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0450a extends AbstractC0169U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6086d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.j0 f6088c;

    public AbstractC0450a(x0.j0 j0Var) {
        this.f6088c = j0Var;
        this.f6087b = ((x0.i0) j0Var).f10721b.length;
    }

    @Override // a0.AbstractC0169U
    public final int a(boolean z4) {
        if (this.f6087b == 0) {
            return -1;
        }
        int iW = 0;
        if (z4) {
            int[] iArr = ((x0.i0) this.f6088c).f10721b;
            iW = iArr.length > 0 ? iArr[0] : -1;
        }
        while (y(iW).p()) {
            iW = w(iW, z4);
            if (iW == -1) {
                return -1;
            }
        }
        return y(iW).a(z4) + v(iW);
    }

    @Override // a0.AbstractC0169U
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        if (iQ == -1 || (iB = y(iQ).b(obj3)) == -1) {
            return -1;
        }
        return u(iQ) + iB;
    }

    @Override // a0.AbstractC0169U
    public final int c(boolean z4) {
        int iX;
        int i = this.f6087b;
        if (i == 0) {
            return -1;
        }
        if (z4) {
            int[] iArr = ((x0.i0) this.f6088c).f10721b;
            iX = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iX = i - 1;
        }
        while (y(iX).p()) {
            iX = x(iX, z4);
            if (iX == -1) {
                return -1;
            }
        }
        return y(iX).c(z4) + v(iX);
    }

    @Override // a0.AbstractC0169U
    public final int e(int i, int i5, boolean z4) {
        int iS = s(i);
        int iV = v(iS);
        int iE = y(iS).e(i - iV, i5 == 2 ? 0 : i5, z4);
        if (iE != -1) {
            return iV + iE;
        }
        int iW = w(iS, z4);
        while (iW != -1 && y(iW).p()) {
            iW = w(iW, z4);
        }
        if (iW != -1) {
            return y(iW).a(z4) + v(iW);
        }
        if (i5 == 2) {
            return a(z4);
        }
        return -1;
    }

    @Override // a0.AbstractC0169U
    public final C0167S f(int i, C0167S c0167s, boolean z4) {
        int iR = r(i);
        int iV = v(iR);
        y(iR).f(i - u(iR), c0167s, z4);
        c0167s.f3238c += iV;
        if (z4) {
            Object objT = t(iR);
            Object obj = c0167s.f3237b;
            obj.getClass();
            c0167s.f3237b = Pair.create(objT, obj);
        }
        return c0167s;
    }

    @Override // a0.AbstractC0169U
    public final C0167S g(Object obj, C0167S c0167s) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        int iV = v(iQ);
        y(iQ).g(obj3, c0167s);
        c0167s.f3238c += iV;
        c0167s.f3237b = obj;
        return c0167s;
    }

    @Override // a0.AbstractC0169U
    public final int k(int i, int i5, boolean z4) {
        int iS = s(i);
        int iV = v(iS);
        int iK = y(iS).k(i - iV, i5 == 2 ? 0 : i5, z4);
        if (iK != -1) {
            return iV + iK;
        }
        int iX = x(iS, z4);
        while (iX != -1 && y(iX).p()) {
            iX = x(iX, z4);
        }
        if (iX != -1) {
            return y(iX).c(z4) + v(iX);
        }
        if (i5 == 2) {
            return c(z4);
        }
        return -1;
    }

    @Override // a0.AbstractC0169U
    public final Object l(int i) {
        int iR = r(i);
        return Pair.create(t(iR), y(iR).l(i - u(iR)));
    }

    @Override // a0.AbstractC0169U
    public final C0168T m(int i, C0168T c0168t, long j5) {
        int iS = s(i);
        int iV = v(iS);
        int iU = u(iS);
        y(iS).m(i - iV, c0168t, j5);
        Object objT = t(iS);
        if (!C0168T.f3243q.equals(c0168t.f3245a)) {
            objT = Pair.create(objT, c0168t.f3245a);
        }
        c0168t.f3245a = objT;
        c0168t.f3257n += iU;
        c0168t.f3258o += iU;
        return c0168t;
    }

    public abstract int q(Object obj);

    public abstract int r(int i);

    public abstract int s(int i);

    public abstract Object t(int i);

    public abstract int u(int i);

    public abstract int v(int i);

    public final int w(int i, boolean z4) {
        if (!z4) {
            if (i < this.f6087b - 1) {
                return i + 1;
            }
            return -1;
        }
        x0.i0 i0Var = (x0.i0) this.f6088c;
        int i5 = i0Var.f10722c[i] + 1;
        int[] iArr = i0Var.f10721b;
        if (i5 < iArr.length) {
            return iArr[i5];
        }
        return -1;
    }

    public final int x(int i, boolean z4) {
        if (!z4) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        x0.i0 i0Var = (x0.i0) this.f6088c;
        int i5 = i0Var.f10722c[i] - 1;
        if (i5 >= 0) {
            return i0Var.f10721b[i5];
        }
        return -1;
    }

    public abstract AbstractC0169U y(int i);
}
