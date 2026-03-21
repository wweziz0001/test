package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0238e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f4374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.D f4376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0239f f4377d;

    public AnimationAnimationListenerC0238e(Y y, ViewGroup viewGroup, io.flutter.embedding.android.D d5, C0239f c0239f) {
        this.f4374a = y;
        this.f4375b = viewGroup;
        this.f4376c = d5;
        this.f4377d = c0239f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        N3.h.e(animation, "animation");
        io.flutter.embedding.android.D d5 = this.f4376c;
        C0239f c0239f = this.f4377d;
        ViewGroup viewGroup = this.f4375b;
        viewGroup.post(new Q.l(viewGroup, d5, c0239f, 2));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f4374a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        N3.h.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        N3.h.e(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f4374a + " has reached onAnimationStart.");
        }
    }
}
