package m;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: m.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0581b0 implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8377l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0587e0 f8378m;

    public /* synthetic */ RunnableC0581b0(AbstractC0587e0 abstractC0587e0, int i) {
        this.f8377l = i;
        this.f8378m = abstractC0587e0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0587e0 abstractC0587e0 = this.f8378m;
        switch (this.f8377l) {
            case 0:
                C0597j0 c0597j0 = abstractC0587e0.f8394n;
                if (c0597j0 != null) {
                    c0597j0.setListSelectionHidden(true);
                    c0597j0.requestLayout();
                }
                break;
            default:
                C0597j0 c0597j02 = abstractC0587e0.f8394n;
                if (c0597j02 != null) {
                    Field field = D.I.f300a;
                    if (c0597j02.isAttachedToWindow() && abstractC0587e0.f8394n.getCount() > abstractC0587e0.f8394n.getChildCount() && abstractC0587e0.f8394n.getChildCount() <= Integer.MAX_VALUE) {
                        abstractC0587e0.f8391G.setInputMethodMode(2);
                        abstractC0587e0.c();
                        break;
                    }
                }
                break;
        }
    }
}
