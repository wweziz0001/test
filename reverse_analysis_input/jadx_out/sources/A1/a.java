package A1;

import Z1.f;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.example.hqp_mobile_app.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f169e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f172c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f171b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f170a = new HashMap();

    public a(Context context) {
        this.f172c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f168d == null) {
            synchronized (f169e) {
                try {
                    if (f168d == null) {
                        f168d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f168d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f172c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f171b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e5) {
                throw new c(e5);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        if (f.B()) {
            try {
                Trace.beginSection(f.N(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f170a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f172c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
