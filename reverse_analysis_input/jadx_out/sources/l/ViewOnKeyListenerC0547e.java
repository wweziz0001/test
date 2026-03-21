package l;

import D.I;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.fragment.app.S;
import androidx.lifecycle.E;
import com.example.hqp_mobile_app.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.AbstractC0591g0;
import m.C0599k0;

/* JADX INFO: renamed from: l.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0547e extends AbstractC0552j implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f7704A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f7705B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f7706C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f7707D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f7708E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f7710G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public InterfaceC0556n f7711H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ViewTreeObserver f7712I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C0553k f7713J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f7714K;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f7715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f7717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f7718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f7719q;
    public View y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f7727z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f7720r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f7721s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0545c f7722t = new ViewTreeObserverOnGlobalLayoutListenerC0545c(this, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final S f7723u = new S(this, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final E f7724v = new E(this, 12);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7725w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7726x = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f7709F = false;

    public ViewOnKeyListenerC0547e(Context context, View view, int i, boolean z4) {
        this.f7715m = context;
        this.y = view;
        this.f7717o = i;
        this.f7718p = z4;
        Field field = I.f300a;
        this.f7704A = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f7716n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f7719q = new Handler();
    }

    @Override // l.InterfaceC0557o
    public final void b(MenuC0550h menuC0550h, boolean z4) {
        ArrayList arrayList = this.f7721s;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0550h == ((C0546d) arrayList.get(i)).f7702b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i5 = i + 1;
        if (i5 < arrayList.size()) {
            ((C0546d) arrayList.get(i5)).f7702b.c(false);
        }
        C0546d c0546d = (C0546d) arrayList.remove(i);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = c0546d.f7702b.f7751r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0557o interfaceC0557o = (InterfaceC0557o) weakReference.get();
            if (interfaceC0557o == null || interfaceC0557o == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z5 = this.f7714K;
        C0599k0 c0599k0 = c0546d.f7701a;
        if (z5) {
            AbstractC0591g0.b(c0599k0.f8391G, null);
            c0599k0.f8391G.setAnimationStyle(0);
        }
        c0599k0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f7704A = ((C0546d) arrayList.get(size2 - 1)).f7703c;
        } else {
            View view = this.y;
            Field field = I.f300a;
            this.f7704A = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((C0546d) arrayList.get(0)).f7702b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0556n interfaceC0556n = this.f7711H;
        if (interfaceC0556n != null) {
            interfaceC0556n.b(menuC0550h, true);
        }
        ViewTreeObserver viewTreeObserver = this.f7712I;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f7712I.removeGlobalOnLayoutListener(this.f7722t);
            }
            this.f7712I = null;
        }
        this.f7727z.removeOnAttachStateChangeListener(this.f7723u);
        this.f7713J.onDismiss();
    }

    @Override // l.InterfaceC0559q
    public final void c() {
        if (g()) {
            return;
        }
        ArrayList arrayList = this.f7720r;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0550h) it.next());
        }
        arrayList.clear();
        View view = this.y;
        this.f7727z = view;
        if (view != null) {
            boolean z4 = this.f7712I == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f7712I = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f7722t);
            }
            this.f7727z.addOnAttachStateChangeListener(this.f7723u);
        }
    }

    @Override // l.InterfaceC0557o
    public final boolean d() {
        return false;
    }

    @Override // l.InterfaceC0559q
    public final void dismiss() {
        ArrayList arrayList = this.f7721s;
        int size = arrayList.size();
        if (size > 0) {
            C0546d[] c0546dArr = (C0546d[]) arrayList.toArray(new C0546d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0546d c0546d = c0546dArr[i];
                if (c0546d.f7701a.f8391G.isShowing()) {
                    c0546d.f7701a.dismiss();
                }
            }
        }
    }

    @Override // l.InterfaceC0557o
    public final void e() {
        Iterator it = this.f7721s.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0546d) it.next()).f7701a.f8394n.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0548f) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC0557o
    public final boolean f(SubMenuC0561s subMenuC0561s) {
        for (C0546d c0546d : this.f7721s) {
            if (subMenuC0561s == c0546d.f7702b) {
                c0546d.f7701a.f8394n.requestFocus();
                return true;
            }
        }
        if (!subMenuC0561s.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0561s);
        InterfaceC0556n interfaceC0556n = this.f7711H;
        if (interfaceC0556n != null) {
            interfaceC0556n.g(subMenuC0561s);
        }
        return true;
    }

    @Override // l.InterfaceC0559q
    public final boolean g() {
        ArrayList arrayList = this.f7721s;
        return arrayList.size() > 0 && ((C0546d) arrayList.get(0)).f7701a.f8391G.isShowing();
    }

    @Override // l.InterfaceC0559q
    public final ListView h() {
        ArrayList arrayList = this.f7721s;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0546d) arrayList.get(arrayList.size() - 1)).f7701a.f8394n;
    }

    @Override // l.InterfaceC0557o
    public final void i(InterfaceC0556n interfaceC0556n) {
        this.f7711H = interfaceC0556n;
    }

    @Override // l.AbstractC0552j
    public final void l(MenuC0550h menuC0550h) {
        menuC0550h.b(this, this.f7715m);
        if (g()) {
            v(menuC0550h);
        } else {
            this.f7720r.add(menuC0550h);
        }
    }

    @Override // l.AbstractC0552j
    public final void n(View view) {
        if (this.y != view) {
            this.y = view;
            int i = this.f7725w;
            Field field = I.f300a;
            this.f7726x = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // l.AbstractC0552j
    public final void o(boolean z4) {
        this.f7709F = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0546d c0546d;
        ArrayList arrayList = this.f7721s;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0546d = null;
                break;
            }
            c0546d = (C0546d) arrayList.get(i);
            if (!c0546d.f7701a.f8391G.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0546d != null) {
            c0546d.f7702b.c(false);
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
        if (this.f7725w != i) {
            this.f7725w = i;
            View view = this.y;
            Field field = I.f300a;
            this.f7726x = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // l.AbstractC0552j
    public final void q(int i) {
        this.f7705B = true;
        this.f7707D = i;
    }

    @Override // l.AbstractC0552j
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f7713J = (C0553k) onDismissListener;
    }

    @Override // l.AbstractC0552j
    public final void s(boolean z4) {
        this.f7710G = z4;
    }

    @Override // l.AbstractC0552j
    public final void t(int i) {
        this.f7706C = true;
        this.f7708E = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(l.MenuC0550h r17) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnKeyListenerC0547e.v(l.h):void");
    }
}
