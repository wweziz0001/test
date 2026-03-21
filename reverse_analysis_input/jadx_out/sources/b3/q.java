package b3;

import Q1.C0121d;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f4944h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0121d f4946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0310d f4947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f4949n;

    public q(boolean z4, String str, String str2, String str3, int i, long j5, long j6, long j7, C0121d c0121d, C0310d c0310d, int i5, String str4) {
        AbstractC0307a.r("existingWorkPolicy", i);
        this.f4939c = z4;
        this.f4940d = str;
        this.f4941e = str2;
        this.f4942f = str3;
        this.f4943g = i;
        this.f4944h = j5;
        this.i = j6;
        this.f4945j = j7;
        this.f4946k = c0121d;
        this.f4947l = c0310d;
        this.f4948m = i5;
        this.f4949n = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f4939c == qVar.f4939c && this.f4940d.equals(qVar.f4940d) && this.f4941e.equals(qVar.f4941e) && N3.h.a(this.f4942f, qVar.f4942f) && this.f4943g == qVar.f4943g && this.f4944h == qVar.f4944h && this.i == qVar.i && this.f4945j == qVar.f4945j && this.f4946k.equals(qVar.f4946k) && N3.h.a(this.f4947l, qVar.f4947l) && this.f4948m == qVar.f4948m && N3.h.a(this.f4949n, qVar.f4949n);
    }

    public final int hashCode() {
        int iE = AbstractC0307a.e(AbstractC0307a.e(Boolean.hashCode(this.f4939c) * 31, this.f4940d, 31), this.f4941e, 31);
        String str = this.f4942f;
        int iHashCode = (this.f4946k.hashCode() + AbstractC0307a.f(this.f4945j, AbstractC0307a.f(this.i, AbstractC0307a.f(this.f4944h, (O.i.b(this.f4943g) + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31), 31)) * 31;
        C0310d c0310d = this.f4947l;
        int iHashCode2 = (iHashCode + (c0310d == null ? 0 : c0310d.hashCode())) * 31;
        int i = this.f4948m;
        int iB = (iHashCode2 + (i == 0 ? 0 : O.i.b(i))) * 31;
        String str2 = this.f4949n;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodicTask(isInDebugMode=");
        sb.append(this.f4939c);
        sb.append(", uniqueName=");
        sb.append(this.f4940d);
        sb.append(", taskName=");
        sb.append(this.f4941e);
        sb.append(", tag=");
        sb.append(this.f4942f);
        sb.append(", existingWorkPolicy=");
        int i = this.f4943g;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "CANCEL_AND_REENQUEUE" : "UPDATE" : "KEEP" : "REPLACE");
        sb.append(", frequencyInSeconds=");
        sb.append(this.f4944h);
        sb.append(", flexIntervalInSeconds=");
        sb.append(this.i);
        sb.append(", initialDelaySeconds=");
        sb.append(this.f4945j);
        sb.append(", constraintsConfig=");
        sb.append(this.f4946k);
        sb.append(", backoffPolicyConfig=");
        sb.append(this.f4947l);
        sb.append(", outOfQuotaPolicy=");
        sb.append(AbstractC0307a.w(this.f4948m));
        sb.append(", payload=");
        sb.append(this.f4949n);
        sb.append(')');
        return sb.toString();
    }
}
