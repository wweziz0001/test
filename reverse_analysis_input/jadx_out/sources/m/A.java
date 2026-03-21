package m;

import a.AbstractC0149a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b3.AbstractC0307a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class A extends TextView {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A0.y f8224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0623x f8225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z1.l f8226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0606o f8227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.lifecycle.E f8229q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Future f8230r;

    public A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0606o getEmojiTextViewHelper() {
        if (this.f8227o == null) {
            this.f8227o = new C0606o(this);
        }
        return this.f8227o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A0.y yVar = this.f8224l;
        if (yVar != null) {
            yVar.b();
        }
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            c0623x.b();
        }
    }

    public final void f() {
        Future future = this.f8230r;
        if (future == null) {
            return;
        }
        try {
            this.f8230r = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            D1.b.F(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (Z0.f8374a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            return Math.round(c0623x.i.f8271e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (Z0.f8374a) {
            return super.getAutoSizeMinTextSize();
        }
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            return Math.round(c0623x.i.f8270d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (Z0.f8374a) {
            return super.getAutoSizeStepGranularity();
        }
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            return Math.round(c0623x.i.f8269c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (Z0.f8374a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0623x c0623x = this.f8225m;
        return c0623x != null ? c0623x.i.f8272f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (Z0.f8374a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            return c0623x.i.f8267a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return D1.b.T(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0625y getSuperCaller() {
        if (this.f8229q == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                this.f8229q = new C0627z(this);
            } else if (i >= 26) {
                this.f8229q = new androidx.lifecycle.E(this, 18);
            }
        }
        return this.f8229q;
    }

    public ColorStateList getSupportBackgroundTintList() {
        I0 i02;
        A0.y yVar = this.f8224l;
        if (yVar == null || (i02 = (I0) yVar.f164e) == null) {
            return null;
        }
        return i02.f8278a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        I0 i02;
        A0.y yVar = this.f8224l;
        if (yVar == null || (i02 = (I0) yVar.f164e) == null) {
            return null;
        }
        return i02.f8279b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        I0 i02 = this.f8225m.f8487h;
        if (i02 != null) {
            return i02.f8278a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        I0 i02 = this.f8225m.f8487h;
        if (i02 != null) {
            return i02.f8279b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        Z1.l lVar;
        if (Build.VERSION.SDK_INT >= 28 || (lVar = this.f8226n) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) lVar.f3021m;
        return textClassifier == null ? AbstractC0613s.a((A) lVar.f3020l) : textClassifier;
    }

    public B.c getTextMetricsParamsCompat() {
        return D1.b.F(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8225m.getClass();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30 && inputConnectionOnCreateInputConnection != null) {
            CharSequence text = getText();
            if (i5 >= 30) {
                H.b.a(editorInfo, text);
            } else {
                text.getClass();
                if (i5 >= 30) {
                    H.b.a(editorInfo, text);
                } else {
                    int i6 = editorInfo.initialSelStart;
                    int i7 = editorInfo.initialSelEnd;
                    int i8 = i6 > i7 ? i7 : i6;
                    if (i6 <= i7) {
                        i6 = i7;
                    }
                    int length = text.length();
                    if (i8 < 0 || i6 > length || (i = editorInfo.inputType & 4095) == 129 || i == 225 || i == 18) {
                        AbstractC0149a.D(editorInfo, null, 0, 0);
                    } else if (length <= 2048) {
                        AbstractC0149a.D(editorInfo, text, i8, i6);
                    } else {
                        int i9 = i6 - i8;
                        int i10 = i9 > 1024 ? 0 : i9;
                        int i11 = 2048 - i10;
                        int iMin = Math.min(text.length() - i6, i11 - Math.min(i8, (int) (((double) i11) * 0.8d)));
                        int iMin2 = Math.min(i8, i11 - iMin);
                        int i12 = i8 - iMin2;
                        if (Character.isLowSurrogate(text.charAt(i12))) {
                            i12++;
                            iMin2--;
                        }
                        if (Character.isHighSurrogate(text.charAt((i6 + iMin) - 1))) {
                            iMin--;
                        }
                        int i13 = iMin2 + i10;
                        AbstractC0149a.D(editorInfo, i10 != i9 ? TextUtils.concat(text.subSequence(i12, i12 + iMin2), text.subSequence(i6, iMin + i6)) : text.subSequence(i12, i13 + iMin + i12), iMin2, i13);
                    }
                }
            }
        }
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        C0623x c0623x = this.f8225m;
        if (c0623x == null || Z0.f8374a) {
            return;
        }
        c0623x.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i5) {
        f();
        super.onMeasure(i, i5);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        super.onTextChanged(charSequence, i, i5, i6);
        C0623x c0623x = this.f8225m;
        if (c0623x == null || Z0.f8374a) {
            return;
        }
        H h2 = c0623x.i;
        if (h2.f8267a != 0) {
            h2.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        ((AbstractC0149a) getEmojiTextViewHelper().f8458b.f190l).B(z4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i5, int i6, int i7) {
        if (Z0.f8374a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i5, i6, i7);
            return;
        }
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            H h2 = c0623x.i;
            DisplayMetrics displayMetrics = h2.f8275j.getResources().getDisplayMetrics();
            h2.i(TypedValue.applyDimension(i7, i, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (h2.g()) {
                h2.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (Z0.f8374a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            H h2 = c0623x.i;
            h2.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h2.f8275j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArrCopyOf[i5] = Math.round(TypedValue.applyDimension(i, iArr[i5], displayMetrics));
                    }
                }
                h2.f8272f = H.b(iArrCopyOf);
                if (!h2.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                h2.f8273g = false;
            }
            if (h2.g()) {
                h2.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (Z0.f8374a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            H h2 = c0623x.i;
            if (i == 0) {
                h2.f8267a = 0;
                h2.f8270d = -1.0f;
                h2.f8271e = -1.0f;
                h2.f8269c = -1.0f;
                h2.f8272f = new int[0];
                h2.f8268b = false;
                return;
            }
            if (i != 1) {
                h2.getClass();
                throw new IllegalArgumentException(AbstractC0307a.i("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = h2.f8275j.getResources().getDisplayMetrics();
            h2.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (h2.g()) {
                h2.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        A0.y yVar = this.f8224l;
        if (yVar != null) {
            yVar.f160a = -1;
            yVar.f(null);
            yVar.b();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A0.y yVar = this.f8224l;
        if (yVar != null) {
            yVar.e(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            c0623x.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            c0623x.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            c0623x.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            c0623x.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(D1.b.U(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        ((AbstractC0149a) getEmojiTextViewHelper().f8458b.f190l).C(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0149a) getEmojiTextViewHelper().f8458b.f190l).v(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().p(i);
        } else {
            D1.b.O(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i);
        } else {
            D1.b.P(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i - r0, 1.0f);
        }
    }

    public void setPrecomputedText(B.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        D1.b.F(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        A0.y yVar = this.f8224l;
        if (yVar != null) {
            yVar.g(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        A0.y yVar = this.f8224l;
        if (yVar != null) {
            yVar.h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0623x c0623x = this.f8225m;
        if (c0623x.f8487h == null) {
            c0623x.f8487h = new I0();
        }
        I0 i02 = c0623x.f8487h;
        i02.f8278a = colorStateList;
        i02.f8281d = colorStateList != null;
        c0623x.f8481b = i02;
        c0623x.f8482c = i02;
        c0623x.f8483d = i02;
        c0623x.f8484e = i02;
        c0623x.f8485f = i02;
        c0623x.f8486g = i02;
        c0623x.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0623x c0623x = this.f8225m;
        if (c0623x.f8487h == null) {
            c0623x.f8487h = new I0();
        }
        I0 i02 = c0623x.f8487h;
        i02.f8279b = mode;
        i02.f8280c = mode != null;
        c0623x.f8481b = i02;
        c0623x.f8482c = i02;
        c0623x.f8483d = i02;
        c0623x.f8484e = i02;
        c0623x.f8485f = i02;
        c0623x.f8486g = i02;
        c0623x.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            c0623x.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        Z1.l lVar;
        if (Build.VERSION.SDK_INT >= 28 || (lVar = this.f8226n) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            lVar.f3021m = textClassifier;
        }
    }

    public void setTextFuture(Future<B.d> future) {
        this.f8230r = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(B.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f178b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(cVar.f177a);
        I.k.e(this, cVar.f179c);
        I.k.h(this, cVar.f180d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z4 = Z0.f8374a;
        if (z4) {
            super.setTextSize(i, f2);
            return;
        }
        C0623x c0623x = this.f8225m;
        if (c0623x == null || z4) {
            return;
        }
        H h2 = c0623x.i;
        if (h2.f8267a != 0) {
            return;
        }
        h2.f(f2, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f8228p) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            Z1.f fVar = w.f.f10407a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f8228p = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f8228p = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        H0.a(context);
        this.f8228p = false;
        this.f8229q = null;
        G0.a(this, getContext());
        A0.y yVar = new A0.y(this);
        this.f8224l = yVar;
        yVar.d(attributeSet, i);
        C0623x c0623x = new C0623x(this);
        this.f8225m = c0623x;
        c0623x.d(attributeSet, i);
        c0623x.b();
        Z1.l lVar = new Z1.l();
        lVar.f3020l = this;
        this.f8226n = lVar;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0149a.u(context, i) : null, i5 != 0 ? AbstractC0149a.u(context, i5) : null, i6 != 0 ? AbstractC0149a.u(context, i6) : null, i7 != 0 ? AbstractC0149a.u(context, i7) : null);
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            c0623x.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0149a.u(context, i) : null, i5 != 0 ? AbstractC0149a.u(context, i5) : null, i6 != 0 ? AbstractC0149a.u(context, i6) : null, i7 != 0 ? AbstractC0149a.u(context, i7) : null);
        C0623x c0623x = this.f8225m;
        if (c0623x != null) {
            c0623x.b();
        }
    }
}
