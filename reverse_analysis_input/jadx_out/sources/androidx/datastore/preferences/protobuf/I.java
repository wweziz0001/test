package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class I {
    public static int a(Object obj, int i, Object obj2) {
        H h2 = (H) obj;
        G g5 = (G) obj2;
        int iP0 = 0;
        if (!h2.isEmpty()) {
            for (Map.Entry entry : h2.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                g5.getClass();
                int iN0 = C0220l.n0(i);
                int iA = G.a(g5.f4074a, key, value);
                iP0 += C0220l.p0(iA) + iA + iN0;
            }
        }
        return iP0;
    }

    public static H b(Object obj, Object obj2) {
        H hB = (H) obj;
        H h2 = (H) obj2;
        if (!h2.isEmpty()) {
            if (!hB.f4076l) {
                hB = hB.b();
            }
            hB.a();
            if (!h2.isEmpty()) {
                hB.putAll(h2);
            }
        }
        return hB;
    }

    public static void c(Object obj) {
        ((H) obj).f4076l = false;
    }
}
