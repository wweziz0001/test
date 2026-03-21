package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.example.hqp_mobile_app.R;
import java.util.ArrayList;
import l.AbstractC0552j;
import l.InterfaceC0556n;
import l.InterfaceC0557o;
import l.InterfaceC0558p;
import l.MenuC0550h;
import l.MenuItemC0551i;
import l.SubMenuC0561s;

/* JADX INFO: renamed from: m.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0594i implements InterfaceC0557o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f8410A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0588f f8412C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0588f f8413D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public A.a f8414E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0590g f8415F;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f8417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f8418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MenuC0550h f8419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LayoutInflater f8420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC0556n f8421p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ActionMenuView f8423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0592h f8424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f8425t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8426u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8427v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8428w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8429x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8430z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f8422q = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final SparseBooleanArray f8411B = new SparseBooleanArray();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final androidx.lifecycle.E f8416G = new androidx.lifecycle.E(this, 15);

    public C0594i(Context context) {
        this.f8417l = context;
        this.f8420o = LayoutInflater.from(context);
    }

    @Override // l.InterfaceC0557o
    public final void a(Context context, MenuC0550h menuC0550h) {
        this.f8418m = context;
        LayoutInflater.from(context);
        this.f8419n = menuC0550h;
        Resources resources = context.getResources();
        if (!this.f8428w) {
            this.f8427v = true;
        }
        int i = 2;
        this.f8429x = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960))) {
            i = 5;
        } else if (i5 >= 500 || ((i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640))) {
            i = 4;
        } else if (i5 >= 360) {
            i = 3;
        }
        this.f8430z = i;
        int measuredWidth = this.f8429x;
        if (this.f8427v) {
            if (this.f8424s == null) {
                C0592h c0592h = new C0592h(this, this.f8417l);
                this.f8424s = c0592h;
                if (this.f8426u) {
                    c0592h.setImageDrawable(this.f8425t);
                    this.f8425t = null;
                    this.f8426u = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8424s.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f8424s.getMeasuredWidth();
        } else {
            this.f8424s = null;
        }
        this.y = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // l.InterfaceC0557o
    public final void b(MenuC0550h menuC0550h, boolean z4) {
        g();
        C0588f c0588f = this.f8413D;
        if (c0588f != null && c0588f.b()) {
            c0588f.i.dismiss();
        }
        InterfaceC0556n interfaceC0556n = this.f8421p;
        if (interfaceC0556n != null) {
            interfaceC0556n.b(menuC0550h, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View c(MenuItemC0551i menuItemC0551i, View view, ActionMenuView actionMenuView) {
        View view2 = menuItemC0551i.f7779z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || menuItemC0551i.c()) {
            InterfaceC0558p interfaceC0558p = view instanceof InterfaceC0558p ? (InterfaceC0558p) view : (InterfaceC0558p) this.f8420o.inflate(this.f8422q, (ViewGroup) actionMenuView, false);
            interfaceC0558p.b(menuItemC0551i);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0558p;
            actionMenuItemView.setItemInvoker(this.f8423r);
            if (this.f8415F == null) {
                this.f8415F = new C0590g(this);
            }
            actionMenuItemView.setPopupCallback(this.f8415F);
            view2 = (View) interfaceC0558p;
        }
        view2.setVisibility(menuItemC0551i.f7755B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0598k)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    @Override // l.InterfaceC0557o
    public final boolean d() {
        int size;
        ArrayList arrayListK;
        int i;
        boolean z4;
        MenuC0550h menuC0550h = this.f8419n;
        if (menuC0550h != null) {
            arrayListK = menuC0550h.k();
            size = arrayListK.size();
        } else {
            size = 0;
            arrayListK = null;
        }
        int i5 = this.f8430z;
        int i6 = this.y;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f8423r;
        int i7 = 0;
        boolean z5 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = 2;
            z4 = true;
            if (i7 >= size) {
                break;
            }
            MenuItemC0551i menuItemC0551i = (MenuItemC0551i) arrayListK.get(i7);
            int i10 = menuItemC0551i.y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z5 = true;
            }
            if (this.f8410A && menuItemC0551i.f7755B) {
                i5 = 0;
            }
            i7++;
        }
        if (this.f8427v && (z5 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = this.f8411B;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            MenuItemC0551i menuItemC0551i2 = (MenuItemC0551i) arrayListK.get(i12);
            int i14 = menuItemC0551i2.y;
            boolean z6 = (i14 & 2) == i ? z4 : false;
            int i15 = menuItemC0551i2.f7757b;
            if (z6) {
                View viewC = c(menuItemC0551i2, null, actionMenuView);
                viewC.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewC.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z4);
                }
                menuItemC0551i2.f(z4);
            } else if ((i14 & 1) == z4) {
                boolean z7 = sparseBooleanArray.get(i15);
                boolean z8 = ((i11 > 0 || z7) && i6 > 0) ? z4 : false;
                if (z8) {
                    View viewC2 = c(menuItemC0551i2, null, actionMenuView);
                    viewC2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewC2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z8 &= i6 + i13 > 0;
                }
                if (z8 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z7) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        MenuItemC0551i menuItemC0551i3 = (MenuItemC0551i) arrayListK.get(i16);
                        if (menuItemC0551i3.f7757b == i15) {
                            if (menuItemC0551i3.d()) {
                                i11++;
                            }
                            menuItemC0551i3.f(false);
                        }
                    }
                }
                if (z8) {
                    i11--;
                }
                menuItemC0551i2.f(z8);
            } else {
                menuItemC0551i2.f(false);
                i12++;
                i = 2;
                z4 = true;
            }
            i12++;
            i = 2;
            z4 = true;
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC0557o
    public final void e() {
        int i;
        ActionMenuView actionMenuView = this.f8423r;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (actionMenuView != null) {
            MenuC0550h menuC0550h = this.f8419n;
            if (menuC0550h != null) {
                menuC0550h.i();
                ArrayList arrayListK = this.f8419n.k();
                int size = arrayListK.size();
                i = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    MenuItemC0551i menuItemC0551i = (MenuItemC0551i) arrayListK.get(i5);
                    if (menuItemC0551i.d()) {
                        View childAt = actionMenuView.getChildAt(i);
                        MenuItemC0551i itemData = childAt instanceof InterfaceC0558p ? ((InterfaceC0558p) childAt).getItemData() : null;
                        View viewC = c(menuItemC0551i, childAt, actionMenuView);
                        if (menuItemC0551i != itemData) {
                            viewC.setPressed(false);
                            viewC.jumpDrawablesToCurrentState();
                        }
                        if (viewC != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewC.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewC);
                            }
                            this.f8423r.addView(viewC, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i) == this.f8424s) {
                    i++;
                } else {
                    actionMenuView.removeViewAt(i);
                }
            }
        }
        this.f8423r.requestLayout();
        MenuC0550h menuC0550h2 = this.f8419n;
        if (menuC0550h2 != null) {
            menuC0550h2.i();
            ArrayList arrayList2 = menuC0550h2.i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((MenuItemC0551i) arrayList2.get(i6)).getClass();
            }
        }
        MenuC0550h menuC0550h3 = this.f8419n;
        if (menuC0550h3 != null) {
            menuC0550h3.i();
            arrayList = menuC0550h3.f7743j;
        }
        if (this.f8427v && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((MenuItemC0551i) arrayList.get(0)).f7755B;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f8424s == null) {
                this.f8424s = new C0592h(this, this.f8417l);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f8424s.getParent();
            if (viewGroup2 != this.f8423r) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f8424s);
                }
                ActionMenuView actionMenuView2 = this.f8423r;
                C0592h c0592h = this.f8424s;
                actionMenuView2.getClass();
                C0598k c0598kH = ActionMenuView.h();
                c0598kH.f8434a = true;
                actionMenuView2.addView(c0592h, c0598kH);
            }
        } else {
            C0592h c0592h2 = this.f8424s;
            if (c0592h2 != null) {
                ViewParent parent = c0592h2.getParent();
                ActionMenuView actionMenuView3 = this.f8423r;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f8424s);
                }
            }
        }
        this.f8423r.setOverflowReserved(this.f8427v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC0557o
    public final boolean f(SubMenuC0561s subMenuC0561s) {
        boolean z4;
        if (!subMenuC0561s.hasVisibleItems()) {
            return false;
        }
        SubMenuC0561s subMenuC0561s2 = subMenuC0561s;
        while (true) {
            MenuC0550h menuC0550h = subMenuC0561s2.f7810v;
            if (menuC0550h == this.f8419n) {
                break;
            }
            subMenuC0561s2 = (SubMenuC0561s) menuC0550h;
        }
        ActionMenuView actionMenuView = this.f8423r;
        View view = null;
        view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i);
                if ((childAt instanceof InterfaceC0558p) && ((InterfaceC0558p) childAt).getItemData() == subMenuC0561s2.f7811w) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0561s.f7811w.getClass();
        int size = subMenuC0561s.f7740f.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                z4 = false;
                break;
            }
            MenuItem item = subMenuC0561s.getItem(i5);
            if (item.isVisible() && item.getIcon() != null) {
                z4 = true;
                break;
            }
            i5++;
        }
        C0588f c0588f = new C0588f(this, this.f8418m, subMenuC0561s, view);
        this.f8413D = c0588f;
        c0588f.f7788g = z4;
        AbstractC0552j abstractC0552j = c0588f.i;
        if (abstractC0552j != null) {
            abstractC0552j.o(z4);
        }
        C0588f c0588f2 = this.f8413D;
        if (!c0588f2.b()) {
            if (c0588f2.f7786e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0588f2.d(0, 0, false, false);
        }
        InterfaceC0556n interfaceC0556n = this.f8421p;
        if (interfaceC0556n != null) {
            interfaceC0556n.g(subMenuC0561s);
        }
        return true;
    }

    public final boolean g() {
        ActionMenuView actionMenuView;
        A.a aVar = this.f8414E;
        if (aVar != null && (actionMenuView = this.f8423r) != null) {
            actionMenuView.removeCallbacks(aVar);
            this.f8414E = null;
            return true;
        }
        C0588f c0588f = this.f8412C;
        if (c0588f == null) {
            return false;
        }
        if (c0588f.b()) {
            c0588f.i.dismiss();
        }
        return true;
    }

    public final boolean h() {
        MenuC0550h menuC0550h;
        if (!this.f8427v) {
            return false;
        }
        C0588f c0588f = this.f8412C;
        if ((c0588f != null && c0588f.b()) || (menuC0550h = this.f8419n) == null || this.f8423r == null || this.f8414E != null) {
            return false;
        }
        menuC0550h.i();
        if (menuC0550h.f7743j.isEmpty()) {
            return false;
        }
        A.a aVar = new A.a(this, new C0588f(this, this.f8418m, this.f8419n, this.f8424s), 10, false);
        this.f8414E = aVar;
        this.f8423r.post(aVar);
        return true;
    }

    @Override // l.InterfaceC0557o
    public final void i(InterfaceC0556n interfaceC0556n) {
        throw null;
    }

    @Override // l.InterfaceC0557o
    public final boolean j(MenuItemC0551i menuItemC0551i) {
        return false;
    }

    @Override // l.InterfaceC0557o
    public final boolean k(MenuItemC0551i menuItemC0551i) {
        return false;
    }
}
