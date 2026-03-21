package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f5231a;

    public n0(Unsafe unsafe) {
        this.f5231a = unsafe;
    }

    public final int a(Class cls) {
        return this.f5231a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f5231a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j5, Object obj);

    public abstract byte d(long j5, Object obj);

    public abstract double e(long j5, Object obj);

    public abstract float f(long j5, Object obj);

    public final int g(long j5, Object obj) {
        return this.f5231a.getInt(obj, j5);
    }

    public final long h(long j5, Object obj) {
        return this.f5231a.getLong(obj, j5);
    }

    public final Object i(long j5, Object obj) {
        return this.f5231a.getObject(obj, j5);
    }

    public final long j(Field field) {
        return this.f5231a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j5, boolean z4);

    public abstract void l(Object obj, long j5, byte b4);

    public abstract void m(Object obj, long j5, double d5);

    public abstract void n(Object obj, long j5, float f2);

    public final void o(long j5, Object obj, int i) {
        this.f5231a.putInt(obj, j5, i);
    }

    public final void p(Object obj, long j5, long j6) {
        this.f5231a.putLong(obj, j5, j6);
    }

    public final void q(long j5, Object obj, Object obj2) {
        this.f5231a.putObject(obj, j5, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f5231a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            o0.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
