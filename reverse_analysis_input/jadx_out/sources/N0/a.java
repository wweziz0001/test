package N0;

import F0.C0066m;
import F0.q;
import F0.r;
import F0.s;
import F0.v;
import Z0.p;
import d0.C0363p;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f1560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1563e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public U0.a f1565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0066m f1566h;
    public c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f1567j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0363p f1559a = new C0363p(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1564f = -1;

    public final void a() {
        s sVar = this.f1560b;
        sVar.getClass();
        sVar.j();
        this.f1560b.d(new v(-9223372036854775807L));
        this.f1561c = 6;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        if (j5 == 0) {
            this.f1561c = 0;
            this.f1567j = null;
        } else if (this.f1561c == 5) {
            p pVar = this.f1567j;
            pVar.getClass();
            pVar.b(j5, j6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    @Override // F0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(F0.r r27, F0.u r28) throws a0.C0157H, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.a.d(F0.r, F0.u):int");
    }

    @Override // F0.q
    public final boolean e(r rVar) throws EOFException, InterruptedIOException {
        C0066m c0066m = (C0066m) rVar;
        C0363p c0363p = this.f1559a;
        c0363p.E(2);
        c0066m.t(c0363p.f5313a, 0, 2, false);
        if (c0363p.B() != 65496) {
            return false;
        }
        c0363p.E(2);
        c0066m.t(c0363p.f5313a, 0, 2, false);
        int iB = c0363p.B();
        this.f1562d = iB;
        if (iB == 65504) {
            c0363p.E(2);
            c0066m.t(c0363p.f5313a, 0, 2, false);
            c0066m.a(c0363p.B() - 2, false);
            c0363p.E(2);
            c0066m.t(c0363p.f5313a, 0, 2, false);
            this.f1562d = c0363p.B();
        }
        if (this.f1562d != 65505) {
            return false;
        }
        c0066m.a(2, false);
        c0363p.E(6);
        c0066m.t(c0363p.f5313a, 0, 6, false);
        return c0363p.x() == 1165519206 && c0363p.B() == 0;
    }

    @Override // F0.q
    public final void j(s sVar) {
        this.f1560b = sVar;
    }

    @Override // F0.q
    public final void release() {
        p pVar = this.f1567j;
        if (pVar != null) {
            pVar.getClass();
        }
    }
}
