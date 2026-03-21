package l1;

import F0.K;
import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0360m;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class t implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0363p f8135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F0.C f8136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public K f8139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8141g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8142h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8146m;

    public t(String str, int i) {
        C0363p c0363p = new C0363p(4);
        this.f8135a = c0363p;
        c0363p.f5313a[0] = -1;
        this.f8136b = new F0.C();
        this.f8146m = -9223372036854775807L;
        this.f8137c = str;
        this.f8138d = i;
    }

    @Override // l1.h
    public final void a() {
        this.f8141g = 0;
        this.f8142h = 0;
        this.f8143j = false;
        this.f8146m = -9223372036854775807L;
    }

    @Override // l1.h
    public final void b(C0363p c0363p) {
        AbstractC0360m.i(this.f8139e);
        while (c0363p.a() > 0) {
            int i = this.f8141g;
            C0363p c0363p2 = this.f8135a;
            if (i == 0) {
                byte[] bArr = c0363p.f5313a;
                int i5 = c0363p.f5314b;
                int i6 = c0363p.f5315c;
                while (true) {
                    if (i5 >= i6) {
                        c0363p.H(i6);
                        break;
                    }
                    byte b4 = bArr[i5];
                    boolean z4 = (b4 & 255) == 255;
                    boolean z5 = this.f8143j && (b4 & 224) == 224;
                    this.f8143j = z4;
                    if (z5) {
                        c0363p.H(i5 + 1);
                        this.f8143j = false;
                        c0363p2.f5313a[1] = bArr[i5];
                        this.f8142h = 2;
                        this.f8141g = 1;
                        break;
                    }
                    i5++;
                }
            } else if (i == 1) {
                int iMin = Math.min(c0363p.a(), 4 - this.f8142h);
                c0363p.g(c0363p2.f5313a, this.f8142h, iMin);
                int i7 = this.f8142h + iMin;
                this.f8142h = i7;
                if (i7 >= 4) {
                    c0363p2.H(0);
                    int i8 = c0363p2.i();
                    F0.C c5 = this.f8136b;
                    if (c5.a(i8)) {
                        this.f8145l = c5.f681b;
                        if (!this.i) {
                            this.f8144k = (((long) c5.f685f) * 1000000) / ((long) c5.f682c);
                            C0189o c0189o = new C0189o();
                            c0189o.f3376a = this.f8140f;
                            c0189o.f3387m = AbstractC0156G.m((String) c5.f686g);
                            c0189o.f3388n = 4096;
                            c0189o.f3366B = c5.f683d;
                            c0189o.f3367C = c5.f682c;
                            c0189o.f3379d = this.f8137c;
                            c0189o.f3381f = this.f8138d;
                            this.f8139e.c(new C0190p(c0189o));
                            this.i = true;
                        }
                        c0363p2.H(0);
                        this.f8139e.a(c0363p2, 4, 0);
                        this.f8141g = 2;
                    } else {
                        this.f8142h = 0;
                        this.f8141g = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c0363p.a(), this.f8145l - this.f8142h);
                this.f8139e.a(c0363p, iMin2, 0);
                int i9 = this.f8142h + iMin2;
                this.f8142h = i9;
                if (i9 >= this.f8145l) {
                    AbstractC0360m.h(this.f8146m != -9223372036854775807L);
                    this.f8139e.b(this.f8146m, 1, this.f8145l, 0, null);
                    this.f8146m += this.f8144k;
                    this.f8142h = 0;
                    this.f8141g = 0;
                }
            }
        }
    }

    @Override // l1.h
    public final void d(F0.s sVar, E e5) {
        e5.a();
        e5.c();
        this.f8140f = (String) e5.f7921e;
        e5.c();
        this.f8139e = sVar.k(e5.f7919c, 1);
    }

    @Override // l1.h
    public final void e(long j5, int i) {
        this.f8146m = j5;
    }

    @Override // l1.h
    public final void c(boolean z4) {
    }
}
