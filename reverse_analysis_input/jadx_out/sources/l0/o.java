package l0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f7879j;

    public o(j jVar, long j5, long j6, long j7, long j8, List list, long j9, List list2, long j10, long j11) {
        super(jVar, j5, j6, j7, j8, list, j9, j10, j11);
        this.f7879j = list2;
    }

    @Override // l0.n
    public final long d(long j5) {
        return this.f7879j.size();
    }

    @Override // l0.n
    public final j h(k kVar, long j5) {
        return (j) this.f7879j.get((int) (j5 - this.f7874d));
    }

    @Override // l0.n
    public final boolean i() {
        return true;
    }
}
