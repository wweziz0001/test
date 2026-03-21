package y3;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: y3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1032c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1038i f11049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f11050b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f11051c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f11052d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReferenceQueue f11053e = new ReferenceQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f11054f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f11055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A3.c f11056h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11058k;

    public C1032c(C1038i c1038i) {
        this.f11049a = c1038i;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f11055g = handler;
        A3.c cVar = new A3.c(this, 22);
        this.f11056h = cVar;
        this.i = 65536L;
        this.f11058k = 3000L;
        handler.postDelayed(cVar, 3000L);
    }

    public final void a(long j5, Object obj) {
        N3.h.e(obj, "instance");
        f();
        c(j5, obj);
    }

    public final long b(Object obj) {
        N3.h.e(obj, "instance");
        f();
        if (!d(obj)) {
            long j5 = this.i;
            this.i = 1 + j5;
            c(j5, obj);
            return j5;
        }
        throw new IllegalArgumentException(("Instance of " + obj.getClass() + " has already been added.").toString());
    }

    public final void c(long j5, Object obj) {
        if (j5 < 0) {
            throw new IllegalArgumentException(("Identifier must be >= 0: " + j5).toString());
        }
        HashMap map = this.f11051c;
        if (map.containsKey(Long.valueOf(j5))) {
            throw new IllegalArgumentException(("Identifier has already been added: " + j5).toString());
        }
        C1031b c1031b = new C1031b(obj, this.f11053e);
        this.f11050b.put(c1031b, Long.valueOf(j5));
        map.put(Long.valueOf(j5), c1031b);
        this.f11054f.put(c1031b, Long.valueOf(j5));
        this.f11052d.put(Long.valueOf(j5), obj);
    }

    public final boolean d(Object obj) {
        f();
        return obj != null && this.f11050b.containsKey(new C1031b(obj));
    }

    public final Object e(long j5) {
        f();
        C1031b c1031b = (C1031b) this.f11051c.get(Long.valueOf(j5));
        if (c1031b != null) {
            return c1031b.get();
        }
        return null;
    }

    public final void f() {
        if (this.f11057j) {
            Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }
}
