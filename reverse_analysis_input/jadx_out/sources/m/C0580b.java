package m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: m.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0580b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f8376a;

    public C0580b(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f8376a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8376a;
        actionBarOverlayLayout.f3835E = null;
        actionBarOverlayLayout.f3849u = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8376a;
        actionBarOverlayLayout.f3835E = null;
        actionBarOverlayLayout.f3849u = false;
    }
}
