package com.ryanheise.just_audio;

import A0.b;
import A0.m;
import A0.z;
import B0.f;
import B0.l;
import D0.A;
import D0.d;
import F0.C0067n;
import F0.u;
import S0.c;
import a0.AbstractC0158I;
import a0.C0150A;
import a0.C0153D;
import a0.C0155F;
import a0.C0159J;
import a0.C0160K;
import a0.C0161L;
import a0.C0163N;
import a0.C0170V;
import a0.C0171W;
import a0.C0172X;
import a0.C0174Z;
import a0.C0177c;
import a0.C0183i;
import a0.C0187m;
import a0.C0192r;
import a0.C0194t;
import a0.C0195u;
import a0.C0196v;
import a0.C0197w;
import a0.C0198x;
import a0.C0200z;
import a0.InterfaceC0154E;
import a0.InterfaceC0162M;
import a0.InterfaceC0164O;
import a0.e0;
import a1.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0359l;
import d0.C0366s;
import d0.C0367t;
import f.C0402a;
import f0.InterfaceC0412g;
import h0.C0448G;
import h0.C0453d;
import h0.C0460k;
import h0.C0462m;
import h0.C0463n;
import h0.C0464o;
import h0.C0465p;
import h0.C0466q;
import h0.C0470v;
import h0.InterfaceC0467s;
import h0.O;
import h0.Q;
import h0.SurfaceHolderCallbackC0445D;
import h0.h0;
import h0.o0;
import h0.p0;
import h0.s0;
import j0.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import k0.g;
import l0.C0566e;
import m.B0;
import m0.i;
import m2.C0640G;
import m2.I;
import m2.b0;
import m3.C0675i;
import n0.C0687c;
import n3.C0707q;
import n3.InterfaceC0696f;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;
import o0.p;
import r0.InterfaceC0749b;
import x0.C0966g;
import x0.C0977s;
import x0.G;
import x0.J;
import x0.a0;
import x0.i0;
import x0.j0;
import x0.m0;
import y0.C0996d;
import z0.InterfaceC1062d;

/* JADX INFO: loaded from: classes.dex */
public class AudioPlayer implements InterfaceC0705o, InterfaceC0162M, InterfaceC0749b {
    public static final int ERROR_ABORT = 10000000;
    static final String TAG = "AudioPlayer";
    private static Random random = new Random();
    private C0172X audioOffloadPreferences;
    private Integer audioSessionId;
    private long bufferedPosition;
    private final Context context;
    private Integer currentIndex;
    private final BetterEventChannel dataEventChannel;
    private Integer errorCode;
    private String errorMessage;
    private final BetterEventChannel eventChannel;
    private S0.b icyHeaders;
    private c icyInfo;
    private O livePlaybackSpeedControl;
    private Q loadControl;
    private final C0707q methodChannel;
    private boolean offloadSchedulingEnabled;
    private C0177c pendingAudioAttributes;
    private Map<String, Object> pendingPlaybackEvent;
    private InterfaceC0706p playResult;
    private InterfaceC0467s player;
    private InterfaceC0706p prepareResult;
    private ProcessingState processingState;
    private List<Object> rawAudioEffects;
    private Long seekPos;
    private InterfaceC0706p seekResult;
    private long updatePosition;
    private long updateTime;
    private boolean useLazyPreparation;
    private Map<String, J> mediaSources = new HashMap();
    private List<AudioEffect> audioEffects = new ArrayList();
    private Map<String, AudioEffect> audioEffectsMap = new HashMap();
    private int lastPlaylistLength = 0;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable bufferWatcher = new Runnable() { // from class: com.ryanheise.just_audio.AudioPlayer.1
        @Override // java.lang.Runnable
        public void run() {
            if (AudioPlayer.this.player == null) {
                return;
            }
            if (((C0448G) AudioPlayer.this.player).s() != AudioPlayer.this.bufferedPosition) {
                AudioPlayer.this.broadcastImmediatePlaybackEvent();
            }
            int iE = ((C0448G) AudioPlayer.this.player).E();
            if (iE == 2) {
                AudioPlayer.this.handler.postDelayed(this, 200L);
            } else {
                if (iE != 3) {
                    return;
                }
                if (((C0448G) AudioPlayer.this.player).D()) {
                    AudioPlayer.this.handler.postDelayed(this, 500L);
                } else {
                    AudioPlayer.this.handler.postDelayed(this, 1000L);
                }
            }
        }
    };

    public class ObserverRenderer extends h0 {
        private long lastPosUs = 0;
        private int consecutivePosCount = 0;

        public ObserverRenderer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$render$0() {
            if (AudioPlayer.this.updatePositionIfChanged()) {
                AudioPlayer.this.broadcastImmediatePlaybackEvent();
            }
        }

        @Override // h0.q0
        public /* bridge */ /* synthetic */ void clearListener() {
        }

        @Override // h0.o0
        public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
        }

        public /* bridge */ /* synthetic */ long getDurationToProgressUs(long j5, long j6) {
            return 10000L;
        }

        @Override // h0.o0, h0.q0
        public String getName() {
            return "ObserverRenderer";
        }

        @Override // h0.o0
        public /* bridge */ /* synthetic */ void release() {
        }

        @Override // h0.o0
        public void render(long j5, long j6) {
            if (j5 == this.lastPosUs) {
                this.consecutivePosCount++;
            } else {
                if (this.consecutivePosCount >= 3) {
                    AudioPlayer.this.handler.post(new A3.c(this, 10));
                }
                this.consecutivePosCount = 0;
            }
            this.lastPosUs = j5;
        }

        @Override // h0.q0
        public /* bridge */ /* synthetic */ void setListener(p0 p0Var) {
        }

