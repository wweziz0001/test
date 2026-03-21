package l1;

import F0.C0066m;
import F0.M;
import a0.C0157H;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import d0.AbstractC0360m;
import d0.C0363p;
import d0.C0368u;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C implements F0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0363p f7899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f7900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A.j f7901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c1.j f7902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray f7903h;
    public final SparseBooleanArray i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f7904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x f7905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public K0.b f7906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public F0.s f7907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7911q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public F f7912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7914t;

    public C(int i, int i5, c1.j jVar, C0368u c0368u, A.j jVar2) {
        this.f7901f = jVar2;
        this.f7896a = i;
        this.f7897b = i5;
        this.f7902g = jVar;
        if (i == 1 || i == 2) {
            this.f7898c = Collections.singletonList(c0368u);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f7898c = arrayList;
            arrayList.add(c0368u);
        }
        this.f7899d = new C0363p(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.f7904j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f7903h = sparseArray;
        this.f7900e = new SparseIntArray();
        this.f7905k = new x(1);
        this.f7907m = F0.s.f816b;
        this.f7914t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i6 = 0; i6 < size; i6++) {
            sparseArray.put(sparseArray2.keyAt(i6), (F) sparseArray2.valueAt(i6));
        }
        Z1.c cVar = new Z1.c();
        cVar.f2997m = this;
        cVar.f2996l = new M(4, new byte[4]);
        sparseArray.put(0, new B(cVar));
        this.f7912r = null;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        K0.b bVar;
        long j7;
        AbstractC0360m.h(this.f7896a != 2);
        List list = this.f7898c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0368u c0368u = (C0368u) list.get(i);
            synchronized (c0368u) {
                j7 = c0368u.f5323b;
            }
            boolean z4 = j7 == -9223372036854775807L;
            if (!z4) {
                long jD = c0368u.d();
                z4 = (jD == -9223372036854775807L || jD == 0 || jD == j6) ? false : true;
            }
            if (z4) {
                c0368u.f(j6);
            }
        }
        if (j6 != 0 && (bVar = this.f7906l) != null) {
            bVar.d(j6);
        }
        this.f7899d.E(0);
        this.f7900e.clear();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f7903h;
            if (i5 >= sparseArray.size()) {
                this.f7913s = 0;
                return;
            } else {
                ((F) sparseArray.valueAt(i5)).a();
                i5++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v11, types: [l1.w] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [l1.F] */
    /* JADX WARN: Type inference failed for: r8v10 */
    @Override // F0.q
    public final int d(F0.r rVar, F0.u uVar) throws C0157H, EOFException, InterruptedIOException {
        ?? r22;
        int i;
        long j5;
        int i5;
        int i6;
        int i7;
        long j6;
        long j7;
        long j8 = ((C0066m) rVar).f798n;
        int i8 = this.f7896a;
        boolean z4 = i8 == 2;
        if (this.f7909o) {
            x xVar = this.f7905k;
            if (j8 != -1 && !z4 && !xVar.f8184d) {
                int i9 = this.f7914t;
                if (i9 <= 0) {
                    xVar.a((C0066m) rVar);
                    return 0;
                }
                boolean z5 = xVar.f8186f;
                C0363p c0363p = xVar.f8183c;
                if (!z5) {
                    C0066m c0066m = (C0066m) rVar;
                    long j9 = c0066m.f798n;
                    int iMin = (int) Math.min(112800, j9);
                    long j10 = j9 - ((long) iMin);
                    if (c0066m.f799o == j10) {
                        c0363p.E(iMin);
                        c0066m.f801q = 0;
                        c0066m.t(c0363p.f5313a, 0, iMin, false);
                        int i10 = c0363p.f5314b;
                        int i11 = c0363p.f5315c;
                        int i12 = i11 - 188;
                        while (true) {
                            if (i12 < i10) {
                                j7 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = c0363p.f5313a;
                            int i13 = -4;
                            int i14 = 0;
                            while (true) {
                                if (i13 > 4) {
                                    break;
                                }
                                int i15 = (i13 * 188) + i12;
                                if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                                    i14 = 0;
                                } else {
                                    i14++;
                                    if (i14 == 5) {
                                        long jG = Z1.f.G(c0363p, i12, i9);
                                        if (jG != -9223372036854775807L) {
                                            j7 = jG;
                                            break;
                                        }
                                    }
                                }
                                i13++;
                            }
                            i12--;
                        }
                        xVar.f8188h = j7;
                        xVar.f8186f = true;
                        return 0;
                    }
                    uVar.f817a = j10;
                } else {
                    if (xVar.f8188h == -9223372036854775807L) {
                        xVar.a((C0066m) rVar);
                        return 0;
                    }
                    if (xVar.f8185e) {
                        long j11 = xVar.f8187g;
                        if (j11 == -9223372036854775807L) {
                            xVar.a((C0066m) rVar);
                            return 0;
                        }
                        C0368u c0368u = xVar.f8182b;
                        xVar.i = c0368u.c(xVar.f8188h) - c0368u.b(j11);
                        xVar.a((C0066m) rVar);
                        return 0;
                    }
                    C0066m c0066m2 = (C0066m) rVar;
                    int iMin2 = (int) Math.min(112800, c0066m2.f798n);
                    long j12 = 0;
                    if (c0066m2.f799o == j12) {
                        c0363p.E(iMin2);
                        c0066m2.f801q = 0;
                        c0066m2.t(c0363p.f5313a, 0, iMin2, false);
                        int i16 = c0363p.f5314b;
                        int i17 = c0363p.f5315c;
                        while (true) {
                            if (i16 >= i17) {
                                j6 = -9223372036854775807L;
                                break;
                            }
                            if (c0363p.f5313a[i16] == 71) {
                                long jG2 = Z1.f.G(c0363p, i16, i9);
                                if (jG2 != -9223372036854775807L) {
                                    j6 = jG2;
                                    break;
                                }
                            }
                            i16++;
                        }
                        xVar.f8187g = j6;
                        xVar.f8185e = true;
                        return 0;
                    }
                    uVar.f817a = j12;
                }
                return 1;
            }
            if (this.f7910p) {
                i = i8;
                j5 = j8;
            } else {
                this.f7910p = true;
                long j13 = xVar.i;
                if (j13 != -9223372036854775807L) {
                    int i18 = this.f7914t;
                    A0.b bVar = new A0.b(13);
                    C0368u c0368u2 = xVar.f8182b;
                    D0.d dVar = new D0.d();
                    dVar.f394l = i18;
                    dVar.f395m = c0368u2;
                    dVar.f396n = new C0363p();
                    i = i8;
                    j5 = j8;
                    K0.b bVar2 = new K0.b(bVar, dVar, j13, j13 + 1, 0L, j8, 188L, 940);
                    this.f7906l = bVar2;
                    this.f7907m.d(bVar2.f1211a);
                } else {
                    i = i8;
                    j5 = j8;
                    this.f7907m.d(new F0.v(j13));
                }
            }
            if (this.f7911q) {
                this.f7911q = false;
                b(0L, 0L);
                if (((C0066m) rVar).f799o != 0) {
                    uVar.f817a = 0L;
                    return 1;
                }
            }
            r22 = 1;
            r22 = 1;
            K0.b bVar3 = this.f7906l;
            if (bVar3 != null && bVar3.f1213c != null) {
                return bVar3.b((C0066m) rVar, uVar);
            }
        } else {
            r22 = 1;
            i = i8;
            j5 = j8;
        }
        C0363p c0363p2 = this.f7899d;
        byte[] bArr2 = c0363p2.f5313a;
        if (9400 - c0363p2.f5314b < 188) {
            int iA = c0363p2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, c0363p2.f5314b, bArr2, 0, iA);
            }
            c0363p2.F(iA, bArr2);
        }
        while (true) {
            int iA2 = c0363p2.a();
            SparseArray sparseArray = this.f7903h;
            if (iA2 >= 188) {
                int i19 = c0363p2.f5314b;
                int i20 = c0363p2.f5315c;
                byte[] bArr3 = c0363p2.f5313a;
                int i21 = i19;
                while (i21 < i20 && bArr3[i21] != 71) {
                    i21++;
                }
                c0363p2.H(i21);
                int i22 = i21 + 188;
                if (i22 > i20) {
                    int i23 = (i21 - i19) + this.f7913s;
                    this.f7913s = i23;
                    i5 = i;
                    i6 = 2;
                    if (i5 == 2 && i23 > 376) {
                        throw C0157H.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                    i7 = 0;
                } else {
                    i5 = i;
                    i6 = 2;
                    i7 = 0;
                    this.f7913s = 0;
                }
                int i24 = c0363p2.f5315c;
                if (i22 > i24) {
                    return i7;
                }
                int i25 = c0363p2.i();
                if ((8388608 & i25) != 0) {
                    c0363p2.H(i22);
                    return i7;
                }
                ?? r12 = (4194304 & i25) != 0 ? r22 : 0;
                int i26 = (2096896 & i25) >> 8;
                ?? r11 = (i25 & 32) != 0 ? r22 : 0;
                ?? r8 = (i25 & 16) != 0 ? (F) sparseArray.get(i26) : 0;
                if (r8 == 0) {
                    c0363p2.H(i22);
                    return 0;
                }
                if (i5 != i6) {
                    int i27 = i25 & 15;
                    SparseIntArray sparseIntArray = this.f7900e;
                    int i28 = sparseIntArray.get(i26, i27 - 1);
                    sparseIntArray.put(i26, i27);
                    if (i28 == i27) {
                        c0363p2.H(i22);
                        return 0;
                    }
                    if (i27 != ((i28 + r22) & 15)) {
                        r8.a();
                    }
                }
                if (r11 != 0) {
                    int iV = c0363p2.v();
                    r12 = (r12 == true ? 1 : 0) | ((c0363p2.v() & 64) != 0 ? i6 : 0);
                    c0363p2.I(iV - r22);
                }
                boolean z6 = this.f7909o;
                if (i5 == i6 || z6 || !this.f7904j.get(i26, false)) {
                    c0363p2.G(i22);
                    r8.b(r12, c0363p2);
                    c0363p2.G(i24);
                }
                if (i5 != i6 && !z6 && this.f7909o && j5 != -1) {
                    this.f7911q = r22;
                }
                c0363p2.H(i22);
                return 0;
            }
            int i29 = c0363p2.f5315c;
            int i30 = ((C0066m) rVar).read(bArr2, i29, 9400 - i29);
            if (i30 == -1) {
                for (int i31 = 0; i31 < sparseArray.size(); i31++) {
                    F f2 = (F) sparseArray.valueAt(i31);
                    if (f2 instanceof w) {
                        ?? r32 = (w) f2;
                        if (r32.f8172c == 3 && r32.f8178j == -1 && (!z4 || !(r32.f8170a instanceof j))) {
                            r32.b(r22, new C0363p());
                        }
                    }
                }
                return -1;
            }
            c0363p2.G(i29 + i30);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // F0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(F0.r r7) {
        /*
            r6 = this;
            d0.p r0 = r6.f7899d
            byte[] r0 = r0.f5313a
            F0.m r7 = (F0.C0066m) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.t(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.f(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C.e(F0.r):boolean");
    }

    @Override // F0.q
    public final void j(F0.s sVar) {
        if ((this.f7897b & 1) == 0) {
            sVar = new Z1.s(sVar, this.f7902g);
        }
        this.f7907m = sVar;
    }

    @Override // F0.q
    public final void release() {
    }
}
