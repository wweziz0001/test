package Y1;

import Q1.q;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(Service service, int i, Notification notification, int i5) {
        try {
            service.startForeground(i, notification, i5);
        } catch (ForegroundServiceStartNotAllowedException e5) {
            q qVarD = q.d();
            String str = SystemForegroundService.f4810q;
            if (qVarD.f1838a <= 5) {
                Log.w(str, "Unable to start foreground service", e5);
            }
        }
    }
}
