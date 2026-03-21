package androidx.window.layout.adapter.sidecar;

import N1.f;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f4768b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f4770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f4771e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4767a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f4769c = new WeakHashMap();

    public DistinctElementSidecarCallback(f fVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f4770d = fVar;
        this.f4771e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f4767a) {
            try {
                f fVar = this.f4770d;
                SidecarDeviceState sidecarDeviceState2 = this.f4768b;
                fVar.getClass();
                if (f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f4768b = sidecarDeviceState;
                this.f4771e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f4767a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f4769c.get(iBinder);
                this.f4770d.getClass();
                if (f.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f4769c.put(iBinder, sidecarWindowLayoutInfo);
                this.f4771e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
