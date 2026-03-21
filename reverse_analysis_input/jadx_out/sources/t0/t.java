package t0;

import a0.AbstractC0151B;
import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0197w;
import android.net.Uri;
import d0.AbstractC0370w;
import f0.InterfaceC0403A;
import java.util.ArrayList;
import javax.net.SocketFactory;
import m3.C0675i;
import x0.AbstractC0960a;
import x0.H;
import x0.n0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0960a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0150A f9964A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p1.b f9965s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f9966t = "AndroidXMedia3/1.5.1";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Uri f9967u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SocketFactory f9968v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f9969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9970x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9971z;

    static {
        AbstractC0151B.a("media3.exoplayer.rtsp");
    }

    public t(C0150A c0150a, p1.b bVar, SocketFactory socketFactory) {
        this.f9964A = c0150a;
        this.f9965s = bVar;
        C0197w c0197w = c0150a.f3154b;
        c0197w.getClass();
        this.f9967u = c0197w.f3460a;
        this.f9968v = socketFactory;
        this.f9969w = -9223372036854775807L;
        this.f9971z = true;
    }

    @Override // x0.J
    public final synchronized C0150A a() {
        return this.f9964A;
    }

    @Override // x0.J
    public final synchronized void b(C0150A c0150a) {
        this.f9964A = c0150a;
    }

    @Override // x0.J
    public final x0.F c(H h2, B0.f fVar, long j5) {
        C0675i c0675i = new C0675i(this, 23);
        return new q(fVar, this.f9965s, this.f9967u, c0675i, this.f9966t, this.f9968v);
    }

    @Override // x0.J
    public final void d(x0.F f2) {
        q qVar = (q) f2;
        int i = 0;
        while (true) {
            ArrayList arrayList = qVar.f9953p;
            if (i >= arrayList.size()) {
                AbstractC0370w.g(qVar.f9952o);
                qVar.f9944C = true;
                return;
            }
            p pVar = (p) arrayList.get(i);
            if (!pVar.f9940e) {
                pVar.f9937b.e(null);
                pVar.f9938c.y();
                pVar.f9940e = true;
            }
            i++;
        }
    }

    @Override // x0.AbstractC0960a
    public final void p(InterfaceC0403A interfaceC0403A) {
        w();
    }

    public final void w() {
        AbstractC0169U n0Var = new n0(this.f9969w, this.f9970x, this.y, a());
        if (this.f9971z) {
            n0Var = new r(n0Var, 0);
        }
        r(n0Var);
    }

    @Override // x0.J
    public final void e() {
    }

    @Override // x0.AbstractC0960a
    public final void t() {
    }
}
