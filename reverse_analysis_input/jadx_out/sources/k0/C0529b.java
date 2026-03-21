package k0;

import A0.w;
import B0.s;
import Q1.C;
import a0.AbstractC0156G;
import a0.C0170V;
import a0.C0187m;
import a0.C0189o;
import a0.C0190p;
import a0.C0200z;
import android.util.Pair;
import android.util.SparseArray;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.InterfaceC0403A;
import f0.InterfaceC0412g;
import f0.InterfaceC0413h;
import h0.T;
import h0.t0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l0.C0562a;
import l0.C0564c;
import l0.C0567f;
import m.B0;
import m2.C0640G;
import m2.I;
import m2.b0;
import m2.r;
import x0.C0972m;
import x0.C0981w;
import x0.F;
import x0.InterfaceC0959E;
import x0.e0;
import x0.f0;
import x0.g0;
import x0.h0;
import x0.q0;
import y0.C0999g;
import y0.C1000h;

/* JADX INFO: renamed from: k0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0529b implements F, g0 {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Pattern f7522K = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Pattern f7523L = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final m0.e f7524A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC0959E f7525B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0972m f7528E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0564c f7529F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f7530G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public List f7531H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f7533J;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D0.d f7535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC0403A f7536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m0.i f7537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final A0.b f7538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Z1.i f7539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f7540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f7541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final B0.f f7542t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q0 f7543u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0528a[] f7544v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p1.b f7545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o f7546x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m0.e f7547z;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f7532I = true;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C1000h[] f7526C = new C1000h[0];

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public l[] f7527D = new l[0];
    public final IdentityHashMap y = new IdentityHashMap();

    public C0529b(int i, C0564c c0564c, Z1.i iVar, int i5, D0.d dVar, InterfaceC0403A interfaceC0403A, m0.i iVar2, m0.e eVar, A0.b bVar, m0.e eVar2, long j5, s sVar, B0.f fVar, p1.b bVar2, d dVar2, i0.j jVar) {
        int i6;
        int i7;
        int i8;
        C0190p[] c0190pArr;
        C0190p[] c0190pArrK;
        C0567f c0567fG;
        Integer num;
        m0.i iVar3 = iVar2;
        this.f7534l = i;
        this.f7529F = c0564c;
        this.f7539q = iVar;
        this.f7530G = i5;
        this.f7535m = dVar;
        this.f7536n = interfaceC0403A;
        this.f7537o = iVar3;
        this.f7524A = eVar;
        this.f7538p = bVar;
        this.f7547z = eVar2;
        this.f7540r = j5;
        this.f7541s = sVar;
        this.f7542t = fVar;
        this.f7545w = bVar2;
        this.f7546x = new o(c0564c, dVar2, fVar);
        int i9 = 0;
        bVar2.getClass();
        C0640G c0640g = I.f8549m;
        b0 b0Var = b0.f8583p;
        this.f7528E = new C0972m(b0Var, b0Var);
        l0.h hVarB = c0564c.b(i5);
        List list = hVarB.f7856d;
        this.f7531H = list;
        List list2 = hVarB.f7855c;
        int size = list2.size();
        HashMap map = new HashMap(r.b(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            map.put(Long.valueOf(((C0562a) list2.get(i10)).f7812a), Integer.valueOf(i10));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        int i11 = 0;
        while (i11 < size) {
            C0562a c0562a = (C0562a) list2.get(i11);
            C0567f c0567fG2 = g("http://dashif.org/guidelines/trickmode", c0562a.f7816e);
            List list3 = c0562a.f7817f;
            c0567fG2 = c0567fG2 == null ? g("http://dashif.org/guidelines/trickmode", list3) : c0567fG2;
            int iIntValue = (c0567fG2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(c0567fG2.f7847b)))) == null) ? i11 : num.intValue();
            if (iIntValue == i11 && (c0567fG = g("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i12 = AbstractC0370w.f5326a;
                String[] strArrSplit = c0567fG.f7847b.split(",", -1);
                int length = strArrSplit.length;
                for (int i13 = i9; i13 < length; i13++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i13])));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i11) {
                List list4 = (List) sparseArray.get(i11);
                List list5 = (List) sparseArray.get(iIntValue);
                list5.addAll(list4);
                sparseArray.put(i11, list5);
                arrayList.remove(list4);
            }
            i11++;
            i9 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i14 = 0; i14 < size2; i14++) {
            int[] iArrX0 = C.x0((Collection) arrayList.get(i14));
            iArr[i14] = iArrX0;
            Arrays.sort(iArrX0);
        }
        boolean[] zArr = new boolean[size2];
        C0190p[][] c0190pArr2 = new C0190p[size2][];
        int i15 = 0;
        int i16 = 0;
        while (i15 < size2) {
            int[] iArr2 = iArr[i15];
            int length2 = iArr2.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length2) {
                    break;
                }
                List list6 = ((C0562a) list2.get(iArr2[i17])).f7814c;
                int[] iArr3 = iArr2;
                for (int i18 = 0; i18 < list6.size(); i18++) {
                    if (!((l0.m) list6.get(i18)).f7872o.isEmpty()) {
                        zArr[i15] = true;
                        i16++;
                        break;
                    }
                }
                i17++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i15];
            int length3 = iArr4.length;
            int i19 = 0;
            while (i19 < length3) {
                int i20 = iArr4[i19];
                C0562a c0562a2 = (C0562a) list2.get(i20);
                List list7 = ((C0562a) list2.get(i20)).f7815d;
                int[] iArr5 = iArr4;
                int i21 = length3;
                int i22 = 0;
                while (i22 < list7.size()) {
                    C0567f c0567f = (C0567f) list7.get(i22);
                    List list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(c0567f.f7846a)) {
                        C0189o c0189o = new C0189o();
                        c0189o.f3387m = AbstractC0156G.m("application/cea-608");
                        c0189o.f3376a = c0562a2.f7812a + ":cea608";
                        c0190pArrK = k(c0567f, f7522K, new C0190p(c0189o));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(c0567f.f7846a)) {
                        C0189o c0189o2 = new C0189o();
                        c0189o2.f3387m = AbstractC0156G.m("application/cea-708");
                        c0189o2.f3376a = c0562a2.f7812a + ":cea708";
                        c0190pArrK = k(c0567f, f7523L, new C0190p(c0189o2));
                    } else {
                        i22++;
                        list7 = list8;
                    }
                    c0190pArr = c0190pArrK;
                    i8 = 1;
                }
                i19++;
                iArr4 = iArr5;
                length3 = i21;
            }
            i8 = 1;
            c0190pArr = new C0190p[0];
            c0190pArr2[i15] = c0190pArr;
            if (c0190pArr.length != 0) {
                i16 += i8;
            }
            i15 += i8;
        }
        int size3 = list.size() + i16 + size2;
        C0170V[] c0170vArr = new C0170V[size3];
        C0528a[] c0528aArr = new C0528a[size3];
        int i23 = 0;
        int i24 = 0;
        while (i23 < size2) {
            int[] iArr6 = iArr[i23];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr6.length;
            int i25 = size2;
            int i26 = 0;
            while (i26 < length4) {
                arrayList3.addAll(((C0562a) list2.get(iArr6[i26])).f7814c);
                i26++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            C0190p[] c0190pArr3 = new C0190p[size4];
            int i27 = 0;
            while (i27 < size4) {
                int i28 = size4;
                C0190p c0190p = ((l0.m) arrayList3.get(i27)).f7869l;
                ArrayList arrayList4 = arrayList3;
                C0189o c0189oA = c0190p.a();
                c0189oA.f3375K = iVar3.b(c0190p);
                c0190pArr3[i27] = new C0190p(c0189oA);
                i27++;
                size4 = i28;
                arrayList3 = arrayList4;
            }
            C0562a c0562a3 = (C0562a) list2.get(iArr6[0]);
            long j6 = c0562a3.f7812a;
            String string = j6 != -1 ? Long.toString(j6) : AbstractC0307a.i("unset:", i23);
            int i29 = i24 + 1;
            if (zArr[i23]) {
                i6 = i29;
                i29 = i24 + 2;
            } else {
                i6 = -1;
            }
            if (c0190pArr2[i23].length != 0) {
                i7 = i29;
                i29++;
            } else {
                i7 = -1;
            }
            j(dVar, c0190pArr3);
            List list9 = list2;
            c0170vArr[i24] = new C0170V(string, c0190pArr3);
            C0640G c0640g2 = I.f8549m;
            b0 b0Var2 = b0.f8583p;
            c0528aArr[i24] = new C0528a(c0562a3.f7813b, 0, iArr6, i24, i6, i7, -1, b0Var2);
            int i30 = i6;
            int i31 = -1;
            if (i30 != -1) {
                String strH = B0.h(string, ":emsg");
                C0189o c0189o3 = new C0189o();
                c0189o3.f3376a = strH;
                c0189o3.f3387m = AbstractC0156G.m("application/x-emsg");
                c0170vArr[i30] = new C0170V(strH, new C0190p(c0189o3));
                c0528aArr[i30] = new C0528a(5, 1, iArr6, i24, -1, -1, -1, b0Var2);
                i31 = -1;
            }
            if (i7 != i31) {
                String strH2 = B0.h(string, ":cc");
                c0528aArr[i7] = new C0528a(3, 1, iArr6, i24, -1, -1, -1, I.q(c0190pArr2[i23]));
                j(dVar, c0190pArr2[i23]);
                c0170vArr[i7] = new C0170V(strH2, c0190pArr2[i23]);
            }
            i23++;
            size2 = i25;
            iVar3 = iVar2;
            iArr = iArr7;
            i24 = i29;
            list2 = list9;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            l0.g gVar = (l0.g) list.get(i32);
            C0189o c0189o4 = new C0189o();
            c0189o4.f3376a = gVar.a();
            c0189o4.f3387m = AbstractC0156G.m("application/x-emsg");
            c0170vArr[i24] = new C0170V(gVar.a() + ":" + i32, new C0190p(c0189o4));
            C0640G c0640g3 = I.f8549m;
            c0528aArr[i24] = new C0528a(5, 2, new int[0], -1, -1, -1, i32, b0.f8583p);
            i32++;
            i24++;
        }
        Pair pairCreate = Pair.create(new q0(c0170vArr), c0528aArr);
        this.f7543u = (q0) pairCreate.first;
        this.f7544v = (C0528a[]) pairCreate.second;
    }

    public static C0567f g(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C0567f c0567f = (C0567f) list.get(i);
            if (str.equals(c0567f.f7846a)) {
                return c0567f;
            }
        }
        return null;
    }

    public static void j(D0.d dVar, C0190p[] c0190pArr) {
        for (int i = 0; i < c0190pArr.length; i++) {
            C0190p c0190p = c0190pArr[i];
            C0187m c0187m = (C0187m) dVar.f396n;
            if (c0187m.f3362a && ((C0200z) c0187m.f3363b).supportsFormat(c0190p)) {
                C0189o c0189oA = c0190p.a();
                c0189oA.f3387m = AbstractC0156G.m("application/x-media3-cues");
                c0189oA.f3372H = ((C0200z) c0187m.f3363b).d(c0190p);
                StringBuilder sb = new StringBuilder();
                sb.append(c0190p.f3424n);
                String str = c0190p.f3421k;
                sb.append(str != null ? " ".concat(str) : "");
                c0189oA.f3384j = sb.toString();
                c0189oA.f3392r = Long.MAX_VALUE;
                c0190p = new C0190p(c0189oA);
            }
            c0190pArr[i] = c0190p;
        }
    }

    public static C0190p[] k(C0567f c0567f, Pattern pattern, C0190p c0190p) {
        String str = c0567f.f7847b;
        if (str == null) {
            return new C0190p[]{c0190p};
        }
        int i = AbstractC0370w.f5326a;
        String[] strArrSplit = str.split(";", -1);
        C0190p[] c0190pArr = new C0190p[strArrSplit.length];
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            Matcher matcher = pattern.matcher(strArrSplit[i5]);
            if (!matcher.matches()) {
                return new C0190p[]{c0190p};
            }
            int i6 = Integer.parseInt(matcher.group(1));
            C0189o c0189oA = c0190p.a();
            c0189oA.f3376a = c0190p.f3412a + ":" + i6;
            c0189oA.f3371G = i6;
            c0189oA.f3379d = matcher.group(2);
            c0190pArr[i5] = new C0190p(c0189oA);
        }
        return c0190pArr;
    }

    @Override // x0.F
    public final long b(long j5, t0 t0Var) {
        for (C1000h c1000h : this.f7526C) {
            if (c1000h.f10878l == 2) {
                return c1000h.f10882p.b(j5, t0Var);
            }
        }
        return j5;
    }

    @Override // x0.h0
    public final boolean c() {
        return this.f7528E.c();
    }

    @Override // x0.g0
    public final void d(h0 h0Var) {
        this.f7525B.d(this);
    }

    @Override // x0.F
    public final q0 e() {
        return this.f7543u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    @Override // x0.F
    public final long f(w[] wVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j5) {
        int i;
        boolean z4;
        int[] iArr;
        int i5;
        int i6;
        int[] iArr2;
        f0[] f0VarArr2;
        ?? r4;
        C0170V c0170vA;
        ?? r32;
        n nVar;
        boolean z5;
        w[] wVarArr2 = wVarArr;
        f0[] f0VarArr3 = f0VarArr;
        int[] iArr3 = new int[wVarArr2.length];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = -1;
            if (i8 >= wVarArr2.length) {
                break;
            }
            w wVar = wVarArr2[i8];
            if (wVar != null) {
                iArr3[i8] = this.f7543u.b(wVar.b());
            } else {
                iArr3[i8] = -1;
            }
            i8++;
        }
        for (int i9 = 0; i9 < wVarArr2.length; i9++) {
            if (wVarArr2[i9] == null || !zArr[i9]) {
                f0 f0Var = f0VarArr3[i9];
                if (f0Var instanceof C1000h) {
                    ((C1000h) f0Var).A(this);
                } else if (f0Var instanceof C0999g) {
                    ((C0999g) f0Var).c();
                }
                f0VarArr3[i9] = null;
            }
        }
        int i10 = 0;
        while (true) {
            if (i10 >= wVarArr2.length) {
                break;
            }
            f0 f0Var2 = f0VarArr3[i10];
            if ((f0Var2 instanceof C0981w) || (f0Var2 instanceof C0999g)) {
                int i11 = i(iArr3, i10);
                if (i11 == -1) {
                    z5 = f0VarArr3[i10] instanceof C0981w;
                } else {
                    f0 f0Var3 = f0VarArr3[i10];
                    z5 = (f0Var3 instanceof C0999g) && ((C0999g) f0Var3).f10863l == f0VarArr3[i11];
                }
                if (!z5) {
                    f0 f0Var4 = f0VarArr3[i10];
                    if (f0Var4 instanceof C0999g) {
                        ((C0999g) f0Var4).c();
                    }
                    f0VarArr3[i10] = null;
                }
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < wVarArr2.length) {
            w wVar2 = wVarArr2[i12];
            if (wVar2 == null) {
                i5 = i12;
                i6 = i7;
                iArr2 = iArr3;
                f0VarArr2 = f0VarArr3;
            } else {
                f0 f0Var5 = f0VarArr3[i12];
                if (f0Var5 == null) {
                    zArr2[i12] = z4;
                    C0528a c0528a = this.f7544v[iArr3[i12]];
                    int i13 = c0528a.f7516c;
                    if (i13 == 0) {
                        int i14 = c0528a.f7519f;
                        ?? r30 = i14 != i ? z4 : i7;
                        if (r30 != 0) {
                            c0170vA = this.f7543u.a(i14);
                            r4 = z4;
                        } else {
                            r4 = i7;
                            c0170vA = null;
                        }
                        int i15 = c0528a.f7520g;
                        b0 b0VarS = i15 != i ? this.f7544v[i15].f7521h : I.s();
                        int size = b0VarS.size() + r4;
                        C0190p[] c0190pArr = new C0190p[size];
                        int[] iArr4 = new int[size];
                        if (r30 != 0) {
                            c0190pArr[i7] = c0170vA.a(i7);
                            iArr4[i7] = 5;
                            r32 = z4;
                        } else {
                            r32 = i7;
                        }
                        ArrayList arrayList = new ArrayList();
                        ?? r33 = r32;
                        while (i7 < b0VarS.size()) {
                            C0190p c0190p = (C0190p) b0VarS.get(i7);
                            c0190pArr[r33] = c0190p;
                            iArr4[r33] = 3;
                            arrayList.add(c0190p);
                            i7++;
                            r33++;
                        }
                        if (!this.f7529F.f7825d || r30 == 0) {
                            nVar = null;
                        } else {
                            o oVar = this.f7546x;
                            nVar = new n(oVar, oVar.f7631l);
                        }
                        D0.d dVar = this.f7535m;
                        s sVar = this.f7541s;
                        C0564c c0564c = this.f7529F;
                        i5 = i12;
                        Z1.i iVar = this.f7539q;
                        int[] iArr5 = iArr3;
                        int i16 = this.f7530G;
                        int[] iArr6 = c0528a.f7514a;
                        int i17 = c0528a.f7515b;
                        long j6 = this.f7540r;
                        InterfaceC0403A interfaceC0403A = this.f7536n;
                        InterfaceC0413h interfaceC0413hA = ((InterfaceC0412g) dVar.f395m).a();
                        if (interfaceC0403A != null) {
                            interfaceC0413hA.b(interfaceC0403A);
                        }
                        n nVar2 = nVar;
                        iArr2 = iArr5;
                        C1000h c1000h = new C1000h(c0528a.f7515b, iArr4, c0190pArr, new k((C0187m) dVar.f396n, sVar, c0564c, iVar, i16, iArr6, wVar2, i17, interfaceC0413hA, j6, dVar.f394l, r30, arrayList, nVar), this, this.f7542t, j5, this.f7537o, this.f7524A, this.f7538p, this.f7547z, this.f7532I);
                        synchronized (this) {
                            this.y.put(c1000h, nVar2);
                        }
                        f0VarArr2 = f0VarArr;
                        f0VarArr2[i5] = c1000h;
                    } else {
                        i5 = i12;
                        iArr2 = iArr3;
                        f0VarArr2 = f0VarArr3;
                        if (i13 == 2) {
                            i6 = 0;
                            f0VarArr2[i5] = new l((l0.g) this.f7531H.get(c0528a.f7517d), wVar2.b().a(0), this.f7529F.f7825d);
                        }
                    }
                    i6 = 0;
                } else {
                    i5 = i12;
                    i6 = i7;
                    iArr2 = iArr3;
                    f0VarArr2 = f0VarArr3;
                    if (f0Var5 instanceof C1000h) {
                        ((k) ((C1000h) f0Var5).f10882p).f7611j = wVar2;
                    }
                }
            }
            i12 = i5 + 1;
            f0VarArr3 = f0VarArr2;
            i7 = i6;
            iArr3 = iArr2;
            i = -1;
            z4 = true;
            wVarArr2 = wVarArr;
        }
        ?? r34 = i7;
        int[] iArr7 = iArr3;
        f0[] f0VarArr4 = f0VarArr3;
        while (i7 < wVarArr.length) {
            if (f0VarArr4[i7] != null || wVarArr[i7] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                C0528a c0528a2 = this.f7544v[iArr[i7]];
                if (c0528a2.f7516c == 1) {
                    int i18 = i(iArr, i7);
                    if (i18 == -1) {
                        f0VarArr4[i7] = new C0981w();
                    } else {
                        C1000h c1000h2 = (C1000h) f0VarArr4[i18];
                        int i19 = c0528a2.f7515b;
                        int i20 = 0;
                        while (true) {
                            e0[] e0VarArr = c1000h2.y;
                            if (i20 >= e0VarArr.length) {
                                throw new IllegalStateException();
                            }
                            if (c1000h2.f10879m[i20] == i19) {
                                boolean[] zArr3 = c1000h2.f10881o;
                                AbstractC0360m.h(!zArr3[i20]);
                                zArr3[i20] = true;
                                e0VarArr[i20].B(j5, true);
                                f0VarArr4[i7] = new C0999g(c1000h2, c1000h2, e0VarArr[i20], i20);
                                break;
                            }
                            i20++;
                        }
                    }
                    i7++;
                    iArr7 = iArr;
                }
            }
            i7++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = f0VarArr4.length;
        for (int i21 = r34 == true ? 1 : 0; i21 < length; i21++) {
            f0 f0Var6 = f0VarArr4[i21];
            if (f0Var6 instanceof C1000h) {
                arrayList2.add((C1000h) f0Var6);
            } else if (f0Var6 instanceof l) {
                arrayList3.add((l) f0Var6);
            }
        }
        C1000h[] c1000hArr = new C1000h[arrayList2.size()];
        this.f7526C = c1000hArr;
        arrayList2.toArray(c1000hArr);
        l[] lVarArr = new l[arrayList3.size()];
        this.f7527D = lVarArr;
        arrayList3.toArray(lVarArr);
        p1.b bVar = this.f7545w;
        AbstractList abstractListW = r.w(arrayList2, new i0.b(21));
        bVar.getClass();
        this.f7528E = new C0972m(arrayList2, abstractListW);
        if (this.f7532I) {
            this.f7532I = r34;
            this.f7533J = j5;
        }
        return j5;
    }

    @Override // x0.h0
    public final long h() {
        return this.f7528E.h();
    }

    public final int i(int[] iArr, int i) {
        int i5 = iArr[i];
        if (i5 == -1) {
            return -1;
        }
        C0528a[] c0528aArr = this.f7544v;
        int i6 = c0528aArr[i5].f7518e;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i8 = iArr[i7];
            if (i8 == i6 && c0528aArr[i8].f7516c == 0) {
                return i7;
            }
        }
        return -1;
    }

    @Override // x0.F
    public final void l() {
        this.f7541s.a();
    }

    @Override // x0.F
    public final long o(long j5) {
        for (C1000h c1000h : this.f7526C) {
            c1000h.B(j5);
        }
        for (l lVar : this.f7527D) {
            int iA = AbstractC0370w.a(lVar.f7618n, j5, true);
            lVar.f7622r = iA;
            lVar.f7623s = (lVar.f7619o && iA == lVar.f7618n.length) ? j5 : -9223372036854775807L;
        }
        return j5;
    }

    @Override // x0.F
    public final void p(long j5) {
        for (C1000h c1000h : this.f7526C) {
            c1000h.p(j5);
        }
    }

    @Override // x0.h0
    public final long r() {
        return this.f7528E.r();
    }

    @Override // x0.F
    public final long s() {
        C1000h[] c1000hArr = this.f7526C;
        int length = c1000hArr.length;
        for (int i = 0; i < length; i++) {
            C1000h c1000h = c1000hArr[i];
            c1000h.getClass();
            try {
                if (c1000h.f10876I) {
                    return this.f7533J;
                }
            } finally {
                c1000h.f10876I = false;
            }
        }
        return -9223372036854775807L;
    }

    @Override // x0.F
    public final void t(InterfaceC0959E interfaceC0959E, long j5) {
        this.f7525B = interfaceC0959E;
        interfaceC0959E.a(this);
    }

    @Override // x0.h0
    public final void u(long j5) {
        this.f7528E.u(j5);
    }

    @Override // x0.h0
    public final boolean v(T t4) {
        return this.f7528E.v(t4);
    }
}
