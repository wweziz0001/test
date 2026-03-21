package Z1;

import Q1.C0121d;
import androidx.work.OverwritingInputMerger;
import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f3045x;
    public static final B0.l y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Q1.g f3050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q1.g f3051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3053h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0121d f3054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f3058n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f3059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f3060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f3064t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f3065u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3066v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f3067w;

    static {
        String strF = Q1.q.f("WorkSpec");
        N3.h.d(strF, "tagWithPrefix(\"WorkSpec\")");
        f3045x = strF;
        y = new B0.l(1);
    }

    public p(String str, int i, String str2, String str3, Q1.g gVar, Q1.g gVar2, long j5, long j6, long j7, C0121d c0121d, int i5, int i6, long j8, long j9, long j10, long j11, boolean z4, int i7, int i8, int i9, long j12, int i10, int i11) {
        N3.h.e(str, "id");
        AbstractC0307a.r("state", i);
        N3.h.e(str2, "workerClassName");
        N3.h.e(str3, "inputMergerClassName");
        N3.h.e(gVar, "input");
        N3.h.e(gVar2, "output");
        N3.h.e(c0121d, "constraints");
        AbstractC0307a.r("backoffPolicy", i6);
        AbstractC0307a.r("outOfQuotaPolicy", i7);
        this.f3046a = str;
        this.f3047b = i;
        this.f3048c = str2;
        this.f3049d = str3;
        this.f3050e = gVar;
        this.f3051f = gVar2;
        this.f3052g = j5;
        this.f3053h = j6;
        this.i = j7;
        this.f3054j = c0121d;
        this.f3055k = i5;
        this.f3056l = i6;
        this.f3057m = j8;
        this.f3058n = j9;
        this.f3059o = j10;
        this.f3060p = j11;
        this.f3061q = z4;
        this.f3062r = i7;
        this.f3063s = i8;
        this.f3064t = i9;
        this.f3065u = j12;
        this.f3066v = i10;
        this.f3067w = i11;
    }

    public static p b(p pVar, String str, int i, String str2, Q1.g gVar, int i5, long j5, int i6, int i7, long j6, int i8, int i9) {
        boolean z4;
        int i10;
        String str3 = (i9 & 1) != 0 ? pVar.f3046a : str;
        int i11 = (i9 & 2) != 0 ? pVar.f3047b : i;
        String str4 = (i9 & 4) != 0 ? pVar.f3048c : str2;
        String str5 = pVar.f3049d;
        Q1.g gVar2 = (i9 & 16) != 0 ? pVar.f3050e : gVar;
        Q1.g gVar3 = pVar.f3051f;
        long j7 = pVar.f3052g;
        long j8 = pVar.f3053h;
        long j9 = pVar.i;
        C0121d c0121d = pVar.f3054j;
        int i12 = (i9 & 1024) != 0 ? pVar.f3055k : i5;
        int i13 = pVar.f3056l;
        long j10 = pVar.f3057m;
        long j11 = (i9 & 8192) != 0 ? pVar.f3058n : j5;
        long j12 = pVar.f3059o;
        long j13 = pVar.f3060p;
        boolean z5 = pVar.f3061q;
        int i14 = pVar.f3062r;
        if ((i9 & 262144) != 0) {
            z4 = z5;
            i10 = pVar.f3063s;
        } else {
            z4 = z5;
            i10 = i6;
        }
        int i15 = (524288 & i9) != 0 ? pVar.f3064t : i7;
        long j14 = (1048576 & i9) != 0 ? pVar.f3065u : j6;
        int i16 = (i9 & 2097152) != 0 ? pVar.f3066v : i8;
        int i17 = pVar.f3067w;
        pVar.getClass();
        N3.h.e(str3, "id");
        AbstractC0307a.r("state", i11);
        N3.h.e(str4, "workerClassName");
        N3.h.e(str5, "inputMergerClassName");
        N3.h.e(gVar2, "input");
        N3.h.e(gVar3, "output");
        N3.h.e(c0121d, "constraints");
        AbstractC0307a.r("backoffPolicy", i13);
        AbstractC0307a.r("outOfQuotaPolicy", i14);
        return new p(str3, i11, str4, str5, gVar2, gVar3, j7, j8, j9, c0121d, i12, i13, j10, j11, j12, j13, z4, i14, i10, i15, j14, i16, i17);
    }

    public final long a() {
        return i4.a.f(this.f3047b == 1 && this.f3055k > 0, this.f3055k, this.f3056l, this.f3057m, this.f3058n, this.f3063s, d(), this.f3052g, this.i, this.f3053h, this.f3065u);
    }

    public final boolean c() {
        return !N3.h.a(C0121d.i, this.f3054j);
    }

    public final boolean d() {
        return this.f3053h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return N3.h.a(this.f3046a, pVar.f3046a) && this.f3047b == pVar.f3047b && N3.h.a(this.f3048c, pVar.f3048c) && N3.h.a(this.f3049d, pVar.f3049d) && N3.h.a(this.f3050e, pVar.f3050e) && N3.h.a(this.f3051f, pVar.f3051f) && this.f3052g == pVar.f3052g && this.f3053h == pVar.f3053h && this.i == pVar.i && N3.h.a(this.f3054j, pVar.f3054j) && this.f3055k == pVar.f3055k && this.f3056l == pVar.f3056l && this.f3057m == pVar.f3057m && this.f3058n == pVar.f3058n && this.f3059o == pVar.f3059o && this.f3060p == pVar.f3060p && this.f3061q == pVar.f3061q && this.f3062r == pVar.f3062r && this.f3063s == pVar.f3063s && this.f3064t == pVar.f3064t && this.f3065u == pVar.f3065u && this.f3066v == pVar.f3066v && this.f3067w == pVar.f3067w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    public final int hashCode() {
        int iF = AbstractC0307a.f(this.f3060p, AbstractC0307a.f(this.f3059o, AbstractC0307a.f(this.f3058n, AbstractC0307a.f(this.f3057m, (O.i.b(this.f3056l) + ((Integer.hashCode(this.f3055k) + ((this.f3054j.hashCode() + AbstractC0307a.f(this.i, AbstractC0307a.f(this.f3053h, AbstractC0307a.f(this.f3052g, (this.f3051f.hashCode() + ((this.f3050e.hashCode() + AbstractC0307a.e(AbstractC0307a.e((O.i.b(this.f3047b) + (this.f3046a.hashCode() * 31)) * 31, this.f3048c, 31), this.f3049d, 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31, 31), 31), 31), 31);
        boolean z4 = this.f3061q;
        ?? r22 = z4;
        if (z4) {
            r22 = 1;
        }
        return Integer.hashCode(this.f3067w) + ((Integer.hashCode(this.f3066v) + AbstractC0307a.f(this.f3065u, (Integer.hashCode(this.f3064t) + ((Integer.hashCode(this.f3063s) + ((O.i.b(this.f3062r) + ((iF + r22) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f3046a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p(String str, int i, String str2, String str3, Q1.g gVar, Q1.g gVar2, long j5, long j6, long j7, C0121d c0121d, int i5, int i6, long j8, long j9, long j10, long j11, boolean z4, int i7, int i8, long j12, int i9, int i10, int i11) {
        Q1.g gVar3;
        Q1.g gVar4;
        int i12 = (i11 & 2) != 0 ? 1 : i;
        String name = (i11 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3;
        if ((i11 & 16) != 0) {
            Q1.g gVar5 = Q1.g.f1823c;
            N3.h.d(gVar5, "EMPTY");
            gVar3 = gVar5;
        } else {
            gVar3 = gVar;
        }
        if ((i11 & 32) != 0) {
            Q1.g gVar6 = Q1.g.f1823c;
            N3.h.d(gVar6, "EMPTY");
            gVar4 = gVar6;
        } else {
            gVar4 = gVar2;
        }
        this(str, i12, str2, name, gVar3, gVar4, (i11 & 64) != 0 ? 0L : j5, (i11 & 128) != 0 ? 0L : j6, (i11 & 256) != 0 ? 0L : j7, (i11 & 512) != 0 ? C0121d.i : c0121d, (i11 & 1024) != 0 ? 0 : i5, (i11 & 2048) != 0 ? 1 : i6, (i11 & 4096) != 0 ? 30000L : j8, (i11 & 8192) != 0 ? -1L : j9, (i11 & 16384) != 0 ? 0L : j10, (32768 & i11) != 0 ? -1L : j11, (65536 & i11) != 0 ? false : z4, (131072 & i11) == 0 ? i7 : 1, (262144 & i11) != 0 ? 0 : i8, 0, (1048576 & i11) != 0 ? Long.MAX_VALUE : j12, (2097152 & i11) != 0 ? 0 : i9, (i11 & 4194304) != 0 ? -256 : i10);
    }
}
