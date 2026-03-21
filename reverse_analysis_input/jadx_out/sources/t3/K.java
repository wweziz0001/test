package t3;

import L.C0096d;
import L.P;
import V3.AbstractC0144v;
import V3.InterfaceC0143u;
import V3.f0;
import a.AbstractC0149a;
import android.content.Context;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ S3.c[] f10047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O.b f10048b;

    static {
        N3.k kVar = new N3.k(N3.b.f1606l, K.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        N3.q.f1627a.getClass();
        f10047a = new S3.c[]{kVar};
        O.a aVar = O.a.f1628m;
        c4.c cVar = V3.B.f2373b;
        f0 f0Var = new f0(null);
        cVar.getClass();
        f10048b = new O.b(aVar, AbstractC0144v.a(D1.b.K(cVar, f0Var)));
    }

    public static final B0.d a(Context context) {
        B0.d dVar;
        N3.h.e(context, "<this>");
        O.b bVar = f10048b;
        S3.c cVar = f10047a[0];
        bVar.getClass();
        N3.h.e(cVar, "property");
        B0.d dVar2 = bVar.f1632d;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (bVar.f1631c) {
            try {
                if (bVar.f1632d == null) {
                    Context applicationContext = context.getApplicationContext();
                    M3.l lVar = bVar.f1629a;
                    N3.h.d(applicationContext, "applicationContext");
                    List list = (List) lVar.c(applicationContext);
                    InterfaceC0143u interfaceC0143u = bVar.f1630b;
                    K1.j jVar = new K1.j(applicationContext, 1, bVar);
                    N3.h.e(list, "migrations");
                    bVar.f1632d = new B0.d(new B0.d(new P(new N.f(g4.f.f5848a, new G1.a(jVar, 2)), AbstractC0149a.y(new C0096d(list, null)), new A0.b(16), interfaceC0143u)));
                }
                dVar = bVar.f1632d;
                N3.h.b(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public static final boolean b(String str, Object obj, Set set) {
        N3.h.e(str, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object c(Object obj, p1.b bVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        N3.h.e(str, "<this>");
        if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                return obj;
            }
            String strSubstring = str.substring(40);
            N3.h.d(strSubstring, "substring(...)");
            return bVar.n(strSubstring);
        }
        if (!str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return obj;
        }
        String strSubstring2 = str.substring(40);
        N3.h.d(strSubstring2, "substring(...)");
        return Double.valueOf(Double.parseDouble(strSubstring2));
    }
}
