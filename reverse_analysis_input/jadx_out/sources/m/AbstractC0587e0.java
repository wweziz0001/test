package m;

import a.AbstractC0149a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import h.AbstractC0441a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import l.AbstractC0552j;
import l.InterfaceC0559q;

/* JADX INFO: renamed from: m.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0587e0 implements InterfaceC0559q {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Method f8383H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Method f8384I;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Handler f8387C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Rect f8389E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f8390F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final r f8391G;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f8392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ListAdapter f8393m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0597j0 f8394n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8400t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public J.b f8402v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f8403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC0552j f8404x;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8395o = -2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8401u = 0;
    public final RunnableC0581b0 y = new RunnableC0581b0(this, 1);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ViewOnTouchListenerC0585d0 f8405z = new ViewOnTouchListenerC0585d0(this);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0583c0 f8385A = new C0583c0(this);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RunnableC0581b0 f8386B = new RunnableC0581b0(this, 0);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f8388D = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f8383H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f8384I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC0587e0(Context context, int i) {
        int resourceId;
        this.f8392l = context;
        this.f8387C = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0441a.f5891k, i, 0);
        this.f8396p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f8397q = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8398r = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        r rVar = new r(context, null, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0441a.f5895o, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            I.j.c(rVar, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0149a.u(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f8391G = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        J.b bVar = this.f8402v;
        if (bVar == null) {
            this.f8402v = new J.b(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f8393m;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f8393m = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f8402v);
        }
        C0597j0 c0597j0 = this.f8394n;
        if (c0597j0 != null) {
            c0597j0.setAdapter(this.f8393m);
        }
    }

    @Override // l.InterfaceC0559q
    public final void c() {
        int i;
        C0597j0 c0597j0;
        C0597j0 c0597j02 = this.f8394n;
        r rVar = this.f8391G;
        Context context = this.f8392l;
        if (c0597j02 == null) {
            C0597j0 c0597j03 = new C0597j0(context, !this.f8390F);
            c0597j03.setHoverListener((C0599k0) this);
            this.f8394n = c0597j03;
            c0597j03.setAdapter(this.f8393m);
            this.f8394n.setOnItemClickListener(this.f8404x);
            this.f8394n.setFocusable(true);
            this.f8394n.setFocusableInTouchMode(true);
            this.f8394n.setOnItemSelectedListener(new Y(this, 0));
            this.f8394n.setOnScrollListener(this.f8385A);
            rVar.setContentView(this.f8394n);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f8388D;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.f8398r) {
                this.f8397q = -i5;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = Z.a(rVar, this.f8403w, this.f8397q, rVar.getInputMethodMode() == 2);
        int i6 = this.f8395o;
        int iA2 = this.f8394n.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
        int paddingBottom = iA2 + (iA2 > 0 ? this.f8394n.getPaddingBottom() + this.f8394n.getPaddingTop() + i : 0);
        this.f8391G.getInputMethodMode();
        I.j.d(rVar, 1002);
        if (rVar.isShowing()) {
            View view = this.f8403w;
            Field field = D.I.f300a;
            if (view.isAttachedToWindow()) {
                int width = this.f8395o;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f8403w.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f8403w, this.f8396p, this.f8397q, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f8395o;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f8403w.getWidth();
        }
        rVar.setWidth(width2);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f8383H;
            if (method != null) {
                try {
                    method.invoke(rVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0579a0.b(rVar, true);
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.f8405z);
        if (this.f8400t) {
            I.j.c(rVar, this.f8399s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f8384I;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.f8389E);
                } catch (Exception e5) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e5);
                }
            }
        } else {
            AbstractC0579a0.a(rVar, this.f8389E);
        }
        rVar.showAsDropDown(this.f8403w, this.f8396p, this.f8397q, this.f8401u);
        this.f8394n.setSelection(-1);
        if ((!this.f8390F || this.f8394n.isInTouchMode()) && (c0597j0 = this.f8394n) != null) {
            c0597j0.setListSelectionHidden(true);
            c0597j0.requestLayout();
        }
        if (this.f8390F) {
            return;
        }
        this.f8387C.post(this.f8386B);
    }

    @Override // l.InterfaceC0559q
    public final void dismiss() {
        r rVar = this.f8391G;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f8394n = null;
        this.f8387C.removeCallbacks(this.y);
    }

    @Override // l.InterfaceC0559q
    public final boolean g() {
        return this.f8391G.isShowing();
    }

    @Override // l.InterfaceC0559q
    public final ListView h() {
        return this.f8394n;
    }
}
