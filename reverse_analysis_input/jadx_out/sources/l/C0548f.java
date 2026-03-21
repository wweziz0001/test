package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0548f extends BaseAdapter {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MenuC0550h f7728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7729m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7730n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LayoutInflater f7732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7733q;

    public C0548f(MenuC0550h menuC0550h, LayoutInflater layoutInflater, boolean z4, int i) {
        this.f7731o = z4;
        this.f7732p = layoutInflater;
        this.f7728l = menuC0550h;
        this.f7733q = i;
        a();
    }

    public final void a() {
        MenuC0550h menuC0550h = this.f7728l;
        MenuItemC0551i menuItemC0551i = menuC0550h.f7752s;
        if (menuItemC0551i != null) {
            menuC0550h.i();
            ArrayList arrayList = menuC0550h.f7743j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemC0551i) arrayList.get(i)) == menuItemC0551i) {
                    this.f7729m = i;
                    return;
                }
            }
        }
        this.f7729m = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemC0551i getItem(int i) {
        ArrayList arrayListK;
        MenuC0550h menuC0550h = this.f7728l;
        if (this.f7731o) {
            menuC0550h.i();
            arrayListK = menuC0550h.f7743j;
        } else {
            arrayListK = menuC0550h.k();
        }
        int i5 = this.f7729m;
        if (i5 >= 0 && i >= i5) {
            i++;
        }
        return (MenuItemC0551i) arrayListK.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK;
        MenuC0550h menuC0550h = this.f7728l;
        if (this.f7731o) {
            menuC0550h.i();
            arrayListK = menuC0550h.f7743j;
        } else {
            arrayListK = menuC0550h.k();
        }
        return this.f7729m < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f7732p.inflate(this.f7733q, viewGroup, false);
        }
        int i5 = getItem(i).f7757b;
        int i6 = i - 1;
        int i7 = i6 >= 0 ? getItem(i6).f7757b : i5;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f7728l.l() && i5 != i7) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        InterfaceC0558p interfaceC0558p = (InterfaceC0558p) view;
        if (this.f7730n) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0558p.b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
