package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f3704b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Looper looper) {
        super(looper);
        this.f3704b = gVar;
        this.f3703a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f3703a) {
            int i = message.what;
            g gVar = this.f3704b;
            switch (i) {
                case 1:
                    Bundle data = message.getData();
                    y.a(data);
                    gVar.onSessionEvent((String) message.obj, data);
                    break;
                case 2:
                    gVar.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                    break;
                case 3:
                    gVar.onMetadataChanged((MediaMetadataCompat) message.obj);
                    break;
                case 4:
                    gVar.onAudioInfoChanged((k) message.obj);
                    break;
                case 5:
                    gVar.onQueueChanged((List) message.obj);
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    gVar.onQueueTitleChanged((CharSequence) message.obj);
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    Bundle bundle = (Bundle) message.obj;
                    y.a(bundle);
                    gVar.onExtrasChanged(bundle);
                    break;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    gVar.onSessionDestroyed();
                    break;
                case 9:
                    gVar.onRepeatModeChanged(((Integer) message.obj).intValue());
                    break;
                case 11:
                    gVar.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                    break;
                case 12:
                    gVar.onShuffleModeChanged(((Integer) message.obj).intValue());
                    break;
                case 13:
                    gVar.onSessionReady();
                    break;
            }
        }
    }
}
