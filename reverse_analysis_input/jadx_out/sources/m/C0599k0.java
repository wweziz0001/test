package m;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import l.MenuC0550h;
import l.MenuItemC0551i;

/* JADX INFO: renamed from: m.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0599k0 extends AbstractC0587e0 implements InterfaceC0589f0 {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Method f8440K;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public androidx.lifecycle.E f8441J;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f8440K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.InterfaceC0589f0
    public final void f(MenuC0550h menuC0550h, MenuItemC0551i menuItemC0551i) {
        androidx.lifecycle.E e5 = this.f8441J;
        if (e5 != null) {
            e5.f(menuC0550h, menuItemC0551i);
        }
    }

    @Override // m.InterfaceC0589f0
    public final void r(MenuC0550h menuC0550h, MenuItemC0551i menuItemC0551i) {
        androidx.lifecycle.E e5 = this.f8441J;
        if (e5 != null) {
            e5.r(menuC0550h, menuItemC0551i);
        }
    }
}
