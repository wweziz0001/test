package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f4329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4334h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f4335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f4336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final T f4337l;

    public Y(int i, int i5, T t4) {
        AbstractC0307a.r("finalState", i);
        AbstractC0307a.r("lifecycleImpact", i5);
        N3.h.e(t4, "fragmentStateManager");
        r rVar = t4.f4307c;
        N3.h.d(rVar, "fragmentStateManager.fragment");
        AbstractC0307a.r("finalState", i);
        AbstractC0307a.r("lifecycleImpact", i5);
        N3.h.e(rVar, "fragment");
        this.f4327a = i;
        this.f4328b = i5;
        this.f4329c = rVar;
        this.f4330d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.f4335j = arrayList;
        this.f4336k = arrayList;
        this.f4337l = t4;
    }

    public final void a(ViewGroup viewGroup) {
        N3.h.e(viewGroup, "container");
        this.f4334h = false;
        if (this.f4331e) {
            return;
        }
        this.f4331e = true;
        if (this.f4335j.isEmpty()) {
            b();
            return;
        }
        for (X x4 : C3.f.X(this.f4336k)) {
            x4.getClass();
            if (!x4.f4326b) {
                x4.a(viewGroup);
            }
            x4.f4326b = true;
        }
    }

    public final void b() {
        this.f4334h = false;
        if (!this.f4332f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4332f = true;
            Iterator it = this.f4330d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f4329c.f4451x = false;
        this.f4337l.k();
    }

    public final void c(X x4) {
        N3.h.e(x4, "effect");
        ArrayList arrayList = this.f4335j;
        if (arrayList.remove(x4) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i, int i5) {
        AbstractC0307a.r("finalState", i);
        AbstractC0307a.r("lifecycleImpact", i5);
        int iB = O.i.b(i5);
        r rVar = this.f4329c;
        if (iB == 0) {
            if (this.f4327a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + rVar + " mFinalState = " + AbstractC0307a.z(this.f4327a) + " -> " + AbstractC0307a.z(i) + '.');
                }
                this.f4327a = i;
                return;
            }
            return;
        }
        if (iB == 1) {
            if (this.f4327a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + rVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0307a.y(this.f4328b) + " to ADDING.");
                }
                this.f4327a = 2;
                this.f4328b = 2;
                this.i = true;
                return;
            }
            return;
        }
        if (iB != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + rVar + " mFinalState = " + AbstractC0307a.z(this.f4327a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0307a.y(this.f4328b) + " to REMOVING.");
        }
        this.f4327a = 1;
        this.f4328b = 3;
        this.i = true;
    }

    public final String toString() {
        StringBuilder sbM = AbstractC0307a.m("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbM.append(AbstractC0307a.z(this.f4327a));
        sbM.append(" lifecycleImpact = ");
        sbM.append(AbstractC0307a.y(this.f4328b));
        sbM.append(" fragment = ");
        sbM.append(this.f4329c);
        sbM.append('}');
        return sbM.toString();
    }
}
