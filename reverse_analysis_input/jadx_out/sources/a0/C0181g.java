package a0;

import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.Arrays;
import m.B0;

/* JADX INFO: renamed from: a0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0181g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0181g f3342h = new C0181g(1, 2, 3, -1, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f3346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3349g;

    static {
        AbstractC0307a.n(0, 1, 2, 3, 4);
        AbstractC0370w.G(5);
    }

    public C0181g(int i, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f3343a = i;
        this.f3344b = i5;
        this.f3345c = i6;
        this.f3346d = bArr;
        this.f3347e = i7;
        this.f3348f = i8;
    }

    public static String a(int i) {
        return i != -1 ? i != 1 ? i != 2 ? AbstractC0307a.i("Undefined color range ", i) : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? AbstractC0307a.i("Undefined color space ", i) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? AbstractC0307a.i("Undefined color transfer ", i) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(C0181g c0181g) {
        int i;
        int i5;
        int i6;
        int i7;
        if (c0181g == null) {
            return true;
        }
        int i8 = c0181g.f3343a;
        return (i8 == -1 || i8 == 1 || i8 == 2) && ((i = c0181g.f3344b) == -1 || i == 2) && (((i5 = c0181g.f3345c) == -1 || i5 == 3) && c0181g.f3346d == null && (((i6 = c0181g.f3348f) == -1 || i6 == 8) && ((i7 = c0181g.f3347e) == -1 || i7 == 8)));
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f3343a == -1 || this.f3344b == -1 || this.f3345c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0181g.class != obj.getClass()) {
            return false;
        }
        C0181g c0181g = (C0181g) obj;
        return this.f3343a == c0181g.f3343a && this.f3344b == c0181g.f3344b && this.f3345c == c0181g.f3345c && Arrays.equals(this.f3346d, c0181g.f3346d) && this.f3347e == c0181g.f3347e && this.f3348f == c0181g.f3348f;
    }

    public final int hashCode() {
        if (this.f3349g == 0) {
            this.f3349g = ((((Arrays.hashCode(this.f3346d) + ((((((527 + this.f3343a) * 31) + this.f3344b) * 31) + this.f3345c) * 31)) * 31) + this.f3347e) * 31) + this.f3348f;
        }
        return this.f3349g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f3343a));
        sb.append(", ");
        sb.append(a(this.f3344b));
        sb.append(", ");
        sb.append(c(this.f3345c));
        sb.append(", ");
        sb.append(this.f3346d != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.f3347e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i5 = this.f3348f;
        if (i5 != -1) {
            str2 = i5 + "bit Chroma";
        }
        return B0.i(sb, str2, ")");
    }
}
