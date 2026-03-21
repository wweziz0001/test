package a0;

import d0.AbstractC0370w;

/* JADX INFO: renamed from: a0.X, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0172X {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0172X f3269d = new C0172X(new C0171W());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3272c;

    static {
        AbstractC0370w.G(1);
        AbstractC0370w.G(2);
        AbstractC0370w.G(3);
    }

    public C0172X(C0171W c0171w) {
        this.f3270a = c0171w.f3266a;
        this.f3271b = c0171w.f3267b;
        this.f3272c = c0171w.f3268c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0172X.class != obj.getClass()) {
            return false;
        }
        C0172X c0172x = (C0172X) obj;
        return this.f3270a == c0172x.f3270a && this.f3271b == c0172x.f3271b && this.f3272c == c0172x.f3272c;
    }

    public final int hashCode() {
        return ((((this.f3270a + 31) * 31) + (this.f3271b ? 1 : 0)) * 31) + (this.f3272c ? 1 : 0);
    }
}
