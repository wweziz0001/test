package t0;

import a0.C0170V;
import a0.C0190p;
import android.net.Uri;
import android.os.Handler;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import h0.T;
import h0.t0;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import m2.C0639F;
import m2.I;
import m2.b0;
import m2.g0;
import m3.C0675i;
import x0.InterfaceC0959E;
import x0.e0;
import x0.f0;
import x0.q0;

/* JADX INFO: loaded from: classes.dex */
public final class q implements x0.F {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f9942A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9943B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9944C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f9945D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f9946E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f9947F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9948G;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B0.f f9949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f9950m = AbstractC0370w.m(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0675i f9951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0855l f9952o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f9953p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f9954q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0675i f9955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p1.b f9956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC0959E f9957t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b0 f9958u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public IOException f9959v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public K3.b f9960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f9961x;
    public long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f9962z;

    public q(B0.f fVar, p1.b bVar, Uri uri, C0675i c0675i, String str, SocketFactory socketFactory) {
        this.f9949l = fVar;
        this.f9956s = bVar;
        this.f9955r = c0675i;
        C0675i c0675i2 = new C0675i(this, 22);
        this.f9951n = c0675i2;
        this.f9952o = new C0855l(c0675i2, c0675i2, str, uri, socketFactory);
        this.f9953p = new ArrayList();
        this.f9954q = new ArrayList();
        this.y = -9223372036854775807L;
        this.f9961x = -9223372036854775807L;
        this.f9962z = -9223372036854775807L;
    }

    public static boolean m(q qVar) {
        return qVar.y != -9223372036854775807L;
    }

    public static void w(q qVar) {
        qVar.f9942A = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = qVar.f9953p;
            if (i >= arrayList.size()) {
                return;
            }
            qVar.f9942A = ((p) arrayList.get(i)).f9939d & qVar.f9942A;
            i++;
        }
    }

