package a0;

import android.text.TextUtils;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import o2.AbstractC0720c;

/* JADX INFO: renamed from: a0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0190p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f3400A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0181g f3401B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f3402C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f3403D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f3404E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f3405F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f3406G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f3407H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f3408I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f3409J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f3410K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f3411L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2.I f3414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3419h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f3421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0155F f3422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f3427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0186l f3428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f3429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f3431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f3432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f3433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f3434x;
    public final float y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final byte[] f3435z;

    static {
        new C0189o().a();
        AbstractC0370w.G(0);
        AbstractC0370w.G(1);
        AbstractC0370w.G(2);
        AbstractC0370w.G(3);
        AbstractC0370w.G(4);
        AbstractC0307a.n(5, 6, 7, 8, 9);
        AbstractC0307a.n(10, 11, 12, 13, 14);
        AbstractC0307a.n(15, 16, 17, 18, 19);
        AbstractC0307a.n(20, 21, 22, 23, 24);
        AbstractC0307a.n(25, 26, 27, 28, 29);
        AbstractC0370w.G(30);
        AbstractC0370w.G(31);
        AbstractC0370w.G(32);
        AbstractC0370w.G(33);
    }

    public C0190p(C0189o c0189o) {
        boolean z4;
        String str;
        this.f3412a = c0189o.f3376a;
        String strN = AbstractC0370w.N(c0189o.f3379d);
        this.f3415d = strN;
        if (c0189o.f3378c.isEmpty() && c0189o.f3377b != null) {
            this.f3414c = m2.I.u(new C0191q(strN, c0189o.f3377b));
            this.f3413b = c0189o.f3377b;
        } else if (!c0189o.f3378c.isEmpty() && c0189o.f3377b == null) {
            m2.I i = c0189o.f3378c;
            this.f3414c = i;
            Iterator it = i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C0191q) i.get(0)).f3437b;
                    break;
                }
                C0191q c0191q = (C0191q) it.next();
                if (TextUtils.equals(c0191q.f3436a, strN)) {
                    str = c0191q.f3437b;
                    break;
                }
            }
            this.f3413b = str;
        } else if (c0189o.f3378c.isEmpty() && c0189o.f3377b == null) {
            z4 = true;
            AbstractC0360m.h(z4);
            this.f3414c = c0189o.f3378c;
            this.f3413b = c0189o.f3377b;
        } else {
            for (int i5 = 0; i5 < c0189o.f3378c.size(); i5++) {
                if (((C0191q) c0189o.f3378c.get(i5)).f3437b.equals(c0189o.f3377b)) {
                    z4 = true;
                    break;
                }
            }
            z4 = false;
            AbstractC0360m.h(z4);
            this.f3414c = c0189o.f3378c;
            this.f3413b = c0189o.f3377b;
        }
        this.f3416e = c0189o.f3380e;
        AbstractC0360m.g("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c0189o.f3382g == 0 || (c0189o.f3381f & 32768) != 0);
        this.f3417f = c0189o.f3381f;
        this.f3418g = c0189o.f3382g;
        int i6 = c0189o.f3383h;
        this.f3419h = i6;
        int i7 = c0189o.i;
        this.i = i7;
        this.f3420j = i7 != -1 ? i7 : i6;
        this.f3421k = c0189o.f3384j;
        this.f3422l = c0189o.f3385k;
        this.f3423m = c0189o.f3386l;
        this.f3424n = c0189o.f3387m;
        this.f3425o = c0189o.f3388n;
        this.f3426p = c0189o.f3389o;
        List list = c0189o.f3390p;
        this.f3427q = list == null ? Collections.emptyList() : list;
        C0186l c0186l = c0189o.f3391q;
        this.f3428r = c0186l;
        this.f3429s = c0189o.f3392r;
        this.f3430t = c0189o.f3393s;
        this.f3431u = c0189o.f3394t;
        this.f3432v = c0189o.f3395u;
        this.f3433w = c0189o.f3396v;
        int i8 = c0189o.f3397w;
        this.f3434x = i8 == -1 ? 0 : i8;
        float f2 = c0189o.f3398x;
        this.y = f2 == -1.0f ? 1.0f : f2;
        this.f3435z = c0189o.y;
        this.f3400A = c0189o.f3399z;
        this.f3401B = c0189o.f3365A;
        this.f3402C = c0189o.f3366B;
        this.f3403D = c0189o.f3367C;
        this.f3404E = c0189o.f3368D;
        int i9 = c0189o.f3369E;
        this.f3405F = i9 == -1 ? 0 : i9;
        int i10 = c0189o.f3370F;
        this.f3406G = i10 != -1 ? i10 : 0;
        this.f3407H = c0189o.f3371G;
        this.f3408I = c0189o.f3372H;
        this.f3409J = c0189o.f3373I;
        this.f3410K = c0189o.f3374J;
        int i11 = c0189o.f3375K;
        if (i11 != 0 || c0186l == null) {
            this.f3411L = i11;
        } else {
            this.f3411L = 1;
        }
    }

    public static String d(C0190p c0190p) {
        String str;
        String str2;
        int i;
        if (c0190p == null) {
            return "null";
        }
        F0.p pVar = new F0.p(String.valueOf(','), 2);
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(c0190p.f3412a);
        sb.append(", mimeType=");
        sb.append(c0190p.f3424n);
        String str3 = c0190p.f3423m;
        if (str3 != null) {
            sb.append(", container=");
            sb.append(str3);
        }
        int i5 = c0190p.f3420j;
        if (i5 != -1) {
            sb.append(", bitrate=");
            sb.append(i5);
        }
        String str4 = c0190p.f3421k;
        if (str4 != null) {
            sb.append(", codecs=");
            sb.append(str4);
        }
        C0186l c0186l = c0190p.f3428r;
        if (c0186l != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i6 = 0; i6 < c0186l.f3361o; i6++) {
                UUID uuid = c0186l.f3358l[i6].f3354m;
                if (uuid.equals(AbstractC0179e.f3329b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC0179e.f3330c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC0179e.f3332e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC0179e.f3331d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC0179e.f3328a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sb.append(", drm=[");
            pVar.c(sb, linkedHashSet.iterator());
            sb.append(']');
        }
        int i7 = c0190p.f3431u;
        if (i7 != -1 && (i = c0190p.f3432v) != -1) {
            sb.append(", res=");
            sb.append(i7);
            sb.append("x");
            sb.append(i);
        }
        float f2 = c0190p.y;
        double d5 = f2;
        int i8 = AbstractC0720c.f9117a;
        if (Math.copySign(d5 - 1.0d, 1.0d) > 0.001d && d5 != 1.0d && (!Double.isNaN(d5) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            int i9 = AbstractC0370w.f5326a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        C0181g c0181g = c0190p.f3401B;
        if (c0181g != null) {
            int i10 = c0181g.f3348f;
            int i11 = c0181g.f3347e;
            if ((i11 != -1 && i10 != -1) || c0181g.d()) {
                sb.append(", color=");
                if (c0181g.d()) {
                    String strB = C0181g.b(c0181g.f3343a);
                    String strA = C0181g.a(c0181g.f3344b);
                    String strC = C0181g.c(c0181g.f3345c);
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                sb.append(str2 + "/" + ((i11 == -1 || i10 == -1) ? "NA/NA" : i11 + "/" + i10));
            }
        }
        float f5 = c0190p.f3433w;
        if (f5 != -1.0f) {
            sb.append(", fps=");
            sb.append(f5);
        }
        int i12 = c0190p.f3402C;
        if (i12 != -1) {
            sb.append(", channels=");
            sb.append(i12);
        }
        int i13 = c0190p.f3403D;
        if (i13 != -1) {
            sb.append(", sample_rate=");
            sb.append(i13);
        }
        String str5 = c0190p.f3415d;
        if (str5 != null) {
            sb.append(", language=");
            sb.append(str5);
        }
        m2.I i14 = c0190p.f3414c;
        if (!i14.isEmpty()) {
            sb.append(", labels=[");
            pVar.c(sb, m2.r.w(i14, new B0.l(24)).iterator());
            sb.append("]");
        }
        int i15 = c0190p.f3416e;
        if (i15 != 0) {
            sb.append(", selectionFlags=[");
            int i16 = AbstractC0370w.f5326a;
            ArrayList arrayList = new ArrayList();
            if ((i15 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i15 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i15 & 2) != 0) {
                arrayList.add("forced");
            }
            pVar.c(sb, arrayList.iterator());
            sb.append("]");
        }
        int i17 = c0190p.f3417f;
        if (i17 != 0) {
            sb.append(", roleFlags=[");
            int i18 = AbstractC0370w.f5326a;
            ArrayList arrayList2 = new ArrayList();
            if ((i17 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i17 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i17 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i17 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i17 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i17 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i17 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i17 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i17 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i17 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i17 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i17 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i17 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i17 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i17 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i17 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            pVar.c(sb, arrayList2.iterator());
            sb.append("]");
        }
        if ((i17 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i19 = AbstractC0370w.f5326a;
            int i20 = c0190p.f3418g;
            if (i20 == 0) {
                str = "undefined";
            } else if (i20 == 1) {
                str = "original";
            } else if (i20 == 2) {
                str = "depth-linear";
            } else if (i20 == 3) {
                str = "depth-inverse";
            } else {
                if (i20 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final C0189o a() {
        C0189o c0189o = new C0189o();
        c0189o.f3376a = this.f3412a;
        c0189o.f3377b = this.f3413b;
        c0189o.f3378c = this.f3414c;
        c0189o.f3379d = this.f3415d;
        c0189o.f3380e = this.f3416e;
        c0189o.f3381f = this.f3417f;
        c0189o.f3383h = this.f3419h;
        c0189o.i = this.i;
        c0189o.f3384j = this.f3421k;
        c0189o.f3385k = this.f3422l;
        c0189o.f3386l = this.f3423m;
        c0189o.f3387m = this.f3424n;
        c0189o.f3388n = this.f3425o;
        c0189o.f3389o = this.f3426p;
        c0189o.f3390p = this.f3427q;
        c0189o.f3391q = this.f3428r;
        c0189o.f3392r = this.f3429s;
        c0189o.f3393s = this.f3430t;
        c0189o.f3394t = this.f3431u;
        c0189o.f3395u = this.f3432v;
        c0189o.f3396v = this.f3433w;
        c0189o.f3397w = this.f3434x;
        c0189o.f3398x = this.y;
        c0189o.y = this.f3435z;
        c0189o.f3399z = this.f3400A;
        c0189o.f3365A = this.f3401B;
        c0189o.f3366B = this.f3402C;
        c0189o.f3367C = this.f3403D;
        c0189o.f3368D = this.f3404E;
        c0189o.f3369E = this.f3405F;
        c0189o.f3370F = this.f3406G;
        c0189o.f3371G = this.f3407H;
        c0189o.f3372H = this.f3408I;
        c0189o.f3373I = this.f3409J;
        c0189o.f3374J = this.f3410K;
        c0189o.f3375K = this.f3411L;
        return c0189o;
    }

    public final int b() {
        int i;
        int i5 = this.f3431u;
        if (i5 == -1 || (i = this.f3432v) == -1) {
            return -1;
        }
        return i5 * i;
    }

    public final boolean c(C0190p c0190p) {
        List list = this.f3427q;
        if (list.size() != c0190p.f3427q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) c0190p.f3427q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final C0190p e(C0190p c0190p) {
        String str;
        float f2;
        String str2;
        int i;
        int i5;
        if (this == c0190p) {
            return this;
        }
        int iH = AbstractC0156G.h(this.f3424n);
        String str3 = c0190p.f3412a;
        String str4 = c0190p.f3413b;
        if (str4 == null) {
            str4 = this.f3413b;
        }
        m2.I i6 = c0190p.f3414c;
        if (i6.isEmpty()) {
            i6 = this.f3414c;
        }
        if ((iH != 3 && iH != 1) || (str = c0190p.f3415d) == null) {
            str = this.f3415d;
        }
        int i7 = this.f3419h;
        if (i7 == -1) {
            i7 = c0190p.f3419h;
        }
        int i8 = this.i;
        if (i8 == -1) {
            i8 = c0190p.i;
        }
        String str5 = this.f3421k;
        if (str5 == null) {
            String strU = AbstractC0370w.u(c0190p.f3421k, iH);
            if (AbstractC0370w.X(strU).length == 1) {
                str5 = strU;
            }
        }
        C0155F c0155fE = c0190p.f3422l;
        C0155F c0155f = this.f3422l;
        if (c0155f != null) {
            c0155fE = c0155f.e(c0155fE);
        }
        float f5 = this.f3433w;
        if (f5 == -1.0f && iH == 2) {
            f5 = c0190p.f3433w;
        }
        int i9 = this.f3416e | c0190p.f3416e;
        int i10 = this.f3417f | c0190p.f3417f;
        ArrayList arrayList = new ArrayList();
        C0186l c0186l = c0190p.f3428r;
        if (c0186l != null) {
            C0185k[] c0185kArr = c0186l.f3358l;
            int length = c0185kArr.length;
            f2 = f5;
            int i11 = 0;
            while (i11 < length) {
                int i12 = length;
                C0185k c0185k = c0185kArr[i11];
                C0185k[] c0185kArr2 = c0185kArr;
                if (c0185k.f3357p != null) {
                    arrayList.add(c0185k);
                }
                i11++;
                length = i12;
                c0185kArr = c0185kArr2;
            }
            str2 = c0186l.f3360n;
        } else {
            f2 = f5;
            str2 = null;
        }
        C0186l c0186l2 = this.f3428r;
        if (c0186l2 != null) {
            if (str2 == null) {
                str2 = c0186l2.f3360n;
            }
            int size = arrayList.size();
            C0185k[] c0185kArr3 = c0186l2.f3358l;
            int length2 = c0185kArr3.length;
            int i13 = 0;
            while (true) {
                String str6 = str2;
                if (i13 >= length2) {
                    break;
                }
                C0185k c0185k2 = c0185kArr3[i13];
                C0185k[] c0185kArr4 = c0185kArr3;
                if (c0185k2.f3357p != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            i = size;
                            i5 = length2;
                            arrayList.add(c0185k2);
                            break;
                        }
                        i = size;
                        i5 = length2;
                        if (((C0185k) arrayList.get(i14)).f3354m.equals(c0185k2.f3354m)) {
                            break;
                        }
                        i14++;
                        length2 = i5;
                        size = i;
                    }
                } else {
                    i = size;
                    i5 = length2;
                }
                i13++;
                str2 = str6;
                c0185kArr3 = c0185kArr4;
                length2 = i5;
                size = i;
            }
        }
        C0186l c0186l3 = arrayList.isEmpty() ? null : new C0186l(str2, arrayList);
        C0189o c0189oA = a();
        c0189oA.f3376a = str3;
        c0189oA.f3377b = str4;
        c0189oA.f3378c = m2.I.p(i6);
        c0189oA.f3379d = str;
        c0189oA.f3380e = i9;
        c0189oA.f3381f = i10;
        c0189oA.f3383h = i7;
        c0189oA.i = i8;
        c0189oA.f3384j = str5;
        c0189oA.f3385k = c0155fE;
        c0189oA.f3391q = c0186l3;
        c0189oA.f3396v = f2;
        c0189oA.f3373I = c0190p.f3409J;
        c0189oA.f3374J = c0190p.f3410K;
        return new C0190p(c0189oA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0190p.class != obj.getClass()) {
            return false;
        }
        C0190p c0190p = (C0190p) obj;
        int i5 = this.M;
        if (i5 == 0 || (i = c0190p.M) == 0 || i5 == i) {
            return this.f3416e == c0190p.f3416e && this.f3417f == c0190p.f3417f && this.f3418g == c0190p.f3418g && this.f3419h == c0190p.f3419h && this.i == c0190p.i && this.f3425o == c0190p.f3425o && this.f3429s == c0190p.f3429s && this.f3431u == c0190p.f3431u && this.f3432v == c0190p.f3432v && this.f3434x == c0190p.f3434x && this.f3400A == c0190p.f3400A && this.f3402C == c0190p.f3402C && this.f3403D == c0190p.f3403D && this.f3404E == c0190p.f3404E && this.f3405F == c0190p.f3405F && this.f3406G == c0190p.f3406G && this.f3407H == c0190p.f3407H && this.f3409J == c0190p.f3409J && this.f3410K == c0190p.f3410K && this.f3411L == c0190p.f3411L && Float.compare(this.f3433w, c0190p.f3433w) == 0 && Float.compare(this.y, c0190p.y) == 0 && Objects.equals(this.f3412a, c0190p.f3412a) && Objects.equals(this.f3413b, c0190p.f3413b) && this.f3414c.equals(c0190p.f3414c) && Objects.equals(this.f3421k, c0190p.f3421k) && Objects.equals(this.f3423m, c0190p.f3423m) && Objects.equals(this.f3424n, c0190p.f3424n) && Objects.equals(this.f3415d, c0190p.f3415d) && Arrays.equals(this.f3435z, c0190p.f3435z) && Objects.equals(this.f3422l, c0190p.f3422l) && Objects.equals(this.f3401B, c0190p.f3401B) && Objects.equals(this.f3428r, c0190p.f3428r) && c(c0190p);
        }
        return false;
    }

    public final int hashCode() {
        if (this.M == 0) {
            String str = this.f3412a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f3413b;
            int iHashCode2 = (this.f3414c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f3415d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f3416e) * 31) + this.f3417f) * 31) + this.f3418g) * 31) + this.f3419h) * 31) + this.i) * 31;
            String str4 = this.f3421k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C0155F c0155f = this.f3422l;
            int iHashCode5 = (iHashCode4 + (c0155f == null ? 0 : c0155f.hashCode())) * 961;
            String str5 = this.f3423m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f3424n;
            this.M = ((((((((((((((((((((Float.floatToIntBits(this.y) + ((((Float.floatToIntBits(this.f3433w) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f3425o) * 31) + ((int) this.f3429s)) * 31) + this.f3431u) * 31) + this.f3432v) * 31)) * 31) + this.f3434x) * 31)) * 31) + this.f3400A) * 31) + this.f3402C) * 31) + this.f3403D) * 31) + this.f3404E) * 31) + this.f3405F) * 31) + this.f3406G) * 31) + this.f3407H) * 31) + this.f3409J) * 31) + this.f3410K) * 31) + this.f3411L;
        }
        return this.M;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f3412a);
        sb.append(", ");
        sb.append(this.f3413b);
        sb.append(", ");
        sb.append(this.f3423m);
        sb.append(", ");
        sb.append(this.f3424n);
        sb.append(", ");
        sb.append(this.f3421k);
        sb.append(", ");
        sb.append(this.f3420j);
        sb.append(", ");
        sb.append(this.f3415d);
        sb.append(", [");
        sb.append(this.f3431u);
        sb.append(", ");
        sb.append(this.f3432v);
        sb.append(", ");
        sb.append(this.f3433w);
        sb.append(", ");
        sb.append(this.f3401B);
        sb.append("], [");
        sb.append(this.f3402C);
        sb.append(", ");
        return AbstractC0307a.l(sb, this.f3403D, "])");
    }
}
