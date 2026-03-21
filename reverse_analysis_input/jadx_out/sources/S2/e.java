package S2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import d0.AbstractC0370w;
import j0.C0522b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2026b;

    public /* synthetic */ e(Object obj, int i) {
        this.f2025a = i;
        this.f2026b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        switch (this.f2025a) {
            case 0:
                N3.h.e(audioDeviceInfoArr, "addedDevices");
                ArrayList arrayList = new ArrayList(audioDeviceInfoArr.length);
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    arrayList.add(i4.a.t(audioDeviceInfo));
                }
                ((g) this.f2026b).p("onAudioDevicesAdded", arrayList);
                break;
            default:
                j0.d dVar = (j0.d) this.f2026b;
                dVar.a(C0522b.b(dVar.f7258a, dVar.i, dVar.f7265h));
                break;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        switch (this.f2025a) {
            case 0:
                N3.h.e(audioDeviceInfoArr, "removedDevices");
                ArrayList arrayList = new ArrayList(audioDeviceInfoArr.length);
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    arrayList.add(i4.a.t(audioDeviceInfo));
                }
                ((g) this.f2026b).p("onAudioDevicesRemoved", arrayList);
                break;
            default:
                j0.d dVar = (j0.d) this.f2026b;
                if (AbstractC0370w.k(audioDeviceInfoArr, dVar.f7265h)) {
                    dVar.f7265h = null;
                }
                dVar.a(C0522b.b(dVar.f7258a, dVar.i, dVar.f7265h));
                break;
        }
    }
}
