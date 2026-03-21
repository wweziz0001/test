package N3;

import y1.C1001a;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static void a(int i, Object obj) {
        if (obj == null || b(i, obj)) {
            return;
        }
        c(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean b(int i, Object obj) {
        if (obj instanceof B3.a) {
            return (obj instanceof f ? ((f) obj).e() : obj instanceof M3.a ? 0 : obj instanceof M3.l ? 1 : obj instanceof M3.p ? 2 : obj instanceof M3.q ? 3 : obj instanceof C1001a ? 4 : obj instanceof M3.s ? 6 : -1) == i;
        }
        return false;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        h.f(classCastException, s.class.getName());
        throw classCastException;
    }
}
