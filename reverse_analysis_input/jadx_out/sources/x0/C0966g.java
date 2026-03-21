package x0;

import a0.AbstractC0169U;
import a0.C0168T;
import d0.AbstractC0360m;
import java.util.ArrayList;

/* JADX INFO: renamed from: x0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0966g extends r0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0168T f10706A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0964e f10707B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0965f f10708C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f10709D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f10710E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f10711w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f10712x;
    public final boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f10713z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0966g(J j5, long j6, long j7, boolean z4) {
        super(j5);
        j5.getClass();
        AbstractC0360m.c(j6 >= 0);
        this.f10711w = j6;
        this.f10712x = j7;
        this.y = z4;
        this.f10713z = new ArrayList();
        this.f10706A = new C0168T();
    }

    @Override // x0.r0
    public final void C(AbstractC0169U abstractC0169U) {
        if (this.f10708C != null) {
            return;
        }
        E(abstractC0169U);
    }

    public final void E(AbstractC0169U abstractC0169U) {
        long j5;
        C0168T c0168t = this.f10706A;
        abstractC0169U.n(0, c0168t);
        long j6 = c0168t.f3259p;
        C0964e c0964e = this.f10707B;
        ArrayList arrayList = this.f10713z;
        long j7 = this.f10712x;
        if (c0964e == null || arrayList.isEmpty()) {
            j5 = this.f10711w;
            this.f10709D = j6 + j5;
            this.f10710E = j7 != Long.MIN_VALUE ? j6 + j7 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0963d c0963d = (C0963d) arrayList.get(i);
                long j8 = this.f10709D;
                long j9 = this.f10710E;
                c0963d.f10668p = j8;
                c0963d.f10669q = j9;
            }
        } else {
            j5 = this.f10709D - j6;
            j7 = j7 != Long.MIN_VALUE ? this.f10710E - j6 : Long.MIN_VALUE;
        }
        try {
            C0964e c0964e2 = new C0964e(abstractC0169U, j5, j7);
            this.f10707B = c0964e2;
            r(c0964e2);
        } catch (C0965f e5) {
            this.f10708C = e5;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((C0963d) arrayList.get(i5)).f10670r = this.f10708C;
            }
        }
    }

    @Override // x0.J
    public final F c(H h2, B0.f fVar, long j5) {
        C0963d c0963d = new C0963d(this.f10782v.c(h2, fVar, j5), this.y, this.f10709D, this.f10710E);
        this.f10713z.add(c0963d);
        return c0963d;
    }

    @Override // x0.J
    public final void d(F f2) {
        ArrayList arrayList = this.f10713z;
        AbstractC0360m.h(arrayList.remove(f2));
        this.f10782v.d(((C0963d) f2).f10664l);
        if (arrayList.isEmpty()) {
            C0964e c0964e = this.f10707B;
            c0964e.getClass();
            E(c0964e.f10811b);
        }
    }

    @Override // x0.AbstractC0970k, x0.J
    public final void e() throws C0965f {
        C0965f c0965f = this.f10708C;
        if (c0965f != null) {
            throw c0965f;
        }
        super.e();
    }

    @Override // x0.AbstractC0970k, x0.AbstractC0960a
    public final void t() {
        super.t();
        this.f10708C = null;
        this.f10707B = null;
    }
}
