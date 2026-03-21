package i0;

import D0.n;
import a0.AbstractC0169U;
import a0.C0167S;
import a0.C0168T;
import java.util.HashMap;
import java.util.Random;
import x0.H;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f6378h = new n(2);
    public static final Random i = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f6382d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6384f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0168T f6379a = new C0168T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0167S f6380b = new C0167S();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f6381c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC0169U f6383e = AbstractC0169U.f3260a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6385g = -1;

    public final void a(d dVar) {
        long j5 = dVar.f6373c;
        if (j5 != -1) {
            this.f6385g = j5;
        }
        this.f6384f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i0.d b(int r16, x0.H r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.f6381c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r4.next()
            i0.d r8 = (i0.d) r8
            long r9 = r8.f6373c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            int r9 = r8.f6372b
            if (r1 != r9) goto L51
            if (r2 == 0) goto L51
            i0.e r9 = r8.f6377g
            java.util.HashMap r10 = r9.f6381c
            java.lang.String r13 = r9.f6384f
            java.lang.Object r10 = r10.get(r13)
            i0.d r10 = (i0.d) r10
            if (r10 == 0) goto L44
            long r13 = r10.f6373c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L44
            goto L49
        L44:
            long r9 = r9.f6385g
            r13 = 1
            long r13 = r13 + r9
        L49:
            long r9 = r2.f10534d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L51
            r8.f6373c = r9
        L51:
            x0.H r9 = r8.f6374d
            if (r2 != 0) goto L5a
            int r10 = r8.f6372b
            if (r1 != r10) goto L15
            goto L7d
        L5a:
            long r13 = r2.f10534d
            if (r9 != 0) goto L6b
            boolean r10 = r17.b()
            if (r10 != 0) goto L15
            long r11 = r8.f6373c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L15
            goto L7d
        L6b:
            long r10 = r9.f10534d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L15
            int r10 = r2.f10532b
            int r11 = r9.f10532b
            if (r10 != r11) goto L15
            int r10 = r2.f10533c
            int r11 = r9.f10533c
            if (r10 != r11) goto L15
        L7d:
            long r10 = r8.f6373c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L97
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8a
            goto L97
        L8a:
            if (r12 != 0) goto L15
            int r10 = d0.AbstractC0370w.f5326a
            x0.H r10 = r5.f6374d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L97:
            r5 = r8
            r6 = r10
            goto L15
        L9b:
            if (r5 != 0) goto Lad
            D0.n r4 = i0.e.f6378h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            i0.d r5 = new i0.d
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b(int, x0.H):i0.d");
    }

    public final synchronized String c(AbstractC0169U abstractC0169U, H h2) {
        return b(abstractC0169U.g(h2.f10531a, this.f6380b).f3238c, h2).f6371a;
    }

    public final void d(C0477a c0477a) {
        H h2;
        boolean zP = c0477a.f6353b.p();
        HashMap map = this.f6381c;
        if (zP) {
            String str = this.f6384f;
            if (str != null) {
                d dVar = (d) map.get(str);
                dVar.getClass();
                a(dVar);
                return;
            }
            return;
        }
        d dVar2 = (d) map.get(this.f6384f);
        int i5 = c0477a.f6354c;
        H h5 = c0477a.f6355d;
        this.f6384f = b(i5, h5).f6371a;
        e(c0477a);
        if (h5 == null || !h5.b()) {
            return;
        }
        long j5 = h5.f10534d;
        if (dVar2 != null && dVar2.f6373c == j5 && (h2 = dVar2.f6374d) != null && h2.f10532b == h5.f10532b && h2.f10533c == h5.f10533c) {
            return;
        }
        b(i5, new H(j5, h5.f10531a));
        this.f6382d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(i0.C0477a r10) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.e(i0.a):void");
    }
}
