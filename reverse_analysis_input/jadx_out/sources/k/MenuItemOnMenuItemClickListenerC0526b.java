package k;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: k.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0526b implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class[] f7477c = {MenuItem.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f7478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f7479b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f7479b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f7478a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }
}
