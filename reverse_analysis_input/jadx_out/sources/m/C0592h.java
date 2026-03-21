package m;

import a.AbstractC0149a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.example.hqp_mobile_app.R;
import l.ViewOnTouchListenerC0543a;
import x.AbstractC0952a;

/* JADX INFO: renamed from: m.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0592h extends C0610q implements InterfaceC0596j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0594i f8409o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0592h(C0594i c0594i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f8409o = c0594i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0149a.E(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC0543a(this, this));
    }

    @Override // m.InterfaceC0596j
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC0596j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f8409o.h();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i, i5, i6, i7);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0952a.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
