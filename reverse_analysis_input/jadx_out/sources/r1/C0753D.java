package r1;

import D.C0002b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: r1.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0753D extends C0002b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0754E f9431d;

    public C0753D(C0754E c0754e) {
        this.f9431d = c0754e;
    }

    @Override // D.C0002b
    public final void b(View view, E.j jVar) {
        this.f328a.onInitializeAccessibilityNodeInfo(view, jVar.f631a);
        C0754E c0754e = this.f9431d;
        if (c0754e.f9432d.l()) {
            return;
        }
        RecyclerView recyclerView = c0754e.f9432d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // D.C0002b
    public final boolean c(View view, int i, Bundle bundle) {
        if (super.c(view, i, bundle)) {
            return true;
        }
        C0754E c0754e = this.f9431d;
        if (!c0754e.f9432d.l()) {
            RecyclerView recyclerView = c0754e.f9432d;
            if (recyclerView.getLayoutManager() != null) {
                io.flutter.plugin.platform.c cVar = recyclerView.getLayoutManager().f9512b.f4730l;
            }
        }
        return false;
    }
}
