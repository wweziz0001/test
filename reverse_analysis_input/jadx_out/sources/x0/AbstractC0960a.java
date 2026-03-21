package x0;

import a0.AbstractC0169U;
import android.os.Looper;
import d0.AbstractC0360m;
import f0.InterfaceC0403A;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: x0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0960a implements J {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f10634l = new ArrayList(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f10635m = new HashSet(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m0.e f10636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m0.e f10637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Looper f10638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AbstractC0169U f10639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i0.j f10640r;

    public AbstractC0960a() {
        int i = 0;
        H h2 = null;
        this.f10636n = new m0.e(new CopyOnWriteArrayList(), i, h2);
        this.f10637o = new m0.e(new CopyOnWriteArrayList(), i, h2);
    }

    public final m0.e h(H h2) {
        return new m0.e(this.f10636n.f8498c, 0, h2);
    }

    public final void j(I i) {
        HashSet hashSet = this.f10635m;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(i);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        k();
    }

    public final void l(I i) {
        this.f10638p.getClass();
        HashSet hashSet = this.f10635m;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(i);
        if (zIsEmpty) {
            m();
        }
    }

    public final void o(I i, InterfaceC0403A interfaceC0403A, i0.j jVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f10638p;
        AbstractC0360m.c(looper == null || looper == looperMyLooper);
        this.f10640r = jVar;
        AbstractC0169U abstractC0169U = this.f10639q;
        this.f10634l.add(i);
        if (this.f10638p == null) {
            this.f10638p = looperMyLooper;
            this.f10635m.add(i);
            p(interfaceC0403A);
        } else if (abstractC0169U != null) {
            l(i);
            i.a(this, abstractC0169U);
        }
    }

    public abstract void p(InterfaceC0403A interfaceC0403A);

    public final void r(AbstractC0169U abstractC0169U) {
        this.f10639q = abstractC0169U;
        Iterator it = this.f10634l.iterator();
        while (it.hasNext()) {
            ((I) it.next()).a(this, abstractC0169U);
        }
    }

    public final void s(I i) {
        ArrayList arrayList = this.f10634l;
        arrayList.remove(i);
        if (!arrayList.isEmpty()) {
            j(i);
            return;
        }
        this.f10638p = null;
        this.f10639q = null;
        this.f10640r = null;
        this.f10635m.clear();
        t();
    }

    public abstract void t();

    public final void u(m0.f fVar) {
        CopyOnWriteArrayList<m0.d> copyOnWriteArrayList = this.f10637o.f8498c;
        for (m0.d dVar : copyOnWriteArrayList) {
            if (dVar.f8495a == fVar) {
                copyOnWriteArrayList.remove(dVar);
            }
        }
    }

    public final void v(N n4) {
        CopyOnWriteArrayList<M> copyOnWriteArrayList = this.f10636n.f8498c;
        for (M m4 : copyOnWriteArrayList) {
            if (m4.f10546b == n4) {
                copyOnWriteArrayList.remove(m4);
            }
        }
    }

    public void k() {
    }

    public void m() {
    }
}
