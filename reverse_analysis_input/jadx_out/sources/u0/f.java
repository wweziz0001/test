package u0;

import F0.K;
import F0.M;
import F0.s;
import a0.C0157H;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import m2.g0;
import t0.C0851h;
import t0.C0853j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0853j f10191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K f10193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10198h;

    public f(C0853j c0853j) {
        this.f10191a = c0853j;
        try {
            this.f10192b = e(c0853j.f9905d);
            this.f10194d = -9223372036854775807L;
            this.f10195e = -1;
            this.f10196f = 0;
            this.f10197g = 0L;
            this.f10198h = -9223372036854775807L;
        } catch (C0157H e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static int e(g0 g0Var) throws C0157H {
        String str = (String) g0Var.get("config");
        int i = 0;
        i = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] bArrS = AbstractC0370w.s(str);
            M m4 = new M(bArrS.length, bArrS);
            int i5 = m4.i(1);
            if (i5 != 0) {
                throw new C0157H(AbstractC0307a.i("unsupported audio mux version: ", i5), null, true, 0);
            }
            AbstractC0360m.b("Only supports allStreamsSameTimeFraming.", m4.i(1) == 1);
            int i6 = m4.i(6);
            AbstractC0360m.b("Only suppors one program.", m4.i(4) == 0);
            AbstractC0360m.b("Only suppors one layer.", m4.i(3) == 0);
            i = i6;
        }
        return i + 1;
    }

    @Override // u0.i
    public final void a(C0363p c0363p, long j5, int i, boolean z4) {
        AbstractC0360m.i(this.f10193c);
        int iA = C0851h.a(this.f10195e);
        if (this.f10196f > 0 && iA < i) {
            K k4 = this.f10193c;
            k4.getClass();
            k4.b(this.f10198h, 1, this.f10196f, 0, null);
            this.f10196f = 0;
            this.f10198h = -9223372036854775807L;
        }
        for (int i5 = 0; i5 < this.f10192b; i5++) {
            int i6 = 0;
            while (c0363p.f5314b < c0363p.f5315c) {
                int iV = c0363p.v();
                i6 += iV;
                if (iV != 255) {
                    break;
                }
            }
            this.f10193c.a(c0363p, i6, 0);
            this.f10196f += i6;
        }
        this.f10198h = i4.a.Z(this.f10197g, j5, this.f10194d, this.f10191a.f9903b);
        if (z4) {
            K k5 = this.f10193c;
            k5.getClass();
            k5.b(this.f10198h, 1, this.f10196f, 0, null);
            this.f10196f = 0;
            this.f10198h = -9223372036854775807L;
        }
        this.f10195e = i;
    }

    @Override // u0.i
    public final void b(long j5, long j6) {
        this.f10194d = j5;
        this.f10196f = 0;
        this.f10197g = j6;
    }

    @Override // u0.i
    public final void c(long j5) {
        AbstractC0360m.h(this.f10194d == -9223372036854775807L);
        this.f10194d = j5;
    }

    @Override // u0.i
    public final void d(s sVar, int i) {
        K k4 = sVar.k(i, 2);
        this.f10193c = k4;
        int i5 = AbstractC0370w.f5326a;
        k4.c(this.f10191a.f9904c);
    }
}
