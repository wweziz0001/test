package androidx.fragment.app;

import D.AbstractC0023x;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0280w;
import androidx.lifecycle.EnumC0272n;
import androidx.lifecycle.EnumC0273o;
import b3.AbstractC0307a;
import com.example.hqp_mobile_app.R;
import e3.C0394c;
import io.flutter.embedding.android.C0492k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m.B0;
import m3.C0669c;
import q.C0740j;
import v1.C0912b;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.l f4305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1.i f4306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f4307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4308d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4309e = -1;

    public T(Z1.l lVar, Z1.i iVar, r rVar) {
        this.f4305a = lVar;
        this.f4306b = iVar;
        this.f4307c = rVar;
    }

    public final void a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f4307c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + rVar);
        }
        Bundle bundle = rVar.f4440m;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        rVar.f4415F.O();
        rVar.f4439l = 3;
        rVar.f4423O = true;
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + rVar);
        }
        if (rVar.f4425Q != null) {
            Bundle bundle2 = rVar.f4440m;
            if (bundle2 != null) {
                bundle2.getBundle("savedInstanceState");
            }
            SparseArray<Parcelable> sparseArray = rVar.f4441n;
            if (sparseArray != null) {
                rVar.f4425Q.restoreHierarchyState(sparseArray);
                rVar.f4441n = null;
            }
            rVar.f4423O = true;
            if (rVar.f4425Q != null) {
                rVar.f4434Z.a(EnumC0272n.ON_CREATE);
            }
        }
        rVar.f4440m = null;
        M m4 = rVar.f4415F;
        m4.f4244G = false;
        m4.f4245H = false;
        m4.f4250N.i = false;
        m4.u(4);
        this.f4305a.D(rVar, false);
    }

    public final void b() {
        r rVar;
        io.flutter.embedding.android.D d5;
        io.flutter.embedding.android.D d6;
        int iIndexOfChild = -1;
        r rVar2 = this.f4307c;
        View view = rVar2.f4424P;
        while (true) {
            rVar = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            r rVar3 = tag instanceof r ? (r) tag : null;
            if (rVar3 != null) {
                rVar = rVar3;
                break;
            } else {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
        }
        r rVar4 = rVar2.f4416G;
        if (rVar != null && !rVar.equals(rVar4)) {
            int i = rVar2.f4418I;
            V.c cVar = V.d.f2312a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(rVar2);
            sb.append(" within the view of parent fragment ");
            sb.append(rVar);
            sb.append(" via container with ID ");
            V.d.b(new V.a(rVar2, AbstractC0307a.l(sb, i, " without using parent's childFragmentManager")));
            V.d.a(rVar2).getClass();
        }
        Z1.i iVar = this.f4306b;
        iVar.getClass();
        ViewGroup viewGroup = rVar2.f4424P;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) iVar.f3012l;
            int iIndexOf = arrayList.indexOf(rVar2);
            int i5 = iIndexOf - 1;
            while (true) {
                if (i5 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        r rVar5 = (r) arrayList.get(iIndexOf);
                        if (rVar5.f4424P == viewGroup && (d5 = rVar5.f4425Q) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(d5);
                            break;
                        }
                    }
                } else {
                    r rVar6 = (r) arrayList.get(i5);
                    if (rVar6.f4424P == viewGroup && (d6 = rVar6.f4425Q) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(d6) + 1;
                        break;
                    }
                    i5--;
                }
            }
        }
        rVar2.f4424P.addView(rVar2.f4425Q, iIndexOfChild);
    }

    public final void c() {
        T t4;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f4307c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + rVar);
        }
        r rVar2 = rVar.f4445r;
        Z1.i iVar = this.f4306b;
        if (rVar2 != null) {
            t4 = (T) ((HashMap) iVar.f3013m).get(rVar2.f4443p);
            if (t4 == null) {
                throw new IllegalStateException("Fragment " + rVar + " declared target fragment " + rVar.f4445r + " that does not belong to this FragmentManager!");
            }
            rVar.f4446s = rVar.f4445r.f4443p;
            rVar.f4445r = null;
        } else {
            String str = rVar.f4446s;
            if (str != null) {
                t4 = (T) ((HashMap) iVar.f3013m).get(str);
                if (t4 == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(rVar);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(B0.i(sb, rVar.f4446s, " that does not belong to this FragmentManager!"));
                }
            } else {
                t4 = null;
            }
        }
        if (t4 != null) {
            t4.k();
        }
        L l3 = rVar.f4413D;
        rVar.f4414E = l3.f4272v;
        rVar.f4416G = l3.f4274x;
        Z1.l lVar = this.f4305a;
        lVar.J(rVar, false);
        ArrayList arrayList = rVar.f4437c0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0248o) it.next()).a();
        }
        arrayList.clear();
        rVar.f4415F.b(rVar.f4414E, new C0249p(rVar), rVar);
        rVar.f4439l = 0;
        rVar.f4423O = false;
        AbstractActivityC0255w abstractActivityC0255w = rVar.f4414E.f4459r;
        io.flutter.embedding.android.r rVar3 = (io.flutter.embedding.android.r) rVar;
        rVar3.f4423O = true;
        C0254v c0254v = rVar3.f4414E;
        if ((c0254v != null ? c0254v.f4458q : null) != null) {
            rVar3.f4423O = true;
        }
        rVar3.f6609h0.getClass();
        C0492k c0492k = new C0492k(rVar3);
        rVar3.f6608g0 = c0492k;
        c0492k.f();
        if (rVar3.f4444q.getBoolean("should_automatically_handle_on_back_pressed", false)) {
            androidx.activity.x onBackPressedDispatcher = rVar3.m().getOnBackPressedDispatcher();
            D d5 = rVar3.f6610i0;
            onBackPressedDispatcher.a(rVar3, d5);
            d5.c(false);
        }
        abstractActivityC0255w.registerComponentCallbacks(rVar3);
        if (!rVar.f4423O) {
            throw new a0("Fragment " + rVar + " did not call through to super.onAttach()");
        }
        Iterator it2 = rVar.f4413D.f4265o.iterator();
        while (it2.hasNext()) {
            ((P) it2.next()).a(rVar);
        }
        M m4 = rVar.f4415F;
        m4.f4244G = false;
        m4.f4245H = false;
        m4.f4250N.i = false;
        m4.u(0);
        lVar.E(rVar, false);
    }

    public final int d() {
        r rVar = this.f4307c;
        if (rVar.f4413D == null) {
            return rVar.f4439l;
        }
        int iMin = this.f4309e;
        int iOrdinal = rVar.f4432X.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (rVar.y) {
            if (rVar.f4452z) {
                iMin = Math.max(this.f4309e, 2);
                io.flutter.embedding.android.D d5 = rVar.f4425Q;
                if (d5 != null && d5.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f4309e < 4 ? Math.min(iMin, rVar.f4439l) : Math.min(iMin, 1);
            }
        }
        if (!rVar.f4449v) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = rVar.f4424P;
        if (viewGroup != null) {
            C0246m c0246mJ = C0246m.j(viewGroup, rVar.e());
            c0246mJ.getClass();
            Y yG = c0246mJ.g(rVar);
            int i = yG != null ? yG.f4328b : 0;
            Y yH = c0246mJ.h(rVar);
            i = yH != null ? yH.f4328b : 0;
            int i5 = i == 0 ? -1 : Z.f4338a[O.i.b(i)];
            if (i5 != -1 && i5 != 1) {
                i = i;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (rVar.f4450w) {
            iMin = rVar.j() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (rVar.f4426R && rVar.f4439l < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (rVar.f4451x && rVar.f4424P != null) {
            iMin = Math.max(iMin, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + rVar);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        Bundle bundle2;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f4307c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + rVar);
        }
        Bundle bundle3 = rVar.f4440m;
        Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
        if (rVar.f4430V) {
            rVar.f4439l = 1;
            Bundle bundle5 = rVar.f4440m;
            if (bundle5 == null || (bundle = bundle5.getBundle("childFragmentManager")) == null) {
                return;
            }
            rVar.f4415F.T(bundle);
            M m4 = rVar.f4415F;
            m4.f4244G = false;
            m4.f4245H = false;
            m4.f4250N.i = false;
            m4.u(1);
            return;
        }
        Z1.l lVar = this.f4305a;
        lVar.K(rVar, false);
        rVar.f4415F.O();
        rVar.f4439l = 1;
        rVar.f4423O = false;
        rVar.f4433Y.a(new C0912b(rVar, 1));
        io.flutter.embedding.android.r rVar2 = (io.flutter.embedding.android.r) rVar;
        rVar2.f4423O = true;
        Bundle bundle6 = rVar2.f4440m;
        if (bundle6 != null && (bundle2 = bundle6.getBundle("childFragmentManager")) != null) {
            rVar2.f4415F.T(bundle2);
            M m5 = rVar2.f4415F;
            m5.f4244G = false;
            m5.f4245H = false;
            m5.f4250N.i = false;
            m5.u(1);
        }
        M m6 = rVar2.f4415F;
        if (m6.f4271u < 1) {
            m6.f4244G = false;
            m6.f4245H = false;
            m6.f4250N.i = false;
            m6.u(1);
        }
        if (bundle4 != null) {
            rVar2.f6610i0.c(bundle4.getBoolean("enableOnBackInvokedCallbackState"));
        }
        rVar2.f6608g0.l(bundle4);
        rVar.f4430V = true;
        if (rVar.f4423O) {
            rVar.f4433Y.e(EnumC0272n.ON_CREATE);
            lVar.F(rVar, false);
        } else {
            throw new a0("Fragment " + rVar + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String resourceName;
        int i = 0;
        r rVar = this.f4307c;
        if (rVar.y) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + rVar);
        }
        Bundle bundle = rVar.f4440m;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        rVar.l();
        ViewGroup viewGroup = rVar.f4424P;
        if (viewGroup == null) {
            int i5 = rVar.f4418I;
            if (i5 == 0) {
                viewGroup = null;
            } else {
                if (i5 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + rVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) rVar.f4413D.f4273w.D(i5);
                if (viewGroup == null) {
                    if (!rVar.f4410A) {
                        try {
                            resourceName = rVar.n().getResources().getResourceName(rVar.f4418I);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(rVar.f4418I) + " (" + resourceName + ") for fragment " + rVar);
                    }
                } else if (!(viewGroup instanceof C0257y)) {
                    V.c cVar = V.d.f2312a;
                    V.d.b(new V.a(rVar, "Attempting to add fragment " + rVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    V.d.a(rVar).getClass();
                }
            }
        }
        rVar.f4424P = viewGroup;
        rVar.k();
        if (rVar.f4425Q != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + rVar);
            }
            rVar.f4425Q.setSaveFromParentEnabled(false);
            rVar.f4425Q.setTag(R.id.fragment_container_view_tag, rVar);
            if (viewGroup != null) {
                b();
            }
            if (rVar.f4420K) {
                rVar.f4425Q.setVisibility(8);
            }
            if (rVar.f4425Q.isAttachedToWindow()) {
                io.flutter.embedding.android.D d5 = rVar.f4425Q;
                Field field = D.I.f300a;
                AbstractC0023x.c(d5);
            } else {
                io.flutter.embedding.android.D d6 = rVar.f4425Q;
                d6.addOnAttachStateChangeListener(new S(d6, i));
            }
            Bundle bundle2 = rVar.f4440m;
            if (bundle2 != null) {
                bundle2.getBundle("savedInstanceState");
            }
            rVar.f4425Q.getViewTreeObserver().addOnWindowFocusChangeListener(((io.flutter.embedding.android.r) rVar).f6607f0);
            rVar.f4415F.u(2);
            this.f4305a.P(rVar, rVar.f4425Q, false);
            int visibility = rVar.f4425Q.getVisibility();
            rVar.a().f4407j = rVar.f4425Q.getAlpha();
            if (rVar.f4424P != null && visibility == 0) {
                View viewFindFocus = rVar.f4425Q.findFocus();
                if (viewFindFocus != null) {
                    rVar.a().f4408k = viewFindFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + rVar);
                    }
                }
                rVar.f4425Q.setAlpha(0.0f);
            }
        }
        rVar.f4439l = 2;
    }

    public final void g() {
        boolean z4;
        r rVarI;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f4307c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + rVar);
        }
        boolean z5 = rVar.f4450w && !rVar.j();
        Z1.i iVar = this.f4306b;
        if (z5) {
            iVar.F(rVar.f4443p, null);
        }
        if (!z5) {
            O o4 = (O) iVar.f3015o;
            if (!((o4.f4285d.containsKey(rVar.f4443p) && o4.f4288g) ? o4.f4289h : true)) {
                String str = rVar.f4446s;
                if (str != null && (rVarI = iVar.i(str)) != null && rVarI.M) {
                    rVar.f4445r = rVarI;
                }
                rVar.f4439l = 0;
                return;
            }
        }
        C0254v c0254v = rVar.f4414E;
        if (c0254v != null) {
            z4 = ((O) iVar.f3015o).f4289h;
        } else {
            z4 = c0254v.f4459r != null ? !r6.isChangingConfigurations() : true;
        }
        if (z5 || z4) {
            ((O) iVar.f3015o).c(rVar, false);
        }
        rVar.f4415F.l();
        rVar.f4433Y.e(EnumC0272n.ON_DESTROY);
        rVar.f4439l = 0;
        rVar.f4430V = false;
        rVar.f4423O = true;
        this.f4305a.G(rVar, false);
        for (T t4 : iVar.k()) {
            if (t4 != null) {
                String str2 = rVar.f4443p;
                r rVar2 = t4.f4307c;
                if (str2.equals(rVar2.f4446s)) {
                    rVar2.f4445r = rVar;
                    rVar2.f4446s = null;
                }
            }
        }
        String str3 = rVar.f4446s;
        if (str3 != null) {
            rVar.f4445r = iVar.i(str3);
        }
        iVar.t(this);
    }

    public final void h() {
        io.flutter.embedding.android.D d5;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f4307c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + rVar);
        }
        ViewGroup viewGroup = rVar.f4424P;
        if (viewGroup != null && (d5 = rVar.f4425Q) != null) {
            viewGroup.removeView(d5);
        }
        rVar.f4415F.u(1);
        if (rVar.f4425Q != null) {
            V v4 = rVar.f4434Z;
            v4.b();
            if (v4.f4321o.f4545c.compareTo(EnumC0273o.f4536n) >= 0) {
                rVar.f4434Z.a(EnumC0272n.ON_DESTROY);
            }
        }
        rVar.f4439l = 1;
        rVar.f4423O = false;
        io.flutter.embedding.android.r rVar2 = (io.flutter.embedding.android.r) rVar;
        rVar2.f4423O = true;
        rVar2.o().getViewTreeObserver().removeOnWindowFocusChangeListener(rVar2.f6607f0);
        if (rVar2.r("onDestroyView")) {
            rVar2.f6608g0.h();
        }
        if (!rVar.f4423O) {
            throw new a0("Fragment " + rVar + " did not call through to super.onDestroyView()");
        }
        Z1.m mVar = new Z1.m(rVar.getViewModelStore(), X.b.f2483e);
        String canonicalName = X.b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        C0740j c0740j = ((X.b) mVar.t(X.b.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).f2484d;
        if (c0740j.f9241n > 0) {
            c0740j.f9240m[0].getClass();
            throw new ClassCastException();
        }
        rVar.f4411B = false;
        this.f4305a.Q(rVar, false);
        rVar.f4424P = null;
        rVar.f4425Q = null;
        rVar.f4434Z = null;
        rVar.f4435a0.a(null);
        rVar.f4452z = false;
    }

    public final void i() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f4307c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + rVar);
        }
        rVar.f4439l = -1;
        rVar.f4423O = false;
        io.flutter.embedding.android.r rVar2 = (io.flutter.embedding.android.r) rVar;
        rVar2.getContext().unregisterComponentCallbacks(rVar2);
        boolean z4 = true;
        rVar2.f4423O = true;
        C0492k c0492k = rVar2.f6608g0;
        if (c0492k != null) {
            c0492k.i();
            C0492k c0492k2 = rVar2.f6608g0;
            c0492k2.f6572a = null;
            c0492k2.f6573b = null;
            c0492k2.f6574c = null;
            c0492k2.f6575d = null;
            c0492k2.f6576e = null;
            rVar2.f6608g0 = null;
        } else {
            rVar2.toString();
        }
        if (!rVar.f4423O) {
            throw new a0("Fragment " + rVar + " did not call through to super.onDetach()");
        }
        M m4 = rVar.f4415F;
        if (!m4.f4246I) {
            m4.l();
            rVar.f4415F = new M();
        }
        this.f4305a.H(rVar, false);
        rVar.f4439l = -1;
        rVar.f4414E = null;
        rVar.f4416G = null;
        rVar.f4413D = null;
        if (!rVar.f4450w || rVar.j()) {
            O o4 = (O) this.f4306b.f3015o;
            if (o4.f4285d.containsKey(rVar.f4443p) && o4.f4288g) {
                z4 = o4.f4289h;
            }
            if (!z4) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + rVar);
        }
        rVar.g();
    }

    public final void j() {
        r rVar = this.f4307c;
        if (rVar.y && rVar.f4452z && !rVar.f4411B) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + rVar);
            }
            Bundle bundle = rVar.f4440m;
            if (bundle != null) {
                bundle.getBundle("savedInstanceState");
            }
            rVar.l();
            rVar.k();
            io.flutter.embedding.android.D d5 = rVar.f4425Q;
            if (d5 != null) {
                d5.setSaveFromParentEnabled(false);
                rVar.f4425Q.setTag(R.id.fragment_container_view_tag, rVar);
                if (rVar.f4420K) {
                    rVar.f4425Q.setVisibility(8);
                }
                Bundle bundle2 = rVar.f4440m;
                if (bundle2 != null) {
                    bundle2.getBundle("savedInstanceState");
                }
                rVar.f4425Q.getViewTreeObserver().addOnWindowFocusChangeListener(((io.flutter.embedding.android.r) rVar).f6607f0);
                rVar.f4415F.u(2);
                this.f4305a.P(rVar, rVar.f4425Q, false);
                rVar.f4439l = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        Z1.i iVar = this.f4306b;
        boolean z4 = this.f4308d;
        r rVar = this.f4307c;
        if (z4) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + rVar);
                return;
            }
            return;
        }
        try {
            this.f4308d = true;
            boolean z5 = false;
            while (true) {
                int iD = d();
                int i = rVar.f4439l;
                int i5 = 3;
                if (iD == i) {
                    if (!z5 && i == -1 && rVar.f4450w && !rVar.j()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + rVar);
                        }
                        ((O) iVar.f3015o).c(rVar, true);
                        iVar.t(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + rVar);
                        }
                        rVar.g();
                    }
                    if (rVar.f4429U) {
                        if (rVar.f4425Q != null && (viewGroup = rVar.f4424P) != null) {
                            C0246m c0246mJ = C0246m.j(viewGroup, rVar.e());
                            if (rVar.f4420K) {
                                c0246mJ.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + rVar);
                                }
                                c0246mJ.d(3, 1, this);
                            } else {
                                c0246mJ.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + rVar);
                                }
                                c0246mJ.d(2, 1, this);
                            }
                        }
                        L l3 = rVar.f4413D;
                        if (l3 != null && rVar.f4449v && L.J(rVar)) {
                            l3.f4243F = true;
                        }
                        rVar.f4429U = false;
                        rVar.f4415F.o();
                    }
                    this.f4308d = false;
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case androidx.media.A.RESULT_ERROR /* -1 */:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            rVar.f4439l = 1;
                            break;
                        case 2:
                            rVar.f4452z = false;
                            rVar.f4439l = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + rVar);
                            }
                            if (rVar.f4425Q != null && rVar.f4441n == null) {
                                o();
                            }
                            if (rVar.f4425Q != null && (viewGroup2 = rVar.f4424P) != null) {
                                C0246m c0246mJ2 = C0246m.j(viewGroup2, rVar.e());
                                c0246mJ2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + rVar);
                                }
                                c0246mJ2.d(1, 3, this);
                            }
                            rVar.f4439l = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            rVar.f4439l = 5;
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (rVar.f4425Q != null && (viewGroup3 = rVar.f4424P) != null) {
                                C0246m c0246mJ3 = C0246m.j(viewGroup3, rVar.e());
                                int visibility = rVar.f4425Q.getVisibility();
                                if (visibility == 0) {
                                    i5 = 2;
                                } else if (visibility == 4) {
                                    i5 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                c0246mJ3.e(i5, this);
                            }
                            rVar.f4439l = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            rVar.f4439l = 6;
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            n();
                            break;
                    }
                }
                z5 = true;
            }
        } catch (Throwable th) {
            this.f4308d = false;
            throw th;
        }
    }

    public final void l() {
        C0394c c0394c;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f4307c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + rVar);
        }
        rVar.f4415F.u(5);
        if (rVar.f4425Q != null) {
            rVar.f4434Z.a(EnumC0272n.ON_PAUSE);
        }
        rVar.f4433Y.e(EnumC0272n.ON_PAUSE);
        rVar.f4439l = 6;
        rVar.f4423O = false;
        io.flutter.embedding.android.r rVar2 = (io.flutter.embedding.android.r) rVar;
        rVar2.f4423O = true;
        if (rVar2.r("onPause")) {
            C0492k c0492k = rVar2.f6608g0;
            c0492k.c();
            if (c0492k.f6572a.shouldDispatchAppLifecycleState() && (c0394c = c0492k.f6573b) != null) {
                C0669c c0669c = c0394c.f5611g;
                c0669c.e(3, c0669c.f8676c);
            }
        }
        if (rVar.f4423O) {
            this.f4305a.I(rVar, false);
            return;
        }
        throw new a0("Fragment " + rVar + " did not call through to super.onPause()");
    }

    public final void m(ClassLoader classLoader) {
        r rVar = this.f4307c;
        Bundle bundle = rVar.f4440m;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (rVar.f4440m.getBundle("savedInstanceState") == null) {
            rVar.f4440m.putBundle("savedInstanceState", new Bundle());
        }
        try {
            rVar.f4441n = rVar.f4440m.getSparseParcelableArray("viewState");
            rVar.f4442o = rVar.f4440m.getBundle("viewRegistryState");
            Q q4 = (Q) rVar.f4440m.getParcelable("state");
            if (q4 != null) {
                rVar.f4446s = q4.f4301w;
                rVar.f4447t = q4.f4302x;
                rVar.f4427S = q4.y;
            }
            if (rVar.f4427S) {
                return;
            }
            rVar.f4426R = true;
        } catch (BadParcelableException e5) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + rVar, e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.T.n():void");
    }

    public final void o() {
        r rVar = this.f4307c;
        if (rVar.f4425Q == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + rVar + " with view " + rVar.f4425Q);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        rVar.f4425Q.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            rVar.f4441n = sparseArray;
        }
        Bundle bundle = new Bundle();
        rVar.f4434Z.f4322p.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        rVar.f4442o = bundle;
    }

    public final void p() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f4307c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + rVar);
        }
        rVar.f4415F.O();
        rVar.f4415F.z(true);
        rVar.f4439l = 5;
        rVar.f4423O = false;
        io.flutter.embedding.android.r rVar2 = (io.flutter.embedding.android.r) rVar;
        rVar2.f4423O = true;
        if (rVar2.r("onStart")) {
            rVar2.f6608g0.n();
        }
        if (!rVar.f4423O) {
            throw new a0("Fragment " + rVar + " did not call through to super.onStart()");
        }
        C0280w c0280w = rVar.f4433Y;
        EnumC0272n enumC0272n = EnumC0272n.ON_START;
        c0280w.e(enumC0272n);
        if (rVar.f4425Q != null) {
            rVar.f4434Z.f4321o.e(enumC0272n);
        }
        M m4 = rVar.f4415F;
        m4.f4244G = false;
        m4.f4245H = false;
        m4.f4250N.i = false;
        m4.u(5);
        this.f4305a.N(rVar, false);
    }

    public final void q() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f4307c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + rVar);
        }
        M m4 = rVar.f4415F;
        m4.f4245H = true;
        m4.f4250N.i = true;
        m4.u(4);
        if (rVar.f4425Q != null) {
            rVar.f4434Z.a(EnumC0272n.ON_STOP);
        }
        rVar.f4433Y.e(EnumC0272n.ON_STOP);
        rVar.f4439l = 4;
        rVar.f4423O = false;
        io.flutter.embedding.android.r rVar2 = (io.flutter.embedding.android.r) rVar;
        rVar2.f4423O = true;
        if (rVar2.r("onStop")) {
            rVar2.f6608g0.o();
        }
        if (rVar.f4423O) {
            this.f4305a.O(rVar, false);
            return;
        }
        throw new a0("Fragment " + rVar + " did not call through to super.onStop()");
    }

    public T(Z1.l lVar, Z1.i iVar, ClassLoader classLoader, F f2, Bundle bundle) {
        this.f4305a = lVar;
        this.f4306b = iVar;
        Q q4 = (Q) bundle.getParcelable("state");
        r rVarA = f2.a(q4.f4290l);
        rVarA.f4443p = q4.f4291m;
        rVarA.y = q4.f4292n;
        rVarA.f4410A = true;
        rVarA.f4417H = q4.f4293o;
        rVarA.f4418I = q4.f4294p;
        rVarA.f4419J = q4.f4295q;
        rVarA.M = q4.f4296r;
        rVarA.f4450w = q4.f4297s;
        rVarA.f4421L = q4.f4298t;
        rVarA.f4420K = q4.f4299u;
        rVarA.f4432X = EnumC0273o.values()[q4.f4300v];
        rVarA.f4446s = q4.f4301w;
        rVarA.f4447t = q4.f4302x;
        rVarA.f4427S = q4.y;
        this.f4307c = rVarA;
        rVarA.f4440m = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        rVarA.q(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + rVarA);
        }
    }

    public T(Z1.l lVar, Z1.i iVar, r rVar, Bundle bundle) {
        this.f4305a = lVar;
        this.f4306b = iVar;
        this.f4307c = rVar;
        rVar.f4441n = null;
        rVar.f4442o = null;
        rVar.f4412C = 0;
        rVar.f4452z = false;
        rVar.f4449v = false;
        r rVar2 = rVar.f4445r;
        rVar.f4446s = rVar2 != null ? rVar2.f4443p : null;
        rVar.f4445r = null;
        rVar.f4440m = bundle;
        rVar.f4444q = bundle.getBundle("arguments");
    }
}
