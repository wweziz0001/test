package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends n0 {
    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final boolean c(long j5, Object obj) {
        return this.f5231a.getBoolean(obj, j5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final byte d(long j5, Object obj) {
        return this.f5231a.getByte(obj, j5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final double e(long j5, Object obj) {
        return this.f5231a.getDouble(obj, j5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final float f(long j5, Object obj) {
        return this.f5231a.getFloat(obj, j5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void k(Object obj, long j5, boolean z4) {
        this.f5231a.putBoolean(obj, j5, z4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void l(Object obj, long j5, byte b4) {
        this.f5231a.putByte(obj, j5, b4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void m(Object obj, long j5, double d5) {
        this.f5231a.putDouble(obj, j5, d5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void n(Object obj, long j5, float f2) {
        this.f5231a.putFloat(obj, j5, f2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f5231a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            o0.a(th);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final boolean s() {
        Unsafe unsafe = this.f5231a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (o0.e() != null) {
                    try {
                        Class<?> cls3 = this.f5231a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        o0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                o0.a(th2);
            }
        }
        return false;
    }
}
