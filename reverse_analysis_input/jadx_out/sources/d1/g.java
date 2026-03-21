package d1;

import c1.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements Comparable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f5417v;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (e(4) == gVar.e(4)) {
            long j5 = this.f5789r - gVar.f5789r;
            if (j5 == 0) {
                j5 = this.f5417v - gVar.f5417v;
                if (j5 == 0) {
                    return 0;
                }
            }
            if (j5 <= 0) {
                return -1;
            }
        } else if (!e(4)) {
            return -1;
        }
        return 1;
    }
}
