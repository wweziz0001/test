package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class V extends X {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static V f4518n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Application f4519m;

    public V(Application application) {
        this.f4519m = application;
    }

    public final T a(Class cls, Application application) {
        if (!AbstractC0259a.class.isAssignableFrom(cls)) {
            return super.c(cls);
        }
        try {
            T t4 = (T) cls.getConstructor(Application.class).newInstance(application);
            N3.h.d(t4, "{\n                try {\n…          }\n            }");
            return t4;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        }
    }

    @Override // androidx.lifecycle.X, androidx.lifecycle.W
    public final T c(Class cls) {
        Application application = this.f4519m;
        if (application != null) {
            return a(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.W
    public final T i(Class cls, W.c cVar) {
        if (this.f4519m != null) {
            return c(cls);
        }
        Application application = (Application) cVar.f2458a.get(U.f4516a);
        if (application != null) {
            return a(cls, application);
        }
        if (AbstractC0259a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.c(cls);
    }
}
