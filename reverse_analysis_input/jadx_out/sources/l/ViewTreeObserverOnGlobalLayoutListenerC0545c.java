package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import m.C0599k0;

/* JADX INFO: renamed from: l.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0545c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0552j f7700m;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0545c(AbstractC0552j abstractC0552j, int i) {
        this.f7699l = i;
        this.f7700m = abstractC0552j;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f7699l) {
            case 0:
                ViewOnKeyListenerC0547e viewOnKeyListenerC0547e = (ViewOnKeyListenerC0547e) this.f7700m;
                if (viewOnKeyListenerC0547e.g()) {
                    ArrayList arrayList = viewOnKeyListenerC0547e.f7721s;
                    if (arrayList.size() > 0 && !((C0546d) arrayList.get(0)).f7701a.f8390F) {
                        View view = viewOnKeyListenerC0547e.f7727z;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0546d) it.next()).f7701a.c();
                            }
                        } else {
                            viewOnKeyListenerC0547e.dismiss();
                        }
                        break;
                    }
                }
                break;
            default:
                ViewOnKeyListenerC0560r viewOnKeyListenerC0560r = (ViewOnKeyListenerC0560r) this.f7700m;
                if (viewOnKeyListenerC0560r.g()) {
                    C0599k0 c0599k0 = viewOnKeyListenerC0560r.f7803s;
                    if (!c0599k0.f8390F) {
                        View view2 = viewOnKeyListenerC0560r.f7808x;
                        if (view2 != null && view2.isShown()) {
                            c0599k0.c();
                        } else {
                            viewOnKeyListenerC0560r.dismiss();
                        }
                    }
                }
                break;
        }
    }
}
