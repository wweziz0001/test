package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8373m;

    public /* synthetic */ Y(Object obj, int i) {
        this.f8372l = i;
        this.f8373m = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j5) {
        C0597j0 c0597j0;
        switch (this.f8372l) {
            case 0:
                if (i != -1 && (c0597j0 = ((AbstractC0587e0) this.f8373m).f8394n) != null) {
                    c0597j0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f8373m).m(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f8372l;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
