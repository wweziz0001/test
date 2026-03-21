package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: m.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0582c implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f8380m;

    public /* synthetic */ RunnableC0582c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f8379l = i;
        this.f8380m = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8379l) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8380m;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f3835E = actionBarOverlayLayout.f3842n.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f3836F);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8380m;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f3835E = actionBarOverlayLayout2.f3842n.animate().translationY(-actionBarOverlayLayout2.f3842n.getHeight()).setListener(actionBarOverlayLayout2.f3836F);
                break;
        }
    }
}
