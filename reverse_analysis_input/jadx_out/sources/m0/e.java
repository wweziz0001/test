package m0;

import D0.y;
import a0.C0190p;
import d0.AbstractC0370w;
import d0.InterfaceC0351d;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import x0.C0984z;
import x0.H;
import x0.K;
import x0.L;
import x0.M;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f8497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f8498c;

    public /* synthetic */ e(CopyOnWriteArrayList copyOnWriteArrayList, int i, H h2) {
        this.f8498c = copyOnWriteArrayList;
        this.f8496a = i;
        this.f8497b = h2;
    }

    public void a(InterfaceC0351d interfaceC0351d) {
        for (M m4 : this.f8498c) {
            AbstractC0370w.Q(m4.f10545a, new y(interfaceC0351d, 24, m4.f10546b));
        }
    }

    public void b(int i, C0190p c0190p, int i5, Object obj, long j5) {
        a(new A0.g(this, 5, new u0.g(1, i, c0190p, i5, obj, AbstractC0370w.Z(j5), -9223372036854775807L)));
    }

    public void c(C0984z c0984z, int i, int i5, C0190p c0190p, int i6, Object obj, long j5, long j6) {
        a(new K(this, c0984z, new u0.g(i, i5, c0190p, i6, obj, AbstractC0370w.Z(j5), AbstractC0370w.Z(j6)), 2));
    }

    public void d(C0984z c0984z, int i) {
        e(c0984z, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void e(C0984z c0984z, int i, int i5, C0190p c0190p, int i6, Object obj, long j5, long j6) {
        a(new K(this, c0984z, new u0.g(i, i5, c0190p, i6, obj, AbstractC0370w.Z(j5), AbstractC0370w.Z(j6)), 1));
    }

    public void f(C0984z c0984z, int i, int i5, C0190p c0190p, int i6, Object obj, long j5, long j6, IOException iOException, boolean z4) {
        a(new L(this, c0984z, new u0.g(i, i5, c0190p, i6, obj, AbstractC0370w.Z(j5), AbstractC0370w.Z(j6)), iOException, z4));
    }

    public void g(C0984z c0984z, int i, IOException iOException, boolean z4) {
        f(c0984z, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z4);
    }

    public void h(C0984z c0984z, int i, int i5, C0190p c0190p, int i6, Object obj, long j5, long j6) {
        a(new K(this, c0984z, new u0.g(i, i5, c0190p, i6, obj, AbstractC0370w.Z(j5), AbstractC0370w.Z(j6)), 0));
    }
}
