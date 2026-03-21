package G0;

import A.j;
import F0.B;
import F0.C0065l;
import F0.C0066m;
import F0.E;
import F0.K;
import F0.o;
import F0.q;
import F0.r;
import F0.s;
import a0.C0157H;
import d0.AbstractC0370w;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f863s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f864t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f865u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f866v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f874h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public K f878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public K f879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E f880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f881p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f882q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f883r;

    static {
        int i = AbstractC0370w.f5326a;
        Charset charset = StandardCharsets.UTF_8;
        f865u = "#!AMR\n".getBytes(charset);
        f866v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i) {
        this.f868b = (i & 2) != 0 ? i | 1 : i;
        this.f867a = new byte[1];
        this.i = -1;
        o oVar = new o();
        this.f869c = oVar;
        this.f879n = oVar;
    }

    public final int a(C0066m c0066m) throws C0157H {
        boolean z4;
        c0066m.f801q = 0;
        byte[] bArr = this.f867a;
        c0066m.t(bArr, 0, 1, false);
        byte b4 = bArr[0];
        if ((b4 & 131) > 0) {
            throw C0157H.a(null, "Invalid padding bits for frame header " + ((int) b4));
        }
        int i = (b4 >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z4 = this.f870d) && (i < 10 || i > 13)) || (!z4 && (i < 12 || i > 14)))) {
            return z4 ? f864t[i] : f863s[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f870d ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C0157H.a(null, sb.toString());
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        this.f871e = 0L;
        this.f872f = 0;
        this.f873g = 0;
        this.f882q = j6;
        E e5 = this.f880o;
        if (!(e5 instanceof B)) {
            if (j5 == 0 || !(e5 instanceof C0065l)) {
                this.f876k = 0L;
                return;
            } else {
                C0065l c0065l = (C0065l) e5;
                this.f876k = (Math.max(0L, j5 - c0065l.f790b) * 8000000) / ((long) c0065l.f793e);
                return;
            }
        }
        B b4 = (B) e5;
        j jVar = b4.f678b;
        long jI = jVar.f26l == 0 ? -9223372036854775807L : jVar.i(AbstractC0370w.b(b4.f677a, j5));
        this.f876k = jI;
        if (Math.abs(this.f882q - jI) < 20000) {
            return;
        }
        this.f881p = true;
        this.f879n = this.f869c;
    }

    public final boolean c(C0066m c0066m) {
        c0066m.f801q = 0;
        byte[] bArr = f865u;
        byte[] bArr2 = new byte[bArr.length];
        c0066m.t(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f870d = false;
            c0066m.f(bArr.length);
            return true;
        }
        c0066m.f801q = 0;
        byte[] bArr3 = f866v;
        byte[] bArr4 = new byte[bArr3.length];
        c0066m.t(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f870d = true;
        c0066m.f(bArr3.length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    @Override // F0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(F0.r r25, F0.u r26) throws a0.C0157H {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.a.d(F0.r, F0.u):int");
    }

    @Override // F0.q
    public final boolean e(r rVar) {
        return c((C0066m) rVar);
    }

    @Override // F0.q
    public final void j(s sVar) {
        this.f877l = sVar;
        K k4 = sVar.k(0, 1);
        this.f878m = k4;
        this.f879n = k4;
        sVar.j();
    }

    @Override // F0.q
    public final void release() {
    }
}
