package x0;

import F0.C0066m;
import android.net.Uri;
import d0.AbstractC0360m;
import f0.C0417l;
import f0.C0431z;
import f0.InterfaceC0413h;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class V implements B0.o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f10572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0431z f10573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Z1.m f10574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Y f10575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final F0.N f10576q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f10578s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10580u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public F0.K f10582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10583x;
    public final /* synthetic */ Y y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final F0.u f10577r = new F0.u();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10579t = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f10571l = C0984z.f10817b.getAndIncrement();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0417l f10581v = a(0);

    public V(Y y, Uri uri, InterfaceC0413h interfaceC0413h, Z1.m mVar, Y y4, F0.N n4) {
        this.y = y;
        this.f10572m = uri;
        this.f10573n = new C0431z(interfaceC0413h);
        this.f10574o = mVar;
        this.f10575p = y4;
        this.f10576q = n4;
    }

    public final C0417l a(long j5) {
        Collections.emptyMap();
        this.y.getClass();
        Map map = Y.f10588a0;
        Uri uri = this.f10572m;
        AbstractC0360m.j(uri, "The uri must be set.");
        return new C0417l(uri, 1, null, map, j5, -1L, null, 6);
    }

    @Override // B0.o
    public final void e() {
        InterfaceC0413h c0983y;
        F0.q qVar;
        int i;
        int iD = 0;
        while (iD == 0 && !this.f10578s) {
            try {
                long j5 = this.f10577r.f817a;
                C0417l c0417lA = a(j5);
                this.f10581v = c0417lA;
                long jP = this.f10573n.p(c0417lA);
                if (this.f10578s) {
                    if (iD != 1 && this.f10574o.u() != -1) {
                        this.f10577r.f817a = this.f10574o.u();
                    }
                    Z1.f.g(this.f10573n);
                    return;
                }
                if (jP != -1) {
                    jP += j5;
                    Y y = this.y;
                    y.f10591B.post(new T(y, 2));
                }
                long j6 = jP;
                this.y.f10593D = S0.b.d(this.f10573n.f5733l.y());
                C0431z c0431z = this.f10573n;
                S0.b bVar = this.y.f10593D;
                if (bVar == null || (i = bVar.f1992q) == -1) {
                    c0983y = c0431z;
                } else {
                    c0983y = new C0983y(c0431z, i, this);
                    Y y4 = this.y;
                    y4.getClass();
                    F0.K kC = y4.C(new X(0, true));
                    this.f10582w = kC;
                    kC.c(Y.f10589b0);
                }
                long jU = j5;
                this.f10574o.y(c0983y, this.f10572m, this.f10573n.f5733l.y(), j5, j6, this.f10575p);
                if (this.y.f10593D != null && (qVar = (F0.q) this.f10574o.f3025n) != null && (qVar instanceof Y0.d)) {
                    ((Y0.d) qVar).f2709s = true;
                }
                if (this.f10579t) {
                    Z1.m mVar = this.f10574o;
                    long j7 = this.f10580u;
                    F0.q qVar2 = (F0.q) mVar.f3025n;
                    qVar2.getClass();
                    qVar2.b(jU, j7);
                    this.f10579t = false;
                }
                while (true) {
                    long j8 = jU;
                    while (iD == 0 && !this.f10578s) {
                        try {
                            F0.N n4 = this.f10576q;
                            synchronized (n4) {
                                while (!n4.f715a) {
                                    n4.wait();
                                }
                            }
                            Z1.m mVar2 = this.f10574o;
                            F0.u uVar = this.f10577r;
                            F0.q qVar3 = (F0.q) mVar2.f3025n;
                            qVar3.getClass();
                            C0066m c0066m = (C0066m) mVar2.f3026o;
                            c0066m.getClass();
                            iD = qVar3.d(c0066m, uVar);
                            jU = this.f10574o.u();
                            if (jU > this.y.f10623t + j8) {
                                F0.N n5 = this.f10576q;
                                synchronized (n5) {
                                    n5.f715a = false;
                                }
                                Y y5 = this.y;
                                y5.f10591B.post(y5.f10590A);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    break;
                }
                if (iD == 1) {
                    iD = 0;
                } else if (this.f10574o.u() != -1) {
                    this.f10577r.f817a = this.f10574o.u();
                }
                Z1.f.g(this.f10573n);
            } catch (Throwable th) {
                if (iD != 1 && this.f10574o.u() != -1) {
                    this.f10577r.f817a = this.f10574o.u();
                }
                Z1.f.g(this.f10573n);
                throw th;
            }
        }
    }

    @Override // B0.o
    public final void g() {
        this.f10578s = true;
    }
}
