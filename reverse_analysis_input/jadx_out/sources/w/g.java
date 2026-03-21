package w;

import a.AbstractC0149a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class g extends Z1.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Class f10409q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Constructor f10410r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static Method f10411s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Method f10412t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f10413u = false;

    public static boolean S(int i, String str, Object obj, boolean z4) throws NoSuchMethodException {
        T();
        try {
            return ((Boolean) f10411s.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static void T() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f10413u) {
            return;
        }
        f10413u = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi21Impl", e5.getClass().getName(), e5);
            method = null;
            cls = null;
            method2 = null;
        }
        f10410r = constructor;
        f10409q = cls;
        f10411s = method2;
        f10412t = method;
    }

    @Override // Z1.f
    public Typeface j(Context context, v.f fVar, Resources resources, int i) throws NoSuchMethodException {
        T();
        try {
            Object objNewInstance = f10410r.newInstance(null);
            for (v.g gVar : fVar.f10276a) {
                File fileW = AbstractC0149a.w(context);
                if (fileW == null) {
                    return null;
                }
                try {
                    if (!AbstractC0149a.k(fileW, resources, gVar.f10282f)) {
                        return null;
                    }
                    if (!S(gVar.f10278b, fileW.getPath(), objNewInstance, gVar.f10279c)) {
                        return null;
                    }
                    fileW.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileW.delete();
                }
            }
            T();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f10409q, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f10412t.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e5) {
                throw new RuntimeException(e5);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // Z1.f
    public Typeface k(Context context, A.k[] kVarArr, int i) {
        String str;
        if (kVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(o(kVarArr, i).f28a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceL = l(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceL;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
