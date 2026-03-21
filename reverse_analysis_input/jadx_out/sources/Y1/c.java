package Y1;

import android.app.Notification;
import android.app.Service;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void a(Service service, int i, Notification notification, int i5) {
        service.startForeground(i, notification, i5);
    }
}
