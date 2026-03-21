package g1;

import O.j;
import a0.C0180f;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media.A;
import b3.AbstractC0307a;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0436a implements l {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f5795r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0180f f5797m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap f5799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f5800p = -3.4028235E38f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f5801q = -3.4028235E38f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0363p f5798n = new C0363p();

    public C0436a(List list) {
        if (list == null || list.isEmpty()) {
            this.f5796l = false;
            this.f5797m = null;
            return;
        }
        this.f5796l = true;
        String strO = AbstractC0370w.o((byte[]) list.get(0));
        AbstractC0360m.c(strO.startsWith("Format:"));
        C0180f c0180fC = C0180f.c(strO);
        c0180fC.getClass();
        this.f5797m = c0180fC;
        b(new C0363p((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j5, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j5) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j5) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j5));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long c(String str) {
        Matcher matcher = f5795r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = AbstractC0370w.f5326a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(d0.C0363p r38, java.nio.charset.Charset r39) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C0436a.b(d0.p, java.nio.charset.Charset):void");
    }

    @Override // c1.l
    public final int o() {
        return 1;
    }

    @Override // c1.l
    public final void x(byte[] bArr, int i, int i5, k kVar, InterfaceC0351d interfaceC0351d) {
        Charset charset;
        C0180f c0180f;
        C0363p c0363p;
        int i6;
        float f2;
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i8;
        PointF pointF;
        int i9;
        int i10;
        float f5;
        float f6;
        float f7;
        float f8;
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        Integer num;
        int iA;
        int i15;
        C0436a c0436a = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0363p c0363p2 = c0436a.f5798n;
        c0363p2.F(i + i5, bArr);
        c0363p2.H(i);
        Charset charsetD = c0363p2.D();
        if (charsetD == null) {
            charsetD = StandardCharsets.UTF_8;
        }
        boolean z4 = c0436a.f5796l;
        if (!z4) {
            c0436a.b(c0363p2, charsetD);
        }
        C0180f c0180fC = z4 ? c0436a.f5797m : null;
        while (true) {
            String strJ = c0363p2.j(charsetD);
            if (strJ == null) {
                long j5 = kVar.f5053a;
                ArrayList arrayList3 = (j5 == -9223372036854775807L || !kVar.f5054b) ? null : new ArrayList();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    List list = (List) arrayList.get(i16);
                    if (!list.isEmpty() || i16 == 0) {
                        if (i16 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i16)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i16 + 1)).longValue() - ((Long) arrayList2.get(i16)).longValue();
                        if (j5 == -9223372036854775807L || jLongValue >= j5) {
                            interfaceC0351d.accept(new C0318a(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C0318a(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC0351d.accept((C0318a) it.next());
                    }
                    return;
                }
                return;
            }
            if (strJ.startsWith("Format:")) {
                c0180fC = C0180f.c(strJ);
            } else if (strJ.startsWith("Dialogue:")) {
                if (c0180fC == null) {
                    AbstractC0360m.y("SsaParser", "Skipping dialogue line before complete format: ".concat(strJ));
                } else {
                    AbstractC0360m.c(strJ.startsWith("Dialogue:"));
                    String strSubstring = strJ.substring(9);
                    int i17 = c0180fC.f3341e;
                    String[] strArrSplit = strSubstring.split(",", i17);
                    if (strArrSplit.length != i17) {
                        AbstractC0360m.y("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strJ));
                    } else {
                        C0363p c0363p3 = c0363p2;
                        long jC = c(strArrSplit[c0180fC.f3337a]);
                        if (jC == -9223372036854775807L) {
                            AbstractC0360m.y("SsaParser", "Skipping invalid timing: ".concat(strJ));
                        } else {
                            long jC2 = c(strArrSplit[c0180fC.f3338b]);
                            if (jC2 == -9223372036854775807L) {
                                AbstractC0360m.y("SsaParser", "Skipping invalid timing: ".concat(strJ));
                            } else {
                                LinkedHashMap linkedHashMap = c0436a.f5799o;
                                charset = charsetD;
                                d dVar = (linkedHashMap == null || (i15 = c0180fC.f3339c) == -1) ? null : (d) linkedHashMap.get(strArrSplit[i15].trim());
                                String str = strArrSplit[c0180fC.f3340d];
                                Matcher matcher = c.f5812a.matcher(str);
                                int i18 = -1;
                                PointF pointF2 = null;
                                while (matcher.find()) {
                                    C0180f c0180f2 = c0180fC;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = c.a(strGroup);
                                        if (pointFA != null) {
                                            pointF2 = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = c.f5815d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = d.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i18 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    c0180fC = c0180f2;
                                }
                                c0180f = c0180fC;
                                String strReplace = c.f5812a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f10 = c0436a.f5800p;
                                float f11 = c0436a.f5801q;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (dVar != null) {
                                    Integer num2 = dVar.f5818c;
                                    if (num2 != null) {
                                        c0363p = c0363p3;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        c0363p = c0363p3;
                                    }
                                    if (dVar.f5824j == 3 && (num = dVar.f5819d) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f12 = dVar.f5820e;
                                    if (f12 == -3.4028235E38f || f11 == -3.4028235E38f) {
                                        f8 = -3.4028235E38f;
                                        i11 = Integer.MIN_VALUE;
                                    } else {
                                        f8 = f12 / f11;
                                        i11 = 1;
                                    }
                                    boolean z5 = dVar.f5822g;
                                    boolean z6 = dVar.f5821f;
                                    if (z6 && z5) {
                                        i12 = i11;
                                        f9 = f8;
                                        i13 = 0;
                                        i14 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        i12 = i11;
                                        f9 = f8;
                                        i13 = 0;
                                        i14 = 33;
                                        if (z6) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z5) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (dVar.f5823h) {
                                        spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i14);
                                    }
                                    if (dVar.i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i14);
                                    }
                                    i6 = i18;
                                    f2 = f9;
                                    i7 = i12;
                                } else {
                                    c0363p = c0363p3;
                                    i6 = i18;
                                    f2 = -3.4028235E38f;
                                    i7 = Integer.MIN_VALUE;
                                }
                                int i19 = -1;
                                if (i6 != -1) {
                                    i19 = i6;
                                } else if (dVar != null) {
                                    i19 = dVar.f5817b;
                                }
                                switch (i19) {
                                    case 0:
                                    default:
                                        AbstractC0307a.o(i19, "Unknown alignment: ", "SsaParser");
                                    case A.RESULT_ERROR /* -1 */:
                                        alignment2 = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        alignment2 = alignment;
                                        break;
                                    case 2:
                                    case 5:
                                    case j.BYTES_FIELD_NUMBER /* 8 */:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        alignment2 = alignment;
                                        break;
                                    case 3:
                                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        alignment2 = alignment;
                                        break;
                                }
                                int i20 = Integer.MIN_VALUE;
                                switch (i19) {
                                    case 0:
                                    default:
                                        AbstractC0307a.o(i19, "Unknown alignment: ", "SsaParser");
                                    case A.RESULT_ERROR /* -1 */:
                                        i8 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                                        i8 = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case j.BYTES_FIELD_NUMBER /* 8 */:
                                        i8 = 1;
                                        break;
                                    case 3:
                                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case 9:
                                        i8 = 2;
                                        break;
                                }
                                switch (i19) {
                                    case 0:
                                    default:
                                        AbstractC0307a.o(i19, "Unknown alignment: ", "SsaParser");
                                    case A.RESULT_ERROR /* -1 */:
                                        pointF = pointF2;
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        pointF = pointF2;
                                        i20 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                        pointF = pointF2;
                                        i20 = 1;
                                        break;
                                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                                    case j.BYTES_FIELD_NUMBER /* 8 */:
                                    case 9:
                                        pointF = pointF2;
                                        i20 = 0;
                                        break;
                                }
                                if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                    float f13 = 0.95f;
                                    if (i8 != 0) {
                                        i9 = 1;
                                        if (i8 != 1) {
                                            i10 = 2;
                                            f5 = i8 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i10 = 2;
                                            f5 = 0.5f;
                                        }
                                    } else {
                                        i9 = 1;
                                        i10 = 2;
                                        f5 = 0.05f;
                                    }
                                    if (i20 == 0) {
                                        f13 = 0.05f;
                                    } else if (i20 == i9) {
                                        f13 = 0.5f;
                                    } else if (i20 != i10) {
                                        f13 = -3.4028235E38f;
                                    }
                                    f6 = f13;
                                    f7 = f5;
                                } else {
                                    float f14 = pointF.x / f10;
                                    f6 = pointF.y / f11;
                                    f7 = f14;
                                }
                                C0317b c0317b = new C0317b(spannableString, alignment2, null, null, f6, 0, i20, f7, i8, i7, f2, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iA2 = a(jC2, arrayList2, arrayList);
                                for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                    ((List) arrayList.get(iA3)).add(c0317b);
                                }
                                c0436a = this;
                                charsetD = charset;
                                c0180fC = c0180f;
                                c0363p2 = c0363p;
                            }
                        }
                        charset = charsetD;
                        c0180f = c0180fC;
                        c0363p = c0363p3;
                        c0436a = this;
                        charsetD = charset;
                        c0180fC = c0180f;
                        c0363p2 = c0363p;
                    }
                }
                charset = charsetD;
                c0180f = c0180fC;
                c0363p = c0363p2;
                c0436a = this;
                charsetD = charset;
                c0180fC = c0180f;
                c0363p2 = c0363p;
            } else {
                charset = charsetD;
                c0180f = c0180fC;
                c0363p = c0363p2;
                c0436a = this;
                charsetD = charset;
                c0180fC = c0180f;
                c0363p2 = c0363p;
            }
        }
    }
}
