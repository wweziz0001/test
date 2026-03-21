package c4;

import N3.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5069t = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");
    private volatile int indexInArray;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f5070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f5071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5072n;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5073o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5074p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5076r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f5077s;
    private volatile int workerCtl;

    public a(b bVar, int i) {
        this.f5077s = bVar;
        setDaemon(true);
        this.f5070l = new m();
        this.f5071m = new p();
        this.f5072n = 4;
        this.nextParkedWorker = b.f5081v;
        P3.d.f1700l.getClass();
        this.f5075q = P3.d.f1701m.a().nextInt();
        f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r12 = c4.m.f5109d.get(r3);
        r0 = c4.m.f5108c.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r12 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (c4.m.f5110e.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r5 = r3.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r5 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r2 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c4.h a(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.f5072n
            r1 = 1
            r2 = 0
            c4.m r3 = r11.f5070l
            c4.b r4 = r11.f5077s
            if (r0 != r1) goto Lc
            goto L86
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = c4.b.f5079t
        Le:
            c4.b r6 = r11.f5077s
            long r7 = r0.get(r6)
            r9 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r9 = r9 & r7
            r5 = 42
            long r9 = r9 >> r5
            int r5 = (int) r9
            if (r5 != 0) goto L75
            r3.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = c4.m.f5107b
            java.lang.Object r0 = r12.get(r3)
            c4.h r0 = (c4.h) r0
            if (r0 != 0) goto L2e
            goto L43
        L2e:
            c4.i r5 = r0.f5095m
            int r5 = r5.f5096a
            if (r5 != r1) goto L43
        L34:
            boolean r5 = r12.compareAndSet(r3, r0, r2)
            if (r5 == 0) goto L3c
            r2 = r0
            goto L63
        L3c:
            java.lang.Object r5 = r12.get(r3)
            if (r5 == r0) goto L34
            goto L23
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = c4.m.f5109d
            int r12 = r12.get(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = c4.m.f5108c
            int r0 = r0.get(r3)
        L4f:
            if (r12 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = c4.m.f5110e
            int r5 = r5.get(r3)
            if (r5 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            c4.h r5 = r3.c(r0, r1)
            if (r5 == 0) goto L4f
            r2 = r5
        L63:
            if (r2 != 0) goto L74
            c4.e r12 = r4.f5087q
            java.lang.Object r12 = r12.d()
            r2 = r12
            c4.h r2 = (c4.h) r2
            if (r2 != 0) goto L74
            c4.h r2 = r11.i(r1)
        L74:
            return r2
        L75:
            r9 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r9 = r7 - r9
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = c4.b.f5079t
            boolean r5 = r5.compareAndSet(r6, r7, r9)
            if (r5 == 0) goto Le
            r11.f5072n = r1
        L86:
            if (r12 == 0) goto Lba
            int r12 = r4.f5082l
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L93
            goto L94
        L93:
            r1 = 0
        L94:
            if (r1 == 0) goto L9d
            c4.h r12 = r11.e()
            if (r12 == 0) goto L9d
            goto Lc6
        L9d:
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = c4.m.f5107b
            java.lang.Object r12 = r12.getAndSet(r3, r2)
            c4.h r12 = (c4.h) r12
            if (r12 != 0) goto Lae
            c4.h r12 = r3.b()
        Lae:
            if (r12 == 0) goto Lb1
            goto Lc6
        Lb1:
            if (r1 != 0) goto Lc1
            c4.h r12 = r11.e()
            if (r12 == 0) goto Lc1
            goto Lc6
        Lba:
            c4.h r12 = r11.e()
            if (r12 == 0) goto Lc1
            goto Lc6
        Lc1:
            r12 = 3
            c4.h r12 = r11.i(r12)
        Lc6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.a(boolean):c4.h");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i5 = this.f5075q;
        int i6 = i5 ^ (i5 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f5075q = i8;
        int i9 = i - 1;
        return (i9 & i) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i;
    }

    public final h e() {
        int iD = d(2);
        b bVar = this.f5077s;
        if (iD == 0) {
            h hVar = (h) bVar.f5086p.d();
            return hVar != null ? hVar : (h) bVar.f5087q.d();
        }
        h hVar2 = (h) bVar.f5087q.d();
        return hVar2 != null ? hVar2 : (h) bVar.f5086p.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5077s.f5085o);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i) {
        int i5 = this.f5072n;
        boolean z4 = i5 == 1;
        if (z4) {
            b.f5079t.addAndGet(this.f5077s, 4398046511104L);
        }
        if (i5 != i) {
            this.f5072n = i;
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c4.h i(int r24) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.i(int):c4.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.run():void");
    }
}
