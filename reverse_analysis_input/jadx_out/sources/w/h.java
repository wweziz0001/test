package w;

import a.AbstractC0149a;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import q.C0739i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Z1.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Class f10414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Constructor f10415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Method f10416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Method f10417t;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi24Impl", e5.getClass().getName(), e5);
            cls = null;
            method = null;
            method2 = null;
        }
        f10415r = constructor;
        f10414q = cls;
        f10416s = method2;
        f10417t = method;
    }

    public static boolean S(Object obj, ByteBuffer byteBuffer, int i, int i5, boolean z4) {
        try {
            return ((Boolean) f10416s.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i5), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface T(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f10414q, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f10417t.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005b A[SYNTHETIC] */
    @Override // Z1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface j(android.content.Context r17, v.f r18, android.content.res.Resources r19, int r20) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = w.h.f10415r     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r2 != 0) goto Ld
            return r1
        Ld:
            r0 = r18
            v.g[] r3 = r0.f10276a
            int r4 = r3.length
            r0 = 0
            r5 = r0
        L14:
            if (r5 >= r4) goto L71
            r6 = r3[r5]
            int r0 = r6.f10282f
            java.io.File r7 = a.AbstractC0149a.w(r17)
            if (r7 != 0) goto L24
            r8 = r19
        L22:
            r0 = r1
            goto L59
        L24:
            r8 = r19
            boolean r0 = a.AbstractC0149a.k(r7, r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L30
            r7.delete()
            goto L22
        L30:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r9.<init>(r7)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L49
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L49
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L49
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L49
            r9.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L49:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L4f
            goto L54
        L4f:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r10     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r7.delete()
        L59:
            if (r0 != 0) goto L5c
            return r1
        L5c:
            int r7 = r6.f10278b
            boolean r9 = r6.f10279c
            int r6 = r6.f10281e
            boolean r0 = S(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L69
            return r1
        L69:
            int r5 = r5 + 1
            goto L14
        L6c:
            r0 = move-exception
            r7.delete()
            throw r0
        L71:
            android.graphics.Typeface r0 = T(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.j(android.content.Context, v.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // Z1.f
    public final Typeface k(Context context, A.k[] kVarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = f10415r.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        C0739i c0739i = new C0739i();
        for (A.k kVar : kVarArr) {
            Uri uri = kVar.f28a;
            ByteBuffer byteBufferZ = (ByteBuffer) c0739i.getOrDefault(uri, null);
            if (byteBufferZ == null) {
                byteBufferZ = AbstractC0149a.z(context, uri);
                c0739i.put(uri, byteBufferZ);
            }
            if (byteBufferZ == null) {
                return null;
            }
            if (!S(objNewInstance, byteBufferZ, kVar.f29b, kVar.f30c, kVar.f31d)) {
                return null;
            }
        }
        Typeface typefaceT = T(objNewInstance);
        if (typefaceT == null) {
            return null;
        }
        return Typeface.create(typefaceT, i);
    }
}
