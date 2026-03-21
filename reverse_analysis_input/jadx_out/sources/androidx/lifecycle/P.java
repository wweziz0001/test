package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import v1.C0916f;

/* JADX INFO: loaded from: classes.dex */
public final class P implements W {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Application f4503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V f4504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Bundle f4505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC0274p f4506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0916f f4507p;

    public P(Application application, androidx.activity.m mVar, Bundle bundle) {
        V v4;
        this.f4507p = mVar.getSavedStateRegistry();
        this.f4506o = mVar.getLifecycle();
        this.f4505n = bundle;
        this.f4503l = application;
        if (application != null) {
            if (V.f4518n == null) {
                V.f4518n = new V(application);
            }
            v4 = V.f4518n;
            N3.h.b(v4);
        } else {
            v4 = new V(null);
        }
        this.f4504m = v4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T a(Class cls, String str) {
        Object obj;
        Application application;
        AbstractC0274p abstractC0274p = this.f4506o;
        if (abstractC0274p == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0259a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.f4503l == null) ? Q.a(cls, Q.f4509b) : Q.a(cls, Q.f4508a);
        if (constructorA == null) {
            if (this.f4503l != null) {
                return this.f4504m.c(cls);
            }
            if (X.f4520l == null) {
                X.f4520l = new X();
            }
            X x4 = X.f4520l;
            N3.h.b(x4);
            return x4.c(cls);
        }
        C0916f c0916f = this.f4507p;
        N3.h.b(c0916f);
        Bundle bundle = this.f4505n;
        Bundle bundleA = c0916f.a(str);
        Class[] clsArr = J.f4486f;
        J jB = M.b(bundleA, bundle);
        K k4 = new K(str, jB);
        k4.c(c0916f, abstractC0274p);
        EnumC0273o enumC0273o = ((C0280w) abstractC0274p).f4545c;
        if (enumC0273o == EnumC0273o.f4535m || enumC0273o.compareTo(EnumC0273o.f4537o) >= 0) {
            c0916f.d();
        } else {
            abstractC0274p.a(new C0265g(abstractC0274p, 1, c0916f));
        }
        T tB = (!zIsAssignableFrom || (application = this.f4503l) == null) ? Q.b(cls, constructorA, jB) : Q.b(cls, constructorA, application, jB);
        synchronized (tB.f4513a) {
            try {
                obj = tB.f4513a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == null) {
                    tB.f4513a.put("androidx.lifecycle.savedstate.vm.tag", k4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            k4 = obj;
        }
        if (tB.f4515c) {
            T.a(k4);
        }
        return tB;
    }

    @Override // androidx.lifecycle.W
    public final T c(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.W
    public final T i(Class cls, W.c cVar) {
        U u4 = U.f4517b;
        LinkedHashMap linkedHashMap = cVar.f2458a;
        String str = (String) linkedHashMap.get(u4);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(M.f4495a) == null || linkedHashMap.get(M.f4496b) == null) {
            if (this.f4506o != null) {
                return a(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(U.f4516a);
        boolean zIsAssignableFrom = AbstractC0259a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? Q.a(cls, Q.f4509b) : Q.a(cls, Q.f4508a);
        return constructorA == null ? this.f4504m.i(cls, cVar) : (!zIsAssignableFrom || application == null) ? Q.b(cls, constructorA, M.c(cVar)) : Q.b(cls, constructorA, application, M.c(cVar));
    }
}
