package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f5234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f5235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f5236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f5237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f5238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f5239f;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0;
        int i = 1;
        Unsafe unsafeM = m();
        f5234a = unsafeM;
        Class cls = AbstractC0323c.f5185a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        n0 m0Var = null;
        if (unsafeM != null) {
            if (!AbstractC0323c.a()) {
                m0Var = new m0(unsafeM);
            } else if (zF) {
                m0Var = new l0(unsafeM, i);
            } else if (zF2) {
                m0Var = new l0(unsafeM, objArr == true ? 1 : 0);
            }
        }
        f5235b = m0Var;
        f5236c = m0Var == null ? false : m0Var.s();
        f5237d = m0Var == null ? false : m0Var.r();
        f5238e = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && m0Var != null) {
            m0Var.j(fieldE);
        }
        f5239f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(o0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f5234a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static int c(Class cls) {
        if (f5237d) {
            return f5235b.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f5237d) {
            f5235b.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0323c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class cls) {
        if (!AbstractC0323c.a()) {
            return false;
        }
        try {
            Class cls2 = AbstractC0323c.f5185a;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(long j5, byte[] bArr) {
        return f5235b.d(f5238e + j5, bArr);
    }

    public static byte h(long j5, Object obj) {
        return (byte) ((f5235b.g((-4) & j5, obj) >>> ((int) (((~j5) & 3) << 3))) & 255);
    }

    public static byte i(long j5, Object obj) {
        return (byte) ((f5235b.g((-4) & j5, obj) >>> ((int) ((j5 & 3) << 3))) & 255);
    }

    public static int j(AbstractC0342w abstractC0342w, long j5) {
        return f5235b.g(j5, abstractC0342w);
    }

    public static long k(AbstractC0342w abstractC0342w, long j5) {
        return f5235b.h(j5, abstractC0342w);
    }

    public static Object l(AbstractC0342w abstractC0342w, long j5) {
        return f5235b.i(j5, abstractC0342w);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new k0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(Object obj, long j5, boolean z4) {
        f5235b.k(obj, j5, z4);
    }

    public static void o(byte[] bArr, long j5, byte b4) {
        f5235b.l(bArr, f5238e + j5, b4);
    }

    public static void p(Object obj, long j5, byte b4) {
        long j6 = (-4) & j5;
        int iG = f5235b.g(j6, obj);
        int i = ((~((int) j5)) & 3) << 3;
        t(j6, obj, ((255 & b4) << i) | (iG & (~(255 << i))));
    }

    public static void q(Object obj, long j5, byte b4) {
        long j6 = (-4) & j5;
        int i = (((int) j5) & 3) << 3;
        t(j6, obj, ((255 & b4) << i) | (f5235b.g(j6, obj) & (~(255 << i))));
    }

    public static void r(Object obj, long j5, double d5) {
        f5235b.m(obj, j5, d5);
    }

    public static void s(Object obj, long j5, float f2) {
        f5235b.n(obj, j5, f2);
    }

    public static void t(long j5, Object obj, int i) {
        f5235b.o(j5, obj, i);
    }

    public static void u(Object obj, long j5, long j6) {
        f5235b.p(obj, j5, j6);
    }

    public static void v(long j5, Object obj, Object obj2) {
        f5235b.q(j5, obj, obj2);
    }
}
