package m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f8265l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f8266m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8267a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8268b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8269c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8270d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8271e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f8272f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8273g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f8274h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f8275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E f8276k;

    static {
        new ConcurrentHashMap();
    }

    public H(TextView textView) {
        this.i = textView;
        this.f8275j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8276k = new F();
        } else {
            this.f8276k = new E();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f8266m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e5);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e5);
            return obj2;
        }
    }

    public final void a() {
        if (this.f8267a != 0) {
            if (this.f8268b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f8276k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f8265l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.i.getTextSize()) {
                            f(fC, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f8268b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f8272f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i5 = 0;
        int i6 = 1;
        while (i6 <= i) {
            int i7 = (i6 + i) / 2;
            int i8 = this.f8272f[i7];
            TextView textView = this.i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int iB = B.b(textView);
            TextPaint textPaint = this.f8274h;
            if (textPaint == null) {
                this.f8274h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f8274h.set(textView.getPaint());
            this.f8274h.setTextSize(i8);
            StaticLayout staticLayoutA = D.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB, textView, this.f8274h, this.f8276k);
            if ((iB == -1 || (staticLayoutA.getLineCount() <= iB && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i9 = i7 + 1;
                i5 = i6;
                i6 = i9;
            } else {
                i5 = i7 - 1;
                i = i5;
            }
        }
        return this.f8272f[i5];
    }

    public final void f(float f2, int i) {
        Context context = this.f8275j;
        float fApplyDimension = TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zA = C.a(textView);
            if (textView.getLayout() != null) {
                this.f8268b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e5) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e5);
                }
                if (zA) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (this.f8267a == 1) {
            if (!this.f8273g || this.f8272f.length == 0) {
                int iFloor = ((int) Math.floor((this.f8271e - this.f8270d) / this.f8269c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f8269c) + this.f8270d);
                }
                this.f8272f = b(iArr);
            }
            this.f8268b = true;
        } else {
            this.f8268b = false;
        }
        return this.f8268b;
    }

    public final boolean h() {
        boolean z4 = this.f8272f.length > 0;
        this.f8273g = z4;
        if (z4) {
            this.f8267a = 1;
            this.f8270d = r0[0];
            this.f8271e = r0[r1 - 1];
            this.f8269c = -1.0f;
        }
        return z4;
    }

    public final void i(float f2, float f5, float f6) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f5 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f8267a = 1;
        this.f8270d = f2;
        this.f8271e = f5;
        this.f8269c = f6;
        this.f8273g = false;
    }
}
