package F0;

import a0.C0157H;
import d0.AbstractC0349b;
import d0.C0363p;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f843h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z1.i f846l;

    public z(List list, int i, int i5, int i6, int i7, int i8, int i9, int i10, float f2, int i11, String str, Z1.i iVar) {
        this.f836a = list;
        this.f837b = i;
        this.f838c = i5;
        this.f839d = i6;
        this.f840e = i7;
        this.f841f = i8;
        this.f842g = i9;
        this.f843h = i10;
        this.i = f2;
        this.f844j = i11;
        this.f845k = str;
        this.f846l = iVar;
    }

    public static z a(C0363p c0363p, boolean z4, Z1.i iVar) throws C0157H {
        int i;
        c4.i iVarF;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 4;
        try {
            if (z4) {
                c0363p.I(4);
            } else {
                c0363p.I(21);
            }
            int iV = c0363p.v() & 3;
            int iV2 = c0363p.v();
            int iC = c0363p.c();
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < iV2; i12++) {
                c0363p.I(1);
                int iB = c0363p.B();
                for (int i13 = 0; i13 < iB; i13++) {
                    int iB2 = c0363p.B();
                    i11 += iB2 + 4;
                    c0363p.I(iB2);
                }
            }
            c0363p.H(iC);
            byte[] bArr = new byte[i11];
            Z1.i iVar2 = iVar;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            float f2 = 1.0f;
            String strB = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 < iV2) {
                int iV3 = c0363p.v() & 63;
                int iB3 = c0363p.B();
                int i23 = i10;
                Z1.i iVarH = iVar2;
                while (i23 < iB3) {
                    int iB4 = c0363p.B();
                    int i24 = iV2;
                    System.arraycopy(e0.n.f5545a, i10, bArr, i22, i9);
                    int i25 = i22 + 4;
                    System.arraycopy(c0363p.f5313a, c0363p.c(), bArr, i25, iB4);
                    if (iV3 == 32 && i23 == 0) {
                        iVarH = e0.n.h(bArr, i25, i25 + iB4);
                        i = iB3;
                    } else if (iV3 == 33 && i23 == 0) {
                        e0.j jVarG = e0.n.g(bArr, i25, i25 + iB4, iVarH);
                        int i26 = jVarG.f5514b + 8;
                        int i27 = jVarG.f5515c + 8;
                        int i28 = jVarG.f5520h;
                        int i29 = jVarG.i;
                        i16 = i28;
                        int i30 = jVarG.f5521j;
                        float f5 = jVarG.f5518f;
                        int i31 = jVarG.f5519g;
                        e0.h hVar = jVarG.f5513a;
                        if (hVar != null) {
                            i5 = i31;
                            i6 = i29;
                            i = iB3;
                            i7 = i26;
                            i8 = i27;
                            strB = AbstractC0349b.b(hVar.f5502a, hVar.f5503b, hVar.f5504c, hVar.f5505d, hVar.f5506e, hVar.f5507f);
                        } else {
                            i5 = i31;
                            i6 = i29;
                            i = iB3;
                            i7 = i26;
                            i8 = i27;
                        }
                        i14 = i7;
                        i15 = i8;
                        i10 = 0;
                        i18 = i30;
                        i17 = i6;
                        i20 = i5;
                        f2 = f5;
                    } else {
                        i = iB3;
                        if (iV3 != 39 || i23 != 0 || (iVarF = e0.n.f(bArr, i25, i25 + iB4)) == null || iVarH == null) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            i19 = iVarF.f5096a == ((e0.g) ((m2.I) iVarH.f3012l).get(0)).f5501b ? 4 : 5;
                        }
                    }
                    i22 = i25 + iB4;
                    c0363p.I(iB4);
                    i23++;
                    iB3 = i;
                    iV2 = i24;
                    i9 = 4;
                }
                i21++;
                iVar2 = iVarH;
                i9 = 4;
            }
            return new z(i11 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iV + 1, i14, i15, i16, i17, i18, i19, f2, i20, strB, iVar2);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw C0157H.a(e5, "Error parsing".concat(z4 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
