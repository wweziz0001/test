package k1;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import d0.AbstractC0360m;
import d0.C0363p;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: k1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0538h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7682a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f7683b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f7684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f7685d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f7684c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f7685d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, C0535e c0535e, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int length;
        int i5;
        int i6;
        i = c0535e.f7667b;
        length = spannableStringBuilder.length();
        String str2 = c0535e.f7666a;
        str2.getClass();
        i5 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                for (String str3 : c0535e.f7669d) {
                    Map map = f7684c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = f7685d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new c0.h(c0535e.f7668c), i, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, c0535e);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C0534d.f7663c);
                int i7 = c0535e.f7667b;
                int i8 = 0;
                int length2 = 0;
                while (i8 < arrayList.size()) {
                    if ("rt".equals(((C0534d) arrayList.get(i8)).f7664a.f7666a)) {
                        C0534d c0534d = (C0534d) arrayList.get(i8);
                        int iC2 = c(list2, str, c0534d.f7664a);
                        if (iC2 == i5) {
                            iC2 = iC != i5 ? iC : 1;
                        }
                        int i9 = c0534d.f7664a.f7667b - length2;
                        int i10 = c0534d.f7665b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i9, i10);
                        spannableStringBuilder.delete(i9, i10);
                        spannableStringBuilder.setSpan(new c0.f(charSequenceSubSequence.toString(), iC2), i7, i9, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i7 = i9;
                    }
                    i8++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, c0535e);
        for (int i11 = 0; i11 < arrayListB.size(); i11++) {
            C0532b c0532b = ((C0536f) arrayListB.get(i11)).f7671m;
            int i12 = c0532b.f7654l;
            if (i12 == -1 && c0532b.f7655m == -1) {
                i6 = -1;
            } else {
                i6 = (c0532b.f7655m == 1 ? (char) 2 : (char) 0) | (i12 == 1 ? (char) 1 : (char) 0);
            }
            if (i6 != -1) {
                int i13 = c0532b.f7654l;
                i4.a.c(spannableStringBuilder, new StyleSpan((i13 == -1 && c0532b.f7655m == -1) ? -1 : (i13 == 1 ? 1 : 0) | (c0532b.f7655m == 1 ? 2 : 0)), i, length);
            }
            if (c0532b.f7652j == 1) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (c0532b.f7653k == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (c0532b.f7650g) {
                if (!c0532b.f7650g) {
                    throw new IllegalStateException("Font color not defined");
                }
                i4.a.c(spannableStringBuilder, new ForegroundColorSpan(c0532b.f7649f), i, length);
            }
            if (c0532b.i) {
                if (!c0532b.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                i4.a.c(spannableStringBuilder, new BackgroundColorSpan(c0532b.f7651h), i, length);
            }
            if (c0532b.f7648e != null) {
                i4.a.c(spannableStringBuilder, new TypefaceSpan(c0532b.f7648e), i, length);
            }
            int i14 = c0532b.f7656n;
            if (i14 == 1) {
                i4.a.c(spannableStringBuilder, new AbsoluteSizeSpan((int) c0532b.f7657o, true), i, length);
            } else if (i14 == 2) {
                i4.a.c(spannableStringBuilder, new RelativeSizeSpan(c0532b.f7657o), i, length);
            } else if (i14 == 3) {
                i4.a.c(spannableStringBuilder, new RelativeSizeSpan(c0532b.f7657o / 100.0f), i, length);
            }
            if (c0532b.f7659q) {
                spannableStringBuilder.setSpan(new c0.e(), i, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(java.util.List r8, java.lang.String r9, k1.C0535e r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L77
            java.lang.Object r3 = r8.get(r2)
            k1.b r3 = (k1.C0532b) r3
            java.lang.String r4 = r10.f7666a
            java.lang.String r5 = r3.f7644a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f7645b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.util.Set r5 = r3.f7646c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f7647d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            goto L6a
        L3a:
            java.lang.String r5 = r3.f7644a
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = k1.C0532b.a(r1, r6, r5, r9)
            java.lang.String r6 = r3.f7645b
            r7 = 2
            int r4 = k1.C0532b.a(r5, r7, r6, r4)
            java.lang.String r5 = r3.f7647d
            java.lang.String r6 = r10.f7668c
            r7 = 4
            int r4 = k1.C0532b.a(r4, r7, r5, r6)
            r5 = -1
            if (r4 == r5) goto L69
            java.util.Set r5 = r3.f7646c
            java.util.Set r6 = r10.f7669d
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L60
            goto L69
        L60:
            java.util.Set r5 = r3.f7646c
            int r5 = r5.size()
            int r5 = r5 * r7
            int r4 = r4 + r5
            goto L6a
        L69:
            r4 = r1
        L6a:
            if (r4 <= 0) goto L74
            k1.f r5 = new k1.f
            r5.<init>(r4, r3)
            r0.add(r5)
        L74:
            int r2 = r2 + 1
            goto L7
        L77:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.AbstractC0538h.b(java.util.List, java.lang.String, k1.e):java.util.ArrayList");
    }

    public static int c(List list, String str, C0535e c0535e) {
        ArrayList arrayListB = b(list, str, c0535e);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i5 = ((C0536f) arrayListB.get(i)).f7671m.f7658p;
            if (i5 != -1) {
                return i5;
            }
        }
        return -1;
    }

    public static C0533c d(String str, Matcher matcher, C0363p c0363p, ArrayList arrayList) {
        C0537g c0537g = new C0537g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c0537g.f7672a = AbstractC0539i.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c0537g.f7673b = AbstractC0539i.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, c0537g);
            StringBuilder sb = new StringBuilder();
            c0363p.getClass();
            String strJ = c0363p.j(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strJ)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strJ.trim());
                strJ = c0363p.j(StandardCharsets.UTF_8);
            }
            c0537g.f7674c = f(str, sb.toString(), arrayList);
            return new C0533c(c0537g.a().a(), c0537g.f7672a, c0537g.f7673b);
        } catch (NumberFormatException unused) {
            AbstractC0360m.y("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, C0537g c0537g) {
        int i;
        String strSubstring;
        int i5;
        int i6;
        Matcher matcher = f7683b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, c0537g);
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i = 2;
                            break;
                        case "end":
                            i = 3;
                            break;
                        case "left":
                            i = 4;
                            break;
                        case "right":
                            i = 5;
                            break;
                        case "start":
                            i = 1;
                            break;
                        default:
                            AbstractC0360m.y("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i = 2;
                            break;
                    }
                    c0537g.f7675d = i;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        strSubstring = strGroup2.substring(iIndexOf + 1);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "line-left":
                            case "start":
                                i5 = 0;
                                break;
                            case "center":
                            case "middle":
                                i5 = 1;
                                break;
                            case "line-right":
                            case "end":
                                i5 = 2;
                                break;
                            default:
                                AbstractC0360m.y("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                i5 = Integer.MIN_VALUE;
                                break;
                        }
                        c0537g.i = i5;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    c0537g.f7679h = AbstractC0539i.b(strGroup2);
                } else if ("size".equals(strGroup)) {
                    c0537g.f7680j = AbstractC0539i.b(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    if (strGroup2.equals("lr")) {
                        i6 = 2;
                    } else if (strGroup2.equals("rl")) {
                        i6 = 1;
                    } else {
                        AbstractC0360m.y("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                        i6 = Integer.MIN_VALUE;
                    }
                    c0537g.f7681k = i6;
                } else {
                    AbstractC0360m.y("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                AbstractC0360m.y("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00fb. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r16, java.lang.String r17, java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.AbstractC0538h.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, C0537g c0537g) {
        String strSubstring;
        int i = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    AbstractC0360m.y("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            c0537g.f7678g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c0537g.f7676e = AbstractC0539i.b(str);
            c0537g.f7677f = 0;
        } else {
            c0537g.f7676e = Integer.parseInt(str);
            c0537g.f7677f = 1;
        }
    }
}
