package c0;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.Arrays;

/* JADX INFO: renamed from: c0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0317b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f4975A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f4976B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f4977C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f4978D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f4979E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f4980F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f4981G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f4982H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f4983I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f4984J;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f4985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f4986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f4987t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f4988u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f4989v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f4990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f4991x;
    public static final String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f4992z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f4993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f4994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f4995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f4996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f5000h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f5001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f5002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f5006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f5008q;

    static {
        new C0317b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i = AbstractC0370w.f5326a;
        f4985r = Integer.toString(0, 36);
        f4986s = Integer.toString(17, 36);
        f4987t = Integer.toString(1, 36);
        f4988u = Integer.toString(2, 36);
        f4989v = Integer.toString(3, 36);
        f4990w = Integer.toString(18, 36);
        f4991x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        f4992z = Integer.toString(6, 36);
        f4975A = Integer.toString(7, 36);
        f4976B = Integer.toString(8, 36);
        f4977C = Integer.toString(9, 36);
        f4978D = Integer.toString(10, 36);
        f4979E = Integer.toString(11, 36);
        f4980F = Integer.toString(12, 36);
        f4981G = Integer.toString(13, 36);
        f4982H = Integer.toString(14, 36);
        f4983I = Integer.toString(15, 36);
        f4984J = Integer.toString(16, 36);
    }

    public C0317b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i, int i5, float f5, int i6, int i7, float f6, float f7, float f8, boolean z4, int i8, int i9, float f9) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC0360m.c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f4993a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f4993a = charSequence.toString();
        } else {
            this.f4993a = null;
        }
        this.f4994b = alignment;
        this.f4995c = alignment2;
        this.f4996d = bitmap;
        this.f4997e = f2;
        this.f4998f = i;
        this.f4999g = i5;
        this.f5000h = f5;
        this.i = i6;
        this.f5001j = f7;
        this.f5002k = f8;
        this.f5003l = z4;
        this.f5004m = i8;
        this.f5005n = i7;
        this.f5006o = f6;
        this.f5007p = i9;
        this.f5008q = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0317b.class != obj.getClass()) {
            return false;
        }
        C0317b c0317b = (C0317b) obj;
        if (TextUtils.equals(this.f4993a, c0317b.f4993a) && this.f4994b == c0317b.f4994b && this.f4995c == c0317b.f4995c) {
            Bitmap bitmap = c0317b.f4996d;
            Bitmap bitmap2 = this.f4996d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f4997e == c0317b.f4997e && this.f4998f == c0317b.f4998f && this.f4999g == c0317b.f4999g && this.f5000h == c0317b.f5000h && this.i == c0317b.i && this.f5001j == c0317b.f5001j && this.f5002k == c0317b.f5002k && this.f5003l == c0317b.f5003l && this.f5004m == c0317b.f5004m && this.f5005n == c0317b.f5005n && this.f5006o == c0317b.f5006o && this.f5007p == c0317b.f5007p && this.f5008q == c0317b.f5008q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4993a, this.f4994b, this.f4995c, this.f4996d, Float.valueOf(this.f4997e), Integer.valueOf(this.f4998f), Integer.valueOf(this.f4999g), Float.valueOf(this.f5000h), Integer.valueOf(this.i), Float.valueOf(this.f5001j), Float.valueOf(this.f5002k), Boolean.valueOf(this.f5003l), Integer.valueOf(this.f5004m), Integer.valueOf(this.f5005n), Float.valueOf(this.f5006o), Integer.valueOf(this.f5007p), Float.valueOf(this.f5008q)});
    }
}
