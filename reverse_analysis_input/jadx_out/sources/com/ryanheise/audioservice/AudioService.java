package com.ryanheise.audioservice;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.PowerManager;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.j;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.p;
import android.support.v4.media.session.s;
import android.support.v4.media.session.y;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.util.Size;
import android.view.KeyEvent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media.A;
import androidx.media.C0292i;
import androidx.media.J;
import androidx.media.u;
import e3.C0394c;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q.C0735e;
import t.C0823l;
import t.d0;
import t.r;

/* JADX INFO: loaded from: classes.dex */
public class AudioService extends A {
    private static final long AUTO_ENABLED_ACTIONS = 3669711;
    private static final String BROWSABLE_ROOT_ID = "root";
    public static final String CONTENT_STYLE_BROWSABLE_HINT = "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT";
    public static final int CONTENT_STYLE_CATEGORY_GRID_ITEM_HINT_VALUE = 4;
    public static final int CONTENT_STYLE_CATEGORY_LIST_ITEM_HINT_VALUE = 3;
    public static final int CONTENT_STYLE_GRID_ITEM_HINT_VALUE = 2;
    public static final int CONTENT_STYLE_LIST_ITEM_HINT_VALUE = 1;
    public static final String CONTENT_STYLE_PLAYABLE_HINT = "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT";
    public static final String CONTENT_STYLE_SUPPORTED = "android.media.browse.CONTENT_STYLE_SUPPORTED";
    public static final String CUSTOM_ACTION_FAST_FORWARD = "com.ryanheise.audioservice.action.FAST_FORWARD";
    public static final String CUSTOM_ACTION_REWIND = "com.ryanheise.audioservice.action.REWIND";
    public static final String CUSTOM_ACTION_STOP = "com.ryanheise.audioservice.action.STOP";
    public static final int KEYCODE_BYPASS_PAUSE = 130;
    public static final int KEYCODE_BYPASS_PLAY = 91;
    public static final int MAX_COMPACT_ACTIONS = 3;
    public static final String NOTIFICATION_CLICK_ACTION = "com.ryanheise.audioservice.NOTIFICATION_CLICK";
    private static final int NOTIFICATION_ID = 1124;
    private static final String RECENT_ROOT_ID = "recent";
    private static final int REQUEST_CONTENT_INTENT = 1000;
    private static final String SHARED_PREFERENCES_NAME = "audio_service_preferences";
    private static PendingIntent contentIntent;
    static AudioService instance;
    private static ServiceListener listener;
    private Bitmap artBitmap;
    private LruCache<String, Bitmap> artBitmapCache;
    private int[] compactActionIndices;
    private AudioServiceConfig config;
    private C0394c flutterEngine;
    private MediaMetadataCompat mediaMetadata;
    private y mediaSession;
    private MediaSessionCallback mediaSessionCallback;
    private String notificationChannelId;
    private boolean notificationCreated;
    private int repeatMode;
    private int shuffleMode;
    private J volumeProvider;
    private PowerManager.WakeLock wakeLock;
    private static List<MediaSessionCompat$QueueItem> queue = new ArrayList();
    private static final Map<String, MediaMetadataCompat> mediaMetadataCache = new HashMap();
    private List<MediaControl> controls = new ArrayList();
    private List<C0823l> nativeActions = new ArrayList();
    private List<PlaybackStateCompat.CustomAction> customActions = new ArrayList();
    private boolean playing = false;
    private AudioProcessingState processingState = AudioProcessingState.idle;
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.ryanheise.audioservice.AudioService$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$ryanheise$audioservice$AudioProcessingState;

