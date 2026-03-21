package android.support.v4.media.session;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    n mCallbackHandler;
    private boolean mMediaPlayPausePendingOnHandler;
    final Object mLock = new Object();
    final MediaSession.Callback mCallbackFwk = new o(this);
    WeakReference<q> mSessionImpl = new WeakReference<>(null);

    public void handleMediaPlayPauseIfPendingOnHandler(q qVar, Handler handler) {
        if (this.mMediaPlayPausePendingOnHandler) {
            this.mMediaPlayPausePendingOnHandler = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompatB = qVar.b();
            long j5 = playbackStateCompatB == null ? 0L : playbackStateCompatB.f3687p;
            boolean z4 = playbackStateCompatB != null && playbackStateCompatB.f3683l == 3;
            boolean z5 = (516 & j5) != 0;
            boolean z6 = (j5 & 514) != 0;
            if (z4 && z6) {
                onPause();
            } else {
                if (z4 || !z5) {
                    return;
                }
                onPlay();
            }
        }
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void onCustomAction(String str, Bundle bundle) {
    }

    public void onFastForward() {
    }

    public boolean onMediaButtonEvent(Intent intent) {
        q qVar;
        n nVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.mLock) {
            qVar = this.mSessionImpl.get();
            nVar = this.mCallbackHandler;
        }
        if (qVar == null || nVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
            return false;
        }
        androidx.media.B bC = qVar.c();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 79 && keyCode != 85) {
            handleMediaPlayPauseIfPendingOnHandler(qVar, nVar);
            return false;
        }
        if (keyEvent.getRepeatCount() != 0) {
            handleMediaPlayPauseIfPendingOnHandler(qVar, nVar);
        } else if (this.mMediaPlayPausePendingOnHandler) {
            nVar.removeMessages(1);
            this.mMediaPlayPausePendingOnHandler = false;
            PlaybackStateCompat playbackStateCompatB = qVar.b();
            if (((playbackStateCompatB == null ? 0L : playbackStateCompatB.f3687p) & 32) != 0) {
                onSkipToNext();
            }
        } else {
            this.mMediaPlayPausePendingOnHandler = true;
            nVar.sendMessageDelayed(nVar.obtainMessage(1, bC), ViewConfiguration.getDoubleTapTimeout());
        }
        return true;
    }

    public void onPause() {
    }

    public void onPlay() {
    }

    public void onPlayFromMediaId(String str, Bundle bundle) {
    }

    public void onPlayFromSearch(String str, Bundle bundle) {
    }

    public void onPlayFromUri(Uri uri, Bundle bundle) {
    }

    public void onPrepare() {
    }

    public void onPrepareFromMediaId(String str, Bundle bundle) {
    }

    public void onPrepareFromSearch(String str, Bundle bundle) {
    }

    public void onPrepareFromUri(Uri uri, Bundle bundle) {
    }

    public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    @Deprecated
    public void onRemoveQueueItemAt(int i) {
    }

    public void onRewind() {
    }

    public void onSeekTo(long j5) {
    }

    public void onSetCaptioningEnabled(boolean z4) {
    }

    public void onSetPlaybackSpeed(float f2) {
    }

    public void onSetRating(RatingCompat ratingCompat) {
    }

    public void onSetRepeatMode(int i) {
    }

    public void onSetShuffleMode(int i) {
    }

    public void onSkipToNext() {
    }

    public void onSkipToPrevious() {
    }

    public void onSkipToQueueItem(long j5) {
    }

    public void onStop() {
    }

    public void setSessionImpl(q qVar, Handler handler) {
        synchronized (this.mLock) {
            try {
                this.mSessionImpl = new WeakReference<>(qVar);
                n nVar = this.mCallbackHandler;
                n nVar2 = null;
                if (nVar != null) {
                    nVar.removeCallbacksAndMessages(null);
                }
                if (qVar != null && handler != null) {
                    nVar2 = new n(this, handler.getLooper());
                }
                this.mCallbackHandler = nVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
    }

    public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
    }
}
