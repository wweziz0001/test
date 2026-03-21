package Y0;

import A.j;
import B0.l;
import F0.A;
import F0.AbstractC0055b;
import F0.C;
import F0.C0065l;
import F0.C0066m;
import F0.E;
import F0.K;
import F0.o;
import F0.q;
import F0.r;
import F0.s;
import F0.y;
import T0.n;
import a0.C0155F;
import a0.InterfaceC0154E;
import d0.AbstractC0370w;
import d0.C0363p;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l f2691v = new l(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f2694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C f2695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f2696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A f2697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f2698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s f2699h;
    public K i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public K f2700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0155F f2702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f2704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f2708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2709s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2710t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f2711u;

    public d(int i) {
        this(-9223372036854775807L, i);
    }

    public static long a(C0155F c0155f) {
        if (c0155f == null) {
            return -9223372036854775807L;
        }
        int iG = c0155f.g();
        for (int i = 0; i < iG; i++) {
            InterfaceC0154E interfaceC0154EF = c0155f.f(i);
            if (interfaceC0154EF instanceof n) {
                n nVar = (n) interfaceC0154EF;
                if (nVar.f2124l.equals("TLEN")) {
                    return AbstractC0370w.M(Long.parseLong((String) nVar.f2137n.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        this.f2701k = 0;
        this.f2703m = -9223372036854775807L;
        this.f2704n = 0L;
        this.f2707q = 0;
        this.f2711u = j6;
        f fVar = this.f2708r;
        if (fVar instanceof b) {
            j jVar = ((b) fVar).f2687c.f678b;
            int i = jVar.f26l;
            if (i != 0 && j6 - jVar.i(i - 1) < 100000) {
                return;
            }
            this.f2710t = true;
            this.f2700j = this.f2698g;
        }
    }

    public final void c() {
        E e5 = this.f2708r;
        if ((e5 instanceof a) && ((C0065l) e5).c()) {
            long j5 = this.f2706p;
            if (j5 == -1 || j5 == this.f2708r.f()) {
                return;
            }
            a aVar = (a) this.f2708r;
            long j6 = this.f2706p;
            int i = aVar.f2682j;
            this.f2708r = new a(j6, aVar.f2681h, aVar.i, i, aVar.f2683k);
            s sVar = this.f2699h;
            sVar.getClass();
            sVar.d(this.f2708r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // F0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(F0.r r47, F0.u r48) throws java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.d.d(F0.r, F0.u):int");
    }

    @Override // F0.q
    public final boolean e(r rVar) {
        return g((C0066m) rVar, true);
    }

    public final boolean f(C0066m c0066m) {
        f fVar = this.f2708r;
        if (fVar != null) {
            long jF = fVar.f();
            if (jF != -1 && c0066m.w() > jF - 4) {
                return true;
            }
        }
        try {
            return !c0066m.t(this.f2694c.f5313a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean g(C0066m c0066m, boolean z4) throws EOFException, InterruptedIOException {
        int iW;
        int i;
        int iJ;
        int i5 = z4 ? 32768 : 131072;
        c0066m.f801q = 0;
        if (c0066m.f799o == 0) {
            C0155F c0155fA = this.f2697f.a(c0066m, (this.f2692a & 8) == 0 ? null : f2691v);
            this.f2702l = c0155fA;
            if (c0155fA != null) {
                this.f2696e.b(c0155fA);
            }
            iW = (int) c0066m.w();
            if (!z4) {
                c0066m.f(iW);
            }
            i = 0;
        } else {
            iW = 0;
            i = 0;
        }
        int i6 = i;
        int i7 = i6;
        while (true) {
            if (!f(c0066m)) {
                C0363p c0363p = this.f2694c;
                c0363p.H(0);
                int i8 = c0363p.i();
                if ((i == 0 || ((-128000) & i8) == (((long) i) & (-128000))) && (iJ = AbstractC0055b.j(i8)) != -1) {
                    i6++;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            break;
                        }
                    } else {
                        this.f2695d.a(i8);
                        i = i8;
                    }
                    c0066m.a(iJ - 4, false);
                } else {
                    int i9 = i7 + 1;
                    if (i7 == i5) {
                        if (z4) {
                            return false;
                        }
                        c();
                        throw new EOFException();
                    }
                    if (z4) {
                        c0066m.f801q = 0;
                        c0066m.a(iW + i9, false);
                    } else {
                        c0066m.f(1);
                    }
                    i6 = 0;
                    i7 = i9;
                    i = 0;
                }
            } else if (i6 <= 0) {
                c();
                throw new EOFException();
            }
        }
        if (z4) {
            c0066m.f(iW + i7);
        } else {
            c0066m.f801q = 0;
        }
        this.f2701k = i;
        return true;
    }

    @Override // F0.q
    public final void j(s sVar) {
        this.f2699h = sVar;
        K k4 = sVar.k(0, 1);
        this.i = k4;
        this.f2700j = k4;
        this.f2699h.j();
    }

    public d(long j5, int i) {
        this.f2692a = (i & 2) != 0 ? i | 1 : i;
        this.f2693b = j5;
        this.f2694c = new C0363p(10);
        this.f2695d = new C();
        this.f2696e = new y();
        this.f2703m = -9223372036854775807L;
        this.f2697f = new A(0);
        o oVar = new o();
        this.f2698g = oVar;
        this.f2700j = oVar;
        this.f2706p = -1L;
    }

    @Override // F0.q
    public final void release() {
    }
}
