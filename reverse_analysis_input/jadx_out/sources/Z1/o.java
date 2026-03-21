package Z1;

import Q1.C0121d;
import b3.AbstractC0307a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q1.g f3031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0121d f3035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3036h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f3037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f3038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f3041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f3043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f3044q;

    public o(String str, int i, Q1.g gVar, long j5, long j6, long j7, C0121d c0121d, int i5, int i6, long j8, long j9, int i7, int i8, long j10, int i9, ArrayList arrayList, ArrayList arrayList2) {
        N3.h.e(str, "id");
        AbstractC0307a.r("state", i);
        AbstractC0307a.r("backoffPolicy", i6);
        this.f3029a = str;
        this.f3030b = i;
        this.f3031c = gVar;
        this.f3032d = j5;
        this.f3033e = j6;
        this.f3034f = j7;
        this.f3035g = c0121d;
        this.f3036h = i5;
        this.i = i6;
        this.f3037j = j8;
        this.f3038k = j9;
        this.f3039l = i7;
        this.f3040m = i8;
        this.f3041n = j10;
        this.f3042o = i9;
        this.f3043p = arrayList;
        this.f3044q = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return N3.h.a(this.f3029a, oVar.f3029a) && this.f3030b == oVar.f3030b && this.f3031c.equals(oVar.f3031c) && this.f3032d == oVar.f3032d && this.f3033e == oVar.f3033e && this.f3034f == oVar.f3034f && this.f3035g.equals(oVar.f3035g) && this.f3036h == oVar.f3036h && this.i == oVar.i && this.f3037j == oVar.f3037j && this.f3038k == oVar.f3038k && this.f3039l == oVar.f3039l && this.f3040m == oVar.f3040m && this.f3041n == oVar.f3041n && this.f3042o == oVar.f3042o && this.f3043p.equals(oVar.f3043p) && this.f3044q.equals(oVar.f3044q);
    }

    public final int hashCode() {
        return this.f3044q.hashCode() + ((this.f3043p.hashCode() + ((Integer.hashCode(this.f3042o) + AbstractC0307a.f(this.f3041n, (Integer.hashCode(this.f3040m) + ((Integer.hashCode(this.f3039l) + AbstractC0307a.f(this.f3038k, AbstractC0307a.f(this.f3037j, (O.i.b(this.i) + ((Integer.hashCode(this.f3036h) + ((this.f3035g.hashCode() + AbstractC0307a.f(this.f3034f, AbstractC0307a.f(this.f3033e, AbstractC0307a.f(this.f3032d, (this.f3031c.hashCode() + ((O.i.b(this.f3030b) + (this.f3029a.hashCode() * 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f3029a + ", state=" + AbstractC0307a.x(this.f3030b) + ", output=" + this.f3031c + ", initialDelay=" + this.f3032d + ", intervalDuration=" + this.f3033e + ", flexDuration=" + this.f3034f + ", constraints=" + this.f3035g + ", runAttemptCount=" + this.f3036h + ", backoffPolicy=" + AbstractC0307a.u(this.i) + ", backoffDelayDuration=" + this.f3037j + ", lastEnqueueTime=" + this.f3038k + ", periodCount=" + this.f3039l + ", generation=" + this.f3040m + ", nextScheduleTimeOverride=" + this.f3041n + ", stopReason=" + this.f3042o + ", tags=" + this.f3043p + ", progress=" + this.f3044q + ')';
    }
}
