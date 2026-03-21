package m;

import androidx.appcompat.widget.Toolbar;
import l.MenuItemC0551i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K0 implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Toolbar f8289m;

    public /* synthetic */ K0(Toolbar toolbar, int i) {
        this.f8288l = i;
        this.f8289m = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8288l) {
            case 0:
                O0 o02 = this.f8289m.f3982V;
                MenuItemC0551i menuItemC0551i = o02 == null ? null : o02.f8301m;
                if (menuItemC0551i != null) {
                    menuItemC0551i.collapseActionView();
                }
                break;
            default:
                this.f8289m.m();
                break;
        }
    }
}
