package h1;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import c0.C0317b;
import c1.C0318a;
import c1.k;
import c1.l;
import d0.AbstractC0360m;
import d0.C0363p;
import d0.InterfaceC0351d;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m2.I;

/* JADX INFO: renamed from: h1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0475a implements l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f6298o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f6299p = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final StringBuilder f6300l = new StringBuilder();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f6301m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0363p f6302n = new C0363p();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C0317b a(Spanned spanned, String str) {
        byte b4;
        byte b5;
        float f2;
        if (str == null) {
            return new C0317b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str.hashCode()) {
            case -685620710:
                b4 = !str.equals("{\\an1}") ? (byte) -1 : (byte) 0;
                break;
            case -685620679:
                b4 = !str.equals("{\\an2}") ? (byte) -1 : (byte) 6;
                break;
            case -685620648:
                b4 = !str.equals("{\\an3}") ? (byte) -1 : (byte) 3;
                break;
            case -685620617:
                b4 = !str.equals("{\\an4}") ? (byte) -1 : (byte) 1;
                break;
            case -685620586:
                b4 = !str.equals("{\\an5}") ? (byte) -1 : (byte) 7;
                break;
            case -685620555:
                b4 = !str.equals("{\\an6}") ? (byte) -1 : (byte) 4;
                break;
            case -685620524:
                b4 = !str.equals("{\\an7}") ? (byte) -1 : (byte) 2;
                break;
            case -685620493:
                b4 = !str.equals("{\\an8}") ? (byte) -1 : (byte) 8;
                break;
            case -685620462:
                b4 = !str.equals("{\\an9}") ? (byte) -1 : (byte) 5;
                break;
            default:
                b4 = -1;
                break;
        }
        int i = (b4 == 0 || b4 == 1 || b4 == 2) ? 0 : (b4 == 3 || b4 == 4 || b4 == 5) ? 2 : 1;
        switch (str.hashCode()) {
            case -685620710:
                b5 = !str.equals("{\\an1}") ? (byte) -1 : (byte) 0;
                break;
            case -685620679:
                b5 = !str.equals("{\\an2}") ? (byte) -1 : (byte) 1;
                break;
            case -685620648:
                b5 = !str.equals("{\\an3}") ? (byte) -1 : (byte) 2;
                break;
            case -685620617:
                b5 = !str.equals("{\\an4}") ? (byte) -1 : (byte) 6;
                break;
            case -685620586:
                b5 = !str.equals("{\\an5}") ? (byte) -1 : (byte) 7;
                break;
            case -685620555:
                b5 = !str.equals("{\\an6}") ? (byte) -1 : (byte) 8;
                break;
            case -685620524:
                b5 = !str.equals("{\\an7}") ? (byte) -1 : (byte) 3;
                break;
            case -685620493:
                b5 = !str.equals("{\\an8}") ? (byte) -1 : (byte) 4;
                break;
            case -685620462:
                b5 = !str.equals("{\\an9}") ? (byte) -1 : (byte) 5;
                break;
            default:
                b5 = -1;
                break;
        }
        int i5 = (b5 == 0 || b5 == 1 || b5 == 2) ? 2 : (b5 == 3 || b5 == 4 || b5 == 5) ? 0 : 1;
        float f5 = 0.92f;
        if (i == 0) {
            f2 = 0.08f;
        } else if (i == 1) {
            f2 = 0.5f;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            f2 = 0.92f;
        }
        if (i5 == 0) {
            f5 = 0.08f;
        } else if (i5 == 1) {
            f5 = 0.5f;
        } else if (i5 != 2) {
            throw new IllegalArgumentException();
        }
        return new C0317b(spanned, null, null, null, f5, 0, i5, f2, i, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public static long b(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j5 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j6 = (Long.parseLong(strGroup2) * 60000) + j5;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j7 = (Long.parseLong(strGroup3) * 1000) + j6;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j7 += Long.parseLong(strGroup4);
        }
        return j7 * 1000;
    }

    @Override // c1.l
    public final int o() {
        return 1;
    }

    @Override // c1.l
    public final void x(byte[] bArr, int i, int i5, k kVar, InterfaceC0351d interfaceC0351d) {
        InterfaceC0351d interfaceC0351d2;
        String strJ;
        String str;
        InterfaceC0351d interfaceC0351d3;
        C0475a c0475a = this;
        InterfaceC0351d interfaceC0351d4 = interfaceC0351d;
        String str2 = "SubripParser";
        C0363p c0363p = c0475a.f6302n;
        c0363p.F(i + i5, bArr);
        c0363p.H(i);
        Charset charsetD = c0363p.D();
        if (charsetD == null) {
            charsetD = StandardCharsets.UTF_8;
        }
        long j5 = kVar.f5053a;
        ArrayList arrayList = (j5 == -9223372036854775807L || !kVar.f5054b) ? null : new ArrayList();
        while (true) {
            String strJ2 = c0363p.j(charsetD);
            if (strJ2 == null) {
                break;
            }
            if (strJ2.length() != 0) {
                try {
                    Integer.parseInt(strJ2);
                    strJ = c0363p.j(charsetD);
                } catch (NumberFormatException unused) {
                    interfaceC0351d2 = interfaceC0351d4;
                    AbstractC0360m.y(str2, "Skipping invalid index: ".concat(strJ2));
                }
                if (strJ == null) {
                    AbstractC0360m.y(str2, "Unexpected end");
                    break;
                }
                Matcher matcher = f6298o.matcher(strJ);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb = c0475a.f6300l;
                    sb.setLength(0);
                    ArrayList arrayList2 = c0475a.f6301m;
                    arrayList2.clear();
                    String strJ3 = c0363p.j(charsetD);
                    while (!TextUtils.isEmpty(strJ3)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strJ3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = f6299p.matcher(strTrim);
                        int i6 = 0;
                        while (matcher2.find()) {
                            String strGroup = matcher2.group();
                            arrayList2.add(strGroup);
                            Matcher matcher3 = matcher2;
                            int iStart = matcher2.start() - i6;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i6 += length;
                            matcher2 = matcher3;
                            str2 = str2;
                        }
                        sb.append(sb2.toString());
                        strJ3 = c0363p.j(charsetD);
                        str2 = str2;
                    }
                    String str3 = str2;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i7);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (j5 == -9223372036854775807L || jB >= j5) {
                        C0318a c0318a = new C0318a(I.u(a(spannedFromHtml, str)), jB, jB2 - jB);
                        interfaceC0351d3 = interfaceC0351d;
                        interfaceC0351d3.accept(c0318a);
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new C0318a(I.u(a(spannedFromHtml, str)), jB, jB2 - jB));
                        }
                        interfaceC0351d3 = interfaceC0351d;
                    }
                    interfaceC0351d4 = interfaceC0351d3;
                    str2 = str3;
                    c0475a = this;
                } else {
                    interfaceC0351d2 = interfaceC0351d4;
                    AbstractC0360m.y(str2, "Skipping invalid timing: ".concat(strJ));
                    interfaceC0351d4 = interfaceC0351d2;
                    c0475a = this;
                }
            }
        }
        InterfaceC0351d interfaceC0351d5 = interfaceC0351d4;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC0351d5.accept((C0318a) it.next());
            }
        }
    }
}
