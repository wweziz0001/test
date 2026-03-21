package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0260b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4522a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4523b;

    public C0260b(HashMap map) {
        this.f4523b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0272n enumC0272n = (EnumC0272n) entry.getValue();
            List arrayList = (List) this.f4522a.get(enumC0272n);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f4522a.put(enumC0272n, arrayList);
            }
            arrayList.add((C0261c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0278u interfaceC0278u, EnumC0272n enumC0272n, InterfaceC0277t interfaceC0277t) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0261c c0261c = (C0261c) list.get(size);
                c0261c.getClass();
                try {
                    int i = c0261c.f4524a;
                    Method method = c0261c.f4525b;
                    if (i == 0) {
                        method.invoke(interfaceC0277t, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0277t, interfaceC0278u);
                    } else if (i == 2) {
                        method.invoke(interfaceC0277t, interfaceC0278u, enumC0272n);
                    }
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException("Failed to call observer method", e6.getCause());
                }
            }
        }
    }
}
