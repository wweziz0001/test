package t;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: renamed from: t.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0815d {
    public static AlarmManager.AlarmClockInfo a(long j5, PendingIntent pendingIntent) {
        return new AlarmManager.AlarmClockInfo(j5, pendingIntent);
    }

    public static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
        alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
    }
}
