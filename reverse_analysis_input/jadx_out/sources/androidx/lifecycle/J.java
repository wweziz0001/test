package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import v1.InterfaceC0915e;
import z.AbstractC1058c;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f4486f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0915e f4491e;

    public J(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4487a = linkedHashMap;
        this.f4488b = new LinkedHashMap();
        this.f4489c = new LinkedHashMap();
        this.f4490d = new LinkedHashMap();
        this.f4491e = new androidx.activity.d(this, 1);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(J j5) {
        Map mapSingletonMap;
        N3.h.e(j5, "this$0");
        LinkedHashMap linkedHashMap = j5.f4488b;
        N3.h.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size == 0) {
            mapSingletonMap = C3.o.f292l;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(linkedHashMap);
        } else {
            N3.h.e(linkedHashMap, "<this>");
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            N3.h.d(mapSingletonMap, "with(...)");
        }
        Iterator it = mapSingletonMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap2 = j5.f4487a;
            int i = 0;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap2.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap2.get(str));
                }
                B3.b[] bVarArr = {new B3.b("keys", arrayList), new B3.b("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i < 2) {
                    B3.b bVar = bVarArr[i];
                    String str2 = (String) bVar.f268l;
                    Object obj = bVar.f269m;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str2, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str2, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        N3.h.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        AbstractC1058c.a(bundle, str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        AbstractC1058c.b(bundle, str2, (SizeF) obj);
                    }
                    i++;
                }
                return bundle;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            String str3 = (String) entry2.getKey();
            Object objA = ((InterfaceC0915e) entry2.getValue()).a();
            N3.h.e(str3, "key");
            if (objA != null) {
                Class[] clsArr = f4486f;
                while (i < 29) {
                    Class cls = clsArr[i];
                    N3.h.b(cls);
                    if (!cls.isInstance(objA)) {
                        i++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + objA.getClass() + " into saved state");
            }
            Object obj2 = j5.f4489c.get(str3);
            C0283z c0283z = obj2 instanceof C0283z ? (C0283z) obj2 : null;
            if (c0283z != null) {
                c0283z.a(objA);
            } else {
                linkedHashMap2.put(str3, objA);
            }
            Y3.t tVar = (Y3.t) j5.f4490d.get(str3);
            if (tVar != null) {
                Y3.v vVar = (Y3.v) tVar;
                if (objA == null) {
                    objA = Z3.q.f3135a;
                }
                vVar.c(null, objA);
            }
        }
    }

    public J() {
        this.f4487a = new LinkedHashMap();
        this.f4488b = new LinkedHashMap();
        this.f4489c = new LinkedHashMap();
        this.f4490d = new LinkedHashMap();
        this.f4491e = new androidx.activity.d(this, 1);
    }
}
