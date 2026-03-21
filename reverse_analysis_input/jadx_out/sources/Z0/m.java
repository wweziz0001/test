package Z0;

import A0.y;
import F0.K;
import a0.AbstractC0156G;
import a0.C0157H;
import a0.C0185k;
import a0.C0186l;
import a0.C0189o;
import a0.C0190p;
import android.util.SparseArray;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import d0.C0368u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import m.B0;
import m2.C0640G;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements F0.q {
    public static final byte[] M = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C0190p f2868N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f2869A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f2870B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public l f2871C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f2872D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f2873E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f2874F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f2875G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f2876H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public F0.s f2877I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public K[] f2878J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public K[] f2879K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f2880L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1.j f2881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f2883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2884d;
    public final byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0363p f2889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0368u f2890k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f2895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k0.n f2896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b0 f2897r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2898s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2899t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f2900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0363p f2902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f2903x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f2904z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z1.e f2891l = new Z1.e(4, (byte) 0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0363p f2892m = new C0363p(16);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0363p f2886f = new C0363p(e0.n.f5545a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0363p f2887g = new C0363p(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0363p f2888h = new C0363p();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque f2893n = new ArrayDeque();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque f2894o = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f2885e = new SparseArray();

    static {
        C0189o c0189o = new C0189o();
        c0189o.f3387m = AbstractC0156G.m("application/x-emsg");
        f2868N = new C0190p(c0189o);
    }

    public m(c1.j jVar, int i, C0368u c0368u, t tVar, List list, k0.n nVar) {
        this.f2881a = jVar;
        this.f2882b = i;
        this.f2890k = c0368u;
        this.f2883c = tVar;
        this.f2884d = Collections.unmodifiableList(list);
        this.f2896q = nVar;
        byte[] bArr = new byte[16];
        this.i = bArr;
        this.f2889j = new C0363p(bArr);
        C0640G c0640g = I.f8549m;
        this.f2897r = b0.f8583p;
        this.f2869A = -9223372036854775807L;
        this.f2904z = -9223372036854775807L;
        this.f2870B = -9223372036854775807L;
        this.f2877I = F0.s.f816b;
        this.f2878J = new K[0];
        this.f2879K = new K[0];
        this.f2895p = new y(new j(this));
    }

    public static C0186l a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            e0.c cVar = (e0.c) arrayList.get(i);
            if (cVar.f5494m == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = cVar.f5492n.f5313a;
                B0.d dVarI = s.i(bArr);
                UUID uuid = dVarI == null ? null : (UUID) dVarI.f190l;
                if (uuid == null) {
                    AbstractC0360m.y("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C0185k(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C0186l(null, false, (C0185k[]) arrayList2.toArray(new C0185k[0]));
    }

    public static void c(C0363p c0363p, int i, v vVar) throws C0157H {
        c0363p.H(i + 8);
        int i5 = c0363p.i();
        byte[] bArr = h.f2848a;
        if ((i5 & 1) != 0) {
            throw C0157H.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (i5 & 2) != 0;
        int iZ = c0363p.z();
        if (iZ == 0) {
            Arrays.fill(vVar.f2977l, 0, vVar.f2971e, false);
            return;
        }
        if (iZ != vVar.f2971e) {
            StringBuilder sbJ = B0.j(iZ, "Senc sample count ", " is different from fragment sample count");
            sbJ.append(vVar.f2971e);
            throw C0157H.a(null, sbJ.toString());
        }
        Arrays.fill(vVar.f2977l, 0, iZ, z4);
        int iA = c0363p.a();
        C0363p c0363p2 = vVar.f2979n;
        c0363p2.E(iA);
        vVar.f2976k = true;
        vVar.f2980o = true;
        c0363p.g(c0363p2.f5313a, 0, c0363p2.f5315c);
        c0363p2.H(0);
        vVar.f2980o = false;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        SparseArray sparseArray = this.f2885e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((l) sparseArray.valueAt(i)).e();
        }
        this.f2894o.clear();
        this.y = 0;
        this.f2895p.c(0);
        this.f2904z = j6;
        this.f2893n.clear();
        this.f2898s = 0;
        this.f2901v = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        r2 = r5[4];
        r4 = java.util.Objects.equals(r6.f3424n, "video/avc");
        r15 = r6.f3421k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ff, code lost:
    
        if (r4 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0205, code lost:
    
        if (a0.AbstractC0156G.b(r15, "video/avc") == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0208, code lost:
    
        r23 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        r23 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0211, code lost:
    
        if ((r2 & 31) == 6) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0219, code lost:
    
        if (java.util.Objects.equals(r6.f3424n, "video/hevc") != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021f, code lost:
    
        if (a0.AbstractC0156G.b(r15, "video/hevc") == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0227, code lost:
    
        if (((r2 & 126) >> 1) != 39) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0229, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x022b, code lost:
    
        r23 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022e, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022f, code lost:
    
        r33.f2876H = r2;
        r33.f2873E += 5;
        r33.f2872D += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023e, code lost:
    
        if (r33.f2875G != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024c, code lost:
    
        if (java.util.Objects.equals(r3.f2860d.f2983a.f2957g.f3424n, "video/avc") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0255, code lost:
    
        if (e0.n.c(r5[4]) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0257, code lost:
    
        r33.f2875G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025a, code lost:
    
        r6 = r17;
        r4 = r19;
        r15 = r20;
        r13 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0262, code lost:
    
        r14 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x026d, code lost:
    
        throw a0.C0157H.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x026e, code lost:
    
        r19 = r4;
        r23 = r13;
        r20 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0277, code lost:
    
        if (r33.f2876H == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0279, code lost:
    
        r4 = r33.f2888h;
        r4.E(r2);
        r24 = r5;
        ((F0.C0066m) r34).l(r4.f5313a, 0, r33.f2874F, false);
        r12.a(r4, r33.f2874F, 0);
        r2 = r33.f2874F;
        r5 = e0.n.k(r4.f5315c, r4.f5313a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a0, code lost:
    
        if (java.util.Objects.equals(r6.f3424n, "video/hevc") != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02a8, code lost:
    
        if (a0.AbstractC0156G.b(r6.f3421k, "video/hevc") == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ab, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ad, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ae, code lost:
    
        r4.H(r13);
        r4.G(r5);
        r5 = r6.f3426p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02b7, code lost:
    
        if (r5 != (-1)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02bb, code lost:
    
        if (r9.f160a == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02bd, code lost:
    
        r9.f160a = 0;
        r9.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c6, code lost:
    
        if (r9.f160a == r5) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c8, code lost:
    
        if (r5 < 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ca, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02cc, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02cd, code lost:
    
        d0.AbstractC0360m.h(r6);
        r9.f160a = r5;
        r9.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d5, code lost:
    
        r9.a(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02de, code lost:
    
        if ((r3.a() & 4) == 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02e0, code lost:
    
        r9.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e7, code lost:
    
        r24 = r5;
        r2 = r12.d(r34, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ee, code lost:
    
        r33.f2873E += r2;
        r33.f2874F -= r2;
        r6 = r17;
        r4 = r19;
        r15 = r20;
        r13 = r23;
        r5 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0304, code lost:
    
        r17 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0307, code lost:
    
        r17 = r6;
        r31 = r14;
        r30 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x030d, code lost:
    
        r2 = r33.f2873E;
        r4 = r33.f2872D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0311, code lost:
    
        if (r2 >= r4) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0313, code lost:
    
        r33.f2873E += r12.d(r34, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031f, code lost:
    
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0325, code lost:
    
        if ((r17 & 64) == 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0329, code lost:
    
        if (r33.f2875G != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x032b, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x032e, code lost:
    
        r26 = r1;
        r1 = r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0334, code lost:
    
        if (r1 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0336, code lost:
    
        r29 = r1.f2964c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x033b, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x033d, code lost:
    
        r12.b(r10, r26, r33.f2872D, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x034e, code lost:
    
        if (r31.isEmpty() != false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0350, code lost:
    
        r1 = (Z0.k) r31.removeFirst();
        r33.y -= r1.f2856c;
        r2 = r1.f2855b;
        r4 = r1.f2854a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0361, code lost:
    
        if (r2 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0363, code lost:
    
        r4 = r4 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0364, code lost:
    
        r2 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0366, code lost:
    
        if (r30 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0368, code lost:
    
        r4 = r2.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x036c, code lost:
    
        r6 = r33.f2878J;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0370, code lost:
    
        if (r8 >= r7) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0372, code lost:
    
        r6[r8].b(r4, 1, r1.f2856c, r33.y, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0386, code lost:
    
        r30 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x038d, code lost:
    
        if (r3.c() != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x038f, code lost:
    
        r33.f2871C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0392, code lost:
    
        r33.f2898s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        r4 = r33.f2898s;
        r6 = r33.f2882b;
        r8 = r3.f2858b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r4 != 3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
    
        if (r3.f2867l != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        r4 = r3.f2860d.f2986d[r3.f2862f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        r4 = r8.f2974h[r3.f2862f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        r33.f2872D = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        if ((r6 & 64) == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e3, code lost:
    
        if (java.util.Objects.equals(r3.f2860d.f2983a.f2957g.f3424n, "video/avc") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        r33.f2875G = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
    
        if (r3.f2862f >= r3.i) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
    
        ((F0.C0066m) r34).f(r33.f2872D);
        r1 = r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ff, code lost:
    
        r2 = r8.f2979n;
        r1 = r1.f2965d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0103, code lost:
    
        if (r1 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0105, code lost:
    
        r2.I(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0108, code lost:
    
        r1 = r3.f2862f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010c, code lost:
    
        if (r8.f2976k == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0112, code lost:
    
        if (r8.f2977l[r1] == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0114, code lost:
    
        r2.I(r2.B() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0120, code lost:
    
        if (r3.c() != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0122, code lost:
    
        r33.f2871C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0125, code lost:
    
        r33.f2898s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0128, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0131, code lost:
    
        if (r3.f2860d.f2983a.f2958h != r2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0133, code lost:
    
        r33.f2872D -= 8;
        ((F0.C0066m) r34).f(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014e, code lost:
    
        if ("audio/ac4".equals(r3.f2860d.f2983a.f2957g.f3424n) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0150, code lost:
    
        r33.f2873E = r3.d(r33.f2872D, 7);
        r4 = r33.f2872D;
        r11 = r33.f2889j;
        F0.AbstractC0055b.i(r4, r11);
        r12 = 0;
        r3.f2857a.a(r11, 7, 0);
        r33.f2873E += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016c, code lost:
    
        r12 = 0;
        r33.f2873E = r3.d(r33.f2872D, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0175, code lost:
    
        r33.f2872D += r33.f2873E;
        r33.f2898s = 4;
        r33.f2874F = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0181, code lost:
    
        r4 = r3.f2860d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0185, code lost:
    
        if (r3.f2867l != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
    
        r10 = r4.f2988f[r3.f2862f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018e, code lost:
    
        r10 = r8.i[r3.f2862f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0194, code lost:
    
        if (r15 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0196, code lost:
    
        r10 = r15.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019a, code lost:
    
        r4 = r4.f2983a;
        r8 = r4.f2960k;
        r12 = r3.f2857a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a0, code lost:
    
        if (r8 == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a2, code lost:
    
        r13 = r33.f2887g;
        r5 = r13.f5313a;
        r5[0] = 0;
        r5[r2] = 0;
        r5[2] = 0;
        r30 = r15;
        r15 = r8 + 1;
        r8 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b8, code lost:
    
        r31 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01be, code lost:
    
        if (r33.f2873E >= r33.f2872D) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c0, code lost:
    
        r2 = r33.f2874F;
        r17 = r6;
        r6 = r4.f2957g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c8, code lost:
    
        if (r2 != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ca, code lost:
    
        r19 = r4;
        ((F0.C0066m) r34).l(r5, r8, r15, false);
        r13.H(0);
        r2 = r13.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01db, code lost:
    
        if (r2 < 1) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01dd, code lost:
    
        r33.f2874F = r2 - 1;
        r2 = r33.f2886f;
        r2.H(0);
        r20 = r15;
        r12.a(r2, 4, 0);
        r12.a(r13, 1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f3, code lost:
    
        if (r33.f2879K.length <= 0) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // F0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(F0.r r34, F0.u r35) throws a0.C0157H, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 2137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.m.d(F0.r, F0.u):int");
    }

    @Override // F0.q
    public final boolean e(F0.r rVar) {
        b0 b0VarU;
        F0.I iK = s.k(rVar, true, false);
        if (iK != null) {
            b0VarU = I.u(iK);
        } else {
            C0640G c0640g = I.f8549m;
            b0VarU = b0.f8583p;
        }
        this.f2897r = b0VarU;
        return iK == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:359:0x0800, code lost:
    
        r5 = r0;
        r5.f2898s = 0;
        r5.f2901v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0806, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r56) throws a0.C0157H {
        /*
            Method dump skipped, instruction units count: 2055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.m.f(long):void");
    }

    @Override // F0.q
    public final void j(F0.s sVar) {
        int i;
        int i5 = this.f2882b;
        if ((i5 & 32) == 0) {
            sVar = new Z1.s(sVar, this.f2881a);
        }
        this.f2877I = sVar;
        this.f2898s = 0;
        this.f2901v = 0;
        K[] kArr = new K[2];
        this.f2878J = kArr;
        k0.n nVar = this.f2896q;
        if (nVar != null) {
            kArr[0] = nVar;
            i = 1;
        } else {
            i = 0;
        }
        int i6 = 100;
        if ((i5 & 4) != 0) {
            kArr[i] = sVar.k(100, 5);
            i6 = 101;
            i++;
        }
        K[] kArr2 = (K[]) AbstractC0370w.O(i, this.f2878J);
        this.f2878J = kArr2;
        for (K k4 : kArr2) {
            k4.c(f2868N);
        }
        List list = this.f2884d;
        this.f2879K = new K[list.size()];
        int i7 = 0;
        while (i7 < this.f2879K.length) {
            K k5 = this.f2877I.k(i6, 3);
            k5.c((C0190p) list.get(i7));
            this.f2879K[i7] = k5;
            i7++;
            i6++;
        }
        t tVar = this.f2883c;
        if (tVar != null) {
            this.f2885e.put(0, new l(this.f2877I.k(0, tVar.f2952b), new w(this.f2883c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new i(0, 0, 0, 0)));
            this.f2877I.j();
        }
    }

    @Override // F0.q
    public final List k() {
        return this.f2897r;
    }

    @Override // F0.q
    public final void release() {
    }
}
