package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f4162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f4163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f4164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f4165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f4166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f4167f;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0;
        int i = 1;
        Unsafe unsafeI = i();
        f4162a = unsafeI;
        Class cls = AbstractC0211c.f4128a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        h0 g0Var = null;
        if (unsafeI != null) {
            if (!AbstractC0211c.a()) {
                g0Var = new g0(unsafeI);
            } else if (zH) {
                g0Var = new f0(unsafeI, i);
            } else if (zH2) {
                g0Var = new f0(unsafeI, objArr == true ? 1 : 0);
            }
        }
        f4163b = g0Var;
        f4164c = g0Var == null ? false : g0Var.r();
        f4165d = g0Var == null ? false : g0Var.q();
        f4166e = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && g0Var != null) {
            g0Var.i(fieldG);
        }
        f4167f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j5, Object obj) {
        return ((byte) ((f4163b.f((-4) & j5, obj) >>> ((int) (((~j5) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j5, Object obj) {
        return ((byte) ((f4163b.f((-4) & j5, obj) >>> ((int) ((j5 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f4162a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static int e(Class cls) {
        if (f4165d) {
            return f4163b.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f4165d) {
            f4163b.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0211c.a()) {
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

    public static boolean h(Class cls) {
        if (!AbstractC0211c.a()) {
            return false;
        }
        try {
            Class cls2 = AbstractC0211c.f4128a;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new e0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j5, byte b4) {
        f4163b.k(bArr, f4166e + j5, b4);
    }

    public static void k(Object obj, long j5, byte b4) {
        long j6 = (-4) & j5;
        int iF = f4163b.f(j6, obj);
        int i = ((~((int) j5)) & 3) << 3;
        m(j6, obj, ((255 & b4) << i) | (iF & (~(255 << i))));
    }

    public static void l(Object obj, long j5, byte b4) {
        long j6 = (-4) & j5;
        int i = (((int) j5) & 3) << 3;
        m(j6, obj, ((255 & b4) << i) | (f4163b.f(j6, obj) & (~(255 << i))));
    }

    public static void m(long j5, Object obj, int i) {
        f4163b.n(j5, obj, i);
    }

    public static void n(Object obj, long j5, long j6) {
        f4163b.o(obj, j5, j6);
    }

    public static void o(long j5, Object obj, Object obj2) {
        f4163b.p(j5, obj, obj2);
    }
}
