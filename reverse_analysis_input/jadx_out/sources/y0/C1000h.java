package y0;

import B0.o;
import B0.p;
import B0.r;
import a0.AbstractC0156G;
import a0.C0187m;
import a0.C0190p;
import android.net.Uri;
import androidx.lifecycle.E;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import h0.T;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k0.C0529b;
import x0.C0984z;
import x0.H;
import x0.K;
import x0.e0;
import x0.f0;
import x0.g0;
import x0.h0;

/* JADX INFO: renamed from: y0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1000h implements f0, h0, B0.m, p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC0997e f10868A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0190p f10869B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0529b f10870C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f10871D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f10872E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f10873F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public AbstractC0993a f10874G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f10875H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f10876I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f10877J;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f10879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0190p[] f10880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean[] f10881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f10882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f10883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m0.e f10884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final A0.b f10885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f10886t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0187m f10887u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f10888v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f10889w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e0 f10890x;
    public final e0[] y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Z1.e f10891z;

    public C1000h(int i, int[] iArr, C0190p[] c0190pArr, i iVar, g0 g0Var, B0.f fVar, long j5, m0.i iVar2, m0.e eVar, A0.b bVar, m0.e eVar2, boolean z4) {
        this.f10878l = i;
        int i5 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f10879m = iArr;
        this.f10880n = c0190pArr == null ? new C0190p[0] : c0190pArr;
        this.f10882p = iVar;
        this.f10883q = g0Var;
        this.f10884r = eVar2;
        this.f10885s = bVar;
        this.f10875H = z4;
        this.f10886t = new r("ChunkSampleStream");
        this.f10887u = new C0187m();
        ArrayList arrayList = new ArrayList();
        this.f10888v = arrayList;
        this.f10889w = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y = new e0[length];
        this.f10881o = new boolean[length];
        int i6 = length + 1;
        int[] iArr2 = new int[i6];
        e0[] e0VarArr = new e0[i6];
        iVar2.getClass();
        e0 e0Var = new e0(fVar, iVar2, eVar);
        this.f10890x = e0Var;
        iArr2[0] = i;
        e0VarArr[0] = e0Var;
        while (i5 < length) {
            e0 e0Var2 = new e0(fVar, null, null);
            this.y[i5] = e0Var2;
            int i7 = i5 + 1;
            e0VarArr[i7] = e0Var2;
            iArr2[i7] = this.f10879m[i5];
            i5 = i7;
        }
        this.f10891z = new Z1.e(iArr2, 22, e0VarArr);
        this.f10871D = j5;
        this.f10872E = j5;
    }

    public final void A(C0529b c0529b) {
        this.f10870C = c0529b;
        e0 e0Var = this.f10890x;
        e0Var.g();
        E e5 = e0Var.f10689h;
        if (e5 != null) {
            e5.I(e0Var.f10686e);
            e0Var.f10689h = null;
            e0Var.f10688g = null;
        }
        for (e0 e0Var2 : this.y) {
            e0Var2.g();
            E e6 = e0Var2.f10689h;
            if (e6 != null) {
                e6.I(e0Var2.f10686e);
                e0Var2.f10689h = null;
                e0Var2.f10688g = null;
            }
        }
        this.f10886t.e(this);
    }

    public final void B(long j5) {
        ArrayList arrayList;
        AbstractC0993a abstractC0993a;
        this.f10872E = j5;
        int i = 0;
        this.f10875H = false;
        if (x()) {
            this.f10871D = j5;
            return;
        }
        int i5 = 0;
        while (true) {
            arrayList = this.f10888v;
            if (i5 >= arrayList.size()) {
                break;
            }
            abstractC0993a = (AbstractC0993a) arrayList.get(i5);
            long j6 = abstractC0993a.f10860r;
            if (j6 == j5 && abstractC0993a.f10831v == -9223372036854775807L) {
                break;
            } else if (j6 > j5) {
                break;
            } else {
                i5++;
            }
        }
        abstractC0993a = null;
        e0 e0Var = this.f10890x;
        boolean zA = abstractC0993a != null ? e0Var.A(abstractC0993a.c(0)) : e0Var.B(j5, j5 < r());
        e0[] e0VarArr = this.y;
        if (zA) {
            this.f10873F = z(e0Var.n(), 0);
            int length = e0VarArr.length;
            while (i < length) {
                e0VarArr[i].B(j5, true);
                i++;
            }
            return;
        }
        this.f10871D = j5;
        this.f10877J = false;
        arrayList.clear();
        this.f10873F = 0;
        r rVar = this.f10886t;
        if (rVar.d()) {
            e0Var.g();
            int length2 = e0VarArr.length;
            while (i < length2) {
                e0VarArr[i].g();
                i++;
            }
            rVar.b();
            return;
        }
        rVar.f244n = null;
        e0Var.z(false);
        for (e0 e0Var2 : e0VarArr) {
            e0Var2.z(false);
        }
    }

    @Override // x0.f0
    public final void a() throws IOException {
        r rVar = this.f10886t;
        rVar.a();
        this.f10890x.u();
        if (rVar.d()) {
            return;
        }
        this.f10882p.a();
    }

    @Override // x0.h0
    public final boolean c() {
        return this.f10886t.d();
    }

    @Override // x0.f0
    public final int d(long j5) {
        if (x()) {
            return 0;
        }
        e0 e0Var = this.f10890x;
        int iP = e0Var.p(j5, this.f10877J);
        AbstractC0993a abstractC0993a = this.f10874G;
        if (abstractC0993a != null) {
            iP = Math.min(iP, abstractC0993a.c(0) - e0Var.n());
        }
        e0Var.C(iP);
        y();
        return iP;
    }

    @Override // B0.p
    public final void g() {
        this.f10890x.y();
        for (e0 e0Var : this.y) {
            e0Var.y();
        }
        this.f10882p.release();
        C0529b c0529b = this.f10870C;
        if (c0529b != null) {
            synchronized (c0529b) {
                k0.n nVar = (k0.n) c0529b.y.remove(this);
                if (nVar != null) {
                    nVar.f7626a.y();
                }
            }
        }
    }

    @Override // x0.h0
    public final long h() {
        if (this.f10877J) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.f10871D;
        }
        long jMax = this.f10872E;
        AbstractC0993a abstractC0993aM = m();
        if (!abstractC0993aM.b()) {
            ArrayList arrayList = this.f10888v;
            abstractC0993aM = arrayList.size() > 1 ? (AbstractC0993a) arrayList.get(arrayList.size() - 2) : null;
        }
        if (abstractC0993aM != null) {
            jMax = Math.max(jMax, abstractC0993aM.f10861s);
        }
        return Math.max(jMax, this.f10890x.l());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, x0.g0] */
    @Override // B0.m
    public final void i(o oVar, long j5, long j6) {
        AbstractC0997e abstractC0997e = (AbstractC0997e) oVar;
        this.f10868A = null;
        this.f10882p.g(abstractC0997e);
        long j7 = abstractC0997e.f10854l;
        Uri uri = abstractC0997e.f10862t.f5735n;
        C0984z c0984z = new C0984z(j6);
        this.f10885s.getClass();
        this.f10884r.e(c0984z, abstractC0997e.f10856n, this.f10878l, abstractC0997e.f10857o, abstractC0997e.f10858p, abstractC0997e.f10859q, abstractC0997e.f10860r, abstractC0997e.f10861s);
        this.f10883q.d(this);
    }

    @Override // x0.f0
    public final boolean isReady() {
        return !x() && this.f10890x.s(this.f10877J);
    }

    public final AbstractC0993a j(int i) {
        ArrayList arrayList = this.f10888v;
        AbstractC0993a abstractC0993a = (AbstractC0993a) arrayList.get(i);
        AbstractC0370w.R(arrayList, i, arrayList.size());
        this.f10873F = Math.max(this.f10873F, arrayList.size());
        int i5 = 0;
        this.f10890x.i(abstractC0993a.c(0));
        while (true) {
            e0[] e0VarArr = this.y;
            if (i5 >= e0VarArr.length) {
                return abstractC0993a;
            }
            e0 e0Var = e0VarArr[i5];
            i5++;
            e0Var.i(abstractC0993a.c(i5));
        }
    }

    @Override // x0.f0
    public final int k(Z1.e eVar, g0.e eVar2, int i) {
        if (x()) {
            return -3;
        }
        AbstractC0993a abstractC0993a = this.f10874G;
        e0 e0Var = this.f10890x;
        if (abstractC0993a != null && abstractC0993a.c(0) <= e0Var.n()) {
            return -3;
        }
        y();
        return e0Var.x(eVar, eVar2, i, this.f10877J);
    }

    public final AbstractC0993a m() {
        return (AbstractC0993a) this.f10888v.get(r0.size() - 1);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, x0.g0] */
    @Override // B0.m
    public final B0.k n(o oVar, long j5, long j6, IOException iOException, int i) {
        B0.k kVar;
        AbstractC0997e abstractC0997e = (AbstractC0997e) oVar;
        long j7 = abstractC0997e.f10862t.f5734m;
        boolean z4 = abstractC0997e instanceof AbstractC0993a;
        ArrayList arrayList = this.f10888v;
        int size = arrayList.size() - 1;
        boolean z5 = (j7 != 0 && z4 && w(size)) ? false : true;
        Uri uri = abstractC0997e.f10862t.f5735n;
        C0984z c0984z = new C0984z(j6);
        AbstractC0370w.Z(abstractC0997e.f10860r);
        AbstractC0370w.Z(abstractC0997e.f10861s);
        A.j jVar = new A.j(iOException, i);
        i iVar = this.f10882p;
        A0.b bVar = this.f10885s;
        if (!iVar.d(abstractC0997e, z5, jVar, bVar)) {
            kVar = null;
        } else if (z5) {
            if (z4) {
                AbstractC0360m.h(j(size) == abstractC0997e);
                if (arrayList.isEmpty()) {
                    this.f10871D = this.f10872E;
                }
            }
            kVar = r.f240p;
        } else {
            AbstractC0360m.y("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            kVar = null;
        }
        if (kVar == null) {
            bVar.getClass();
            long jP = A0.b.p(jVar);
            kVar = jP != -9223372036854775807L ? new B0.k(0, jP, false) : r.f241q;
        }
        boolean zA = kVar.a();
        B0.k kVar2 = kVar;
        this.f10884r.f(c0984z, abstractC0997e.f10856n, this.f10878l, abstractC0997e.f10857o, abstractC0997e.f10858p, abstractC0997e.f10859q, abstractC0997e.f10860r, abstractC0997e.f10861s, iOException, !zA);
        if (!zA) {
            this.f10868A = null;
            bVar.getClass();
            this.f10883q.d(this);
        }
        return kVar2;
    }

    public final void p(long j5) {
        long j6;
        if (x()) {
            return;
        }
        e0 e0Var = this.f10890x;
        int i = e0Var.f10697q;
        e0Var.f(j5, true);
        e0 e0Var2 = this.f10890x;
        int i5 = e0Var2.f10697q;
        if (i5 > i) {
            synchronized (e0Var2) {
                j6 = e0Var2.f10696p == 0 ? Long.MIN_VALUE : e0Var2.f10694n[e0Var2.f10698r];
            }
            int i6 = 0;
            while (true) {
                e0[] e0VarArr = this.y;
                if (i6 >= e0VarArr.length) {
                    break;
                }
                e0VarArr[i6].f(j6, this.f10881o[i6]);
                i6++;
            }
        }
        int iMin = Math.min(z(i5, 0), this.f10873F);
        if (iMin > 0) {
            AbstractC0370w.R(this.f10888v, 0, iMin);
            this.f10873F -= iMin;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, x0.g0] */
    @Override // B0.m
    public final void q(o oVar, long j5, long j6, boolean z4) {
        AbstractC0997e abstractC0997e = (AbstractC0997e) oVar;
        this.f10868A = null;
        this.f10874G = null;
        long j7 = abstractC0997e.f10854l;
        Uri uri = abstractC0997e.f10862t.f5735n;
        C0984z c0984z = new C0984z(j6);
        this.f10885s.getClass();
        this.f10884r.c(c0984z, abstractC0997e.f10856n, this.f10878l, abstractC0997e.f10857o, abstractC0997e.f10858p, abstractC0997e.f10859q, abstractC0997e.f10860r, abstractC0997e.f10861s);
        if (z4) {
            return;
        }
        if (x()) {
            this.f10890x.z(false);
            for (e0 e0Var : this.y) {
                e0Var.z(false);
            }
        } else if (abstractC0997e instanceof AbstractC0993a) {
            ArrayList arrayList = this.f10888v;
            j(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f10871D = this.f10872E;
            }
        }
        this.f10883q.d(this);
    }

    @Override // x0.h0
    public final long r() {
        if (x()) {
            return this.f10871D;
        }
        if (this.f10877J) {
            return Long.MIN_VALUE;
        }
        return m().f10861s;
    }

    @Override // x0.h0
    public final void u(long j5) {
        r rVar = this.f10886t;
        if (rVar.c() || x()) {
            return;
        }
        boolean zD = rVar.d();
        i iVar = this.f10882p;
        ArrayList arrayList = this.f10888v;
        List list = this.f10889w;
        if (zD) {
            AbstractC0997e abstractC0997e = this.f10868A;
            abstractC0997e.getClass();
            boolean z4 = abstractC0997e instanceof AbstractC0993a;
            if (!(z4 && w(arrayList.size() - 1)) && iVar.c(j5, abstractC0997e, list)) {
                rVar.b();
                if (z4) {
                    this.f10874G = (AbstractC0993a) abstractC0997e;
                    return;
                }
                return;
            }
            return;
        }
        int iF = iVar.f(j5, list);
        if (iF < arrayList.size()) {
            AbstractC0360m.h(!rVar.d());
            int size = arrayList.size();
            while (true) {
                if (iF >= size) {
                    iF = -1;
                    break;
                } else if (!w(iF)) {
                    break;
                } else {
                    iF++;
                }
            }
            if (iF == -1) {
                return;
            }
            long j6 = m().f10861s;
            AbstractC0993a abstractC0993aJ = j(iF);
            if (arrayList.isEmpty()) {
                this.f10871D = this.f10872E;
            }
            this.f10877J = false;
            m0.e eVar = this.f10884r;
            u0.g gVar = new u0.g(1, this.f10878l, null, 3, null, AbstractC0370w.Z(abstractC0993aJ.f10860r), AbstractC0370w.Z(j6));
            H h2 = eVar.f8497b;
            h2.getClass();
            eVar.a(new K(eVar, h2, gVar, 3));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // x0.h0
    public final boolean v(T t4) {
        long j5;
        List listEmptyList;
        if (!this.f10877J) {
            r rVar = this.f10886t;
            if (!rVar.d() && !rVar.c()) {
                boolean zX = x();
                if (zX) {
                    listEmptyList = Collections.emptyList();
                    j5 = this.f10871D;
                } else {
                    j5 = m().f10861s;
                    listEmptyList = this.f10889w;
                }
                this.f10882p.e(t4, j5, listEmptyList, this.f10887u);
                C0187m c0187m = this.f10887u;
                boolean z4 = c0187m.f3362a;
                AbstractC0997e abstractC0997e = (AbstractC0997e) c0187m.f3363b;
                c0187m.f3363b = null;
                c0187m.f3362a = false;
                if (z4) {
                    this.f10871D = -9223372036854775807L;
                    this.f10877J = true;
                    return true;
                }
                if (abstractC0997e == null) {
                    return false;
                }
                this.f10868A = abstractC0997e;
                boolean z5 = abstractC0997e instanceof AbstractC0993a;
                Z1.e eVar = this.f10891z;
                if (z5) {
                    AbstractC0993a abstractC0993a = (AbstractC0993a) abstractC0997e;
                    if (zX) {
                        long j6 = this.f10871D;
                        if (abstractC0993a.f10860r < j6) {
                            this.f10890x.f10700t = j6;
                            for (e0 e0Var : this.y) {
                                e0Var.f10700t = this.f10871D;
                            }
                            if (this.f10875H) {
                                C0190p c0190p = abstractC0993a.f10857o;
                                this.f10876I = !AbstractC0156G.a(c0190p.f3424n, c0190p.f3421k);
                            }
                        }
                        this.f10875H = false;
                        this.f10871D = -9223372036854775807L;
                    }
                    abstractC0993a.f10833x = eVar;
                    e0[] e0VarArr = (e0[]) eVar.f3002n;
                    int[] iArr = new int[e0VarArr.length];
                    for (int i = 0; i < e0VarArr.length; i++) {
                        e0 e0Var2 = e0VarArr[i];
                        iArr[i] = e0Var2.f10697q + e0Var2.f10696p;
                    }
                    abstractC0993a.y = iArr;
                    this.f10888v.add(abstractC0993a);
                } else if (abstractC0997e instanceof k) {
                    ((k) abstractC0997e).f10899v = eVar;
                }
                this.f10884r.h(new C0984z(abstractC0997e.f10854l, abstractC0997e.f10855m, rVar.f(abstractC0997e, this, this.f10885s.o(abstractC0997e.f10856n))), abstractC0997e.f10856n, this.f10878l, abstractC0997e.f10857o, abstractC0997e.f10858p, abstractC0997e.f10859q, abstractC0997e.f10860r, abstractC0997e.f10861s);
                return true;
            }
        }
        return false;
    }

    public final boolean w(int i) {
        int iN;
        AbstractC0993a abstractC0993a = (AbstractC0993a) this.f10888v.get(i);
        if (this.f10890x.n() > abstractC0993a.c(0)) {
            return true;
        }
        int i5 = 0;
        do {
            e0[] e0VarArr = this.y;
            if (i5 >= e0VarArr.length) {
                return false;
            }
            iN = e0VarArr[i5].n();
            i5++;
        } while (iN <= abstractC0993a.c(i5));
        return true;
    }

    public final boolean x() {
        return this.f10871D != -9223372036854775807L;
    }

    public final void y() {
        int iZ = z(this.f10890x.n(), this.f10873F - 1);
        while (true) {
            int i = this.f10873F;
            if (i > iZ) {
                return;
            }
            this.f10873F = i + 1;
            AbstractC0993a abstractC0993a = (AbstractC0993a) this.f10888v.get(i);
            C0190p c0190p = abstractC0993a.f10857o;
            if (!c0190p.equals(this.f10869B)) {
                this.f10884r.b(this.f10878l, c0190p, abstractC0993a.f10858p, abstractC0993a.f10859q, abstractC0993a.f10860r);
            }
            this.f10869B = c0190p;
        }
    }

    public final int z(int i, int i5) {
        ArrayList arrayList;
        do {
            i5++;
            arrayList = this.f10888v;
            if (i5 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC0993a) arrayList.get(i5)).c(0) <= i);
        return i5 - 1;
    }
}
