package r1;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: r1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC0772m implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        float f5 = f2 - 1.0f;
        return (f5 * f5 * f5 * f5 * f5) + 1.0f;
    }
}
