package S2;

import android.media.MicrophoneInfo;
import android.media.session.MediaSessionManager;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ MicrophoneInfo h(Object obj) {
        return (MicrophoneInfo) obj;
    }

    public static /* synthetic */ void o(int i, String str, int i5) {
        new MediaSessionManager.RemoteUserInfo(str, i, i5);
    }
}
