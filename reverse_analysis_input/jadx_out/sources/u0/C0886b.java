package u0;

import F0.AbstractC0055b;
import F0.C0056c;
import F0.K;
import F0.M;
import F0.s;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import t0.C0853j;

/* JADX INFO: renamed from: u0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0886b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0853j f10155a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K f10157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10158d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10161g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f10156b = new M();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10159e = -9223372036854775807L;

    public C0886b(C0853j c0853j) {
        this.f10155a = c0853j;
    }

    @Override // u0.i
    public final void a(C0363p c0363p, long j5, int i, boolean z4) {
        int iV = c0363p.v() & 3;
        int iV2 = c0363p.v() & 255;
        long jZ = i4.a.Z(this.f10161g, j5, this.f10159e, this.f10155a.f9903b);
        if (iV != 0) {
            if (iV == 1 || iV == 2) {
                int i5 = this.f10158d;
                if (i5 > 0) {
                    K k4 = this.f10157c;
                    int i6 = AbstractC0370w.f5326a;
                    k4.b(this.f10160f, 1, i5, 0, null);
                    this.f10158d = 0;
                }
            } else if (iV != 3) {
                throw new IllegalArgumentException(String.valueOf(iV));
            }
            int iA = c0363p.a();
            K k5 = this.f10157c;
            k5.getClass();
            k5.a(c0363p, iA, 0);
            int i7 = this.f10158d + iA;
            this.f10158d = i7;
            this.f10160f = jZ;
            if (z4 && iV == 3) {
                K k6 = this.f10157c;
                int i8 = AbstractC0370w.f5326a;
                k6.b(jZ, 1, i7, 0, null);
                this.f10158d = 0;
                return;
            }
            return;
        }
        int i9 = this.f10158d;
        if (i9 > 0) {
            K k7 = this.f10157c;
            int i10 = AbstractC0370w.f5326a;
            k7.b(this.f10160f, 1, i9, 0, null);
            this.f10158d = 0;
        }
        if (iV2 == 1) {
            int iA2 = c0363p.a();
            K k8 = this.f10157c;
            k8.getClass();
            k8.a(c0363p, iA2, 0);
            K k9 = this.f10157c;
            int i11 = AbstractC0370w.f5326a;
            k9.b(jZ, 1, iA2, 0, null);
            return;
        }
        byte[] bArr = c0363p.f5313a;
        M m4 = this.f10156b;
        m4.getClass();
        m4.p(bArr.length, bArr);
        m4.v(2);
        for (int i12 = 0; i12 < iV2; i12++) {
            C0056c c0056cO = AbstractC0055b.o(m4);
            K k10 = this.f10157c;
            k10.getClass();
            int i13 = c0056cO.f745d;
            k10.a(c0363p, i13, 0);
            K k11 = this.f10157c;
            int i14 = AbstractC0370w.f5326a;
            k11.b(jZ, 1, c0056cO.f745d, 0, null);
            jZ += ((long) (c0056cO.f746e / c0056cO.f743b)) * 1000000;
            m4.v(i13);
        }
    }

    @Override // u0.i
    public final void b(long j5, long j6) {
        this.f10159e = j5;
        this.f10161g = j6;
    }

    @Override // u0.i
    public final void c(long j5) {
        AbstractC0360m.h(this.f10159e == -9223372036854775807L);
        this.f10159e = j5;
    }

    @Override // u0.i
    public final void d(s sVar, int i) {
        K k4 = sVar.k(i, 1);
        this.f10157c = k4;
        k4.c(this.f10155a.f9904c);
    }
}
