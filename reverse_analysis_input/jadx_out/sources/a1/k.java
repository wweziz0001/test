package a1;

import F0.AbstractC0055b;
import F0.C;
import F0.M;
import F0.N;
import Z1.l;
import a0.AbstractC0156G;
import a0.C0155F;
import a0.C0157H;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0360m;
import d0.C0363p;
import java.util.ArrayList;
import java.util.Arrays;
import m2.I;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f3520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C f3523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B0.d f3524r;

    @Override // a1.i
    public final void a(long j5) {
        this.f3509g = j5;
        this.f3522p = j5 != 0;
        C c5 = this.f3523q;
        this.f3521o = c5 != null ? c5.f684e : 0;
    }

    @Override // a1.i
    public final long b(C0363p c0363p) {
        byte b4 = c0363p.f5313a[0];
        if ((b4 & 1) == 1) {
            return -1L;
        }
        j jVar = this.f3520n;
        AbstractC0360m.i(jVar);
        boolean z4 = ((N[]) jVar.f3519p)[(b4 >> 1) & (255 >>> (8 - jVar.f3515l))].f715a;
        C c5 = (C) jVar.f3516m;
        int i = !z4 ? c5.f684e : c5.f685f;
        long j5 = this.f3522p ? (this.f3521o + i) / 4 : 0;
        byte[] bArr = c0363p.f5313a;
        int length = bArr.length;
        int i5 = c0363p.f5315c + 4;
        if (length < i5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
            c0363p.F(bArrCopyOf.length, bArrCopyOf);
        } else {
            c0363p.G(i5);
        }
        byte[] bArr2 = c0363p.f5313a;
        int i6 = c0363p.f5315c;
        bArr2[i6 - 4] = (byte) (j5 & 255);
        bArr2[i6 - 3] = (byte) ((j5 >>> 8) & 255);
        bArr2[i6 - 2] = (byte) ((j5 >>> 16) & 255);
        bArr2[i6 - 1] = (byte) ((j5 >>> 24) & 255);
        this.f3522p = true;
        this.f3521o = i;
        return j5;
    }

    /* JADX WARN: Type inference failed for: r1v49, types: [byte[], java.io.Serializable] */
    @Override // a1.i
    public final boolean c(C0363p c0363p, long j5, l lVar) throws C0157H {
        j jVar;
        C c5;
        C c6;
        byte[] bArr;
        long jFloor;
        if (this.f3520n != null) {
            ((C0190p) lVar.f3020l).getClass();
            return false;
        }
        C c7 = this.f3523q;
        int i = 4;
        if (c7 == null) {
            AbstractC0055b.z(1, c0363p, false);
            c0363p.n();
            int iV = c0363p.v();
            int iN = c0363p.n();
            int iK = c0363p.k();
            if (iK <= 0) {
                iK = -1;
            }
            int iK2 = c0363p.k();
            int i5 = iK2 <= 0 ? -1 : iK2;
            c0363p.k();
            int iV2 = c0363p.v();
            int iPow = (int) Math.pow(2.0d, iV2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iV2 & 240) >> 4);
            c0363p.v();
            ?? CopyOf = Arrays.copyOf(c0363p.f5313a, c0363p.f5315c);
            C c8 = new C();
            c8.f680a = iV;
            c8.f681b = iN;
            c8.f682c = iK;
            c8.f683d = i5;
            c8.f684e = iPow;
            c8.f685f = iPow2;
            c8.f686g = CopyOf;
            this.f3523q = c8;
        } else {
            B0.d dVar = this.f3524r;
            if (dVar == null) {
                this.f3524r = AbstractC0055b.x(c0363p, true, true);
            } else {
                int i6 = c0363p.f5315c;
                byte[] bArr2 = new byte[i6];
                System.arraycopy(c0363p.f5313a, 0, bArr2, 0, i6);
                int i7 = 5;
                AbstractC0055b.z(5, c0363p, false);
                int iV3 = c0363p.v() + 1;
                M m4 = new M(c0363p.f5313a);
                m4.u(c0363p.f5314b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = 2;
                    int i10 = 16;
                    if (i8 >= iV3) {
                        C c9 = c7;
                        byte[] bArr3 = bArr2;
                        int i11 = 6;
                        int i12 = m4.i(6) + 1;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (m4.i(16) != 0) {
                                throw C0157H.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i14 = m4.i(6) + 1;
                        int i15 = 0;
                        while (true) {
                            int i16 = 3;
                            if (i15 < i14) {
                                int i17 = m4.i(i10);
                                if (i17 == 0) {
                                    int i18 = 8;
                                    m4.u(8);
                                    m4.u(16);
                                    m4.u(16);
                                    m4.u(6);
                                    m4.u(8);
                                    int i19 = m4.i(4) + 1;
                                    int i20 = 0;
                                    while (i20 < i19) {
                                        m4.u(i18);
                                        i20++;
                                        i18 = 8;
                                    }
                                } else {
                                    if (i17 != 1) {
                                        throw C0157H.a(null, "floor type greater than 1 not decodable: " + i17);
                                    }
                                    int i21 = m4.i(5);
                                    int[] iArr = new int[i21];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < i21; i23++) {
                                        int i24 = m4.i(4);
                                        iArr[i23] = i24;
                                        if (i24 > i22) {
                                            i22 = i24;
                                        }
                                    }
                                    int i25 = i22 + 1;
                                    int[] iArr2 = new int[i25];
                                    int i26 = 0;
                                    while (i26 < i25) {
                                        iArr2[i26] = m4.i(i16) + 1;
                                        int i27 = m4.i(i9);
                                        int i28 = 8;
                                        if (i27 > 0) {
                                            m4.u(8);
                                        }
                                        int i29 = 0;
                                        while (i29 < (1 << i27)) {
                                            m4.u(i28);
                                            i29++;
                                            i28 = 8;
                                        }
                                        i26++;
                                        i16 = 3;
                                        i9 = 2;
                                    }
                                    m4.u(i9);
                                    int i30 = m4.i(4);
                                    int i31 = 0;
                                    int i32 = 0;
                                    for (int i33 = 0; i33 < i21; i33++) {
                                        i31 += iArr2[iArr[i33]];
                                        while (i32 < i31) {
                                            m4.u(i30);
                                            i32++;
                                        }
                                    }
                                }
                                i15++;
                                i11 = 6;
                                i10 = 16;
                                i9 = 2;
                            } else {
                                int i34 = m4.i(i11) + 1;
                                int i35 = 0;
                                while (i35 < i34) {
                                    if (m4.i(16) > 2) {
                                        throw C0157H.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    m4.u(24);
                                    m4.u(24);
                                    m4.u(24);
                                    int i36 = m4.i(i11) + 1;
                                    int i37 = 8;
                                    m4.u(8);
                                    int[] iArr3 = new int[i36];
                                    for (int i38 = 0; i38 < i36; i38++) {
                                        iArr3[i38] = ((m4.h() ? m4.i(5) : 0) * 8) + m4.i(3);
                                    }
                                    int i39 = 0;
                                    while (i39 < i36) {
                                        int i40 = 0;
                                        while (i40 < i37) {
                                            if ((iArr3[i39] & (1 << i40)) != 0) {
                                                m4.u(i37);
                                            }
                                            i40++;
                                            i37 = 8;
                                        }
                                        i39++;
                                        i37 = 8;
                                    }
                                    i35++;
                                    i11 = 6;
                                }
                                int i41 = m4.i(i11) + 1;
                                int i42 = 0;
                                while (i42 < i41) {
                                    int i43 = m4.i(16);
                                    if (i43 != 0) {
                                        AbstractC0360m.l("VorbisUtil", "mapping type other than 0 not supported: " + i43);
                                        c5 = c9;
                                    } else {
                                        int i44 = m4.h() ? m4.i(4) + 1 : 1;
                                        boolean zH = m4.h();
                                        c5 = c9;
                                        int i45 = c5.f680a;
                                        if (zH) {
                                            int i46 = m4.i(8) + 1;
                                            for (int i47 = 0; i47 < i46; i47++) {
                                                int i48 = i45 - 1;
                                                m4.u(AbstractC0055b.n(i48));
                                                m4.u(AbstractC0055b.n(i48));
                                            }
                                        }
                                        if (m4.i(2) != 0) {
                                            throw C0157H.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i44 > 1) {
                                            for (int i49 = 0; i49 < i45; i49++) {
                                                m4.u(4);
                                            }
                                        }
                                        for (int i50 = 0; i50 < i44; i50++) {
                                            m4.u(8);
                                            m4.u(8);
                                            m4.u(8);
                                        }
                                    }
                                    i42++;
                                    c9 = c5;
                                }
                                C c10 = c9;
                                int i51 = m4.i(6);
                                int i52 = i51 + 1;
                                N[] nArr = new N[i52];
                                for (int i53 = 0; i53 < i52; i53++) {
                                    boolean zH2 = m4.h();
                                    m4.i(16);
                                    m4.i(16);
                                    m4.i(8);
                                    N n4 = new N();
                                    n4.f715a = zH2;
                                    nArr[i53] = n4;
                                }
                                if (!m4.h()) {
                                    throw C0157H.a(null, "framing bit after modes not set as expected");
                                }
                                jVar = new j(c10, dVar, bArr3, nArr, AbstractC0055b.n(i51));
                            }
                        }
                    } else {
                        if (m4.i(24) != 5653314) {
                            throw C0157H.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((m4.f713d * 8) + m4.f714e));
                        }
                        int i54 = m4.i(16);
                        int i55 = m4.i(24);
                        if (m4.h()) {
                            m4.u(i7);
                            for (int i56 = 0; i56 < i55; i56 += m4.i(AbstractC0055b.n(i55 - i56))) {
                            }
                        } else {
                            boolean zH3 = m4.h();
                            for (int i57 = 0; i57 < i55; i57++) {
                                if (!zH3) {
                                    m4.u(i7);
                                } else if (m4.h()) {
                                    m4.u(i7);
                                }
                            }
                        }
                        int i58 = m4.i(i);
                        if (i58 > 2) {
                            throw C0157H.a(null, "lookup type greater than 2 not decodable: " + i58);
                        }
                        if (i58 == 1 || i58 == 2) {
                            m4.u(32);
                            m4.u(32);
                            int i59 = m4.i(i) + 1;
                            m4.u(1);
                            if (i58 != 1) {
                                c6 = c7;
                                bArr = bArr2;
                                jFloor = ((long) i55) * ((long) i54);
                            } else if (i54 != 0) {
                                c6 = c7;
                                bArr = bArr2;
                                jFloor = (long) Math.floor(Math.pow(i55, 1.0d / ((double) i54)));
                            } else {
                                c6 = c7;
                                bArr = bArr2;
                                jFloor = 0;
                            }
                            m4.u((int) (jFloor * ((long) i59)));
                        } else {
                            c6 = c7;
                            bArr = bArr2;
                        }
                        i8++;
                        c7 = c6;
                        bArr2 = bArr;
                        i = 4;
                        i7 = 5;
                    }
                }
            }
        }
        jVar = null;
        this.f3520n = jVar;
        if (jVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C c11 = (C) jVar.f3516m;
        arrayList.add((byte[]) c11.f686g);
        arrayList.add((byte[]) jVar.f3518o);
        C0155F c0155fU = AbstractC0055b.u(I.q((String[]) ((B0.d) jVar.f3517n).f190l));
        C0189o c0189o = new C0189o();
        c0189o.f3387m = AbstractC0156G.m("audio/vorbis");
        c0189o.f3383h = c11.f683d;
        c0189o.i = c11.f682c;
        c0189o.f3366B = c11.f680a;
        c0189o.f3367C = c11.f681b;
        c0189o.f3390p = arrayList;
        c0189o.f3385k = c0155fU;
        lVar.f3020l = new C0190p(c0189o);
        return true;
    }

    @Override // a1.i
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f3520n = null;
            this.f3523q = null;
            this.f3524r = null;
        }
        this.f3521o = 0;
        this.f3522p = false;
    }
}
