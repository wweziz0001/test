package androidx.activity;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0234a;
import androidx.fragment.app.C0246m;
import androidx.fragment.app.D;
import androidx.fragment.app.L;
import androidx.fragment.app.U;
import androidx.lifecycle.AbstractC0274p;
import androidx.lifecycle.C0280w;
import androidx.lifecycle.EnumC0273o;
import androidx.lifecycle.InterfaceC0278u;
import e3.C0394c;
import io.flutter.embedding.android.C0492k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f3775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3.d f3776b = new C3.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D f3777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f3778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f3779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3781g;

    public x(h hVar) {
        this.f3775a = hVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f3778d = i >= 34 ? t.f3767a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1)) : r.f3762a.a(new p(this, 2));
        }
    }

    public final void a(InterfaceC0278u interfaceC0278u, D d5) {
        N3.h.e(interfaceC0278u, "owner");
        N3.h.e(d5, "onBackPressedCallback");
        AbstractC0274p lifecycle = interfaceC0278u.getLifecycle();
        if (((C0280w) lifecycle).f4545c == EnumC0273o.f4534l) {
            return;
        }
        d5.f4226b.add(new u(this, lifecycle, d5));
        d();
        d5.f4227c = new w(0, this, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object objPrevious;
        D d5 = this.f3777c;
        if (d5 == null) {
            C3.d dVar = this.f3776b;
            ListIterator listIterator = dVar.listIterator(dVar.f());
            while (true) {
                if (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                    if (((D) objPrevious).f4225a) {
                        break;
                    }
                } else {
                    objPrevious = null;
                    break;
                }
            }
            d5 = (D) objPrevious;
        }
        this.f3777c = null;
        if (d5 == null) {
            this.f3775a.run();
            return;
        }
        switch (d5.f4228d) {
            case 0:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                L l3 = (L) d5.f4229e;
                if (zIsLoggable) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + l3);
                }
                l3.z(true);
                C0234a c0234a = l3.f4259h;
                D d6 = l3.i;
                if (c0234a == null) {
                    if (d6.f4225a) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        l3.P();
                        return;
                    } else {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        l3.f4258g.b();
                        return;
                    }
                }
                ArrayList arrayList = l3.f4263m;
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(L.E(l3.f4259h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = l3.f4259h.f4339a.iterator();
                while (it3.hasNext()) {
                    androidx.fragment.app.r rVar = ((U) it3.next()).f4311b;
                    if (rVar != null) {
                        rVar.f4451x = false;
                    }
                }
                for (C0246m c0246m : l3.f(new ArrayList(Collections.singletonList(l3.f4259h)), 0, 1)) {
                    c0246m.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    ArrayList arrayList2 = c0246m.f4393c;
                    c0246m.k(arrayList2);
                    c0246m.c(arrayList2);
                }
                l3.f4259h = null;
                l3.d0();
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + d6.f4225a + " for  FragmentManager " + l3);
                    return;
                }
                return;
            default:
                io.flutter.embedding.android.r rVar2 = (io.flutter.embedding.android.r) d5.f4229e;
                if (rVar2.r("onBackPressed")) {
                    C0492k c0492k = rVar2.f6608g0;
                    c0492k.c();
                    C0394c c0394c = c0492k.f6573b;
                    if (c0394c != null) {
                        c0394c.i.f8672a.a("popRoute", null, null);
                        return;
                    } else {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
                        return;
                    }
                }
                return;
        }
    }

    public final void c(boolean z4) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f3779e;
        OnBackInvokedCallback onBackInvokedCallback = this.f3778d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f3762a;
        if (z4 && !this.f3780f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f3780f = true;
        } else {
            if (z4 || !this.f3780f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3780f = false;
        }
    }

    public final void d() {
        boolean z4 = this.f3781g;
        boolean z5 = false;
        C3.d dVar = this.f3776b;
        if (dVar == null || !dVar.isEmpty()) {
            Iterator it = dVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((D) it.next()).f4225a) {
                    z5 = true;
                    break;
                }
            }
        }
        this.f3781g = z5;
        if (z5 == z4 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z5);
    }
}
