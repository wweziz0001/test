package a0;

import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.Arrays;

/* JADX INFO: renamed from: a0.V, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0170V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0190p[] f3264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3265e;

    static {
        AbstractC0370w.G(0);
        AbstractC0370w.G(1);
    }

    public C0170V(String str, C0190p... c0190pArr) {
        AbstractC0360m.c(c0190pArr.length > 0);
        this.f3262b = str;
        this.f3264d = c0190pArr;
        this.f3261a = c0190pArr.length;
        int iH = AbstractC0156G.h(c0190pArr[0].f3424n);
        this.f3263c = iH == -1 ? AbstractC0156G.h(c0190pArr[0].f3423m) : iH;
        String str2 = c0190pArr[0].f3415d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = c0190pArr[0].f3417f | 16384;
        for (int i5 = 1; i5 < c0190pArr.length; i5++) {
            String str3 = c0190pArr[i5].f3415d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c(i5, "languages", c0190pArr[0].f3415d, c0190pArr[i5].f3415d);
                return;
            } else {
                if (i != (c0190pArr[i5].f3417f | 16384)) {
                    c(i5, "role flags", Integer.toBinaryString(c0190pArr[0].f3417f), Integer.toBinaryString(c0190pArr[i5].f3417f));
                    return;
                }
            }
        }
    }

    public static void c(int i, String str, String str2, String str3) {
        AbstractC0360m.m("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final C0190p a(int i) {
        return this.f3264d[i];
    }

    public final int b(C0190p c0190p) {
        int i = 0;
        while (true) {
            C0190p[] c0190pArr = this.f3264d;
            if (i >= c0190pArr.length) {
                return -1;
            }
            if (c0190p == c0190pArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0170V.class != obj.getClass()) {
            return false;
        }
        C0170V c0170v = (C0170V) obj;
        return this.f3262b.equals(c0170v.f3262b) && Arrays.equals(this.f3264d, c0170v.f3264d);
    }

    public final int hashCode() {
        if (this.f3265e == 0) {
            this.f3265e = Arrays.hashCode(this.f3264d) + AbstractC0307a.e(527, this.f3262b, 31);
        }
        return this.f3265e;
    }
}
