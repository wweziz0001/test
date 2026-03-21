package t;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: renamed from: t.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0816e {
    public static void a(AlarmManager alarmManager, int i, long j5, PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i, j5, pendingIntent);
    }

    public static void b(AlarmManager alarmManager, int i, long j5, PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i, j5, pendingIntent);
    }
}
