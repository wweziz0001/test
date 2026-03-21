package h0;

import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.H f6062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6069h;
    public final boolean i;

    public W(x0.H h2, long j5, long j6, long j7, long j8, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean z8 = true;
        AbstractC0360m.c(!z7 || z5);
        AbstractC0360m.c(!z6 || z5);
        if (z4 && (z5 || z6 || z7)) {
            z8 = false;
        }
        AbstractC0360m.c(z8);
        this.f6062a = h2;
        this.f6063b = j5;
        this.f6064c = j6;
        this.f6065d = j7;
        this.f6066e = j8;
        this.f6067f = z4;
        this.f6068g = z5;
        this.f6069h = z6;
        this.i = z7;
    }

    public final W a(long j5) {
        if (j5 == this.f6064c) {
            return this;
        }
        return new W(this.f6062a, this.f6063b, j5, this.f6065d, this.f6066e, this.f6067f, this.f6068g, this.f6069h, this.i);
    }

    public final W b(long j5) {
        if (j5 == this.f6063b) {
            return this;
        }
        return new W(this.f6062a, j5, this.f6064c, this.f6065d, this.f6066e, this.f6067f, this.f6068g, this.f6069h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w4 = (W) obj;
        if (this.f6063b == w4.f6063b && this.f6064c == w4.f6064c && this.f6065d == w4.f6065d && this.f6066e == w4.f6066e && this.f6067f == w4.f6067f && this.f6068g == w4.f6068g && this.f6069h == w4.f6069h && this.i == w4.i) {
            int i = AbstractC0370w.f5326a;
            if (Objects.equals(this.f6062a, w4.f6062a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f6062a.hashCode() + 527) * 31) + ((int) this.f6063b)) * 31) + ((int) this.f6064c)) * 31) + ((int) this.f6065d)) * 31) + ((int) this.f6066e)) * 31) + (this.f6067f ? 1 : 0)) * 31) + (this.f6068g ? 1 : 0)) * 31) + (this.f6069h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
