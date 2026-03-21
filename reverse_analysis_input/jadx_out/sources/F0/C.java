package F0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f686g;

    public boolean a(int i) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!((i & (-2097152)) == -2097152) || (i5 = (i >>> 19) & 3) == 1 || (i6 = (i >>> 17) & 3) == 0 || (i7 = (i >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f680a = i5;
        this.f686g = AbstractC0055b.f736s[3 - i6];
        int i9 = AbstractC0055b.f737t[i8];
        this.f682c = i9;
        if (i5 == 2) {
            this.f682c = i9 / 2;
        } else if (i5 == 0) {
            this.f682c = i9 / 4;
        }
        int i10 = (i >>> 9) & 1;
        int i11 = 1152;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    throw new IllegalArgumentException();
                }
                i11 = 384;
            }
        } else if (i5 != 3) {
            i11 = 576;
        }
        this.f685f = i11;
        if (i6 == 3) {
            int i12 = i5 == 3 ? AbstractC0055b.f738u[i7 - 1] : AbstractC0055b.f739v[i7 - 1];
            this.f684e = i12;
            this.f681b = (((i12 * 12) / this.f682c) + i10) * 4;
        } else {
            if (i5 == 3) {
                int i13 = i6 == 2 ? AbstractC0055b.f740w[i7 - 1] : AbstractC0055b.f741x[i7 - 1];
                this.f684e = i13;
                this.f681b = ((i13 * 144) / this.f682c) + i10;
            } else {
                int i14 = AbstractC0055b.y[i7 - 1];
                this.f684e = i14;
                this.f681b = (((i6 == 1 ? 72 : 144) * i14) / this.f682c) + i10;
            }
        }
        this.f683d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
