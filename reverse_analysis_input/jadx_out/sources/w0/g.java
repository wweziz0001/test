package w0;

import a0.C0157H;
import a0.C0185k;
import a0.C0186l;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedList f10458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10461h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0940a f10465m;

    public g(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f10463k = -1;
        this.f10465m = null;
        this.f10458e = new LinkedList();
    }

    @Override // w0.d
    public final void a(Object obj) {
        if (obj instanceof b) {
            this.f10458e.add((b) obj);
        } else if (obj instanceof C0940a) {
            AbstractC0360m.h(this.f10465m == null);
            this.f10465m = (C0940a) obj;
        }
    }

    @Override // w0.d
    public final Object b() {
        long j5;
        C0940a c0940a;
        long jU;
        long jU2;
        boolean z4;
        LinkedList linkedList = this.f10458e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        C0940a c0940a2 = this.f10465m;
        if (c0940a2 != null) {
            C0186l c0186l = new C0186l(new C0185k(c0940a2.f10424a, null, "video/mp4", c0940a2.f10425b));
            for (int i = 0; i < size; i++) {
                b bVar = bVarArr[i];
                int i5 = bVar.f10427a;
                if (i5 == 2 || i5 == 1) {
                    int i6 = 0;
                    while (true) {
                        C0190p[] c0190pArr = bVar.f10435j;
                        if (i6 < c0190pArr.length) {
                            C0189o c0189oA = c0190pArr[i6].a();
                            c0189oA.f3391q = c0186l;
                            c0190pArr[i6] = new C0190p(c0189oA);
                            i6++;
                        }
                    }
                }
            }
        }
        int i7 = this.f10459f;
        int i8 = this.f10460g;
        long j6 = this.f10461h;
        long j7 = this.i;
        long j8 = this.f10462j;
        int i9 = this.f10463k;
        boolean z5 = this.f10464l;
        C0940a c0940a3 = this.f10465m;
        if (j7 == 0) {
            j5 = j8;
            c0940a = c0940a3;
            jU = -9223372036854775807L;
        } else {
            int i10 = AbstractC0370w.f5326a;
            j5 = j8;
            c0940a = c0940a3;
            jU = AbstractC0370w.U(j7, 1000000L, j6, RoundingMode.DOWN);
        }
        if (j5 == 0) {
            z4 = z5;
            jU2 = -9223372036854775807L;
        } else {
            int i11 = AbstractC0370w.f5326a;
            jU2 = AbstractC0370w.U(j5, 1000000L, j6, RoundingMode.DOWN);
            z4 = z5;
        }
        return new c(i7, i8, jU, jU2, i9, z4, c0940a, bVarArr);
    }

    @Override // w0.d
    public final void j(XmlPullParser xmlPullParser) throws C0157H {
        this.f10459f = d.i(xmlPullParser, "MajorVersion");
        this.f10460g = d.i(xmlPullParser, "MinorVersion");
        this.f10461h = d.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new L0.d("Duration", 1);
        }
        try {
            this.i = Long.parseLong(attributeValue);
            this.f10462j = d.h(xmlPullParser, "DVRWindowLength", 0L);
            this.f10463k = d.g(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.f10464l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            l(Long.valueOf(this.f10461h), "TimeScale");
        } catch (NumberFormatException e5) {
            throw C0157H.b(null, e5);
        }
    }
}
