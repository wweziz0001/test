package androidx.datastore.preferences.protobuf;

import b3.AbstractC0307a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0229v extends AbstractC0209a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0229v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected c0 unknownFields;

    public AbstractC0229v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c0.f4130f;
    }

    public static AbstractC0229v f(Class cls) {
        AbstractC0229v abstractC0229v = defaultInstanceMap.get(cls);
        if (abstractC0229v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0229v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (abstractC0229v == null) {
            abstractC0229v = (AbstractC0229v) ((AbstractC0229v) i0.d(cls)).e(6);
            if (abstractC0229v == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0229v);
        }
        return abstractC0229v;
    }

    public static Object g(Method method, AbstractC0209a abstractC0209a, Object... objArr) {
        try {
            return method.invoke(abstractC0209a, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(AbstractC0229v abstractC0229v, boolean z4) {
        byte bByteValue = ((Byte) abstractC0229v.e(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        S s4 = S.f4099c;
        s4.getClass();
        boolean zA = s4.a(abstractC0229v.getClass()).a(abstractC0229v);
        if (z4) {
            abstractC0229v.e(2);
        }
        return zA;
    }

    public static void l(Class cls, AbstractC0229v abstractC0229v) {
        abstractC0229v.j();
        defaultInstanceMap.put(cls, abstractC0229v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0209a
    public final int a(V v4) {
        int iH;
        int iH2;
        if (i()) {
            if (v4 == null) {
                S s4 = S.f4099c;
                s4.getClass();
                iH2 = s4.a(getClass()).h(this);
            } else {
                iH2 = v4.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            throw new IllegalStateException(AbstractC0307a.i("serialized size must be non-negative, was ", iH2));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (v4 == null) {
            S s5 = S.f4099c;
            s5.getClass();
            iH = s5.a(getClass()).h(this);
        } else {
            iH = v4.h(this);
        }
        m(iH);
        return iH;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0209a
    public final void b(C0220l c0220l) {
        S s4 = S.f4099c;
        s4.getClass();
        V vA = s4.a(getClass());
        E e5 = c0220l.f4178q;
        if (e5 == null) {
            e5 = new E(c0220l);
        }
        vA.f(this, e5);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        S s4 = S.f4099c;
        s4.getClass();
        return s4.a(getClass()).i(this, (AbstractC0229v) obj);
    }

    public final int hashCode() {
        if (i()) {
            S s4 = S.f4099c;
            s4.getClass();
            return s4.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            S s5 = S.f4099c;
            s5.getClass();
            this.memoizedHashCode = s5.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC0229v k() {
        return (AbstractC0229v) e(4);
    }

    public final void m(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC0307a.i("serialized size must be non-negative, was ", i));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = L.f4079a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        L.c(this, sb, 0);
        return sb.toString();
    }
}
