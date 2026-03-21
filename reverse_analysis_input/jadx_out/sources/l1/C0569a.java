package l1;

import F0.AbstractC0055b;
import F0.C0066m;
import d0.C0363p;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0569a implements F0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0570b f7922a = new C0570b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0363p f7923b = new C0363p(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7924c;

    @Override // F0.q
    public final void b(long j5, long j6) {
        this.f7924c = false;
        this.f7922a.a();
    }

    @Override // F0.q
    public final int d(F0.r rVar, F0.u uVar) throws EOFException, InterruptedIOException {
        C0363p c0363p = this.f7923b;
        int i = ((C0066m) rVar).read(c0363p.f5313a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        c0363p.H(0);
        c0363p.G(i);
        boolean z4 = this.f7924c;
        C0570b c0570b = this.f7922a;
        if (!z4) {
            c0570b.f7937n = 0L;
            this.f7924c = true;
        }
        c0570b.b(c0363p);
        return 0;
    }

    @Override // F0.q
    public final boolean e(F0.r rVar) throws EOFException, InterruptedIOException {
        C0066m c0066m;
        int iH;
        C0363p c0363p = new C0363p(10);
        int i = 0;
        while (true) {
            c0066m = (C0066m) rVar;
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
        int i5 = 0;
        int i6 = i;
        while (true) {
            c0066m.t(c0363p.f5313a, 0, 6, false);
            c0363p.H(0);
            if (c0363p.B() != 2935) {
                c0066m.f801q = 0;
                i6++;
                if (i6 - i >= 8192) {
                    return false;
                }
                c0066m.a(i6, false);
                i5 = 0;
            } else {
                i5++;
                if (i5 >= 4) {
                    return true;
                }
                byte[] bArr = c0363p.f5313a;
                if (bArr.length < 6) {
                    iH = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iH = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b4 = bArr[4];
                    iH = AbstractC0055b.h((b4 & 192) >> 6, b4 & 63);
                }
                if (iH == -1) {
                    return false;
                }
                c0066m.a(iH - 6, false);
            }
        }
    }

    @Override // F0.q
    public final void j(F0.s sVar) {
        this.f7922a.d(sVar, new E(0, 1));
        sVar.j();
        sVar.d(new F0.v(-9223372036854775807L));
    }

    @Override // F0.q
    public final void release() {
    }
}
