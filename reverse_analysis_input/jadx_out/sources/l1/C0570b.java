package l1;

import F0.AbstractC0055b;
import F0.C0056c;
import F0.K;
import F0.M;
import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0360m;
import d0.C0363p;
import java.util.Objects;

/* JADX INFO: renamed from: l1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0570b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f7926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f7927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K f7931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7932h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0190p f7935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f7937n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0570b() {
        this(0, null, 0);
        this.f7925a = 0;
    }

    @Override // l1.h
    public final void a() {
        switch (this.f7925a) {
            case 0:
                this.f7932h = 0;
                this.i = 0;
                this.f7933j = false;
                this.f7937n = -9223372036854775807L;
                break;
            default:
                this.f7932h = 0;
                this.i = 0;
                this.f7933j = false;
                this.f7937n = -9223372036854775807L;
                break;
        }
    }

    @Override // l1.h
    public final void b(C0363p c0363p) {
        switch (this.f7925a) {
            case 0:
                AbstractC0360m.i(this.f7931g);
                while (c0363p.a() > 0) {
                    int i = this.f7932h;
                    C0363p c0363p2 = this.f7927c;
                    if (i == 0) {
                        while (true) {
                            if (c0363p.a() <= 0) {
                            }
                            if (this.f7933j) {
                                int iV = c0363p.v();
                                if (iV == 119) {
                                    this.f7933j = false;
                                    this.f7932h = 1;
                                    byte[] bArr = c0363p2.f5313a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.i = 2;
                                } else {
                                    this.f7933j = iV == 11;
                                }
                            } else {
                                this.f7933j = c0363p.v() == 11;
                            }
                            break;
                        }
                    } else if (i == 1) {
                        byte[] bArr2 = c0363p2.f5313a;
                        int iMin = Math.min(c0363p.a(), 128 - this.i);
                        c0363p.g(bArr2, this.i, iMin);
                        int i5 = this.i + iMin;
                        this.i = i5;
                        if (i5 == 128) {
                            M m4 = this.f7926b;
                            m4.r(0);
                            C0056c c0056cO = AbstractC0055b.o(m4);
                            C0190p c0190p = this.f7935l;
                            int i6 = c0056cO.f743b;
                            int i7 = c0056cO.f744c;
                            String str = c0056cO.f742a;
                            if (c0190p == null || i7 != c0190p.f3402C || i6 != c0190p.f3403D || !Objects.equals(str, c0190p.f3424n)) {
                                C0189o c0189o = new C0189o();
                                c0189o.f3376a = this.f7930f;
                                c0189o.f3387m = AbstractC0156G.m(str);
                                c0189o.f3366B = i7;
                                c0189o.f3367C = i6;
                                c0189o.f3379d = this.f7928d;
                                c0189o.f3381f = this.f7929e;
                                int i8 = c0056cO.f747f;
                                c0189o.i = i8;
                                if ("audio/ac3".equals(str)) {
                                    c0189o.f3383h = i8;
                                }
                                C0190p c0190p2 = new C0190p(c0189o);
                                this.f7935l = c0190p2;
                                this.f7931g.c(c0190p2);
                            }
                            this.f7936m = c0056cO.f745d;
                            this.f7934k = (((long) c0056cO.f746e) * 1000000) / ((long) this.f7935l.f3403D);
                            c0363p2.H(0);
                            this.f7931g.a(c0363p2, 128, 0);
                            this.f7932h = 2;
                        }
                    } else if (i == 2) {
                        int iMin2 = Math.min(c0363p.a(), this.f7936m - this.i);
                        this.f7931g.a(c0363p, iMin2, 0);
                        int i9 = this.i + iMin2;
                        this.i = i9;
                        if (i9 == this.f7936m) {
                            AbstractC0360m.h(this.f7937n != -9223372036854775807L);
                            this.f7931g.b(this.f7937n, 1, this.f7936m, 0, null);
                            this.f7937n += this.f7934k;
                            this.f7932h = 0;
                        }
                    }
                }
                break;
            default:
                AbstractC0360m.i(this.f7931g);
                while (c0363p.a() > 0) {
                    int i10 = this.f7932h;
                    C0363p c0363p3 = this.f7927c;
                    if (i10 == 0) {
                        while (c0363p.a() > 0) {
                            if (this.f7933j) {
                                int iV2 = c0363p.v();
                                this.f7933j = iV2 == 172;
                                if (iV2 == 64 || iV2 == 65) {
                                    boolean z4 = iV2 == 65;
                                    this.f7932h = 1;
                                    byte[] bArr3 = c0363p3.f5313a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z4 ? 65 : 64);
                                    this.i = 2;
                                }
                            } else {
                                this.f7933j = c0363p.v() == 172;
                            }
                        }
                    } else if (i10 == 1) {
                        byte[] bArr4 = c0363p3.f5313a;
                        int iMin3 = Math.min(c0363p.a(), 16 - this.i);
                        c0363p.g(bArr4, this.i, iMin3);
                        int i11 = this.i + iMin3;
                        this.i = i11;
                        if (i11 == 16) {
                            M m5 = this.f7926b;
                            m5.r(0);
                            D0.e eVarP = AbstractC0055b.p(m5);
                            C0190p c0190p3 = this.f7935l;
                            int i12 = eVarP.f397a;
                            if (c0190p3 == null || 2 != c0190p3.f3402C || i12 != c0190p3.f3403D || !"audio/ac4".equals(c0190p3.f3424n)) {
                                C0189o c0189o2 = new C0189o();
                                c0189o2.f3376a = this.f7930f;
                                c0189o2.f3387m = AbstractC0156G.m("audio/ac4");
                                c0189o2.f3366B = 2;
                                c0189o2.f3367C = i12;
                                c0189o2.f3379d = this.f7928d;
                                c0189o2.f3381f = this.f7929e;
                                C0190p c0190p4 = new C0190p(c0189o2);
                                this.f7935l = c0190p4;
                                this.f7931g.c(c0190p4);
                            }
                            this.f7936m = eVarP.f398b;
                            this.f7934k = (((long) eVarP.f399c) * 1000000) / ((long) this.f7935l.f3403D);
                            c0363p3.H(0);
                            this.f7931g.a(c0363p3, 16, 0);
                            this.f7932h = 2;
                        }
                    } else if (i10 == 2) {
                        int iMin4 = Math.min(c0363p.a(), this.f7936m - this.i);
                        this.f7931g.a(c0363p, iMin4, 0);
                        int i13 = this.i + iMin4;
                        this.i = i13;
                        if (i13 == this.f7936m) {
                            AbstractC0360m.h(this.f7937n != -9223372036854775807L);
                            this.f7931g.b(this.f7937n, 1, this.f7936m, 0, null);
                            this.f7937n += this.f7934k;
                            this.f7932h = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // l1.h
    public final void c(boolean z4) {
        int i = this.f7925a;
    }

    @Override // l1.h
    public final void d(F0.s sVar, E e5) {
        switch (this.f7925a) {
            case 0:
                e5.a();
                e5.c();
                this.f7930f = (String) e5.f7921e;
                e5.c();
                this.f7931g = sVar.k(e5.f7919c, 1);
                break;
            default:
                e5.a();
                e5.c();
                this.f7930f = (String) e5.f7921e;
                e5.c();
                this.f7931g = sVar.k(e5.f7919c, 1);
                break;
        }
    }

    @Override // l1.h
    public final void e(long j5, int i) {
        switch (this.f7925a) {
            case 0:
                this.f7937n = j5;
                break;
            default:
                this.f7937n = j5;
                break;
        }
    }

    public C0570b(int i, String str, int i5) {
        this.f7925a = i5;
        switch (i5) {
            case 1:
                M m4 = new M(16, new byte[16]);
                this.f7926b = m4;
                this.f7927c = new C0363p(m4.f711b);
                this.f7932h = 0;
                this.i = 0;
                this.f7933j = false;
                this.f7937n = -9223372036854775807L;
                this.f7928d = str;
                this.f7929e = i;
                break;
            default:
                M m5 = new M(128, new byte[128]);
                this.f7926b = m5;
                this.f7927c = new C0363p(m5.f711b);
                this.f7932h = 0;
                this.f7937n = -9223372036854775807L;
                this.f7928d = str;
                this.f7929e = i;
                break;
        }
    }

    private final void f(boolean z4) {
    }

    private final void g(boolean z4) {
    }
}
