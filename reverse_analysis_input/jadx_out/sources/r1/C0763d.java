package r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: r1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0763d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9459a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0765f f9460b;

    public C0763d(C0765f c0765f) {
        this.f9460b = c0765f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f9459a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f9459a) {
            this.f9459a = false;
            return;
        }
        C0765f c0765f = this.f9460b;
        if (((Float) c0765f.f9482u.getAnimatedValue()).floatValue() == 0.0f) {
            c0765f.f9483v = 0;
            c0765f.e(0);
        } else {
            c0765f.f9483v = 2;
            c0765f.f9475n.invalidate();
        }
    }
}
