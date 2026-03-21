package m;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: m.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0614s0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f8476a;

    public ViewOnFocusChangeListenerC0614s0(SearchView searchView) {
        this.f8476a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        SearchView searchView = this.f8476a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f3896V;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z4);
        }
    }
}
