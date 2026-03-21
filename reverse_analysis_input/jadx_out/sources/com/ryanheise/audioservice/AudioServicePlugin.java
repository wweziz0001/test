package com.ryanheise.audioservice;

import O.j;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.e;
import android.support.v4.media.g;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.l;
import android.util.Log;
import androidx.media.u;
import com.ryanheise.audioservice.AudioService;
import e3.C0394c;
import e3.C0398g;
import f3.C0433a;
import io.flutter.embedding.android.AbstractActivityC0488g;
import j3.C0524a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3.InterfaceC0541a;
import k3.InterfaceC0542b;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0696f;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;
import n3.t;
import y2.n;

/* JADX INFO: loaded from: classes.dex */
public class AudioServicePlugin implements j3.b, InterfaceC0541a {
    private static final String CHANNEL_CLIENT = "com.ryanheise.audio_service.client.methods";
    private static final String CHANNEL_HANDLER = "com.ryanheise.audio_service.handler.methods";
    private static AudioHandlerInterface audioHandlerInterface = null;
    private static InterfaceC0706p configureResult = null;
    private static String flutterEngineId = "audio_service_engine";
    private static boolean flutterReady;
    private static ClientInterface mainClientInterface;
    private static g mediaBrowser;
    private static l mediaController;
    private InterfaceC0542b activityPluginBinding;
    private Context applicationContext;
    private ClientInterface clientInterface;
    private final android.support.v4.media.d connectionCallback = new android.support.v4.media.d() { // from class: com.ryanheise.audioservice.AudioServicePlugin.2
        @Override // android.support.v4.media.d
        public void onConnected() {
            if (AudioServicePlugin.this.applicationContext == null) {
                return;
            }
            try {
                e eVar = AudioServicePlugin.mediaBrowser.f3668a;
                if (eVar.f3666h == null) {
                    MediaSession.Token sessionToken = eVar.f3660b.getSessionToken();
                    eVar.f3666h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, null) : null;
                }
                AudioServicePlugin.mediaController = new l(AudioServicePlugin.this.applicationContext, eVar.f3666h);
                Activity activity = AudioServicePlugin.mainClientInterface != null ? AudioServicePlugin.mainClientInterface.activity : null;
                if (activity != null) {
                    l.b(activity, AudioServicePlugin.mediaController);
                }
                AudioServicePlugin.mediaController.a(AudioServicePlugin.controllerCallback);
                if (AudioServicePlugin.configureResult != null) {
                    AudioServicePlugin.configureResult.success(AudioServicePlugin.mapOf(new Object[0]));
                    AudioServicePlugin.configureResult = null;
                }
            } catch (Exception e5) {
                System.out.println("onConnected error: " + e5.getMessage());
                e5.printStackTrace();
                if (AudioServicePlugin.configureResult == null) {
                    AudioServicePlugin.this.clientInterface.setServiceConnectionFailed(true);
                    return;
                }
                AudioServicePlugin.configureResult.error("onConnected error: " + e5.getMessage(), null, null);
            }
        }

        @Override // android.support.v4.media.d
        public void onConnectionFailed() {
            if (AudioServicePlugin.configureResult != null) {
                AudioServicePlugin.configureResult.error("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
            } else {
                AudioServicePlugin.this.clientInterface.setServiceConnectionFailed(true);
            }
        }

        @Override // android.support.v4.media.d
        public void onConnectionSuspended() {
            System.out.println("### UNHANDLED: onConnectionSuspended");
        }
    };
    private C0524a flutterPluginBinding;
    private t newIntentListener;
    private static final Set<ClientInterface> clientInterfaces = new HashSet();
    private static final long bootTime = System.currentTimeMillis() - SystemClock.elapsedRealtime();
    private static final android.support.v4.media.session.g controllerCallback = new android.support.v4.media.session.g() { // from class: com.ryanheise.audioservice.AudioServicePlugin.1
    };

    public static class AudioHandlerInterface implements InterfaceC0705o, AudioService.ServiceListener {
        private static final int SILENCE_SAMPLE_RATE = 44100;
        public C0707q channel;
        public InterfaceC0696f messenger;
        private AudioTrack silenceAudioTrack;
        private final Handler handler = new Handler(Looper.getMainLooper());
        private List<MethodInvocation> methodInvocationQueue = new LinkedList();

