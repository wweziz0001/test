package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4521a = new LinkedHashMap();

    public final void a() {
        for (T t4 : this.f4521a.values()) {
            t4.f4515c = true;
            HashMap map = t4.f4513a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = t4.f4513a.values().iterator();
                        while (it.hasNext()) {
                            T.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = t4.f4514b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = t4.f4514b.iterator();
                        while (it2.hasNext()) {
                            T.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
                t4.f4514b.clear();
            }
            t4.b();
        }
        this.f4521a.clear();
    }
}
