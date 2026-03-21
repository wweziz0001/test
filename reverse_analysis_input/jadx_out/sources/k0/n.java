package k0;

import F0.J;
import F0.K;
import a0.C0155F;
import a0.C0157H;
import a0.C0190p;
import a0.InterfaceC0182h;
import android.os.Handler;
import d0.AbstractC0370w;
import d0.C0363p;
import x0.b0;
import x0.e0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f7626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1.e f7627b = new Z1.e((char) 0, 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O0.a f7628c = new O0.a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7629d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f7630e;

    public n(o oVar, B0.f fVar) {
        this.f7630e = oVar;
        this.f7626a = new e0(fVar, null, null);
    }

    @Override // F0.K
    public final void a(C0363p c0363p, int i, int i5) {
        this.f7626a.a(c0363p, i, 0);
    }

    @Override // F0.K
    public final void b(long j5, int i, int i5, int i6, J j6) {
        long jE;
        long jP;
        this.f7626a.b(j5, i, i5, i6, j6);
        while (this.f7626a.s(false)) {
            O0.a aVar = this.f7628c;
            aVar.f();
            if (this.f7626a.x(this.f7627b, aVar, 0, false) == -4) {
                aVar.k();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j7 = aVar.f5789r;
                C0155F c0155fM = this.f7630e.f7633n.m(aVar);
                if (c0155fM != null) {
                    Q0.a aVar2 = (Q0.a) c0155fM.f3211l[0];
                    String str = aVar2.f1766l;
                    String str2 = aVar2.f1767m;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jP = AbstractC0370w.P(AbstractC0370w.o(aVar2.f1770p));
                        } catch (C0157H unused) {
                            jP = -9223372036854775807L;
                        }
                        if (jP != -9223372036854775807L) {
                            m mVar = new m(j7, jP);
                            Handler handler = this.f7630e.f7634o;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        e0 e0Var = this.f7626a;
        b0 b0Var = e0Var.f10682a;
        synchronized (e0Var) {
            int i7 = e0Var.f10699s;
            jE = i7 == 0 ? -1L : e0Var.e(i7);
        }
        b0Var.b(jE);
    }

    @Override // F0.K
    public final void c(C0190p c0190p) {
        this.f7626a.c(c0190p);
    }

    @Override // F0.K
    public final int d(InterfaceC0182h interfaceC0182h, int i, boolean z4) {
        return this.f7626a.d(interfaceC0182h, i, z4);
    }
}
