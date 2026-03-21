package k;

import D.AbstractC0010j;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import b3.AbstractC0307a;
import java.lang.reflect.Constructor;
import l.MenuItemC0551i;

/* JADX INFO: renamed from: k.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0527c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f7480A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ d f7483D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f7484a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7491h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f7493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f7494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f7496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f7498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7503u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7504v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f7506x;
    public String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f7507z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f7481B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f7482C = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7485b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7486c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7487d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7488e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7489f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7490g = true;

    public C0527c(d dVar, Menu menu) {
        this.f7483D = dVar;
        this.f7484a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f7483D.f7512c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e5) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e5);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z4 = false;
        menuItem.setChecked(this.f7501s).setVisible(this.f7502t).setEnabled(this.f7503u).setCheckable(this.f7500r >= 1).setTitleCondensed(this.f7494l).setIcon(this.f7495m);
        int i = this.f7504v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.y;
        d dVar = this.f7483D;
        if (str != null) {
            if (dVar.f7512c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f7513d == null) {
                dVar.f7513d = d.a(dVar.f7512c);
            }
            Object obj = dVar.f7513d;
            String str2 = this.y;
            MenuItemOnMenuItemClickListenerC0526b menuItemOnMenuItemClickListenerC0526b = new MenuItemOnMenuItemClickListenerC0526b();
            menuItemOnMenuItemClickListenerC0526b.f7478a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0526b.f7479b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0526b.f7477c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0526b);
            } catch (Exception e5) {
                StringBuilder sbM = AbstractC0307a.m("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbM.append(cls.getName());
                InflateException inflateException = new InflateException(sbM.toString());
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        if (this.f7500r >= 2 && (menuItem instanceof MenuItemC0551i)) {
            MenuItemC0551i menuItemC0551i = (MenuItemC0551i) menuItem;
            menuItemC0551i.f7778x = (menuItemC0551i.f7778x & (-5)) | 4;
        }
        String str3 = this.f7506x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, d.f7508e, dVar.f7510a));
            z4 = true;
        }
        int i5 = this.f7505w;
        if (i5 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i5);
            }
        }
        CharSequence charSequence = this.f7507z;
        boolean z5 = menuItem instanceof MenuItemC0551i;
        if (z5) {
            ((MenuItemC0551i) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0010j.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f7480A;
        if (z5) {
            ((MenuItemC0551i) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0010j.m(menuItem, charSequence2);
        }
        char c5 = this.f7496n;
        int i6 = this.f7497o;
        if (z5) {
            ((MenuItemC0551i) menuItem).setAlphabeticShortcut(c5, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0010j.g(menuItem, c5, i6);
        }
        char c6 = this.f7498p;
        int i7 = this.f7499q;
        if (z5) {
            ((MenuItemC0551i) menuItem).setNumericShortcut(c6, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0010j.k(menuItem, c6, i7);
        }
        PorterDuff.Mode mode = this.f7482C;
        if (mode != null) {
            if (z5) {
                ((MenuItemC0551i) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0010j.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f7481B;
        if (colorStateList != null) {
            if (z5) {
                ((MenuItemC0551i) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0010j.i(menuItem, colorStateList);
            }
        }
    }
}
