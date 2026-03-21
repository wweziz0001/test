package n0;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends A0.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8766g;

    @Override // A0.w
    public final int e() {
        return 0;
    }

    @Override // A0.w
    public final int f() {
        return this.f8766g;
    }

    @Override // A0.w
    public final Object l() {
        return null;
    }

    @Override // A0.w
    public final void s(long j5, long j6, long j7, List list, y0.m[] mVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (o(jElapsedRealtime, this.f8766g)) {
            for (int i = this.f65b - 1; i >= 0; i--) {
                if (!o(jElapsedRealtime, i)) {
                    this.f8766g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
