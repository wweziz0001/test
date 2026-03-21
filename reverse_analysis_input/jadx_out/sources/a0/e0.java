package a0;

import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f3333d = new e0(1.0f, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3336c;

    static {
        AbstractC0370w.G(0);
        AbstractC0370w.G(1);
        AbstractC0370w.G(3);
    }

    public e0(float f2, int i, int i5) {
        this.f3334a = i;
        this.f3335b = i5;
        this.f3336c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f3334a == e0Var.f3334a && this.f3335b == e0Var.f3335b && this.f3336c == e0Var.f3336c;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3336c) + ((((217 + this.f3334a) * 31) + this.f3335b) * 31);
    }
}