        @Override // h0.o0
        public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f2, float f5) {
        }
    }

    public enum ProcessingState {
        idle,
        loading,
        buffering,
        ready,
        completed
    }

    public AudioPlayer(Context context, InterfaceC0696f interfaceC0696f, String str, Map<?, ?> map, List<Object> list, Map<?, ?> map2, Boolean bool, boolean z4) {
        this.context = context;
        this.rawAudioEffects = list;
        this.offloadSchedulingEnabled = bool != null ? bool.booleanValue() : false;
        this.useLazyPreparation = z4;
        if (map2 != null) {
            C0171W c0171w = new C0171W();
            c0171w.f3267b = ((Boolean) map2.get("isGaplessSupportRequired")).booleanValue();
            c0171w.f3268c = ((Boolean) map2.get("isSpeedChangeSupportRequired")).booleanValue();
            c0171w.f3266a = ((Integer) map2.get("audioOffloadMode")).intValue();
            this.audioOffloadPreferences = new C0172X(c0171w);
        } else {
            boolean zBooleanValue = bool.booleanValue();
            C0171W c0171w2 = new C0171W();
            c0171w2.f3267b = !bool.booleanValue();
            c0171w2.f3268c = !bool.booleanValue();
            c0171w2.f3266a = zBooleanValue ? 1 : 0;
            this.audioOffloadPreferences = new C0172X(c0171w2);
        }
        C0707q c0707q = new C0707q(interfaceC0696f, AbstractC0307a.j("com.ryanheise.just_audio.methods.", str));
        this.methodChannel = c0707q;
        c0707q.b(this);
        this.eventChannel = new BetterEventChannel(interfaceC0696f, AbstractC0307a.j("com.ryanheise.just_audio.events.", str));
        this.dataEventChannel = new BetterEventChannel(interfaceC0696f, AbstractC0307a.j("com.ryanheise.just_audio.data.", str));
        this.processingState = ProcessingState.idle;
        if (map != null) {
            Map map3 = (Map) map.get("androidLoadControl");
            if (map3 != null) {
                int iLongValue = (int) (getLong(map3.get("minBufferDuration")).longValue() / 1000);
                int iLongValue2 = (int) (getLong(map3.get("maxBufferDuration")).longValue() / 1000);
                int iLongValue3 = (int) (getLong(map3.get("bufferForPlaybackDuration")).longValue() / 1000);
                int iLongValue4 = (int) (getLong(map3.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000);
                C0462m.a(iLongValue3, 0, "bufferForPlaybackMs", "0");
                C0462m.a(iLongValue4, 0, "bufferForPlaybackAfterRebufferMs", "0");
                C0462m.a(iLongValue, iLongValue3, "minBufferMs", "bufferForPlaybackMs");
                C0462m.a(iLongValue, iLongValue4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                C0462m.a(iLongValue2, iLongValue, "maxBufferMs", "minBufferMs");
                boolean zBooleanValue2 = ((Boolean) map3.get("prioritizeTimeOverSizeThresholds")).booleanValue();
                int iLongValue5 = (int) (getLong(map3.get("backBufferDuration")).longValue() / 1000);
                C0462m.a(iLongValue5, 0, "backBufferDurationMs", "0");
                this.loadControl = new C0462m(new f(), iLongValue, iLongValue2, iLongValue3, iLongValue4, map3.get("targetBufferBytes") != null ? ((Integer) map3.get("targetBufferBytes")).intValue() : -1, zBooleanValue2, iLongValue5);
            }
            Map map4 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map4 != null) {
                int i = AbstractC0370w.f5326a;
                float fDoubleValue = (float) ((Double) map4.get("fallbackMinPlaybackSpeed")).doubleValue();
                AbstractC0360m.c(0.0f < fDoubleValue && fDoubleValue <= 1.0f);
                float fDoubleValue2 = (float) ((Double) map4.get("fallbackMaxPlaybackSpeed")).doubleValue();
                AbstractC0360m.c(fDoubleValue2 >= 1.0f);
                long jLongValue = getLong(map4.get("minUpdateInterval")).longValue() / 1000;
                AbstractC0360m.c(jLongValue > 0);
                float fDoubleValue3 = (float) ((Double) map4.get("proportionalControlFactor")).doubleValue();
                AbstractC0360m.c(fDoubleValue3 > 0.0f);
                float f2 = fDoubleValue3 / 1000000.0f;
                long jLongValue2 = getLong(map4.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000;
                AbstractC0360m.c(jLongValue2 > 0);
                long jM = AbstractC0370w.M(jLongValue2);
                long jLongValue3 = getLong(map4.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000;
                AbstractC0360m.c(jLongValue3 >= 0);
                long jM2 = AbstractC0370w.M(jLongValue3);
                float fDoubleValue4 = (float) ((Double) map4.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue();
                AbstractC0360m.c(fDoubleValue4 >= 0.0f && fDoubleValue4 < 1.0f);
                this.livePlaybackSpeedControl = new C0460k(fDoubleValue, fDoubleValue2, jLongValue, f2, jM, jM2, fDoubleValue4);
            }
        }
    }

    private void abortExistingConnection(boolean z4) {
        sendError(ERROR_ABORT, "Connection aborted", null, z4);
    }

    private void abortSeek() {
        InterfaceC0706p interfaceC0706p = this.seekResult;
        if (interfaceC0706p != null) {
            try {
                interfaceC0706p.success(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.seekResult = null;
            this.seekPos = null;
        }
    }

    private void audioEffectSetEnabled(String str, boolean z4) {
        this.audioEffectsMap.get(str).setEnabled(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void broadcastImmediatePlaybackEvent() {
        enqueuePlaybackEvent();
        broadcastPendingPlaybackEvent();
    }

    private void broadcastPendingPlaybackEvent() {
        Map<String, Object> map = this.pendingPlaybackEvent;
        if (map != null) {
            this.eventChannel.success(map);
            this.pendingPlaybackEvent = null;
        }
    }

    private InterfaceC0412g buildDataSourceFactory(Map<?, ?> map) {
        String strI;
        String str;
        Map<String, String> mapCastToStringMap = castToStringMap(map);
        if (mapCastToStringMap != null) {
            strI = mapCastToStringMap.remove("User-Agent");
            if (strI == null) {
                strI = mapCastToStringMap.remove("user-agent");
            }
        } else {
            strI = null;
        }
        if (strI == null) {
            Context context = this.context;
            int i = AbstractC0370w.f5326a;
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "?";
            }
            strI = B0.i(AbstractC0307a.m("just_audio/", str, " (Linux;Android "), Build.VERSION.RELEASE, ") AndroidXMedia3/1.5.1");
        }
        e eVar = new e(1);
        eVar.f3492p = strI;
        eVar.f3490n = true;
        if (mapCastToStringMap != null && mapCastToStringMap.size() > 0) {
            eVar.d(mapCastToStringMap);
        }
        return new Z1.e(this.context, eVar);
    }

    private C0067n buildExtractorsFactory(Map<?, ?> map) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        int iIntValue;
        Map map2;
        C0067n c0067n = new C0067n();
        if (map == null || (map2 = (Map) map.get("androidExtractorOptions")) == null) {
            zBooleanValue = true;
            zBooleanValue2 = false;
            iIntValue = 0;
        } else {
            zBooleanValue = ((Boolean) map2.get("constantBitrateSeekingEnabled")).booleanValue();
            zBooleanValue2 = ((Boolean) map2.get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
            iIntValue = ((Integer) map2.get("mp3Flags")).intValue();
        }
        synchronized (c0067n) {
            c0067n.f806l = zBooleanValue;
        }
        synchronized (c0067n) {
            c0067n.f807m = zBooleanValue2;
        }
        synchronized (c0067n) {
            c0067n.f808n = iIntValue;
        }
        return c0067n;
    }

    public static Map<String, String> castToStringMap(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            map2.put((String) obj, (String) map.get(obj));
        }
        return map2;
    }

    private void clearAudioEffects() {
        Iterator<AudioEffect> it = this.audioEffects.iterator();
        while (it.hasNext()) {
            it.next().release();
            it.remove();
        }
        this.audioEffectsMap.clear();
    }

    private Map<String, Object> collectIcyMetadata() {
        HashMap map = new HashMap();
        if (this.icyInfo != null) {
            HashMap map2 = new HashMap();
            map2.put("title", this.icyInfo.f1994m);
            map2.put("url", this.icyInfo.f1995n);
            map.put("info", map2);
        }
        if (this.icyHeaders != null) {
            HashMap map3 = new HashMap();
            map3.put("bitrate", Integer.valueOf(this.icyHeaders.f1987l));
            map3.put("genre", this.icyHeaders.f1988m);
            map3.put("name", this.icyHeaders.f1989n);
            map3.put("metadataInterval", Integer.valueOf(this.icyHeaders.f1992q));
            map3.put("url", this.icyHeaders.f1990o);
            map3.put("isPublic", Boolean.valueOf(this.icyHeaders.f1991p));
            map.put("headers", map3);
        }
        return map;
    }

    private void completeSeek() {
        this.seekPos = null;
        this.seekResult.success(new HashMap());
        this.seekResult = null;
    }

    private C0977s concatenating(Object obj) {
        return (C0977s) this.mediaSources.get((String) obj);
    }

    private Map<String, Object> createPlaybackEvent() {
        HashMap map = new HashMap();
        Long lValueOf = getDuration() == -9223372036854775807L ? null : Long.valueOf(getDuration() * 1000);
        InterfaceC0467s interfaceC0467s = this.player;
        this.bufferedPosition = interfaceC0467s != null ? ((C0448G) interfaceC0467s).s() : 0L;
        map.put("processingState", Integer.valueOf(this.processingState.ordinal()));
        map.put("updatePosition", Long.valueOf(this.updatePosition * 1000));
        map.put("updateTime", Long.valueOf(this.updateTime));
        map.put("bufferedPosition", Long.valueOf(Math.max(this.updatePosition, this.bufferedPosition) * 1000));
        map.put("icyMetadata", collectIcyMetadata());
        map.put("duration", lValueOf);
        map.put("currentIndex", this.currentIndex);
        map.put("androidAudioSessionId", this.audioSessionId);
        map.put("errorCode", this.errorCode);
        map.put("errorMessage", this.errorMessage);
        return map;
    }

    private AudioEffect decodeAudioEffect(Object obj, int i) {
        Map map = (Map) obj;
        String str = (String) map.get("type");
        str.getClass();
        if (str.equals("AndroidEqualizer")) {
            return new Equalizer(0, i);
        }
        if (!str.equals("AndroidLoudnessEnhancer")) {
            throw new IllegalArgumentException("Unknown AudioEffect type: " + map.get("type"));
        }
        int iRound = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 100.0d);
        LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(i);
        loudnessEnhancer.setTargetGain(iRound);
        return loudnessEnhancer;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.media3.exoplayer.dash.DashMediaSource$Factory] */
    private J decodeAudioSource(Object obj) {
        Map map;
        String str;
        char c5;
        c5 = 1;
        map = (Map) obj;
        str = (String) map.get("id");
        String str2 = (String) map.get("type");
        str2.getClass();
        switch (str2) {
            case "concatenating":
                return new C0977s(((Boolean) map.get("useLazyPreparation")).booleanValue(), decodeShuffleOrder((List) mapGet(map, "shuffleOrder")), getAudioSourcesArray(map.get("children")));
            case "hls":
                final InterfaceC0412g interfaceC0412gBuildDataSourceFactory = buildDataSourceFactory((Map) mapGet(map, "headers"));
                ?? r12 = new G(interfaceC0412gBuildDataSourceFactory) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C0675i f4652a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public C0687c f4653b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public C0200z f4654c;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final C0402a f4659h = new C0402a();

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final C0200z f4656e = new C0200z(26);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final l f4657f = o0.c.f8978z;
                    public final b i = new b(1);

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final p1.b f4658g = new p1.b(17);

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final int f4661k = 1;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final long f4662l = -9223372036854775807L;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final boolean f4660j = true;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public boolean f4655d = true;

                    {
                        this.f4652a = new C0675i(interfaceC0412gBuildDataSourceFactory, 9);
                    }

                    @Override // x0.G
                    public final void b(boolean z4) {
                        this.f4655d = z4;
                    }

                    @Override // x0.G
                    public final void c(C0200z c0200z) {
                        this.f4654c = c0200z;
                    }

                    @Override // x0.G
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final n0.l a(C0150A c0150a) {
                        c0150a.f3154b.getClass();
                        if (this.f4653b == null) {
                            C0687c c0687c = new C0687c();
                            c0687c.f8759a = new C0200z(7);
                            this.f4653b = c0687c;
                        }
                        C0200z c0200z = this.f4654c;
                        if (c0200z != null) {
                            this.f4653b.f8759a = c0200z;
                        }
                        C0687c c0687c2 = this.f4653b;
                        c0687c2.f8760b = this.f4655d;
                        p lVar = this.f4656e;
                        List list = c0150a.f3154b.f3462c;
                        if (!list.isEmpty()) {
                            lVar = new Z1.l(lVar, list);
                        }
                        i iVarB = this.f4659h.b(c0150a);
                        b bVar = this.i;
                        this.f4657f.getClass();
                        C0675i c0675i = this.f4652a;
                        return new n0.l(c0150a, c0675i, c0687c2, this.f4658g, iVarB, bVar, new o0.c(c0675i, bVar, lVar), this.f4662l, this.f4660j, this.f4661k);
                    }
                };
                u uVar = new u();
                C0640G c0640g = I.f8549m;
                b0 b0Var = b0.f8583p;
                List listEmptyList = Collections.emptyList();
                b0 b0Var2 = b0.f8583p;
                C0195u c0195u = new C0195u();
                C0198x c0198x = C0198x.f3466a;
                Uri uri = Uri.parse((String) map.get("uri"));
                return r12.a(new C0150A("", new C0194t(uVar), uri != null ? new C0197w(uri, "application/x-mpegURL", null, listEmptyList, b0Var2, null, -9223372036854775807L) : null, new C0196v(c0195u), C0153D.f3185B, c0198x));
            case "dash":
                final InterfaceC0412g interfaceC0412gBuildDataSourceFactory2 = buildDataSourceFactory((Map) mapGet(map, "headers"));
                ?? r13 = new G(interfaceC0412gBuildDataSourceFactory2) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final d f4645a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final InterfaceC0412g f4646b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final C0402a f4647c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final p1.b f4648d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final b f4649e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final long f4650f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final long f4651g;

                    {
                        C0187m c0187m = C0996d.f10843u;
                        d dVar = new d();
                        dVar.f396n = c0187m;
                        dVar.f395m = interfaceC0412gBuildDataSourceFactory2;
                        dVar.f394l = 1;
                        this.f4645a = dVar;
                        this.f4646b = interfaceC0412gBuildDataSourceFactory2;
                        this.f4647c = new C0402a();
                        this.f4649e = new b(1);
                        this.f4650f = 30000L;
                        this.f4651g = 5000000L;
                        this.f4648d = new p1.b(17);
                        ((C0187m) dVar.f396n).f3362a = true;
                    }

                    @Override // x0.G
                    public final void b(boolean z4) {
                        ((C0187m) this.f4645a.f396n).f3362a = z4;
                    }

                    @Override // x0.G
                    public final void c(C0200z c0200z) {
                        C0187m c0187m = (C0187m) this.f4645a.f396n;
                        c0187m.getClass();
                        c0187m.f3363b = c0200z;
                    }

                    @Override // x0.G
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final g a(C0150A c0150a) {
                        c0150a.f3154b.getClass();
                        C0566e c0566e = new C0566e();
                        List list = c0150a.f3154b.f3462c;
                        return new g(c0150a, this.f4646b, !list.isEmpty() ? new Z1.e(c0566e, 20, list) : c0566e, this.f4645a, this.f4648d, this.f4647c.b(c0150a), this.f4649e, this.f4650f, this.f4651g);
                    }
                };
                u uVar2 = new u();
                C0640G c0640g2 = I.f8549m;
                b0 b0Var3 = b0.f8583p;
                List listEmptyList2 = Collections.emptyList();
                b0 b0Var4 = b0.f8583p;
                C0195u c0195u2 = new C0195u();
                C0198x c0198x2 = C0198x.f3466a;
                Uri uri2 = Uri.parse((String) map.get("uri"));
                return r13.a(new C0150A("", new C0194t(uVar2), uri2 != null ? new C0197w(uri2, "application/dash+xml", null, listEmptyList2, b0Var4, str, -9223372036854775807L) : null, new C0196v(c0195u2), C0153D.f3185B, c0198x2));
            case "looping":
                Integer num = (Integer) map.get("count");
                J audioSource = getAudioSource(map.get("child"));
                int iIntValue = num.intValue();
                J[] jArr = new J[iIntValue];
                for (int i = 0; i < iIntValue; i++) {
                    jArr[i] = audioSource;
                }
                return new C0977s(false, new i0(), jArr);
            case "clipping":
                Long l3 = getLong(map.get("start"));
                Long l4 = getLong(map.get("end"));
                return new C0966g(getAudioSource(map.get("child")), l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : Long.MIN_VALUE, true);
            case "progressive":
                InterfaceC0412g interfaceC0412gBuildDataSourceFactory3 = buildDataSourceFactory((Map) mapGet(map, "headers"));
                I2.g gVar = new I2.g(buildExtractorsFactory((Map) mapGet(map, "options")), 26);
                A0.b bVar = new A0.b(c5 == true ? 1 : 0);
                u uVar3 = new u();
                C0640G c0640g3 = I.f8549m;
                b0 b0Var5 = b0.f8583p;
                List listEmptyList3 = Collections.emptyList();
                b0 b0Var6 = b0.f8583p;
                C0195u c0195u3 = new C0195u();
                C0198x c0198x3 = C0198x.f3466a;
                Uri uri3 = Uri.parse((String) map.get("uri"));
                C0197w c0197w = uri3 != null ? new C0197w(uri3, null, null, listEmptyList3, b0Var6, str, -9223372036854775807L) : null;
                C0150A c0150a = new C0150A("", new C0194t(uVar3), c0197w, new C0196v(c0195u3), C0153D.f3185B, c0198x3);
                C0197w c0197w2 = c0150a.f3154b;
                c0197w.getClass();
                c0197w2.getClass();
                c0197w2.getClass();
                return new a0(c0150a, interfaceC0412gBuildDataSourceFactory3, gVar, i.f8500a, bVar, 1048576, false);
            case "silence":
                long jLongValue = getLong(map.get("duration")).longValue();
                AbstractC0360m.h(jLongValue > 0);
                C0192r c0192rA = m0.f10740v.a();
                c0192rA.f3445h = str;
                return new m0(jLongValue, c0192rA.a());
            default:
                throw new IllegalArgumentException("Unknown AudioSource type: " + map.get("type"));
        }
    }

    private j0 decodeShuffleOrder(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return new i0(Arrays.copyOf(iArr, size), new Random(random.nextLong()));
    }

    private void enqueuePlaybackEvent() {
        this.pendingPlaybackEvent = createPlaybackEvent();
    }

    private void ensurePlayerInitialized() {
        if (this.player == null) {
            s0 s0Var = new s0() { // from class: com.ryanheise.just_audio.b
                @Override // h0.s0
                public final o0[] a(Handler handler, A a5, h hVar, InterfaceC1062d interfaceC1062d, InterfaceC0749b interfaceC0749b) {
                    return this.f5265a.lambda$ensurePlayerInitialized$3(handler, (SurfaceHolderCallbackC0445D) a5, (SurfaceHolderCallbackC0445D) hVar, (SurfaceHolderCallbackC0445D) interfaceC1062d, (SurfaceHolderCallbackC0445D) interfaceC0749b);
                }
            };
            Context context = this.context;
            int i = 1;
            C0466q c0466q = new C0466q(context, new C0465p(s0Var, i), new C0453d(context, i));
            boolean z4 = this.useLazyPreparation;
            AbstractC0360m.h(!c0466q.f6271s);
            c0466q.f6265m = z4;
            Q q4 = this.loadControl;
            if (q4 != null) {
                AbstractC0360m.h(!c0466q.f6271s);
                c0466q.f6259f = new C0465p(q4, 0);
            }
            O o4 = this.livePlaybackSpeedControl;
            if (o4 != null) {
                AbstractC0360m.h(!c0466q.f6271s);
                c0466q.f6267o = o4;
            }
            C0448G c0448gA = c0466q.a();
            this.player = c0448gA;
            c0448gA.d0();
            z zVar = c0448gA.f5951h;
            m mVarD = ((A0.u) zVar).d();
            mVarD.getClass();
            A0.l lVar = new A0.l(mVarD);
            lVar.f3284m = this.audioOffloadPreferences;
            m mVar = new m(lVar);
            c0448gA.d0();
            zVar.getClass();
            A0.u uVar = (A0.u) zVar;
            if (!mVar.equals(uVar.d())) {
                uVar.i(mVar);
                A0.l lVar2 = new A0.l(uVar.d());
                lVar2.a(mVar);
                uVar.i(new m(lVar2));
                c0448gA.f5954l.e(19, new A0.e(mVar));
            }
            C0448G c0448g = (C0448G) this.player;
            c0448g.d0();
            setAudioSessionId(c0448g.f5932T);
            C0448G c0448g2 = (C0448G) this.player;
            c0448g2.getClass();
            c0448g2.f5954l.a(this);
        }
    }

    private Map<String, Object> equalizerAudioEffectGetParameters() {
        Equalizer equalizer = (Equalizer) this.audioEffectsMap.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s4 = 0; s4 < equalizer.getNumberOfBands(); s4 = (short) (s4 + 1)) {
            arrayList.add(mapOf("index", Short.valueOf(s4), "lowerFrequency", Double.valueOf(((double) equalizer.getBandFreqRange(s4)[0]) / 1000.0d), "upperFrequency", Double.valueOf(((double) equalizer.getBandFreqRange(s4)[1]) / 1000.0d), "centerFrequency", Double.valueOf(((double) equalizer.getCenterFreq(s4)) / 1000.0d), "gain", Double.valueOf(((double) equalizer.getBandLevel(s4)) / 100.0d)));
        }
        return mapOf("parameters", mapOf("minDecibels", Double.valueOf(((double) equalizer.getBandLevelRange()[0]) / 100.0d), "maxDecibels", Double.valueOf(((double) equalizer.getBandLevelRange()[1]) / 100.0d), "bands", arrayList));
    }

    private void equalizerBandSetGain(int i, double d5) {
        ((Equalizer) this.audioEffectsMap.get("AndroidEqualizer")).setBandLevel((short) i, (short) Math.round(d5 * 100.0d));
    }

    private J getAudioSource(Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("id");
        J j5 = this.mediaSources.get(str);
        if (j5 != null) {
            return j5;
        }
        J jDecodeAudioSource = decodeAudioSource(map);
        this.mediaSources.put(str, jDecodeAudioSource);
        return jDecodeAudioSource;
    }

    private List<J> getAudioSources(Object obj) {
        if (!(obj instanceof List)) {
            throw new RuntimeException("List expected: " + obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(getAudioSource(list.get(i)));
        }
        return arrayList;
    }

    private J[] getAudioSourcesArray(Object obj) {
        List<J> audioSources = getAudioSources(obj);
        J[] jArr = new J[audioSources.size()];
        audioSources.toArray(jArr);
        return jArr;
    }

    private long getCurrentPosition() {
        ProcessingState processingState = this.processingState;
        if (processingState != ProcessingState.idle && processingState != ProcessingState.loading) {
            Long l3 = this.seekPos;
            return (l3 == null || l3.longValue() == -9223372036854775807L) ? ((C0448G) this.player).x() : this.seekPos.longValue();
        }
        long jX = ((C0448G) this.player).x();
        if (jX < 0) {
            return 0L;
        }
        return jX;
    }

    private long getDuration() {
        InterfaceC0467s interfaceC0467s;
        ProcessingState processingState = this.processingState;
        if (processingState == ProcessingState.idle || processingState == ProcessingState.loading || (interfaceC0467s = this.player) == null) {
            return -9223372036854775807L;
        }
        return ((C0448G) interfaceC0467s).B();
    }

    public static Long getLong(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    private String getLowerCaseExtension(Uri uri) {
        String fragment = uri.getFragment();
        if (fragment == null || !fragment.contains(".")) {
            fragment = uri.getPath();
        }
        return fragment.replaceAll("^.*\\.", "").toLowerCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o0[] lambda$ensurePlayerInitialized$3(Handler handler, A a5, h hVar, InterfaceC1062d interfaceC1062d, InterfaceC0749b interfaceC0749b) {
        o0[] o0VarArrA = new C0463n(this.context).a(handler, a5, hVar, interfaceC1062d, interfaceC0749b);
        o0[] o0VarArr = (o0[]) Arrays.copyOf(o0VarArrA, o0VarArrA.length + 1);
        o0VarArr[o0VarArrA.length] = new ObserverRenderer();
        return o0VarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$0(InterfaceC0706p interfaceC0706p) {
        interfaceC0706p.success(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$1(InterfaceC0706p interfaceC0706p) {
        interfaceC0706p.success(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$2(InterfaceC0706p interfaceC0706p) {
        interfaceC0706p.success(new HashMap());
    }

    private void load(List<J> list, j0 j0Var, long j5, Integer num, InterfaceC0706p interfaceC0706p) {
        this.currentIndex = Integer.valueOf(num != null ? num.intValue() : 0);
        int iOrdinal = this.processingState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                C0448G c0448g = (C0448G) this.player;
                c0448g.d0();
                c0448g.y.d(1, c0448g.D());
                c0448g.Y(null);
                b0 b0Var = b0.f8583p;
                long j6 = c0448g.f5945d0.f6191s;
                new c0.c(b0Var);
            } else {
                abortExistingConnection(false);
                C0448G c0448g2 = (C0448G) this.player;
                c0448g2.d0();
                c0448g2.y.d(1, c0448g2.D());
                c0448g2.Y(null);
                b0 b0Var2 = b0.f8583p;
                long j7 = c0448g2.f5945d0.f6191s;
                new c0.c(b0Var2);
            }
        }
        this.prepareResult = interfaceC0706p;
        updatePosition();
        this.processingState = ProcessingState.loading;
        this.errorCode = null;
        this.errorMessage = null;
        enqueuePlaybackEvent();
        int iIntValue = num != null ? num.intValue() : 0;
        C0448G c0448g3 = (C0448G) this.player;
        c0448g3.d0();
        c0448g3.Q(list, iIntValue, j5, false);
        ((C0448G) this.player).U(j0Var);
        ((C0448G) this.player).K();
    }

    private void loudnessEnhancerSetTargetGain(double d5) {
        ((LoudnessEnhancer) this.audioEffectsMap.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d5 * 100.0d));
    }

    public static <T> T mapGet(Object obj, String str) {
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        return null;
    }

    public static Map<String, Object> mapOf(Object... objArr) {
        HashMap map = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            map.put((String) objArr[i], objArr[i + 1]);
        }
        return map;
    }

    private void sendError(int i, String str, Object obj) {
        sendError(i, str, obj, true);
    }

    private void setAudioAttributes(int i, int i5, int i6) {
        C0177c c0177c = new C0177c(i, i5, i6);
        if (this.processingState == ProcessingState.loading) {
            this.pendingAudioAttributes = c0177c;
        } else {
            ((C0448G) this.player).P(c0177c, false);
        }
    }

    private void setAudioSessionId(int i) {
        if (i == 0) {
            this.audioSessionId = null;
        } else {
            this.audioSessionId = Integer.valueOf(i);
        }
        clearAudioEffects();
        if (this.audioSessionId != null) {
            for (Object obj : this.rawAudioEffects) {
                Map map = (Map) obj;
                AudioEffect audioEffectDecodeAudioEffect = decodeAudioEffect(obj, this.audioSessionId.intValue());
                if (((Boolean) map.get("enabled")).booleanValue()) {
                    audioEffectDecodeAudioEffect.setEnabled(true);
                }
                this.audioEffects.add(audioEffectDecodeAudioEffect);
                this.audioEffectsMap.put((String) map.get("type"), audioEffectDecodeAudioEffect);
            }
        }
        enqueuePlaybackEvent();
    }

    private void setShuffleOrder(Object obj) {
        Map map = (Map) obj;
        J j5 = this.mediaSources.get((String) mapGet(map, "id"));
        if (j5 == null) {
            return;
        }
        String str = (String) mapGet(map, "type");
        str.getClass();
        if (!str.equals("concatenating")) {
            if (str.equals("looping")) {
                setShuffleOrder(mapGet(map, "child"));
            }
        } else {
            ((C0977s) j5).M(decodeShuffleOrder((List) mapGet(map, "shuffleOrder")));
            Iterator it = ((List) mapGet(map, "children")).iterator();
            while (it.hasNext()) {
                setShuffleOrder(it.next());
            }
        }
    }

    private void startWatchingBuffer() {
        this.handler.removeCallbacks(this.bufferWatcher);
        this.handler.post(this.bufferWatcher);
    }

    private boolean updateCurrentIndex() {
        Integer numValueOf = Integer.valueOf(((C0448G) this.player).w());
        if (numValueOf.equals(this.currentIndex)) {
            return false;
        }
        this.currentIndex = numValueOf;
        return true;
    }

    private void updatePosition() {
        this.updatePosition = getCurrentPosition();
        this.updateTime = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean updatePositionIfChanged() {
        InterfaceC0467s interfaceC0467s = this.player;
        if (interfaceC0467s == null) {
            return false;
        }
        if (!(((C0448G) interfaceC0467s).D() && this.processingState == ProcessingState.ready) && getCurrentPosition() == this.updatePosition) {
            return false;
        }
        this.updatePosition = getCurrentPosition();
        this.updateTime = System.currentTimeMillis();
        return true;
    }

    public void dispose() {
        if (this.processingState == ProcessingState.loading) {
            abortExistingConnection(true);
        }
        InterfaceC0706p interfaceC0706p = this.playResult;
        if (interfaceC0706p != null) {
            interfaceC0706p.success(new HashMap());
            this.playResult = null;
        }
        this.mediaSources.clear();
        clearAudioEffects();
        InterfaceC0467s interfaceC0467s = this.player;
        if (interfaceC0467s != null) {
            ((C0448G) interfaceC0467s).L();
            this.player = null;
            this.processingState = ProcessingState.idle;
            broadcastImmediatePlaybackEvent();
        }
        this.eventChannel.endOfStream();
        this.dataEventChannel.endOfStream();
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(C0177c c0177c) {
    }

    public void onAudioSessionIdChanged(int i) {
        setAudioSessionId(i);
        broadcastPendingPlaybackEvent();
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(C0160K c0160k) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onCues(c0.c cVar) {
    }

    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(C0183i c0183i) {
    }

    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z4) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onEvents(InterfaceC0164O interfaceC0164O, C0161L c0161l) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z4) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z4) {
    }

    @Override // a0.InterfaceC0162M
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z4) {
    }

    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j5) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onMediaItemTransition(C0150A c0150a, int i) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(C0153D c0153d) {
    }

    @Override // a0.InterfaceC0162M, r0.InterfaceC0749b
    public void onMetadata(C0155F c0155f) {
        int i = 0;
        while (true) {
            InterfaceC0154E[] interfaceC0154EArr = c0155f.f3211l;
            if (i >= interfaceC0154EArr.length) {
                return;
            }
            InterfaceC0154E interfaceC0154E = interfaceC0154EArr[i];
            if (interfaceC0154E instanceof c) {
                this.icyInfo = (c) interfaceC0154E;
                broadcastImmediatePlaybackEvent();
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011c  */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.ryanheise.just_audio.a] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.ryanheise.just_audio.a] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.ryanheise.just_audio.a] */
    @Override // n3.InterfaceC0705o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(n3.C0704n r19, final n3.InterfaceC0706p r20) {
        /*
            Method dump skipped, instruction units count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.just_audio.AudioPlayer.onMethodCall(n3.n, n3.p):void");
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z4, int i) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(C0159J c0159j) {
    }

    @Override // a0.InterfaceC0162M
    public void onPlaybackStateChanged(int i) {
        if (i == 2) {
            updatePositionIfChanged();
            ProcessingState processingState = this.processingState;
            ProcessingState processingState2 = ProcessingState.buffering;
            if (processingState != processingState2 && processingState != ProcessingState.loading) {
                this.processingState = processingState2;
                this.errorCode = null;
                this.errorMessage = null;
                broadcastImmediatePlaybackEvent();
            }
            startWatchingBuffer();
            return;
        }
        if (i == 3) {
            if (((C0448G) this.player).D()) {
                updatePosition();
            }
            this.processingState = ProcessingState.ready;
            this.errorCode = null;
            this.errorMessage = null;
            broadcastImmediatePlaybackEvent();
            if (this.prepareResult != null) {
                HashMap map = new HashMap();
                map.put("duration", getDuration() == -9223372036854775807L ? null : Long.valueOf(getDuration() * 1000));
                this.prepareResult.success(map);
                this.prepareResult = null;
                C0177c c0177c = this.pendingAudioAttributes;
                if (c0177c != null) {
                    ((C0448G) this.player).P(c0177c, false);
                    this.pendingAudioAttributes = null;
                }
            }
            if (this.seekResult != null) {
                completeSeek();
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ProcessingState processingState3 = this.processingState;
        ProcessingState processingState4 = ProcessingState.completed;
        if (processingState3 != processingState4) {
            updatePosition();
            this.processingState = processingState4;
            this.errorCode = null;
            this.errorMessage = null;
            broadcastImmediatePlaybackEvent();
        }
        if (this.prepareResult != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", getDuration() == -9223372036854775807L ? null : Long.valueOf(getDuration() * 1000));
            this.prepareResult.success(map2);
            this.prepareResult = null;
            C0177c c0177c2 = this.pendingAudioAttributes;
            if (c0177c2 != null) {
                ((C0448G) this.player).P(c0177c2, false);
                this.pendingAudioAttributes = null;
            }
        }
        InterfaceC0706p interfaceC0706p = this.playResult;
        if (interfaceC0706p != null) {
            interfaceC0706p.success(new HashMap());
            this.playResult = null;
        }
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // a0.InterfaceC0162M
    public void onPlayerError(AbstractC0158I abstractC0158I) {
        if (!(abstractC0158I instanceof C0464o)) {
            Log.e(TAG, "default PlaybackException: " + abstractC0158I.getMessage());
            sendError(abstractC0158I.f3217l, abstractC0158I.getMessage(), mapOf("index", this.currentIndex));
            return;
        }
        C0464o c0464o = (C0464o) abstractC0158I;
        int i = c0464o.f6245n;
        if (i == 0) {
            StringBuilder sb = new StringBuilder("TYPE_SOURCE: ");
            AbstractC0360m.h(i == 0);
            Throwable cause = c0464o.getCause();
            cause.getClass();
            sb.append(((IOException) cause).getMessage());
            Log.e(TAG, sb.toString());
        } else if (i != 1) {
            int i5 = c0464o.f6245n;
            if (i != 2) {
                StringBuilder sb2 = new StringBuilder("default ExoPlaybackException: ");
                AbstractC0360m.h(i5 == 2);
                Throwable cause2 = c0464o.getCause();
                cause2.getClass();
                sb2.append(((RuntimeException) cause2).getMessage());
                Log.e(TAG, sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder("TYPE_UNEXPECTED: ");
                AbstractC0360m.h(i5 == 2);
                Throwable cause3 = c0464o.getCause();
                cause3.getClass();
                sb3.append(((RuntimeException) cause3).getMessage());
                Log.e(TAG, sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder("TYPE_RENDERER: ");
            AbstractC0360m.h(i == 1);
            Throwable cause4 = c0464o.getCause();
            cause4.getClass();
            sb4.append(((Exception) cause4).getMessage());
            Log.e(TAG, sb4.toString());
        }
        sendError(i, c0464o.getMessage(), mapOf("index", this.currentIndex));
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(AbstractC0158I abstractC0158I) {
    }

    @Override // a0.InterfaceC0162M
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z4, int i) {
    }

    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(C0153D c0153d) {
    }

    @Override // a0.InterfaceC0162M
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
    }

    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j5) {
    }

    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j5) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z4) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z4) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i5) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:7:0x0014, B:9:0x0021, B:11:0x0025, B:13:0x0038, B:16:0x0044, B:27:0x0077, B:35:0x00a4, B:36:0x00aa, B:38:0x00b8, B:39:0x00c0, B:30:0x008d, B:33:0x0099, B:19:0x005b, B:22:0x0067, B:40:0x00c4, B:42:0x00df), top: B:47:0x0014 }] */
    @Override // a0.InterfaceC0162M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTimelineChanged(a0.AbstractC0169U r7, int r8) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.just_audio.AudioPlayer.onTimelineChanged(a0.U, int):void");
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(C0174Z c0174z) {
    }

    @Override // a0.InterfaceC0162M
    public void onTracksChanged(a0.b0 b0Var) {
        for (int i = 0; i < b0Var.a().size(); i++) {
            C0170V c0170v = ((a0.a0) b0Var.a().get(i)).f3312b;
            for (int i5 = 0; i5 < c0170v.f3261a; i5++) {
                C0155F c0155f = c0170v.a(i5).f3422l;
                if (c0155f != null) {
                    for (int i6 = 0; i6 < c0155f.g(); i6++) {
                        InterfaceC0154E interfaceC0154EF = c0155f.f(i6);
                        if (interfaceC0154EF instanceof S0.b) {
                            this.icyHeaders = (S0.b) interfaceC0154EF;
                            broadcastImmediatePlaybackEvent();
                        }
                    }
                }
            }
        }
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(e0 e0Var) {
    }

    @Override // a0.InterfaceC0162M
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f2) {
    }

    public void pause() {
        if (((C0448G) this.player).D()) {
            ((C0448G) this.player).R(false);
            updatePosition();
            enqueuePlaybackEvent();
            InterfaceC0706p interfaceC0706p = this.playResult;
            if (interfaceC0706p != null) {
                interfaceC0706p.success(new HashMap());
                this.playResult = null;
            }
        }
    }

    public void play(InterfaceC0706p interfaceC0706p) {
        InterfaceC0706p interfaceC0706p2;
        if (((C0448G) this.player).D()) {
            interfaceC0706p.success(new HashMap());
            return;
        }
        InterfaceC0706p interfaceC0706p3 = this.playResult;
        if (interfaceC0706p3 != null) {
            interfaceC0706p3.success(new HashMap());
        }
        this.playResult = interfaceC0706p;
        ((C0448G) this.player).R(true);
        updatePosition();
        if (this.processingState != ProcessingState.completed || (interfaceC0706p2 = this.playResult) == null) {
            return;
        }
        interfaceC0706p2.success(new HashMap());
        this.playResult = null;
    }

    public void seek(long j5, Integer num, InterfaceC0706p interfaceC0706p) {
        ProcessingState processingState = this.processingState;
        if (processingState == ProcessingState.idle || processingState == ProcessingState.loading) {
            interfaceC0706p.success(new HashMap());
            return;
        }
        abortSeek();
        this.seekPos = Long.valueOf(j5);
        this.seekResult = interfaceC0706p;
        try {
            ((L0.e) this.player).n(num != null ? num.intValue() : ((C0448G) this.player).w(), j5, false);
        } catch (RuntimeException e5) {
            this.seekResult = null;
            this.seekPos = null;
            throw e5;
        }
    }

    public void setLoopMode(int i) {
        ((C0448G) this.player).T(i);
    }

    public void setPitch(float f2) {
        C0448G c0448g = (C0448G) this.player;
        c0448g.d0();
        C0159J c0159j = c0448g.f5945d0.f6187o;
        if (c0159j.f3221b == f2) {
            return;
        }
        ((C0448G) this.player).S(new C0159J(c0159j.f3220a, f2));
        enqueuePlaybackEvent();
    }

    public void setShuffleModeEnabled(boolean z4) {
        C0448G c0448g = (C0448G) this.player;
        c0448g.d0();
        if (c0448g.f5917D != z4) {
            c0448g.f5917D = z4;
            C0367t c0367t = c0448g.f5953k.f6032t;
            c0367t.getClass();
            C0366s c0366sB = C0367t.b();
            c0366sB.f5319a = c0367t.f5321a.obtainMessage(12, z4 ? 1 : 0, 0);
            c0366sB.b();
            C0470v c0470v = new C0470v(1, z4);
            C0359l c0359l = c0448g.f5954l;
            c0359l.c(9, c0470v);
            c0448g.Z();
            c0359l.b();
        }
    }

    public void setSkipSilenceEnabled(boolean z4) {
        C0448G c0448g = (C0448G) this.player;
        c0448g.d0();
        if (c0448g.f5935W == z4) {
            return;
        }
        c0448g.f5935W = z4;
        c0448g.O(1, 9, Boolean.valueOf(z4));
        c0448g.f5954l.e(23, new C0470v(0, z4));
    }

    public void setSpeed(float f2) {
        C0448G c0448g = (C0448G) this.player;
        c0448g.d0();
        C0159J c0159j = c0448g.f5945d0.f6187o;
        if (c0159j.f3220a == f2) {
            return;
        }
        ((C0448G) this.player).S(new C0159J(f2, c0159j.f3221b));
        if (((C0448G) this.player).D()) {
            updatePosition();
        }
        enqueuePlaybackEvent();
    }

    public void setVolume(float f2) {
        ((C0448G) this.player).X(f2);
    }

    private void sendError(int i, String str, Object obj, boolean z4) {
        this.eventChannel.error(String.valueOf(i), str, obj);
        this.errorCode = Integer.valueOf(i);
        this.errorMessage = str;
        if (z4) {
            this.processingState = ProcessingState.idle;
        }
        broadcastImmediatePlaybackEvent();
        InterfaceC0706p interfaceC0706p = this.prepareResult;
        if (interfaceC0706p != null) {
            interfaceC0706p.error(String.valueOf(i), str, obj);
            this.prepareResult = null;
        }
    }

    @Override // a0.InterfaceC0162M
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // a0.InterfaceC0162M
    public void onPositionDiscontinuity(C0163N c0163n, C0163N c0163n2, int i) {
        updatePosition();
        if (i == 0 || i == 1) {
            updateCurrentIndex();
        }
        broadcastImmediatePlaybackEvent();
    }
}
