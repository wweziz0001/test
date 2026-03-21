package B0;

import d0.AbstractC0370w;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f194d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f191a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f192b = 65536;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f195e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a[] f196f = new a[100];

    public final synchronized void a(int i) {
        boolean z4 = i < this.f193c;
        this.f193c = i;
        if (z4) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, AbstractC0370w.f(this.f193c, this.f192b) - this.f194d);
        int i = this.f195e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f196f, iMax, i, (Object) null);
        this.f195e = iMax;
    }
}
