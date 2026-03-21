package l;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.C0588f;
import m.C0590g;
import m.C0592h;
import m.V;

/* JADX INFO: renamed from: l.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0543a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f7688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f7689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f7691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public V f7692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public V f7693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f7696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ View f7698v;

    public ViewOnTouchListenerC0543a(View view) {
        this.f7696t = new int[2];
        this.f7691o = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f7688l = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f7689m = tapTimeout;
        this.f7690n = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        V v4 = this.f7693q;
        View view = this.f7691o;
        if (v4 != null) {
            view.removeCallbacks(v4);
        }
        V v5 = this.f7692p;
        if (v5 != null) {
            view.removeCallbacks(v5);
        }
    }

    public final AbstractC0552j b() {
        C0588f c0588f;
        switch (this.f7697u) {
            case 0:
                AbstractC0544b abstractC0544b = ((ActionMenuItemView) this.f7698v).f3790x;
                if (abstractC0544b == null || (c0588f = ((C0590g) abstractC0544b).f8408a.f8413D) == null) {
                    return null;
                }
                return c0588f.a();
            default:
                C0588f c0588f2 = ((C0592h) this.f7698v).f8409o.f8412C;
                if (c0588f2 == null) {
                    return null;
                }
                return c0588f2.a();
        }
    }

    public final boolean c() {
        AbstractC0552j abstractC0552jB;
        switch (this.f7697u) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f7698v;
                InterfaceC0549g interfaceC0549g = actionMenuItemView.f3788v;
                return interfaceC0549g != null && interfaceC0549g.a(actionMenuItemView.f3785s) && (abstractC0552jB = b()) != null && abstractC0552jB.g();
            default:
                ((C0592h) this.f7698v).f8409o.h();
                return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnTouchListenerC0543a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7694r = false;
        this.f7695s = -1;
        V v4 = this.f7692p;
        if (v4 != null) {
            this.f7691o.removeCallbacks(v4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0543a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f7697u = 0;
        this.f7698v = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0543a(C0592h c0592h, C0592h c0592h2) {
        this(c0592h2);
        this.f7697u = 1;
        this.f7698v = c0592h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
