package N3;

import M3.t;
import M3.u;
import M3.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import y1.C1001a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements S3.b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f1613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f1614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f1615d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f1616a;

    static {
        List listQ = C3.g.Q(M3.a.class, M3.l.class, M3.p.class, M3.q.class, C1001a.class, M3.r.class, M3.s.class, t.class, u.class, v.class, M3.b.class, M3.c.class, M3.d.class, M3.e.class, M3.f.class, M3.g.class, M3.h.class, M3.i.class, M3.j.class, M3.k.class, M3.m.class, M3.n.class, M3.o.class);
        ArrayList arrayList = new ArrayList(C3.h.R(listQ));
        int i = 0;
        for (Object obj : listQ) {
            int i5 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new B3.b((Class) obj, Integer.valueOf(i)));
            i = i5;
        }
        f1613b = C3.r.e0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        h.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            h.b(str);
            sb.append(U3.l.o0(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f1613b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f1614c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C3.r.b0(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            h.b(str2);
            linkedHashMap.put(key, U3.l.o0(str2, str2));
        }
        f1615d = linkedHashMap;
    }

    public e(Class cls) {
        h.e(cls, "jClass");
        this.f1616a = cls;
    }

    @Override // N3.d
    public final Class a() {
        return this.f1616a;
    }

    public final String b() {
        String str;
        Class cls = this.f1616a;
        h.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f1615d;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return U3.l.n0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return U3.l.n0(simpleName, enclosingConstructor.getName() + '$');
        }
        int iH0 = U3.l.h0(simpleName, '$', false, 6);
        if (iH0 == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iH0 + 1, simpleName.length());
        h.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && D1.b.E(this).equals(D1.b.E((S3.b) obj));
    }

    public final int hashCode() {
        return D1.b.E(this).hashCode();
    }

    public final String toString() {
        return this.f1616a + " (Kotlin reflection is not available)";
    }
}
