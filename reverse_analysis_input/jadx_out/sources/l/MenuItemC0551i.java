package l;

import a.AbstractC0149a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import x.AbstractC0952a;

/* JADX INFO: renamed from: l.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC0551i implements MenuItem {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f7754A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f7760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f7761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f7762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f7763h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f7764j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f7766l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MenuC0550h f7768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SubMenuC0561s f7769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f7770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f7771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f7772r;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f7779z;
    public int i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7765k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7767m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f7773s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f7774t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7775u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7776v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7777w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7778x = 16;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f7755B = false;
    public int y = 0;

    public MenuItemC0551i(MenuC0550h menuC0550h, int i, int i5, int i6, int i7, CharSequence charSequence) {
        this.f7768n = menuC0550h;
        this.f7756a = i5;
        this.f7757b = i;
        this.f7758c = i6;
        this.f7759d = i7;
        this.f7760e = charSequence;
    }

    public static void a(StringBuilder sb, int i, int i5, String str) {
        if ((i & i5) == i5) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f7777w && (this.f7775u || this.f7776v)) {
            drawable = drawable.mutate();
            if (this.f7775u) {
                AbstractC0952a.h(drawable, this.f7773s);
            }
            if (this.f7776v) {
                AbstractC0952a.i(drawable, this.f7774t);
            }
            this.f7777w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.y & 8) == 0 || this.f7779z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f7779z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7754A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f7768n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f7778x & 32) == 32;
    }

    public final MenuItemC0551i e(CharSequence charSequence) {
        this.f7771q = charSequence;
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7754A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f7768n.f(this);
        }
        return false;
    }

    public final void f(boolean z4) {
        if (z4) {
            this.f7778x |= 32;
        } else {
            this.f7778x &= -33;
        }
    }

    public final MenuItemC0551i g(CharSequence charSequence) {
        this.f7772r = charSequence;
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f7779z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f7765k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f7764j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f7771q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f7757b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f7766l;
        if (drawable != null) {
            return b(drawable);
        }
        int i = this.f7767m;
        if (i == 0) {
            return null;
        }
        Drawable drawableU = AbstractC0149a.u(this.f7768n.f7735a, i);
        this.f7767m = 0;
        this.f7766l = drawableU;
        return b(drawableU);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f7773s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f7774t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f7762g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f7756a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f7763h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f7758c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f7769o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f7760e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7761f;
        return charSequence != null ? charSequence : this.f7760e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f7772r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f7769o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f7755B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f7778x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f7778x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f7778x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f7778x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f7779z = view;
        if (view != null && view.getId() == -1 && (i = this.f7756a) > 0) {
            view.setId(i);
        }
        MenuC0550h menuC0550h = this.f7768n;
        menuC0550h.f7744k = true;
        menuC0550h.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5) {
        if (this.f7764j == c5) {
            return this;
        }
        this.f7764j = Character.toLowerCase(c5);
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i = this.f7778x;
        int i5 = (z4 ? 1 : 0) | (i & (-2));
        this.f7778x = i5;
        if (i != i5) {
            this.f7768n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i = this.f7778x;
        if ((i & 4) != 0) {
            MenuC0550h menuC0550h = this.f7768n;
            menuC0550h.getClass();
            ArrayList arrayList = menuC0550h.f7740f;
            int size = arrayList.size();
            menuC0550h.s();
            for (int i5 = 0; i5 < size; i5++) {
                MenuItemC0551i menuItemC0551i = (MenuItemC0551i) arrayList.get(i5);
                if (menuItemC0551i.f7757b == this.f7757b && (menuItemC0551i.f7778x & 4) != 0 && menuItemC0551i.isCheckable()) {
                    boolean z5 = menuItemC0551i == this;
                    int i6 = menuItemC0551i.f7778x;
                    int i7 = (z5 ? 2 : 0) | (i6 & (-3));
                    menuItemC0551i.f7778x = i7;
                    if (i6 != i7) {
                        menuItemC0551i.f7768n.o(false);
                    }
                }
            }
            menuC0550h.r();
        } else {
            int i8 = (i & (-3)) | (z4 ? 2 : 0);
            this.f7778x = i8;
            if (i != i8) {
                this.f7768n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f7778x |= 16;
        } else {
            this.f7778x &= -17;
        }
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f7767m = 0;
        this.f7766l = drawable;
        this.f7777w = true;
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7773s = colorStateList;
        this.f7775u = true;
        this.f7777w = true;
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7774t = mode;
        this.f7776v = true;
        this.f7777w = true;
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f7762g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5) {
        if (this.f7763h == c5) {
            return this;
        }
        this.f7763h = c5;
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7754A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7770p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6) {
        this.f7763h = c5;
        this.f7764j = Character.toLowerCase(c6);
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i5 = i & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i;
        MenuC0550h menuC0550h = this.f7768n;
        menuC0550h.f7744k = true;
        menuC0550h.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f7760e = charSequence;
        this.f7768n.o(false);
        SubMenuC0561s subMenuC0561s = this.f7769o;
        if (subMenuC0561s != null) {
            subMenuC0561s.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7761f = charSequence;
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i = this.f7778x;
        int i5 = (z4 ? 0 : 8) | (i & (-9));
        this.f7778x = i5;
        if (i != i5) {
            MenuC0550h menuC0550h = this.f7768n;
            menuC0550h.f7742h = true;
            menuC0550h.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f7760e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5, int i) {
        if (this.f7764j == c5 && this.f7765k == i) {
            return this;
        }
        this.f7764j = Character.toLowerCase(c5);
        this.f7765k = KeyEvent.normalizeMetaState(i);
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5, int i) {
        if (this.f7763h == c5 && this.i == i) {
            return this;
        }
        this.f7763h = c5;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6, int i, int i5) {
        this.f7763h = c5;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f7764j = Character.toLowerCase(c6);
        this.f7765k = KeyEvent.normalizeMetaState(i5);
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f7766l = null;
        this.f7767m = i;
        this.f7777w = true;
        this.f7768n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f7768n.f7735a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i5;
        Context context = this.f7768n.f7735a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f7779z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i5 = this.f7756a) > 0) {
            viewInflate.setId(i5);
        }
        MenuC0550h menuC0550h = this.f7768n;
        menuC0550h.f7744k = true;
        menuC0550h.o(true);
        return this;
    }
}
