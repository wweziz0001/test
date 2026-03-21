package a1;

import F0.AbstractC0055b;
import F0.w;
import Z1.l;
import a0.C0190p;
import d0.C0363p;
import java.util.Arrays;

/* JADX INFO: renamed from: a1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0203c extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w f3483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Z0.b f3484o;

    @Override // a1.i
    public final long b(C0363p c0363p) {
        byte[] bArr = c0363p.f5313a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c0363p.I(4);
            c0363p.C();
        }
        int iV = AbstractC0055b.v(i, c0363p);
        c0363p.H(0);
        return iV;
    }

    @Override // a1.i
    public final boolean c(C0363p c0363p, long j5, l lVar) {
        byte[] bArr = c0363p.f5313a;
        w wVar = this.f3483n;
        if (wVar == null) {
            w wVar2 = new w(17, bArr);
            this.f3483n = wVar2;
            lVar.f3020l = wVar2.c(Arrays.copyOfRange(bArr, 9, c0363p.f5315c), null);
            return true;
        }
        byte b4 = bArr[0];
        if ((b4 & 127) != 3) {
            if (b4 != -1) {
                return true;
            }
            Z0.b bVar = this.f3484o;
            if (bVar != null) {
                bVar.f2828l = j5;
                lVar.f3021m = bVar;
            }
            ((C0190p) lVar.f3020l).getClass();
            return false;
        }
        l lVarW = AbstractC0055b.w(c0363p);
        w wVar3 = new w(wVar.f821a, wVar.f822b, wVar.f823c, wVar.f824d, wVar.f825e, wVar.f827g, wVar.f828h, wVar.f829j, lVarW, wVar.f831l);
        this.f3483n = wVar3;
        Z0.b bVar2 = new Z0.b();
        bVar2.f2830n = wVar3;
        bVar2.f2831o = lVarW;
        bVar2.f2828l = -1L;
        bVar2.f2829m = -1L;
        this.f3484o = bVar2;
        return true;
    }

    @Override // a1.i
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f3483n = null;
            this.f3484o = null;
        }
    }
}
