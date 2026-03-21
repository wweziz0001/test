package a0;

import d0.AbstractC0370w;
import java.util.Arrays;

/* JADX INFO: renamed from: a0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0176b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0176b f3316c = new C0176b(new C0175a[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0175a f3317d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0175a[] f3319b;

    static {
        C0175a c0175a = new C0175a(-1, -1, new int[0], new C0150A[0], new long[0]);
        int[] iArr = c0175a.f3309e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c0175a.f3310f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f3317d = new C0175a(0, c0175a.f3306b, iArrCopyOf, (C0150A[]) Arrays.copyOf(c0175a.f3308d, 0), jArrCopyOf);
        AbstractC0370w.G(1);
        AbstractC0370w.G(2);
        AbstractC0370w.G(3);
        AbstractC0370w.G(4);
    }

    public C0176b(C0175a[] c0175aArr) {
        this.f3318a = c0175aArr.length;
        this.f3319b = c0175aArr;
    }

    public final C0175a a(int i) {
        return i < 0 ? f3317d : this.f3319b[i];
    }

    public final boolean b(int i) {
        if (i != this.f3318a - 1) {
            return false;
        }
        a(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0176b.class != obj.getClass()) {
            return false;
        }
        C0176b c0176b = (C0176b) obj;
        int i = AbstractC0370w.f5326a;
        return this.f3318a == c0176b.f3318a && Arrays.equals(this.f3319b, c0176b.f3319b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3319b) + (((((this.f3318a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C0175a[] c0175aArr = this.f3319b;
            if (i >= c0175aArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            c0175aArr[i].getClass();
            for (int i5 = 0; i5 < c0175aArr[i].f3309e.length; i5++) {
                sb.append("ad(state=");
                int i6 = c0175aArr[i].f3309e[i5];
                if (i6 == 0) {
                    sb.append('_');
                } else if (i6 == 1) {
                    sb.append('R');
                } else if (i6 == 2) {
                    sb.append('S');
                } else if (i6 == 3) {
                    sb.append('P');
                } else if (i6 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c0175aArr[i].f3310f[i5]);
                sb.append(')');
                if (i5 < c0175aArr[i].f3309e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < c0175aArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
