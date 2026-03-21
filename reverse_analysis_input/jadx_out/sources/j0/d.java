package j0;

import a0.C0177c;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.lifecycle.E;
import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I2.g f7259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f7260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S2.e f7261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X1.d f7262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f7263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0522b f7264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public E f7265h;
    public C0177c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7266j;

    public d(Context context, I2.g gVar, C0177c c0177c, E e5) {
        Context applicationContext = context.getApplicationContext();
        this.f7258a = applicationContext;
        this.f7259b = gVar;
        this.i = c0177c;
        this.f7265h = e5;
        int i = AbstractC0370w.f5326a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f7260c = handler;
        this.f7261d = AbstractC0370w.f5326a >= 23 ? new S2.e(this, 1) : null;
        this.f7262e = new X1.d(this, 2);
        C0522b c0522b = C0522b.f7250c;
        String str = AbstractC0370w.f5328c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f7263f = uriFor != null ? new c(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(C0522b c0522b) {
        A0.u uVar;
        if (!this.f7266j || c0522b.equals(this.f7264g)) {
            return;
        }
        this.f7264g = c0522b;
        v vVar = (v) this.f7259b.f1034m;
        vVar.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = vVar.f7388f0;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper == null ? "null" : looperMyLooper.getThread().getName()) + ") is not the playback looper (" + name + ")");
        }
        if (c0522b.equals(vVar.f7407w)) {
            return;
        }
        vVar.f7407w = c0522b;
        E e5 = vVar.f7402r;
        if (e5 != null) {
            x xVar = (x) e5.f4474m;
            synchronized (xVar.f6148l) {
                uVar = xVar.f6147B;
            }
            if (uVar != null) {
                synchronized (uVar.f152c) {
                    uVar.f156g.getClass();
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        E e5 = this.f7265h;
        AudioDeviceInfo audioDeviceInfo2 = e5 == null ? null : (AudioDeviceInfo) e5.f4474m;
        int i = AbstractC0370w.f5326a;
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        E e6 = audioDeviceInfo != null ? new E(audioDeviceInfo, 9) : null;
        this.f7265h = e6;
        a(C0522b.b(this.f7258a, this.i, e6));
    }
}
