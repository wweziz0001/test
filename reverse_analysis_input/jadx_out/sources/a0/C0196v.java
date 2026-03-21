package a0;

import d0.AbstractC0370w;

/* JADX INFO: renamed from: a0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0196v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3459e;

    static {
        new C0195u().a();
        AbstractC0370w.G(0);
        AbstractC0370w.G(1);
        AbstractC0370w.G(2);
        AbstractC0370w.G(3);
        AbstractC0370w.G(4);
    }

    public C0196v(C0195u c0195u) {
        long j5 = c0195u.f3450a;
        long j6 = c0195u.f3451b;
        long j7 = c0195u.f3452c;
        float f2 = c0195u.f3453d;
        float f5 = c0195u.f3454e;
        this.f3455a = j5;
        this.f3456b = j6;
        this.f3457c = j7;
        this.f3458d = f2;
        this.f3459e = f5;
    }

    public final C0195u a() {
        C0195u c0195u = new C0195u();
        c0195u.f3450a = this.f3455a;
        c0195u.f3451b = this.f3456b;
        c0195u.f3452c = this.f3457c;
        c0195u.f3453d = this.f3458d;
        c0195u.f3454e = this.f3459e;
        return c0195u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0196v)) {
            return false;
        }
        C0196v c0196v = (C0196v) obj;
        return this.f3455a == c0196v.f3455a && this.f3456b == c0196v.f3456b && this.f3457c == c0196v.f3457c && this.f3458d == c0196v.f3458d && this.f3459e == c0196v.f3459e;
    }

    public final int hashCode() {
        long j5 = this.f3455a;
        long j6 = this.f3456b;
        int i = ((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f3457c;
        int i5 = (i + ((int) ((j7 >>> 32) ^ j7))) * 31;
        float f2 = this.f3458d;
        int iFloatToIntBits = (i5 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f5 = this.f3459e;
        return iFloatToIntBits + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0);
    }
}
