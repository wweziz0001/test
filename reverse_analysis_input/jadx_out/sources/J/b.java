package J;

import android.database.DataSetObserver;
import m.AbstractC0587e0;
import m.D0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1084b;

    public /* synthetic */ b(Object obj, int i) {
        this.f1083a = i;
        this.f1084b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1083a) {
            case 0:
                D0 d02 = (D0) this.f1084b;
                d02.f1085l = true;
                d02.notifyDataSetChanged();
                break;
            default:
                AbstractC0587e0 abstractC0587e0 = (AbstractC0587e0) this.f1084b;
                if (abstractC0587e0.f8391G.isShowing()) {
                    abstractC0587e0.c();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1083a) {
            case 0:
                D0 d02 = (D0) this.f1084b;
                d02.f1085l = false;
                d02.notifyDataSetInvalidated();
                break;
            default:
                ((AbstractC0587e0) this.f1084b).dismiss();
                break;
        }
    }
}
