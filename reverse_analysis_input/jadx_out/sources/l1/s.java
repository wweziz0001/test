package l1;

import F0.AbstractC0055b;
import F0.C0054a;
import F0.K;
import F0.M;
import a0.AbstractC0156G;
import a0.C0157H;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0360m;
import d0.C0363p;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f8116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f8117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public K f8118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0190p f8120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8121h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f8130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f8132t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8133u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f8134v;

    public s(String str, int i) {
        this.f8114a = str;
        this.f8115b = i;
        C0363p c0363p = new C0363p(1024);
        this.f8116c = c0363p;
        byte[] bArr = c0363p.f5313a;
        this.f8117d = new M(bArr.length, bArr);
        this.f8124l = -9223372036854775807L;
    }

    @Override // l1.h
    public final void a() {
        this.f8121h = 0;
        this.f8124l = -9223372036854775807L;
        this.f8125m = false;
    }

    @Override // l1.h
    public final void b(C0363p c0363p) throws C0157H {
        int i;
        int i5;
        boolean zH;
        AbstractC0360m.i(this.f8118e);
        while (c0363p.a() > 0) {
            int i6 = this.f8121h;
            if (i6 != 0) {
                if (i6 != 1) {
                    C0363p c0363p2 = this.f8116c;
                    M m4 = this.f8117d;
                    if (i6 == 2) {
                        int iV = ((this.f8123k & (-225)) << 8) | c0363p.v();
                        this.f8122j = iV;
                        if (iV > c0363p2.f5313a.length) {
                            c0363p2.E(iV);
                            byte[] bArr = c0363p2.f5313a;
                            m4.getClass();
                            m4.p(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.f8121h = 3;
                    } else {
                        if (i6 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(c0363p.a(), this.f8122j - this.i);
                        c0363p.g(m4.f711b, this.i, iMin);
                        int i7 = this.i + iMin;
                        this.i = i7;
                        if (i7 == this.f8122j) {
                            m4.r(0);
                            if (m4.h()) {
                                if (this.f8125m) {
                                }
                                this.f8121h = 0;
                            } else {
                                this.f8125m = true;
                                int i8 = m4.i(1);
                                int i9 = i8 == 1 ? m4.i(1) : 0;
                                this.f8126n = i9;
                                if (i9 != 0) {
                                    throw C0157H.a(null, null);
                                }
                                if (i8 == 1) {
                                    m4.i((m4.i(2) + 1) * 8);
                                }
                                if (!m4.h()) {
                                    throw C0157H.a(null, null);
                                }
                                this.f8127o = m4.i(6);
                                int i10 = m4.i(4);
                                int i11 = m4.i(3);
                                if (i10 != 0 || i11 != 0) {
                                    throw C0157H.a(null, null);
                                }
                                if (i8 == 0) {
                                    int iG = m4.g();
                                    int iB = m4.b();
                                    C0054a c0054aQ = AbstractC0055b.q(m4, true);
                                    this.f8134v = c0054aQ.f716a;
                                    this.f8131s = c0054aQ.f717b;
                                    this.f8133u = c0054aQ.f718c;
                                    int iB2 = iB - m4.b();
                                    m4.r(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    m4.j(iB2, bArr2);
                                    C0189o c0189o = new C0189o();
                                    c0189o.f3376a = this.f8119f;
                                    c0189o.f3387m = AbstractC0156G.m("audio/mp4a-latm");
                                    c0189o.f3384j = this.f8134v;
                                    c0189o.f3366B = this.f8133u;
                                    c0189o.f3367C = this.f8131s;
                                    c0189o.f3390p = Collections.singletonList(bArr2);
                                    c0189o.f3379d = this.f8114a;
                                    c0189o.f3381f = this.f8115b;
                                    C0190p c0190p = new C0190p(c0189o);
                                    if (!c0190p.equals(this.f8120g)) {
                                        this.f8120g = c0190p;
                                        this.f8132t = 1024000000 / ((long) c0190p.f3403D);
                                        this.f8118e.c(c0190p);
                                    }
                                } else {
                                    int iB3 = m4.b();
                                    C0054a c0054aQ2 = AbstractC0055b.q(m4, true);
                                    this.f8134v = c0054aQ2.f716a;
                                    this.f8131s = c0054aQ2.f717b;
                                    this.f8133u = c0054aQ2.f718c;
                                    m4.u(m4.i((m4.i(2) + 1) * 8) - (iB3 - m4.b()));
                                }
                                int i12 = m4.i(3);
                                this.f8128p = i12;
                                if (i12 == 0) {
                                    m4.u(8);
                                } else if (i12 == 1) {
                                    m4.u(9);
                                } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                                    m4.u(6);
                                } else {
                                    if (i12 != 6 && i12 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    m4.u(1);
                                }
                                boolean zH2 = m4.h();
                                this.f8129q = zH2;
                                this.f8130r = 0L;
                                if (zH2) {
                                    if (i8 == 1) {
                                        this.f8130r = m4.i((m4.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = m4.h();
                                            this.f8130r = (this.f8130r << 8) + ((long) m4.i(8));
                                        } while (zH);
                                    }
                                }
                                if (m4.h()) {
                                    m4.u(8);
                                }
                            }
                            if (this.f8126n != 0) {
                                throw C0157H.a(null, null);
                            }
                            if (this.f8127o != 0) {
                                throw C0157H.a(null, null);
                            }
                            if (this.f8128p != 0) {
                                throw C0157H.a(null, null);
                            }
                            int i13 = 0;
                            do {
                                i = m4.i(8);
                                i13 += i;
                            } while (i == 255);
                            int iG2 = m4.g();
                            if ((iG2 & 7) == 0) {
                                c0363p2.H(iG2 >> 3);
                                i5 = 0;
                            } else {
                                m4.j(i13 * 8, c0363p2.f5313a);
                                i5 = 0;
                                c0363p2.H(0);
                            }
                            this.f8118e.a(c0363p2, i13, i5);
                            AbstractC0360m.h(this.f8124l != -9223372036854775807L);
                            this.f8118e.b(this.f8124l, 1, i13, 0, null);
                            this.f8124l += this.f8132t;
                            if (this.f8129q) {
                                m4.u((int) this.f8130r);
                            }
                            this.f8121h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iV2 = c0363p.v();
                    if ((iV2 & 224) == 224) {
                        this.f8123k = iV2;
                        this.f8121h = 2;
                    } else if (iV2 != 86) {
                        this.f8121h = 0;
                    }
                }
            } else if (c0363p.v() == 86) {
                this.f8121h = 1;
            }
        }
    }

    @Override // l1.h
    public final void d(F0.s sVar, E e5) {
        e5.a();
        e5.c();
        this.f8118e = sVar.k(e5.f7919c, 1);
        e5.c();
        this.f8119f = (String) e5.f7921e;
    }

    @Override // l1.h
    public final void e(long j5, int i) {
        this.f8124l = j5;
    }

    @Override // l1.h
    public final void c(boolean z4) {
    }
}
