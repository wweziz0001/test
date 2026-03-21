package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0229v f4105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f4107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4108d;

    public U(AbstractC0229v abstractC0229v, String str, Object[] objArr) {
        this.f4105a = abstractC0229v;
        this.f4106b = str;
        this.f4107c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f4108d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i5 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 55296) {
                this.f4108d = i | (cCharAt2 << i6);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i6;
                i6 += 13;
                i5 = i7;
            }
        }
    }

    public final AbstractC0209a a() {
        return this.f4105a;
    }

    public final Object[] b() {
        return this.f4107c;
    }

    public final String c() {
        return this.f4106b;
    }

    public final int d() {
        int i = this.f4108d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
