package m;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: renamed from: m.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0583c0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0587e0 f8381a;

    public C0583c0(AbstractC0587e0 abstractC0587e0) {
        this.f8381a = abstractC0587e0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            AbstractC0587e0 abstractC0587e0 = this.f8381a;
            if (abstractC0587e0.f8391G.getInputMethodMode() == 2 || abstractC0587e0.f8391G.getContentView() == null) {
                return;
            }
            Handler handler = abstractC0587e0.f8387C;
            RunnableC0581b0 runnableC0581b0 = abstractC0587e0.y;
            handler.removeCallbacks(runnableC0581b0);
            runnableC0581b0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i5, int i6) {
    }
}
