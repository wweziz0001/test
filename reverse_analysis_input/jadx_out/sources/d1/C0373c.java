package d1;

import c0.C0317b;
import d0.AbstractC0360m;
import d0.C0363p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: d1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0373c extends h {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5362k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f5366o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f5367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5371t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f5372u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f5373v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5375x;
    public long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f5359z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f5352A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f5353B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f5354C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f5355D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f5356E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f5357F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final boolean[] f5358G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0363p f5360h = new C0363p();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f5364m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0372b f5365n = new C0372b(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5374w = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f5363l = 16000000;

    public C0373c(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f5362k = 0;
            this.f5361j = 0;
        } else if (i == 2) {
            this.f5362k = 1;
            this.f5361j = 0;
        } else if (i == 3) {
            this.f5362k = 0;
            this.f5361j = 1;
        } else if (i != 4) {
            AbstractC0360m.y("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f5362k = 0;
            this.f5361j = 0;
        } else {
            this.f5362k = 1;
            this.f5361j = 1;
        }
        l(0);
        k();
        this.f5375x = true;
        this.y = -9223372036854775807L;
    }

    @Override // d1.h
    public final V1.h f() {
        List list = this.f5366o;
        this.f5367p = list;
        list.getClass();
        return new V1.h(list);
    }

    @Override // d1.h, g0.b
    public final void flush() {
        super.flush();
        this.f5366o = null;
        this.f5367p = null;
        l(0);
        this.f5369r = 4;
        this.f5365n.f5351h = 4;
        k();
        this.f5370s = false;
        this.f5371t = false;
        this.f5372u = (byte) 0;
        this.f5373v = (byte) 0;
        this.f5374w = 0;
        this.f5375x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // d1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(d1.g r15) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.C0373c.g(d1.g):void");
    }

    @Override // d1.h, g0.b
    /* JADX INFO: renamed from: h */
    public final c1.c b() {
        c1.c cVar;
        c1.c cVarB = super.b();
        if (cVarB != null) {
            return cVarB;
        }
        long j5 = this.f5363l;
        if (j5 == -9223372036854775807L) {
            return null;
        }
        long j6 = this.y;
        if (j6 == -9223372036854775807L || this.f5422e - j6 < j5 || (cVar = (c1.c) this.f5419b.pollFirst()) == null) {
            return null;
        }
        this.f5366o = Collections.emptyList();
        this.y = -9223372036854775807L;
        V1.h hVarF = f();
        long j7 = this.f5422e;
        cVar.f5792n = j7;
        cVar.f5035p = hVarF;
        cVar.f5036q = j7;
        return cVar;
    }

    @Override // d1.h
    public final boolean i() {
        return this.f5366o != this.f5367p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f5364m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            C0317b c0317bC = ((C0372b) arrayList.get(i)).c(Integer.MIN_VALUE);
            arrayList2.add(c0317bC);
            if (c0317bC != null) {
                iMin = Math.min(iMin, c0317bC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            C0317b c0317bC2 = (C0317b) arrayList2.get(i5);
            if (c0317bC2 != null) {
                if (c0317bC2.i != iMin) {
                    c0317bC2 = ((C0372b) arrayList.get(i5)).c(iMin);
                    c0317bC2.getClass();
                }
                arrayList3.add(c0317bC2);
            }
        }
        return arrayList3;
    }

    public final void k() {
        C0372b c0372b = this.f5365n;
        c0372b.f5350g = this.f5368q;
        c0372b.f5344a.clear();
        c0372b.f5345b.clear();
        c0372b.f5346c.setLength(0);
        c0372b.f5347d = 15;
        c0372b.f5348e = 0;
        c0372b.f5349f = 0;
        ArrayList arrayList = this.f5364m;
        arrayList.clear();
        arrayList.add(this.f5365n);
    }

    public final void l(int i) {
        int i5 = this.f5368q;
        if (i5 == i) {
            return;
        }
        this.f5368q = i;
        if (i != 3) {
            k();
            if (i5 == 3 || i == 1 || i == 0) {
                this.f5366o = Collections.emptyList();
                return;
            }
            return;
        }
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f5364m;
            if (i6 >= arrayList.size()) {
                return;
            }
            ((C0372b) arrayList.get(i6)).f5350g = i;
            i6++;
        }
    }

    @Override // d1.h, g0.b
    public final void release() {
    }
}
