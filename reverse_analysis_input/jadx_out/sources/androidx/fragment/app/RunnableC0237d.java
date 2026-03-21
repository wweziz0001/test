package androidx.fragment.app;

import b3.AbstractC0307a;

/* JADX INFO: renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0237d implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0246m f4372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y f4373n;

    public /* synthetic */ RunnableC0237d(C0246m c0246m, Y y, int i) {
        this.f4371l = i;
        this.f4372m = c0246m;
        this.f4373n = y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4371l) {
            case 0:
                C0246m c0246m = this.f4372m;
                N3.h.e(c0246m, "this$0");
                Y y = this.f4373n;
                N3.h.e(y, "$operation");
                c0246m.a(y);
                break;
            case 1:
                C0246m c0246m2 = this.f4372m;
                N3.h.e(c0246m2, "this$0");
                Y y4 = this.f4373n;
                if (c0246m2.f4392b.contains(y4)) {
                    int i = y4.f4327a;
                    io.flutter.embedding.android.D d5 = y4.f4329c.f4425Q;
                    N3.h.d(d5, "operation.fragment.mView");
                    AbstractC0307a.a(i, d5, c0246m2.f4391a);
                }
                break;
            default:
                C0246m c0246m3 = this.f4372m;
                N3.h.e(c0246m3, "this$0");
                Y y5 = this.f4373n;
                c0246m3.f4392b.remove(y5);
                c0246m3.f4393c.remove(y5);
                break;
        }
    }
}
