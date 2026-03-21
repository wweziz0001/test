package Q;

import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1710l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f1712n;

    public h(SystemForegroundService systemForegroundService, int i) {
        this.f1712n = systemForegroundService;
        this.f1711m = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1710l) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f1712n;
                int size = arrayList.size();
                int i = 0;
                if (this.f1711m == 1) {
                    while (i < size) {
                        ((g) arrayList.get(i)).b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((g) arrayList.get(i)).a();
                        i++;
                    }
                }
                break;
            default:
                ((SystemForegroundService) this.f1712n).f4814p.cancel(this.f1711m);
                break;
        }
    }

    public h(List list, int i, Throwable th) {
        D1.b.n(list, "initCallbacks cannot be null");
        this.f1712n = new ArrayList(list);
        this.f1711m = i;
    }
}
