package a1;

import F0.AbstractC0055b;
import Z1.l;
import a0.AbstractC0156G;
import a0.C0155F;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0360m;
import d0.C0363p;
import java.util.ArrayList;
import java.util.Arrays;
import m2.I;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f3500o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f3501p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3502n;

    public static boolean e(C0363p c0363p, byte[] bArr) {
        if (c0363p.a() < bArr.length) {
            return false;
        }
        int i = c0363p.f5314b;
        byte[] bArr2 = new byte[bArr.length];
        c0363p.g(bArr2, 0, bArr.length);
        c0363p.H(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // a1.i
    public final long b(C0363p c0363p) {
        byte[] bArr = c0363p.f5313a;
        return (((long) this.i) * AbstractC0055b.l(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // a1.i
    public final boolean c(C0363p c0363p, long j5, l lVar) {
        if (e(c0363p, f3500o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c0363p.f5313a, c0363p.f5315c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListC = AbstractC0055b.c(bArrCopyOf);
            if (((C0190p) lVar.f3020l) != null) {
                return true;
            }
            C0189o c0189o = new C0189o();
            c0189o.f3387m = AbstractC0156G.m("audio/opus");
            c0189o.f3366B = i;
            c0189o.f3367C = 48000;
            c0189o.f3390p = arrayListC;
            lVar.f3020l = new C0190p(c0189o);
            return true;
        }
        if (!e(c0363p, f3501p)) {
            AbstractC0360m.i((C0190p) lVar.f3020l);
            return false;
        }
        AbstractC0360m.i((C0190p) lVar.f3020l);
        if (this.f3502n) {
            return true;
        }
        this.f3502n = true;
        c0363p.I(8);
        C0155F c0155fU = AbstractC0055b.u(I.q((String[]) AbstractC0055b.x(c0363p, false, false).f190l));
        if (c0155fU == null) {
            return true;
        }
        C0189o c0189oA = ((C0190p) lVar.f3020l).a();
        c0189oA.f3385k = c0155fU.e(((C0190p) lVar.f3020l).f3422l);
        lVar.f3020l = new C0190p(c0189oA);
        return true;
    }

    @Override // a1.i
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f3502n = false;
        }
    }
}