        static {
            int[] iArr = new int[AudioProcessingState.values().length];
            $SwitchMap$com$ryanheise$audioservice$AudioProcessingState = iArr;
            try {
                iArr[AudioProcessingState.idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ryanheise$audioservice$AudioProcessingState[AudioProcessingState.loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ryanheise$audioservice$AudioProcessingState[AudioProcessingState.buffering.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ryanheise$audioservice$AudioProcessingState[AudioProcessingState.ready.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ryanheise$audioservice$AudioProcessingState[AudioProcessingState.completed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ryanheise$audioservice$AudioProcessingState[AudioProcessingState.error.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public interface ServiceListener {
        void onAddQueueItem(MediaMetadataCompat mediaMetadataCompat);

        void onAddQueueItemAt(MediaMetadataCompat mediaMetadataCompat, int i);

        void onAdjustVolume(int i);

        void onClick(MediaButton mediaButton);

        void onClose();

        void onCustomAction(String str, Bundle bundle);

        void onDestroy();

        void onFastForward();

        void onLoadChildren(String str, u uVar, Bundle bundle);

        void onLoadItem(String str, u uVar);

        void onPause();

        void onPlay();

        void onPlayFromMediaId(String str, Bundle bundle);

        void onPlayFromSearch(String str, Bundle bundle);

        void onPlayFromUri(Uri uri, Bundle bundle);

        void onPlayMediaItem(MediaMetadataCompat mediaMetadataCompat);

        void onPrepare();

        void onPrepareFromMediaId(String str, Bundle bundle);

        void onPrepareFromSearch(String str, Bundle bundle);

        void onPrepareFromUri(Uri uri, Bundle bundle);

        void onRemoveQueueItem(MediaMetadataCompat mediaMetadataCompat);

        void onRemoveQueueItemAt(int i);

        void onRewind();

        void onSearch(String str, Bundle bundle, u uVar);

        void onSeekTo(long j5);

        void onSetCaptioningEnabled(boolean z4);

        void onSetPlaybackSpeed(float f2);

        void onSetRating(RatingCompat ratingCompat);

        void onSetRating(RatingCompat ratingCompat, Bundle bundle);

        void onSetRepeatMode(int i);

        void onSetShuffleMode(int i);

        void onSetVolumeTo(int i);

        void onSkipToNext();

        void onSkipToPrevious();

        void onSkipToQueueItem(long j5);

        void onStop();

        void onTaskRemoved();
    }

    private void acquireWakeLock() {
        if (this.wakeLock.isHeld()) {
            return;
        }
        this.wakeLock.acquire();
    }

    private void activateMediaSession() {
        if (this.mediaSession.b()) {
            return;
        }
        this.mediaSession.c(true);
    }

    private Notification buildNotification() {
        int[] iArr = this.compactActionIndices;
        if (iArr == null) {
            int iMin = Math.min(3, this.nativeActions.size());
            int[] iArr2 = new int[iMin];
            for (int i = 0; i < iMin; i++) {
                iArr2[i] = i;
            }
            iArr = iArr2;
        }
        r notificationBuilder = getNotificationBuilder();
        MediaMetadataCompat mediaMetadataCompat = this.mediaMetadata;
        if (mediaMetadataCompat != null) {
            MediaDescriptionCompat mediaDescriptionCompatD = mediaMetadataCompat.d();
            CharSequence charSequence = mediaDescriptionCompatD.f3638m;
            if (charSequence != null) {
                notificationBuilder.getClass();
                notificationBuilder.f9773e = r.b(charSequence);
            }
            CharSequence charSequence2 = mediaDescriptionCompatD.f3639n;
            if (charSequence2 != null) {
                notificationBuilder.getClass();
                notificationBuilder.f9774f = r.b(charSequence2);
            }
            CharSequence charSequence3 = mediaDescriptionCompatD.f3640o;
            if (charSequence3 != null) {
                notificationBuilder.getClass();
                notificationBuilder.f9782o = r.b(charSequence3);
            }
            synchronized (this) {
                try {
                    Bitmap bitmap = this.artBitmap;
                    if (bitmap != null) {
                        notificationBuilder.d(bitmap);
                    }
                } finally {
                }
            }
        }
        if (this.config.androidNotificationClickStartsActivity) {
            notificationBuilder.f9775g = this.mediaSession.f3733b.f3711a.f3706a.getSessionActivity();
        }
        int i5 = this.config.notificationColor;
        if (i5 != -1) {
            notificationBuilder.y = i5;
        }
        for (C0823l c0823l : this.nativeActions) {
            if (c0823l != null) {
                notificationBuilder.f9770b.add(c0823l);
            } else {
                notificationBuilder.getClass();
            }
        }
        Y.c cVar = new Y.c();
        cVar.f2680f = this.mediaSession.f3732a.f3720c;
        if (Build.VERSION.SDK_INT < 33) {
            cVar.f2679e = iArr;
        }
        if (this.config.androidNotificationOngoing) {
            buildMediaButtonPendingIntent(1L);
            notificationBuilder.c(2, true);
        }
        notificationBuilder.e(cVar);
        return notificationBuilder.a();
    }

    private static int calculateInSampleSize(BitmapFactory.Options options, int i, int i5) {
        int i6 = options.outHeight;
        int i7 = options.outWidth;
        int i8 = 1;
        if (i6 > i5 || i7 > i) {
            int i9 = i6 / 2;
            int i10 = i7 / 2;
            while (i9 / i8 >= i5 && i10 / i8 >= i) {
                i8 *= 2;
            }
        }
        return i8;
    }

    private void createChannel() {
        NotificationManager notificationManager = getNotificationManager();
        if (notificationManager.getNotificationChannel(this.notificationChannelId) == null) {
            com.dexterous.flutterlocalnotifications.b.r();
            NotificationChannel notificationChannelG = com.dexterous.flutterlocalnotifications.b.g(this.notificationChannelId, this.config.androidNotificationChannelName);
            notificationChannelG.setShowBadge(this.config.androidShowNotificationBadge);
            String str = this.config.androidNotificationChannelDescription;
            if (str != null) {
                notificationChannelG.setDescription(str);
            }
            notificationManager.createNotificationChannel(notificationChannelG);
        }
    }

    private void deactivateMediaSession() {
        if (this.mediaSession.b()) {
            this.mediaSession.c(false);
        }
        getNotificationManager().cancel(NOTIFICATION_ID);
    }

    private void enterPlayingState() {
        i4.a.X(this, new Intent(this, (Class<?>) AudioService.class));
        if (!this.mediaSession.b()) {
            this.mediaSession.c(true);
        }
        acquireWakeLock();
        y yVar = this.mediaSession;
        yVar.f3732a.f3718a.setSessionActivity(contentIntent);
        internalStartForeground();
    }

    private void exitForegroundState() {
        d0.a(this, 2);
        releaseWakeLock();
    }

    private void exitPlayingState() {
        if (this.config.androidStopForegroundOnPause) {
            exitForegroundState();
        }
    }

    public static MediaMetadataCompat getMediaMetadata(String str) {
        return mediaMetadataCache.get(str);
    }

    private r getNotificationBuilder() {
        if (Build.VERSION.SDK_INT >= 26) {
            createChannel();
        }
        r rVar = new r(this, this.notificationChannelId);
        rVar.f9792z = 1;
        rVar.f9779l = false;
        rVar.f9766F.deleteIntent = buildDeletePendingIntent();
        rVar.f9766F.icon = getResourceId(this.config.androidNotificationIcon);
        return rVar;
    }

    private NotificationManager getNotificationManager() {
        return (NotificationManager) getSystemService("notification");
    }

    public static void init(ServiceListener serviceListener) {
        listener = serviceListener;
    }

    private void internalStartForeground() {
        startForeground(NOTIFICATION_ID, buildNotification());
        this.notificationCreated = true;
    }

    private Bundle mapToBundle(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                bundle.putInt(string, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(string, ((Long) value).longValue());
            } else {
                bundle.putString(string, value.toString());
            }
        }
        return bundle;
    }

    private boolean needCustomMediaControl(MediaControl mediaControl) {
        return mediaControl.customAction != null;
    }

    private MediaMetadataCompat putArtToMetadata(MediaMetadataCompat mediaMetadataCompat) {
        B0.d dVar = new B0.d();
        Bundle bundle = new Bundle(mediaMetadataCompat.f3650l);
        dVar.f190l = bundle;
        y.a(bundle);
        dVar.o("android.media.metadata.ALBUM_ART", this.artBitmap);
        dVar.o("android.media.metadata.DISPLAY_ICON", this.artBitmap);
        return new MediaMetadataCompat((Bundle) dVar.f190l);
    }

    private void releaseMediaSession() {
        if (this.mediaSession == null) {
            return;
        }
        deactivateMediaSession();
        s sVar = this.mediaSession.f3732a;
        sVar.f3722e.kill();
        int i = Build.VERSION.SDK_INT;
        MediaSession mediaSession = sVar.f3718a;
        if (i == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e5) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e5);
            }
        }
        mediaSession.setCallback(null);
        sVar.f3719b.f3717c.set(null);
        mediaSession.release();
        this.mediaSession = null;
    }

    private void releaseWakeLock() {
        if (this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
    }

    public static int toKeyCode(long j5) {
        if (j5 == 4) {
            return 91;
        }
        return j5 == 2 ? KEYCODE_BYPASS_PAUSE : PlaybackStateCompat.d(j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNotification() {
        if (this.notificationCreated) {
            getNotificationManager().notify(NOTIFICATION_ID, buildNotification());
        }
    }

    public PendingIntent buildDeletePendingIntent() {
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction(MediaButtonReceiver.ACTION_NOTIFICATION_DELETE);
        return PendingIntent.getBroadcast(this, 0, intent, 67108864);
    }

    public PendingIntent buildMediaButtonPendingIntent(long j5) {
        int keyCode = toKeyCode(j5);
        if (keyCode == 0) {
            return null;
        }
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, keyCode));
        return PendingIntent.getBroadcast(this, keyCode, intent, 67108864);
    }

    public void configure(AudioServiceConfig audioServiceConfig) {
        this.config = audioServiceConfig;
        String str = audioServiceConfig.androidNotificationChannelId;
        if (str == null) {
            str = getApplication().getPackageName() + ".channel";
        }
        this.notificationChannelId = str;
        if (audioServiceConfig.activityClassName != null) {
            Context applicationContext = getApplicationContext();
            Intent intent = new Intent((String) null);
            intent.setComponent(new ComponentName(applicationContext, audioServiceConfig.activityClassName));
            intent.setAction(NOTIFICATION_CLICK_ACTION);
            contentIntent = PendingIntent.getActivity(applicationContext, REQUEST_CONTENT_INTENT, intent, 201326592);
        } else {
            contentIntent = null;
        }
        if (audioServiceConfig.androidResumeOnClick) {
            return;
        }
        this.mediaSession.f3732a.f3718a.setMediaButtonReceiver(null);
    }

    public C0823l createAction(String str, String str2, long j5) {
        int resourceId = getResourceId(str);
        return new C0823l(resourceId == 0 ? null : IconCompat.g(null, "", resourceId), str2, buildMediaButtonPendingIntent(j5), new Bundle(), null, null, true, 0, true, false);
    }

    public PlaybackStateCompat.CustomAction createCustomAction(MediaControl mediaControl) {
        int resourceId = getResourceId(mediaControl.icon);
        CustomMediaAction customMediaAction = mediaControl.customAction;
        if (customMediaAction != null) {
            String str = customMediaAction.name;
            String str2 = mediaControl.label;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("You must specify a name to build a CustomAction");
            }
            if (resourceId != 0) {
                return new PlaybackStateCompat.CustomAction(str, str2, resourceId, mapToBundle(mediaControl.customAction.extras));
            }
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            long j5 = mediaControl.actionCode;
            if (j5 == 1) {
                String str3 = mediaControl.label;
                if (TextUtils.isEmpty(CUSTOM_ACTION_STOP)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(str3)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (resourceId != 0) {
                    return new PlaybackStateCompat.CustomAction(CUSTOM_ACTION_STOP, str3, resourceId, null);
                }
                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
            }
            if (j5 == 64) {
                String str4 = mediaControl.label;
                if (TextUtils.isEmpty(CUSTOM_ACTION_FAST_FORWARD)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(str4)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (resourceId != 0) {
                    return new PlaybackStateCompat.CustomAction(CUSTOM_ACTION_FAST_FORWARD, str4, resourceId, null);
                }
                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
            }
            if (j5 == 8) {
                String str5 = mediaControl.label;
                if (TextUtils.isEmpty(CUSTOM_ACTION_REWIND)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(str5)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (resourceId != 0) {
                    return new PlaybackStateCompat.CustomAction(CUSTOM_ACTION_REWIND, str5, resourceId, null);
                }
                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
            }
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00b1. Please report as an issue. */
    public MediaMetadataCompat createMediaMetadata(String str, String str2, String str3, String str4, String str5, Long l3, String str6, Boolean bool, String str7, String str8, String str9, RatingCompat ratingCompat, Map<?, ?> map) {
        B0.d dVar = new B0.d(29);
        dVar.r("android.media.metadata.MEDIA_ID", str);
        dVar.r("android.media.metadata.TITLE", str2);
        if (str3 != null) {
            dVar.r("android.media.metadata.ALBUM", str3);
        }
        if (str4 != null) {
            dVar.r("android.media.metadata.ARTIST", str4);
        }
        if (str5 != null) {
            dVar.r("android.media.metadata.GENRE", str5);
        }
        if (l3 != null) {
            dVar.p("android.media.metadata.DURATION", l3.longValue());
        }
        if (str6 != null) {
            dVar.r("android.media.metadata.DISPLAY_ICON_URI", str6);
        }
        if (bool != null) {
            dVar.p("playable_long", bool.booleanValue() ? 1L : 0L);
        }
        if (str7 != null) {
            dVar.r("android.media.metadata.DISPLAY_TITLE", str7);
        }
        if (str8 != null) {
            dVar.r("android.media.metadata.DISPLAY_SUBTITLE", str8);
        }
        if (str9 != null) {
            dVar.r("android.media.metadata.DISPLAY_DESCRIPTION", str9);
        }
        Bundle bundle = (Bundle) dVar.f190l;
        if (ratingCompat != null) {
            C0735e c0735e = MediaMetadataCompat.f3646o;
            Object obj = null;
            if (c0735e.containsKey("android.media.metadata.RATING") && ((Integer) c0735e.getOrDefault("android.media.metadata.RATING", null)).intValue() != 3) {
                throw new IllegalArgumentException("The android.media.metadata.RATING key cannot be used to put a Rating");
            }
            if (ratingCompat.f3655n == null) {
                boolean zE = ratingCompat.e();
                int i = ratingCompat.f3653l;
                if (zE) {
                    boolean z4 = false;
                    float f2 = -1.0f;
                    float f5 = ratingCompat.f3654m;
                    switch (i) {
                        case 1:
                            if (i == 1) {
                                z4 = f5 == 1.0f;
                            }
                            ratingCompat.f3655n = j.g(z4);
                            break;
                        case 2:
                            if (i == 2) {
                                z4 = f5 == 1.0f;
                            }
                            ratingCompat.f3655n = j.j(z4);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            if ((i != 3 && i != 4 && i != 5) || !ratingCompat.e()) {
                                f5 = -1.0f;
                            }
                            ratingCompat.f3655n = j.i(i, f5);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (i == 6 && ratingCompat.e()) {
                                f2 = f5;
                            }
                            ratingCompat.f3655n = j.h(f2);
                            break;
                    }
                    bundle.putParcelable("android.media.metadata.RATING", (Parcelable) obj);
                } else {
                    ratingCompat.f3655n = j.k(i);
                }
                obj = ratingCompat.f3655n;
                bundle.putParcelable("android.media.metadata.RATING", (Parcelable) obj);
            } else {
                obj = ratingCompat.f3655n;
                bundle.putParcelable("android.media.metadata.RATING", (Parcelable) obj);
            }
        }
        if (map != null) {
            Iterator<?> it = map.keySet().iterator();
            while (it.hasNext()) {
                String str10 = (String) it.next();
                Object obj2 = map.get(str10);
                if (obj2 instanceof Long) {
                    dVar.p(str10, ((Long) obj2).longValue());
                } else if (obj2 instanceof Integer) {
                    dVar.p(str10, ((Integer) obj2).intValue());
                } else if (obj2 instanceof String) {
                    dVar.r(str10, (String) obj2);
                } else if (obj2 instanceof Boolean) {
                    dVar.p(str10, ((Boolean) obj2).booleanValue() ? 1L : 0L);
                } else if (obj2 instanceof Double) {
                    dVar.r(str10, obj2.toString());
                }
            }
        }
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle);
        mediaMetadataCache.put(str, mediaMetadataCompat);
        return mediaMetadataCompat;
    }

    public AudioServiceConfig getConfig() {
        return this.config;
    }

    public int getPlaybackState() {
        int i = AnonymousClass3.$SwitchMap$com$ryanheise$audioservice$AudioProcessingState[this.processingState.ordinal()];
        if (i == 2) {
            return 8;
        }
        if (i != 3) {
            return i != 4 ? i != 5 ? i != 6 ? 0 : 7 : this.playing ? 3 : 2 : this.playing ? 3 : 2;
        }
        return 6;
    }

    public AudioProcessingState getProcessingState() {
        return this.processingState;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    public int getResourceId(String str) {
        String[] strArrSplit = str.split("/");
        String str2 = strArrSplit[0];
        return getResources().getIdentifier(strArrSplit[1], str2, getApplicationContext().getPackageName());
    }

    public int getShuffleMode() {
        return this.shuffleMode;
    }

    public void handleDeleteNotification() {
        ServiceListener serviceListener = listener;
        if (serviceListener == null) {
            return;
        }
        serviceListener.onClose();
    }

    public boolean isPlaying() {
        return this.playing;
    }

    public Bitmap loadArtBitmap(String str, String str2) {
        FileDescriptor fileDescriptor;
        Bitmap bitmapDecodeFileDescriptor = this.artBitmapCache.get(str);
        if (bitmapDecodeFileDescriptor != null) {
            return bitmapDecodeFileDescriptor;
        }
        try {
            Uri uri = Uri.parse(str);
            boolean zEquals = "content".equals(uri.getScheme());
            if (zEquals) {
                if (str2 != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            Size size = new Size(192, 192);
                            ContentResolver contentResolver = getContentResolver();
                            int width = this.config.artDownscaleWidth;
                            if (width == -1) {
                                width = size.getWidth();
                            }
                            int height = this.config.artDownscaleHeight;
                            if (height == -1) {
                                height = size.getHeight();
                            }
                            bitmapDecodeFileDescriptor = contentResolver.loadThumbnail(uri, new Size(width, height), null);
                            if (bitmapDecodeFileDescriptor == null) {
                                return null;
                            }
                            fileDescriptor = null;
                        }
                    } catch (FileNotFoundException | IOException unused) {
                    }
                }
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = getContentResolver().openFileDescriptor(uri, "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                }
                return null;
            }
            fileDescriptor = null;
            if (!zEquals || fileDescriptor != null) {
                if (this.config.artDownscaleWidth != -1) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    if (fileDescriptor != null) {
                        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    } else {
                        BitmapFactory.decodeFile(uri.getPath(), options);
                    }
                    AudioServiceConfig audioServiceConfig = this.config;
                    options.inSampleSize = calculateInSampleSize(options, audioServiceConfig.artDownscaleWidth, audioServiceConfig.artDownscaleHeight);
                    options.inJustDecodeBounds = false;
                    bitmapDecodeFileDescriptor = fileDescriptor != null ? BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options) : BitmapFactory.decodeFile(uri.getPath(), options);
                } else {
                    bitmapDecodeFileDescriptor = fileDescriptor != null ? BitmapFactory.decodeFileDescriptor(fileDescriptor) : BitmapFactory.decodeFile(uri.getPath());
                }
            }
            this.artBitmapCache.put(str, bitmapDecodeFileDescriptor);
            return bitmapDecodeFileDescriptor;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // androidx.media.A, android.app.Service
    public void onCreate() {
        super.onCreate();
        instance = this;
        this.repeatMode = 0;
        this.shuffleMode = 0;
        this.notificationCreated = false;
        this.playing = false;
        this.processingState = AudioProcessingState.idle;
        this.mediaSession = new y(this);
        configure(new AudioServiceConfig(getApplicationContext()));
        this.mediaSession.f3732a.f3718a.setFlags(7);
        this.mediaSession.d(new PlaybackStateCompat(0, 0L, 0L, 0.0f, AUTO_ENABLED_ACTIONS, 0, null, 0L, new ArrayList(), -1L, null));
        y yVar = this.mediaSession;
        MediaSessionCallback mediaSessionCallback = new MediaSessionCallback();
        this.mediaSessionCallback = mediaSessionCallback;
        yVar.f3732a.f(mediaSessionCallback, new Handler());
        setSessionToken(this.mediaSession.f3732a.f3720c);
        this.mediaSession.e(queue);
        this.wakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        this.artBitmapCache = new LruCache<String, Bitmap>(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8) { // from class: com.ryanheise.audioservice.AudioService.1
            @Override // android.util.LruCache
            public int sizeOf(String str, Bitmap bitmap) {
                return bitmap.getByteCount() / 1024;
            }
        };
        this.flutterEngine = AudioServicePlugin.getFlutterEngine(this);
        System.out.println("flutterEngine warmed up");
    }

    @Override // androidx.media.A, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ServiceListener serviceListener = listener;
        if (serviceListener != null) {
            serviceListener.onDestroy();
            listener = null;
        }
        this.mediaMetadata = null;
        this.artBitmap = null;
        queue.clear();
        mediaMetadataCache.clear();
        this.controls.clear();
        this.artBitmapCache.evictAll();
        this.compactActionIndices = null;
        releaseMediaSession();
        d0.a(this, this.config.androidResumeOnClick ? 2 : 1);
        releaseWakeLock();
        instance = null;
        this.notificationCreated = false;
    }

    @Override // androidx.media.A
    public C0292i onGetRoot(String str, int i, Bundle bundle) {
        Boolean boolValueOf = bundle == null ? null : Boolean.valueOf(bundle.getBoolean("android.service.media.extra.RECENT"));
        if (boolValueOf == null) {
            boolValueOf = Boolean.FALSE;
        }
        return new C0292i(boolValueOf.booleanValue() ? RECENT_ROOT_ID : BROWSABLE_ROOT_ID, this.config.getBrowsableRootExtras());
    }

    @Override // androidx.media.A
    public void onLoadChildren(String str, u uVar) {
        onLoadChildren(str, uVar, null);
    }

    @Override // androidx.media.A
    public void onLoadItem(String str, u uVar) {
        ServiceListener serviceListener = listener;
        if (serviceListener == null) {
            uVar.f(null);
        } else {
            serviceListener.onLoadItem(str, uVar);
        }
    }

    @Override // androidx.media.A
    public void onSearch(String str, Bundle bundle, u uVar) {
        ServiceListener serviceListener = listener;
        if (serviceListener == null) {
            uVar.f(new ArrayList());
        } else {
            serviceListener.onSearch(str, bundle, uVar);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i5) {
        Z.c.handleIntent(this.mediaSession, intent);
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        ServiceListener serviceListener = listener;
        if (serviceListener != null) {
            serviceListener.onTaskRemoved();
        }
        super.onTaskRemoved(intent);
    }

    public void playMediaItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.mediaSessionCallback.onPlayMediaItem(mediaDescriptionCompat);
    }

    public synchronized void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadata mediaMetadata;
        try {
            String strE = mediaMetadataCompat.e("artCacheFile");
            if (strE != null) {
                this.artBitmap = loadArtBitmap(strE, null);
                mediaMetadataCompat = putArtToMetadata(mediaMetadataCompat);
            } else {
                String strE2 = mediaMetadataCompat.e("android.media.metadata.DISPLAY_ICON_URI");
                if (strE2 == null || !strE2.startsWith("content:")) {
                    this.artBitmap = null;
                } else {
                    this.artBitmap = loadArtBitmap(strE2, mediaMetadataCompat.e("loadThumbnailUri"));
                    mediaMetadataCompat = putArtToMetadata(mediaMetadataCompat);
                }
            }
            this.mediaMetadata = mediaMetadataCompat;
            s sVar = this.mediaSession.f3732a;
            sVar.f3725h = mediaMetadataCompat;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                if (mediaMetadataCompat.f3651m == null) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaMetadataCompat.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    mediaMetadataCompat.f3651m = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
                    parcelObtain.recycle();
                }
                mediaMetadata = mediaMetadataCompat.f3651m;
            }
            sVar.f3718a.setMetadata(mediaMetadata);
            this.handler.removeCallbacksAndMessages(null);
            this.handler.post(new c(this, 2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setPlaybackInfo(int i, Integer num, Integer num2, Integer num3) {
        if (i == 1) {
            s sVar = this.mediaSession.f3732a;
            sVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(3);
            sVar.f3718a.setPlaybackToLocal(builder.build());
            this.volumeProvider = null;
            return;
        }
        if (i == 2) {
            if (this.volumeProvider != null && num.intValue() == this.volumeProvider.getVolumeControl() && num2.intValue() == this.volumeProvider.getMaxVolume()) {
                this.volumeProvider.setCurrentVolume(num3.intValue());
            } else {
                this.volumeProvider = new J(num.intValue(), num2.intValue(), num3.intValue()) { // from class: com.ryanheise.audioservice.AudioService.2
                    @Override // androidx.media.J
                    public void onAdjustVolume(int i5) {
                        if (AudioService.listener == null) {
                            return;
                        }
                        AudioService.listener.onAdjustVolume(i5);
                    }

                    @Override // androidx.media.J
                    public void onSetVolumeTo(int i5) {
                        if (AudioService.listener == null) {
                            return;
                        }
                        AudioService.listener.onSetVolumeTo(i5);
                    }
                };
            }
            y yVar = this.mediaSession;
            J j5 = this.volumeProvider;
            if (j5 == null) {
                yVar.getClass();
                throw new IllegalArgumentException("volumeProvider may not be null!");
            }
            s sVar2 = yVar.f3732a;
            sVar2.getClass();
            sVar2.f3718a.setPlaybackToRemote((VolumeProvider) j5.getVolumeProvider());
        }
    }

    public synchronized void setQueue(List<MediaSessionCompat$QueueItem> list) {
        queue = list;
        this.mediaSession.e(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(java.util.List<com.ryanheise.audioservice.MediaControl> r29, long r30, int[] r32, com.ryanheise.audioservice.AudioProcessingState r33, boolean r34, long r35, long r37, float r39, long r40, java.lang.Integer r42, java.lang.String r43, int r44, int r45, boolean r46, java.lang.Long r47) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.setState(java.util.List, long, int[], com.ryanheise.audioservice.AudioProcessingState, boolean, long, long, float, long, java.lang.Integer, java.lang.String, int, int, boolean, java.lang.Long):void");
    }

    public void stop() {
        deactivateMediaSession();
        stopSelf();
    }

    public class MediaSessionCallback extends p {
        public MediaSessionCallback() {
        }

        private MediaButton eventToButton(KeyEvent keyEvent) {
            int keyCode = keyEvent.getKeyCode();
            return (keyCode == 79 || keyCode == 85) ? MediaButton.media : keyCode != 87 ? keyCode != 88 ? MediaButton.media : MediaButton.previous : MediaButton.next;
        }

        @Override // android.support.v4.media.session.p
        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onAddQueueItem(AudioService.getMediaMetadata(mediaDescriptionCompat.f3637l));
        }

        @Override // android.support.v4.media.session.p
        public void onCustomAction(String str, Bundle bundle) {
            if (AudioService.listener == null) {
                return;
            }
            if (AudioService.CUSTOM_ACTION_STOP.equals(str)) {
                AudioService.listener.onStop();
                return;
            }
            if (AudioService.CUSTOM_ACTION_FAST_FORWARD.equals(str)) {
                AudioService.listener.onFastForward();
            } else if (AudioService.CUSTOM_ACTION_REWIND.equals(str)) {
                AudioService.listener.onRewind();
            } else {
                AudioService.listener.onCustomAction(str, bundle);
            }
        }

        @Override // android.support.v4.media.session.p
        public void onFastForward() {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onFastForward();
        }

        @Override // android.support.v4.media.session.p
        public boolean onMediaButtonEvent(Intent intent) {
            if (AudioService.listener == null) {
                return false;
            }
            KeyEvent keyEvent = (KeyEvent) intent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
            if (keyEvent.getAction() != 0) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79) {
                if (keyCode == 130) {
                    onPause();
                    return true;
                }
                if (keyCode != 126 && keyCode != 127) {
                    switch (keyCode) {
                        case 85:
                        case 87:
                        case 88:
                            break;
                        case 86:
                            onStop();
                            return true;
                        case 89:
                            onRewind();
                            return true;
                        case 90:
                            onFastForward();
                            return true;
                        case AudioService.KEYCODE_BYPASS_PLAY /* 91 */:
                            onPlay();
                            return true;
                        default:
                            return true;
                    }
                }
            }
            AudioService.listener.onClick(eventToButton(keyEvent));
            return true;
        }

        @Override // android.support.v4.media.session.p
        public void onPause() {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onPause();
        }

        @Override // android.support.v4.media.session.p
        public void onPlay() {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onPlay();
        }

        @Override // android.support.v4.media.session.p
        public void onPlayFromMediaId(String str, Bundle bundle) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onPlayFromMediaId(str, bundle);
        }

        @Override // android.support.v4.media.session.p
        public void onPlayFromSearch(String str, Bundle bundle) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onPlayFromSearch(str, bundle);
        }

        @Override // android.support.v4.media.session.p
        public void onPlayFromUri(Uri uri, Bundle bundle) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onPlayFromUri(uri, bundle);
        }

        public void onPlayMediaItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onPlayMediaItem(AudioService.getMediaMetadata(mediaDescriptionCompat.f3637l));
        }

        @Override // android.support.v4.media.session.p
        public void onPrepare() {
            if (AudioService.listener == null) {
                return;
            }
            if (!AudioService.this.mediaSession.b()) {
                AudioService.this.mediaSession.c(true);
            }
            AudioService.listener.onPrepare();
        }

        @Override // android.support.v4.media.session.p
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            if (AudioService.listener == null) {
                return;
            }
            if (!AudioService.this.mediaSession.b()) {
                AudioService.this.mediaSession.c(true);
            }
            AudioService.listener.onPrepareFromMediaId(str, bundle);
        }

        @Override // android.support.v4.media.session.p
        public void onPrepareFromSearch(String str, Bundle bundle) {
            if (AudioService.listener == null) {
                return;
            }
            if (!AudioService.this.mediaSession.b()) {
                AudioService.this.mediaSession.c(true);
            }
            AudioService.listener.onPrepareFromSearch(str, bundle);
        }

        @Override // android.support.v4.media.session.p
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            if (AudioService.listener == null) {
                return;
            }
            if (!AudioService.this.mediaSession.b()) {
                AudioService.this.mediaSession.c(true);
            }
            AudioService.listener.onPrepareFromUri(uri, bundle);
        }

        @Override // android.support.v4.media.session.p
        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onRemoveQueueItem(AudioService.getMediaMetadata(mediaDescriptionCompat.f3637l));
        }

        @Override // android.support.v4.media.session.p
        public void onRewind() {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onRewind();
        }

        @Override // android.support.v4.media.session.p
        public void onSeekTo(long j5) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onSeekTo(j5);
        }

