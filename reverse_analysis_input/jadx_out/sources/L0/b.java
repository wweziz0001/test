package L0;

import F0.C0066m;
import F0.o;
import F0.q;
import F0.r;
import F0.s;
import d0.C0363p;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0363p f1461a = new C0363p(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0363p f1462b = new C0363p(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f1463c = new C0363p(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0363p f1464d = new C0363p();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f1465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f1466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1468h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f1474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f1475p;

    public b() {
        c cVar = new c(new o());
        cVar.f1476b = -9223372036854775807L;
        cVar.f1477c = new long[0];
        cVar.f1478d = new long[0];
        this.f1465e = cVar;
        this.f1467g = 1;
    }

    public final C0363p a(C0066m c0066m) throws EOFException, InterruptedIOException {
        int i = this.f1471l;
        C0363p c0363p = this.f1464d;
        byte[] bArr = c0363p.f5313a;
        if (i > bArr.length) {
            c0363p.F(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            c0363p.H(0);
        }
        c0363p.G(this.f1471l);
        c0066m.l(c0363p.f5313a, 0, this.f1471l, false);
        return c0363p;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        if (j5 == 0) {
            this.f1467g = 1;
            this.f1468h = false;
        } else {
            this.f1467g = 3;
        }
        this.f1469j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x037b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0395 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0276  */
    @Override // F0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(F0.r r32, F0.u r33) throws a0.C0157H, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.b.d(F0.r, F0.u):int");
    }

    @Override // F0.q
    public final boolean e(r rVar) throws EOFException, InterruptedIOException {
        C0363p c0363p = this.f1461a;
        C0066m c0066m = (C0066m) rVar;
        c0066m.t(c0363p.f5313a, 0, 3, false);
        c0363p.H(0);
        if (c0363p.y() != 4607062) {
            return false;
        }
        c0066m.t(c0363p.f5313a, 0, 2, false);
        c0363p.H(0);
        if ((c0363p.B() & 250) != 0) {
            return false;
        }
        c0066m.t(c0363p.f5313a, 0, 4, false);
        c0363p.H(0);
        int i = c0363p.i();
        c0066m.f801q = 0;
        c0066m.a(i, false);
        c0066m.t(c0363p.f5313a, 0, 4, false);
        c0363p.H(0);
        return c0363p.i() == 0;
    }

    @Override // F0.q
    public final void j(s sVar) {
        this.f1466f = sVar;
    }

    @Override // F0.q
    public final void release() {
    }
}
