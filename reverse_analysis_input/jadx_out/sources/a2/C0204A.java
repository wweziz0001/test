package a2;

import java.util.HashMap;

/* JADX INFO: renamed from: a2.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0204A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3525e = Q1.q.f("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0.d f3526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3527b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3528c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3529d = new Object();

    public C0204A(B0.d dVar) {
        this.f3526a = dVar;
    }

    public final void a(Z1.j jVar) {
        synchronized (this.f3529d) {
            try {
                if (((z) this.f3527b.remove(jVar)) != null) {
                    Q1.q.d().a(f3525e, "Stopping timer for " + jVar);
                    this.f3528c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
