package H0;

import F0.C0066m;
import F0.q;
import F0.r;
import F0.s;
import a0.C0200z;
import d0.AbstractC0370w;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0363p f919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D0.e f920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0200z f922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f926h;
    public e[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f933p;

    public b(int i, C0200z c0200z) {
        this.f922d = c0200z;
        this.f921c = (i & 1) == 0;
        this.f919a = new C0363p(12);
        this.f920b = new D0.e();
        this.f924f = new A0.b(15);
        this.i = new e[0];
        this.f930m = -1L;
        this.f931n = -1L;
        this.f929l = -1;
        this.f926h = -9223372036854775807L;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        this.f927j = -1L;
        this.f928k = null;
        for (e eVar : this.i) {
            if (eVar.f950j == 0) {
                eVar.f949h = 0;
            } else {
                eVar.f949h = eVar.f953m[AbstractC0370w.e(eVar.f952l, j5, true)];
            }
        }
        if (j5 != 0) {
            this.f923e = 6;
        } else if (this.i.length == 0) {
            this.f923e = 0;
        } else {
            this.f923e = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    @Override // F0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(F0.r r23, F0.u r24) throws a0.C0157H, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.b.d(F0.r, F0.u):int");
    }

    @Override // F0.q
    public final boolean e(r rVar) {
        C0363p c0363p = this.f919a;
        ((C0066m) rVar).t(c0363p.f5313a, 0, 12, false);
        c0363p.H(0);
        if (c0363p.k() != 1179011410) {
            return false;
        }
        c0363p.I(4);
        return c0363p.k() == 541677121;
    }

    @Override // F0.q
    public final void j(s sVar) {
        this.f923e = 0;
        if (this.f921c) {
            sVar = new Z1.s(sVar, this.f922d);
        }
        this.f924f = sVar;
        this.f927j = -1L;
    }

    @Override // F0.q
    public final void release() {
    }
}
