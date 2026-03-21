package S1;

import D0.y;
import N3.h;
import R1.k;
import Z1.l;
import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0.d f2017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f2021e;

    public d(B0.d dVar, l lVar) {
        h.e(dVar, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f2017a = dVar;
        this.f2018b = lVar;
        this.f2019c = millis;
        this.f2020d = new Object();
        this.f2021e = new LinkedHashMap();
    }

    public final void a(k kVar) {
        Runnable runnable;
        h.e(kVar, "token");
        synchronized (this.f2020d) {
            runnable = (Runnable) this.f2021e.remove(kVar);
        }
        if (runnable != null) {
            ((Handler) this.f2017a.f190l).removeCallbacks(runnable);
        }
    }

    public final void b(k kVar) {
        y yVar = new y(this, 6, kVar);
        synchronized (this.f2020d) {
        }
        B0.d dVar = this.f2017a;
        ((Handler) dVar.f190l).postDelayed(yVar, this.f2019c);
    }
}
