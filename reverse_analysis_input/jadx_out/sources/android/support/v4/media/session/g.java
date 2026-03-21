package android.support.v4.media.session;

import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements IBinder.DeathRecipient {
    final MediaController.Callback mCallbackFwk = new e(this);
    f mHandler;
    InterfaceC0208b mIControllerCallback;

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        postToHandler(8, null, null);
    }

    public InterfaceC0208b getIControllerCallback() {
        return this.mIControllerCallback;
    }

    public void onAudioInfoChanged(k kVar) {
    }

    public void onCaptioningEnabledChanged(boolean z4) {
    }

    public void onExtrasChanged(Bundle bundle) {
    }

    public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
    }

    public void onQueueChanged(List<MediaSessionCompat$QueueItem> list) {
    }

    public void onQueueTitleChanged(CharSequence charSequence) {
    }

    public void onRepeatModeChanged(int i) {
    }

    public void onSessionDestroyed() {
    }

    public void onSessionEvent(String str, Bundle bundle) {
    }

    public void onSessionReady() {
    }

    public void onShuffleModeChanged(int i) {
    }

    public void postToHandler(int i, Object obj, Bundle bundle) {
        f fVar = this.mHandler;
        if (fVar != null) {
            Message messageObtainMessage = fVar.obtainMessage(i, obj);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    public void setHandler(Handler handler) {
        if (handler != null) {
            f fVar = new f(this, handler.getLooper());
            this.mHandler = fVar;
            fVar.f3703a = true;
        } else {
            f fVar2 = this.mHandler;
            if (fVar2 != null) {
                fVar2.f3703a = false;
                fVar2.removeCallbacksAndMessages(null);
                this.mHandler = null;
            }
        }
    }
}
