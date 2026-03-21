package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import com.example.hqp_mobile_app.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class V0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static V0 f8338v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static V0 f8339w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f8340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CharSequence f8341m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8342n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final U0 f8343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final U0 f8344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public W0 f8347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8348t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8349u;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.U0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.U0] */
    public V0(View view, CharSequence charSequence) {
        final int i = 0;
        this.f8343o = new Runnable(this) { // from class: m.U0

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ V0 f8335m;

            {
                this.f8335m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f8335m.c(false);
                        break;
                    default:
                        this.f8335m.a();
                        break;
                }
            }
        };
        final int i5 = 1;
        this.f8344p = new Runnable(this) { // from class: m.U0

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ V0 f8335m;

            {
                this.f8335m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f8335m.c(false);
                        break;
                    default:
                        this.f8335m.a();
                        break;
                }
            }
        };
        this.f8340l = view;
        this.f8341m = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = D.M.f303a;
        this.f8342n = Build.VERSION.SDK_INT >= 28 ? D.K.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f8349u = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(V0 v02) {
        V0 v03 = f8338v;
        if (v03 != null) {
            v03.f8340l.removeCallbacks(v03.f8343o);
        }
        f8338v = v02;
        if (v02 != null) {
            v02.f8340l.postDelayed(v02.f8343o, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        V0 v02 = f8339w;
        View view = this.f8340l;
        if (v02 == this) {
            f8339w = null;
            W0 w02 = this.f8347s;
            if (w02 != null) {
                View view2 = (View) w02.f8351b;
                if (view2.getParent() != null) {
                    ((WindowManager) w02.f8350a.getSystemService("window")).removeView(view2);
                }
                this.f8347s = null;
                this.f8349u = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f8338v == this) {
            b(null);
        }
        view.removeCallbacks(this.f8344p);
    }

    public final void c(boolean z4) {
        int height;
        int i;
        String str;
        int i5;
        String str2;
        long longPressTimeout;
        long j5;
        long j6;
        Field field = D.I.f300a;
        View view = this.f8340l;
        if (view.isAttachedToWindow()) {
            b(null);
            V0 v02 = f8339w;
            if (v02 != null) {
                v02.a();
            }
            f8339w = this;
            this.f8348t = z4;
            Context context = view.getContext();
            W0 w02 = new W0();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            w02.f8353d = layoutParams;
            w02.f8354e = new Rect();
            w02.f8355f = new int[2];
            w02.f8356g = new int[2];
            w02.f8350a = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            w02.f8351b = viewInflate;
            w02.f8352c = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(W0.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f8347s = w02;
            int width = this.f8345q;
            int i6 = this.f8346r;
            boolean z5 = this.f8348t;
            View view2 = (View) w02.f8351b;
            ViewParent parent = view2.getParent();
            Context context2 = w02.f8350a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) w02.f8352c).setText(this.f8341m);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) w02.f8353d;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i6 + dimensionPixelOffset2;
                i = i6 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z5 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str2 = "window";
            } else {
                Rect rect = (Rect) w02.f8354e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i5 = 0;
                } else {
                    Resources resources = context2.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i5 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) w02.f8356g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) w02.f8355f;
                view.getLocationOnScreen(iArr2);
                int i7 = iArr2[i5] - iArr[i5];
                iArr2[i5] = i7;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams2.x = (i7 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i8 = iArr2[1];
                int i9 = ((i + i8) - dimensionPixelOffset3) - measuredHeight;
                int i10 = i8 + height + dimensionPixelOffset3;
                if (z5) {
                    if (i9 >= 0) {
                        layoutParams2.y = i9;
                    } else {
                        layoutParams2.y = i10;
                    }
                } else if (measuredHeight + i10 <= rect.height()) {
                    layoutParams2.y = i10;
                } else {
                    layoutParams2.y = i9;
                }
                str2 = str;
            }
            ((WindowManager) context2.getSystemService(str2)).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f8348t) {
                j6 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j5 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j5 = 15000;
                }
                j6 = j5 - longPressTimeout;
            }
            U0 u02 = this.f8344p;
            view.removeCallbacks(u02);
            view.postDelayed(u02, j6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            m.W0 r4 = r3.f8347s
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f8348t
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.f8340l
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f8349u = r4
            r3.a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            m.W0 r4 = r3.f8347s
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f8349u
            if (r1 != 0) goto L66
            int r1 = r3.f8345q
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f8342n
            if (r1 > r2) goto L66
            int r1 = r3.f8346r
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f8345q = r4
            r3.f8346r = r5
            r3.f8349u = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.V0.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f8345q = view.getWidth() / 2;
        this.f8346r = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
