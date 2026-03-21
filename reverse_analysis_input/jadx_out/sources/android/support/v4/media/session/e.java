package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import q.C0735e;

/* JADX INFO: loaded from: classes.dex */
public final class e extends MediaController.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f3702a;

    public e(g gVar) {
        this.f3702a = new WeakReference(gVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        g gVar = (g) this.f3702a.get();
        if (gVar != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            if (Build.VERSION.SDK_INT >= 26) {
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
            gVar.onAudioInfoChanged(new k());
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        y.a(bundle);
        g gVar = (g) this.f3702a.get();
        if (gVar != null) {
            gVar.onExtrasChanged(bundle);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        g gVar = (g) this.f3702a.get();
        if (gVar != null) {
            C0735e c0735e = MediaMetadataCompat.f3646o;
            if (mediaMetadata != null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                mediaMetadataCompatCreateFromParcel.f3651m = mediaMetadata;
            } else {
                mediaMetadataCompatCreateFromParcel = null;
            }
            gVar.onMetadataChanged(mediaMetadataCompatCreateFromParcel);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        g gVar = (g) this.f3702a.get();
        if (gVar == null || gVar.mIControllerCallback != null) {
            return;
        }
        PlaybackStateCompat playbackStateCompat = null;
        if (playbackState != null) {
            List<PlaybackState.CustomAction> listJ = z.j(playbackState);
            if (listJ != null) {
                ArrayList arrayList2 = new ArrayList(listJ.size());
                for (PlaybackState.CustomAction customAction2 : listJ) {
                    if (customAction2 != null) {
                        PlaybackState.CustomAction customAction3 = customAction2;
                        Bundle bundleL = z.l(customAction3);
                        y.a(bundleL);
                        customAction = new PlaybackStateCompat.CustomAction(z.f(customAction3), z.o(customAction3), z.m(customAction3), bundleL);
                        customAction.f3699p = customAction3;
                    } else {
                        customAction = null;
                    }
                    arrayList2.add(customAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Bundle bundleA = A.a(playbackState);
            y.a(bundleA);
            playbackStateCompat = new PlaybackStateCompat(z.r(playbackState), z.q(playbackState), z.i(playbackState), z.p(playbackState), z.g(playbackState), 0, z.k(playbackState), z.n(playbackState), arrayList, z.h(playbackState), bundleA);
            playbackStateCompat.f3694w = playbackState;
        }
        gVar.onPlaybackStateChanged(playbackStateCompat);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        g gVar = (g) this.f3702a.get();
        if (gVar != null) {
            ArrayList arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj != null) {
                        MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                        mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(queueItem, MediaDescriptionCompat.d(w.b(queueItem)), w.c(queueItem));
                    } else {
                        mediaSessionCompat$QueueItem = null;
                    }
                    arrayList2.add(mediaSessionCompat$QueueItem);
                }
                arrayList = arrayList2;
            }
            gVar.onQueueChanged(arrayList);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        g gVar = (g) this.f3702a.get();
        if (gVar != null) {
            gVar.onQueueTitleChanged(charSequence);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        g gVar = (g) this.f3702a.get();
        if (gVar != null) {
            gVar.onSessionDestroyed();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        y.a(bundle);
        g gVar = (g) this.f3702a.get();
        if (gVar != null) {
            gVar.onSessionEvent(str, bundle);
        }
    }
}
