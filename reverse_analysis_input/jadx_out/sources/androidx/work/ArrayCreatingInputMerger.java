package androidx.work;

import N3.h;
import Q1.g;
import Q1.i;
import e3.C0398g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends i {
    @Override // Q1.i
    public final g a(ArrayList arrayList) throws Throwable {
        Object objNewInstance;
        C0398g c0398g = new C0398g(1);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((g) it.next()).f1824a);
            h.d(mapUnmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(str);
                h.d(str, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        h.d(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        h.b(componentType);
                        Object objNewInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, objNewInstance2, 0, length);
                        System.arraycopy(value, 0, objNewInstance2, length, length2);
                        h.d(objNewInstance2, "newArray");
                        value = objNewInstance2;
                    } else {
                        if (!h.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        objNewInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, objNewInstance, 0, length3);
                        Array.set(objNewInstance, length3, value);
                        h.d(objNewInstance, "newArray");
                        value = objNewInstance;
                    }
                } else if (!cls.isArray()) {
                    objNewInstance = Array.newInstance(cls, 1);
                    Array.set(objNewInstance, 0, value);
                    h.d(objNewInstance, "newArray");
                    value = objNewInstance;
                }
                h.d(value, "if (existingValue == nul…      }\n                }");
                map.put(str, value);
            }
        }
        c0398g.c(map);
        g gVar = new g(c0398g.f5638a);
        g.b(gVar);
        return gVar;
    }
}
