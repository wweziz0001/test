package i1;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import c0.C0316a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f6429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f6430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6431h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f6432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f6433k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f6434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f6435m;

    public c(String str, String str2, long j5, long j6, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f6424a = str;
        this.f6425b = str2;
        this.i = str4;
        this.f6429f = gVar;
        this.f6430g = strArr;
        this.f6426c = str2 != null;
        this.f6427d = j5;
        this.f6428e = j6;
        str3.getClass();
        this.f6431h = str3;
        this.f6432j = cVar;
        this.f6433k = new HashMap();
        this.f6434l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C0316a c0316a = new C0316a();
            c0316a.f4959a = new SpannableStringBuilder();
            treeMap.put(str, c0316a);
        }
        CharSequence charSequence = ((C0316a) treeMap.get(str)).f4959a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i) {
        ArrayList arrayList = this.f6435m;
        if (arrayList != null) {
            return (c) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f6435m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z4) {
        String str = this.f6424a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z4 || zEquals || (zEquals2 && this.i != null)) {
            long j5 = this.f6427d;
            if (j5 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j5));
            }
            long j6 = this.f6428e;
            if (j6 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j6));
            }
        }
        if (this.f6435m == null) {
            return;
        }
        for (int i = 0; i < this.f6435m.size(); i++) {
            ((c) this.f6435m.get(i)).d(treeSet, z4 || zEquals);
        }
    }

    public final boolean f(long j5) {
        long j6 = this.f6427d;
        long j7 = this.f6428e;
        return (j6 == -9223372036854775807L && j7 == -9223372036854775807L) || (j6 <= j5 && j7 == -9223372036854775807L) || ((j6 == -9223372036854775807L && j5 < j7) || (j6 <= j5 && j5 < j7));
    }

    public final void g(long j5, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f6431h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j5) && "div".equals(this.f6424a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j5, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r20, java.util.Map r22, java.util.HashMap r23, java.lang.String r24, java.util.TreeMap r25) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j5, boolean z4, String str, TreeMap treeMap) {
        HashMap map = this.f6433k;
        map.clear();
        HashMap map2 = this.f6434l;
        map2.clear();
        String str2 = this.f6424a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f6431h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f6426c && z4) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f6425b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z4) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j5)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C0316a) entry.getValue()).f4959a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < c(); i++) {
                b(i).i(j5, z4 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C0316a) entry2.getValue()).f4959a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
