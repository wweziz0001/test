package androidx.recyclerview.widget;

import A.j;
import D.AbstractC0025z;
import D.B;
import D.C0012l;
import D.I;
import D.J;
import D.M;
import D0.e;
import N3.h;
import Z1.m;
import Z1.s;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b3.AbstractC0307a;
import io.flutter.plugin.platform.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import m3.C0675i;
import p1.b;
import q1.AbstractC0742a;
import r1.AbstractC0751B;
import r1.AbstractC0759J;
import r1.AbstractC0773n;
import r1.AbstractC0776q;
import r1.AbstractC0778s;
import r1.AbstractC0780u;
import r1.C0750A;
import r1.C0754E;
import r1.C0761b;
import r1.C0765f;
import r1.C0775p;
import r1.C0779t;
import r1.InterfaceC0774o;
import r1.InterpolatorC0772m;
import r1.RunnableC0752C;
import r1.RunnableC0767h;
import r1.v;
import r1.w;
import r1.x;
import r1.y;
import r1.z;
import z.d;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int[] f4693s0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int[] f4694t0 = {R.attr.clipToPadding};

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Class[] f4695u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final InterpolatorC0772m f4696v0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4697A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f4698B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f4699C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4700D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final AccessibilityManager f4701E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f4702F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f4703G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f4704H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f4705I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C0775p f4706J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public EdgeEffect f4707K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public EdgeEffect f4708L;
    public EdgeEffect M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public EdgeEffect f4709N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public AbstractC0776q f4710O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f4711P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f4712Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public VelocityTracker f4713R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f4714S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f4715T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f4716U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f4717V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f4718W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f4719a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f4720b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final float f4721c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final float f4722d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f4723e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final RunnableC0752C f4724f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public RunnableC0767h f4725g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final e f4726h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final C0750A f4727i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ArrayList f4728j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final b f4729k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f4730l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public C0754E f4731l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z f4732m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public C0012l f4733m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f4734n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final int[] f4735n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f4736o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final int[] f4737o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f4738p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int[] f4739p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4740q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList f4741q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f4742r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final A.b f4743r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f4744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC0778s f4745t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f4746u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f4747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0765f f4748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4749x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f4750z;

    static {
        Class cls = Integer.TYPE;
        f4695u0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4696v0 = new InterpolatorC0772m();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        float fA;
        char c5;
        int i;
        TypedArray typedArray;
        char c6;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, 0);
        int i5 = 7;
        this.f4730l = new c(this);
        this.f4738p = new b();
        this.f4742r = new Rect();
        this.f4744s = new Rect();
        new RectF();
        this.f4746u = new ArrayList();
        this.f4747v = new ArrayList();
        this.f4697A = 0;
        this.f4702F = false;
        this.f4703G = false;
        this.f4704H = 0;
        this.f4705I = 0;
        this.f4706J = new C0775p();
        C0761b c0761b = new C0761b();
        c0761b.f9505a = null;
        c0761b.f9506b = new ArrayList();
        c0761b.f9507c = 250L;
        c0761b.f9508d = 250L;
        c0761b.f9449e = new ArrayList();
        c0761b.f9450f = new ArrayList();
        c0761b.f9451g = new ArrayList();
        c0761b.f9452h = new ArrayList();
        c0761b.i = new ArrayList();
        c0761b.f9453j = new ArrayList();
        c0761b.f9454k = new ArrayList();
        c0761b.f9455l = new ArrayList();
        c0761b.f9456m = new ArrayList();
        c0761b.f9457n = new ArrayList();
        c0761b.f9458o = new ArrayList();
        this.f4710O = c0761b;
        this.f4711P = 0;
        this.f4712Q = -1;
        this.f4721c0 = Float.MIN_VALUE;
        this.f4722d0 = Float.MIN_VALUE;
        boolean z4 = true;
        this.f4723e0 = true;
        this.f4724f0 = new RunnableC0752C(this);
        this.f4726h0 = new e();
        C0750A c0750a = new C0750A();
        c0750a.f9419a = 0;
        c0750a.f9420b = false;
        c0750a.f9421c = false;
        c0750a.f9422d = false;
        c0750a.f9423e = false;
        this.f4727i0 = c0750a;
        b bVar = new b(8);
        this.f4729k0 = bVar;
        this.f4735n0 = new int[2];
        this.f4737o0 = new int[2];
        this.f4739p0 = new int[2];
        this.f4741q0 = new ArrayList();
        this.f4743r0 = new A.b(this, 10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4694t0, 0, 0);
            this.f4740q = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f4740q = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4718W = viewConfiguration.getScaledTouchSlop();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            Method method = M.f303a;
            fA = J.a(viewConfiguration);
        } else {
            fA = M.a(viewConfiguration, context);
        }
        this.f4721c0 = fA;
        this.f4722d0 = i6 >= 26 ? J.b(viewConfiguration) : M.a(viewConfiguration, context);
        this.f4719a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4720b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4710O.f9505a = bVar;
        this.f4734n = new m(new b(this, i5));
        this.f4736o = new s(new C0675i(this, 19));
        Field field = I.f300a;
        if ((i6 >= 26 ? B.c(this) : 0) == 0 && i6 >= 26) {
            B.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f4701E = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0754E(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0742a.f9371a, 0, 0);
            String string = typedArrayObtainStyledAttributes2.getString(7);
            if (typedArrayObtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(5);
                Drawable drawable = typedArrayObtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = typedArrayObtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
                Resources resources = getContext().getResources();
                c5 = 3;
                i = 4;
                typedArray = typedArrayObtainStyledAttributes2;
                c6 = 2;
                new C0765f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.example.hqp_mobile_app.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.example.hqp_mobile_app.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.example.hqp_mobile_app.R.dimen.fastscroll_margin));
            } else {
                c5 = 3;
                i = 4;
                typedArray = typedArrayObtainStyledAttributes2;
                c6 = 2;
            }
            typedArray.recycle();
            if (string != null) {
                String strTrim = string.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.charAt(0) == '.') {
                        strTrim = context.getPackageName() + strTrim;
                    } else if (!strTrim.contains(".")) {
                        strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                    }
                    String str = strTrim;
                    try {
                        Class<? extends U> clsAsSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(str).asSubclass(AbstractC0778s.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(f4695u0);
                            objArr = new Object[i];
                            objArr[0] = context;
                            objArr[1] = attributeSet;
                            objArr[c6] = 0;
                            objArr[c5] = 0;
                        } catch (NoSuchMethodException e5) {
                            objArr = null;
                            try {
                                constructor = clsAsSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e6) {
                                e6.initCause(e5);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e6);
                            }
                        }
                        Object[] objArr2 = objArr;
                        constructor.setAccessible(true);
                        setLayoutManager((AbstractC0778s) constructor.newInstance(objArr2));
                    } catch (ClassCastException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e7);
                    } catch (ClassNotFoundException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e8);
                    } catch (IllegalAccessException e9) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e9);
                    } catch (InstantiationException e10) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e10);
                    } catch (InvocationTargetException e11) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e11);
                    }
                }
            }
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f4693s0, 0, 0);
            z4 = typedArrayObtainStyledAttributes3.getBoolean(0, true);
            typedArrayObtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z4);
    }

    private C0012l getScrollingChildHelper() {
        if (this.f4733m0 == null) {
            this.f4733m0 = new C0012l(this);
        }
        return this.f4733m0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((C0779t) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i5) {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null) {
            abstractC0778s.getClass();
        }
        super.addFocusables(arrayList, i, i5);
    }

    public final void b(String str) {
        if (this.f4704H > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f4705I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i, int i5) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f4707K;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f4707K.onRelease();
            zIsFinished = this.f4707K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4708L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f4708L.onRelease();
            zIsFinished |= this.f4708L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4709N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f4709N.onRelease();
            zIsFinished |= this.f4709N.isFinished();
        }
        if (zIsFinished) {
            Field field = I.f300a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0779t) && this.f4745t.d((C0779t) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null && abstractC0778s.b()) {
            return this.f4745t.f(this.f4727i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null && abstractC0778s.b()) {
            this.f4745t.g(this.f4727i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null && abstractC0778s.b()) {
            return this.f4745t.h(this.f4727i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null && abstractC0778s.c()) {
            return this.f4745t.i(this.f4727i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null && abstractC0778s.c()) {
            this.f4745t.j(this.f4727i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null && abstractC0778s.c()) {
            return this.f4745t.k(this.f4727i0);
        }
        return 0;
    }

    public final void d() {
        m mVar = this.f4734n;
        if (!this.f4750z || this.f4702F) {
            int i = d.f11118a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (((ArrayList) mVar.f3025n).size() > 0) {
            mVar.getClass();
            if (((ArrayList) mVar.f3025n).size() > 0) {
                int i5 = d.f11118a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f5, boolean z4) {
        return getScrollingChildHelper().a(f2, f5, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f5) {
        return getScrollingChildHelper().b(f2, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().d(i, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        ArrayList arrayList = this.f4746u;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i = 0; i < size; i++) {
            C0765f c0765f = (C0765f) arrayList.get(i);
            if (c0765f.f9473l != c0765f.f9475n.getWidth() || c0765f.f9474m != c0765f.f9475n.getHeight()) {
                c0765f.f9473l = c0765f.f9475n.getWidth();
                c0765f.f9474m = c0765f.f9475n.getHeight();
                c0765f.e(0);
            } else if (c0765f.f9483v != 0) {
                if (c0765f.f9476o) {
                    int i5 = c0765f.f9473l;
                    int i6 = c0765f.f9466d;
                    int i7 = i5 - i6;
                    int i8 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0765f.f9464b;
                    stateListDrawable.setBounds(0, 0, i6, 0);
                    int i9 = c0765f.f9474m;
                    Drawable drawable = c0765f.f9465c;
                    drawable.setBounds(0, 0, c0765f.f9467e, i9);
                    RecyclerView recyclerView = c0765f.f9475n;
                    Field field = I.f300a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i6, i8);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i6, -i8);
                    } else {
                        canvas.translate(i7, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i8);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i7, -i8);
                    }
                }
                if (c0765f.f9477p) {
                    int i10 = c0765f.f9474m;
                    int i11 = c0765f.f9470h;
                    int i12 = i10 - i11;
                    StateListDrawable stateListDrawable2 = c0765f.f9468f;
                    stateListDrawable2.setBounds(0, 0, 0, i11);
                    int i13 = c0765f.f9473l;
                    Drawable drawable2 = c0765f.f9469g;
                    drawable2.setBounds(0, 0, i13, c0765f.i);
                    canvas.translate(0.0f, i12);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r9, -i12);
                }
            }
        }
        EdgeEffect edgeEffect = this.f4707K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f4740q ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4707K;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f4708L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f4740q) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4708L;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4740q ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.M;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f4709N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4740q) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4709N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z4 |= z5;
            canvas.restoreToCount(iSave4);
        }
        if ((z4 || this.f4710O == null || arrayList.size() <= 0 || !this.f4710O.b()) ? z4 : true) {
            Field field2 = I.f300a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        return super.drawChild(canvas, view, j5);
    }

    public final void e(int i, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = I.f300a;
        setMeasuredDimension(AbstractC0778s.e(i, paddingRight, getMinimumWidth()), AbstractC0778s.e(i5, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i, int i5, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i5, i6, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        int i5;
        this.f4745t.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (viewFindNextFocus != null && !viewFindNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            o(viewFindNextFocus, null);
            return view;
        }
        if (viewFindNextFocus != null && viewFindNextFocus != this && i(viewFindNextFocus) != null) {
            if (view == null || i(view) == null) {
                return viewFindNextFocus;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f4742r;
            byte b4 = 0;
            rect.set(0, 0, width, height);
            int width2 = viewFindNextFocus.getWidth();
            int height2 = viewFindNextFocus.getHeight();
            Rect rect2 = this.f4744s;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect2);
            RecyclerView recyclerView = this.f4745t.f9512b;
            Field field = I.f300a;
            int i6 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                i5 = 1;
            } else {
                int i9 = rect.right;
                int i10 = rect2.right;
                i5 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
            }
            int i11 = rect.top;
            int i12 = rect2.top;
            if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                b4 = 1;
            } else {
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if ((i13 > i14 || i11 >= i14) && i11 > i12) {
                    b4 = -1;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i + h());
                                }
                                if (b4 > 0) {
                                    return viewFindNextFocus;
                                }
                            } else if (i5 > 0) {
                                return viewFindNextFocus;
                            }
                        } else if (b4 < 0) {
                            return viewFindNextFocus;
                        }
                    } else if (i5 < 0) {
                        return viewFindNextFocus;
                    }
                } else {
                    if (b4 > 0) {
                        return viewFindNextFocus;
                    }
                    if (b4 == 0 && i5 * i6 >= 0) {
                        return viewFindNextFocus;
                    }
                }
            } else {
                if (b4 < 0) {
                    return viewFindNextFocus;
                }
                if (b4 == 0 && i5 * i6 <= 0) {
                    return viewFindNextFocus;
                }
            }
        }
        return super.focusSearch(view, i);
    }

    public final boolean g(int[] iArr, int i) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null) {
            return abstractC0778s.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null) {
            return abstractC0778s.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public AbstractC0773n getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s == null) {
            return super.getBaseline();
        }
        abstractC0778s.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i5) {
        return super.getChildDrawingOrder(i, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4740q;
    }

    public C0754E getCompatAccessibilityDelegate() {
        return this.f4731l0;
    }

    public C0775p getEdgeEffectFactory() {
        return this.f4706J;
    }

    public AbstractC0776q getItemAnimator() {
        return this.f4710O;
    }

    public int getItemDecorationCount() {
        return this.f4746u.size();
    }

    public AbstractC0778s getLayoutManager() {
        return this.f4745t;
    }

    public int getMaxFlingVelocity() {
        return this.f4720b0;
    }

    public int getMinFlingVelocity() {
        return this.f4719a0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0780u getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4723e0;
    }

    public x getRecycledViewPool() {
        c cVar = this.f4730l;
        if (((x) cVar.f6749e) == null) {
            x xVar = new x();
            xVar.f9520a = new SparseArray();
            xVar.f9521b = 0;
            cVar.f6749e = xVar;
        }
        return (x) cVar.f6749e;
    }

    public int getScrollState() {
        return this.f4711P;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f4745t + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final View i(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f4749x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f357d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f4750z || this.f4702F || ((ArrayList) this.f4734n.f3025n).size() > 0;
    }

    public final void m() {
        int iK = this.f4736o.K();
        for (int i = 0; i < iK; i++) {
            ((C0779t) this.f4736o.J(i).getLayoutParams()).f9519b = true;
        }
        ArrayList arrayList = (ArrayList) this.f4730l.f6748d;
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC0307a.q(arrayList.get(0));
        throw null;
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4712Q) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4712Q = motionEvent.getPointerId(i);
            int x4 = (int) (motionEvent.getX(i) + 0.5f);
            this.f4716U = x4;
            this.f4714S = x4;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f4717V = y;
            this.f4715T = y;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f4742r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0779t) {
            C0779t c0779t = (C0779t) layoutParams;
            if (!c0779t.f9519b) {
                int i = rect.left;
                Rect rect2 = c0779t.f9518a;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f4745t.G(this, view, this.f4742r, !this.f4750z, view2 == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f4704H = r0
            r1 = 1
            r5.f4749x = r1
            boolean r2 = r5.f4750z
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            r0 = r1
        L14:
            r5.f4750z = r0
            r1.s r0 = r5.f4745t
            if (r0 == 0) goto L1c
            r0.f9515e = r1
        L1c:
            java.lang.ThreadLocal r0 = r1.RunnableC0767h.f9490p
            java.lang.Object r1 = r0.get()
            r1.h r1 = (r1.RunnableC0767h) r1
            r5.f4725g0 = r1
            if (r1 != 0) goto L64
            r1.h r1 = new r1.h
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9492l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9495o = r2
            r5.f4725g0 = r1
            java.lang.reflect.Field r1 = D.I.f300a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L56
            if (r1 == 0) goto L56
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L56
            goto L58
        L56:
            r1 = 1114636288(0x42700000, float:60.0)
        L58:
            r1.h r2 = r5.f4725g0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f9494n = r3
            r0.set(r2)
        L64:
            r1.h r0 = r5.f4725g0
            java.util.ArrayList r0 = r0.f9492l
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        AbstractC0776q abstractC0776q = this.f4710O;
        if (abstractC0776q != null) {
            abstractC0776q.a();
        }
        setScrollState(0);
        RunnableC0752C runnableC0752C = this.f4724f0;
        runnableC0752C.f9430r.removeCallbacks(runnableC0752C);
        runnableC0752C.f9426n.abortAnimation();
        this.f4749x = false;
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null) {
            abstractC0778s.f9515e = false;
            abstractC0778s.z(this);
        }
        this.f4741q0.clear();
        removeCallbacks(this.f4743r0);
        this.f4738p.getClass();
        do {
            j jVar = AbstractC0759J.f9448a;
            int i = jVar.f26l;
            obj = null;
            if (i > 0) {
                int i5 = i - 1;
                Object[] objArr = (Object[]) jVar.f27m;
                Object obj2 = objArr[i5];
                h.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i5] = null;
                jVar.f26l--;
                obj = obj2;
            }
        } while (obj != null);
        RunnableC0767h runnableC0767h = this.f4725g0;
        if (runnableC0767h != null) {
            runnableC0767h.f9492l.remove(this);
            this.f4725g0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f4746u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0765f) arrayList.get(i)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r1.s r0 = r5.f4745t
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4698B
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            r1.s r0 = r5.f4745t
            boolean r0 = r0.c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            r1.s r3 = r5.f4745t
            boolean r3 = r3.b()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            r1.s r3 = r5.f4745t
            boolean r3 = r3.c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            r1.s r3 = r5.f4745t
            boolean r3 = r3.b()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f4721c0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f4722d0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.q(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.f4698B) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f4748w = null;
        }
        ArrayList arrayList = this.f4747v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0765f c0765f = (C0765f) arrayList.get(i);
            if (c0765f.c(motionEvent) && action != 3) {
                this.f4748w = c0765f;
                p();
                setScrollState(0);
                return true;
            }
        }
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s == null) {
            return false;
        }
        boolean zB = abstractC0778s.b();
        boolean zC = this.f4745t.c();
        if (this.f4713R == null) {
            this.f4713R = VelocityTracker.obtain();
        }
        this.f4713R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4699C) {
                this.f4699C = false;
            }
            this.f4712Q = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.f4716U = x4;
            this.f4714S = x4;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f4717V = y;
            this.f4715T = y;
            if (this.f4711P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f4739p0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i5 = zB;
            if (zC) {
                i5 = (zB ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i5, 0);
        } else if (actionMasked == 1) {
            this.f4713R.clear();
            s(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f4712Q);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4712Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x5 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y4 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f4711P != 1) {
                int i6 = x5 - this.f4714S;
                int i7 = y4 - this.f4715T;
                if (!zB || Math.abs(i6) <= this.f4718W) {
                    z4 = false;
                } else {
                    this.f4716U = x5;
                    z4 = true;
                }
                if (zC && Math.abs(i7) > this.f4718W) {
                    this.f4717V = y4;
                    z4 = true;
                }
                if (z4) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f4712Q = motionEvent.getPointerId(actionIndex);
            int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4716U = x6;
            this.f4714S = x6;
            int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4717V = y5;
            this.f4715T = y5;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        return this.f4711P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        int i8 = d.f11118a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f4750z = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s == null) {
            e(i, i5);
            return;
        }
        if (abstractC0778s.y()) {
            View.MeasureSpec.getMode(i);
            View.MeasureSpec.getMode(i5);
            this.f4745t.f9512b.e(i, i5);
        } else {
            if (this.y) {
                this.f4745t.f9512b.e(i, i5);
                return;
            }
            C0750A c0750a = this.f4727i0;
            if (c0750a.f9423e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            c0750a.getClass();
            this.f4697A++;
            this.f4745t.f9512b.e(i, i5);
            if (this.f4697A < 1) {
                this.f4697A = 1;
            }
            this.f4697A--;
            c0750a.f9421c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.f4704H > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f4732m = zVar;
        super.onRestoreInstanceState(zVar.f1207l);
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s == null || (parcelable2 = this.f4732m.f9522n) == null) {
            return;
        }
        abstractC0778s.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f4732m;
        if (zVar2 != null) {
            zVar.f9522n = zVar2.f9522n;
        } else {
            AbstractC0778s abstractC0778s = this.f4745t;
            if (abstractC0778s != null) {
                zVar.f9522n = abstractC0778s.C();
            } else {
                zVar.f9522n = null;
            }
        }
        return zVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i5, int i6, int i7) {
        super.onSizeChanged(i, i5, i6, i7);
        if (i == i6 && i5 == i7) {
            return;
        }
        this.f4709N = null;
        this.f4708L = null;
        this.M = null;
        this.f4707K = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f4713R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        s(0);
        EdgeEffect edgeEffect = this.f4707K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f4707K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4708L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f4708L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4709N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f4709N.isFinished();
        }
        if (zIsFinished) {
            Field field = I.f300a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r11, int r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q(int, int, android.view.MotionEvent):void");
    }

    public final void r(int i, int i5) {
        int iRound;
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4698B) {
            return;
        }
        int i6 = !abstractC0778s.b() ? 0 : i;
        int i7 = !this.f4745t.c() ? 0 : i5;
        if (i6 == 0 && i7 == 0) {
            return;
        }
        RunnableC0752C runnableC0752C = this.f4724f0;
        runnableC0752C.getClass();
        int iAbs = Math.abs(i6);
        int iAbs2 = Math.abs(i7);
        boolean z4 = iAbs > iAbs2;
        int iSqrt = (int) Math.sqrt(0);
        int iSqrt2 = (int) Math.sqrt((i7 * i7) + (i6 * i6));
        RecyclerView recyclerView = runnableC0752C.f9430r;
        int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i8 = width / 2;
        float f2 = width;
        float f5 = i8;
        float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f5) + f5;
        if (iSqrt > 0) {
            iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
        } else {
            if (!z4) {
                iAbs = iAbs2;
            }
            iRound = (int) (((iAbs / f2) + 1.0f) * 300.0f);
        }
        int iMin = Math.min(iRound, 2000);
        InterpolatorC0772m interpolatorC0772m = f4696v0;
        if (runnableC0752C.f9427o != interpolatorC0772m) {
            runnableC0752C.f9427o = interpolatorC0772m;
            runnableC0752C.f9426n = new OverScroller(recyclerView.getContext(), interpolatorC0772m);
        }
        recyclerView.setScrollState(2);
        runnableC0752C.f9425m = 0;
        runnableC0752C.f9424l = 0;
        runnableC0752C.f9426n.startScroll(0, 0, i6, i7, iMin);
        runnableC0752C.a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f4745t.getClass();
        if (this.f4704H <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.f4745t.G(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        ArrayList arrayList = this.f4747v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0765f) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4697A != 0 || this.f4698B) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i5) {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4698B) {
            return;
        }
        boolean zB = abstractC0778s.b();
        boolean zC = this.f4745t.c();
        if (zB || zC) {
            if (!zB) {
                i = 0;
            }
            if (!zC) {
                i5 = 0;
            }
            q(i, i5, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f4704H <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f4700D |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0754E c0754e) {
        this.f4731l0 = c0754e;
        I.d(this, c0754e);
    }

    public void setAdapter(AbstractC0773n abstractC0773n) {
        setLayoutFrozen(false);
        AbstractC0776q abstractC0776q = this.f4710O;
        if (abstractC0776q != null) {
            abstractC0776q.a();
        }
        AbstractC0778s abstractC0778s = this.f4745t;
        c cVar = this.f4730l;
        if (abstractC0778s != null) {
            abstractC0778s.E();
            this.f4745t.F(cVar);
        }
        ((ArrayList) cVar.f6747c).clear();
        ArrayList arrayList = (ArrayList) cVar.f6748d;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            AbstractC0307a.q(arrayList.get(size));
            throw null;
        }
        arrayList.clear();
        e eVar = ((RecyclerView) cVar.f6750f).f4726h0;
        eVar.getClass();
        eVar.f399c = 0;
        m mVar = this.f4734n;
        mVar.G((ArrayList) mVar.f3025n);
        mVar.G((ArrayList) mVar.f3026o);
        ((ArrayList) cVar.f6747c).clear();
        ArrayList arrayList2 = (ArrayList) cVar.f6748d;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            AbstractC0307a.q(arrayList2.get(size2));
            throw null;
        }
        arrayList2.clear();
        RecyclerView recyclerView = (RecyclerView) cVar.f6750f;
        e eVar2 = recyclerView.f4726h0;
        eVar2.getClass();
        eVar2.f399c = 0;
        if (((x) cVar.f6749e) == null) {
            x xVar = new x();
            xVar.f9520a = new SparseArray();
            xVar.f9521b = 0;
            cVar.f6749e = xVar;
        }
        x xVar2 = (x) cVar.f6749e;
        if (xVar2.f9521b == 0) {
            SparseArray sparseArray = xVar2.f9520a;
            if (sparseArray.size() > 0) {
                ((w) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f4727i0.f9420b = true;
        this.f4703G = this.f4703G;
        this.f4702F = true;
        int iK = this.f4736o.K();
        for (int i = 0; i < iK; i++) {
            j(this.f4736o.J(i));
        }
        m();
        int size3 = arrayList2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            if (arrayList2.get(i5) != null) {
                throw new ClassCastException();
            }
        }
        int size4 = arrayList2.size() - 1;
        if (size4 >= 0) {
            AbstractC0307a.q(arrayList2.get(size4));
            throw null;
        }
        arrayList2.clear();
        e eVar3 = recyclerView.f4726h0;
        eVar3.getClass();
        eVar3.f399c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0774o interfaceC0774o) {
        if (interfaceC0774o == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.f4740q) {
            this.f4709N = null;
            this.f4708L = null;
            this.M = null;
            this.f4707K = null;
        }
        this.f4740q = z4;
        super.setClipToPadding(z4);
        if (this.f4750z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0775p c0775p) {
        c0775p.getClass();
        this.f4706J = c0775p;
        this.f4709N = null;
        this.f4708L = null;
        this.M = null;
        this.f4707K = null;
    }

    public void setHasFixedSize(boolean z4) {
        this.y = z4;
    }

    public void setItemAnimator(AbstractC0776q abstractC0776q) {
        AbstractC0776q abstractC0776q2 = this.f4710O;
        if (abstractC0776q2 != null) {
            abstractC0776q2.a();
            this.f4710O.f9505a = null;
        }
        this.f4710O = abstractC0776q;
        if (abstractC0776q != null) {
            abstractC0776q.f9505a = this.f4729k0;
        }
    }

    public void setItemViewCacheSize(int i) {
        c cVar = this.f4730l;
        cVar.f6745a = i;
        cVar.d();
    }

    public void setLayoutFrozen(boolean z4) {
        if (z4 != this.f4698B) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z4) {
                this.f4698B = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4698B = true;
            this.f4699C = true;
            setScrollState(0);
            RunnableC0752C runnableC0752C = this.f4724f0;
            runnableC0752C.f9430r.removeCallbacks(runnableC0752C);
            runnableC0752C.f9426n.abortAnimation();
        }
    }

    public void setLayoutManager(AbstractC0778s abstractC0778s) {
        C0675i c0675i;
        if (abstractC0778s == this.f4745t) {
            return;
        }
        setScrollState(0);
        RunnableC0752C runnableC0752C = this.f4724f0;
        runnableC0752C.f9430r.removeCallbacks(runnableC0752C);
        runnableC0752C.f9426n.abortAnimation();
        AbstractC0778s abstractC0778s2 = this.f4745t;
        c cVar = this.f4730l;
        if (abstractC0778s2 != null) {
            AbstractC0776q abstractC0776q = this.f4710O;
            if (abstractC0776q != null) {
                abstractC0776q.a();
            }
            this.f4745t.E();
            this.f4745t.F(cVar);
            ((ArrayList) cVar.f6747c).clear();
            ArrayList arrayList = (ArrayList) cVar.f6748d;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                AbstractC0307a.q(arrayList.get(size));
                throw null;
            }
            arrayList.clear();
            e eVar = ((RecyclerView) cVar.f6750f).f4726h0;
            eVar.getClass();
            eVar.f399c = 0;
            if (this.f4749x) {
                AbstractC0778s abstractC0778s3 = this.f4745t;
                abstractC0778s3.f9515e = false;
                abstractC0778s3.z(this);
            }
            this.f4745t.I(null);
            this.f4745t = null;
        } else {
            ((ArrayList) cVar.f6747c).clear();
            ArrayList arrayList2 = (ArrayList) cVar.f6748d;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                AbstractC0307a.q(arrayList2.get(size2));
                throw null;
            }
            arrayList2.clear();
            e eVar2 = ((RecyclerView) cVar.f6750f).f4726h0;
            eVar2.getClass();
            eVar2.f399c = 0;
        }
        s sVar = this.f4736o;
        ((N0.c) sVar.f3086n).G();
        ArrayList arrayList3 = (ArrayList) sVar.f3087o;
        int size3 = arrayList3.size() - 1;
        while (true) {
            c0675i = (C0675i) sVar.f3085m;
            if (size3 < 0) {
                break;
            }
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
            size3--;
        }
        RecyclerView recyclerView = (RecyclerView) c0675i.f8712m;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f4745t = abstractC0778s;
        if (abstractC0778s != null) {
            if (abstractC0778s.f9512b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0778s + " is already attached to a RecyclerView:" + abstractC0778s.f9512b.h());
            }
            abstractC0778s.I(this);
            if (this.f4749x) {
                this.f4745t.f9515e = true;
            }
        }
        cVar.d();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C0012l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f357d) {
            Field field = I.f300a;
            AbstractC0025z.z(scrollingChildHelper.f356c);
        }
        scrollingChildHelper.f357d = z4;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.f4723e0 = z4;
    }

    public void setRecycledViewPool(x xVar) {
        c cVar = this.f4730l;
        if (((x) cVar.f6749e) != null) {
            r1.f9521b--;
        }
        cVar.f6749e = xVar;
        if (xVar != null) {
            ((RecyclerView) cVar.f6750f).getAdapter();
        }
    }

    public void setScrollState(int i) {
        if (i == this.f4711P) {
            return;
        }
        this.f4711P = i;
        if (i != 2) {
            RunnableC0752C runnableC0752C = this.f4724f0;
            runnableC0752C.f9430r.removeCallbacks(runnableC0752C);
            runnableC0752C.f9426n.abortAnimation();
        }
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null) {
            abstractC0778s.D(i);
        }
        ArrayList arrayList = this.f4728j0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v) this.f4728j0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f4718W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f4718W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0751B abstractC0751B) {
        this.f4730l.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0778s abstractC0778s = this.f4745t;
        if (abstractC0778s != null) {
            return abstractC0778s.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(AbstractC0780u abstractC0780u) {
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
    }

    public void setRecyclerListener(y yVar) {
    }
}
