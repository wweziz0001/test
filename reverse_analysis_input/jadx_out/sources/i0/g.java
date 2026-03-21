package i0;

import android.media.AudioProfile;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static /* bridge */ /* synthetic */ AudioProfile d(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ PlaybackMetrics.Builder e() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder f() {
        return new PlaybackStateEvent.Builder();
    }
}
