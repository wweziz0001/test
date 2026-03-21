package l0;

import d0.AbstractC0360m;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7865d;

    public j(long j5, long j6, String str) {
        this.f7864c = str == null ? "" : str;
        this.f7862a = j5;
        this.f7863b = j6;
    }

    public final j a(j jVar, String str) {
        long j5;
        String strV = AbstractC0360m.v(str, this.f7864c);
        if (jVar == null || !strV.equals(AbstractC0360m.v(str, jVar.f7864c))) {
            return null;
        }
        long j6 = this.f7863b;
        long j7 = jVar.f7863b;
        if (j6 != -1) {
            long j8 = this.f7862a;
            j5 = j6;
            if (j8 + j6 == jVar.f7862a) {
                return new j(j8, j7 == -1 ? -1L : j5 + j7, strV);
            }
        } else {
            j5 = j6;
        }
        if (j7 != -1) {
            long j9 = jVar.f7862a;
            if (j9 + j7 == this.f7862a) {
                return new j(j9, j5 == -1 ? -1L : j7 + j5, strV);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f7862a == jVar.f7862a && this.f7863b == jVar.f7863b && this.f7864c.equals(jVar.f7864c);
    }

    public final int hashCode() {
        if (this.f7865d == 0) {
            this.f7865d = this.f7864c.hashCode() + ((((527 + ((int) this.f7862a)) * 31) + ((int) this.f7863b)) * 31);
        }
        return this.f7865d;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.f7864c + ", start=" + this.f7862a + ", length=" + this.f7863b + ")";
    }
}
