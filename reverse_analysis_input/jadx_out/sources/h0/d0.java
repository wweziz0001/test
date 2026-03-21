package h0;

import android.util.Pair;
import java.io.IOException;
import x0.C0984z;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements x0.N, m0.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0 f6112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g0 f6113m;

    public d0(g0 g0Var, f0 f0Var) {
        this.f6113m = g0Var;
        this.f6112l = f0Var;
    }

    @Override // x0.N
    public final void a(int i, x0.H h2, C0984z c0984z, u0.g gVar) {
        Pair pairG = g(i, h2);
        if (pairG != null) {
            this.f6113m.i.c(new b0(this, pairG, c0984z, gVar, 0));
        }
    }

    @Override // x0.N
    public final void b(int i, x0.H h2, C0984z c0984z, u0.g gVar) {
        Pair pairG = g(i, h2);
        if (pairG != null) {
            this.f6113m.i.c(new b0(this, pairG, c0984z, gVar, 1));
        }
    }

    @Override // x0.N
    public final void c(int i, x0.H h2, u0.g gVar) {
        Pair pairG = g(i, h2);
        if (pairG != null) {
            this.f6113m.i.c(new a0(this, pairG, gVar, 1));
        }
    }

    @Override // x0.N
    public final void d(int i, x0.H h2, C0984z c0984z, u0.g gVar) {
        Pair pairG = g(i, h2);
        if (pairG != null) {
            this.f6113m.i.c(new b0(this, pairG, c0984z, gVar, 2));
        }
    }

    @Override // x0.N
    public final void e(int i, x0.H h2, final C0984z c0984z, final u0.g gVar, final IOException iOException, final boolean z4) {
        final Pair pairG = g(i, h2);
        if (pairG != null) {
            this.f6113m.i.c(new Runnable() { // from class: h0.c0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.c cVar = this.f6104l.f6113m.f6142h;
                    Pair pair = pairG;
                    cVar.e(((Integer) pair.first).intValue(), (x0.H) pair.second, c0984z, gVar, iOException, z4);
                }
            });
        }
    }

    @Override // x0.N
    public final void f(int i, x0.H h2, u0.g gVar) {
        Pair pairG = g(i, h2);
        if (pairG != null) {
            this.f6113m.i.c(new a0(this, pairG, gVar, 0));
        }
    }

    public final Pair g(int i, x0.H h2) {
        x0.H hA;
        f0 f0Var = this.f6112l;
        x0.H h5 = null;
        if (h2 != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= f0Var.f6124c.size()) {
                    hA = null;
                    break;
                }
                if (((x0.H) f0Var.f6124c.get(i5)).f10534d == h2.f10534d) {
                    Object obj = f0Var.f6123b;
                    int i6 = AbstractC0450a.f6086d;
                    hA = h2.a(Pair.create(obj, h2.f10531a));
                    break;
                }
                i5++;
            }
            if (hA == null) {
                return null;
            }
            h5 = hA;
        }
        return Pair.create(Integer.valueOf(i + f0Var.f6125d), h5);
    }
}
