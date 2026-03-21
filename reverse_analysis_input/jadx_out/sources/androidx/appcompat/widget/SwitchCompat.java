package androidx.appcompat.widget;

import D.C0020u;
import D.I;
import Q.j;
import S.h;
import Z1.s;
import a.AbstractC0149a;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import h.AbstractC0441a;
import j.C0519a;
import java.lang.reflect.Field;
import m.C0606o;
import m.C0623x;
import m.E0;
import m.F0;
import m.G0;
import m.M;
import m.Z0;
import x.AbstractC0952a;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final E0 f3919f0 = new E0(Float.class, "thumbPos");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int[] f3920g0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f3921A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f3922B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public CharSequence f3923C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f3924D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f3925E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f3926F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f3927G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f3928H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final VelocityTracker f3929I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f3930J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f3931K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f3932L;
    public int M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f3933N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f3934O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f3935P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f3936Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f3937R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f3938S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final TextPaint f3939T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final ColorStateList f3940U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public StaticLayout f3941V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public StaticLayout f3942W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final C0519a f3943a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ObjectAnimator f3944b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C0606o f3945c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public h f3946d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Rect f3947e0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f3948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f3949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PorterDuff.Mode f3950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f3953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f3954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PorterDuff.Mode f3955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3957u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3960x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f3961z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, com.example.hqp_mobile_app.R.attr.switchStyle);
        this.f3949m = null;
        this.f3950n = null;
        this.f3951o = false;
        this.f3952p = false;
        this.f3954r = null;
        this.f3955s = null;
        this.f3956t = false;
        this.f3957u = false;
        this.f3929I = VelocityTracker.obtain();
        this.f3938S = true;
        this.f3947e0 = new Rect();
        G0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f3939T = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0441a.f5898r;
        s sVarM = s.M(context, attributeSet, iArr, com.example.hqp_mobile_app.R.attr.switchStyle);
        I.c(this, context, iArr, attributeSet, (TypedArray) sVarM.f3086n, com.example.hqp_mobile_app.R.attr.switchStyle);
        Drawable drawableD = sVarM.D(2);
        this.f3948l = drawableD;
        if (drawableD != null) {
            drawableD.setCallback(this);
        }
        Drawable drawableD2 = sVarM.D(11);
        this.f3953q = drawableD2;
        if (drawableD2 != null) {
            drawableD2.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) sVarM.f3086n;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f3924D = typedArray.getBoolean(3, true);
        this.f3958v = typedArray.getDimensionPixelSize(8, 0);
        this.f3959w = typedArray.getDimensionPixelSize(5, 0);
        this.f3960x = typedArray.getDimensionPixelSize(6, 0);
        this.y = typedArray.getBoolean(4, false);
        ColorStateList colorStateListC = sVarM.C(9);
        if (colorStateListC != null) {
            this.f3949m = colorStateListC;
            this.f3951o = true;
        }
        PorterDuff.Mode modeC = M.c(typedArray.getInt(10, -1), null);
        if (this.f3950n != modeC) {
            this.f3950n = modeC;
            this.f3952p = true;
        }
        if (this.f3951o || this.f3952p) {
            a();
        }
        ColorStateList colorStateListC2 = sVarM.C(12);
        if (colorStateListC2 != null) {
            this.f3954r = colorStateListC2;
            this.f3956t = true;
        }
        PorterDuff.Mode modeC2 = M.c(typedArray.getInt(13, -1), null);
        if (this.f3955s != modeC2) {
            this.f3955s = modeC2;
            this.f3957u = true;
        }
        if (this.f3956t || this.f3957u) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0441a.f5899s);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC0149a.t(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f3940U = colorStateList;
            } else {
                this.f3940U = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i5 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i5 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i5) : Typeface.create(typeface, i5);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i6 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i5;
                textPaint.setFakeBoldText((i6 & 1) != 0);
                textPaint.setTextSkewX((2 & i6) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0519a c0519a = new C0519a();
                c0519a.f7239a = context2.getResources().getConfiguration().locale;
                this.f3943a0 = c0519a;
            } else {
                this.f3943a0 = null;
            }
            setTextOnInternal(this.f3961z);
            setTextOffInternal(this.f3922B);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C0623x(this).d(attributeSet, com.example.hqp_mobile_app.R.attr.switchStyle);
        sVarM.O();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3926F = viewConfiguration.getScaledTouchSlop();
        this.f3930J = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().a(attributeSet, com.example.hqp_mobile_app.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0606o getEmojiTextViewHelper() {
        if (this.f3945c0 == null) {
            this.f3945c0 = new C0606o(this);
        }
        return this.f3945c0;
    }

    private boolean getTargetCheckedState() {
        return this.f3931K > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((Z0.a(this) ? 1.0f - this.f3931K : this.f3931K) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3953q;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3947e0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3948l;
        Rect rectB = drawable2 != null ? M.b(drawable2) : M.f8293c;
        return ((((this.f3932L - this.f3933N) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3922B = charSequence;
        C0606o emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodL = ((AbstractC0149a) emojiTextViewHelper.f8458b.f190l).L(this.f3943a0);
        if (transformationMethodL != null) {
            charSequence = transformationMethodL.getTransformation(charSequence, this);
        }
        this.f3923C = charSequence;
        this.f3942W = null;
        if (this.f3924D) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3961z = charSequence;
        C0606o emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodL = ((AbstractC0149a) emojiTextViewHelper.f8458b.f190l).L(this.f3943a0);
        if (transformationMethodL != null) {
            charSequence = transformationMethodL.getTransformation(charSequence, this);
        }
        this.f3921A = charSequence;
        this.f3941V = null;
        if (this.f3924D) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f3948l;
        if (drawable != null) {
            if (this.f3951o || this.f3952p) {
                Drawable drawableMutate = drawable.mutate();
                this.f3948l = drawableMutate;
                if (this.f3951o) {
                    AbstractC0952a.h(drawableMutate, this.f3949m);
                }
                if (this.f3952p) {
                    AbstractC0952a.i(this.f3948l, this.f3950n);
                }
                if (this.f3948l.isStateful()) {
                    this.f3948l.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f3953q;
        if (drawable != null) {
            if (this.f3956t || this.f3957u) {
                Drawable drawableMutate = drawable.mutate();
                this.f3953q = drawableMutate;
                if (this.f3956t) {
                    AbstractC0952a.h(drawableMutate, this.f3954r);
                }
                if (this.f3957u) {
                    AbstractC0952a.i(this.f3953q, this.f3955s);
                }
                if (this.f3953q.isStateful()) {
                    this.f3953q.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f3961z);
        setTextOffInternal(this.f3922B);
        requestLayout();
    }

    public final void d() {
        if (this.f3946d0 == null && ((AbstractC0149a) this.f3945c0.f8458b.f190l).x() && j.f1713j != null) {
            j jVarA = j.a();
            int iB = jVarA.b();
            if (iB == 3 || iB == 0) {
                h hVar = new h(this);
                this.f3946d0 = hVar;
                jVarA.f(hVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i5;
        int i6 = this.f3934O;
        int i7 = this.f3935P;
        int i8 = this.f3936Q;
        int i9 = this.f3937R;
        int thumbOffset = getThumbOffset() + i6;
        Drawable drawable = this.f3948l;
        Rect rectB = drawable != null ? M.b(drawable) : M.f8293c;
        Drawable drawable2 = this.f3953q;
        Rect rect = this.f3947e0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i10 = rect.left;
            thumbOffset += i10;
            if (rectB != null) {
                int i11 = rectB.left;
                if (i11 > i10) {
                    i6 += i11 - i10;
                }
                int i12 = rectB.top;
                int i13 = rect.top;
                i = i12 > i13 ? (i12 - i13) + i7 : i7;
                int i14 = rectB.right;
                int i15 = rect.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = rectB.bottom;
                int i17 = rect.bottom;
                if (i16 > i17) {
                    i5 = i9 - (i16 - i17);
                }
                this.f3953q.setBounds(i6, i, i8, i5);
            } else {
                i = i7;
            }
            i5 = i9;
            this.f3953q.setBounds(i6, i, i8, i5);
        }
        Drawable drawable3 = this.f3948l;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i18 = thumbOffset - rect.left;
            int i19 = thumbOffset + this.f3933N + rect.right;
            this.f3948l.setBounds(i18, i7, i19, i9);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0952a.f(background, i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f5) {
        super.drawableHotspotChanged(f2, f5);
        Drawable drawable = this.f3948l;
        if (drawable != null) {
            AbstractC0952a.e(drawable, f2, f5);
        }
        Drawable drawable2 = this.f3953q;
        if (drawable2 != null) {
            AbstractC0952a.e(drawable2, f2, f5);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3948l;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3953q;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!Z0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3932L;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3960x : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (Z0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3932L;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3960x : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return D1.b.T(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f3924D;
    }

    public boolean getSplitTrack() {
        return this.y;
    }

    public int getSwitchMinWidth() {
        return this.f3959w;
    }

    public int getSwitchPadding() {
        return this.f3960x;
    }

    public CharSequence getTextOff() {
        return this.f3922B;
    }

    public CharSequence getTextOn() {
        return this.f3961z;
    }

    public Drawable getThumbDrawable() {
        return this.f3948l;
    }

    public final float getThumbPosition() {
        return this.f3931K;
    }

    public int getThumbTextPadding() {
        return this.f3958v;
    }

    public ColorStateList getThumbTintList() {
        return this.f3949m;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3950n;
    }

    public Drawable getTrackDrawable() {
        return this.f3953q;
    }

    public ColorStateList getTrackTintList() {
        return this.f3954r;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3955s;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3948l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3953q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3944b0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3944b0.end();
        this.f3944b0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3920g0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f3953q;
        Rect rect = this.f3947e0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f3935P;
        int i5 = this.f3937R;
        int i6 = i + rect.top;
        int i7 = i5 - rect.bottom;
        Drawable drawable2 = this.f3948l;
        if (drawable != null) {
            if (!this.y || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = M.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f3941V : this.f3942W;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3940U;
            TextPaint textPaint = this.f3939T;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i6 + i7) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f3961z : this.f3922B;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z4, i, i5, i6, i7);
        int iMax2 = 0;
        if (this.f3948l != null) {
            Drawable drawable = this.f3953q;
            Rect rect = this.f3947e0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = M.b(this.f3948l);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (Z0.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f3932L + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f3932L) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i8 = this.M;
            int i9 = height2 - (i8 / 2);
            height = i8 + i9;
            paddingTop = i9;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.M + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.M;
        }
        this.f3934O = paddingLeft;
        this.f3935P = paddingTop;
        this.f3937R = height;
        this.f3936Q = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i5) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f3924D) {
            StaticLayout staticLayout = this.f3941V;
            TextPaint textPaint = this.f3939T;
            if (staticLayout == null) {
                CharSequence charSequence = this.f3921A;
                this.f3941V = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f3942W == null) {
                CharSequence charSequence2 = this.f3923C;
                this.f3942W = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f3948l;
        Rect rect = this.f3947e0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f3948l.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f3948l.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f3933N = Math.max(this.f3924D ? (this.f3958v * 2) + Math.max(this.f3941V.getWidth(), this.f3942W.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f3953q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f3953q.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f3948l;
        if (drawable3 != null) {
            Rect rectB = M.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.f3938S ? Math.max(this.f3959w, (this.f3933N * 2) + iMax + iMax2) : this.f3959w;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f3932L = iMax3;
        this.M = iMax4;
        super.onMeasure(i, i5);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3961z : this.f3922B;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        ((AbstractC0149a) getEmojiTextViewHelper().f8458b.f190l).B(z4);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        super.setChecked(z4);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence string = this.f3961z;
                if (string == null) {
                    string = getResources().getString(com.example.hqp_mobile_app.R.string.abc_capital_on);
                }
                CharSequence charSequence = string;
                Field field = I.f300a;
                new C0020u(com.example.hqp_mobile_app.R.id.tag_state_description, CharSequence.class, 64, 30, 1).f(this, charSequence);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string2 = this.f3922B;
            if (string2 == null) {
                string2 = getResources().getString(com.example.hqp_mobile_app.R.string.abc_capital_off);
            }
            CharSequence charSequence2 = string2;
            Field field2 = I.f300a;
            new C0020u(com.example.hqp_mobile_app.R.id.tag_state_description, CharSequence.class, 64, 30, 1).f(this, charSequence2);
        }
        if (getWindowToken() != null) {
            Field field3 = I.f300a;
            if (isLaidOut()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f3919f0, zIsChecked ? 1.0f : 0.0f);
                this.f3944b0 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                F0.a(this.f3944b0, true);
                this.f3944b0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f3944b0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(D1.b.U(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        ((AbstractC0149a) getEmojiTextViewHelper().f8458b.f190l).C(z4);
        setTextOnInternal(this.f3961z);
        setTextOffInternal(this.f3922B);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z4) {
        this.f3938S = z4;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0149a) getEmojiTextViewHelper().f8458b.f190l).v(inputFilterArr));
    }

    public void setShowText(boolean z4) {
        if (this.f3924D != z4) {
            this.f3924D = z4;
            requestLayout();
            if (z4) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z4) {
        this.y = z4;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f3959w = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f3960x = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f3939T;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f3922B;
        if (string == null) {
            string = getResources().getString(com.example.hqp_mobile_app.R.string.abc_capital_off);
        }
        Field field = I.f300a;
        new C0020u(com.example.hqp_mobile_app.R.id.tag_state_description, CharSequence.class, 64, 30, 1).f(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f3961z;
        if (string == null) {
            string = getResources().getString(com.example.hqp_mobile_app.R.string.abc_capital_on);
        }
        Field field = I.f300a;
        new C0020u(com.example.hqp_mobile_app.R.id.tag_state_description, CharSequence.class, 64, 30, 1).f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3948l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3948l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f3931K = f2;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AbstractC0149a.u(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f3958v = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3949m = colorStateList;
        this.f3951o = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3950n = mode;
        this.f3952p = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3953q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3953q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AbstractC0149a.u(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3954r = colorStateList;
        this.f3956t = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3955s = mode;
        this.f3957u = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3948l || drawable == this.f3953q;
    }
}
