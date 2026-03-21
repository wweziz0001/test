package F0;

import a0.AbstractC0156G;
import a0.C0189o;
import d0.AbstractC0360m;
import d0.C0363p;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class G implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K f698g;

    public G(int i, String str, int i5) {
        this.f692a = i;
        this.f693b = i5;
        this.f694c = str;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        if (j5 == 0 || this.f696e == 1) {
            this.f696e = 1;
            this.f695d = 0;
        }
    }

    @Override // F0.q
    public final int d(r rVar, u uVar) {
        int i = this.f696e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        K k4 = this.f698g;
        k4.getClass();
        int iD = k4.d(rVar, 1024, true);
        if (iD == -1) {
            this.f696e = 2;
            this.f698g.b(0L, 1, this.f695d, 0, null);
            this.f695d = 0;
        } else {
            this.f695d += iD;
        }
        return 0;
    }

    @Override // F0.q
    public final boolean e(r rVar) {
        int i = this.f693b;
        int i5 = this.f692a;
        AbstractC0360m.h((i5 == -1 || i == -1) ? false : true);
        C0363p c0363p = new C0363p(i);
        ((C0066m) rVar).t(c0363p.f5313a, 0, i, false);
        return c0363p.B() == i5;
    }

    @Override // F0.q
    public final void j(s sVar) {
        this.f697f = sVar;
        K k4 = sVar.k(1024, 4);
        this.f698g = k4;
        C0189o c0189o = new C0189o();
        c0189o.f3387m = AbstractC0156G.m(this.f694c);
        B0.k(c0189o, k4);
        this.f697f.j();
        this.f697f.d(new H());
        this.f696e = 1;
    }

    @Override // F0.q
    public final void release() {
    }
}
