package D0;

import a0.C0181g;
import a0.C0189o;
import a0.C0190p;
import a0.c0;
import a0.e0;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.datastore.preferences.protobuf.C0219k;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0364q;
import d0.C0367t;
import h0.C0464o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0190p f461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f466h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B f469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Executor f470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f471n;

    public m(q qVar, Context context) {
        this.f471n = qVar;
        AbstractC0370w.I(context);
        this.f459a = new ArrayList();
        this.f460b = new r();
        this.f466h = -9223372036854775807L;
        this.f469l = B.f379a;
        this.f470m = q.f474o;
    }

    public final void a(boolean z4) {
        this.i = false;
        this.f466h = -9223372036854775807L;
        q qVar = this.f471n;
        if (qVar.f487n == 1) {
            qVar.f486m++;
            Z1.l lVar = qVar.f480f;
            if (z4) {
                s sVar = (s) lVar.f3020l;
                v vVar = sVar.f491b;
                vVar.f519m = 0L;
                vVar.f522p = -1L;
                vVar.f520n = -1L;
                sVar.f496g = -9223372036854775807L;
                sVar.f494e = -9223372036854775807L;
                sVar.d(1);
                sVar.f497h = -9223372036854775807L;
            }
            w wVar = (w) lVar.f3021m;
            C0219k c0219k = wVar.f529f;
            c0219k.f4172b = 0;
            c0219k.f4173c = 0;
            wVar.f532j = -9223372036854775807L;
            Z0.e eVar = wVar.f528e;
            if (eVar.i() > 0) {
                AbstractC0360m.c(eVar.i() > 0);
                while (eVar.i() > 1) {
                    eVar.f();
                }
                Object objF = eVar.f();
                objF.getClass();
                eVar.a(0L, (Long) objF);
            }
            e0 e0Var = wVar.f530g;
            Z0.e eVar2 = wVar.f527d;
            if (e0Var != null) {
                eVar2.c();
            } else if (eVar2.i() > 0) {
                AbstractC0360m.c(eVar2.i() > 0);
                while (eVar2.i() > 1) {
                    eVar2.f();
                }
                Object objF2 = eVar2.f();
                objF2.getClass();
                wVar.f530g = (e0) objF2;
            }
            C0367t c0367t = qVar.f484k;
            AbstractC0360m.i(c0367t);
            c0367t.c(new A3.c(qVar, 1));
        }
        this.f468k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r8 >= r4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r18, boolean r20, long r21, long r23, D0.d r25) throws D0.C {
        /*
            r17 = this;
            r1 = r17
            r0 = r25
            D0.q r2 = r1.f471n
            r3 = 0
            d0.AbstractC0360m.h(r3)
            long r4 = r1.f464f
            long r4 = r18 - r4
            D0.s r6 = r2.f476b     // Catch: h0.C0464o -> L6f
            long r13 = r1.f462d     // Catch: h0.C0464o -> L6f
            D0.r r15 = r1.f460b     // Catch: h0.C0464o -> L6f
            r7 = r4
            r9 = r21
            r11 = r23
            r16 = r15
            r15 = r20
            int r6 = r6.a(r7, r9, r11, r13, r15, r16)     // Catch: h0.C0464o -> L6f
            r7 = 4
            if (r6 != r7) goto L25
            return r3
        L25:
            long r6 = r1.f465g
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L3c
            if (r20 != 0) goto L3c
            java.lang.Object r2 = r0.f396n
            D0.g r2 = (D0.g) r2
            java.lang.Object r3 = r0.f395m
            q0.l r3 = (q0.l) r3
            int r0 = r0.f394l
            r2.v0(r3, r0)
            r0 = 1
            return r0
        L3c:
            r4 = r21
            r6 = r23
            r1.f(r4, r6)
            boolean r0 = r1.f467j
            if (r0 == 0) goto L6a
            long r4 = r1.f468k
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L63
            int r0 = r2.f486m
            if (r0 != 0) goto L62
            D0.w r0 = r2.f477c
            long r8 = r0.f532j
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L62
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L63
        L62:
            return r3
        L63:
            r17.e()
            r1.f467j = r3
            r1.f468k = r6
        L6a:
            r0 = 0
            d0.AbstractC0360m.i(r0)
            throw r0
        L6f:
            r0 = move-exception
            D0.C r2 = new D0.C
            a0.p r3 = r1.f461c
            d0.AbstractC0360m.i(r3)
            r2.<init>(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.m.b(long, boolean, long, long, D0.d):boolean");
    }

    public final void c(C0190p c0190p) {
        q qVar = this.f471n;
        AbstractC0360m.h(qVar.f487n == 0);
        C0181g c0181g = c0190p.f3401B;
        if (c0181g == null || !c0181g.d()) {
            c0181g = C0181g.f3342h;
        }
        if (c0181g.f3345c != 7 || AbstractC0370w.f5326a < 34) {
        }
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0360m.i(looperMyLooper);
        qVar.f484k = qVar.f481g.a(looperMyLooper, null);
        try {
            p pVar = qVar.f478d;
            b0 b0Var = b0.f8583p;
            pVar.a();
            Pair pair = qVar.f485l;
            if (pair == null) {
                throw null;
            }
            int i = ((C0364q) pair.second).f5317a;
            throw null;
        } catch (c0 e5) {
            throw new C(e5, c0190p);
        }
    }

    public final void d(boolean z4) {
        ((s) this.f471n.f480f.f3020l).c(z4);
    }

    public final void e() {
        if (this.f461c == null) {
            return;
        }
        new ArrayList(this.f459a);
        C0190p c0190p = this.f461c;
        c0190p.getClass();
        AbstractC0360m.i(null);
        C0181g c0181g = c0190p.f3401B;
        if (c0181g == null || !c0181g.d()) {
            C0181g c0181g2 = C0181g.f3342h;
        }
        int i = c0190p.f3431u;
        AbstractC0360m.b("width must be positive, but is: " + i, i > 0);
        int i5 = c0190p.f3432v;
        AbstractC0360m.b("height must be positive, but is: " + i5, i5 > 0);
        throw null;
    }

    public final void f(long j5, long j6) {
        try {
            q.a(this.f471n, j5, j6);
        } catch (C0464o e5) {
            C0190p c0190p = this.f461c;
            if (c0190p == null) {
                c0190p = new C0190p(new C0189o());
            }
            throw new C(e5, c0190p);
        }
    }

    public final void g(int i) {
        v vVar = ((s) this.f471n.f480f.f3020l).f491b;
        if (vVar.f516j == i) {
            return;
        }
        vVar.f516j = i;
        vVar.d(true);
    }

    public final void h(Surface surface, C0364q c0364q) {
        q qVar = this.f471n;
        Pair pair = qVar.f485l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C0364q) qVar.f485l.second).equals(c0364q)) {
            return;
        }
        qVar.f485l = Pair.create(surface, c0364q);
        int i = c0364q.f5317a;
    }

    public final void i(float f2) {
        ((s) this.f471n.f480f.f3020l).h(f2);
    }

    public final void j(long j5, long j6, long j7, long j8) {
        if (this.f463e == j6) {
            int i = (this.f464f > j7 ? 1 : (this.f464f == j7 ? 0 : -1));
        }
        this.f462d = j5;
        this.f463e = j6;
        this.f464f = j7;
        this.f465g = j8;
    }

    public final void k(List list) {
        ArrayList arrayList = this.f459a;
        if (arrayList.equals(list)) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        arrayList.addAll(this.f471n.f479e);
        e();
    }
}
