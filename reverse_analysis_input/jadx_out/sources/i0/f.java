package i0;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ NetworkEvent.Builder b() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder e() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder k(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ TrackChangeEvent.Builder p(int i) {
        return new TrackChangeEvent.Builder(i);
    }
}
