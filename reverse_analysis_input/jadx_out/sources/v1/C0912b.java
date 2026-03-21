package v1;

import android.os.Bundle;
import androidx.fragment.app.r;
import androidx.lifecycle.EnumC0272n;
import androidx.lifecycle.InterfaceC0267i;
import androidx.lifecycle.InterfaceC0276s;
import androidx.lifecycle.InterfaceC0278u;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import b3.AbstractC0307a;
import io.flutter.embedding.android.D;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: v1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0912b implements InterfaceC0276s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10346b;

    public /* synthetic */ C0912b(Object obj, int i) {
        this.f10345a = i;
        this.f10346b = obj;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.lifecycle.u, java.lang.Object, v1.h] */
    @Override // androidx.lifecycle.InterfaceC0276s
    public final void b(InterfaceC0278u interfaceC0278u, EnumC0272n enumC0272n) {
        D d5;
        switch (this.f10345a) {
            case 0:
                if (enumC0272n != EnumC0272n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0278u.getLifecycle().b(this);
                ?? r6 = this.f10346b;
                Bundle bundleA = r6.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C0912b.class.getClassLoader()).asSubclass(InterfaceC0914d.class);
                        N3.h.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                N3.h.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                                Y viewModelStore = ((Z) r6).getViewModelStore();
                                C0916f savedStateRegistry = r6.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f4521a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    N3.h.e(str2, "key");
                                    T t4 = (T) linkedHashMap.get(str2);
                                    N3.h.b(t4);
                                    M.a(t4, savedStateRegistry, r6.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e5) {
                                throw new RuntimeException(AbstractC0307a.j("Failed to instantiate ", str), e5);
                            }
                        } catch (NoSuchMethodException e6) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
                        }
                    } catch (ClassNotFoundException e7) {
                        throw new RuntimeException(AbstractC0307a.k("Class ", str, " wasn't found"), e7);
                    }
                }
                return;
            case 1:
                if (enumC0272n != EnumC0272n.ON_STOP || (d5 = ((r) this.f10346b).f4425Q) == null) {
                    return;
                }
                d5.cancelPendingInputEvents();
                return;
            case 2:
                new HashMap();
                InterfaceC0267i[] interfaceC0267iArr = (InterfaceC0267i[]) this.f10346b;
                if (interfaceC0267iArr.length > 0) {
                    InterfaceC0267i interfaceC0267i = interfaceC0267iArr[0];
                    throw null;
                }
                if (interfaceC0267iArr.length <= 0) {
                    return;
                }
                InterfaceC0267i interfaceC0267i2 = interfaceC0267iArr[0];
                throw null;
            default:
                if (enumC0272n != EnumC0272n.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0272n).toString());
                }
                interfaceC0278u.getLifecycle().b(this);
                ((N) this.f10346b).b();
                return;
        }
    }
}
