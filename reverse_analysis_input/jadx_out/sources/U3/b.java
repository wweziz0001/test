package U3;

import b3.AbstractC0307a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, O3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2288l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public R3.c f2291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c f2293q;

    public b(c cVar) {
        this.f2293q = cVar;
        int i = cVar.f2295b;
        int length = cVar.f2294a.length();
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0307a.h(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        this.f2289m = i;
        this.f2290n = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            int r0 = r8.f2290n
            r1 = 0
            if (r0 >= 0) goto Lc
            r8.f2288l = r1
            r0 = 0
            r8.f2291o = r0
            goto L81
        Lc:
            U3.c r2 = r8.f2293q
            int r3 = r2.f2296c
            r4 = 1
            java.lang.String r5 = r2.f2294a
            r6 = -1
            if (r3 <= 0) goto L1d
            int r7 = r8.f2292p
            int r7 = r7 + r4
            r8.f2292p = r7
            if (r7 >= r3) goto L23
        L1d:
            int r3 = r5.length()
            if (r0 <= r3) goto L33
        L23:
            R3.c r0 = new R3.c
            int r1 = r8.f2289m
            int r2 = U3.l.e0(r5)
            r0.<init>(r1, r2, r4)
            r8.f2291o = r0
            r8.f2290n = r6
            goto L7f
        L33:
            U3.k r0 = r2.f2297d
            int r2 = r8.f2290n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.i(r5, r2)
            B3.b r0 = (B3.b) r0
            if (r0 != 0) goto L53
            R3.c r0 = new R3.c
            int r1 = r8.f2289m
            int r2 = U3.l.e0(r5)
            r0.<init>(r1, r2, r4)
            r8.f2291o = r0
            r8.f2290n = r6
            goto L7f
        L53:
            java.lang.Object r2 = r0.f268l
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f269m
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.f2289m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > r5) goto L6c
            R3.c r3 = R3.c.f1962o
            goto L74
        L6c:
            R3.c r5 = new R3.c
            int r6 = r2 + (-1)
            r5.<init>(r3, r6, r4)
            r3 = r5
        L74:
            r8.f2291o = r3
            int r2 = r2 + r0
            r8.f2289m = r2
            if (r0 != 0) goto L7c
            r1 = r4
        L7c:
            int r2 = r2 + r1
            r8.f2290n = r2
        L7f:
            r8.f2288l = r4
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2288l == -1) {
            a();
        }
        return this.f2288l == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2288l == -1) {
            a();
        }
        if (this.f2288l == 0) {
            throw new NoSuchElementException();
        }
        R3.c cVar = this.f2291o;
        N3.h.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f2291o = null;
        this.f2288l = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
