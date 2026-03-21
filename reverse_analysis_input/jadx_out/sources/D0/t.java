package D0;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayManager f501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f502c;

    public /* synthetic */ t(Object obj, DisplayManager displayManager, int i) {
        this.f500a = i;
        this.f502c = obj;
        this.f501b = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        switch (this.f500a) {
            case 0:
            case 1:
                break;
            default:
                Iterator it = ((ArrayList) this.f502c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.f500a) {
            case 0:
                if (i == 0) {
                    v.a((v) this.f502c, this.f501b.getDisplay(0));
                }
                break;
            case 1:
                if (i == 0) {
                    float refreshRate = this.f501b.getDisplay(0).getRefreshRate();
                    io.flutter.view.r rVar = (io.flutter.view.r) this.f502c;
                    rVar.f6964a = (long) (1.0E9d / ((double) refreshRate));
                    rVar.f6965b.setRefreshRateFPS(refreshRate);
                }
                break;
            default:
                if (this.f501b.getDisplay(i) != null) {
                    Iterator it = ((ArrayList) this.f502c).iterator();
                    while (it.hasNext()) {
                        ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        switch (this.f500a) {
            case 0:
            case 1:
                break;
            default:
                Iterator it = ((ArrayList) this.f502c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i);
                }
                break;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }
}
