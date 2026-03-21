package u0;

import F0.K;
import F0.M;
import F0.s;
import a.AbstractC0149a;
import d0.AbstractC0370w;
import d0.C0363p;
import java.math.RoundingMode;
import t0.C0853j;

/* JADX INFO: renamed from: u0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0885a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0853j f10147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f10148b = new M();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public K f10154h;
    public long i;

    public C0885a(C0853j c0853j) {
        this.f10147a = c0853j;
        this.f10149c = c0853j.f9903b;
        String str = (String) c0853j.f9905d.get("mode");
        str.getClass();
        if (AbstractC0149a.p(str, "AAC-hbr")) {
            this.f10150d = 13;
            this.f10151e = 3;
        } else {
            if (!AbstractC0149a.p(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f10150d = 6;
            this.f10151e = 2;
        }
        this.f10152f = this.f10151e + this.f10150d;
    }

    @Override // u0.i
    public final void a(C0363p c0363p, long j5, int i, boolean z4) {
        this.f10154h.getClass();
        short s4 = c0363p.s();
        int i5 = s4 / this.f10152f;
        long jZ = i4.a.Z(this.i, j5, this.f10153g, this.f10149c);
        M m4 = this.f10148b;
        m4.q(c0363p);
        int i6 = this.f10151e;
        int i7 = this.f10150d;
        if (i5 == 1) {
            int i8 = m4.i(i7);
            m4.u(i6);
            this.f10154h.a(c0363p, c0363p.a(), 0);
            if (z4) {
                this.f10154h.b(jZ, 1, i8, 0, null);
                return;
            }
            return;
        }
        c0363p.I((s4 + 7) / 8);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = m4.i(i7);
            m4.u(i6);
            this.f10154h.a(c0363p, i10, 0);
            this.f10154h.b(jZ, 1, i10, 0, null);
            jZ += AbstractC0370w.U(i5, 1000000L, this.f10149c, RoundingMode.DOWN);
        }
    }

    @Override // u0.i
    public final void b(long j5, long j6) {
        this.f10153g = j5;
        this.i = j6;
    }

    @Override // u0.i
    public final void c(long j5) {
        this.f10153g = j5;
    }

    @Override // u0.i
    public final void d(s sVar, int i) {
        K k4 = sVar.k(i, 1);
        this.f10154h = k4;
        k4.c(this.f10147a.f9904c);
    }
}
