package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import x.AbstractC0952a;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f8305l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8306m;

    public final void a(Canvas canvas) {
        this.f8305l.draw(canvas);
    }

    public final void b(float f2, float f5) {
        AbstractC0952a.e(this.f8305l, f2, f5);
    }

    public final void c(int i, int i5, int i6, int i7) {
        AbstractC0952a.f(this.f8305l, i, i5, i6, i7);
    }

    public final boolean d(boolean z4, boolean z5) {
        return super.setVisible(z4, z5) || this.f8305l.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f8306m) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f8305l.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f8305l.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f8305l.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f8305l.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f8305l.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f8305l.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f8305l.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f8305l.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f8305l.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f8305l.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f8305l.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f8305l.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f8305l.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f8305l.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f8305l.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        scheduleSelf(runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f8305l.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        this.f8305l.setAutoMirrored(z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f8305l.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8305l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z4) {
        this.f8305l.setDither(z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z4) {
        this.f8305l.setFilterBitmap(z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f5) {
        if (this.f8306m) {
            b(f2, f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i5, int i6, int i7) {
        if (this.f8306m) {
            c(i, i5, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f8306m) {
            return this.f8305l.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        AbstractC0952a.g(this.f8305l, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        AbstractC0952a.h(this.f8305l, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        AbstractC0952a.i(this.f8305l, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        if (this.f8306m) {
            return d(z4, z5);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
