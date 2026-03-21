package a0;

import D.C0015o;
import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: renamed from: a0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0183i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3351b;

    static {
        C0015o c0015o = new C0015o(1);
        AbstractC0360m.c(c0015o.f360b <= c0015o.f361c);
        new C0183i(c0015o);
        AbstractC0370w.G(0);
        AbstractC0370w.G(1);
        AbstractC0370w.G(2);
        AbstractC0370w.G(3);
    }

    public C0183i(C0015o c0015o) {
        c0015o.getClass();
        this.f3350a = c0015o.f360b;
        this.f3351b = c0015o.f361c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0183i)) {
            return false;
        }
        C0183i c0183i = (C0183i) obj;
        c0183i.getClass();
        if (this.f3350a != c0183i.f3350a || this.f3351b != c0183i.f3351b) {
            return false;
        }
        int i = AbstractC0370w.f5326a;
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3350a) * 31) + this.f3351b) * 31;
    }
}
