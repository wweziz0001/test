package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import l.ViewOnTouchListenerC0543a;

/* JADX INFO: loaded from: classes.dex */
public final class V implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC0543a f8337m;

    public /* synthetic */ V(ViewOnTouchListenerC0543a viewOnTouchListenerC0543a, int i) {
        this.f8336l = i;
        this.f8337m = viewOnTouchListenerC0543a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8336l) {
            case 0:
                ViewParent parent = this.f8337m.f7691o.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                ViewOnTouchListenerC0543a viewOnTouchListenerC0543a = this.f8337m;
                viewOnTouchListenerC0543a.a();
                View view = viewOnTouchListenerC0543a.f7691o;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0543a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    viewOnTouchListenerC0543a.f7694r = true;
                    break;
                }
                break;
        }
    }
}
