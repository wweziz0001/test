package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import n.C0681a;
import o.C0713d;
import o.C0715f;

/* JADX INFO: renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0283z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f4554h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4555a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0715f f4556b = new C0715f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f4557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f4558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A.b f4561g;

    public C0283z() {
        Object obj = f4554h;
        this.f4558d = obj;
        this.f4561g = new A.b(this, 6);
        this.f4557c = obj;
    }

    public final void a(Object obj) {
        C0681a.X().f8743a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke setValue on a background thread");
        }
        this.f4557c = obj;
        if (this.f4559e) {
            this.f4560f = true;
            return;
        }
        this.f4559e = true;
        do {
            this.f4560f = false;
            C0715f c0715f = this.f4556b;
            c0715f.getClass();
            C0713d c0713d = new C0713d(c0715f);
            c0715f.f8963n.put(c0713d, Boolean.FALSE);
            if (c0713d.hasNext()) {
                ((Map.Entry) c0713d.next()).getValue().getClass();
                throw new ClassCastException();
            }
        } while (this.f4560f);
        this.f4559e = false;
    }
}
