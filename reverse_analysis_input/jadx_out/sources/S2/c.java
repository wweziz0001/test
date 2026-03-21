package S2;

import android.app.ForegroundServiceStartNotAllowedException;
import android.media.metrics.MediaMetricsManager;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException b(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager e(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ boolean w(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
