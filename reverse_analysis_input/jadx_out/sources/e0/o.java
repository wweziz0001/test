package e0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Comparable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5550m = -9223372036854775807L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f5549l = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f5550m, ((o) obj).f5550m);
    }
}
