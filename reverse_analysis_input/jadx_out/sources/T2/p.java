package T2;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static long a(Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }
}
