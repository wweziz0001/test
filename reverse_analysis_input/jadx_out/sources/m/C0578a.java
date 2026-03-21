package m;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: m.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0578a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f8375a;

    public C0578a(ActionBarContainer actionBarContainer) {
        this.f8375a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f8375a;
        if (actionBarContainer.f3815r) {
            Drawable drawable = actionBarContainer.f3814q;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f3812o;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f3813p;
        if (drawable3 == null || !actionBarContainer.f3816s) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f8375a;
        if (actionBarContainer.f3815r) {
            if (actionBarContainer.f3814q != null) {
                actionBarContainer.f3812o.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f3812o;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
