package B;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("WorkmanagerDebugChannelId", "A helper channel to debug your background tasks.", 3);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest e(Object obj) {
        return (AudioFocusRequest) obj;
    }
}
