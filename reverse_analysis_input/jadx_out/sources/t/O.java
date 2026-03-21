package t;

import android.app.NotificationManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static int b(NotificationManager notificationManager) {
        return notificationManager.getImportance();
    }
}
