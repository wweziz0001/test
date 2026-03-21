package r1;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: r1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0764e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0765f f9461a;

    public C0764e(C0765f c0765f) {
        this.f9461a = c0765f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0765f c0765f = this.f9461a;
        c0765f.f9464b.setAlpha(iFloatValue);
        c0765f.f9465c.setAlpha(iFloatValue);
        c0765f.f9475n.invalidate();
    }
}
