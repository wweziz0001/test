package Q2;

import B0.l;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    RSA_ECB_PKCS1Padding(new l(16), 1),
    /* JADX INFO: Fake field, exist only in values array */
    RSA_ECB_OAEPwithSHA_256andMGF1Padding(new l(17), 23);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f1845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1846m;

    a(l lVar, int i) {
        this.f1845l = lVar;
        this.f1846m = i;
    }
}
