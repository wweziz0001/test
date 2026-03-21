package y0;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: y0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0994b implements m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f10834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f10835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10836n;

    public AbstractC0994b(long j5, long j6) {
        this.f10834l = j5;
        this.f10835m = j6;
        this.f10836n = j5 - 1;
    }

    public final void b() {
        long j5 = this.f10836n;
        if (j5 < this.f10834l || j5 > this.f10835m) {
            throw new NoSuchElementException();
        }
    }

    @Override // y0.m
    public final boolean next() {
        long j5 = this.f10836n + 1;
        this.f10836n = j5;
        return !(j5 > this.f10835m);
    }
}
