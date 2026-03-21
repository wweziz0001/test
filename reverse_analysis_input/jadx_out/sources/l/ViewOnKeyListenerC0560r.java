package l;

import D.I;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.S;
import com.example.hqp_mobile_app.R;
import java.lang.reflect.Field;
import m.C0597j0;
import m.C0599k0;

/* JADX INFO: renamed from: l.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0560r extends AbstractC0552j implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f7792A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f7793B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f7794C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f7796E;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f7797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MenuC0550h f7798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0548f f7799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f7800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0599k0 f7803s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0553k f7806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f7807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f7808x;
    public InterfaceC0556n y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewTreeObserver f7809z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0545c f7804t = new ViewTreeObserverOnGlobalLayoutListenerC0545c(this, 1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final S f7805u = new S(this, 2);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f7795D = 0;

    public ViewOnKeyListenerC0560r(int i, Context context, View view, MenuC0550h menuC0550h, boolean z4) {
        this.f7797m = context;
        this.f7798n = menuC0550h;
        this.f7800p = z4;
        this.f7799o = new C0548f(menuC0550h, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.f7802r = i;
        Resources resources = context.getResources();
        this.f7801q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f7807w = view;
        this.f7803s = new C0599k0(context, i);
        menuC0550h.b(this, context);
    }

    @Override // l.InterfaceC0557o
    public final void b(MenuC0550h menuC0550h, boolean z4) {
        if (menuC0550h != this.f7798n) {
            return;
        }
        dismiss();
        InterfaceC0556n interfaceC0556n = this.y;
        if (interfaceC0556n != null) {
            interfaceC0556n.b(menuC0550h, z4);
        }
    }

    @Override // l.InterfaceC0559q
    public final void c() {
        View view;
        if (g()) {
            return;
        }
        if (this.f7792A || (view = this.f7807w) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f7808x = view;
        C0599k0 c0599k0 = this.f7803s;
        c0599k0.f8391G.setOnDismissListener(this);
        c0599k0.f8404x = this;
        c0599k0.f8390F = true;
        c0599k0.f8391G.setFocusable(true);
        View view2 = this.f7808x;
        boolean z4 = this.f7809z == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f7809z = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f7804t);
        }
        view2.addOnAttachStateChangeListener(this.f7805u);
        c0599k0.f8403w = view2;
        c0599k0.f8401u = this.f7795D;
        boolean z5 = this.f7793B;
        Context context = this.f7797m;
        C0548f c0548f = this.f7799o;
        if (!z5) {
            this.f7794C = AbstractC0552j.m(c0548f, context, this.f7801q);
            this.f7793B = true;
        }
        int i = this.f7794C;
        Drawable background = c0599k0.f8391G.getBackground();
        if (background != null) {
            Rect rect = c0599k0.f8388D;
            background.getPadding(rect);
            c0599k0.f8395o = rect.left + rect.right + i;
        } else {
            c0599k0.f8395o = i;
        }
        c0599k0.f8391G.setInputMethodMode(2);
        Rect rect2 = this.f7780l;
        c0599k0.f8389E = rect2 != null ? new Rect(rect2) : null;
        c0599k0.c();
        C0597j0 c0597j0 = c0599k0.f8394n;
        c0597j0.setOnKeyListener(this);
        if (this.f7796E) {
            MenuC0550h menuC0550h = this.f7798n;
            if (menuC0550h.f7745l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0597j0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0550h.f7745l);
                }
                frameLayout.setEnabled(false);
                c0597j0.addHeaderView(frameLayout, null, false);
            }
        }
        c0599k0.a(c0548f);
        c0599k0.c();
    }

    @Override // l.InterfaceC0557o
    public final boolean d() {
        return false;
    }

    @Override // l.InterfaceC0559q
    public final void dismiss() {
        if (g()) {
            this.f7803s.dismiss();
        }
    }

    @Override // l.InterfaceC0557o
    public final void e() {
        this.f7793B = false;
        C0548f c0548f = this.f7799o;
        if (c0548f != null) {
            c0548f.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC0557o
    public final boolean f(SubMenuC0561s subMenuC0561s) {
        if (subMenuC0561s.hasVisibleItems()) {
            C0555m c0555m = new C0555m(this.f7802r, this.f7797m, this.f7808x, subMenuC0561s, this.f7800p);
            InterfaceC0556n interfaceC0556n = this.y;
            c0555m.f7789h = interfaceC0556n;
            AbstractC0552j abstractC0552j = c0555m.i;
            if (abstractC0552j != null) {
                abstractC0552j.i(interfaceC0556n);
            }
            boolean zU = AbstractC0552j.u(subMenuC0561s);
            c0555m.f7788g = zU;
            AbstractC0552j abstractC0552j2 = c0555m.i;
            if (abstractC0552j2 != null) {
                abstractC0552j2.o(zU);
            }
            c0555m.f7790j = this.f7806v;
            this.f7806v = null;
            this.f7798n.c(false);
            C0599k0 c0599k0 = this.f7803s;
            int width = c0599k0.f8396p;
            int i = !c0599k0.f8398r ? 0 : c0599k0.f8397q;
            int i5 = this.f7795D;
            View view = this.f7807w;
            Field field = I.f300a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                width += this.f7807w.getWidth();
            }
            if (!c0555m.b()) {
                if (c0555m.f7786e != null) {
                    c0555m.d(width, i, true, true);
                }
            }
            InterfaceC0556n interfaceC0556n2 = this.y;
            if (interfaceC0556n2 != null) {
                interfaceC0556n2.g(subMenuC0561s);
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC0559q
    public final boolean g() {
        return !this.f7792A && this.f7803s.f8391G.isShowing();
    }

    @Override // l.InterfaceC0559q
    public final ListView h() {
        return this.f7803s.f8394n;
    }

    @Override // l.InterfaceC0557o
    public final void i(InterfaceC0556n interfaceC0556n) {
        this.y = interfaceC0556n;
    }

    @Override // l.AbstractC0552j
    public final void n(View view) {
        this.f7807w = view;
    }

    @Override // l.AbstractC0552j
    public final void o(boolean z4) {
        this.f7799o.f7730n = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f7792A = true;
        this.f7798n.c(true);
        ViewTreeObserver viewTreeObserver = this.f7809z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f7809z = this.f7808x.getViewTreeObserver();
            }
            this.f7809z.removeGlobalOnLayoutListener(this.f7804t);
            this.f7809z = null;
        }
        this.f7808x.removeOnAttachStateChangeListener(this.f7805u);
        C0553k c0553k = this.f7806v;
        if (c0553k != null) {
            c0553k.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.AbstractC0552j
    public final void p(int i) {
        this.f7795D = i;
    }

    @Override // l.AbstractC0552j
    public final void q(int i) {
        this.f7803s.f8396p = i;
    }

    @Override // l.AbstractC0552j
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f7806v = (C0553k) onDismissListener;
    }

    @Override // l.AbstractC0552j
    public final void s(boolean z4) {
        this.f7796E = z4;
    }

    @Override // l.AbstractC0552j
    public final void t(int i) {
        C0599k0 c0599k0 = this.f7803s;
        c0599k0.f8397q = i;
        c0599k0.f8398r = true;
    }

    @Override // l.AbstractC0552j
    public final void l(MenuC0550h menuC0550h) {
    }
}
