package y0;

import F0.J;
import F0.K;
import F0.o;
import a0.C0190p;
import a0.InterfaceC0182h;
import d0.AbstractC0370w;
import d0.C0363p;

/* JADX INFO: renamed from: y0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0995c implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0190p f10838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f10839c = new o();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0190p f10840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public K f10841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10842f;

    public C0995c(int i, int i5, C0190p c0190p) {
        this.f10837a = i5;
        this.f10838b = c0190p;
    }

    @Override // F0.K
    public final void a(C0363p c0363p, int i, int i5) {
        K k4 = this.f10841e;
        int i6 = AbstractC0370w.f5326a;
        k4.a(c0363p, i, 0);
    }

    @Override // F0.K
    public final void b(long j5, int i, int i5, int i6, J j6) {
        long j7 = this.f10842f;
        if (j7 != -9223372036854775807L && j5 >= j7) {
            this.f10841e = this.f10839c;
        }
        K k4 = this.f10841e;
        int i7 = AbstractC0370w.f5326a;
        k4.b(j5, i, i5, i6, j6);
    }

    @Override // F0.K
    public final void c(C0190p c0190p) {
        C0190p c0190p2 = this.f10838b;
        if (c0190p2 != null) {
            c0190p = c0190p.e(c0190p2);
        }
        this.f10840d = c0190p;
        K k4 = this.f10841e;
        int i = AbstractC0370w.f5326a;
        k4.c(c0190p);
    }

    @Override // F0.K
    public final int d(InterfaceC0182h interfaceC0182h, int i, boolean z4) {
        K k4 = this.f10841e;
        int i5 = AbstractC0370w.f5326a;
        return k4.d(interfaceC0182h, i, z4);
    }
}
