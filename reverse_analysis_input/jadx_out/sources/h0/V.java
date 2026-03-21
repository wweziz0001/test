package h0;

import a0.AbstractC0169U;
import android.util.Pair;
import d0.AbstractC0360m;
import x0.AbstractC0960a;
import x0.C0963d;
import x0.C0981w;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.f0[] f6049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public W f6053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6054h;
    public final boolean[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q0[] f6055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A0.z f6056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0 f6057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public V f6058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x0.q0 f6059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A0.A f6060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6061p;

    public V(q0[] q0VarArr, long j5, A0.z zVar, B0.f fVar, g0 g0Var, W w4, A0.A a5) {
        this.f6055j = q0VarArr;
        this.f6061p = j5;
        this.f6056k = zVar;
        this.f6057l = g0Var;
        x0.H h2 = w4.f6062a;
        this.f6048b = h2.f10531a;
        this.f6053g = w4;
        this.f6059n = x0.q0.f10775d;
        this.f6060o = a5;
        this.f6049c = new x0.f0[q0VarArr.length];
        this.i = new boolean[q0VarArr.length];
        g0Var.getClass();
        int i = AbstractC0450a.f6086d;
        Pair pair = (Pair) h2.f10531a;
        Object obj = pair.first;
        x0.H hA = h2.a(pair.second);
        f0 f0Var = (f0) g0Var.f6138d.get(obj);
        f0Var.getClass();
        g0Var.f6141g.add(f0Var);
        e0 e0Var = (e0) g0Var.f6140f.get(f0Var);
        if (e0Var != null) {
            ((AbstractC0960a) e0Var.f6117a).l(e0Var.f6118b);
        }
        f0Var.f6124c.add(hA);
        x0.F fC = f0Var.f6122a.c(hA, fVar, w4.f6063b);
        g0Var.f6137c.put(fC, f0Var);
        g0Var.c();
        long j6 = w4.f6065d;
        this.f6047a = j6 != -9223372036854775807L ? new C0963d(fC, true, 0L, j6) : fC;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, x0.F] */
    public final long a(A0.A a5, long j5, boolean z4, boolean[] zArr) {
        q0[] q0VarArr;
        x0.f0[] f0VarArr;
        int i = 0;
        while (true) {
            boolean z5 = true;
            if (i >= a5.f40a) {
                break;
            }
            if (z4 || !a5.a(this.f6060o, i)) {
                z5 = false;
            }
            this.i[i] = z5;
            i++;
        }
        int i5 = 0;
        while (true) {
            q0VarArr = this.f6055j;
            int length = q0VarArr.length;
            f0VarArr = this.f6049c;
            if (i5 >= length) {
                break;
            }
            if (q0VarArr[i5].getTrackType() == -2) {
                f0VarArr[i5] = null;
            }
            i5++;
        }
        b();
        this.f6060o = a5;
        c();
        long jF = this.f6047a.f(a5.f42c, this.i, this.f6049c, zArr, j5);
        for (int i6 = 0; i6 < q0VarArr.length; i6++) {
            if (q0VarArr[i6].getTrackType() == -2 && this.f6060o.b(i6)) {
                f0VarArr[i6] = new C0981w();
            }
        }
        this.f6052f = false;
        for (int i7 = 0; i7 < f0VarArr.length; i7++) {
            if (f0VarArr[i7] != null) {
                AbstractC0360m.h(a5.b(i7));
                if (q0VarArr[i7].getTrackType() != -2) {
                    this.f6052f = true;
                }
            } else {
                AbstractC0360m.h(a5.f42c[i7] == null);
            }
        }
        return jF;
    }

    public final void b() {
        if (this.f6058m != null) {
            return;
        }
        int i = 0;
        while (true) {
            A0.A a5 = this.f6060o;
            if (i >= a5.f40a) {
                return;
            }
            boolean zB = a5.b(i);
            A0.w wVar = this.f6060o.f42c[i];
            if (zB && wVar != null) {
                wVar.disable();
            }
            i++;
        }
    }

    public final void c() {
        if (this.f6058m != null) {
            return;
        }
        int i = 0;
        while (true) {
            A0.A a5 = this.f6060o;
            if (i >= a5.f40a) {
                return;
            }
            boolean zB = a5.b(i);
            A0.w wVar = this.f6060o.f42c[i];
            if (zB && wVar != null) {
                wVar.h();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, x0.h0] */
    public final long d() {
        if (!this.f6051e) {
            return this.f6053g.f6063b;
        }
        long jH = this.f6052f ? this.f6047a.h() : Long.MIN_VALUE;
        return jH == Long.MIN_VALUE ? this.f6053g.f6066e : jH;
    }

    public final long e() {
        return this.f6053g.f6063b + this.f6061p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, x0.F] */
    public final void f(float f2, AbstractC0169U abstractC0169U, boolean z4) {
        this.f6051e = true;
        this.f6059n = this.f6047a.e();
        A0.A aJ = j(f2, abstractC0169U, z4);
        W w4 = this.f6053g;
        long j5 = w4.f6066e;
        long jMax = w4.f6063b;
        if (j5 != -9223372036854775807L && jMax >= j5) {
            jMax = Math.max(0L, j5 - 1);
        }
        long jA = a(aJ, jMax, false, new boolean[this.f6055j.length]);
        long j6 = this.f6061p;
        W w5 = this.f6053g;
        this.f6061p = (w5.f6063b - jA) + j6;
        this.f6053g = w5.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, x0.h0] */
    public final boolean g() {
        return this.f6051e && (!this.f6052f || this.f6047a.h() == Long.MIN_VALUE);
    }

    public final boolean h() {
        return this.f6051e && (g() || d() - this.f6053g.f6063b >= -9223372036854775807L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x0.F] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        b();
        ?? r02 = this.f6047a;
        try {
            boolean z4 = r02 instanceof C0963d;
            g0 g0Var = this.f6057l;
            if (z4) {
                g0Var.f(((C0963d) r02).f10664l);
            } else {
                g0Var.f(r02);
            }
        } catch (RuntimeException e5) {
            AbstractC0360m.m("MediaPeriodHolder", "Period release failed.", e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A0.A j(float r35, a0.AbstractC0169U r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 2127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.V.j(float, a0.U, boolean):A0.A");
    }

    public final void k() {
        Object obj = this.f6047a;
        if (obj instanceof C0963d) {
            long j5 = this.f6053g.f6065d;
            if (j5 == -9223372036854775807L) {
                j5 = Long.MIN_VALUE;
            }
            C0963d c0963d = (C0963d) obj;
            c0963d.f10668p = 0L;
            c0963d.f10669q = j5;
        }
    }
}
