package w0;

import a0.C0157H;
import a0.C0190p;
import d0.AbstractC0370w;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedList f10467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f10469h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f10470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f10471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f10476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f10477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f10478r;

    public h(d dVar, String str) {
        super(dVar, str, "StreamIndex");
        this.f10466e = str;
        this.f10467f = new LinkedList();
    }

    @Override // w0.d
    public final void a(Object obj) {
        if (obj instanceof C0190p) {
            this.f10467f.add((C0190p) obj);
        }
    }

    @Override // w0.d
    public final Object b() {
        int i;
        int i5;
        int i6;
        ArrayList arrayList;
        ArrayList arrayList2;
        RoundingMode roundingMode;
        int i7;
        long[] jArr;
        int i8;
        ArrayList arrayList3;
        long[] jArr2;
        LinkedList linkedList = this.f10467f;
        C0190p[] c0190pArr = new C0190p[linkedList.size()];
        linkedList.toArray(c0190pArr);
        String str = this.f10471k;
        int i9 = this.f10468g;
        String str2 = this.f10469h;
        long j5 = this.i;
        String str3 = this.f10470j;
        int i10 = this.f10472l;
        int i11 = this.f10473m;
        int i12 = this.f10474n;
        int i13 = this.f10475o;
        String str4 = this.f10476p;
        ArrayList arrayList4 = this.f10477q;
        long j6 = this.f10478r;
        int i14 = AbstractC0370w.f5326a;
        RoundingMode roundingMode2 = RoundingMode.DOWN;
        int size = arrayList4.size();
        long[] jArr3 = new long[size];
        if (j5 < 1000000 || j5 % 1000000 != 0) {
            i = i11;
            i5 = i12;
            i6 = i10;
            if (j5 >= 1000000 || 1000000 % j5 != 0) {
                int i15 = 0;
                while (i15 < size) {
                    long jLongValue = ((Long) arrayList4.get(i15)).longValue();
                    if (jLongValue == 0) {
                        arrayList2 = arrayList4;
                        roundingMode = roundingMode2;
                        i7 = size;
                        jArr = jArr3;
                        i8 = i15;
                    } else {
                        if (j5 < jLongValue || j5 % jLongValue != 0) {
                            arrayList = arrayList4;
                            if (j5 >= jLongValue || jLongValue % j5 != 0) {
                                arrayList2 = arrayList;
                                roundingMode = roundingMode2;
                                i7 = size;
                                jArr = jArr3;
                                i8 = i15;
                                jArr[i8] = AbstractC0370w.V(jLongValue, 1000000L, j5, roundingMode);
                            } else {
                                jArr3[i15] = i4.a.T(1000000L, i4.a.r(jLongValue, j5, RoundingMode.UNNECESSARY));
                            }
                        } else {
                            arrayList = arrayList4;
                            jArr3[i15] = i4.a.r(1000000L, i4.a.r(j5, jLongValue, RoundingMode.UNNECESSARY), roundingMode2);
                        }
                        i7 = size;
                        jArr = jArr3;
                        i8 = i15;
                        arrayList2 = arrayList;
                        roundingMode = roundingMode2;
                    }
                    i15 = i8 + 1;
                    arrayList4 = arrayList2;
                    roundingMode2 = roundingMode;
                    size = i7;
                    jArr3 = jArr;
                }
            } else {
                long jR = i4.a.r(1000000L, j5, RoundingMode.UNNECESSARY);
                for (int i16 = 0; i16 < size; i16++) {
                    jArr3[i16] = i4.a.T(((Long) arrayList4.get(i16)).longValue(), jR);
                }
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
        } else {
            i = i11;
            long jR2 = i4.a.r(j5, 1000000L, RoundingMode.UNNECESSARY);
            int i17 = 0;
            while (i17 < size) {
                jArr3[i17] = i4.a.r(((Long) arrayList4.get(i17)).longValue(), jR2, roundingMode2);
                i17++;
                i10 = i10;
                i12 = i12;
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
            i5 = i12;
            i6 = i10;
        }
        return new b(this.f10466e, str, i9, str2, j5, str3, i6, i, i5, i13, str4, c0190pArr, arrayList3, jArr2, AbstractC0370w.U(j6, 1000000L, j5, RoundingMode.DOWN));
    }

    @Override // w0.d
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // w0.d
    public final void j(XmlPullParser xmlPullParser) throws C0157H {
        int i = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new L0.d("Type", 1);
            }
            if (!"audio".equalsIgnoreCase(attributeValue)) {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    i = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw C0157H.b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i = 3;
                }
            }
            this.f10468g = i;
            l(Integer.valueOf(i), "Type");
            if (this.f10468g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new L0.d("Subtype", 1);
                }
                this.f10469h = attributeValue2;
            } else {
                this.f10469h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            l(this.f10469h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.f10470j = attributeValue3;
            l(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new L0.d("Url", 1);
            }
            this.f10471k = attributeValue4;
            this.f10472l = d.g(xmlPullParser, "MaxWidth");
            this.f10473m = d.g(xmlPullParser, "MaxHeight");
            this.f10474n = d.g(xmlPullParser, "DisplayWidth");
            this.f10475o = d.g(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f10476p = attributeValue5;
            l(attributeValue5, "Language");
            long jG = d.g(xmlPullParser, "TimeScale");
            this.i = jG;
            if (jG == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.f10477q = new ArrayList();
            return;
        }
        int size = this.f10477q.size();
        long jH = d.h(xmlPullParser, "t", -9223372036854775807L);
        if (jH == -9223372036854775807L) {
            if (size == 0) {
                jH = 0;
            } else {
                if (this.f10478r == -1) {
                    throw C0157H.b("Unable to infer start time", null);
                }
                jH = this.f10478r + ((Long) this.f10477q.get(size - 1)).longValue();
            }
        }
        this.f10477q.add(Long.valueOf(jH));
        this.f10478r = d.h(xmlPullParser, "d", -9223372036854775807L);
        long jH2 = d.h(xmlPullParser, "r", 1L);
        if (jH2 > 1 && this.f10478r == -9223372036854775807L) {
            throw C0157H.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j5 = i;
            if (j5 >= jH2) {
                return;
            }
            this.f10477q.add(Long.valueOf((this.f10478r * j5) + jH));
            i++;
        }
    }
}
