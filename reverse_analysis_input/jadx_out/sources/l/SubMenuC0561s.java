package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: l.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC0561s extends MenuC0550h implements SubMenu {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final MenuC0550h f7810v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final MenuItemC0551i f7811w;

    public SubMenuC0561s(Context context, MenuC0550h menuC0550h, MenuItemC0551i menuItemC0551i) {
        super(context);
        this.f7810v = menuC0550h;
        this.f7811w = menuItemC0551i;
    }

    @Override // l.MenuC0550h
    public final boolean d(MenuItemC0551i menuItemC0551i) {
        return this.f7810v.d(menuItemC0551i);
    }

    @Override // l.MenuC0550h
    public final boolean e(MenuC0550h menuC0550h, MenuItem menuItem) {
        return super.e(menuC0550h, menuItem) || this.f7810v.e(menuC0550h, menuItem);
    }

    @Override // l.MenuC0550h
    public final boolean f(MenuItemC0551i menuItemC0551i) {
        return this.f7810v.f(menuItemC0551i);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f7811w;
    }

    @Override // l.MenuC0550h
    public final MenuC0550h j() {
        return this.f7810v.j();
    }

    @Override // l.MenuC0550h
    public final boolean l() {
        return this.f7810v.l();
    }

    @Override // l.MenuC0550h
    public final boolean m() {
        return this.f7810v.m();
    }

    @Override // l.MenuC0550h
    public final boolean n() {
        return this.f7810v.n();
    }

    @Override // l.MenuC0550h, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f7810v.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f7811w.setIcon(drawable);
        return this;
    }

    @Override // l.MenuC0550h, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f7810v.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        q(0, null, i, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        q(i, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f7811w.setIcon(i);
        return this;
    }
}
