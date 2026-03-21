package i0;

import a0.AbstractC0169U;
import java.util.Arrays;
import x0.H;

/* JADX INFO: renamed from: i0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0477a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0169U f6353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f6355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0169U f6357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final H f6359h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6360j;

    public C0477a(long j5, AbstractC0169U abstractC0169U, int i, H h2, long j6, AbstractC0169U abstractC0169U2, int i5, H h5, long j7, long j8) {
        this.f6352a = j5;
        this.f6353b = abstractC0169U;
        this.f6354c = i;
        this.f6355d = h2;
        this.f6356e = j6;
        this.f6357f = abstractC0169U2;
        this.f6358g = i5;
        this.f6359h = h5;
        this.i = j7;
        this.f6360j = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0477a.class != obj.getClass()) {
            return false;
        }
        C0477a c0477a = (C0477a) obj;
        return this.f6352a == c0477a.f6352a && this.f6354c == c0477a.f6354c && this.f6356e == c0477a.f6356e && this.f6358g == c0477a.f6358g && this.i == c0477a.i && this.f6360j == c0477a.f6360j && i4.a.v(this.f6353b, c0477a.f6353b) && i4.a.v(this.f6355d, c0477a.f6355d) && i4.a.v(this.f6357f, c0477a.f6357f) && i4.a.v(this.f6359h, c0477a.f6359h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6352a), this.f6353b, Integer.valueOf(this.f6354c), this.f6355d, Long.valueOf(this.f6356e), this.f6357f, Integer.valueOf(this.f6358g), this.f6359h, Long.valueOf(this.i), Long.valueOf(this.f6360j)});
    }
}
