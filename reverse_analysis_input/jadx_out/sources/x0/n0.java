package x0;

import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0153D;
import a0.C0167S;
import a0.C0176b;
import a0.C0195u;
import a0.C0196v;
import a0.C0197w;
import a0.C0198x;
import android.net.Uri;
import d0.AbstractC0360m;
import java.util.Collections;
import java.util.List;
import m2.C0640G;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends AbstractC0169U {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f10750n = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10757h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f10758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f10759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0150A f10760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0196v f10761m;

    static {
        F0.u uVar = new F0.u();
        C0640G c0640g = m2.I.f8549m;
        m2.b0 b0Var = m2.b0.f8583p;
        List listEmptyList = Collections.emptyList();
        m2.b0 b0Var2 = m2.b0.f8583p;
        C0195u c0195u = new C0195u();
        C0198x c0198x = C0198x.f3466a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C0197w(uri, null, null, listEmptyList, b0Var2, null, -9223372036854775807L);
        }
        uVar.a();
        c0195u.a();
        C0153D c0153d = C0153D.f3185B;
    }

    public n0(long j5, boolean z4, boolean z5, C0150A c0150a) {
        this(j5, j5, 0L, 0L, z4, false, z5, null, c0150a);
    }

    @Override // a0.AbstractC0169U
    public final int b(Object obj) {
        return f10750n.equals(obj) ? 0 : -1;
    }

    @Override // a0.AbstractC0169U
    public final C0167S f(int i, C0167S c0167s, boolean z4) {
        AbstractC0360m.e(i, 1);
        Object obj = z4 ? f10750n : null;
        long j5 = -this.f10755f;
        c0167s.getClass();
        c0167s.h(null, obj, 0, this.f10753d, j5, C0176b.f3316c, false);
        return c0167s;
    }

    @Override // a0.AbstractC0169U
    public final int h() {
        return 1;
    }

    @Override // a0.AbstractC0169U
    public final Object l(int i) {
        AbstractC0360m.e(i, 1);
        return f10750n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r1
      0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a0.AbstractC0169U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a0.C0168T m(int r23, a0.C0168T r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            d0.AbstractC0360m.e(r2, r1)
            long r1 = r0.f10756g
            boolean r13 = r0.i
            if (r13 == 0) goto L2c
            boolean r3 = r0.f10758j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.f10754e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r25
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = a0.C0168T.f3243q
            a0.v r14 = r0.f10761m
            long r1 = r0.f10754e
            r17 = r1
            a0.A r4 = r0.f10760l
            java.lang.Object r5 = r0.f10759k
            long r6 = r0.f10751b
            long r8 = r0.f10752c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r12 = r0.f10757h
            r19 = 0
            long r1 = r0.f10755f
            r20 = r1
            r3 = r24
            r3.b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.n0.m(int, a0.T, long):a0.T");
    }

    @Override // a0.AbstractC0169U
    public final int o() {
        return 1;
    }

    public n0(long j5, long j6, long j7, long j8, boolean z4, boolean z5, boolean z6, Object obj, C0150A c0150a) {
        this(-9223372036854775807L, -9223372036854775807L, j5, j6, j7, j8, z4, z5, false, obj, c0150a, z6 ? c0150a.f3155c : null);
    }

    public n0(long j5, long j6, long j7, long j8, long j9, long j10, boolean z4, boolean z5, boolean z6, Object obj, C0150A c0150a, C0196v c0196v) {
        this.f10751b = j5;
        this.f10752c = j6;
        this.f10753d = j7;
        this.f10754e = j8;
        this.f10755f = j9;
        this.f10756g = j10;
        this.f10757h = z4;
        this.i = z5;
        this.f10758j = z6;
        this.f10759k = obj;
        c0150a.getClass();
        this.f10760l = c0150a;
        this.f10761m = c0196v;
    }
}
