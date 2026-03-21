package m;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: m.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0585d0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0587e0 f8382l;

    public ViewOnTouchListenerC0585d0(AbstractC0587e0 abstractC0587e0) {
        this.f8382l = abstractC0587e0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        int action = motionEvent.getAction();
        int x4 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        AbstractC0587e0 abstractC0587e0 = this.f8382l;
        if (action == 0 && (rVar = abstractC0587e0.f8391G) != null && rVar.isShowing() && x4 >= 0 && x4 < abstractC0587e0.f8391G.getWidth() && y >= 0 && y < abstractC0587e0.f8391G.getHeight()) {
            abstractC0587e0.f8387C.postDelayed(abstractC0587e0.y, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        abstractC0587e0.f8387C.removeCallbacks(abstractC0587e0.y);
        return false;
    }
}
