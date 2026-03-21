package r1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: r1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0765f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f9462x = {R.attr.state_pressed};
    public static final int[] y = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateListDrawable f9464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f9465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateListDrawable f9468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f9469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9470h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f9471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f9472k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f9475n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ValueAnimator f9482u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9483v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final A.b f9484w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9473l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9474m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9476o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9477p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9478q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9479r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f9480s = new int[2];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f9481t = new int[2];

    public C0765f(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i5, int i6) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f9482u = valueAnimatorOfFloat;
        this.f9483v = 0;
        A.b bVar = new A.b(this, 9);
        this.f9484w = bVar;
        C0762c c0762c = new C0762c();
        this.f9464b = stateListDrawable;
        this.f9465c = drawable;
        this.f9468f = stateListDrawable2;
        this.f9469g = drawable2;
        this.f9466d = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f9467e = Math.max(i, drawable.getIntrinsicWidth());
        this.f9470h = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.i = Math.max(i, drawable2.getIntrinsicWidth());
        this.f9463a = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0763d(this));
        valueAnimatorOfFloat.addUpdateListener(new C0764e(this));
        RecyclerView recyclerView2 = this.f9475n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0778s abstractC0778s = recyclerView2.f4745t;
            if (abstractC0778s != null) {
                abstractC0778s.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f4746u;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f9475n;
            recyclerView3.f4747v.remove(this);
            if (recyclerView3.f4748w == this) {
                recyclerView3.f4748w = null;
            }
            ArrayList arrayList2 = this.f9475n.f4728j0;
            if (arrayList2 != null) {
                arrayList2.remove(c0762c);
            }
            this.f9475n.removeCallbacks(bVar);
        }
        this.f9475n = recyclerView;
        if (recyclerView != null) {
            AbstractC0778s abstractC0778s2 = recyclerView.f4745t;
            if (abstractC0778s2 != null) {
                abstractC0778s2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f4746u;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f9475n.f4747v.add(this);
            RecyclerView recyclerView4 = this.f9475n;
            if (recyclerView4.f4728j0 == null) {
                recyclerView4.f4728j0 = new ArrayList();
            }
            recyclerView4.f4728j0.add(c0762c);
        }
    }

    public static int d(float f2, float f5, int[] iArr, int i, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i - i6;
        int i9 = (int) (((f5 - f2) / i7) * i8);
        int i10 = i5 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    public final boolean a(float f2, float f5) {
        return f5 >= ((float) (this.f9474m - this.f9470h)) && f2 >= ((float) (0 - (0 / 2))) && f2 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f2, float f5) {
        RecyclerView recyclerView = this.f9475n;
        Field field = D.I.f300a;
        boolean z4 = recyclerView.getLayoutDirection() == 1;
        int i = this.f9466d;
        if (z4) {
            if (f2 > i / 2) {
                return false;
            }
        } else if (f2 < this.f9473l - i) {
            return false;
        }
        int i5 = 0 / 2;
        return f5 >= ((float) (0 - i5)) && f5 <= ((float) (i5 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i = this.f9478q;
        if (i == 1) {
            boolean zB = b(motionEvent.getX(), motionEvent.getY());
            boolean zA = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zB && !zA) {
                return false;
            }
            if (zA) {
                this.f9479r = 1;
                this.f9472k = (int) motionEvent.getX();
            } else if (zB) {
                this.f9479r = 2;
                this.f9471j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i) {
        A.b bVar = this.f9484w;
        StateListDrawable stateListDrawable = this.f9464b;
        if (i == 2 && this.f9478q != 2) {
            stateListDrawable.setState(f9462x);
            this.f9475n.removeCallbacks(bVar);
        }
        if (i == 0) {
            this.f9475n.invalidate();
        } else {
            f();
        }
        if (this.f9478q == 2 && i != 2) {
            stateListDrawable.setState(y);
            this.f9475n.removeCallbacks(bVar);
            this.f9475n.postDelayed(bVar, 1200);
        } else if (i == 1) {
            this.f9475n.removeCallbacks(bVar);
            this.f9475n.postDelayed(bVar, 1500);
        }
        this.f9478q = i;
    }

    public final void f() {
        int i = this.f9483v;
        ValueAnimator valueAnimator = this.f9482u;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f9483v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
