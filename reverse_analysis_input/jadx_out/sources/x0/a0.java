package x0;

import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0197w;
import android.os.Looper;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.InterfaceC0403A;
import f0.InterfaceC0412g;
import f0.InterfaceC0413h;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends AbstractC0960a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f10641A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f10642B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InterfaceC0403A f10643C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0150A f10644D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC0412g f10645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final I2.g f10646t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m0.i f10647u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final A0.b f10648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f10649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f10650x;
    public boolean y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10651z = -9223372036854775807L;

    public a0(C0150A c0150a, InterfaceC0412g interfaceC0412g, I2.g gVar, m0.i iVar, A0.b bVar, int i, boolean z4) {
        this.f10644D = c0150a;
        this.f10645s = interfaceC0412g;
        this.f10646t = gVar;
        this.f10647u = iVar;
        this.f10648v = bVar;
        this.f10649w = i;
        this.f10650x = z4;
    }

    @Override // x0.J
    public final synchronized C0150A a() {
        return this.f10644D;
    }

    @Override // x0.J
    public final synchronized void b(C0150A c0150a) {
        this.f10644D = c0150a;
    }

    @Override // x0.J
    public final F c(H h2, B0.f fVar, long j5) {
        InterfaceC0413h interfaceC0413hA = this.f10645s.a();
        InterfaceC0403A interfaceC0403A = this.f10643C;
        if (interfaceC0403A != null) {
            interfaceC0413hA.b(interfaceC0403A);
        }
        C0197w c0197w = a().f3154b;
        c0197w.getClass();
        AbstractC0360m.i(this.f10640r);
        Z1.m mVar = new Z1.m((F0.t) this.f10646t.f1034m);
        m0.e eVar = new m0.e(this.f10637o.f8498c, 0, h2);
        m0.e eVarH = h(h2);
        long jM = AbstractC0370w.M(c0197w.f3465f);
        return new Y(c0197w.f3460a, interfaceC0413hA, mVar, this.f10647u, eVar, this.f10648v, eVarH, this, fVar, this.f10649w, this.f10650x, jM, null);
    }

    @Override // x0.J
    public final void d(F f2) {
        Y y = (Y) f2;
        if (y.f10597H) {
            for (e0 e0Var : y.f10594E) {
                e0Var.g();
                androidx.lifecycle.E e5 = e0Var.f10689h;
                if (e5 != null) {
                    e5.I(e0Var.f10686e);
                    e0Var.f10689h = null;
                    e0Var.f10688g = null;
                }
            }
        }
        y.f10626w.e(y);
        y.f10591B.removeCallbacksAndMessages(null);
        y.f10592C = null;
        y.f10614Z = true;
    }

    @Override // x0.AbstractC0960a
    public final void p(InterfaceC0403A interfaceC0403A) {
        this.f10643C = interfaceC0403A;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        i0.j jVar = this.f10640r;
        AbstractC0360m.i(jVar);
        m0.i iVar = this.f10647u;
        iVar.a(looperMyLooper, jVar);
        iVar.c();
        w();
    }

    @Override // x0.AbstractC0960a
    public final void t() {
        this.f10647u.release();
    }

    public final void w() {
        AbstractC0169U n0Var = new n0(this.f10651z, this.f10641A, this.f10642B, a());
        if (this.y) {
            n0Var = new t0.r(n0Var, 1);
        }
        r(n0Var);
    }

    public final void x(long j5, boolean z4, boolean z5) {
        if (j5 == -9223372036854775807L) {
            j5 = this.f10651z;
        }
        if (!this.y && this.f10651z == j5 && this.f10641A == z4 && this.f10642B == z5) {
            return;
        }
        this.f10651z = j5;
        this.f10641A = z4;
        this.f10642B = z5;
        this.y = false;
        w();
    }

    @Override // x0.J
    public final void e() {
    }
}
