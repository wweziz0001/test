package w;

import a.AbstractC0149a;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Method f10418A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Method f10419B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Class f10420v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Constructor f10421w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Method f10422x;
    public final Method y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Method f10423z;

    public i() throws NoSuchMethodException {
        Method methodB0;
        Constructor<?> constructor;
        Method methodA0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodA0 = a0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodB0 = b0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e5.getClass().getName()), e5);
            methodB0 = null;
            constructor = null;
            methodA0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f10420v = cls;
        this.f10421w = constructor;
        this.f10422x = methodA0;
        this.y = method;
        this.f10423z = method2;
        this.f10418A = method3;
        this.f10419B = methodB0;
    }

    public static Method a0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void U(Object obj) {
        try {
            this.f10418A.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean V(Context context, Object obj, String str, int i, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f10422x.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface W(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f10420v, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f10419B.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean X(Object obj) {
        try {
            return ((Boolean) this.f10423z.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean Y() {
        Method method = this.f10422x;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object Z() {
        try {
            return this.f10421w.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method b0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // w.g, Z1.f
    public final Typeface j(Context context, v.f fVar, Resources resources, int i) {
        if (!Y()) {
            return super.j(context, fVar, resources, i);
        }
        Object objZ = Z();
        if (objZ == null) {
            return null;
        }
        for (v.g gVar : fVar.f10276a) {
            if (!V(context, objZ, gVar.f10277a, gVar.f10281e, gVar.f10278b, gVar.f10279c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f10280d))) {
                U(objZ);
                return null;
            }
        }
        if (X(objZ)) {
            return W(objZ);
        }
        return null;
    }

    @Override // w.g, Z1.f
    public final Typeface k(Context context, A.k[] kVarArr, int i) {
        Typeface typefaceW;
        boolean zBooleanValue;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!Y()) {
            A.k kVarO = o(kVarArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(kVarO.f28a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(kVarO.f30c).setItalic(kVarO.f31d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (A.k kVar : kVarArr) {
            if (kVar.f32e == 0) {
                Uri uri = kVar.f28a;
                if (!map.containsKey(uri)) {
                    map.put(uri, AbstractC0149a.z(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objZ = Z();
        if (objZ == null) {
            return null;
        }
        int length = kVarArr.length;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < length) {
            A.k kVar2 = kVarArr[i5];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(kVar2.f28a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.y.invoke(objZ, byteBuffer, Integer.valueOf(kVar2.f29b), null, Integer.valueOf(kVar2.f30c), Integer.valueOf(kVar2.f31d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    U(objZ);
                    return null;
                }
                z4 = true;
            }
            i5++;
            z4 = z4;
        }
        if (!z4) {
            U(objZ);
            return null;
        }
        if (X(objZ) && (typefaceW = W(objZ)) != null) {
            return Typeface.create(typefaceW, i);
        }
        return null;
    }

    @Override // Z1.f
    public final Typeface m(Context context, Resources resources, int i, String str, int i5) {
        if (!Y()) {
            return super.m(context, resources, i, str, i5);
        }
        Object objZ = Z();
        if (objZ == null) {
            return null;
        }
        if (!V(context, objZ, str, 0, -1, -1, null)) {
            U(objZ);
            return null;
        }
        if (X(objZ)) {
            return W(objZ);
        }
        return null;
    }
}
