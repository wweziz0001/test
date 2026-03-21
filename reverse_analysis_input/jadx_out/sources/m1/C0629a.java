package m1;

import F0.K;
import F0.s;
import Z0.g;
import a0.AbstractC0156G;
import a0.C0157H;
import a0.C0189o;
import a0.C0190p;
import com.ryanheise.audioservice.AudioService;
import d0.AbstractC0370w;
import d0.C0363p;
import java.math.RoundingMode;

/* JADX INFO: renamed from: m1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0629a implements InterfaceC0630b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f8502m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f8503n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, AudioService.KEYCODE_BYPASS_PAUSE, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f8504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f8505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f8506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f8508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0363p f8509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0190p f8511h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f8512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8514l;

    public C0629a(s sVar, K k4, g gVar) throws C0157H {
        this.f8504a = sVar;
        this.f8505b = k4;
        this.f8506c = gVar;
        int i = gVar.f2844c;
        int iMax = Math.max(1, i / 10);
        this.f8510g = iMax;
        C0363p c0363p = new C0363p((byte[]) gVar.f2847f);
        c0363p.o();
        int iO = c0363p.o();
        this.f8507d = iO;
        int i5 = gVar.f2843b;
        int i6 = gVar.f2845d;
        int i7 = (((i6 - (i5 * 4)) * 8) / (gVar.f2846e * i5)) + 1;
        if (iO != i7) {
            throw C0157H.a(null, "Expected frames per block: " + i7 + "; got: " + iO);
        }
        int iF = AbstractC0370w.f(iMax, iO);
        this.f8508e = new byte[iF * i6];
        this.f8509f = new C0363p(iO * 2 * i5 * iF);
        int i8 = ((i6 * i) * 8) / iO;
        C0189o c0189o = new C0189o();
        c0189o.f3387m = AbstractC0156G.m("audio/raw");
        c0189o.f3383h = i8;
        c0189o.i = i8;
        c0189o.f3388n = iMax * 2 * i5;
        c0189o.f3366B = i5;
        c0189o.f3367C = i;
        c0189o.f3368D = 2;
        this.f8511h = new C0190p(c0189o);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:44:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // m1.InterfaceC0630b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(F0.C0066m r26, long r27) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C0629a.a(F0.m, long):boolean");
    }

    @Override // m1.InterfaceC0630b
    public final void b(long j5) {
        this.i = 0;
        this.f8512j = j5;
        this.f8513k = 0;
        this.f8514l = 0L;
    }

    @Override // m1.InterfaceC0630b
    public final void c(long j5, int i) {
        this.f8504a.d(new C0633e(this.f8506c, this.f8507d, i, j5));
        this.f8505b.c(this.f8511h);
    }

    public final void d(int i) {
        long j5 = this.f8512j;
        long j6 = this.f8514l;
        g gVar = this.f8506c;
        long j7 = gVar.f2844c;
        int i5 = AbstractC0370w.f5326a;
        long jU = j5 + AbstractC0370w.U(j6, 1000000L, j7, RoundingMode.DOWN);
        int i6 = i * 2 * gVar.f2843b;
        this.f8505b.b(jU, 1, i6, this.f8513k - i6, null);
        this.f8514l += (long) i;
        this.f8513k -= i6;
    }
}
