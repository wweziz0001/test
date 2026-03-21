package Y1;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Notification f2735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f2737o;

    public b(SystemForegroundService systemForegroundService, int i, Notification notification, int i5) {
        this.f2737o = systemForegroundService;
        this.f2734l = i;
        this.f2735m = notification;
        this.f2736n = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        int i5 = this.f2736n;
        Notification notification = this.f2735m;
        int i6 = this.f2734l;
        SystemForegroundService systemForegroundService = this.f2737o;
        if (i >= 31) {
            d.a(systemForegroundService, i6, notification, i5);
        } else if (i >= 29) {
            c.a(systemForegroundService, i6, notification, i5);
        } else {
            systemForegroundService.startForeground(i6, notification);
        }
    }
}
