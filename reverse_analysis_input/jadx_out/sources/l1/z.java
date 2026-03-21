package l1;

import F0.C0066m;
import F0.M;
import android.util.SparseArray;
import d0.AbstractC0360m;
import d0.C0363p;
import d0.C0368u;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class z implements F0.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8203h;
    public K0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public F0.s f8204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8205k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0368u f8196a = new C0368u(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f8198c = new C0363p(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f8197b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f8199d = new x(0);

    @Override // F0.q
    public final void b(long j5, long j6) {
        long j7;
        C0368u c0368u = this.f8196a;
        synchronized (c0368u) {
            j7 = c0368u.f5323b;
        }
        boolean z4 = j7 == -9223372036854775807L;
        if (!z4) {
            long jD = c0368u.d();
            z4 = (jD == -9223372036854775807L || jD == 0 || jD == j6) ? false : true;
        }
        if (z4) {
            c0368u.f(j6);
        }
        K0.b bVar = this.i;
        if (bVar != null) {
            bVar.d(j6);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f8197b;
            if (i >= sparseArray.size()) {
                return;
            }
            y yVar = (y) sparseArray.valueAt(i);
            yVar.f8194f = false;
            yVar.f8189a.a();
            i++;
        }
    }

    @Override // F0.q
    public final int d(F0.r rVar, F0.u uVar) throws EOFException, InterruptedIOException {
        int i;
        long j5;
        h jVar;
        long jC;
        long jC2;
        AbstractC0360m.i(this.f8204j);
        long j6 = ((C0066m) rVar).f798n;
        int i5 = (j6 > (-1L) ? 1 : (j6 == (-1L) ? 0 : -1));
        int i6 = 1;
        x xVar = this.f8199d;
        if (i5 != 0 && !xVar.f8184d) {
            boolean z4 = xVar.f8186f;
            C0363p c0363p = xVar.f8183c;
            if (!z4) {
                C0066m c0066m = (C0066m) rVar;
                long j7 = c0066m.f798n;
                int iMin = (int) Math.min(20000L, j7);
                long j8 = j7 - ((long) iMin);
                if (c0066m.f799o != j8) {
                    uVar.f817a = j8;
                } else {
                    c0363p.E(iMin);
                    c0066m.f801q = 0;
                    c0066m.t(c0363p.f5313a, 0, iMin, false);
                    int i7 = c0363p.f5314b;
                    int i8 = c0363p.f5315c - 4;
                    while (true) {
                        if (i8 < i7) {
                            jC2 = -9223372036854775807L;
                            break;
                        }
                        if (x.b(i8, c0363p.f5313a) == 442) {
                            c0363p.H(i8 + 4);
                            jC2 = x.c(c0363p);
                            if (jC2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i8--;
                    }
                    xVar.f8188h = jC2;
                    xVar.f8186f = true;
                    i6 = 0;
                }
            } else {
                if (xVar.f8188h == -9223372036854775807L) {
                    xVar.a((C0066m) rVar);
                    return 0;
                }
                if (xVar.f8185e) {
                    long j9 = xVar.f8187g;
                    if (j9 == -9223372036854775807L) {
                        xVar.a((C0066m) rVar);
                        return 0;
                    }
                    C0368u c0368u = xVar.f8182b;
                    xVar.i = c0368u.c(xVar.f8188h) - c0368u.b(j9);
                    xVar.a((C0066m) rVar);
                    return 0;
                }
                C0066m c0066m2 = (C0066m) rVar;
                int iMin2 = (int) Math.min(20000L, c0066m2.f798n);
                long j10 = 0;
                if (c0066m2.f799o != j10) {
                    uVar.f817a = j10;
                } else {
                    c0363p.E(iMin2);
                    c0066m2.f801q = 0;
                    c0066m2.t(c0363p.f5313a, 0, iMin2, false);
                    int i9 = c0363p.f5314b;
                    int i10 = c0363p.f5315c;
                    while (true) {
                        if (i9 >= i10 - 3) {
                            jC = -9223372036854775807L;
                            break;
                        }
                        if (x.b(i9, c0363p.f5313a) == 442) {
                            c0363p.H(i9 + 4);
                            jC = x.c(c0363p);
                            if (jC != -9223372036854775807L) {
                                break;
                            }
                        }
                        i9++;
                    }
                    xVar.f8187g = jC;
                    xVar.f8185e = true;
                    i6 = 0;
                }
            }
            return i6;
        }
        if (this.f8205k) {
            i = i5;
            j5 = j6;
        } else {
            this.f8205k = true;
            long j11 = xVar.i;
            if (j11 != -9223372036854775807L) {
                A0.b bVar = new A0.b(13);
                C0368u c0368u2 = xVar.f8182b;
                Z1.l lVar = new Z1.l();
                lVar.f3020l = c0368u2;
                lVar.f3021m = new C0363p();
                i = i5;
                j5 = j6;
                K0.b bVar2 = new K0.b(bVar, lVar, j11, j11 + 1, 0L, j6, 188L, 1000);
                this.i = bVar2;
                this.f8204j.d(bVar2.f1211a);
            } else {
                i = i5;
                j5 = j6;
                this.f8204j.d(new F0.v(j11));
            }
        }
        K0.b bVar3 = this.i;
        if (bVar3 != null && bVar3.f1213c != null) {
            return bVar3.b((C0066m) rVar, uVar);
        }
        C0066m c0066m3 = (C0066m) rVar;
        c0066m3.f801q = 0;
        long jW = i != 0 ? j5 - c0066m3.w() : -1L;
        if (jW != -1 && jW < 4) {
            return -1;
        }
        C0363p c0363p2 = this.f8198c;
        if (!c0066m3.t(c0363p2.f5313a, 0, 4, true)) {
            return -1;
        }
        c0363p2.H(0);
        int i11 = c0363p2.i();
        if (i11 == 441) {
            return -1;
        }
        if (i11 == 442) {
            c0066m3.t(c0363p2.f5313a, 0, 10, false);
            c0363p2.H(9);
            c0066m3.f((c0363p2.v() & 7) + 14);
            return 0;
        }
        if (i11 == 443) {
            c0066m3.t(c0363p2.f5313a, 0, 2, false);
            c0363p2.H(0);
            c0066m3.f(c0363p2.B() + 6);
            return 0;
        }
        if (((i11 & (-256)) >> 8) != 1) {
            c0066m3.f(1);
            return 0;
        }
        int i12 = i11 & 255;
        SparseArray sparseArray = this.f8197b;
        y yVar = (y) sparseArray.get(i12);
        if (!this.f8200e) {
            if (yVar == null) {
                if (i12 == 189) {
                    jVar = new C0570b();
                    this.f8201f = true;
                    this.f8203h = c0066m3.f799o;
                } else if ((i11 & 224) == 192) {
                    jVar = new t(null, 0);
                    this.f8201f = true;
                    this.f8203h = c0066m3.f799o;
                } else if ((i11 & 240) == 224) {
                    jVar = new j(null);
                    this.f8202g = true;
                    this.f8203h = c0066m3.f799o;
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    jVar.d(this.f8204j, new E(i12, 256));
                    yVar = new y(jVar, this.f8196a);
                    sparseArray.put(i12, yVar);
                }
            }
            if (c0066m3.f799o > ((this.f8201f && this.f8202g) ? this.f8203h + 8192 : 1048576L)) {
                this.f8200e = true;
                this.f8204j.j();
            }
        }
        c0066m3.t(c0363p2.f5313a, 0, 2, false);
        c0363p2.H(0);
        int iB = c0363p2.B() + 6;
        if (yVar == null) {
            c0066m3.f(iB);
        } else {
            c0363p2.E(iB);
            c0066m3.l(c0363p2.f5313a, 0, iB, false);
            c0363p2.H(6);
            M m4 = yVar.f8191c;
            c0363p2.g(m4.f711b, 0, 3);
            m4.r(0);
            m4.u(8);
            yVar.f8192d = m4.h();
            yVar.f8193e = m4.h();
            m4.u(6);
            c0363p2.g(m4.f711b, 0, m4.i(8));
            m4.r(0);
            yVar.f8195g = 0L;
            if (yVar.f8192d) {
                m4.u(4);
                long jI = ((long) m4.i(3)) << 30;
                m4.u(1);
                long jI2 = jI | ((long) (m4.i(15) << 15));
                m4.u(1);
                long jI3 = jI2 | ((long) m4.i(15));
                m4.u(1);
                boolean z5 = yVar.f8194f;
                C0368u c0368u3 = yVar.f8190b;
                if (!z5 && yVar.f8193e) {
                    m4.u(4);
                    long jI4 = ((long) m4.i(3)) << 30;
                    m4.u(1);
                    long jI5 = jI4 | ((long) (m4.i(15) << 15));
                    m4.u(1);
                    long jI6 = jI5 | ((long) m4.i(15));
                    m4.u(1);
                    c0368u3.b(jI6);
                    yVar.f8194f = true;
                }
                yVar.f8195g = c0368u3.b(jI3);
            }
            long j12 = yVar.f8195g;
            h hVar = yVar.f8189a;
            hVar.e(j12, 4);
            hVar.b(c0363p2);
            hVar.c(false);
            c0363p2.G(c0363p2.f5313a.length);
        }
        return 0;
    }

    @Override // F0.q
    public final boolean e(F0.r rVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C0066m c0066m = (C0066m) rVar;
        c0066m.t(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c0066m.a(bArr[13] & 7, false);
        c0066m.t(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // F0.q
    public final void j(F0.s sVar) {
        this.f8204j = sVar;
    }

    @Override // F0.q
    public final void release() {
    }
}
