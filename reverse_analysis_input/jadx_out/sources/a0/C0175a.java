package a0;

import android.net.Uri;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.Arrays;

/* JADX INFO: renamed from: a0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0175a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri[] f3307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0150A[] f3308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f3309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f3310f;

    static {
        AbstractC0307a.n(0, 1, 2, 3, 4);
        AbstractC0370w.G(5);
        AbstractC0370w.G(6);
        AbstractC0370w.G(7);
        AbstractC0370w.G(8);
    }

    public C0175a(int i, int i5, int[] iArr, C0150A[] c0150aArr, long[] jArr) {
        Uri uri;
        int i6 = 0;
        AbstractC0360m.c(iArr.length == c0150aArr.length);
        this.f3305a = i;
        this.f3306b = i5;
        this.f3309e = iArr;
        this.f3308d = c0150aArr;
        this.f3310f = jArr;
        this.f3307c = new Uri[c0150aArr.length];
        while (true) {
            Uri[] uriArr = this.f3307c;
            if (i6 >= uriArr.length) {
                return;
            }
            C0150A c0150a = c0150aArr[i6];
            if (c0150a == null) {
                uri = null;
            } else {
                C0197w c0197w = c0150a.f3154b;
                c0197w.getClass();
                uri = c0197w.f3460a;
            }
            uriArr[i6] = uri;
            i6++;
        }
    }

    public final int a(int i) {
        int i5;
        int i6 = i + 1;
        while (true) {
            int[] iArr = this.f3309e;
            if (i6 >= iArr.length || (i5 = iArr[i6]) == 0 || i5 == 1) {
                break;
            }
            i6++;
        }
        return i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0175a.class != obj.getClass()) {
            return false;
        }
        C0175a c0175a = (C0175a) obj;
        return this.f3305a == c0175a.f3305a && this.f3306b == c0175a.f3306b && Arrays.equals(this.f3308d, c0175a.f3308d) && Arrays.equals(this.f3309e, c0175a.f3309e) && Arrays.equals(this.f3310f, c0175a.f3310f);
    }

    public final int hashCode() {
        int i = ((this.f3305a * 31) + this.f3306b) * 31;
        int i5 = (int) 0;
        return (((Arrays.hashCode(this.f3310f) + ((Arrays.hashCode(this.f3309e) + ((Arrays.hashCode(this.f3308d) + ((i + i5) * 31)) * 31)) * 31)) * 31) + i5) * 31;
    }
}
