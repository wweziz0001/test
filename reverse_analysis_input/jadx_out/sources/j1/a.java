package j1;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c0.C0317b;
import c1.C0318a;
import c1.k;
import c1.l;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import d0.InterfaceC0351d;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import m.B0;
import m2.C0640G;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0363p f7444l = new C0363p();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f7447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f7448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f7449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7450r;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f7446n = 0;
            this.f7447o = -1;
            this.f7448p = "sans-serif";
            this.f7445m = false;
            this.f7449q = 0.85f;
            this.f7450r = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f7446n = bArr[24];
        this.f7447o = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f7448p = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f7450r = i;
        boolean z4 = (bArr[0] & 32) != 0;
        this.f7445m = z4;
        if (z4) {
            this.f7449q = AbstractC0370w.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f7449q = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i5, int i6, int i7, int i8) {
        if (i != i5) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i6, i7, i8 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i5, int i6, int i7, int i8) {
        if (i != i5) {
            int i9 = i8 | 33;
            boolean z4 = (i & 1) != 0;
            boolean z5 = (i & 2) != 0;
            if (z4) {
                if (z5) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i6, i7, i9);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i6, i7, i9);
                }
            } else if (z5) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, i7, i9);
            }
            boolean z6 = (i & 4) != 0;
            if (z6) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, i7, i9);
            }
            if (z6 || z4 || z5) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i6, i7, i9);
        }
    }

    @Override // c1.l
    public final int o() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c1.l
    public final void x(byte[] bArr, int i, int i5, k kVar, InterfaceC0351d interfaceC0351d) {
        String strT;
        int i6 = 1;
        C0363p c0363p = this.f7444l;
        c0363p.F(i + i5, bArr);
        c0363p.H(i);
        int i7 = 2;
        int i8 = 0;
        AbstractC0360m.c(c0363p.a() >= 2);
        int iB = c0363p.B();
        if (iB == 0) {
            strT = "";
        } else {
            int i9 = c0363p.f5314b;
            Charset charsetD = c0363p.D();
            int i10 = iB - (c0363p.f5314b - i9);
            if (charsetD == null) {
                charsetD = StandardCharsets.UTF_8;
            }
            strT = c0363p.t(i10, charsetD);
        }
        if (strT.isEmpty()) {
            C0640G c0640g = I.f8549m;
            interfaceC0351d.accept(new C0318a(b0.f8583p, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strT);
        b(spannableStringBuilder, this.f7446n, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f7447o, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f7448p;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.f7449q;
        while (c0363p.a() >= 8) {
            int i11 = c0363p.f5314b;
            int i12 = c0363p.i();
            int i13 = c0363p.i();
            if (i13 == 1937013100) {
                AbstractC0360m.c(c0363p.a() >= i7 ? i6 : i8);
                int iB2 = c0363p.B();
                int i14 = i8;
                while (i14 < iB2) {
                    AbstractC0360m.c(c0363p.a() >= 12 ? i6 : i8);
                    int iB3 = c0363p.B();
                    int iB4 = c0363p.B();
                    c0363p.I(i7);
                    int iV = c0363p.v();
                    c0363p.I(i6);
                    int i15 = c0363p.i();
                    if (iB4 > spannableStringBuilder.length()) {
                        StringBuilder sbJ = B0.j(iB4, "Truncating styl end (", ") to cueText.length() (");
                        sbJ.append(spannableStringBuilder.length());
                        sbJ.append(").");
                        AbstractC0360m.y("Tx3gParser", sbJ.toString());
                        iB4 = spannableStringBuilder.length();
                    }
                    if (iB3 >= iB4) {
                        AbstractC0360m.y("Tx3gParser", "Ignoring styl with start (" + iB3 + ") >= end (" + iB4 + ").");
                    } else {
                        int i16 = iB4;
                        b(spannableStringBuilder, iV, this.f7446n, iB3, i16, 0);
                        a(spannableStringBuilder, i15, this.f7447o, iB3, i16, 0);
                    }
                    i6 = 1;
                    i14++;
                    i7 = 2;
                    i8 = 0;
                }
            } else if (i13 == 1952608120 && this.f7445m) {
                i7 = 2;
                AbstractC0360m.c(c0363p.a() >= 2 ? i6 : 0);
                fH = AbstractC0370w.h(c0363p.B() / this.f7450r, 0.0f, 0.95f);
            } else {
                i7 = 2;
            }
            c0363p.H(i11 + i12);
            i8 = 0;
        }
        interfaceC0351d.accept(new C0318a(I.u(new C0317b(spannableStringBuilder, null, null, null, fH, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }
}