        @Override // android.support.v4.media.session.p
        public void onSetCaptioningEnabled(boolean z4) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onSetCaptioningEnabled(z4);
        }

        @Override // android.support.v4.media.session.p
        public void onSetPlaybackSpeed(float f2) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onSetPlaybackSpeed(f2);
        }

        @Override // android.support.v4.media.session.p
        public void onSetRating(RatingCompat ratingCompat) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onSetRating(ratingCompat);
        }

        @Override // android.support.v4.media.session.p
        public void onSetRepeatMode(int i) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onSetRepeatMode(i);
        }

        @Override // android.support.v4.media.session.p
        public void onSetShuffleMode(int i) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onSetShuffleMode(i);
        }

        @Override // android.support.v4.media.session.p
        public void onSkipToNext() {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onSkipToNext();
        }

        @Override // android.support.v4.media.session.p
        public void onSkipToPrevious() {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onSkipToPrevious();
        }

        @Override // android.support.v4.media.session.p
        public void onSkipToQueueItem(long j5) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onSkipToQueueItem(j5);
        }

        @Override // android.support.v4.media.session.p
        public void onStop() {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onStop();
        }

        @Override // android.support.v4.media.session.p
        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onSetRating(ratingCompat, bundle);
        }

        @Override // android.support.v4.media.session.p
        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (AudioService.listener == null) {
                return;
            }
            AudioService.listener.onAddQueueItemAt(AudioService.getMediaMetadata(mediaDescriptionCompat.f3637l), i);
        }
    }

    @Override // androidx.media.A
    public void onLoadChildren(String str, u uVar, Bundle bundle) {
        ServiceListener serviceListener = listener;
        if (serviceListener == null) {
            uVar.f(new ArrayList());
        } else {
            serviceListener.onLoadChildren(str, uVar, bundle);
        }
    }
}
