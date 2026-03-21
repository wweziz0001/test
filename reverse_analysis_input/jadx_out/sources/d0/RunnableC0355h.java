package d0;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: d0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0355h implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5290o;

    public /* synthetic */ RunnableC0355h(Object obj, int i, Object obj2, int i5) {
        this.f5287l = i5;
        this.f5289n = obj;
        this.f5288m = i;
        this.f5290o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5287l) {
            case 0:
                for (C0358k c0358k : (CopyOnWriteArraySet) this.f5289n) {
                    if (!c0358k.f5294d) {
                        int i = this.f5288m;
                        if (i != -1) {
                            c0358k.f5292b.a(i);
                        }
                        c0358k.f5293c = true;
                        ((InterfaceC0356i) this.f5290o).c(c0358k.f5291a);
                    }
                }
                break;
            default:
                ((p1.a) this.f5289n).f9164b.f(this.f5288m, (Serializable) this.f5290o);
                break;
        }
    }
}
