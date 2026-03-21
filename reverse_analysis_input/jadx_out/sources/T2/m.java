package T2;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.lifecycle.E;
import java.io.File;
import l.C0546d;
import l.MenuC0550h;
import l.MenuItemC0551i;
import l.ViewOnKeyListenerC0547e;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2239p;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2235l = i;
        this.f2239p = obj;
        this.f2236m = obj2;
        this.f2237n = obj3;
        this.f2238o = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2235l) {
            case 0:
                synchronized (n.f2243q) {
                    e eVar = (e) this.f2236m;
                    if (eVar != null) {
                        n.a((n) this.f2239p, eVar);
                    }
                    try {
                        if (a.b(n.f2244r)) {
                            Log.d("Sqflite", "delete database " + ((String) this.f2237n));
                        }
                        SQLiteDatabase.deleteDatabase(new File((String) this.f2237n));
                    } catch (Exception e5) {
                        Log.e("Sqflite", "error " + e5 + " while closing database " + n.f2248v);
                    }
                    break;
                }
                ((P2.c) this.f2238o).success(null);
                return;
            default:
                C0546d c0546d = (C0546d) this.f2236m;
                if (c0546d != null) {
                    E e6 = (E) this.f2239p;
                    ((ViewOnKeyListenerC0547e) e6.f4474m).f7714K = true;
                    c0546d.f7702b.c(false);
                    ((ViewOnKeyListenerC0547e) e6.f4474m).f7714K = false;
                }
                MenuItemC0551i menuItemC0551i = (MenuItemC0551i) this.f2237n;
                if (menuItemC0551i.isEnabled() && menuItemC0551i.hasSubMenu()) {
                    ((MenuC0550h) this.f2238o).p(menuItemC0551i, null, 4);
                    return;
                }
                return;
        }
    }
}
