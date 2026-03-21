package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: loaded from: classes.dex */
public final class o extends MediaSession.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f3715a;

    public o(p pVar) {
        this.f3715a = pVar;
    }

    public static void b(s sVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        MediaSession mediaSession = sVar.f3718a;
        String str = null;
        try {
            str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception e5) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e5);
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        sVar.d(new androidx.media.B(-1, str, -1));
    }

    public final s a() {
        s sVar;
        synchronized (this.f3715a.mLock) {
            sVar = (s) this.f3715a.mSessionImpl.get();
        }
        if (sVar == null || this.f3715a != sVar.a()) {
            return null;
        }
        return sVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        D1.e eVar;
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        y.a(bundle);
        b(sVarA);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = sVarA.f3720c;
                d dVarD = mediaSessionCompat$Token.d();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", dVarD == null ? null : dVarD.asBinder());
                synchronized (mediaSessionCompat$Token.f3674l) {
                    eVar = mediaSessionCompat$Token.f3677o;
                }
                if (eVar != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(eVar));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                this.f3715a.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                this.f3715a.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                this.f3715a.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.f3715a.onCommand(str, bundle, resultReceiver);
            } else if (sVarA.f3724g != null) {
                int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (i < 0 || i >= sVarA.f3724g.size()) ? null : (MediaSessionCompat$QueueItem) sVarA.f3724g.get(i);
                if (mediaSessionCompat$QueueItem != null) {
                    this.f3715a.onRemoveQueueItem(mediaSessionCompat$QueueItem.f3670l);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        y.a(bundle);
        b(sVarA);
        try {
            boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            p pVar = this.f3715a;
            if (zEquals) {
                Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                y.a(bundle2);
                pVar.onPlayFromUri(uri, bundle2);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                pVar.onPrepare();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                y.a(bundle3);
                pVar.onPrepareFromMediaId(string, bundle3);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                y.a(bundle4);
                pVar.onPrepareFromSearch(string2, bundle4);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                y.a(bundle5);
                pVar.onPrepareFromUri(uri2, bundle5);
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                pVar.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                pVar.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                pVar.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                y.a(bundle6);
                pVar.onSetRating(ratingCompat, bundle6);
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                pVar.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            } else {
                pVar.onCustomAction(str, bundle);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onFastForward();
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        s sVarA = a();
        if (sVarA == null) {
            return false;
        }
        b(sVarA);
        boolean zOnMediaButtonEvent = this.f3715a.onMediaButtonEvent(intent);
        sVarA.d(null);
        return zOnMediaButtonEvent || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onPause();
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onPlay();
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        y.a(bundle);
        b(sVarA);
        this.f3715a.onPlayFromMediaId(str, bundle);
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        y.a(bundle);
        b(sVarA);
        this.f3715a.onPlayFromSearch(str, bundle);
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        y.a(bundle);
        b(sVarA);
        this.f3715a.onPlayFromUri(uri, bundle);
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onPrepare();
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        y.a(bundle);
        b(sVarA);
        this.f3715a.onPrepareFromMediaId(str, bundle);
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        y.a(bundle);
        b(sVarA);
        this.f3715a.onPrepareFromSearch(str, bundle);
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        y.a(bundle);
        b(sVarA);
        this.f3715a.onPrepareFromUri(uri, bundle);
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onRewind();
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j5) {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onSeekTo(j5);
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f2) {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onSetPlaybackSpeed(f2);
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onSetRating(RatingCompat.d(rating));
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onSkipToNext();
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onSkipToPrevious();
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j5) {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onSkipToQueueItem(j5);
        sVarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        s sVarA = a();
        if (sVarA == null) {
            return;
        }
        b(sVarA);
        this.f3715a.onStop();
        sVarA.d(null);
    }
}