        public AudioHandlerInterface(InterfaceC0696f interfaceC0696f) {
            this.messenger = interfaceC0696f;
            C0707q c0707q = new C0707q(interfaceC0696f, AudioServicePlugin.CHANNEL_HANDLER);
            this.channel = c0707q;
            c0707q.b(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void destroy() {
            AudioTrack audioTrack = this.silenceAudioTrack;
            if (audioTrack != null) {
                audioTrack.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onMethodCall$1(InterfaceC0706p interfaceC0706p, Exception exc) {
            interfaceC0706p.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(exc));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMethodCall$2(Map map, InterfaceC0706p interfaceC0706p) {
            try {
                AudioService.instance.setMetadata(AudioServicePlugin.createMediaMetadata((Map) map.get("mediaItem")));
                this.handler.post(new c(interfaceC0706p, 1));
            } catch (Exception e5) {
                this.handler.post(new d(interfaceC0706p, e5, 1));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onMethodCall$4(InterfaceC0706p interfaceC0706p, Exception exc) {
            interfaceC0706p.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(exc));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMethodCall$5(Map map, InterfaceC0706p interfaceC0706p) {
            try {
                AudioService.instance.setQueue(AudioServicePlugin.raw2queue((List) map.get("queue")));
                this.handler.post(new c(interfaceC0706p, 0));
            } catch (Exception e5) {
                this.handler.post(new d(interfaceC0706p, e5, 0));
            }
        }

        public void invokeMethod(String str, Object obj) {
            invokeMethod(str, obj, null);
        }

        public void invokePendingMethods() {
            for (MethodInvocation methodInvocation : this.methodInvocationQueue) {
                this.channel.a(methodInvocation.method, methodInvocation.arg, methodInvocation.result);
            }
            this.methodInvocationQueue.clear();
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onAddQueueItem(MediaMetadataCompat mediaMetadataCompat) {
            invokeMethod("addQueueItem", AudioServicePlugin.mapOf("mediaItem", AudioServicePlugin.mediaMetadata2raw(mediaMetadataCompat)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onAddQueueItemAt(MediaMetadataCompat mediaMetadataCompat, int i) {
            invokeMethod("insertQueueItem", AudioServicePlugin.mapOf("mediaItem", AudioServicePlugin.mediaMetadata2raw(mediaMetadataCompat), "index", Integer.valueOf(i)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onAdjustVolume(int i) {
            invokeMethod("androidAdjustRemoteVolume", AudioServicePlugin.mapOf("direction", Integer.valueOf(i)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onClick(MediaButton mediaButton) {
            invokeMethod("click", AudioServicePlugin.mapOf("button", Integer.valueOf(mediaButton.ordinal())));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onClose() {
            invokeMethod("onNotificationDeleted", AudioServicePlugin.mapOf(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onCustomAction(String str, Bundle bundle) {
            invokeMethod("customAction", AudioServicePlugin.mapOf("name", str, "extras", AudioServicePlugin.bundleToMap(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onDestroy() {
            AudioServicePlugin.disposeFlutterEngine();
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onFastForward() {
            invokeMethod("fastForward", AudioServicePlugin.mapOf(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onLoadChildren(String str, final u uVar, Bundle bundle) {
            if (AudioServicePlugin.audioHandlerInterface != null) {
                HashMap map = new HashMap();
                map.put("parentMediaId", str);
                map.put("options", AudioServicePlugin.bundleToMap(bundle));
                AudioServicePlugin.audioHandlerInterface.invokeMethod("getChildren", map, new InterfaceC0706p() { // from class: com.ryanheise.audioservice.AudioServicePlugin.AudioHandlerInterface.1
                    @Override // n3.InterfaceC0706p
                    public void error(String str2, String str3, Object obj) {
                        uVar.e(new Bundle());
                    }

                    @Override // n3.InterfaceC0706p
                    public void notImplemented() {
                        uVar.e(new Bundle());
                    }

                    @Override // n3.InterfaceC0706p
                    public void success(Object obj) {
                        List list = (List) ((Map) obj).get("children");
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AudioServicePlugin.rawToMediaItem((Map) it.next()));
                        }
                        uVar.f(arrayList);
                    }
                });
            }
            uVar.a();
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onLoadItem(String str, final u uVar) {
            if (AudioServicePlugin.audioHandlerInterface != null) {
                HashMap map = new HashMap();
                map.put("mediaId", str);
                AudioServicePlugin.audioHandlerInterface.invokeMethod("getMediaItem", map, new InterfaceC0706p() { // from class: com.ryanheise.audioservice.AudioServicePlugin.AudioHandlerInterface.2
                    @Override // n3.InterfaceC0706p
                    public void error(String str2, String str3, Object obj) {
                        uVar.e(new Bundle());
                    }

                    @Override // n3.InterfaceC0706p
                    public void notImplemented() {
                        uVar.e(new Bundle());
                    }

                    @Override // n3.InterfaceC0706p
                    public void success(Object obj) {
                        Map map2 = (Map) ((Map) obj).get("mediaItem");
                        if (map2 == null) {
                            uVar.f(null);
                        } else {
                            uVar.f(AudioServicePlugin.rawToMediaItem(map2));
                        }
                    }
                });
            }
            uVar.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        @Override // n3.InterfaceC0705o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onMethodCall(n3.C0704n r37, final n3.InterfaceC0706p r38) {
            /*
                Method dump skipped, instruction units count: 710
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioServicePlugin.AudioHandlerInterface.onMethodCall(n3.n, n3.p):void");
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onPause() {
            invokeMethod("pause", AudioServicePlugin.mapOf(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onPlay() {
            invokeMethod("play", AudioServicePlugin.mapOf(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onPlayFromMediaId(String str, Bundle bundle) {
            invokeMethod("playFromMediaId", AudioServicePlugin.mapOf("mediaId", str, "extras", AudioServicePlugin.bundleToMap(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onPlayFromSearch(String str, Bundle bundle) {
            invokeMethod("playFromSearch", AudioServicePlugin.mapOf("query", str, "extras", AudioServicePlugin.bundleToMap(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onPlayFromUri(Uri uri, Bundle bundle) {
            invokeMethod("playFromUri", AudioServicePlugin.mapOf("uri", uri.toString(), "extras", AudioServicePlugin.bundleToMap(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onPlayMediaItem(MediaMetadataCompat mediaMetadataCompat) {
            invokeMethod("playMediaItem", AudioServicePlugin.mapOf("mediaItem", AudioServicePlugin.mediaMetadata2raw(mediaMetadataCompat)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onPrepare() {
            invokeMethod("prepare", AudioServicePlugin.mapOf(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            invokeMethod("prepareFromMediaId", AudioServicePlugin.mapOf("mediaId", str, "extras", AudioServicePlugin.bundleToMap(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onPrepareFromSearch(String str, Bundle bundle) {
            invokeMethod("prepareFromSearch", AudioServicePlugin.mapOf("query", str, "extras", AudioServicePlugin.bundleToMap(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            invokeMethod("prepareFromUri", AudioServicePlugin.mapOf("uri", uri.toString(), "extras", AudioServicePlugin.bundleToMap(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onRemoveQueueItem(MediaMetadataCompat mediaMetadataCompat) {
            invokeMethod("removeQueueItem", AudioServicePlugin.mapOf("mediaItem", AudioServicePlugin.mediaMetadata2raw(mediaMetadataCompat)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onRemoveQueueItemAt(int i) {
            invokeMethod("removeQueueItemAt", AudioServicePlugin.mapOf("index", Integer.valueOf(i)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onRewind() {
            invokeMethod("rewind", AudioServicePlugin.mapOf(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSearch(String str, Bundle bundle, final u uVar) {
            if (AudioServicePlugin.audioHandlerInterface != null) {
                HashMap map = new HashMap();
                map.put("query", str);
                map.put("extras", AudioServicePlugin.bundleToMap(bundle));
                AudioServicePlugin.audioHandlerInterface.invokeMethod("search", map, new InterfaceC0706p() { // from class: com.ryanheise.audioservice.AudioServicePlugin.AudioHandlerInterface.3
                    @Override // n3.InterfaceC0706p
                    public void error(String str2, String str3, Object obj) {
                        uVar.e(new Bundle());
                    }

                    @Override // n3.InterfaceC0706p
                    public void notImplemented() {
                        uVar.e(new Bundle());
                    }

                    @Override // n3.InterfaceC0706p
                    public void success(Object obj) {
                        List list = (List) ((Map) obj).get("mediaItems");
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AudioServicePlugin.rawToMediaItem((Map) it.next()));
                        }
                        uVar.f(arrayList);
                    }
                });
            }
            uVar.a();
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSeekTo(long j5) {
            invokeMethod("seek", AudioServicePlugin.mapOf("position", Long.valueOf(j5 * 1000)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSetCaptioningEnabled(boolean z4) {
            invokeMethod("setCaptioningEnabled", AudioServicePlugin.mapOf("enabled", Boolean.valueOf(z4)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSetPlaybackSpeed(float f2) {
            invokeMethod("setSpeed", AudioServicePlugin.mapOf("speed", Float.valueOf(f2)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSetRating(RatingCompat ratingCompat) {
            invokeMethod("setRating", AudioServicePlugin.mapOf("rating", AudioServicePlugin.rating2raw(ratingCompat), "extras", null));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSetRepeatMode(int i) {
            invokeMethod("setRepeatMode", AudioServicePlugin.mapOf("repeatMode", Integer.valueOf(i)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSetShuffleMode(int i) {
            invokeMethod("setShuffleMode", AudioServicePlugin.mapOf("shuffleMode", Integer.valueOf(i)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSetVolumeTo(int i) {
            invokeMethod("androidSetRemoteVolume", AudioServicePlugin.mapOf("volumeIndex", Integer.valueOf(i)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSkipToNext() {
            invokeMethod("skipToNext", AudioServicePlugin.mapOf(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSkipToPrevious() {
            invokeMethod("skipToPrevious", AudioServicePlugin.mapOf(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSkipToQueueItem(long j5) {
            invokeMethod("skipToQueueItem", AudioServicePlugin.mapOf("index", Long.valueOf(j5)));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onStop() {
            invokeMethod("stop", AudioServicePlugin.mapOf(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onTaskRemoved() {
            invokeMethod("onTaskRemoved", AudioServicePlugin.mapOf(new Object[0]));
        }

        public void switchToMessenger(InterfaceC0696f interfaceC0696f) {
            this.channel.b(null);
            this.messenger = interfaceC0696f;
            C0707q c0707q = new C0707q(interfaceC0696f, AudioServicePlugin.CHANNEL_HANDLER);
            this.channel = c0707q;
            c0707q.b(this);
        }

        public void invokeMethod(String str, Object obj, InterfaceC0706p interfaceC0706p) {
            if (AudioServicePlugin.flutterReady) {
                this.channel.a(str, obj, interfaceC0706p);
            } else {
                this.methodInvocationQueue.add(new MethodInvocation(str, obj, interfaceC0706p));
            }
        }

        @Override // com.ryanheise.audioservice.AudioService.ServiceListener
        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
            invokeMethod("setRating", AudioServicePlugin.mapOf("rating", AudioServicePlugin.rating2raw(ratingCompat), "extras", AudioServicePlugin.bundleToMap(bundle)));
        }
    }

    public static class ClientInterface implements InterfaceC0705o {
        private Activity activity;
        private final C0707q channel;
        private Context context;
        public final InterfaceC0696f messenger;
        private boolean serviceConnectionFailed;
        private boolean wrongEngineDetected;

        public ClientInterface(InterfaceC0696f interfaceC0696f) {
            this.messenger = interfaceC0696f;
            C0707q c0707q = new C0707q(interfaceC0696f, AudioServicePlugin.CHANNEL_CLIENT);
            this.channel = c0707q;
            c0707q.b(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivity(Activity activity) {
            this.activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContext(Context context) {
            this.context = context;
        }

        @Override // n3.InterfaceC0705o
        public void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
            try {
                if (this.wrongEngineDetected) {
                    throw new IllegalStateException("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
                }
                String str = c0704n.f8938a;
                if (str.hashCode() == -804429082 && str.equals("configure")) {
                    if (this.serviceConnectionFailed) {
                        throw new IllegalStateException("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
                    }
                    AudioServicePlugin.flutterReady = true;
                    Map map = (Map) ((Map) c0704n.f8939b).get("config");
                    AudioServiceConfig audioServiceConfig = new AudioServiceConfig(this.context.getApplicationContext());
                    audioServiceConfig.androidNotificationClickStartsActivity = ((Boolean) map.get("androidNotificationClickStartsActivity")).booleanValue();
                    audioServiceConfig.androidNotificationOngoing = ((Boolean) map.get("androidNotificationOngoing")).booleanValue();
                    audioServiceConfig.androidResumeOnClick = ((Boolean) map.get("androidResumeOnClick")).booleanValue();
                    audioServiceConfig.androidNotificationChannelId = (String) map.get("androidNotificationChannelId");
                    audioServiceConfig.androidNotificationChannelName = (String) map.get("androidNotificationChannelName");
                    audioServiceConfig.androidNotificationChannelDescription = (String) map.get("androidNotificationChannelDescription");
                    audioServiceConfig.notificationColor = map.get("notificationColor") == null ? -1 : AudioServicePlugin.getInt(map.get("notificationColor")).intValue();
                    audioServiceConfig.androidNotificationIcon = (String) map.get("androidNotificationIcon");
                    audioServiceConfig.androidShowNotificationBadge = ((Boolean) map.get("androidShowNotificationBadge")).booleanValue();
                    audioServiceConfig.androidStopForegroundOnPause = ((Boolean) map.get("androidStopForegroundOnPause")).booleanValue();
                    audioServiceConfig.artDownscaleWidth = map.get("artDownscaleWidth") != null ? ((Integer) map.get("artDownscaleWidth")).intValue() : -1;
                    audioServiceConfig.artDownscaleHeight = map.get("artDownscaleHeight") != null ? ((Integer) map.get("artDownscaleHeight")).intValue() : -1;
                    audioServiceConfig.setBrowsableRootExtras((Map) map.get("androidBrowsableRootExtras"));
                    Activity activity = this.activity;
                    if (activity != null) {
                        audioServiceConfig.activityClassName = activity.getClass().getName();
                    }
                    audioServiceConfig.save();
                    AudioService audioService = AudioService.instance;
                    if (audioService != null) {
                        audioService.configure(audioServiceConfig);
                    }
                    AudioServicePlugin.mainClientInterface = this;
                    if (AudioServicePlugin.audioHandlerInterface == null) {
                        AudioServicePlugin.audioHandlerInterface = new AudioHandlerInterface(this.messenger);
                        AudioService.init(AudioServicePlugin.audioHandlerInterface);
                    } else {
                        if (AudioServicePlugin.audioHandlerInterface.messenger != this.messenger) {
                            AudioServicePlugin.audioHandlerInterface.switchToMessenger(this.messenger);
                        }
                        AudioServicePlugin.audioHandlerInterface.invokePendingMethods();
                    }
                    if (AudioServicePlugin.mediaController != null) {
                        interfaceC0706p.success(AudioServicePlugin.mapOf(new Object[0]));
                    } else {
                        AudioServicePlugin.configureResult = interfaceC0706p;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                interfaceC0706p.error(e5.getMessage(), null, null);
            }
        }

        public void setServiceConnectionFailed(boolean z4) {
            this.serviceConnectionFailed = z4;
        }

        public void setWrongEngineDetected(boolean z4) {
            this.wrongEngineDetected = z4;
        }

        public boolean wasLaunchedFromRecents() {
            return (this.activity.getIntent().getFlags() & 1048576) == 1048576;
        }
    }

    public static class MethodInvocation {
        public final Object arg;
        public final String method;
        public final InterfaceC0706p result;

        public MethodInvocation(String str, Object obj, InterfaceC0706p interfaceC0706p) {
            this.method = str;
            this.arg = obj;
            this.result = interfaceC0706p;
        }
    }

    private static MediaDescriptionCompat addExtrasToMediaDescription(MediaDescriptionCompat mediaDescriptionCompat, Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = mediaDescriptionCompat.f3643r;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        bundle.putAll(mapToBundle(map));
        return new MediaDescriptionCompat(mediaDescriptionCompat.f3637l, mediaDescriptionCompat.f3638m, mediaDescriptionCompat.f3639n, mediaDescriptionCompat.f3640o, mediaDescriptionCompat.f3641p, mediaDescriptionCompat.f3642q, bundle, mediaDescriptionCompat.f3644s);
    }

    public static AudioHandlerInterface audioHandlerInterface() throws Exception {
        AudioHandlerInterface audioHandlerInterface2 = audioHandlerInterface;
        if (audioHandlerInterface2 != null) {
            return audioHandlerInterface2;
        }
        throw new Exception("Background audio task not running");
    }

    public static Map<String, Object> bundleToMap(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Serializable serializable = bundle.getSerializable(str);
            if (serializable != null) {
                map.put(str, serializable);
            }
        }
        return map;
    }

    private void connect() {
        if (mediaBrowser == null) {
            g gVar = new g(this.applicationContext, new ComponentName(this.applicationContext, (Class<?>) AudioService.class), this.connectionCallback);
            mediaBrowser = gVar;
            Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            gVar.f3668a.f3660b.connect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaMetadataCompat createMediaMetadata(Map<?, ?> map) {
        return AudioService.instance.createMediaMetadata((String) map.get("id"), (String) map.get("title"), (String) map.get("album"), (String) map.get("artist"), (String) map.get("genre"), getLong(map.get("duration")), (String) map.get("artUri"), (Boolean) map.get("playable"), (String) map.get("displayTitle"), (String) map.get("displaySubtitle"), (String) map.get("displayDescription"), raw2rating((Map) map.get("rating")), (Map) map.get("extras"));
    }

    private void disconnect() {
        ClientInterface clientInterface = mainClientInterface;
        Activity activity = clientInterface != null ? clientInterface.activity : null;
        if (activity != null) {
            activity.setIntent(new Intent("android.intent.action.MAIN"));
        }
        l lVar = mediaController;
        if (lVar != null) {
            android.support.v4.media.session.g gVar = controllerCallback;
            if (gVar == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (lVar.f3713c.remove(gVar)) {
                try {
                    lVar.f3711a.b(gVar);
                } finally {
                    gVar.setHandler(null);
                }
            } else {
                Log.w("MediaControllerCompat", "the callback has never been registered");
            }
            mediaController = null;
        }
        g gVar2 = mediaBrowser;
        if (gVar2 != null) {
            gVar2.a();
            mediaBrowser = null;
        }
    }

    public static synchronized void disposeFlutterEngine() {
        Iterator<ClientInterface> it = clientInterfaces.iterator();
        while (it.hasNext()) {
            if (it.next().activity != null) {
                return;
            }
        }
        C0398g c0398gA = C0398g.a();
        C0394c c0394c = (C0394c) c0398gA.f5638a.get(flutterEngineId);
        if (c0394c != null) {
            c0394c.a();
            C0398g.a().b(flutterEngineId, null);
        }
    }

    public static synchronized C0394c getFlutterEngine(Context context) {
        C0394c c0394c;
        String initialRoute;
        Uri data;
        Uri data2;
        try {
            c0394c = (C0394c) C0398g.a().f5638a.get(flutterEngineId);
            if (c0394c == null) {
                c0394c = new C0394c(context.getApplicationContext());
                if (context instanceof AbstractActivityC0488g) {
                    AbstractActivityC0488g abstractActivityC0488g = (AbstractActivityC0488g) context;
                    initialRoute = abstractActivityC0488g.getInitialRoute();
                    if (initialRoute == null && abstractActivityC0488g.shouldHandleDeeplinking() && (data2 = abstractActivityC0488g.getIntent().getData()) != null) {
                        initialRoute = data2.getPath();
                        if (data2.getQuery() != null && !data2.getQuery().isEmpty()) {
                            initialRoute = initialRoute + "?" + data2.getQuery();
                        }
                    }
                } else if (context instanceof AudioServiceFragmentActivity) {
                    AudioServiceFragmentActivity audioServiceFragmentActivity = (AudioServiceFragmentActivity) context;
                    initialRoute = audioServiceFragmentActivity.getInitialRoute();
                    if (initialRoute == null && audioServiceFragmentActivity.shouldHandleDeeplinking() && (data = audioServiceFragmentActivity.getIntent().getData()) != null) {
                        initialRoute = data.getPath();
                        if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                            initialRoute = initialRoute + "?" + data.getQuery();
                        }
                    }
                } else {
                    initialRoute = null;
                }
                if (initialRoute == null) {
                    initialRoute = "/";
                }
                c0394c.i.f8672a.a("setInitialRoute", initialRoute, null);
                c0394c.f5607c.b(C0433a.a(), null);
                C0398g.a().b(flutterEngineId, c0394c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0394c;
    }

    public static String getFlutterEngineId() {
        return flutterEngineId;
    }

    public static Integer getInt(Object obj) {
        return (obj == null || (obj instanceof Integer)) ? (Integer) obj : Integer.valueOf((int) ((Long) obj).longValue());
    }

    public static Long getLong(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$registerOnNewIntentListener$0(Intent intent) {
        this.clientInterface.activity.setIntent(intent);
        sendNotificationClicked();
        return true;
    }

    public static Map<String, Object> mapOf(Object... objArr) {
        HashMap map = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            map.put((String) objArr[i], objArr[i + 1]);
        }
        return map;
    }

    public static Bundle mapToBundle(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        Iterator<?> it = map.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            }
        }
        return bundle;
    }

    private static List<Map<?, ?>> mediaItems2raw(List<MediaBrowserCompat$MediaItem> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MediaBrowserCompat$MediaItem> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mediaMetadata2raw(AudioService.getMediaMetadata(it.next().f3636m.f3637l)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<?, ?> mediaMetadata2raw(MediaMetadataCompat mediaMetadataCompat) {
        RatingCompat ratingCompatD = null;
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat mediaDescriptionCompatD = mediaMetadataCompat.d();
        HashMap map = new HashMap();
        map.put("id", mediaDescriptionCompatD.f3637l);
        map.put("title", metadataToString(mediaMetadataCompat, "android.media.metadata.TITLE"));
        map.put("album", metadataToString(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        Uri uri = mediaDescriptionCompatD.f3642q;
        if (uri != null) {
            map.put("artUri", uri.toString());
        }
        map.put("artist", metadataToString(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        map.put("genre", metadataToString(mediaMetadataCompat, "android.media.metadata.GENRE"));
        Bundle bundle = mediaMetadataCompat.f3650l;
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            map.put("duration", Long.valueOf(bundle.getLong("android.media.metadata.DURATION", 0L)));
        }
        map.put("playable", Boolean.valueOf(bundle.getLong("playable_long", 0L) != 0));
        map.put("displayTitle", metadataToString(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        map.put("displaySubtitle", metadataToString(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        map.put("displayDescription", metadataToString(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (bundle.containsKey("android.media.metadata.RATING")) {
            try {
                ratingCompatD = RatingCompat.d(bundle.getParcelable("android.media.metadata.RATING"));
            } catch (Exception e5) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e5);
            }
            map.put("rating", rating2raw(ratingCompatD));
        }
        Map<String, Object> mapBundleToMap = bundleToMap(new Bundle(bundle));
        if (mapBundleToMap.size() > 0) {
            map.put("extras", mapBundleToMap);
        }
        return map;
    }

    private static String metadataToString(MediaMetadataCompat mediaMetadataCompat, String str) {
        CharSequence charSequence = mediaMetadataCompat.f3650l.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private static List<Map<?, ?>> queue2raw(List<MediaSessionCompat$QueueItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MediaSessionCompat$QueueItem> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mediaMetadata2raw(AudioService.getMediaMetadata(it.next().f3670l.f3637l)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static HashMap<String, Object> rating2raw(RatingCompat ratingCompat) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("type", Integer.valueOf(ratingCompat.f3653l));
        if (ratingCompat.e()) {
            boolean z4 = false;
            float f2 = -1.0f;
            float f5 = ratingCompat.f3654m;
            int i = ratingCompat.f3653l;
            switch (i) {
                case 0:
                    map.put("value", null);
                    break;
                case 1:
                    if (i == 1) {
                        z4 = f5 == 1.0f;
                    }
                    map.put("value", Boolean.valueOf(z4));
                    break;
                case 2:
                    if (i == 2) {
                        z4 = f5 == 1.0f;
                    }
                    map.put("value", Boolean.valueOf(z4));
                    break;
                case 3:
                case 4:
                case 5:
                    if ((i == 3 || i == 4 || i == 5) && ratingCompat.e()) {
                        f2 = f5;
                    }
                    map.put("value", Float.valueOf(f2));
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (i == 6 && ratingCompat.e()) {
                        f2 = f5;
                    }
                    map.put("value", Float.valueOf(f2));
                    break;
            }
        } else {
            map.put("value", null);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<MediaSessionCompat$QueueItem> raw2queue(List<Map<?, ?>> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Map<?, ?> map : list) {
            arrayList.add(new MediaSessionCompat$QueueItem(null, addExtrasToMediaDescription(createMediaMetadata(map).d(), (Map) map.get("extras")), i));
            i++;
        }
        return arrayList;
    }

    private static RatingCompat raw2rating(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Integer num = (Integer) map.get("type");
        Object obj = map.get("value");
        if (obj == null) {
            int iIntValue = num.intValue();
            switch (iIntValue) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    return new RatingCompat(-1.0f, iIntValue);
                default:
                    return null;
            }
        }
        switch (num.intValue()) {
            case 1:
                return new RatingCompat(((Boolean) obj).booleanValue() ? 1.0f : 0.0f, 1);
            case 2:
                return new RatingCompat(((Boolean) obj).booleanValue() ? 1.0f : 0.0f, 2);
            case 3:
            case 4:
            case 5:
                return RatingCompat.g(((Integer) obj).intValue(), num.intValue());
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return RatingCompat.f(((Double) obj).floatValue());
            default:
                int iIntValue2 = num.intValue();
                switch (iIntValue2) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                        return new RatingCompat(-1.0f, iIntValue2);
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaBrowserCompat$MediaItem rawToMediaItem(Map<?, ?> map) {
        return new MediaBrowserCompat$MediaItem(addExtrasToMediaDescription(createMediaMetadata(map).d(), (Map) map.get("extras")), ((Boolean) map.get("playable")).booleanValue() ? 2 : 1);
    }

    private void registerOnNewIntentListener() {
        InterfaceC0542b interfaceC0542b = this.activityPluginBinding;
        t tVar = new t() { // from class: com.ryanheise.audioservice.a
            @Override // n3.t
            public final boolean onNewIntent(Intent intent) {
                return this.f5253l.lambda$registerOnNewIntentListener$0(intent);
            }
        };
        this.newIntentListener = tVar;
        ((HashSet) ((n) interfaceC0542b).f10957d).add(tVar);
    }

    private void sendNotificationClicked() {
        Activity activity = this.clientInterface.activity;
        if (audioHandlerInterface == null || activity.getIntent().getAction() == null) {
            return;
        }
        audioHandlerInterface.invokeMethod("onNotificationClicked", mapOf("clicked", Boolean.valueOf(activity.getIntent().getAction().equals(AudioService.NOTIFICATION_CLICK_ACTION))));
    }

    public static void setFlutterEngineId(String str) {
        flutterEngineId = str;
    }

    @Override // k3.InterfaceC0541a
    public void onAttachedToActivity(InterfaceC0542b interfaceC0542b) {
        this.activityPluginBinding = interfaceC0542b;
        this.clientInterface.setActivity((Activity) ((n) interfaceC0542b).f10954a);
        ClientInterface clientInterface = this.clientInterface;
        Activity activity = (Activity) ((n) interfaceC0542b).f10954a;
        clientInterface.setContext(activity);
        this.clientInterface.setWrongEngineDetected(this.flutterPluginBinding.f7455c != getFlutterEngine(activity).f5607c);
        mainClientInterface = this.clientInterface;
        registerOnNewIntentListener();
        if (mediaController != null) {
            l.b(mainClientInterface.activity, mediaController);
        }
        if (mediaBrowser == null) {
            connect();
        }
        Activity activity2 = mainClientInterface.activity;
        if (this.clientInterface.wasLaunchedFromRecents()) {
            activity2.setIntent(new Intent("android.intent.action.MAIN"));
        }
        sendNotificationClicked();
    }

    @Override // j3.b
    public void onAttachedToEngine(C0524a c0524a) {
        this.flutterPluginBinding = c0524a;
        ClientInterface clientInterface = new ClientInterface(c0524a.f7455c);
        this.clientInterface = clientInterface;
        clientInterface.setContext(this.flutterPluginBinding.f7453a);
        clientInterfaces.add(this.clientInterface);
        if (this.applicationContext == null) {
            this.applicationContext = this.flutterPluginBinding.f7453a;
        }
        if (audioHandlerInterface == null) {
            AudioHandlerInterface audioHandlerInterface2 = new AudioHandlerInterface(this.flutterPluginBinding.f7455c);
            audioHandlerInterface = audioHandlerInterface2;
            AudioService.init(audioHandlerInterface2);
        }
        if (mediaBrowser == null) {
            connect();
        }
    }

    @Override // k3.InterfaceC0541a
    public void onDetachedFromActivity() {
        InterfaceC0542b interfaceC0542b = this.activityPluginBinding;
        ((HashSet) ((n) interfaceC0542b).f10957d).remove(this.newIntentListener);
        this.activityPluginBinding = null;
        this.newIntentListener = null;
        this.clientInterface.setActivity(null);
        this.clientInterface.setContext(this.flutterPluginBinding.f7453a);
        if (clientInterfaces.size() == 1) {
            disconnect();
        }
        if (this.clientInterface == mainClientInterface) {
            mainClientInterface = null;
        }
    }

    @Override // k3.InterfaceC0541a
    public void onDetachedFromActivityForConfigChanges() {
        InterfaceC0542b interfaceC0542b = this.activityPluginBinding;
        ((HashSet) ((n) interfaceC0542b).f10957d).remove(this.newIntentListener);
        this.activityPluginBinding = null;
        this.clientInterface.setActivity(null);
        this.clientInterface.setContext(this.flutterPluginBinding.f7453a);
    }

    @Override // j3.b
    public void onDetachedFromEngine(C0524a c0524a) {
        Set<ClientInterface> set = clientInterfaces;
        if (set.size() == 1) {
            disconnect();
        }
        set.remove(this.clientInterface);
        this.clientInterface.setContext(null);
        this.clientInterface = null;
        this.applicationContext = null;
        AudioHandlerInterface audioHandlerInterface2 = audioHandlerInterface;
        if (audioHandlerInterface2 != null && audioHandlerInterface2.messenger == this.flutterPluginBinding.f7455c) {
            System.out.println("### destroying audio handler interface");
            audioHandlerInterface.destroy();
            audioHandlerInterface = null;
        }
        this.flutterPluginBinding = null;
    }

    @Override // k3.InterfaceC0541a
    public void onReattachedToActivityForConfigChanges(InterfaceC0542b interfaceC0542b) {
        this.activityPluginBinding = interfaceC0542b;
        this.clientInterface.setActivity((Activity) ((n) interfaceC0542b).f10954a);
        this.clientInterface.setContext((Activity) ((n) interfaceC0542b).f10954a);
        registerOnNewIntentListener();
    }
}
