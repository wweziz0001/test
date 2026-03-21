package h0;

import android.content.Context;

/* JADX INFO: renamed from: h0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0452c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6103c;

    public void a(double d5, double d6) {
        boolean z4 = this.f6101a;
        double[] dArr = (double[]) this.f6102b;
        double d7 = 1.0d;
        if (!z4) {
            d7 = 1.0d / (((dArr[7] * d6) + (dArr[3] * d5)) + dArr[15]);
        }
        double d8 = ((dArr[4] * d6) + (dArr[0] * d5) + dArr[12]) * d7;
        double d9 = ((dArr[5] * d6) + (dArr[1] * d5) + dArr[13]) * d7;
        double[] dArr2 = (double[]) this.f6103c;
        if (d8 < dArr2[0]) {
            dArr2[0] = d8;
        } else if (d8 > dArr2[1]) {
            dArr2[1] = d8;
        }
        if (d9 < dArr2[2]) {
            dArr2[2] = d9;
        } else if (d9 > dArr2[3]) {
            dArr2[3] = d9;
        }
    }

    public void b() {
        if (this.f6101a) {
            ((Context) this.f6102b).unregisterReceiver((RunnableC0451b) this.f6103c);
            this.f6101a = false;
        }
    }
}
