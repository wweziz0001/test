package j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f7236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f7237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Set f7238c;

    protected abstract f c(String str);

    protected abstract Set d();

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f7236a = copyOnWriteArrayList;
        f7237b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static Set a() {
        return f7238c;
    }

    public static f b(String str, boolean z4) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f7237b;
        j jVar = (j) concurrentHashMap.get(str);
        if (jVar != null) {
            return jVar.c(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new g("No time-zone data files registered");
        }
        throw new g("Unknown time-zone ID: ".concat(str));
    }

    public static void e(j jVar) {
        Objects.requireNonNull(jVar, "provider");
        synchronized (j.class) {
            try {
                for (String str : jVar.d()) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((j) f7237b.putIfAbsent(str, jVar)) != null) {
                        throw new g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + jVar);
                    }
                }
                f7238c = Collections.unmodifiableSet(new HashSet(f7237b.keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        f7236a.add(jVar);
    }
}
