package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import v1.C0912b;
import v1.C0916f;
import v1.InterfaceC0915e;
import v1.InterfaceC0918h;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f4495a = new U();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f4496b = new U();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f4497c = new U();

    public static final void a(T t4, C0916f c0916f, AbstractC0274p abstractC0274p) {
        Object obj;
        N3.h.e(c0916f, "registry");
        N3.h.e(abstractC0274p, "lifecycle");
        HashMap map = t4.f4513a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = t4.f4513a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        K k4 = (K) obj;
        if (k4 == null || k4.f4494c) {
            return;
        }
        k4.c(c0916f, abstractC0274p);
        EnumC0273o enumC0273o = ((C0280w) abstractC0274p).f4545c;
        if (enumC0273o == EnumC0273o.f4535m || enumC0273o.compareTo(EnumC0273o.f4537o) >= 0) {
            c0916f.d();
        } else {
            abstractC0274p.a(new C0265g(abstractC0274p, 1, c0916f));
        }
    }

    public static J b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new J();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                N3.h.d(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new J(map);
        }
        ClassLoader classLoader = J.class.getClassLoader();
        N3.h.b(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            N3.h.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new J(linkedHashMap);
    }

    public static final J c(W.c cVar) {
        U u4 = f4495a;
        LinkedHashMap linkedHashMap = cVar.f2458a;
        InterfaceC0918h interfaceC0918h = (InterfaceC0918h) linkedHashMap.get(u4);
        if (interfaceC0918h == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Z z4 = (Z) linkedHashMap.get(f4496b);
        if (z4 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f4497c);
        String str = (String) linkedHashMap.get(U.f4517b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC0915e interfaceC0915eB = interfaceC0918h.getSavedStateRegistry().b();
        N n4 = interfaceC0915eB instanceof N ? (N) interfaceC0915eB : null;
        if (n4 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = f(z4).f4502d;
        J j5 = (J) linkedHashMap2.get(str);
        if (j5 != null) {
            return j5;
        }
        Class[] clsArr = J.f4486f;
        n4.b();
        Bundle bundle2 = n4.f4500c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = n4.f4500c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = n4.f4500c;
        if (bundle5 != null && bundle5.isEmpty()) {
            n4.f4500c = null;
        }
        J jB = b(bundle3, bundle);
        linkedHashMap2.put(str, jB);
        return jB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Activity activity, EnumC0272n enumC0272n) {
        N3.h.e(activity, "activity");
        N3.h.e(enumC0272n, "event");
        if (activity instanceof InterfaceC0278u) {
            AbstractC0274p lifecycle = ((InterfaceC0278u) activity).getLifecycle();
            if (lifecycle instanceof C0280w) {
                ((C0280w) lifecycle).e(enumC0272n);
            }
        }
    }

    public static final void e(InterfaceC0918h interfaceC0918h) {
        EnumC0273o enumC0273o = ((C0280w) interfaceC0918h.getLifecycle()).f4545c;
        if (enumC0273o != EnumC0273o.f4535m && enumC0273o != EnumC0273o.f4536n) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC0918h.getSavedStateRegistry().b() == null) {
            N n4 = new N(interfaceC0918h.getSavedStateRegistry(), (Z) interfaceC0918h);
            interfaceC0918h.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", n4);
            interfaceC0918h.getLifecycle().a(new C0912b(n4, 3));
        }
    }

    public static final O f(Z z4) {
        return (O) new Z1.m(z4.getViewModelStore(), new L(), z4 instanceof InterfaceC0268j ? ((InterfaceC0268j) z4).getDefaultViewModelCreationExtras() : W.a.f2457b).t(O.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static void g(Activity activity) {
        N3.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            H.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new H());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new I(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
