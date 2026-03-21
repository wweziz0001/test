package m;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import l.MenuItemC0551i;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8294l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8295m;

    public M0(S0 s02) {
        this.f8295m = s02;
        s02.f8310a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8294l) {
            case 0:
                O0 o02 = ((Toolbar) this.f8295m).f3982V;
                MenuItemC0551i menuItemC0551i = o02 == null ? null : o02.f8301m;
                if (menuItemC0551i != null) {
                    menuItemC0551i.collapseActionView();
                }
                break;
            default:
                S0 s02 = (S0) this.f8295m;
                if (s02.f8319k != null) {
                    s02.getClass();
                }
                break;
        }
    }

    public M0(Toolbar toolbar) {
        this.f8295m = toolbar;
    }
}
