package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0218j;
import androidx.datastore.preferences.protobuf.C0219k;
import b3.AbstractC0307a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0342w extends AbstractC0321a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0342w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected f0 unknownFields;

    public AbstractC0342w() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = f0.f5195f;
    }

    public static void g(AbstractC0342w abstractC0342w) throws C {
        if (!o(abstractC0342w, true)) {
            throw new C(new e0().getMessage());
        }
    }

    public static AbstractC0342w l(Class cls) {
        AbstractC0342w abstractC0342wA = defaultInstanceMap.get(cls);
        if (abstractC0342wA == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0342wA = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (abstractC0342wA == null) {
            abstractC0342wA = ((AbstractC0342w) o0.b(cls)).a();
            if (abstractC0342wA == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0342wA);
        }
        return abstractC0342wA;
    }

    public static Object n(Method method, AbstractC0321a abstractC0321a, Object... objArr) {
        try {
            return method.invoke(abstractC0321a, objArr);
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

    public static final boolean o(AbstractC0342w abstractC0342w, boolean z4) {
        byte bByteValue = ((Byte) abstractC0342w.k(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Z z5 = Z.f5174c;
        z5.getClass();
        boolean zA = z5.a(abstractC0342w.getClass()).a(abstractC0342w);
        if (z4) {
            abstractC0342w.k(2);
        }
        return zA;
    }

    public static AbstractC0342w t(AbstractC0342w abstractC0342w, AbstractC0329i abstractC0329i, C0335o c0335o) throws C {
        C0328h c0328h = (C0328h) abstractC0329i;
        C0330j c0330jH = AbstractC0218j.h(c0328h.f5203o, c0328h.k(), c0328h.size(), true);
        AbstractC0342w abstractC0342wU = u(abstractC0342w, c0330jH, c0335o);
        c0330jH.b(0);
        g(abstractC0342wU);
        return abstractC0342wU;
    }

    public static AbstractC0342w u(AbstractC0342w abstractC0342w, AbstractC0218j abstractC0218j, C0335o c0335o) throws C {
        AbstractC0342w abstractC0342wS = abstractC0342w.s();
        try {
            Z z4 = Z.f5174c;
            z4.getClass();
            c0 c0VarA = z4.a(abstractC0342wS.getClass());
            C0219k c0219k = (C0219k) abstractC0218j.f4169b;
            if (c0219k == null) {
                c0219k = new C0219k(abstractC0218j, (byte) 0);
            }
            c0VarA.j(abstractC0342wS, c0219k, c0335o);
            c0VarA.d(abstractC0342wS);
            return abstractC0342wS;
        } catch (C e5) {
            if (e5.f5130l) {
                throw new C(e5.getMessage(), e5);
            }
            throw e5;
        } catch (e0 e6) {
            throw new C(e6.getMessage());
        } catch (IOException e7) {
            if (e7.getCause() instanceof C) {
                throw ((C) e7.getCause());
            }
            throw new C(e7.getMessage(), e7);
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof C) {
                throw ((C) e8.getCause());
            }
            throw e8;
        }
    }

    public static void v(Class cls, AbstractC0342w abstractC0342w) {
        abstractC0342w.q();
        defaultInstanceMap.put(cls, abstractC0342w);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0321a
    public final int b(c0 c0Var) {
        int iE;
        int iE2;
        if (p()) {
            if (c0Var == null) {
                Z z4 = Z.f5174c;
                z4.getClass();
                iE2 = z4.a(getClass()).e(this);
            } else {
                iE2 = c0Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(AbstractC0307a.i("serialized size must be non-negative, was ", iE2));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (c0Var == null) {
            Z z5 = Z.f5174c;
            z5.getClass();
            iE = z5.a(getClass()).e(this);
        } else {
            iE = c0Var.e(this);
        }
        w(iE);
        return iE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Z z4 = Z.f5174c;
        z4.getClass();
        return z4.a(getClass()).f(this, (AbstractC0342w) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0321a
    public final void f(C0332l c0332l) {
        Z z4 = Z.f5174c;
        z4.getClass();
        c0 c0VarA = z4.a(getClass());
        L l3 = c0332l.f5225q;
        if (l3 == null) {
            l3 = new L(c0332l);
        }
        c0VarA.h(this, l3);
    }

    public final void h() {
        this.memoizedHashCode = 0;
    }

    public final int hashCode() {
        if (p()) {
            Z z4 = Z.f5174c;
            z4.getClass();
            return z4.a(getClass()).i(this);
        }
        if (this.memoizedHashCode == 0) {
            Z z5 = Z.f5174c;
            z5.getClass();
            this.memoizedHashCode = z5.a(getClass()).i(this);
        }
        return this.memoizedHashCode;
    }

    public final void i() {
        w(Integer.MAX_VALUE);
    }

    public final AbstractC0340u j() {
        return (AbstractC0340u) k(5);
    }

    public abstract Object k(int i);

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final AbstractC0342w a() {
        return (AbstractC0342w) k(6);
    }

    public final boolean p() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void q() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0321a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC0340u d() {
        return (AbstractC0340u) k(5);
    }

    public final AbstractC0342w s() {
        return (AbstractC0342w) k(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = S.f5153a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        S.c(this, sb, 0);
        return sb.toString();
    }

    public final void w(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC0307a.i("serialized size must be non-negative, was ", i));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final AbstractC0340u x() {
        AbstractC0340u abstractC0340u = (AbstractC0340u) k(5);
        if (!abstractC0340u.f5251l.equals(this)) {
            abstractC0340u.e();
            AbstractC0340u.f(abstractC0340u.f5252m, this);
        }
        return abstractC0340u;
    }
}
