package l1;

import F0.C0066m;
import d0.C0363p;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0571c implements F0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0570b f7938a = new C0570b(0, null, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0363p f7939b = new C0363p(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7940c;

    @Override // F0.q
    public final void b(long j5, long j6) {
        this.f7940c = false;
        this.f7938a.a();
    }

    @Override // F0.q
    public final int d(F0.r rVar, F0.u uVar) throws EOFException, InterruptedIOException {
        C0363p c0363p = this.f7939b;
        int i = ((C0066m) rVar).read(c0363p.f5313a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        c0363p.H(0);
        c0363p.G(i);
        boolean z4 = this.f7940c;
        C0570b c0570b = this.f7938a;
        if (!z4) {
            c0570b.f7937n = 0L;
            this.f7940c = true;
        }
        c0570b.b(c0363p);
        return 0;
    }

    @Override // F0.q
    public final boolean e(F0.r rVar) throws EOFException, InterruptedIOException {
        C0066m c0066m;
        int i;
        C0363p c0363p = new C0363p(10);
        int i5 = 0;
        while (true) {
            c0066m = (C0066m) rVar;
            c0066m.t(c0363p.f5313a, 0, 10, false);
            c0363p.H(0);
            if (c0363p.y() != 4801587) {
                break;
            }
            c0363p.I(3);
            int iU = c0363p.u();
            i5 += iU + 10;
            c0066m.a(iU, false);
        }
        c0066m.f801q = 0;
        c0066m.a(i5, false);
        int i6 = 0;
        int i7 = i5;
        while (true) {
            int i8 = 7;
            c0066m.t(c0363p.f5313a, 0, 7, false);
            c0363p.H(0);
            int iB = c0363p.B();
            if (iB == 44096 || iB == 44097) {
                i6++;
                if (i6 >= 4) {
                    return true;
                }
                byte[] bArr = c0363p.f5313a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i9 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i9 == 65535) {
                        i9 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i8 = 4;
                    }
                    if (iB == 44097) {
                        i8 += 2;
                    }
                    i = i9 + i8;
                }
                if (i == -1) {
                    return false;
                }
                c0066m.a(i - 7, false);
            } else {
                c0066m.f801q = 0;
                i7++;
                if (i7 - i5 >= 8192) {
                    return false;
                }
                c0066m.a(i7, false);
                i6 = 0;
            }
        }
    }

    @Override // F0.q
    public final void j(F0.s sVar) {
        this.f7938a.d(sVar, new E(0, 1));
        sVar.j();
        sVar.d(new F0.v(-9223372036854775807L));
    }

    @Override // F0.q
    public final void release() {
    }
}
