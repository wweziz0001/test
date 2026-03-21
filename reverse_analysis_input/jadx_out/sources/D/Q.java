package D;

import android.media.session.MediaSession;
import android.view.WindowInsets;
import com.ryanheise.audioservice.AudioService;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Q {
    public static /* synthetic */ MediaSession g(AudioService audioService) {
        return new MediaSession(audioService, "media-session", null);
    }

    public static /* synthetic */ WindowInsets.Builder i() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder j(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void n() {
    }
}
