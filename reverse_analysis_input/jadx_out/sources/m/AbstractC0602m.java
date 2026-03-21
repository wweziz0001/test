package m;

import a.AbstractC0149a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import h.AbstractC0441a;

/* JADX INFO: renamed from: m.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0602m extends AutoCompleteTextView {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f8442o = {R.attr.popupBackground};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A0.y f8443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0623x f8444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.E f8445n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0602m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.example.hqp_mobile_app.R.attr.autoCompleteTextViewStyle);
        H0.a(context);
        G0.a(this, getContext());
        Z1.s sVarM = Z1.s.M(getContext(), attributeSet, f8442o, com.example.hqp_mobile_app.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) sVarM.f3086n).hasValue(0)) {
            setDropDownBackgroundDrawable(sVarM.D(0));
        }
        sVarM.O();
        A0.y yVar = new A0.y(this);
        this.f8443l = yVar;
        yVar.d(attributeSet, com.example.hqp_mobile_app.R.attr.autoCompleteTextViewStyle);
        C0623x c0623x = new C0623x(this);
        this.f8444m = c0623x;
        c0623x.d(attributeSet, com.example.hqp_mobile_app.R.attr.autoCompleteTextViewStyle);
        c0623x.b();
        androidx.lifecycle.E e5 = new androidx.lifecycle.E(this);
        this.f8445n = e5;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0441a.f5888g, com.example.hqp_mobile_app.R.attr.autoCompleteTextViewStyle, 0);
        try {
            boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e5.N(z4);
            KeyListener keyListener = getKeyListener();
            if (keyListener instanceof NumberKeyListener) {
                return;
            }
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = e5.A(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A0.y yVar = this.f8443l;
        if (yVar != null) {
            yVar.b();
        }
        C0623x c0623x = this.f8444m;
        if (c0623x != null) {
            c0623x.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return D1.b.T(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        I0 i02;
        A0.y yVar = this.f8443l;
        if (yVar == null || (i02 = (I0) yVar.f164e) == null) {
            return null;
        }
        return i02.f8278a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        I0 i02;
        A0.y yVar = this.f8443l;
        if (yVar == null || (i02 = (I0) yVar.f164e) == null) {
            return null;
        }
        return i02.f8279b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        I0 i02 = this.f8444m.f8487h;
        if (i02 != null) {
            return i02.f8278a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        I0 i02 = this.f8444m.f8487h;
        if (i02 != null) {
            return i02.f8279b;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        B0.d dVar = (B0.d) this.f8445n.f4474m;
        if (inputConnectionOnCreateInputConnection == null) {
            dVar.getClass();
            return null;
        }
        Z1.c cVar = (Z1.c) dVar.f190l;
        cVar.getClass();
        if (!(inputConnectionOnCreateInputConnection instanceof S.b)) {
            inputConnectionOnCreateInputConnection = new S.b((AbstractC0602m) cVar.f2996l, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        A0.y yVar = this.f8443l;
        if (yVar != null) {
            yVar.f160a = -1;
            yVar.f(null);
            yVar.b();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A0.y yVar = this.f8443l;
        if (yVar != null) {
            yVar.e(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0623x c0623x = this.f8444m;
        if (c0623x != null) {
            c0623x.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0623x c0623x = this.f8444m;
        if (c0623x != null) {
            c0623x.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(D1.b.U(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0149a.u(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f8445n.N(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8445n.A(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        A0.y yVar = this.f8443l;
        if (yVar != null) {
            yVar.g(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        A0.y yVar = this.f8443l;
        if (yVar != null) {
            yVar.h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0623x c0623x = this.f8444m;
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
        C0623x c0623x = this.f8444m;
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
        C0623x c0623x = this.f8444m;
        if (c0623x != null) {
            c0623x.e(context, i);
        }
    }
}
