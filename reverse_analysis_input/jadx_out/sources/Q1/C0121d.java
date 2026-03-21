package Q1;

import b3.AbstractC0307a;
import java.util.Set;

/* JADX INFO: renamed from: Q1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0121d {
    public static final C0121d i = new C0121d(1, false, false, false, false, -1, -1, C3.p.f293l);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f1815h;

    public C0121d(int i5, boolean z4, boolean z5, boolean z6, boolean z7, long j5, long j6, Set set) {
        AbstractC0307a.r("requiredNetworkType", i5);
        N3.h.e(set, "contentUriTriggers");
        this.f1808a = i5;
        this.f1809b = z4;
        this.f1810c = z5;
        this.f1811d = z6;
        this.f1812e = z7;
        this.f1813f = j5;
        this.f1814g = j6;
        this.f1815h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0121d.class.equals(obj.getClass())) {
            return false;
        }
        C0121d c0121d = (C0121d) obj;
        if (this.f1809b == c0121d.f1809b && this.f1810c == c0121d.f1810c && this.f1811d == c0121d.f1811d && this.f1812e == c0121d.f1812e && this.f1813f == c0121d.f1813f && this.f1814g == c0121d.f1814g && this.f1808a == c0121d.f1808a) {
            return N3.h.a(this.f1815h, c0121d.f1815h);
        }
        return false;
    }

    public final int hashCode() {
        int iB = ((((((((O.i.b(this.f1808a) * 31) + (this.f1809b ? 1 : 0)) * 31) + (this.f1810c ? 1 : 0)) * 31) + (this.f1811d ? 1 : 0)) * 31) + (this.f1812e ? 1 : 0)) * 31;
        long j5 = this.f1813f;
        int i5 = (iB + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f1814g;
        return this.f1815h.hashCode() + ((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + AbstractC0307a.v(this.f1808a) + ", requiresCharging=" + this.f1809b + ", requiresDeviceIdle=" + this.f1810c + ", requiresBatteryNotLow=" + this.f1811d + ", requiresStorageNotLow=" + this.f1812e + ", contentTriggerUpdateDelayMillis=" + this.f1813f + ", contentTriggerMaxDelayMillis=" + this.f1814g + ", contentUriTriggers=" + this.f1815h + ", }";
    }

    public C0121d(C0121d c0121d) {
        N3.h.e(c0121d, "other");
        this.f1809b = c0121d.f1809b;
        this.f1810c = c0121d.f1810c;
        this.f1808a = c0121d.f1808a;
        this.f1811d = c0121d.f1811d;
        this.f1812e = c0121d.f1812e;
        this.f1815h = c0121d.f1815h;
        this.f1813f = c0121d.f1813f;
        this.f1814g = c0121d.f1814g;
    }
}
