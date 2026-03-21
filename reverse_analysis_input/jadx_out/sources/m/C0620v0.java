package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: m.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0620v0 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchView f8479l;

    public C0620v0(SearchView searchView) {
        this.f8479l = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j5) {
        this.f8479l.l(i);
    }
}
