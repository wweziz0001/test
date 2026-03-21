package e1;

import F0.M;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import c0.C0317b;
import c1.C0318a;
import c1.k;
import c1.l;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import d0.InterfaceC0351d;
import java.util.ArrayList;
import java.util.List;
import m2.C0640G;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f5586s = {0, 7, 8, 15};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f5587t = {0, 119, -120, -1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f5588u = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f5589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f5590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Canvas f5591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f5592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0390a f5593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f5594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f5595r;

    public h(List list) {
        C0363p c0363p = new C0363p((byte[]) list.get(0));
        int iB = c0363p.B();
        int iB2 = c0363p.B();
        Paint paint = new Paint();
        this.f5589l = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f5590m = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f5591n = new Canvas();
        this.f5592o = new b(719, 575, 0, 719, 0, 575);
        this.f5593p = new C0390a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f5594q = new g(iB, iB2);
    }

    public static byte[] a(int i, int i5, M m4) {
        byte[] bArr = new byte[i];
        for (int i6 = 0; i6 < i; i6++) {
            bArr[i6] = (byte) m4.i(i5);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = d(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = d(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = d(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i5 = i & 136;
                if (i5 == 0) {
                    iArr[i] = d(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i5 == 8) {
                    iArr[i] = d(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i5 == 128) {
                    iArr[i] = d(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i5 == 136) {
                    iArr[i] = d(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i, int i5, int i6, int i7) {
        return (i << 24) | (i5 << 16) | (i6 << 8) | i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0224 A[LOOP:3: B:89:0x0172->B:118:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.h.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static C0390a f(M m4, int i) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 8;
        int i11 = m4.i(8);
        m4.u(8);
        int i12 = 2;
        int i13 = i - 2;
        int i14 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i13 > 0) {
            int i15 = m4.i(i10);
            int i16 = m4.i(i10);
            int[] iArr2 = (i16 & 128) != 0 ? iArr : (i16 & 64) != 0 ? iArrB : iArrC;
            if ((i16 & 1) != 0) {
                i8 = m4.i(i10);
                i9 = m4.i(i10);
                i5 = m4.i(i10);
                i7 = m4.i(i10);
                i6 = i13 - 6;
            } else {
                int i17 = m4.i(6) << i12;
                int i18 = m4.i(4) << 4;
                i5 = m4.i(4) << 4;
                i6 = i13 - 4;
                i7 = m4.i(i12) << 6;
                i8 = i17;
                i9 = i18;
            }
            if (i8 == 0) {
                i9 = i14;
                i5 = i9;
                i7 = 255;
            }
            double d5 = i8;
            double d6 = i9 - 128;
            double d7 = i5 - 128;
            iArr2[i15] = d((byte) (255 - (i7 & 255)), AbstractC0370w.i((int) ((1.402d * d6) + d5), 0, 255), AbstractC0370w.i((int) ((d5 - (0.34414d * d7)) - (d6 * 0.71414d)), 0, 255), AbstractC0370w.i((int) ((d7 * 1.772d) + d5), 0, 255));
            i13 = i6;
            i14 = 0;
            i11 = i11;
            iArrC = iArrC;
            i10 = 8;
            i12 = 2;
        }
        return new C0390a(i11, iArr, iArrB, iArrC);
    }

    public static c g(M m4) {
        byte[] bArr;
        int i = m4.i(16);
        m4.u(4);
        int i5 = m4.i(2);
        boolean zH = m4.h();
        m4.u(1);
        byte[] bArr2 = AbstractC0370w.f5331f;
        if (i5 != 1) {
            if (i5 == 0) {
                int i6 = m4.i(16);
                int i7 = m4.i(16);
                if (i6 > 0) {
                    bArr2 = new byte[i6];
                    m4.l(i6, bArr2);
                }
                if (i7 > 0) {
                    bArr = new byte[i7];
                    m4.l(i7, bArr);
                }
            }
            return new c(i, zH, bArr2, bArr);
        }
        m4.u(m4.i(8) * 16);
        bArr = bArr2;
        return new c(i, zH, bArr2, bArr);
    }

    @Override // c1.l
    public final int o() {
        return 2;
    }

    @Override // c1.l
    public final void reset() {
        g gVar = this.f5594q;
        gVar.f5580c.clear();
        gVar.f5581d.clear();
        gVar.f5582e.clear();
        gVar.f5583f.clear();
        gVar.f5584g.clear();
        gVar.f5585h = null;
        gVar.i = null;
    }

    @Override // c1.l
    public final void x(byte[] bArr, int i, int i5, k kVar, InterfaceC0351d interfaceC0351d) {
        g gVar;
        C0318a c0318a;
        int i6;
        char c5;
        int i7;
        b bVar;
        ArrayList arrayList;
        int i8;
        g gVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar;
        e eVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        M m4 = new M(i + i5, bArr);
        m4.r(i);
        while (true) {
            int iB = m4.b();
            gVar = this.f5594q;
            if (iB >= 48 && m4.i(i18) == 15) {
                int i19 = m4.i(i18);
                int i20 = 16;
                int i21 = m4.i(16);
                int i22 = m4.i(16);
                int iF = m4.f() + i22;
                if (i22 * 8 > m4.b()) {
                    AbstractC0360m.y("DvbParser", "Data field length exceeds limit");
                    m4.u(m4.b());
                } else {
                    switch (i19) {
                        case 16:
                            if (i21 == gVar.f5578a) {
                                Z0.f fVar = gVar.i;
                                m4.i(i18);
                                int i23 = m4.i(4);
                                int i24 = m4.i(2);
                                m4.u(2);
                                int i25 = i22 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i25 > 0) {
                                    int i26 = m4.i(i18);
                                    m4.u(i18);
                                    i25 -= 6;
                                    sparseArray.put(i26, new d(m4.i(16), m4.i(16)));
                                    i18 = 8;
                                }
                                Z0.f fVar2 = new Z0.f(i23, i24, sparseArray);
                                if (i24 != 0) {
                                    gVar.i = fVar2;
                                    gVar.f5580c.clear();
                                    gVar.f5581d.clear();
                                    gVar.f5582e.clear();
                                } else if (fVar != null && fVar.f2839a != i23) {
                                    gVar.i = fVar2;
                                }
                            }
                            break;
                        case 17:
                            Z0.f fVar3 = gVar.i;
                            if (i21 == gVar.f5578a && fVar3 != null) {
                                int i27 = m4.i(i18);
                                m4.u(4);
                                boolean zH = m4.h();
                                m4.u(3);
                                int i28 = m4.i(16);
                                int i29 = m4.i(16);
                                m4.i(3);
                                int i30 = m4.i(3);
                                m4.u(2);
                                int i31 = m4.i(i18);
                                int i32 = m4.i(i18);
                                int i33 = m4.i(4);
                                int i34 = m4.i(2);
                                m4.u(2);
                                int i35 = i22 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i35 > 0) {
                                    int i36 = m4.i(i20);
                                    int i37 = m4.i(2);
                                    m4.i(2);
                                    int i38 = m4.i(12);
                                    m4.u(4);
                                    int i39 = m4.i(12);
                                    int i40 = i35 - 6;
                                    if (i37 == 1 || i37 == 2) {
                                        m4.i(i18);
                                        m4.i(i18);
                                        i35 -= 8;
                                    } else {
                                        i35 = i40;
                                    }
                                    sparseArray2.put(i36, new f(i38, i39));
                                    i20 = 16;
                                }
                                e eVar3 = new e(i27, zH, i28, i29, i30, i31, i32, i33, i34, sparseArray2);
                                SparseArray sparseArray3 = gVar.f5580c;
                                if (fVar3.f2840b == 0 && (eVar2 = (e) sparseArray3.get(i27)) != null) {
                                    int i41 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = eVar2.f5575j;
                                        if (i41 < sparseArray4.size()) {
                                            eVar3.f5575j.put(sparseArray4.keyAt(i41), (f) sparseArray4.valueAt(i41));
                                            i41++;
                                        }
                                    }
                                }
                                sparseArray3.put(eVar3.f5567a, eVar3);
                            }
                            break;
                        case 18:
                            if (i21 == gVar.f5578a) {
                                C0390a c0390aF = f(m4, i22);
                                gVar.f5581d.put(c0390aF.f5551a, c0390aF);
                            } else if (i21 == gVar.f5579b) {
                                C0390a c0390aF2 = f(m4, i22);
                                gVar.f5583f.put(c0390aF2.f5551a, c0390aF2);
                            }
                            break;
                        case 19:
                            if (i21 == gVar.f5578a) {
                                c cVarG = g(m4);
                                gVar.f5582e.put(cVarG.f5561a, cVarG);
                            } else if (i21 == gVar.f5579b) {
                                c cVarG2 = g(m4);
                                gVar.f5584g.put(cVarG2.f5561a, cVarG2);
                            }
                            break;
                        case 20:
                            if (i21 == gVar.f5578a) {
                                m4.u(4);
                                boolean zH2 = m4.h();
                                m4.u(3);
                                int i42 = m4.i(16);
                                int i43 = m4.i(16);
                                if (zH2) {
                                    int i44 = m4.i(16);
                                    int i45 = m4.i(16);
                                    int i46 = m4.i(16);
                                    i14 = i45;
                                    i15 = m4.i(16);
                                    i17 = i46;
                                    i16 = i44;
                                } else {
                                    i14 = i42;
                                    i15 = i43;
                                    i16 = 0;
                                    i17 = 0;
                                }
                                gVar.f5585h = new b(i42, i43, i16, i14, i17, i15);
                            }
                            break;
                    }
                    m4.v(iF - m4.f());
                }
                i18 = 8;
            }
        }
        Z0.f fVar4 = gVar.i;
        if (fVar4 == null) {
            C0640G c0640g = I.f8549m;
            c0318a = new C0318a(b0.f8583p, -9223372036854775807L, -9223372036854775807L);
        } else {
            b bVar2 = gVar.f5585h;
            if (bVar2 == null) {
                bVar2 = this.f5592o;
            }
            Bitmap bitmap = this.f5595r;
            Canvas canvas = this.f5591n;
            if (bitmap == null || bVar2.f5555a + 1 != bitmap.getWidth() || bVar2.f5556b + 1 != this.f5595r.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar2.f5555a + 1, bVar2.f5556b + 1, Bitmap.Config.ARGB_8888);
                this.f5595r = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i47 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) fVar4.f2841c;
                if (i47 < sparseArray5.size()) {
                    canvas.save();
                    d dVar = (d) sparseArray5.valueAt(i47);
                    e eVar4 = (e) gVar.f5580c.get(sparseArray5.keyAt(i47));
                    int i48 = dVar.f5565a + bVar2.f5557c;
                    int i49 = dVar.f5566b + bVar2.f5559e;
                    int iMin = Math.min(eVar4.f5569c + i48, bVar2.f5558d);
                    int i50 = eVar4.f5570d;
                    int i51 = i49 + i50;
                    canvas.clipRect(i48, i49, iMin, Math.min(i51, bVar2.f5560f));
                    SparseArray sparseArray6 = gVar.f5581d;
                    int i52 = eVar4.f5572f;
                    C0390a c0390a = (C0390a) sparseArray6.get(i52);
                    if (c0390a == null && (c0390a = (C0390a) gVar.f5583f.get(i52)) == null) {
                        c0390a = this.f5593p;
                    }
                    int i53 = 0;
                    while (true) {
                        SparseArray sparseArray7 = eVar4.f5575j;
                        if (i53 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i53);
                            f fVar5 = (f) sparseArray7.valueAt(i53);
                            Z0.f fVar6 = fVar4;
                            c cVar = (c) gVar.f5582e.get(iKeyAt);
                            if (cVar == null) {
                                cVar = (c) gVar.f5584g.get(iKeyAt);
                            }
                            if (cVar != null) {
                                Paint paint = cVar.f5562b ? null : this.f5589l;
                                gVar2 = gVar;
                                int i54 = fVar5.f5576a + i48;
                                int i55 = fVar5.f5577b + i49;
                                i8 = i47;
                                int i56 = eVar4.f5571e;
                                int i57 = i53;
                                int[] iArr = i56 == 3 ? c0390a.f5554d : i56 == 2 ? c0390a.f5553c : c0390a.f5552b;
                                i9 = i57;
                                arrayList = arrayList2;
                                bVar = bVar2;
                                i11 = i50;
                                i10 = i51;
                                i13 = i48;
                                i12 = i49;
                                eVar = eVar4;
                                Paint paint2 = paint;
                                e(cVar.f5563c, iArr, i56, i54, i55, paint2, canvas);
                                e(cVar.f5564d, iArr, i56, i54, i55 + 1, paint2, canvas);
                            } else {
                                bVar = bVar2;
                                arrayList = arrayList2;
                                i8 = i47;
                                gVar2 = gVar;
                                i9 = i53;
                                i10 = i51;
                                i11 = i50;
                                i12 = i49;
                                i13 = i48;
                                eVar = eVar4;
                            }
                            i53 = i9 + 1;
                            eVar4 = eVar;
                            i48 = i13;
                            fVar4 = fVar6;
                            gVar = gVar2;
                            i47 = i8;
                            bVar2 = bVar;
                            i50 = i11;
                            i51 = i10;
                            i49 = i12;
                            arrayList2 = arrayList;
                        } else {
                            Z0.f fVar7 = fVar4;
                            b bVar3 = bVar2;
                            ArrayList arrayList3 = arrayList2;
                            int i58 = i47;
                            g gVar3 = gVar;
                            int i59 = i51;
                            int i60 = i50;
                            int i61 = i49;
                            int i62 = i48;
                            e eVar5 = eVar4;
                            boolean z4 = eVar5.f5568b;
                            int i63 = eVar5.f5569c;
                            if (z4) {
                                int i64 = eVar5.f5571e;
                                if (i64 == 3) {
                                    i7 = c0390a.f5554d[eVar5.f5573g];
                                    c5 = 2;
                                } else {
                                    c5 = 2;
                                    i7 = i64 == 2 ? c0390a.f5553c[eVar5.f5574h] : c0390a.f5552b[eVar5.i];
                                }
                                Paint paint3 = this.f5590m;
                                paint3.setColor(i7);
                                i6 = i61;
                                canvas.drawRect(i62, i6, i62 + i63, i59, paint3);
                            } else {
                                i6 = i61;
                                c5 = 2;
                            }
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f5595r, i62, i6, i63, i60);
                            float f2 = bVar3.f5555a;
                            float f5 = bVar3.f5556b;
                            arrayList3.add(new C0317b(null, null, null, bitmapCreateBitmap2, i6 / f5, 0, 0, i62 / f2, 0, Integer.MIN_VALUE, -3.4028235E38f, i63 / f2, i60 / f5, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            gVar = gVar3;
                            i47 = i58 + 1;
                            fVar4 = fVar7;
                            arrayList2 = arrayList3;
                            bVar2 = bVar3;
                        }
                    }
                } else {
                    c0318a = new C0318a(arrayList2, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        interfaceC0351d.accept(c0318a);
    }
}
