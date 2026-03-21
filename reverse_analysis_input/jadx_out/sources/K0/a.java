package K0;

import F0.AbstractC0055b;
import F0.C0062i;
import F0.C0066m;
import F0.InterfaceC0063j;
import F0.u;
import F0.w;
import d0.C0363p;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0063j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f1208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f1210n = new u();

    public a(w wVar, int i) {
        this.f1208l = wVar;
        this.f1209m = i;
    }

    public final long a(C0066m c0066m) throws EOFException, InterruptedIOException {
        long j5;
        u uVar;
        w wVar;
        boolean zD;
        int iD;
        while (true) {
            long jW = c0066m.w();
            j5 = c0066m.f798n;
            long j6 = j5 - 6;
            uVar = this.f1210n;
            wVar = this.f1208l;
            if (jW >= j6) {
                break;
            }
            long jW2 = c0066m.w();
            byte[] bArr = new byte[2];
            c0066m.t(bArr, 0, 2, false);
            int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i5 = this.f1209m;
            if (i != i5) {
                c0066m.f801q = 0;
                c0066m.a((int) (jW2 - c0066m.f799o), false);
                zD = false;
            } else {
                C0363p c0363p = new C0363p(16);
                System.arraycopy(bArr, 0, c0363p.f5313a, 0, 2);
                byte[] bArr2 = c0363p.f5313a;
                int i6 = 0;
                for (int i7 = 2; i6 < 14 && (iD = c0066m.d(bArr2, i7 + i6, 14 - i6)) != -1; i7 = 2) {
                    i6 += iD;
                }
                c0363p.G(i6);
                c0066m.f801q = 0;
                c0066m.a((int) (jW2 - c0066m.f799o), false);
                zD = AbstractC0055b.d(c0363p, wVar, i5, uVar);
            }
            if (zD) {
                break;
            }
            c0066m.a(1, false);
        }
        if (c0066m.w() < j5 - 6) {
            return uVar.f817a;
        }
        c0066m.a((int) (j5 - c0066m.w()), false);
        return wVar.f829j;
    }

    @Override // F0.InterfaceC0063j
    public final C0062i e(C0066m c0066m, long j5) throws EOFException, InterruptedIOException {
        long j6 = c0066m.f799o;
        long jA = a(c0066m);
        long jW = c0066m.w();
        c0066m.a(Math.max(6, this.f1208l.f823c), false);
        long jA2 = a(c0066m);
        return (jA > j5 || jA2 <= j5) ? jA2 <= j5 ? new C0062i(-2, jA2, c0066m.w()) : new C0062i(-1, jA, j6) : new C0062i(0, -9223372036854775807L, jW);
    }
}
