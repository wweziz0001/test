package d1;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: d1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0375e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final boolean[] f5379A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f5380B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f5381C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f5382D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f5383E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f5384v = c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f5385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f5386x;
    public static final int[] y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f5387z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5388a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f5389b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5395h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5407u;

    static {
        int iC = c(0, 0, 0, 0);
        f5385w = iC;
        int iC2 = c(0, 0, 0, 3);
        f5386x = new int[]{0, 0, 0, 0, 0, 2, 0};
        y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f5387z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f5379A = new boolean[]{false, false, false, true, true, true, false};
        f5380B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        f5381C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f5382D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f5383E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public C0375e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            d0.AbstractC0360m.e(r4, r0)
            d0.AbstractC0360m.e(r5, r0)
            d0.AbstractC0360m.e(r6, r0)
            d0.AbstractC0360m.e(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.C0375e.c(int, int, int, int):int");
    }

    public final void a(char c5) {
        SpannableStringBuilder spannableStringBuilder = this.f5389b;
        if (c5 != '\n') {
            spannableStringBuilder.append(c5);
            return;
        }
        ArrayList arrayList = this.f5388a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f5401o != -1) {
            this.f5401o = 0;
        }
        if (this.f5402p != -1) {
            this.f5402p = 0;
        }
        if (this.f5403q != -1) {
            this.f5403q = 0;
        }
        if (this.f5405s != -1) {
            this.f5405s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f5396j && arrayList.size() < 15) {
                this.f5407u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f5389b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f5401o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f5401o, length, 33);
            }
            if (this.f5402p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f5402p, length, 33);
            }
            if (this.f5403q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f5404r), this.f5403q, length, 33);
            }
            if (this.f5405s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f5406t), this.f5405s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f5388a.clear();
        this.f5389b.clear();
        this.f5401o = -1;
        this.f5402p = -1;
        this.f5403q = -1;
        this.f5405s = -1;
        this.f5407u = 0;
        this.f5390c = false;
        this.f5391d = false;
        this.f5392e = 4;
        this.f5393f = false;
        this.f5394g = 0;
        this.f5395h = 0;
        this.i = 0;
        this.f5396j = 15;
        this.f5397k = 0;
        this.f5398l = 0;
        this.f5399m = 0;
        int i = f5385w;
        this.f5400n = i;
        this.f5404r = f5384v;
        this.f5406t = i;
    }

    public final void e(boolean z4, boolean z5) {
        int i = this.f5401o;
        SpannableStringBuilder spannableStringBuilder = this.f5389b;
        if (i != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f5401o, spannableStringBuilder.length(), 33);
                this.f5401o = -1;
            }
        } else if (z4) {
            this.f5401o = spannableStringBuilder.length();
        }
        if (this.f5402p == -1) {
            if (z5) {
                this.f5402p = spannableStringBuilder.length();
            }
        } else {
            if (z5) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f5402p, spannableStringBuilder.length(), 33);
            this.f5402p = -1;
        }
    }

    public final void f(int i, int i5) {
        int i6 = this.f5403q;
        SpannableStringBuilder spannableStringBuilder = this.f5389b;
        if (i6 != -1 && this.f5404r != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f5404r), this.f5403q, spannableStringBuilder.length(), 33);
        }
        if (i != f5384v) {
            this.f5403q = spannableStringBuilder.length();
            this.f5404r = i;
        }
        if (this.f5405s != -1 && this.f5406t != i5) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f5406t), this.f5405s, spannableStringBuilder.length(), 33);
        }
        if (i5 != f5385w) {
            this.f5405s = spannableStringBuilder.length();
            this.f5406t = i5;
        }
    }
}
