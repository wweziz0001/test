package d1;

import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements c1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f5418a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f5419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f5420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f5421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5424g;

    public h() {
        for (int i = 0; i < 10; i++) {
            this.f5418a.add(new g(1));
        }
        this.f5419b = new ArrayDeque();
        for (int i5 = 0; i5 < 2; i5++) {
            ArrayDeque arrayDeque = this.f5419b;
            I2.g gVar = new I2.g(this, 5);
            c1.c cVar = new c1.c();
            cVar.f5038s = gVar;
            arrayDeque.add(cVar);
        }
        this.f5420c = new ArrayDeque();
        this.f5424g = -9223372036854775807L;
    }

    @Override // c1.e
    public final void a(long j5) {
        this.f5422e = j5;
    }

    @Override // g0.b
    public final Object c() {
        AbstractC0360m.h(this.f5421d == null);
        ArrayDeque arrayDeque = this.f5418a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f5421d = gVar;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // g0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(c1.i r7) {
        /*
            r6 = this;
            d1.g r0 = r6.f5421d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            d0.AbstractC0360m.c(r0)
            d1.g r7 = (d1.g) r7
            long r0 = r7.f5789r
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2c
            long r2 = r6.f5424g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2c
            r7.f()
            java.util.ArrayDeque r0 = r6.f5418a
            r0.add(r7)
            goto L3a
        L2c:
            long r0 = r6.f5423f
            r2 = 1
            long r2 = r2 + r0
            r6.f5423f = r2
            r7.f5417v = r0
            java.util.ArrayDeque r0 = r6.f5420c
            r0.add(r7)
        L3a:
            r7 = 0
            r6.f5421d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.h.d(c1.i):void");
    }

    @Override // g0.b
    public final void e(long j5) {
        this.f5424g = j5;
    }

    public abstract V1.h f();

    @Override // g0.b
    public void flush() {
        ArrayDeque arrayDeque;
        this.f5423f = 0L;
        this.f5422e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f5420c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f5418a;
            if (zIsEmpty) {
                break;
            }
            g gVar = (g) arrayDeque2.poll();
            int i = AbstractC0370w.f5326a;
            gVar.f();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f5421d;
        if (gVar2 != null) {
            gVar2.f();
            arrayDeque.add(gVar2);
            this.f5421d = null;
        }
    }

    public abstract void g(g gVar);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        return null;
     */
    @Override // g0.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c1.c b() {
        /*
            r7 = this;
            java.util.ArrayDeque r0 = r7.f5419b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.ArrayDeque r1 = r7.f5420c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6a
            java.lang.Object r3 = r1.peek()
            d1.g r3 = (d1.g) r3
            int r4 = d0.AbstractC0370w.f5326a
            long r3 = r3.f5789r
            long r5 = r7.f5422e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6a
            java.lang.Object r1 = r1.poll()
            d1.g r1 = (d1.g) r1
            r3 = 4
            boolean r4 = r1.e(r3)
            java.util.ArrayDeque r5 = r7.f5418a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            c1.c r0 = (c1.c) r0
            r0.b(r3)
            r1.f()
            r5.add(r1)
            return r0
        L41:
            r7.g(r1)
            boolean r3 = r7.i()
            if (r3 == 0) goto L63
            V1.h r2 = r7.f()
            java.lang.Object r0 = r0.pollFirst()
            c1.c r0 = (c1.c) r0
            long r3 = r1.f5789r
            r0.f5792n = r3
            r0.f5035p = r2
            r0.f5036q = r3
            r1.f()
            r5.add(r1)
            return r0
        L63:
            r1.f()
            r5.add(r1)
            goto La
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.h.b():c1.c");
    }

    public abstract boolean i();

    @Override // g0.b
    public void release() {
    }
}
