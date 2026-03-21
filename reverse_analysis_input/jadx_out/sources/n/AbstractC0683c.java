package n;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: n.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0683c {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }
}
