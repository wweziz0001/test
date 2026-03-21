package D1;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q.C0735e;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0735e f542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0735e f543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0735e f544c;

    public c(C0735e c0735e, C0735e c0735e2, C0735e c0735e3) {
        this.f542a = c0735e;
        this.f543b = c0735e2;
        this.f544c = c0735e3;
    }

    public abstract d a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0735e c0735e = this.f544c;
        Class cls2 = (Class) c0735e.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0735e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        C0735e c0735e = this.f542a;
        Method method = (Method) c0735e.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, c.class.getClassLoader()).getDeclaredMethod("read", c.class);
        c0735e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0735e c0735e = this.f543b;
        Method method = (Method) c0735e.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, c.class);
        c0735e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i5) {
        return !e(i5) ? i : ((d) this).f546e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((d) this).f546e.readParcelable(d.class.getClassLoader());
    }

    public final e h() {
        String string = ((d) this).f546e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (e) c(string).invoke(null, a());
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
        } catch (InvocationTargetException e8) {
            if (e8.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e8.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i5) {
        i(i5);
        ((d) this).f546e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((d) this).f546e.writeParcelable(parcelable, 0);
    }

    public final void l(e eVar) {
        if (eVar == null) {
            ((d) this).f546e.writeString(null);
            return;
        }
        try {
            ((d) this).f546e.writeString(b(eVar.getClass()).getName());
            d dVarA = a();
            try {
                d(eVar.getClass()).invoke(null, eVar, dVarA);
                int i = dVarA.i;
                if (i >= 0) {
                    int i5 = dVarA.f545d.get(i);
                    Parcel parcel = dVarA.f546e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i5);
                    parcel.writeInt(iDataPosition - i5);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
            } catch (InvocationTargetException e8) {
                if (!(e8.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
                }
                throw ((RuntimeException) e8.getCause());
            }
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException(eVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e9);
        }
    }
}
