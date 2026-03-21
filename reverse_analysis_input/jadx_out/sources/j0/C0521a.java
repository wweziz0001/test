package j0;

import d0.AbstractC0370w;
import java.util.Objects;
import java.util.Set;
import m2.L;
import m2.M;
import m2.q0;

/* JADX INFO: renamed from: j0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0521a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0521a f7246d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f7249c;

    static {
        C0521a c0521a;
        if (AbstractC0370w.f5326a >= 33) {
            L l3 = new L(4);
            for (int i = 1; i <= 10; i++) {
                l3.a(Integer.valueOf(AbstractC0370w.r(i)));
            }
            c0521a = new C0521a(2, l3.g());
        } else {
            c0521a = new C0521a(2, 10);
        }
        f7246d = c0521a;
    }

    public C0521a(int i, Set set) {
        this.f7247a = i;
        M mO = M.o(set);
        this.f7249c = mO;
        q0 it = mO.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f7248b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0521a)) {
            return false;
        }
        C0521a c0521a = (C0521a) obj;
        if (this.f7247a == c0521a.f7247a && this.f7248b == c0521a.f7248b) {
            int i = AbstractC0370w.f5326a;
            if (Objects.equals(this.f7249c, c0521a.f7249c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f7247a * 31) + this.f7248b) * 31;
        M m4 = this.f7249c;
        return i + (m4 == null ? 0 : m4.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f7247a + ", maxChannelCount=" + this.f7248b + ", channelMasks=" + this.f7249c + "]";
    }

    public C0521a(int i, int i5) {
        this.f7247a = i;
        this.f7248b = i5;
        this.f7249c = null;
    }
}
