package l1;

import F0.C0066m;
import F0.M;
import d0.C0363p;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0572d implements F0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0573e f7942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f7943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0363p f7944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M f7945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F0.s f7946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7948h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7951l;

    public C0572d(int i) {
        this.f7941a = (i & 2) != 0 ? i | 1 : i;
        this.f7942b = new C0573e(0, null, true);
        this.f7943c = new C0363p(2048);
        this.i = -1;
        this.f7948h = -1L;
        C0363p c0363p = new C0363p(10);
        this.f7944d = c0363p;
        byte[] bArr = c0363p.f5313a;
        this.f7945e = new M(bArr.length, bArr);
    }

    public final int a(C0066m c0066m) throws EOFException, InterruptedIOException {
        int i = 0;
        while (true) {
            C0363p c0363p = this.f7944d;
            c0066m.t(c0363p.f5313a, 0, 10, false);
            c0363p.H(0);
            if (c0363p.y() != 4801587) {
                break;
            }
            c0363p.I(3);
            int iU = c0363p.u();
            i += iU + 10;
            c0066m.a(iU, false);
        }
        c0066m.f801q = 0;
        c0066m.a(i, false);
        if (this.f7948h == -1) {
            this.f7948h = i;
        }
        return i;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        this.f7950k = false;
        this.f7942b.a();
        this.f7947g = j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // F0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(F0.r r19, F0.u r20) throws a0.C0157H, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C0572d.d(F0.r, F0.u):int");
    }

    @Override // F0.q
    public final boolean e(F0.r rVar) throws EOFException, InterruptedIOException {
        C0066m c0066m = (C0066m) rVar;
        int iA = a(c0066m);
        int i = iA;
        int i5 = 0;
        int i6 = 0;
        do {
            C0363p c0363p = this.f7944d;
            c0066m.t(c0363p.f5313a, 0, 2, false);
            c0363p.H(0);
            if ((c0363p.B() & 65526) == 65520) {
                i5++;
                if (i5 >= 4 && i6 > 188) {
                    return true;
                }
                c0066m.t(c0363p.f5313a, 0, 4, false);
                M m4 = this.f7945e;
                m4.r(14);
                int i7 = m4.i(13);
                if (i7 <= 6) {
                    i++;
                    c0066m.f801q = 0;
                    c0066m.a(i, false);
                } else {
                    c0066m.a(i7 - 6, false);
                    i6 += i7;
                }
            } else {
                i++;
                c0066m.f801q = 0;
                c0066m.a(i, false);
            }
            i5 = 0;
            i6 = 0;
        } while (i - iA < 8192);
        return false;
    }

    @Override // F0.q
    public final void j(F0.s sVar) {
        this.f7946f = sVar;
        this.f7942b.d(sVar, new E(0, 1));
        sVar.j();
    }

    @Override // F0.q
    public final void release() {
    }
}
