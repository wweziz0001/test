package T1;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i, long j5, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j5, pendingIntent);
    }
}
