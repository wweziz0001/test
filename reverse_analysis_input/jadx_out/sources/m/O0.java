package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import k.InterfaceC0525a;
import l.InterfaceC0557o;
import l.MenuC0550h;
import l.MenuItemC0551i;
import l.SubMenuC0561s;

/* JADX INFO: loaded from: classes.dex */
public final class O0 implements InterfaceC0557o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MenuC0550h f8300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItemC0551i f8301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Toolbar f8302n;

    public O0(Toolbar toolbar) {
        this.f8302n = toolbar;
    }

    @Override // l.InterfaceC0557o
    public final void a(Context context, MenuC0550h menuC0550h) {
        MenuItemC0551i menuItemC0551i;
        MenuC0550h menuC0550h2 = this.f8300l;
        if (menuC0550h2 != null && (menuItemC0551i = this.f8301m) != null) {
            menuC0550h2.d(menuItemC0551i);
        }
        this.f8300l = menuC0550h;
    }

    @Override // l.InterfaceC0557o
    public final boolean d() {
        return false;
    }

    @Override // l.InterfaceC0557o
    public final void e() {
        if (this.f8301m != null) {
            MenuC0550h menuC0550h = this.f8300l;
            if (menuC0550h != null) {
                int size = menuC0550h.f7740f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f8300l.getItem(i) == this.f8301m) {
                        return;
                    }
                }
            }
            k(this.f8301m);
        }
    }

    @Override // l.InterfaceC0557o
    public final boolean f(SubMenuC0561s subMenuC0561s) {
        return false;
    }

    @Override // l.InterfaceC0557o
    public final boolean j(MenuItemC0551i menuItemC0551i) {
        Toolbar toolbar = this.f8302n;
        toolbar.c();
        ViewParent parent = toolbar.f3995s.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f3995s);
            }
            toolbar.addView(toolbar.f3995s);
        }
        View view = menuItemC0551i.f7779z;
        if (view == null) {
            view = null;
        }
        toolbar.f3996t = view;
        this.f8301m = menuItemC0551i;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f3996t);
            }
            P0 p0G = Toolbar.g();
            p0G.f8303a = (toolbar.y & 112) | 8388611;
            p0G.f8304b = 2;
            toolbar.f3996t.setLayoutParams(p0G);
            toolbar.addView(toolbar.f3996t);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((P0) childAt.getLayoutParams()).f8304b != 2 && childAt != toolbar.f3988l) {
                toolbar.removeViewAt(childCount);
                toolbar.f3976P.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC0551i.f7755B = true;
        menuItemC0551i.f7768n.o(false);
        KeyEvent.Callback callback = toolbar.f3996t;
        if (callback instanceof InterfaceC0525a) {
            SearchView searchView = (SearchView) ((InterfaceC0525a) callback);
            if (!searchView.f3908k0) {
                searchView.f3908k0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f3876A;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f3909l0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        toolbar.t();
        return true;
    }

    @Override // l.InterfaceC0557o
    public final boolean k(MenuItemC0551i menuItemC0551i) {
        Toolbar toolbar = this.f8302n;
        KeyEvent.Callback callback = toolbar.f3996t;
        if (callback instanceof InterfaceC0525a) {
            SearchView searchView = (SearchView) ((InterfaceC0525a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f3876A;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f3907j0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f3909l0);
            searchView.f3908k0 = false;
        }
        toolbar.removeView(toolbar.f3996t);
        toolbar.removeView(toolbar.f3995s);
        toolbar.f3996t = null;
        ArrayList arrayList = toolbar.f3976P;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f8301m = null;
        toolbar.requestLayout();
        menuItemC0551i.f7755B = false;
        menuItemC0551i.f7768n.o(false);
        toolbar.t();
        return true;
    }

    @Override // l.InterfaceC0557o
    public final void b(MenuC0550h menuC0550h, boolean z4) {
    }
}
