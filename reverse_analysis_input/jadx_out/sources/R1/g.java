package R1;

import android.content.Context;
import android.content.SharedPreferences;
import t1.AbstractC0859a;
import y1.C1002b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0859a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1887c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1888d;

    public g(Context context, int i, int i5) {
        super(i, i5);
        this.f1888d = context;
    }

    @Override // t1.AbstractC0859a
    public final void a(C1002b c1002b) {
        switch (this.f1887c) {
            case 0:
                if (this.f10002b >= 10) {
                    c1002b.l(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f1888d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c1002b.k("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f1888d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j5 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j6 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c1002b.a();
                    try {
                        c1002b.l(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j5)});
                        c1002b.l(new Object[]{"reschedule_needed", Long.valueOf(j6)});
                        sharedPreferences.edit().clear().apply();
                        c1002b.r();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i5 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c1002b.a();
                    try {
                        c1002b.l(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        c1002b.l(new Object[]{"next_alarm_manager_id", Integer.valueOf(i5)});
                        sharedPreferences2.edit().clear().apply();
                        c1002b.r();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public g(Context context) {
        super(9, 10);
        this.f1888d = context;
    }
}
