package h0;

import a0.AbstractC0169U;
import android.os.Handler;
import android.os.Looper;
import d0.AbstractC0370w;
import d0.C0367t;
import f0.InterfaceC0403A;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import x0.AbstractC0960a;
import x0.C0955A;
import x0.C0958D;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.j f6135a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N f6139e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0.c f6142h;
    public final C0367t i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC0403A f6145l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x0.j0 f6143j = new x0.i0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f6137c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f6138d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6136b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f6140f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f6141g = new HashSet();

    public g0(N n4, i0.c cVar, C0367t c0367t, i0.j jVar) {
        this.f6135a = jVar;
        this.f6139e = n4;
        this.f6142h = cVar;
        this.i = c0367t;
    }

    public final AbstractC0169U a(int i, ArrayList arrayList, x0.j0 j0Var) {
        if (!arrayList.isEmpty()) {
            this.f6143j = j0Var;
            for (int i5 = i; i5 < arrayList.size() + i; i5++) {
                f0 f0Var = (f0) arrayList.get(i5 - i);
                ArrayList arrayList2 = this.f6136b;
                if (i5 > 0) {
                    f0 f0Var2 = (f0) arrayList2.get(i5 - 1);
                    f0Var.f6125d = f0Var2.f6122a.f10530z.f10811b.o() + f0Var2.f6125d;
                    f0Var.f6126e = false;
                    f0Var.f6124c.clear();
                } else {
                    f0Var.f6125d = 0;
                    f0Var.f6126e = false;
                    f0Var.f6124c.clear();
                }
                int iO = f0Var.f6122a.f10530z.f10811b.o();
                for (int i6 = i5; i6 < arrayList2.size(); i6++) {
                    ((f0) arrayList2.get(i6)).f6125d += iO;
                }
                arrayList2.add(i5, f0Var);
                this.f6138d.put(f0Var.f6123b, f0Var);
                if (this.f6144k) {
                    e(f0Var);
                    if (this.f6137c.isEmpty()) {
                        this.f6141g.add(f0Var);
                    } else {
                        e0 e0Var = (e0) this.f6140f.get(f0Var);
                        if (e0Var != null) {
                            ((AbstractC0960a) e0Var.f6117a).j(e0Var.f6118b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final AbstractC0169U b() {
        ArrayList arrayList = this.f6136b;
        if (arrayList.isEmpty()) {
            return AbstractC0169U.f3260a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            f0 f0Var = (f0) arrayList.get(i);
            f0Var.f6125d = iO;
            iO += f0Var.f6122a.f10530z.f10811b.o();
        }
        return new n0(arrayList, this.f6143j);
    }

    public final void c() {
        Iterator it = this.f6141g.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            if (f0Var.f6124c.isEmpty()) {
                e0 e0Var = (e0) this.f6140f.get(f0Var);
                if (e0Var != null) {
                    ((AbstractC0960a) e0Var.f6117a).j(e0Var.f6118b);
                }
                it.remove();
            }
        }
    }

    public final void d(f0 f0Var) {
        if (f0Var.f6126e && f0Var.f6124c.isEmpty()) {
            e0 e0Var = (e0) this.f6140f.remove(f0Var);
            e0Var.getClass();
            Z z4 = e0Var.f6118b;
            AbstractC0960a abstractC0960a = (AbstractC0960a) e0Var.f6117a;
            abstractC0960a.s(z4);
            d0 d0Var = e0Var.f6119c;
            abstractC0960a.v(d0Var);
            abstractC0960a.u(d0Var);
            this.f6141g.remove(f0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [h0.Z, x0.I] */
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
    public final void e(f0 f0Var) {
        C0958D c0958d = f0Var.f6122a;
        ?? r12 = new x0.I() { // from class: h0.Z
            @Override // x0.I
            public final void a(AbstractC0960a abstractC0960a, AbstractC0169U abstractC0169U) {
                C0367t c0367t = this.f6085a.f6139e.f6032t;
                c0367t.d(2);
                c0367t.e(22);
            }
        };
        d0 d0Var = new d0(this, f0Var);
        this.f6140f.put(f0Var, new e0(c0958d, r12, d0Var));
        int i = AbstractC0370w.f5326a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c0958d.getClass();
        m0.e eVar = c0958d.f10636n;
        eVar.getClass();
        x0.M m4 = new x0.M();
        m4.f10545a = handler;
        m4.f10546b = d0Var;
        eVar.f8498c.add(m4);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        m0.e eVar2 = c0958d.f10637o;
        eVar2.getClass();
        m0.d dVar = new m0.d();
        dVar.f8495a = d0Var;
        eVar2.f8498c.add(dVar);
        c0958d.o(r12, this.f6145l, this.f6135a);
    }

    public final void f(x0.F f2) {
        IdentityHashMap identityHashMap = this.f6137c;
        f0 f0Var = (f0) identityHashMap.remove(f2);
        f0Var.getClass();
        f0Var.f6122a.d(f2);
        f0Var.f6124c.remove(((C0955A) f2).f10513l);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(f0Var);
    }

    public final void g(int i, int i5) {
        for (int i6 = i5 - 1; i6 >= i; i6--) {
            ArrayList arrayList = this.f6136b;
            f0 f0Var = (f0) arrayList.remove(i6);
            this.f6138d.remove(f0Var.f6123b);
            int i7 = -f0Var.f6122a.f10530z.f10811b.o();
            for (int i8 = i6; i8 < arrayList.size(); i8++) {
                ((f0) arrayList.get(i8)).f6125d += i7;
            }
            f0Var.f6126e = true;
            if (this.f6144k) {
                d(f0Var);
            }
        }
    }
}
