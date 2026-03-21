package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.ryanheise.audioservice.AudioService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f3731d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f3732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f3733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3734c = new ArrayList();

    public y(AudioService audioService) {
        PendingIntent broadcast;
        if (TextUtils.isEmpty("media-session")) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        ComponentName mediaButtonReceiverComponent = Z.c.getMediaButtonReceiverComponent(audioService);
        if (mediaButtonReceiverComponent == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (mediaButtonReceiverComponent != null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(mediaButtonReceiverComponent);
            broadcast = PendingIntent.getBroadcast(audioService, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        } else {
            broadcast = null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f3732a = new u(audioService);
        } else if (i >= 28) {
            this.f3732a = new t(audioService);
        } else {
            this.f3732a = new s(audioService);
        }
        this.f3732a.f(new m(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.f3732a.f3718a.setMediaButtonReceiver(broadcast);
        this.f3733b = new l(audioService, this.f3732a.f3720c);
        if (f3731d == 0) {
            f3731d = (int) (TypedValue.applyDimension(1, 320.0f, audioService.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(y.class.getClassLoader());
        }
    }

    public static Bundle f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public final boolean b() {
        return this.f3732a.f3718a.isActive();
    }

    public final void c(boolean z4) {
        this.f3732a.f3718a.setActive(z4);
        Iterator it = this.f3734c.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void d(PlaybackStateCompat playbackStateCompat) {
        s sVar = this.f3732a;
        sVar.f3723f = playbackStateCompat;
        synchronized (sVar.f3721d) {
            for (int iBeginBroadcast = sVar.f3722e.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((InterfaceC0208b) sVar.f3722e.getBroadcastItem(iBeginBroadcast)).V(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            sVar.f3722e.finishBroadcast();
        }
        MediaSession mediaSession = sVar.f3718a;
        if (playbackStateCompat.f3694w == null) {
            PlaybackState.Builder builderD = z.d();
            z.x(builderD, playbackStateCompat.f3683l, playbackStateCompat.f3684m, playbackStateCompat.f3686o, playbackStateCompat.f3690s);
            z.u(builderD, playbackStateCompat.f3685n);
            z.s(builderD, playbackStateCompat.f3687p);
            z.v(builderD, playbackStateCompat.f3689r);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f3691t) {
                PlaybackState.CustomAction customActionB = customAction.f3699p;
                if (customActionB == null) {
                    PlaybackState.CustomAction.Builder builderE = z.e(customAction.f3695l, customAction.f3696m, customAction.f3697n);
                    z.w(builderE, customAction.f3698o);
                    customActionB = z.b(builderE);
                }
                z.a(builderD, customActionB);
            }
            z.t(builderD, playbackStateCompat.f3692u);
            A.b(builderD, playbackStateCompat.f3693v);
            playbackStateCompat.f3694w = z.c(builderD);
        }
        mediaSession.setPlaybackState(playbackStateCompat.f3694w);
    }

    public final void e(List list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) it.next();
                if (mediaSessionCompat$QueueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                long j5 = mediaSessionCompat$QueueItem.f3671m;
                if (hashSet.contains(Long.valueOf(j5))) {
                    Log.e("MediaSessionCompat", "Found duplicate queue id: " + j5, new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j5));
            }
        }
        s sVar = this.f3732a;
        sVar.f3724g = list;
        MediaSession mediaSession = sVar.f3718a;
        if (list == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem2 = (MediaSessionCompat$QueueItem) it2.next();
            MediaSession.QueueItem queueItemA = mediaSessionCompat$QueueItem2.f3672n;
            if (queueItemA == null) {
                queueItemA = w.a(mediaSessionCompat$QueueItem2.f3670l.e(), mediaSessionCompat$QueueItem2.f3671m);
                mediaSessionCompat$QueueItem2.f3672n = queueItemA;
            }
            arrayList.add(queueItemA);
        }
        mediaSession.setQueue(arrayList);
    }
}
