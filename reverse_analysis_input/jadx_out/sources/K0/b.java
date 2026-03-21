package K0;

import F0.C0059f;
import F0.C0060g;
import F0.C0066m;
import F0.InterfaceC0061h;
import F0.InterfaceC0063j;
import F0.u;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0059f f1211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0063j f1212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0060g f1213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1214d;

    public b(InterfaceC0061h interfaceC0061h, InterfaceC0063j interfaceC0063j, long j5, long j6, long j7, long j8, long j9, int i) {
        this.f1212b = interfaceC0063j;
        this.f1214d = i;
        this.f1211a = new C0059f(interfaceC0061h, j5, j6, j7, j8, j9);
    }

    public static int a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(C0066m c0066m, long j5, u uVar) {
        if (j5 == c0066m.f799o) {
            return 0;
        }
        uVar.f817a = j5;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(F0.C0066m r28, F0.u r29) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.b.b(F0.m, F0.u):int");
    }

    public final void d(long j5) {
        C0060g c0060g = this.f1213c;
        if (c0060g == null || c0060g.f771a != j5) {
            C0059f c0059f = this.f1211a;
            this.f1213c = new C0060g(j5, c0059f.f765a.b(j5), c0059f.f767c, c0059f.f768d, c0059f.f769e, c0059f.f770f);
        }
    }
}
