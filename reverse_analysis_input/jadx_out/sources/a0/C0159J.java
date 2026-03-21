package a0;

import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.Locale;

/* JADX INFO: renamed from: a0.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0159J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0159J f3219d = new C0159J(1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3222c;

    static {
        AbstractC0370w.G(0);
        AbstractC0370w.G(1);
    }

    public C0159J(float f2) {
        this(f2, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0159J.class != obj.getClass()) {
            return false;
        }
        C0159J c0159j = (C0159J) obj;
        return this.f3220a == c0159j.f3220a && this.f3221b == c0159j.f3221b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3221b) + ((Float.floatToRawIntBits(this.f3220a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f3220a), Float.valueOf(this.f3221b)};
        int i = AbstractC0370w.f5326a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public C0159J(float f2, float f5) {
        AbstractC0360m.c(f2 > 0.0f);
        AbstractC0360m.c(f5 > 0.0f);
        this.f3220a = f2;
        this.f3221b = f5;
        this.f3222c = Math.round(f2 * 1000.0f);
    }
}
