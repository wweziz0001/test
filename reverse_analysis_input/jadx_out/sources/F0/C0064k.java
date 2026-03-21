package F0;

import d0.AbstractC0370w;
import java.util.Arrays;

/* JADX INFO: renamed from: F0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0064k implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f788f;

    public C0064k(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f784b = iArr;
        this.f785c = jArr;
        this.f786d = jArr2;
        this.f787e = jArr3;
        int length = iArr.length;
        this.f783a = length;
        if (length > 0) {
            this.f788f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f788f = 0L;
        }
    }

    @Override // F0.E
    public final boolean c() {
        return true;
    }

    @Override // F0.E
    public final D g(long j5) {
        long[] jArr = this.f787e;
        int iE = AbstractC0370w.e(jArr, j5, true);
        long j6 = jArr[iE];
        long[] jArr2 = this.f785c;
        F f2 = new F(j6, jArr2[iE]);
        if (j6 >= j5 || iE == this.f783a - 1) {
            return new D(f2, f2);
        }
        int i = iE + 1;
        return new D(f2, new F(jArr[i], jArr2[i]));
    }

    @Override // F0.E
    public final long i() {
        return this.f788f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f783a + ", sizes=" + Arrays.toString(this.f784b) + ", offsets=" + Arrays.toString(this.f785c) + ", timeUs=" + Arrays.toString(this.f787e) + ", durationsUs=" + Arrays.toString(this.f786d) + ")";
    }
}
