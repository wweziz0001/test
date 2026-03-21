package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.example.hqp_mobile_app.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import q.AbstractC0737g;
import q.C0738h;
import q.C0740j;
import u.AbstractC0884a;

/* JADX INFO: renamed from: m.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0603m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static C0603m0 f8447g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f8449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f8450b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f8451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y2.n f8453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f8446f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0601l0 f8448h = new C0601l0(6);

    public static synchronized C0603m0 b() {
        try {
            if (f8447g == null) {
                f8447g = new C0603m0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8447g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0601l0 c0601l0 = f8448h;
        c0601l0.getClass();
        int i5 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c0601l0.d(Integer.valueOf(mode.hashCode() + i5));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawableNewDrawable;
        Object obj;
        if (this.f8451c == null) {
            this.f8451c = new TypedValue();
        }
        TypedValue typedValue = this.f8451c;
        context.getResources().getValue(i, typedValue, true);
        long j5 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C0738h c0738h = (C0738h) this.f8450b.get(context);
            drawableNewDrawable = null;
            if (c0738h != null) {
                int iB = AbstractC0737g.b(c0738h.f9228m, c0738h.f9230o, j5);
                if (iB < 0 || (obj = c0738h.f9229n[iB]) == C0738h.f9226p) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawableNewDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int iB2 = AbstractC0737g.b(c0738h.f9228m, c0738h.f9230o, j5);
                        if (iB2 >= 0) {
                            Object[] objArr = c0738h.f9229n;
                            Object obj2 = objArr[iB2];
                            Object obj3 = C0738h.f9226p;
                            if (obj2 != obj3) {
                                objArr[iB2] = obj3;
                                c0738h.f9227l = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableG = null;
        if (this.f8453e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableG = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableG = y2.n.g(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableG = y2.n.g(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableG = y2.n.g(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableG != null) {
            layerDrawableG.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawableG.getConstantState();
                    if (constantState2 != null) {
                        C0738h c0738h2 = (C0738h) this.f8450b.get(context);
                        if (c0738h2 == null) {
                            c0738h2 = new C0738h();
                            this.f8450b.put(context, c0738h2);
                        }
                        c0738h2.b(j5, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawableG;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i);
    }

    public final synchronized Drawable d(Context context, int i) {
        Drawable drawableA;
        try {
            if (!this.f8452d) {
                this.f8452d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof C1.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f8452d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = AbstractC0884a.b(context, i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, drawableA);
            }
            if (drawableA != null) {
                M.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        C0740j c0740j;
        Object obj;
        WeakHashMap weakHashMap = this.f8449a;
        ColorStateList colorStateListH = null;
        if (weakHashMap == null || (c0740j = (C0740j) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int iA = AbstractC0737g.a(c0740j.f9241n, i, c0740j.f9239l);
            if (iA < 0 || (obj = c0740j.f9240m[iA]) == C0740j.f9238o) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            y2.n nVar = this.f8453e;
            if (nVar != null) {
                colorStateListH = nVar.h(context, i);
            }
            if (colorStateListH != null) {
                if (this.f8449a == null) {
                    this.f8449a = new WeakHashMap();
                }
                C0740j c0740j2 = (C0740j) this.f8449a.get(context);
                if (c0740j2 == null) {
                    c0740j2 = new C0740j();
                    this.f8449a.put(context, c0740j2);
                }
                c0740j2.a(i, colorStateListH);
            }
            colorStateList = colorStateListH;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r9, int r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0603m0.g(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
