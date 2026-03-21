package A0;

import a0.C0190p;
import d0.InterfaceC0351d;
import d0.InterfaceC0356i;
import d0.InterfaceC0357j;
import i0.C0477a;
import x0.H;
import x0.N;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements r, InterfaceC0357j, InterfaceC0356i, InterfaceC0351d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f75l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f76m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f77n;

    public /* synthetic */ g(Object obj, int i, Object obj2) {
        this.f75l = i;
        this.f76m = obj;
        this.f77n = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    @Override // A0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m2.b0 a(int r17, a0.C0170V r18, int[] r19) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.g.a(int, a0.V, int[]):m2.b0");
    }

    @Override // d0.InterfaceC0351d
    public void accept(Object obj) {
        m0.e eVar = (m0.e) this.f76m;
        ((N) obj).c(eVar.f8496a, eVar.f8497b, (u0.g) this.f77n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06e2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v24, types: [a0.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    @Override // d0.InterfaceC0357j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.Object r29, a0.C0188n r30) {
        /*
            Method dump skipped, instruction units count: 1814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.g.b(java.lang.Object, a0.n):void");
    }

    @Override // d0.InterfaceC0356i
    public void c(Object obj) {
        i0.h hVar = (i0.h) obj;
        hVar.getClass();
        C0477a c0477a = (C0477a) this.f76m;
        H h2 = c0477a.f6355d;
        if (h2 == null) {
            return;
        }
        u0.g gVar = (u0.g) this.f77n;
        C0190p c0190p = (C0190p) gVar.f10204f;
        c0190p.getClass();
        h2.getClass();
        D0.d dVar = new D0.d(c0190p, gVar.f10201c, hVar.f6388b.c(c0477a.f6353b, h2));
        int i = gVar.f10200b;
        if (i != 0) {
            if (i == 1) {
                hVar.f6401p = dVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                hVar.f6402q = dVar;
                return;
            }
        }
        hVar.f6400o = dVar;
    }
}
