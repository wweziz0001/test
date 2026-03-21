package a2;

import Q1.C0118a;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f3542p = Q1.q.f("ForceStopRunnable");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f3543q = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f3544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final R1.q f3545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f3546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3547o = 0;

    public g(Context context, R1.q qVar) {
        this.f3544l = context.getApplicationContext();
        this.f3545m = qVar;
        this.f3546n = qVar.i;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f3543q;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.g.a():void");
    }

    public final boolean b() {
        C0118a c0118a = this.f3545m.f1911d;
        c0118a.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f3542p;
        if (zIsEmpty) {
            Q1.q.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = o.a(this.f3544l, c0118a);
        Q1.q.d().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f3544l;
        String str = f3542p;
        R1.q qVar = this.f3545m;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    i4.a.H(context);
                    Q1.q.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e5) {
                        int i = this.f3547o + 1;
                        this.f3547o = i;
                        if (i >= 3) {
                            String str2 = z.e.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            Q1.q.d().c(str, str2, e5);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e5);
                            qVar.f1911d.getClass();
                            throw illegalStateException;
                        }
                        long j5 = ((long) i) * 300;
                        String str3 = "Retrying after " + j5;
                        if (Q1.q.d().f1838a <= 3) {
                            Log.d(str, str3, e5);
                        }
                        try {
                            Thread.sleep(((long) this.f3547o) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e6) {
                    Q1.q.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e6);
                    qVar.f1911d.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            qVar.F0();
        }
    }
}
