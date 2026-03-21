package l1;

import F0.K;
import a0.AbstractC0156G;
import a0.C0189o;
import d0.AbstractC0360m;
import d0.C0363p;
import java.util.Collections;
import java.util.List;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f7994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f7995g;

    public g(List list) {
        this.f7989a = 0;
        this.f7994f = list;
        this.f7995g = new K[list.size()];
        this.f7991c = -9223372036854775807L;
    }

    @Override // l1.h
    public final void a() {
        switch (this.f7989a) {
            case 0:
                this.f7990b = false;
                this.f7991c = -9223372036854775807L;
                break;
            default:
                this.f7990b = false;
                this.f7991c = -9223372036854775807L;
                break;
        }
    }

    @Override // l1.h
    public final void b(C0363p c0363p) {
        boolean z4;
        boolean z5;
        switch (this.f7989a) {
            case 0:
                if (this.f7990b) {
                    if (this.f7992d == 2) {
                        if (c0363p.a() == 0) {
                            z5 = false;
                        } else {
                            if (c0363p.v() != 32) {
                                this.f7990b = false;
                            }
                            this.f7992d--;
                            z5 = this.f7990b;
                        }
                        if (!z5) {
                        }
                    }
                    if (this.f7992d == 1) {
                        if (c0363p.a() == 0) {
                            z4 = false;
                        } else {
                            if (c0363p.v() != 0) {
                                this.f7990b = false;
                            }
                            this.f7992d--;
                            z4 = this.f7990b;
                        }
                        if (!z4) {
                        }
                    }
                    int i = c0363p.f5314b;
                    int iA = c0363p.a();
                    for (K k4 : (K[]) this.f7995g) {
                        c0363p.H(i);
                        k4.a(c0363p, iA, 0);
                    }
                    this.f7993e += iA;
                }
                break;
            default:
                AbstractC0360m.i((K) this.f7995g);
                if (this.f7990b) {
                    int iA2 = c0363p.a();
                    int i5 = this.f7993e;
                    if (i5 < 10) {
                        int iMin = Math.min(iA2, 10 - i5);
                        byte[] bArr = c0363p.f5313a;
                        int i6 = c0363p.f5314b;
                        C0363p c0363p2 = (C0363p) this.f7994f;
                        System.arraycopy(bArr, i6, c0363p2.f5313a, this.f7993e, iMin);
                        if (this.f7993e + iMin == 10) {
                            c0363p2.H(0);
                            if (73 == c0363p2.v() && 68 == c0363p2.v() && 51 == c0363p2.v()) {
                                c0363p2.I(3);
                                this.f7992d = c0363p2.u() + 10;
                            } else {
                                AbstractC0360m.y("Id3Reader", "Discarding invalid ID3 tag");
                                this.f7990b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f7992d - this.f7993e);
                    ((K) this.f7995g).a(c0363p, iMin2, 0);
                    this.f7993e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // l1.h
    public final void c(boolean z4) {
        int i;
        switch (this.f7989a) {
            case 0:
                if (this.f7990b) {
                    AbstractC0360m.h(this.f7991c != -9223372036854775807L);
                    for (K k4 : (K[]) this.f7995g) {
                        k4.b(this.f7991c, 1, this.f7993e, 0, null);
                    }
                    this.f7990b = false;
                }
                break;
            default:
                AbstractC0360m.i((K) this.f7995g);
                if (this.f7990b && (i = this.f7992d) != 0 && this.f7993e == i) {
                    AbstractC0360m.h(this.f7991c != -9223372036854775807L);
                    ((K) this.f7995g).b(this.f7991c, 1, this.f7992d, 0, null);
                    this.f7990b = false;
                    break;
                }
                break;
        }
    }

    @Override // l1.h
    public final void d(F0.s sVar, E e5) {
        switch (this.f7989a) {
            case 0:
                int i = 0;
                while (true) {
                    K[] kArr = (K[]) this.f7995g;
                    if (i < kArr.length) {
                        D d5 = (D) ((List) this.f7994f).get(i);
                        e5.a();
                        e5.c();
                        K k4 = sVar.k(e5.f7919c, 3);
                        C0189o c0189o = new C0189o();
                        e5.c();
                        c0189o.f3376a = (String) e5.f7921e;
                        c0189o.f3387m = AbstractC0156G.m("application/dvbsubs");
                        c0189o.f3390p = Collections.singletonList(d5.f7916b);
                        c0189o.f3379d = d5.f7915a;
                        B0.k(c0189o, k4);
                        kArr[i] = k4;
                        i++;
                    }
                    break;
                }
                break;
            default:
                e5.a();
                e5.c();
                K k5 = sVar.k(e5.f7919c, 5);
                this.f7995g = k5;
                C0189o c0189o2 = new C0189o();
                e5.c();
                c0189o2.f3376a = (String) e5.f7921e;
                c0189o2.f3387m = AbstractC0156G.m("application/id3");
                B0.k(c0189o2, k5);
                break;
        }
    }

    @Override // l1.h
    public final void e(long j5, int i) {
        switch (this.f7989a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f7990b = true;
                    this.f7991c = j5;
                    this.f7993e = 0;
                    this.f7992d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f7990b = true;
                    this.f7991c = j5;
                    this.f7992d = 0;
                    this.f7993e = 0;
                    break;
                }
                break;
        }
    }

    public g() {
        this.f7989a = 1;
        this.f7994f = new C0363p(10);
        this.f7991c = -9223372036854775807L;
    }
}
