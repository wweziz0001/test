package androidx.appcompat.view.menu;

import a.AbstractC0149a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import h.AbstractC0441a;
import l.AbstractC0544b;
import l.InterfaceC0549g;
import l.InterfaceC0558p;
import l.MenuC0550h;
import l.MenuItemC0551i;
import l.ViewOnTouchListenerC0543a;
import m.A;
import m.InterfaceC0596j;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends A implements InterfaceC0558p, View.OnClickListener, InterfaceC0596j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f3782A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f3783B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f3784C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MenuItemC0551i f3785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f3786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f3787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0549g f3788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewOnTouchListenerC0543a f3789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC0544b f3790x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3791z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.y = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0441a.f5884c, 0, 0);
        this.f3782A = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f3784C = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3783B = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC0596j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.InterfaceC0558p
    public final void b(MenuItemC0551i menuItemC0551i) {
        this.f3785s = menuItemC0551i;
        setIcon(menuItemC0551i.getIcon());
        setTitle(menuItemC0551i.getTitleCondensed());
        setId(menuItemC0551i.f7756a);
        setVisibility(menuItemC0551i.isVisible() ? 0 : 8);
        setEnabled(menuItemC0551i.isEnabled());
        if (menuItemC0551i.hasSubMenu() && this.f3789w == null) {
            this.f3789w = new ViewOnTouchListenerC0543a(this);
        }
    }

    @Override // m.InterfaceC0596j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f3785s.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.InterfaceC0558p
    public MenuItemC0551i getItemData() {
        return this.f3785s;
    }

    public final void h() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.f3786t);
        if (this.f3787u != null && ((this.f3785s.y & 4) != 4 || (!this.y && !this.f3791z))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        setText(z6 ? this.f3786t : null);
        CharSequence charSequence = this.f3785s.f7771q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z6 ? null : this.f3785s.f7760e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f3785s.f7772r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0149a.E(this, z6 ? null : this.f3785s.f7760e);
        } else {
            AbstractC0149a.E(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0549g interfaceC0549g = this.f3788v;
        if (interfaceC0549g != null) {
            interfaceC0549g.a(this.f3785s);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.y = g();
        h();
    }

    @Override // m.A, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i6 = this.f3783B) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i5);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f3782A;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i5);
        }
        if (!zIsEmpty || this.f3787u == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f3787u.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC0543a viewOnTouchListenerC0543a;
        if (this.f3785s.hasSubMenu() && (viewOnTouchListenerC0543a = this.f3789w) != null && viewOnTouchListenerC0543a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f3791z != z4) {
            this.f3791z = z4;
            MenuItemC0551i menuItemC0551i = this.f3785s;
            if (menuItemC0551i != null) {
                MenuC0550h menuC0550h = menuItemC0551i.f7768n;
                menuC0550h.f7744k = true;
                menuC0550h.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3787u = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f3784C;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(InterfaceC0549g interfaceC0549g) {
        this.f3788v = interfaceC0549g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i5, int i6, int i7) {
        this.f3783B = i;
        super.setPadding(i, i5, i6, i7);
    }

    public void setPopupCallback(AbstractC0544b abstractC0544b) {
        this.f3790x = abstractC0544b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3786t = charSequence;
        h();
    }
}
