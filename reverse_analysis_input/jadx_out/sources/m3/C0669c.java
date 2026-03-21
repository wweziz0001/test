package m3;

import a0.C0200z;
import java.util.TreeSet;
import n3.y;
import t0.C0851h;
import t0.C0852i;

/* JADX INFO: renamed from: m3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0669c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8677d;

    public C0669c(f3.b bVar) {
        Z1.i iVar = new Z1.i(bVar, "flutter/lifecycle", y.f8949b, (C0200z) null);
        this.f8674a = 0;
        this.f8675b = 0;
        this.f8676c = true;
        this.f8677d = iVar;
    }

    public static int b(int i, int i5) {
        int iMin;
        int i6 = i - i5;
        return (Math.abs(i6) <= 1000 || (iMin = (Math.min(i, i5) - Math.max(i, i5)) + 65535) >= 1000) ? i6 : i < i5 ? iMin : -iMin;
    }

    public synchronized void a(C0852i c0852i) {
        this.f8674a = c0852i.f9900a.f9896c;
        ((TreeSet) this.f8677d).add(c0852i);
    }

    public synchronized C0851h c(long j5) {
        if (((TreeSet) this.f8677d).isEmpty()) {
            return null;
        }
        C0852i c0852i = (C0852i) ((TreeSet) this.f8677d).first();
        int i = c0852i.f9900a.f9896c;
        if (i != C0851h.a(this.f8675b) && j5 < c0852i.f9901b) {
            return null;
        }
        ((TreeSet) this.f8677d).pollFirst();
        this.f8675b = i;
        return c0852i.f9900a;
    }

    public synchronized void d() {
        ((TreeSet) this.f8677d).clear();
        this.f8676c = false;
        this.f8675b = -1;
        this.f8674a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(int r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r4.f8674a
            if (r0 != r5) goto L9
            boolean r1 = r4.f8676c
            if (r6 != r1) goto L9
            return
        L9:
            if (r5 != 0) goto L10
            if (r0 != 0) goto L10
            r4.f8676c = r6
            return
        L10:
            int r0 = O.i.b(r5)
            if (r0 == 0) goto L29
            r1 = 1
            r2 = 3
            r3 = 2
            if (r0 == r1) goto L24
            if (r0 == r3) goto L29
            if (r0 == r2) goto L29
            r1 = 4
            if (r0 == r1) goto L29
            r0 = 0
            goto L2a
        L24:
            if (r6 == 0) goto L27
            r2 = r3
        L27:
            r0 = r2
            goto L2a
        L29:
            r0 = r5
        L2a:
            r4.f8674a = r5
            r4.f8676c = r6
            int r5 = r4.f8675b
            if (r0 != r5) goto L33
            return
        L33:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "AppLifecycleState."
            r5.<init>(r6)
            r6 = 1
            if (r0 == r6) goto L57
            r6 = 2
            if (r0 == r6) goto L54
            r6 = 3
            if (r0 == r6) goto L51
            r6 = 4
            if (r0 == r6) goto L4e
            r6 = 5
            if (r0 != r6) goto L4c
            java.lang.String r6 = "PAUSED"
            goto L59
        L4c:
            r5 = 0
            throw r5
        L4e:
            java.lang.String r6 = "HIDDEN"
            goto L59
        L51:
            java.lang.String r6 = "INACTIVE"
            goto L59
        L54:
            java.lang.String r6 = "RESUMED"
            goto L59
        L57:
            java.lang.String r6 = "DETACHED"
        L59:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r6 = r4.f8677d
            Z1.i r6 = (Z1.i) r6
            r1 = 0
            r6.D(r5, r1)
            r4.f8675b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C0669c.e(int, boolean):void");
    }

    public C0669c() {
        this.f8677d = new TreeSet(new A.c(15));
        d();
    }
}
