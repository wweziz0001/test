package m;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: m.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0612r0 implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SearchView f8475m;

    public /* synthetic */ RunnableC0612r0(SearchView searchView, int i) {
        this.f8474l = i;
        this.f8475m = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8474l) {
            case 0:
                this.f8475m.q();
                break;
            default:
                J.c cVar = this.f8475m.f3900c0;
                if (cVar instanceof D0) {
                    cVar.b(null);
                }
                break;
        }
    }
}
