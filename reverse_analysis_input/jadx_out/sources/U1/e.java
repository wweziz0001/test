package U1;

import O.j;
import android.app.job.JobParameters;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static int a(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f4804p;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
            case j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }
}
