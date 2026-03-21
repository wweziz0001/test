package A0;

import a0.C0170V;
import a0.C0190p;
import android.os.SystemClock;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0170V f64a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f66c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0190p[] f67d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f68e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f69f;

    public d(C0170V c0170v, int[] iArr) {
        int i = 0;
        AbstractC0360m.h(iArr.length > 0);
        c0170v.getClass();
        this.f64a = c0170v;
        int length = iArr.length;
        this.f65b = length;
        this.f67d = new C0190p[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f67d[i5] = c0170v.f3264d[iArr[i5]];
        }
        Arrays.sort(this.f67d, new A.c(1));
        this.f66c = new int[this.f65b];
        while (true) {
            int i6 = this.f65b;
            if (i >= i6) {
                this.f68e = new long[i6];
                return;
            } else {
                this.f66c[i] = c0170v.b(this.f67d[i]);
                i++;
            }
        }
    }

    @Override // A0.w
    public final int a() {
        return this.f66c[f()];
    }

    @Override // A0.w
    public final C0170V b() {
        return this.f64a;
    }

    @Override // A0.w
    public final C0190p d() {
        return this.f67d[f()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f64a.equals(dVar.f64a) && Arrays.equals(this.f66c, dVar.f66c);
    }

    @Override // A0.w
    public final C0190p g(int i) {
        return this.f67d[i];
    }

    public final int hashCode() {
        if (this.f69f == 0) {
            this.f69f = Arrays.hashCode(this.f66c) + (System.identityHashCode(this.f64a) * 31);
        }
        return this.f69f;
    }

    @Override // A0.w
    public final int k(int i) {
        return this.f66c[i];
    }

    @Override // A0.w
    public final int length() {
        return this.f66c.length;
    }

    @Override // A0.w
    public int n(long j5, List list) {
        return list.size();
    }

    @Override // A0.w
    public final boolean o(long j5, int i) {
        return this.f68e[i] > j5;
    }

    @Override // A0.w
    public final int p(C0190p c0190p) {
        for (int i = 0; i < this.f65b; i++) {
            if (this.f67d[i] == c0190p) {
                return i;
            }
        }
        return -1;
    }

    @Override // A0.w
    public final boolean q(long j5, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zO = o(jElapsedRealtime, i);
        int i5 = 0;
        while (i5 < this.f65b && !zO) {
            zO = (i5 == i || o(jElapsedRealtime, i5)) ? false : true;
            i5++;
        }
        if (!zO) {
            return false;
        }
        long[] jArr = this.f68e;
        long j6 = jArr[i];
        int i6 = AbstractC0370w.f5326a;
        long j7 = jElapsedRealtime + j5;
        if (((j5 ^ j7) & (jElapsedRealtime ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j6, j7);
        return true;
    }

    @Override // A0.w
    public final int t(int i) {
        for (int i5 = 0; i5 < this.f65b; i5++) {
            if (this.f66c[i5] == i) {
                return i5;
            }
        }
        return -1;
    }

    @Override // A0.w
    public void disable() {
    }

    @Override // A0.w
    public void h() {
    }

    @Override // A0.w
    public final void c(boolean z4) {
    }

    @Override // A0.w
    public void j(float f2) {
    }
}
