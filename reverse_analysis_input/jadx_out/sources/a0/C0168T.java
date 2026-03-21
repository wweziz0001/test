package a0;

import android.net.Uri;
import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import m2.C0640G;

/* JADX INFO: renamed from: a0.T, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0168T {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f3243q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0150A f3244r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3246b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3252h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0196v f3253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f3255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f3259p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3245a = f3243q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0150A f3247c = f3244r;

    static {
        F0.u uVar = new F0.u();
        C0640G c0640g = m2.I.f8549m;
        m2.b0 b0Var = m2.b0.f8583p;
        List listEmptyList = Collections.emptyList();
        m2.b0 b0Var2 = m2.b0.f8583p;
        C0195u c0195u = new C0195u();
        C0198x c0198x = C0198x.f3466a;
        Uri uri = Uri.EMPTY;
        f3244r = new C0150A("androidx.media3.common.Timeline", new C0194t(uVar), uri != null ? new C0197w(uri, null, null, listEmptyList, b0Var2, null, -9223372036854775807L) : null, new C0196v(c0195u), C0153D.f3185B, c0198x);
        AbstractC0307a.n(1, 2, 3, 4, 5);
        AbstractC0307a.n(6, 7, 8, 9, 10);
        AbstractC0370w.G(11);
        AbstractC0370w.G(12);
        AbstractC0370w.G(13);
    }

    public final boolean a() {
        return this.f3253j != null;
    }

    public final void b(C0150A c0150a, Object obj, long j5, long j6, long j7, boolean z4, boolean z5, C0196v c0196v, long j8, long j9, int i, long j10) {
        C0197w c0197w;
        this.f3245a = f3243q;
        this.f3247c = c0150a != null ? c0150a : f3244r;
        if (c0150a != null && (c0197w = c0150a.f3154b) != null) {
            String str = c0197w.f3464e;
        }
        this.f3248d = obj;
        this.f3249e = j5;
        this.f3250f = j6;
        this.f3251g = j7;
        this.f3252h = z4;
        this.i = z5;
        this.f3253j = c0196v;
        this.f3255l = j8;
        this.f3256m = j9;
        this.f3257n = 0;
        this.f3258o = i;
        this.f3259p = j10;
        this.f3254k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0168T.class.equals(obj.getClass())) {
            return false;
        }
        C0168T c0168t = (C0168T) obj;
        return Objects.equals(this.f3245a, c0168t.f3245a) && Objects.equals(this.f3247c, c0168t.f3247c) && Objects.equals(this.f3248d, c0168t.f3248d) && Objects.equals(this.f3253j, c0168t.f3253j) && this.f3249e == c0168t.f3249e && this.f3250f == c0168t.f3250f && this.f3251g == c0168t.f3251g && this.f3252h == c0168t.f3252h && this.i == c0168t.i && this.f3254k == c0168t.f3254k && this.f3255l == c0168t.f3255l && this.f3256m == c0168t.f3256m && this.f3257n == c0168t.f3257n && this.f3258o == c0168t.f3258o && this.f3259p == c0168t.f3259p;
    }

    public final int hashCode() {
        int iHashCode = (this.f3247c.hashCode() + ((this.f3245a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f3248d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C0196v c0196v = this.f3253j;
        int iHashCode3 = (iHashCode2 + (c0196v != null ? c0196v.hashCode() : 0)) * 31;
        long j5 = this.f3249e;
        int i = (iHashCode3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f3250f;
        int i5 = (i + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f3251g;
        int i6 = (((((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f3252h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.f3254k ? 1 : 0)) * 31;
        long j8 = this.f3255l;
        int i7 = (i6 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f3256m;
        int i8 = (((((i7 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.f3257n) * 31) + this.f3258o) * 31;
        long j10 = this.f3259p;
        return i8 + ((int) (j10 ^ (j10 >>> 32)));
    }
}
