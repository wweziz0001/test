package m;

import a.AbstractC0149a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import h.AbstractC0441a;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: m.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0623x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f8480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I0 f8481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I0 f8482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I0 f8483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public I0 f8484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public I0 f8485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public I0 f8486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I0 f8487h;
    public final H i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8488j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8489k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f8490l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8491m;

    public C0623x(TextView textView) {
        this.f8480a = textView;
        this.i = new H(textView);
    }

    public static I0 c(Context context, C0604n c0604n, int i) {
        ColorStateList colorStateListF;
        synchronized (c0604n) {
            colorStateListF = c0604n.f8456a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        I0 i02 = new I0();
        i02.f8281d = true;
        i02.f8278a = colorStateListF;
        return i02;
    }

    public final void a(Drawable drawable, I0 i02) {
        if (drawable == null || i02 == null) {
            return;
        }
        C0604n.c(drawable, i02, this.f8480a.getDrawableState());
    }

    public final void b() {
        I0 i02 = this.f8481b;
        TextView textView = this.f8480a;
        if (i02 != null || this.f8482c != null || this.f8483d != null || this.f8484e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f8481b);
            a(compoundDrawables[1], this.f8482c);
            a(compoundDrawables[2], this.f8483d);
            a(compoundDrawables[3], this.f8484e);
        }
        if (this.f8485f == null && this.f8486g == null) {
            return;
        }
        Drawable[] drawableArrA = AbstractC0615t.a(textView);
        a(drawableArrA[0], this.f8485f);
        a(drawableArrA[2], this.f8486g);
    }

    public final void d(AttributeSet attributeSet, int i) {
        C0604n c0604n;
        boolean z4;
        boolean z5;
        String string;
        String string2;
        boolean z6;
        int i5;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        TextView textView = this.f8480a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0604n.f8454b;
        synchronized (C0604n.class) {
            try {
                if (C0604n.f8455c == null) {
                    C0604n.b();
                }
                c0604n = C0604n.f8455c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr = AbstractC0441a.f5887f;
        Z1.s sVarM = Z1.s.M(context, attributeSet, iArr, i);
        TextView textView2 = this.f8480a;
        D.I.c(textView2, textView2.getContext(), iArr, attributeSet, (TypedArray) sVarM.f3086n, i);
        TypedArray typedArray = (TypedArray) sVarM.f3086n;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f8481b = c(context, c0604n, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f8482c = c(context, c0604n, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f8483d = c(context, c0604n, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f8484e = c(context, c0604n, typedArray.getResourceId(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f8485f = c(context, c0604n, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f8486g = c(context, c0604n, typedArray.getResourceId(6, 0));
        }
        sVarM.O();
        boolean z7 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0441a.f5899s;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            Z1.s sVar = new Z1.s(context, typedArrayObtainStyledAttributes);
            if (z7 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z4 = false;
                z5 = false;
            } else {
                z5 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z4 = true;
            }
            f(context, sVar);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i7 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            sVar.O();
        } else {
            z4 = false;
            z5 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        Z1.s sVar2 = new Z1.s(context, typedArrayObtainStyledAttributes2);
        if (z7 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z6 = z5;
        } else {
            z6 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z4 = true;
        }
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i7 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i7 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, sVar2);
        sVar2.O();
        if (!z7 && z4) {
            this.f8480a.setAllCaps(z6);
        }
        Typeface typeface = this.f8490l;
        if (typeface != null) {
            if (this.f8489k == -1) {
                textView.setTypeface(typeface, this.f8488j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0619v.d(textView, string);
        }
        if (string2 != null) {
            AbstractC0617u.b(textView, AbstractC0617u.a(string2));
        }
        int[] iArr3 = AbstractC0441a.f5888g;
        H h2 = this.i;
        Context context2 = h2.f8275j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView3 = h2.i;
        D.I.c(textView3, textView3.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            h2.f8267a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr4[i8] = typedArrayObtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                h2.f8272f = H.b(iArr4);
                h2.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (h2.f8267a == 1) {
            if (!h2.f8273g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                h2.i(dimension2, dimension3, dimension);
            }
            h2.g();
        }
        if (Z0.f8374a && h2.f8267a != 0) {
            int[] iArr5 = h2.f8272f;
            if (iArr5.length > 0) {
                if (AbstractC0619v.a(textView) != -1.0f) {
                    AbstractC0619v.b(textView, Math.round(h2.f8270d), Math.round(h2.f8271e), Math.round(h2.f8269c), 0);
                } else {
                    AbstractC0619v.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableA = resourceId4 != -1 ? c0604n.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? c0604n.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? c0604n.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? c0604n.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? c0604n.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? c0604n.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] drawableArrA = AbstractC0615t.a(textView);
            if (drawableA5 == null) {
                drawableA5 = drawableArrA[0];
            }
            if (drawableA2 == null) {
                drawableA2 = drawableArrA[1];
            }
            if (drawableA6 == null) {
                drawableA6 = drawableArrA[2];
            }
            if (drawableA4 == null) {
                drawableA4 = drawableArrA[3];
            }
            AbstractC0615t.b(textView, drawableA5, drawableA2, drawableA6, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] drawableArrA2 = AbstractC0615t.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[0];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableA4 == null) {
                    drawableA4 = drawableArrA2[3];
                }
                AbstractC0615t.b(textView, drawable, drawableA2, drawable2, drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0149a.t(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            I.k.f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i5 = -1;
            I.k.g(textView, M.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i5 = -1;
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i5);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i5);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, i5);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i5) {
            D1.b.O(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i5) {
            D1.b.P(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i5) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void e(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0441a.f5899s);
        Z1.s sVar = new Z1.s(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f8480a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, sVar);
        if (i5 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0619v.d(textView, string);
        }
        sVar.O();
        Typeface typeface = this.f8490l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f8488j);
        }
    }

    public final void f(Context context, Z1.s sVar) {
        String string;
        int i = this.f8488j;
        TypedArray typedArray = (TypedArray) sVar.f3086n;
        this.f8488j = typedArray.getInt(2, i);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f8489k = i6;
            if (i6 != -1) {
                this.f8488j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f8491m = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    this.f8490l = Typeface.SANS_SERIF;
                    return;
                } else if (i7 == 2) {
                    this.f8490l = Typeface.SERIF;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f8490l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f8490l = null;
        int i8 = typedArray.hasValue(12) ? 12 : 10;
        int i9 = this.f8489k;
        int i10 = this.f8488j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.f8480a);
            Z0.e eVar = new Z0.e();
            eVar.f2838d = this;
            eVar.f2835a = i9;
            eVar.f2836b = i10;
            eVar.f2837c = weakReference;
            try {
                Typeface typefaceE = sVar.E(i8, this.f8488j, eVar);
                if (typefaceE != null) {
                    if (i5 < 28 || this.f8489k == -1) {
                        this.f8490l = typefaceE;
                    } else {
                        this.f8490l = AbstractC0621w.a(Typeface.create(typefaceE, 0), this.f8489k, (this.f8488j & 2) != 0);
                    }
                }
                this.f8491m = this.f8490l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f8490l != null || (string = typedArray.getString(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f8489k == -1) {
            this.f8490l = Typeface.create(string, this.f8488j);
        } else {
            this.f8490l = AbstractC0621w.a(Typeface.create(string, 0), this.f8489k, (this.f8488j & 2) != 0);
        }
    }
}
