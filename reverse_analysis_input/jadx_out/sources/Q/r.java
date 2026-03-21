package Q;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import b3.AbstractC0307a;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r implements i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f1741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A.e f1742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final A0.b f1743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Handler f1745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ThreadPoolExecutor f1746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ThreadPoolExecutor f1747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i4.a f1748s;

    public r(Context context, A.e eVar) {
        A0.b bVar = s.f1749d;
        this.f1744o = new Object();
        D1.b.n(context, "Context cannot be null");
        this.f1741l = context.getApplicationContext();
        this.f1742m = eVar;
        this.f1743n = bVar;
    }

    @Override // Q.i
    public final void a(i4.a aVar) {
        synchronized (this.f1744o) {
            this.f1748s = aVar;
        }
        synchronized (this.f1744o) {
            try {
                if (this.f1748s == null) {
                    return;
                }
                if (this.f1746q == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1747r = threadPoolExecutor;
                    this.f1746q = threadPoolExecutor;
                }
                this.f1746q.execute(new A3.c(this, 3));
            } finally {
            }
        }
    }

    public final void b() {
        synchronized (this.f1744o) {
            try {
                this.f1748s = null;
                Handler handler = this.f1745p;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1745p = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1747r;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1746q = null;
                this.f1747r = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final A.k c() {
        try {
            A0.b bVar = this.f1743n;
            Context context = this.f1741l;
            A.e eVar = this.f1742m;
            bVar.getClass();
            A.j jVarA = A.d.a(context, eVar);
            int i = jVarA.f26l;
            if (i != 0) {
                throw new RuntimeException(AbstractC0307a.h(i, "fetchFonts failed (", ")"));
            }
            A.k[] kVarArr = (A.k[]) jVarA.f27m;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e5) {
            throw new RuntimeException("provider not found", e5);
        }
    }
}
