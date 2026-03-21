package B0;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f197a;

    public final void a(int i) {
        i iVar = this.f197a;
        synchronized (iVar) {
            int i5 = iVar.f221m;
            if (i5 == 0 || iVar.f213d) {
                if (i5 == i) {
                    return;
                }
                iVar.f221m = i;
                if (i != 1 && i != 0 && i != 8) {
                    iVar.f219k = iVar.b(i);
                    iVar.f212c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iVar.c(iVar.f215f > 0 ? (int) (jElapsedRealtime - iVar.f216g) : 0, iVar.f217h, iVar.f219k);
                    iVar.f216g = jElapsedRealtime;
                    iVar.f217h = 0L;
                    iVar.f218j = 0L;
                    iVar.i = 0L;
                    w wVar = iVar.f214e;
                    wVar.f256b.clear();
                    wVar.f258d = -1;
                    wVar.f259e = 0;
                    wVar.f260f = 0;
                }
            }
        }
    }
}
