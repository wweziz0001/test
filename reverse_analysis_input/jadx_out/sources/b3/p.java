package b3;

import Q1.C0121d;

/* JADX INFO: loaded from: classes.dex */
public final class p extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f4935h;
    public final C0121d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0310d f4936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4938l;

    public p(boolean z4, String str, String str2, String str3, int i, long j5, C0121d c0121d, C0310d c0310d, int i5, String str4) {
        AbstractC0307a.r("existingWorkPolicy", i);
        this.f4930c = z4;
        this.f4931d = str;
        this.f4932e = str2;
        this.f4933f = str3;
        this.f4934g = i;
        this.f4935h = j5;
        this.i = c0121d;
        this.f4936j = c0310d;
        this.f4937k = i5;
        this.f4938l = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f4930c == pVar.f4930c && this.f4931d.equals(pVar.f4931d) && this.f4932e.equals(pVar.f4932e) && N3.h.a(this.f4933f, pVar.f4933f) && this.f4934g == pVar.f4934g && this.f4935h == pVar.f4935h && this.i.equals(pVar.i) && N3.h.a(this.f4936j, pVar.f4936j) && this.f4937k == pVar.f4937k && N3.h.a(this.f4938l, pVar.f4938l);
    }

    public final int hashCode() {
        int iE = AbstractC0307a.e(AbstractC0307a.e(Boolean.hashCode(this.f4930c) * 31, this.f4931d, 31), this.f4932e, 31);
        String str = this.f4933f;
        int iHashCode = (this.i.hashCode() + AbstractC0307a.f(this.f4935h, (O.i.b(this.f4934g) + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31)) * 31;
        C0310d c0310d = this.f4936j;
        int iHashCode2 = (iHashCode + (c0310d == null ? 0 : c0310d.hashCode())) * 31;
        int i = this.f4937k;
        int iB = (iHashCode2 + (i == 0 ? 0 : O.i.b(i))) * 31;
        String str2 = this.f4938l;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneOffTask(isInDebugMode=");
        sb.append(this.f4930c);
        sb.append(", uniqueName=");
        sb.append(this.f4931d);
        sb.append(", taskName=");
        sb.append(this.f4932e);
        sb.append(", tag=");
        sb.append(this.f4933f);
        sb.append(", existingWorkPolicy=");
        int i = this.f4934g;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "APPEND_OR_REPLACE" : "APPEND" : "KEEP" : "REPLACE");
        sb.append(", initialDelaySeconds=");
        sb.append(this.f4935h);
        sb.append(", constraintsConfig=");
        sb.append(this.i);
        sb.append(", backoffPolicyConfig=");
        sb.append(this.f4936j);
        sb.append(", outOfQuotaPolicy=");
        sb.append(AbstractC0307a.w(this.f4937k));
        sb.append(", payload=");
        sb.append(this.f4938l);
        sb.append(')');
        return sb.toString();
    }
}
