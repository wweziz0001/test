package Z0;

import F0.E;
import F0.L;
import d0.AbstractC0370w;
import d0.C0363p;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import m2.C0640G;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class p implements F0.q, E {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public o[] f2913A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long[][] f2914B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f2915C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f2916D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f2917E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public U0.a f2918F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1.j f2919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f2921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0363p f2922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0363p f2923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0363p f2924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f2925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f2926h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b0 f2927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0363p f2932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2937t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2938u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2939v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f2940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2941x;
    public long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public F0.s f2942z;

    public p(c1.j jVar, int i) {
        this.f2919a = jVar;
        this.f2920b = i;
        C0640G c0640g = I.f8549m;
        this.f2927j = b0.f8583p;
        this.f2928k = (i & 4) != 0 ? 3 : 0;
        this.f2926h = new r();
        this.i = new ArrayList();
        this.f2924f = new C0363p(16);
        this.f2925g = new ArrayDeque();
        this.f2921c = new C0363p(e0.n.f5545a);
        this.f2922d = new C0363p(5);
        this.f2923e = new C0363p();
        this.f2933p = -1;
        this.f2942z = F0.s.f816b;
        this.f2913A = new o[0];
        this.f2937t = (i & 32) == 0;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        this.f2925g.clear();
        this.f2931n = 0;
        this.f2933p = -1;
        this.f2934q = 0;
        this.f2935r = 0;
        this.f2936s = 0;
        this.f2937t = (this.f2920b & 32) == 0;
        if (j5 == 0) {
            if (this.f2928k != 3) {
                this.f2928k = 0;
                this.f2931n = 0;
                return;
            } else {
                r rVar = this.f2926h;
                rVar.f2947a.clear();
                rVar.f2948b = 0;
                this.i.clear();
                return;
            }
        }
        for (o oVar : this.f2913A) {
            w wVar = oVar.f2909b;
            int iE = AbstractC0370w.e(wVar.f2988f, j6, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((wVar.f2989g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = wVar.a(j6);
            }
            oVar.f2912e = iE;
            L l3 = oVar.f2911d;
            if (l3 != null) {
                l3.f704b = false;
                l3.f705c = 0;
            }
        }
    }

    @Override // F0.E
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x06db A[SYNTHETIC] */
    @Override // F0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(F0.r r38, F0.u r39) throws a0.C0157H {
        /*
            Method dump skipped, instruction units count: 1806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.p.d(F0.r, F0.u):int");
    }

    @Override // F0.q
    public final boolean e(F0.r rVar) {
        b0 b0VarU;
        F0.I iK = s.k(rVar, false, (this.f2920b & 2) != 0);
        if (iK != null) {
            b0VarU = I.u(iK);
        } else {
            C0640G c0640g = I.f8549m;
            b0VarU = b0.f8583p;
        }
        this.f2927j = b0VarU;
        return iK == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df A[EDGE_INSN: B:72:0x00df->B:64:0x00df BREAK  A[LOOP:1: B:29:0x006c->B:63:0x00d7], SYNTHETIC] */
    @Override // F0.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F0.D g(long r22) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.p.g(long):F0.D");
    }

    @Override // F0.E
    public final long i() {
        return this.f2916D;
    }

    @Override // F0.q
    public final void j(F0.s sVar) {
        if ((this.f2920b & 16) == 0) {
            sVar = new Z1.s(sVar, this.f2919a);
        }
        this.f2942z = sVar;
    }

    @Override // F0.q
    public final List k() {
        return this.f2927j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021a, code lost:
    
        r6.H(r7);
        r7 = r7 + r9;
        r6.I(8);
        r8 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0228, code lost:
    
        r9 = r6.f5314b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x022a, code lost:
    
        if (r9 >= r7) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022c, code lost:
    
        r9 = r6.i() + r9;
        r4 = r6.i();
        r17 = r7;
        r7 = (r4 >> 24) & 255;
        r29 = r0;
        r30 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0248, code lost:
    
        if (r7 == 169) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024c, code lost:
    
        if (r7 != 253) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024e, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0258, code lost:
    
        if (r4 != 1735291493) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x025a, code lost:
    
        r0 = T0.j.a(Z0.s.g(r6) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0264, code lost:
    
        if (r0 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0266, code lost:
    
        r3 = new T0.n("TCON", null, m2.I.u(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0271, code lost:
    
        d0.AbstractC0360m.y("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0277, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0278, code lost:
    
        r6.H(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027b, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0286, code lost:
    
        if (r4 != 1684632427) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0288, code lost:
    
        r3 = Z0.s.f(r4, r6, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0295, code lost:
    
        if (r4 != 1953655662) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0297, code lost:
    
        r3 = Z0.s.f(r4, r6, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a1, code lost:
    
        if (r4 != 1953329263) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a3, code lost:
    
        r0 = Z0.s.h(r4, "TBPM", r6, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ab, code lost:
    
        r6.H(r9);
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b3, code lost:
    
        if (r4 != 1668311404) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b5, code lost:
    
        r3 = Z0.s.h(r4, "TCMP", r6, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c0, code lost:
    
        if (r4 != 1668249202) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c2, code lost:
    
        r3 = Z0.s.e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ca, code lost:
    
        if (r4 != 1631670868) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cc, code lost:
    
        r3 = Z0.s.j(r4, r6, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d6, code lost:
    
        if (r4 != 1936682605) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d8, code lost:
    
        r3 = Z0.s.j(r4, r6, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e2, code lost:
    
        if (r4 != 1936679276) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e4, code lost:
    
        r3 = Z0.s.j(r4, r6, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ee, code lost:
    
        if (r4 != 1936679282) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f0, code lost:
    
        r3 = Z0.s.j(r4, r6, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02fa, code lost:
    
        if (r4 != 1936679265) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02fc, code lost:
    
        r3 = Z0.s.j(r4, r6, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0307, code lost:
    
        if (r4 != 1936679791) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0309, code lost:
    
        r3 = Z0.s.j(r4, r6, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0314, code lost:
    
        if (r4 != 1920233063) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0316, code lost:
    
        r3 = Z0.s.h(r4, "ITUNESADVISORY", r6, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0322, code lost:
    
        if (r4 != 1885823344) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0324, code lost:
    
        r0 = Z0.s.h(r4, "ITUNESGAPLESS", r6, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0331, code lost:
    
        if (r4 != 1936683886) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0333, code lost:
    
        r3 = Z0.s.j(r4, r6, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x033e, code lost:
    
        if (r4 != 1953919848) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0340, code lost:
    
        r3 = Z0.s.j(r4, r6, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x034b, code lost:
    
        if (r4 != 757935405) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x034d, code lost:
    
        r3 = null;
        r4 = null;
        r0 = -1;
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0351, code lost:
    
        r11 = r6.f5314b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0353, code lost:
    
        if (r11 >= r9) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0355, code lost:
    
        r20 = r6.i();
        r7 = r6.i();
        r6.I(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0366, code lost:
    
        if (r7 != 1835360622) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0368, code lost:
    
        r3 = r6.r(r20 - 12);
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0376, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x037d, code lost:
    
        if (r7 != 1851878757) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x037f, code lost:
    
        r4 = r6.r(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0389, code lost:
    
        if (r7 != 1684108385) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x038b, code lost:
    
        r1 = r20;
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x038f, code lost:
    
        r6.I(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0394, code lost:
    
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0398, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x039d, code lost:
    
        if (r3 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x039f, code lost:
    
        if (r4 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03a2, code lost:
    
        if (r0 != (-1)) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03a5, code lost:
    
        r6.H(r0);
        r6.I(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03b7, code lost:
    
        r3 = new T0.k(r3, r4, r6.r(r1 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03b9, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03ba, code lost:
    
        r6.H(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03bf, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03c6, code lost:
    
        r0 = 16777215 & r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03cd, code lost:
    
        if (r0 != 6516084) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03cf, code lost:
    
        r3 = Z0.s.d(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03d7, code lost:
    
        if (r0 == 7233901) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03dc, code lost:
    
        if (r0 != 7631467) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03e3, code lost:
    
        if (r0 == 6516589) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03e8, code lost:
    
        if (r0 != 7828084) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03ef, code lost:
    
        if (r0 != 6578553) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03f1, code lost:
    
        r3 = Z0.s.j(r4, r6, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03fb, code lost:
    
        if (r0 != 4280916) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03fd, code lost:
    
        r3 = Z0.s.j(r4, r6, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0407, code lost:
    
        if (r0 != 7630703) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0409, code lost:
    
        r3 = Z0.s.j(r4, r6, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0413, code lost:
    
        if (r0 != 6384738) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0415, code lost:
    
        r3 = Z0.s.j(r4, r6, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x041f, code lost:
    
        if (r0 != 7108978) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0421, code lost:
    
        r3 = Z0.s.j(r4, r6, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x042b, code lost:
    
        if (r0 != 6776174) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x042d, code lost:
    
        r3 = Z0.s.j(r4, r6, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0435, code lost:
    
        if (r0 != 6779504) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0437, code lost:
    
        r3 = Z0.s.j(r4, r6, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x043f, code lost:
    
        d0.AbstractC0360m.k("MetadataUtil", "Skipped unknown metadata entry: " + e0.d.c(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0452, code lost:
    
        r6.H(r9);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0457, code lost:
    
        r3 = Z0.s.j(r4, r6, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x045f, code lost:
    
        r3 = Z0.s.j(r4, r6, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0467, code lost:
    
        if (r3 == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0469, code lost:
    
        r8.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x046c, code lost:
    
        r7 = r17;
        r0 = r29;
        r3 = r30;
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x047b, code lost:
    
        r6.H(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x047e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x047f, code lost:
    
        r29 = r0;
        r32 = r2;
        r30 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x048c, code lost:
    
        if (r8.isEmpty() == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x048e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0490, code lost:
    
        r0 = new a0.C0155F(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0495, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x08b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(long r34) {
        /*
            Method dump skipped, instruction units count: 2255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.p.l(long):void");
    }

    @Override // F0.q
    public final void release() {
    }
}
