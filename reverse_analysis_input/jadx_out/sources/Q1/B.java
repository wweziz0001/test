package Q1;

import b3.AbstractC0307a;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f1774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f1776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f1777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f1778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0121d f1781h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final A f1782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f1783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1784l;

    public B(UUID uuid, int i, HashSet hashSet, g gVar, g gVar2, int i5, int i6, C0121d c0121d, long j5, A a5, long j6, int i7) {
        AbstractC0307a.r("state", i);
        this.f1774a = uuid;
        this.f1775b = i;
        this.f1776c = hashSet;
        this.f1777d = gVar;
        this.f1778e = gVar2;
        this.f1779f = i5;
        this.f1780g = i6;
        this.f1781h = c0121d;
        this.i = j5;
        this.f1782j = a5;
        this.f1783k = j6;
        this.f1784l = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !B.class.equals(obj.getClass())) {
            return false;
        }
        B b4 = (B) obj;
        if (this.f1779f == b4.f1779f && this.f1780g == b4.f1780g && this.f1774a.equals(b4.f1774a) && this.f1775b == b4.f1775b && this.f1777d.equals(b4.f1777d) && this.f1781h.equals(b4.f1781h) && this.i == b4.i && N3.h.a(this.f1782j, b4.f1782j) && this.f1783k == b4.f1783k && this.f1784l == b4.f1784l && this.f1776c.equals(b4.f1776c)) {
            return this.f1778e.equals(b4.f1778e);
        }
        return false;
    }

    public final int hashCode() {
        int iF = AbstractC0307a.f(this.i, (this.f1781h.hashCode() + ((((((this.f1778e.hashCode() + ((this.f1776c.hashCode() + ((this.f1777d.hashCode() + ((O.i.b(this.f1775b) + (this.f1774a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f1779f) * 31) + this.f1780g) * 31)) * 31, 31);
        A a5 = this.f1782j;
        return Integer.hashCode(this.f1784l) + AbstractC0307a.f(this.f1783k, (iF + (a5 != null ? a5.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f1774a + "', state=" + AbstractC0307a.x(this.f1775b) + ", outputData=" + this.f1777d + ", tags=" + this.f1776c + ", progress=" + this.f1778e + ", runAttemptCount=" + this.f1779f + ", generation=" + this.f1780g + ", constraints=" + this.f1781h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.f1782j + ", nextScheduleTimeMillis=" + this.f1783k + "}, stopReason=" + this.f1784l;
    }
}
