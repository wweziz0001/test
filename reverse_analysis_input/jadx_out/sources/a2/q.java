package a2;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final R1.f f3558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final R1.k f3559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f3560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3561o;

    public q(R1.f fVar, R1.k kVar, boolean z4, int i) {
        N3.h.e(fVar, "processor");
        N3.h.e(kVar, "token");
        this.f3558l = fVar;
        this.f3559m = kVar;
        this.f3560n = z4;
        this.f3561o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        R1.u uVarB;
        if (this.f3560n) {
            R1.f fVar = this.f3558l;
            R1.k kVar = this.f3559m;
            int i = this.f3561o;
            fVar.getClass();
            String str = kVar.f1894a.f3016a;
            synchronized (fVar.f1886k) {
                uVarB = fVar.b(str);
            }
            zD = R1.f.d(str, uVarB, i);
        } else {
            R1.f fVar2 = this.f3558l;
            R1.k kVar2 = this.f3559m;
            int i5 = this.f3561o;
            fVar2.getClass();
            String str2 = kVar2.f1894a.f3016a;
            synchronized (fVar2.f1886k) {
                try {
                    if (fVar2.f1882f.get(str2) != null) {
                        Q1.q.d().a(R1.f.f1876l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) fVar2.f1884h.get(str2);
                        if (set != null && set.contains(kVar2)) {
                            zD = R1.f.d(str2, fVar2.b(str2), i5);
                        }
                    }
                    zD = false;
                } finally {
                }
            }
        }
        Q1.q.d().a(Q1.q.f("StopWorkRunnable"), "StopWorkRunnable for " + this.f3559m.f1894a.f3016a + "; Processor.stopWork = " + zD);
    }
}
