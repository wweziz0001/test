package androidx.fragment.app;

import a.AbstractC0149a;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b3.AbstractC0307a;
import com.example.hqp_mobile_app.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0246m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f4391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4395e;

    public C0246m(ViewGroup viewGroup) {
        N3.h.e(viewGroup, "container");
        this.f4391a = viewGroup;
        this.f4392b = new ArrayList();
        this.f4393c = new ArrayList();
    }

    public static final C0246m j(ViewGroup viewGroup, L l3) {
        N3.h.e(viewGroup, "container");
        N3.h.e(l3, "fragmentManager");
        N3.h.d(l3.H(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0246m) {
            return (C0246m) tag;
        }
        C0246m c0246m = new C0246m(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0246m);
        return c0246m;
    }

    public final void a(Y y) {
        N3.h.e(y, "operation");
        if (y.i) {
            AbstractC0307a.a(y.f4327a, y.f4329c.o(), this.f4391a);
            y.i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z4) {
        Object obj;
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Y y = (Y) next;
            io.flutter.embedding.android.D d5 = y.f4329c.f4425Q;
            N3.h.d(d5, "operation.fragment.mView");
            if (AbstractC0149a.e(d5) == 2 && y.f4327a != 2) {
                break;
            }
        }
        Y y4 = (Y) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            Y y5 = (Y) objPrevious;
            io.flutter.embedding.android.D d6 = y5.f4329c.f4425Q;
            N3.h.d(d6, "operation.fragment.mView");
            if (AbstractC0149a.e(d6) != 2 && y5.f4327a == 2) {
                obj = objPrevious;
                break;
            }
        }
        Y y6 = (Y) obj;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + y4 + " to " + y6);
        }
        ArrayList<C0240g> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        r rVar = ((Y) arrayList.get(arrayList.size() - 1)).f4329c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0250q c0250q = ((Y) it2.next()).f4329c.f4428T;
            C0250q c0250q2 = rVar.f4428T;
            c0250q.f4400b = c0250q2.f4400b;
            c0250q.f4401c = c0250q2.f4401c;
            c0250q.f4402d = c0250q2.f4402d;
            c0250q.f4403e = c0250q2.f4403e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            boolean z5 = false;
            if (!it3.hasNext()) {
                break;
            }
            Y y7 = (Y) it3.next();
            arrayList2.add(new C0240g(y7, z4));
            if (!z4 ? y7 == y6 : y7 == y4) {
                z5 = true;
            }
            C0245l c0245l = new C0245l(y7);
            int i = y7.f4327a;
            r rVar2 = y7.f4329c;
            if (i == 2) {
                if (z4) {
                    C0250q c0250q3 = rVar2.f4428T;
                } else {
                    rVar2.getClass();
                }
            } else if (z4) {
                C0250q c0250q4 = rVar2.f4428T;
            } else {
                rVar2.getClass();
            }
            if (y7.f4327a == 2) {
                if (z4) {
                    C0250q c0250q5 = rVar2.f4428T;
                } else {
                    C0250q c0250q6 = rVar2.f4428T;
                }
            }
            if (z5) {
                if (z4) {
                    C0250q c0250q7 = rVar2.f4428T;
                } else {
                    rVar2.getClass();
                }
            }
            arrayList3.add(c0245l);
            y7.f4330d.add(new RunnableC0237d(this, y7, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!((C0245l) obj2).j()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((C0245l) it4.next()).getClass();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((C0245l) it5.next()).getClass();
        }
        ArrayList<C0240g> arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            C3.l.S(arrayList7, ((Y) ((C0240g) it6.next()).f1479a).f4336k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        boolean z6 = false;
        for (C0240g c0240g : arrayList2) {
            Context context = this.f4391a.getContext();
            Y y8 = (Y) c0240g.f1479a;
            N3.h.d(context, "context");
            Z1.e eVarP = c0240g.p(context);
            if (eVarP != null) {
                if (((AnimatorSet) eVarP.f3002n) == null) {
                    arrayList6.add(c0240g);
                } else {
                    r rVar3 = y8.f4329c;
                    if (y8.f4336k.isEmpty()) {
                        if (y8.f4327a == 3) {
                            y8.i = false;
                        }
                        y8.f4335j.add(new C0242i(c0240g));
                        z6 = true;
                    } else if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + rVar3 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (C0240g c0240g2 : arrayList6) {
            Y y9 = (Y) c0240g2.f1479a;
            r rVar4 = y9.f4329c;
            if (zIsEmpty) {
                if (!z6) {
                    y9.f4335j.add(new C0239f(c0240g2));
                } else if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + rVar4 + " as Animations cannot run alongside Animators.");
                }
            } else if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + rVar4 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void c(ArrayList arrayList) {
        N3.h.e(arrayList, "operations");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3.l.S(arrayList2, ((Y) it.next()).f4336k);
        }
        List listX = C3.f.X(C3.f.Z(arrayList2));
        int size = listX.size();
        for (int i = 0; i < size; i++) {
            ((X) listX.get(i)).b(this.f4391a);
        }
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            a((Y) arrayList.get(i5));
        }
        List listX2 = C3.f.X(arrayList);
        int size3 = listX2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            Y y = (Y) listX2.get(i6);
            if (y.f4336k.isEmpty()) {
                y.b();
            }
        }
    }

    public final void d(int i, int i5, T t4) {
        synchronized (this.f4392b) {
            try {
                r rVar = t4.f4307c;
                N3.h.d(rVar, "fragmentStateManager.fragment");
                Y yG = g(rVar);
                if (yG == null) {
                    r rVar2 = t4.f4307c;
                    yG = rVar2.f4451x ? h(rVar2) : null;
                }
                if (yG != null) {
                    yG.d(i, i5);
                    return;
                }
                Y y = new Y(i, i5, t4);
                this.f4392b.add(y);
                y.f4330d.add(new RunnableC0237d(this, y, 1));
                y.f4330d.add(new RunnableC0237d(this, y, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, T t4) {
        AbstractC0307a.r("finalState", i);
        N3.h.e(t4, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + t4.f4307c);
        }
        d(i, 2, t4);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0246m.f():void");
    }

    public final Y g(r rVar) {
        Object next;
        Iterator it = this.f4392b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Y y = (Y) next;
            if (N3.h.a(y.f4329c, rVar) && !y.f4331e) {
                break;
            }
        }
        return (Y) next;
    }

    public final Y h(r rVar) {
        Object next;
        Iterator it = this.f4393c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Y y = (Y) next;
            if (N3.h.a(y.f4329c, rVar) && !y.f4331e) {
                break;
            }
        }
        return (Y) next;
    }

    public final void i() {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f4391a.isAttachedToWindow();
        synchronized (this.f4392b) {
            try {
                l();
                k(this.f4392b);
                for (Y y : C3.f.Y(this.f4393c)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f4391a + " is not attached to window. ") + "Cancelling running operation " + y);
                    }
                    y.a(this.f4391a);
                }
                for (Y y4 : C3.f.Y(this.f4392b)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f4391a + " is not attached to window. ") + "Cancelling pending operation " + y4);
                    }
                    y4.a(this.f4391a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Y y = (Y) arrayList.get(i);
            if (!y.f4334h) {
                y.f4334h = true;
                int i5 = y.f4328b;
                T t4 = y.f4337l;
                if (i5 == 2) {
                    r rVar = t4.f4307c;
                    N3.h.d(rVar, "fragmentStateManager.fragment");
                    View viewFindFocus = rVar.f4425Q.findFocus();
                    if (viewFindFocus != null) {
                        rVar.a().f4408k = viewFindFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + rVar);
                        }
                    }
                    View viewO = y.f4329c.o();
                    if (viewO.getParent() == null) {
                        t4.b();
                        viewO.setAlpha(0.0f);
                    }
                    if (viewO.getAlpha() == 0.0f && viewO.getVisibility() == 0) {
                        viewO.setVisibility(4);
                    }
                    C0250q c0250q = rVar.f4428T;
                    viewO.setAlpha(c0250q == null ? 1.0f : c0250q.f4407j);
                } else if (i5 == 3) {
                    r rVar2 = t4.f4307c;
                    N3.h.d(rVar2, "fragmentStateManager.fragment");
                    View viewO2 = rVar2.o();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewO2.findFocus() + " on view " + viewO2 + " for Fragment " + rVar2);
                    }
                    viewO2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3.l.S(arrayList2, ((Y) it.next()).f4336k);
        }
        List listX = C3.f.X(C3.f.Z(arrayList2));
        int size2 = listX.size();
        for (int i6 = 0; i6 < size2; i6++) {
            X x4 = (X) listX.get(i6);
            x4.getClass();
            ViewGroup viewGroup = this.f4391a;
            N3.h.e(viewGroup, "container");
            if (!x4.f4325a) {
                x4.d(viewGroup);
            }
            x4.f4325a = true;
        }
    }

    public final void l() {
        for (Y y : this.f4392b) {
            int i = 2;
            if (y.f4328b == 2) {
                int visibility = y.f4329c.o().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC0307a.i("Unknown visibility ", visibility));
                        }
                        i = 3;
                    }
                }
                y.d(i, 1);
            }
        }
    }
}
