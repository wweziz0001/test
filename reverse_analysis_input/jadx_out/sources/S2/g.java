package S2;

import C3.r;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AbstractC0289f;
import androidx.media.AudioAttributesCompat;
import androidx.media.C0284a;
import androidx.media.C0285b;
import androidx.media.C0288e;
import b3.AbstractC0307a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n3.C0707q;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0288e f2030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f2031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f2032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f2033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioManager f2034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f2035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f2036h;

    public g(Context context) {
        N3.h.e(context, "applicationContext");
        Handler handler = new Handler(Looper.getMainLooper());
        this.f2029a = new ArrayList();
        this.f2036h = new ArrayList();
        this.f2033e = context;
        Object systemService = context.getSystemService("audio");
        N3.h.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f2034f = (AudioManager) systemService;
        this.f2035g = new e(this, 0);
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        e eVar = this.f2035g;
        N3.h.c(eVar, "null cannot be cast to non-null type android.media.AudioDeviceCallback");
        audioManager.registerAudioDeviceCallback(eVar, handler);
    }

    public static Boolean s() {
        return Boolean.valueOf(AudioManager.isHapticPlaybackSupported());
    }

    public final void A(boolean z4) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        audioManager.setBluetoothScoOn(z4);
    }

    public final boolean B(int i) {
        for (AudioDeviceInfo audioDeviceInfo : this.f2036h) {
            if (audioDeviceInfo.getId() == i) {
                AudioManager audioManager = this.f2034f;
                N3.h.b(audioManager);
                return audioManager.setCommunicationDevice(audioDeviceInfo);
            }
        }
        return false;
    }

    public final void C(boolean z4) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        audioManager.setMicrophoneMute(z4);
    }

    public final void D(String str) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        audioManager.setParameters(str);
    }

    public final void E(boolean z4) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        audioManager.setSpeakerphoneOn(z4);
    }

    public final void F() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        audioManager.startBluetoothSco();
    }

    public final void G() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        audioManager.stopBluetoothSco();
    }

    public final boolean a() {
        Context context;
        Context context2 = this.f2033e;
        if (context2 == null) {
            return false;
        }
        f fVar = this.f2031c;
        if (fVar != null) {
            context2.unregisterReceiver(fVar);
            this.f2031c = null;
        }
        f fVar2 = this.f2032d;
        if (fVar2 != null && (context = this.f2033e) != null) {
            context.unregisterReceiver(fVar2);
            this.f2032d = null;
        }
        if (this.f2030b == null) {
            return true;
        }
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        C0288e c0288e = this.f2030b;
        N3.h.b(c0288e);
        int iA = Build.VERSION.SDK_INT >= 26 ? AbstractC0289f.a(audioManager, B.a.e(c0288e.f4585f)) : audioManager.abandonAudioFocus(c0288e.f4581b);
        this.f2030b = null;
        return iA == 1;
    }

    public final void b(int i, int i5, int i6) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        audioManager.adjustStreamVolume(i, i5, i6);
    }

    public final void c(int i, int i5) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        audioManager.adjustVolume(i, i5);
    }

    public final void d(Map map) {
        Long lB = i4.a.B(map.get("downTime"));
        N3.h.b(lB);
        long jLongValue = lB.longValue();
        Long lB2 = i4.a.B(map.get("eventTime"));
        N3.h.b(lB2);
        long jLongValue2 = lB2.longValue();
        Object obj = map.get("action");
        N3.h.c(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = map.get("keyCode");
        N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj2).intValue();
        Object obj3 = map.get("repeatCount");
        N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue3 = ((Integer) obj3).intValue();
        Object obj4 = map.get("metaState");
        N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue4 = ((Integer) obj4).intValue();
        Object obj5 = map.get("deviceId");
        N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue5 = ((Integer) obj5).intValue();
        Object obj6 = map.get("scanCode");
        N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue6 = ((Integer) obj6).intValue();
        Object obj7 = map.get("flags");
        N3.h.c(obj7, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue7 = ((Integer) obj7).intValue();
        Object obj8 = map.get("source");
        N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Int");
        KeyEvent keyEvent = new KeyEvent(jLongValue, jLongValue2, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, ((Integer) obj8).intValue());
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        audioManager.dispatchMediaKeyEvent(keyEvent);
    }

    public final ArrayList e() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        List<AudioDeviceInfo> availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        N3.h.d(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        ArrayList arrayList = new ArrayList(C3.h.R(availableCommunicationDevices));
        for (AudioDeviceInfo audioDeviceInfo : availableCommunicationDevices) {
            N3.h.b(audioDeviceInfo);
            arrayList.add(i4.a.t(audioDeviceInfo));
        }
        return arrayList;
    }

    public final Map f() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
        if (communicationDevice == null) {
            return null;
        }
        return i4.a.t(communicationDevice);
    }

    public final ArrayList g(int i) {
        ArrayList arrayList = new ArrayList();
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        AudioDeviceInfo[] devices = audioManager.getDevices(i);
        N3.h.d(devices, "getDevices(...)");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            arrayList.add(i4.a.t(audioDeviceInfo));
        }
        return arrayList;
    }

    public final ArrayList h() throws IOException {
        ArrayList arrayList = new ArrayList();
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        List microphones = audioManager.getMicrophones();
        N3.h.d(microphones, "getMicrophones(...)");
        for (Iterator it = microphones.iterator(); it.hasNext(); it = it) {
            MicrophoneInfo microphoneInfoH = b.h(it.next());
            List<Pair> frequencyResponse = microphoneInfoH.getFrequencyResponse();
            N3.h.d(frequencyResponse, "getFrequencyResponse(...)");
            ArrayList arrayList2 = new ArrayList(C3.h.R(frequencyResponse));
            for (Pair pair : frequencyResponse) {
                arrayList2.add(C3.g.Q(Double.valueOf(((Number) pair.first).floatValue()), Double.valueOf(((Number) pair.second).floatValue())));
            }
            List<Pair> channelMapping = microphoneInfoH.getChannelMapping();
            N3.h.d(channelMapping, "getChannelMapping(...)");
            ArrayList arrayList3 = new ArrayList(C3.h.R(channelMapping));
            for (Pair pair2 : channelMapping) {
                arrayList3.add(C3.g.Q(Integer.valueOf(((Number) pair2.first).intValue()), Integer.valueOf(((Number) pair2.second).intValue())));
            }
            B3.b bVar = new B3.b("description", microphoneInfoH.getDescription());
            B3.b bVar2 = new B3.b("id", Integer.valueOf(microphoneInfoH.getId()));
            B3.b bVar3 = new B3.b("type", Integer.valueOf(microphoneInfoH.getType()));
            B3.b bVar4 = new B3.b("address", microphoneInfoH.getAddress());
            B3.b bVar5 = new B3.b("location", Integer.valueOf(microphoneInfoH.getLocation()));
            B3.b bVar6 = new B3.b("group", Integer.valueOf(microphoneInfoH.getGroup()));
            B3.b bVar7 = new B3.b("indexInTheGroup", Integer.valueOf(microphoneInfoH.getIndexInTheGroup()));
            MicrophoneInfo.Coordinate3F position = microphoneInfoH.getPosition();
            N3.h.d(position, "getPosition(...)");
            B3.b bVar8 = new B3.b("position", i4.a.o(position));
            MicrophoneInfo.Coordinate3F orientation = microphoneInfoH.getOrientation();
            N3.h.d(orientation, "getOrientation(...)");
            ArrayList arrayList4 = arrayList;
            arrayList4.add(r.c0(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, new B3.b("orientation", i4.a.o(orientation)), new B3.b("frequencyResponse", arrayList2), new B3.b("channelMapping", arrayList3), new B3.b("sensitivity", Float.valueOf(microphoneInfoH.getSensitivity())), new B3.b("maxSpl", Float.valueOf(microphoneInfoH.getMaxSpl())), new B3.b("minSpl", Float.valueOf(microphoneInfoH.getMinSpl())), new B3.b("directionality", Integer.valueOf(microphoneInfoH.getDirectionality()))));
            arrayList = arrayList4;
        }
        return arrayList;
    }

    public final Integer i() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Integer.valueOf(audioManager.getMode());
    }

    public final String j(String str) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        String parameters = audioManager.getParameters(str);
        N3.h.d(parameters, "getParameters(...)");
        return parameters;
    }

    public final Integer k() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Integer.valueOf(audioManager.getRingerMode());
    }

    public final Integer l(int i) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Integer.valueOf(audioManager.getStreamMaxVolume(i));
    }

    public final Integer m(int i) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Integer.valueOf(audioManager.getStreamMinVolume(i));
    }

    public final Integer n(int i) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Integer.valueOf(audioManager.getStreamVolume(i));
    }

    public final Float o(int i, int i5, int i6) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Float.valueOf(audioManager.getStreamVolumeDb(i, i5, i6));
    }

    public final void p(String str, Object... objArr) {
        for (a aVar : this.f2029a) {
            ArrayList arrayListZ = C3.e.Z(objArr);
            C0707q c0707q = aVar.f2023l;
            N3.h.b(c0707q);
            c0707q.a(str, arrayListZ, null);
        }
    }

    public final Boolean q() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Boolean.valueOf(audioManager.isBluetoothScoAvailableOffCall());
    }

    public final Boolean r() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Boolean.valueOf(audioManager.isBluetoothScoOn());
    }

    public final Boolean t() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Boolean.valueOf(audioManager.isMicrophoneMute());
    }

    public final Boolean u() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    public final Boolean v() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    public final Boolean w(int i) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        return Boolean.valueOf(audioManager.isStreamMute(i));
    }

    public final void x() {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        audioManager.loadSoundEffects();
    }

    public final boolean y(List list) {
        boolean zBooleanValue;
        N3.h.e(list, "args");
        if (this.f2030b != null) {
            return true;
        }
        Object obj = list.get(0);
        N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map = (Map) obj;
        Object obj2 = map.get("gainType");
        N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        AudioAttributesCompat audioAttributesCompat = C0288e.f4579g;
        if (iIntValue != 1 && iIntValue != 2 && iIntValue != 3 && iIntValue != 4) {
            throw new IllegalArgumentException(AbstractC0307a.i("Illegal audio focus gain type ", iIntValue));
        }
        d dVar = new d(this);
        Handler handler = new Handler(Looper.getMainLooper());
        if (map.get("audioAttributes") != null) {
            Map map2 = (Map) map.get("audioAttributes");
            N3.h.b(map2);
            int i = AudioAttributesCompat.f4562b;
            C0284a c0285b = Build.VERSION.SDK_INT >= 26 ? new C0285b() : new C0284a();
            Object obj3 = map2.get("contentType");
            AudioAttributes.Builder builder = (AudioAttributes.Builder) c0285b.f4576a;
            if (obj3 != null) {
                Object obj4 = map2.get("contentType");
                N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Int");
                builder.setContentType(((Integer) obj4).intValue());
            }
            if (map2.get("flags") != null) {
                Object obj5 = map2.get("flags");
                N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Int");
                builder.setFlags(((Integer) obj5).intValue());
            }
            if (map2.get("usage") != null) {
                Object obj6 = map2.get("usage");
                N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Int");
                c0285b.f(((Integer) obj6).intValue());
            }
            audioAttributesCompat = new AudioAttributesCompat(c0285b.a());
        }
        AudioAttributesCompat audioAttributesCompat2 = audioAttributesCompat;
        if (map.get("willPauseWhenDucked") != null) {
            Object obj7 = map.get("willPauseWhenDucked");
            N3.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
            zBooleanValue = ((Boolean) obj7).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.f2030b = new C0288e(iIntValue, dVar, handler, audioAttributesCompat2, zBooleanValue);
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        C0288e c0288e = this.f2030b;
        N3.h.b(c0288e);
        boolean z4 = (Build.VERSION.SDK_INT >= 26 ? AbstractC0289f.b(audioManager, B.a.e(c0288e.f4585f)) : audioManager.requestAudioFocus(c0288e.f4581b, c0288e.f4583d.f4563a.a(), c0288e.f4580a)) == 1;
        if (z4) {
            if (this.f2031c == null) {
                this.f2031c = new f(this, 0);
                Context context = this.f2033e;
                N3.h.b(context);
                i4.a.P(context, this.f2031c, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            }
            if (this.f2032d == null) {
                this.f2032d = new f(this, 1);
                Context context2 = this.f2033e;
                N3.h.b(context2);
                i4.a.P(context2, this.f2032d, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            }
        }
        return z4;
    }

    public final void z(int i) {
        AudioManager audioManager = this.f2034f;
        N3.h.b(audioManager);
        audioManager.setAllowedCapturePolicy(i);
    }
}
