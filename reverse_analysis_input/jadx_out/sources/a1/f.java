package a1;

import F0.C0066m;
import a0.C0157H;
import d0.C0363p;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f3498f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0363p f3499g = new C0363p(255);

    public final boolean a(C0066m c0066m, boolean z4) throws C0157H, EOFException {
        boolean zT;
        boolean zT2;
        this.f3493a = 0;
        this.f3494b = 0L;
        this.f3495c = 0;
        this.f3496d = 0;
        this.f3497e = 0;
        C0363p c0363p = this.f3499g;
        c0363p.E(27);
        try {
            zT = c0066m.t(c0363p.f5313a, 0, 27, z4);
        } catch (EOFException e5) {
            if (!z4) {
                throw e5;
            }
            zT = false;
        }
        if (!zT || c0363p.x() != 1332176723) {
            return false;
        }
        if (c0363p.v() != 0) {
            if (z4) {
                return false;
            }
            throw C0157H.c("unsupported bit stream revision");
        }
        this.f3493a = c0363p.v();
        this.f3494b = c0363p.l();
        c0363p.m();
        c0363p.m();
        c0363p.m();
        int iV = c0363p.v();
        this.f3495c = iV;
        this.f3496d = iV + 27;
        c0363p.E(iV);
        try {
            zT2 = c0066m.t(c0363p.f5313a, 0, this.f3495c, z4);
        } catch (EOFException e6) {
            if (!z4) {
                throw e6;
            }
            zT2 = false;
        }
        if (!zT2) {
            return false;
        }
        for (int i = 0; i < this.f3495c; i++) {
            int iV2 = c0363p.v();
            this.f3498f[i] = iV2;
            this.f3497e += iV2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r10.f799o >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r10.j(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(F0.C0066m r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f799o
            long r2 = r10.w()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            d0.AbstractC0360m.c(r0)
            d0.p r0 = r9.f3499g
            r3 = 4
            r0.E(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.f799o
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.f5313a
            boolean r5 = r10.t(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.H(r1)
            long r4 = r0.x()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f801q = r1
            return r2
        L42:
            r10.f(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.f799o
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.j(r2)
            r3 = -1
            if (r0 == r3) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.f.b(F0.m, long):boolean");
    }
}