    public static void x(q qVar) {
        if (qVar.f9944C || qVar.f9945D) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = qVar.f9953p;
            if (i >= arrayList.size()) {
                qVar.f9945D = true;
                I iP = I.p(arrayList);
                C0639F c0639f = new C0639F();
                for (int i5 = 0; i5 < iP.size(); i5++) {
                    e0 e0Var = ((p) iP.get(i5)).f9938c;
                    String string = Integer.toString(i5);
                    C0190p c0190pQ = e0Var.q();
                    AbstractC0360m.f(c0190pQ);
                    c0639f.c(new C0170V(string, c0190pQ));
                }
                qVar.f9958u = c0639f.g();
                InterfaceC0959E interfaceC0959E = qVar.f9957t;
                AbstractC0360m.f(interfaceC0959E);
                interfaceC0959E.a(qVar);
                return;
            }
            if (((p) arrayList.get(i)).f9938c.q() == null) {
                return;
            } else {
                i++;
            }
        }
    }

    public static void y(q qVar) {
        qVar.f9948G = true;
        C0855l c0855l = qVar.f9952o;
        c0855l.getClass();
        try {
            c0855l.close();
            x xVar = new x(new Z1.l(c0855l));
            c0855l.f9923t = xVar;
            xVar.a(c0855l.l(c0855l.f9922s));
            c0855l.f9925v = null;
            c0855l.f9912B = false;
            c0855l.y = null;
        } catch (IOException e5) {
            c0855l.f9916m.p(new K3.b(e5));
        }
        qVar.f9956s.getClass();
        p1.b bVar = new p1.b(11);
        ArrayList arrayList = qVar.f9953p;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = qVar.f9954q;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (int i = 0; i < arrayList.size(); i++) {
            p pVar = (p) arrayList.get(i);
            if (pVar.f9939d) {
                arrayList2.add(pVar);
            } else {
                C0858o c0858o = pVar.f9936a;
                p pVar2 = new p(qVar, c0858o.f9932a, i, bVar);
                arrayList2.add(pVar2);
                pVar2.b();
                if (arrayList3.contains(c0858o)) {
                    arrayList4.add(pVar2.f9936a);
                }
            }
        }
        I iP = I.p(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i5 = 0; i5 < iP.size(); i5++) {
            ((p) iP.get(i5)).a();
        }
    }

    @Override // x0.h0
    public final boolean c() {
        int i;
        return !this.f9942A && ((i = this.f9952o.f9928z) == 2 || i == 1);
    }

    @Override // x0.F
    public final q0 e() {
        AbstractC0360m.h(this.f9945D);
        b0 b0Var = this.f9958u;
        b0Var.getClass();
        return new q0((C0170V[]) b0Var.toArray(new C0170V[0]));
    }

    @Override // x0.F
    public final long f(A0.w[] wVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j5) {
        ArrayList arrayList;
        for (int i = 0; i < wVarArr.length; i++) {
            if (f0VarArr[i] != null && (wVarArr[i] == null || !zArr[i])) {
                f0VarArr[i] = null;
            }
        }
        ArrayList arrayList2 = this.f9954q;
        arrayList2.clear();
        int i5 = 0;
        while (true) {
            int length = wVarArr.length;
            arrayList = this.f9953p;
            if (i5 >= length) {
                break;
            }
            A0.w wVar = wVarArr[i5];
            if (wVar != null) {
                C0170V c0170vB = wVar.b();
                b0 b0Var = this.f9958u;
                b0Var.getClass();
                int iIndexOf = b0Var.indexOf(c0170vB);
                p pVar = (p) arrayList.get(iIndexOf);
                pVar.getClass();
                arrayList2.add(pVar.f9936a);
                if (this.f9958u.contains(c0170vB) && f0VarArr[i5] == null) {
                    f0VarArr[i5] = new A.j(this, iIndexOf);
                    zArr2[i5] = true;
                }
            }
            i5++;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            p pVar2 = (p) arrayList.get(i6);
            if (!arrayList2.contains(pVar2.f9936a)) {
                pVar2.a();
            }
        }
        this.f9946E = true;
        if (j5 != 0) {
            this.f9961x = j5;
            this.y = j5;
            this.f9962z = j5;
        }
        z();
        return j5;
    }

    @Override // x0.h0
    public final long h() {
        if (!this.f9942A) {
            ArrayList arrayList = this.f9953p;
            if (!arrayList.isEmpty()) {
                long j5 = this.f9961x;
                if (j5 != -9223372036854775807L) {
                    return j5;
                }
                boolean z4 = true;
                long jMin = Long.MAX_VALUE;
                for (int i = 0; i < arrayList.size(); i++) {
                    p pVar = (p) arrayList.get(i);
                    if (!pVar.f9939d) {
                        jMin = Math.min(jMin, pVar.f9938c.l());
                        z4 = false;
                    }
                }
                if (z4 || jMin == Long.MIN_VALUE) {
                    return 0L;
                }
                return jMin;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // x0.F
    public final void l() throws IOException {
        IOException iOException = this.f9959v;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // x0.F
    public final long o(long j5) {
        if (h() == 0 && !this.f9948G) {
            this.f9962z = j5;
            return j5;
        }
        p(j5);
        this.f9961x = j5;
        if (this.y != -9223372036854775807L) {
            C0855l c0855l = this.f9952o;
            int i = c0855l.f9928z;
            if (i == 1) {
                return j5;
            }
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.y = j5;
            c0855l.n(j5);
            return j5;
        }
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f9953p;
            if (i5 >= arrayList.size()) {
                return j5;
            }
            if (!((p) arrayList.get(i5)).f9938c.B(j5, false)) {
                this.y = j5;
                if (this.f9942A) {
                    for (int i6 = 0; i6 < this.f9953p.size(); i6++) {
                        p pVar = (p) this.f9953p.get(i6);
                        AbstractC0360m.h(pVar.f9939d);
                        pVar.f9939d = false;
                        w(pVar.f9941f);
                        pVar.b();
                    }
                    if (this.f9948G) {
                        this.f9952o.o(AbstractC0370w.Z(j5));
                    } else {
                        this.f9952o.n(j5);
                    }
                } else {
                    this.f9952o.n(j5);
                }
                for (int i7 = 0; i7 < this.f9953p.size(); i7++) {
                    p pVar2 = (p) this.f9953p.get(i7);
                    if (!pVar2.f9939d) {
                        C0849f c0849f = pVar2.f9936a.f9933b.f9869s;
                        c0849f.getClass();
                        synchronized (c0849f.f9878e) {
                            c0849f.f9883k = true;
                        }
                        pVar2.f9938c.z(false);
                        pVar2.f9938c.f10700t = j5;
                    }
                }
                return j5;
            }
            i5++;
        }
    }

    @Override // x0.F
    public final void p(long j5) {
        if (this.y != -9223372036854775807L) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9953p;
            if (i >= arrayList.size()) {
                return;
            }
            p pVar = (p) arrayList.get(i);
            if (!pVar.f9939d) {
                pVar.f9938c.f(j5, true);
            }
            i++;
        }
    }

    @Override // x0.h0
    public final long r() {
        return h();
    }

    @Override // x0.F
    public final long s() {
        if (!this.f9943B) {
            return -9223372036854775807L;
        }
        this.f9943B = false;
        return 0L;
    }

    @Override // x0.F
    public final void t(InterfaceC0959E interfaceC0959E, long j5) {
        C0855l c0855l = this.f9952o;
        this.f9957t = interfaceC0959E;
        try {
            c0855l.getClass();
            try {
                c0855l.f9923t.a(c0855l.l(c0855l.f9922s));
                Uri uri = c0855l.f9922s;
                String str = c0855l.f9925v;
                D0.d dVar = c0855l.f9921r;
                dVar.r(dVar.i(4, str, g0.f8607r, uri));
            } catch (IOException e5) {
                AbstractC0370w.g(c0855l.f9923t);
                throw e5;
            }
        } catch (IOException e6) {
            this.f9959v = e6;
            AbstractC0370w.g(c0855l);
        }
    }

    @Override // x0.h0
    public final boolean v(T t4) {
        return c();
    }

    public final void z() {
        ArrayList arrayList;
        boolean z4 = true;
        int i = 0;
        while (true) {
            arrayList = this.f9954q;
            if (i >= arrayList.size()) {
                break;
            }
            z4 &= ((C0858o) arrayList.get(i)).f9934c != null;
            i++;
        }
        if (z4 && this.f9946E) {
            C0855l c0855l = this.f9952o;
            c0855l.f9919p.addAll(arrayList);
            c0855l.k();
        }
    }

    @Override // x0.h0
    public final void u(long j5) {
    }

    @Override // x0.F
    public final long b(long j5, t0 t0Var) {
        return j5;
    }
}
