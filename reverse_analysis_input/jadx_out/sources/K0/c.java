package K0;

import F0.A;
import F0.AbstractC0055b;
import F0.C0066m;
import F0.E;
import F0.K;
import F0.M;
import F0.q;
import F0.r;
import F0.s;
import F0.u;
import F0.v;
import F0.w;
import I2.g;
import T0.h;
import a0.C0155F;
import a0.C0157H;
import d0.AbstractC0370w;
import d0.C0363p;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import m2.I;

/* JADX INFO: loaded from: classes.dex */
public final class c implements q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f1219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K f1220f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0155F f1222h;
    public w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f1225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f1227n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1215a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0363p f1216b = new C0363p(0, new byte[32768]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1217c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f1218d = new u();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1221g = 0;

    @Override // F0.q
    public final void b(long j5, long j6) {
        if (j5 == 0) {
            this.f1221g = 0;
        } else {
            b bVar = this.f1225l;
            if (bVar != null) {
                bVar.d(j6);
            }
        }
        this.f1227n = j6 != 0 ? -1L : 0L;
        this.f1226m = 0;
        this.f1216b.E(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    @Override // F0.q
    public final int d(r rVar, u uVar) throws C0157H, EOFException, InterruptedIOException {
        w wVar;
        s sVar;
        E vVar;
        s sVar2;
        long j5;
        boolean z4;
        long j6;
        boolean zD;
        int i = 2;
        boolean z5 = true;
        int i5 = this.f1221g;
        C0155F c0155f = null;
        if (i5 == 0) {
            ((C0066m) rVar).f801q = 0;
            C0066m c0066m = (C0066m) rVar;
            long jW = c0066m.w();
            C0155F c0155fA = new A(0).a(c0066m, !this.f1217c ? null : h.f2122d);
            if (c0155fA != null && c0155fA.f3211l.length != 0) {
                c0155f = c0155fA;
            }
            c0066m.f((int) (c0066m.w() - jW));
            this.f1222h = c0155f;
            this.f1221g = 1;
            return 0;
        }
        byte[] bArr = this.f1215a;
        if (i5 == 1) {
            ((C0066m) rVar).t(bArr, 0, bArr.length, false);
            ((C0066m) rVar).f801q = 0;
            this.f1221g = 2;
            return 0;
        }
        int i6 = 3;
        if (i5 == 2) {
            C0363p c0363p = new C0363p(4);
            ((C0066m) rVar).l(c0363p.f5313a, 0, 4, false);
            if (c0363p.x() != 1716281667) {
                throw C0157H.a(null, "Failed to read FLAC stream marker.");
            }
            this.f1221g = 3;
            return 0;
        }
        if (i5 == 3) {
            ?? r12 = 0;
            w wVar2 = this.i;
            boolean z6 = false;
            while (!z6) {
                ((C0066m) rVar).f801q = r12;
                byte[] bArr2 = new byte[4];
                M m4 = new M(4, bArr2);
                C0066m c0066m2 = (C0066m) rVar;
                c0066m2.t(bArr2, r12, 4, r12);
                boolean zH = m4.h();
                int i7 = m4.i(i);
                int i8 = m4.i(24) + 4;
                if (i7 == 0) {
                    byte[] bArr3 = new byte[38];
                    c0066m2.l(bArr3, r12, 38, r12);
                    wVar = new w(4, bArr3);
                } else {
                    if (wVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i7 == i6) {
                        C0363p c0363p2 = new C0363p(i8);
                        c0066m2.l(c0363p2.f5313a, 0, i8, false);
                        wVar = new w(wVar2.f821a, wVar2.f822b, wVar2.f823c, wVar2.f824d, wVar2.f825e, wVar2.f827g, wVar2.f828h, wVar2.f829j, AbstractC0055b.w(c0363p2), wVar2.f831l);
                    } else {
                        C0155F c0155f2 = wVar2.f831l;
                        if (i7 == 4) {
                            C0363p c0363p3 = new C0363p(i8);
                            c0066m2.l(c0363p3.f5313a, 0, i8, false);
                            c0363p3.I(4);
                            C0155F c0155fU = AbstractC0055b.u(Arrays.asList((String[]) AbstractC0055b.x(c0363p3, false, false).f190l));
                            if (c0155f2 != null) {
                                c0155fU = c0155f2.e(c0155fU);
                            }
                            wVar = new w(wVar2.f821a, wVar2.f822b, wVar2.f823c, wVar2.f824d, wVar2.f825e, wVar2.f827g, wVar2.f828h, wVar2.f829j, wVar2.f830k, c0155fU);
                        } else if (i7 == 6) {
                            C0363p c0363p4 = new C0363p(i8);
                            c0066m2.l(c0363p4.f5313a, 0, i8, false);
                            c0363p4.I(4);
                            C0155F c0155f3 = new C0155F(I.u(R0.a.d(c0363p4)));
                            if (c0155f2 != null) {
                                c0155f3 = c0155f2.e(c0155f3);
                            }
                            wVar = new w(wVar2.f821a, wVar2.f822b, wVar2.f823c, wVar2.f824d, wVar2.f825e, wVar2.f827g, wVar2.f828h, wVar2.f829j, wVar2.f830k, c0155f3);
                        } else {
                            c0066m2.f(i8);
                            int i9 = AbstractC0370w.f5326a;
                            this.i = wVar2;
                            z6 = zH;
                            r12 = 0;
                            i6 = 3;
                            i = 7;
                        }
                    }
                }
                wVar2 = wVar;
                int i92 = AbstractC0370w.f5326a;
                this.i = wVar2;
                z6 = zH;
                r12 = 0;
                i6 = 3;
                i = 7;
            }
            this.i.getClass();
            this.f1223j = Math.max(this.i.f823c, 6);
            K k4 = this.f1220f;
            int i10 = AbstractC0370w.f5326a;
            k4.c(this.i.c(bArr, this.f1222h));
            this.f1221g = 4;
            return 0;
        }
        long j7 = 0;
        if (i5 == 4) {
            ((C0066m) rVar).f801q = 0;
            C0363p c0363p5 = new C0363p(2);
            C0066m c0066m3 = (C0066m) rVar;
            c0066m3.t(c0363p5.f5313a, 0, 2, false);
            int iB = c0363p5.B();
            if ((iB >> 2) != 16382) {
                c0066m3.f801q = 0;
                throw C0157H.a(null, "First frame does not start with sync code.");
            }
            c0066m3.f801q = 0;
            this.f1224k = iB;
            s sVar3 = this.f1219e;
            int i11 = AbstractC0370w.f5326a;
            long j8 = c0066m3.f799o;
            this.i.getClass();
            w wVar3 = this.i;
            if (wVar3.f830k != null) {
                vVar = new v(wVar3, j8, 0);
                sVar2 = sVar3;
            } else {
                long j9 = c0066m3.f798n;
                if (j9 == -1 || wVar3.f829j <= 0) {
                    sVar = sVar3;
                    vVar = new v(wVar3.b());
                } else {
                    int i12 = this.f1224k;
                    g gVar = new g(wVar3, i);
                    a aVar = new a(wVar3, i12);
                    long jB = wVar3.b();
                    int i13 = wVar3.f823c;
                    int i14 = wVar3.f824d;
                    if (i14 > 0) {
                        sVar = sVar3;
                        j5 = ((((long) i14) + ((long) i13)) / 2) + 1;
                    } else {
                        sVar = sVar3;
                        int i15 = wVar3.f822b;
                        int i16 = wVar3.f821a;
                        j5 = (((((i16 != i15 || i16 <= 0) ? 4096L : i16) * ((long) wVar3.f827g)) * ((long) wVar3.f828h)) / 8) + 64;
                    }
                    b bVar = new b(gVar, aVar, jB, wVar3.f829j, j8, j9, j5, Math.max(6, i13));
                    this.f1225l = bVar;
                    vVar = bVar.f1211a;
                }
                sVar2 = sVar;
            }
            sVar2.d(vVar);
            this.f1221g = 5;
            return 0;
        }
        if (i5 != 5) {
            throw new IllegalStateException();
        }
        this.f1220f.getClass();
        this.i.getClass();
        b bVar2 = this.f1225l;
        if (bVar2 != null && bVar2.f1213c != null) {
            return bVar2.b((C0066m) rVar, uVar);
        }
        if (this.f1227n == -1) {
            w wVar4 = this.i;
            ((C0066m) rVar).f801q = 0;
            C0066m c0066m4 = (C0066m) rVar;
            c0066m4.a(1, false);
            byte[] bArr4 = new byte[1];
            c0066m4.t(bArr4, 0, 1, false);
            boolean z7 = (bArr4[0] & 1) == 1;
            c0066m4.a(2, false);
            i = z7 ? 7 : 6;
            C0363p c0363p6 = new C0363p(i);
            byte[] bArr5 = c0363p6.f5313a;
            int i17 = 0;
            while (i17 < i) {
                int iD = c0066m4.d(bArr5, i17, i - i17);
                if (iD == -1) {
                    break;
                }
                i17 += iD;
            }
            c0363p6.G(i17);
            c0066m4.f801q = 0;
            try {
                long jC = c0363p6.C();
                if (!z7) {
                    jC *= (long) wVar4.f822b;
                }
                j7 = jC;
            } catch (NumberFormatException unused) {
                z5 = false;
            }
            if (!z5) {
                throw C0157H.a(null, null);
            }
            this.f1227n = j7;
            return 0;
        }
        C0363p c0363p7 = this.f1216b;
        int i18 = c0363p7.f5315c;
        if (i18 < 32768) {
            int i19 = ((C0066m) rVar).read(c0363p7.f5313a, i18, 32768 - i18);
            z4 = i19 == -1;
            if (!z4) {
                c0363p7.G(i18 + i19);
            } else if (c0363p7.a() == 0) {
                long j10 = this.f1227n * 1000000;
                w wVar5 = this.i;
                int i20 = AbstractC0370w.f5326a;
                this.f1220f.b(j10 / ((long) wVar5.f825e), 1, this.f1226m, 0, null);
                return -1;
            }
        } else {
            z4 = false;
        }
        int i21 = c0363p7.f5314b;
        int i22 = this.f1226m;
        int i23 = this.f1223j;
        if (i22 < i23) {
            c0363p7.I(Math.min(i23 - i22, c0363p7.a()));
        }
        this.i.getClass();
        int i24 = c0363p7.f5314b;
        while (true) {
            int i25 = c0363p7.f5315c - 16;
            u uVar2 = this.f1218d;
            if (i24 <= i25) {
                c0363p7.H(i24);
                if (AbstractC0055b.d(c0363p7, this.i, this.f1224k, uVar2)) {
                    c0363p7.H(i24);
                    j6 = uVar2.f817a;
                    break;
                }
                i24++;
            } else {
                if (z4) {
                    while (true) {
                        int i26 = c0363p7.f5315c;
                        if (i24 > i26 - this.f1223j) {
                            c0363p7.H(i26);
                            break;
                        }
                        c0363p7.H(i24);
                        try {
                            zD = AbstractC0055b.d(c0363p7, this.i, this.f1224k, uVar2);
                        } catch (IndexOutOfBoundsException unused2) {
                            zD = false;
                        }
                        if (c0363p7.f5314b > c0363p7.f5315c) {
                            zD = false;
                        }
                        if (zD) {
                            c0363p7.H(i24);
                            j6 = uVar2.f817a;
                            break;
                        }
                        i24++;
                    }
                } else {
                    c0363p7.H(i24);
                }
                j6 = -1;
            }
        }
        int i27 = c0363p7.f5314b - i21;
        c0363p7.H(i21);
        this.f1220f.a(c0363p7, i27, 0);
        int i28 = i27 + this.f1226m;
        this.f1226m = i28;
        if (j6 != -1) {
            long j11 = this.f1227n * 1000000;
            w wVar6 = this.i;
            int i29 = AbstractC0370w.f5326a;
            this.f1220f.b(j11 / ((long) wVar6.f825e), 1, i28, 0, null);
            this.f1226m = 0;
            this.f1227n = j6;
        }
        if (c0363p7.a() >= 16) {
            return 0;
        }
        int iA = c0363p7.a();
        byte[] bArr6 = c0363p7.f5313a;
        System.arraycopy(bArr6, c0363p7.f5314b, bArr6, 0, iA);
        c0363p7.H(0);
        c0363p7.G(iA);
        return 0;
    }

    @Override // F0.q
    public final boolean e(r rVar) {
        C0066m c0066m = (C0066m) rVar;
        C0155F c0155fA = new A(0).a(c0066m, h.f2122d);
        if (c0155fA != null) {
            int length = c0155fA.f3211l.length;
        }
        C0363p c0363p = new C0363p(4);
        c0066m.t(c0363p.f5313a, 0, 4, false);
        return c0363p.x() == 1716281667;
    }

    @Override // F0.q
    public final void j(s sVar) {
        this.f1219e = sVar;
        this.f1220f = sVar.k(0, 1);
        sVar.j();
    }

    @Override // F0.q
    public final void release() {
    }
}
