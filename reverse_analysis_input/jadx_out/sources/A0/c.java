package A0;

import a0.C0170V;
import a0.C0190p;
import android.os.SystemClock;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0365r;
import d0.InterfaceC0348a;
import java.util.ArrayList;
import java.util.List;
import m2.C0639F;
import m2.I;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B0.e f50g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f51h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f52j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f53k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f54l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f55m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f56n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final I f57o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0365r f58p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f59q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f60r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f61s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f62t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y0.l f63u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0170V c0170v, int[] iArr, B0.e eVar, long j5, long j6, long j7, I i) {
        super(c0170v, iArr);
        C0365r c0365r = InterfaceC0348a.f5270a;
        if (j7 < j5) {
            AbstractC0360m.y("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j7 = j5;
        }
        this.f50g = eVar;
        this.f51h = j5 * 1000;
        this.i = j6 * 1000;
        this.f52j = j7 * 1000;
        this.f53k = 1279;
        this.f54l = 719;
        this.f55m = 0.7f;
        this.f56n = 0.75f;
        this.f57o = I.p(i);
        this.f58p = c0365r;
        this.f59q = 1.0f;
        this.f61s = 0;
        this.f62t = -9223372036854775807L;
    }

    public static void u(ArrayList arrayList, long[] jArr) {
        long j5 = 0;
        for (long j6 : jArr) {
            j5 += j6;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C0639F c0639f = (C0639F) arrayList.get(i);
            if (c0639f != null) {
                c0639f.a(new C0000a(j5, jArr[i]));
            }
        }
    }

    public static long w(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        y0.l lVar = (y0.l) m2.r.l(list);
        long j5 = lVar.f10860r;
        if (j5 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j6 = lVar.f10861s;
        if (j6 != -9223372036854775807L) {
            return j6 - j5;
        }
        return -9223372036854775807L;
    }

    @Override // A0.d, A0.w
    public final void disable() {
        this.f63u = null;
    }

    @Override // A0.w
    public final int e() {
        return this.f61s;
    }

    @Override // A0.w
    public final int f() {
        return this.f60r;
    }

    @Override // A0.d, A0.w
    public final void h() {
        this.f62t = -9223372036854775807L;
        this.f63u = null;
    }

    @Override // A0.d, A0.w
    public final void j(float f2) {
        this.f59q = f2;
    }

    @Override // A0.w
    public final Object l() {
        return null;
    }

    @Override // A0.d, A0.w
    public final int n(long j5, List list) {
        int i;
        int i5;
        this.f58p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j6 = this.f62t;
        if (j6 != -9223372036854775807L && jElapsedRealtime - j6 < 1000 && (list.isEmpty() || ((y0.l) m2.r.l(list)).equals(this.f63u))) {
            return list.size();
        }
        this.f62t = jElapsedRealtime;
        this.f63u = list.isEmpty() ? null : (y0.l) m2.r.l(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jB = AbstractC0370w.B(((y0.l) list.get(size - 1)).f10860r - j5, this.f59q);
        long j7 = this.f52j;
        if (jB < j7) {
            return size;
        }
        w(list);
        C0190p c0190p = this.f67d[v(jElapsedRealtime)];
        for (int i6 = 0; i6 < size; i6++) {
            y0.l lVar = (y0.l) list.get(i6);
            C0190p c0190p2 = lVar.f10857o;
            if (AbstractC0370w.B(lVar.f10860r - j5, this.f59q) >= j7 && c0190p2.f3420j < c0190p.f3420j && (i = c0190p2.f3432v) != -1 && i <= this.f54l && (i5 = c0190p2.f3431u) != -1 && i5 <= this.f53k && i < c0190p.f3432v) {
                return i6;
            }
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // A0.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(long r14, long r16, long r18, java.util.List r20, y0.m[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            d0.r r2 = r0.f58p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f60r
            int r5 = r1.length
            if (r4 >= r5) goto L27
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L27
            int r4 = r0.f60r
            r1 = r1[r4]
            long r4 = r1.a()
            long r6 = r1.g()
        L25:
            long r4 = r4 - r6
            goto L43
        L27:
            int r4 = r1.length
            r5 = 0
        L29:
            if (r5 >= r4) goto L3f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3c
            long r4 = r6.a()
            long r6 = r6.g()
            goto L25
        L3c:
            int r5 = r5 + 1
            goto L29
        L3f:
            long r4 = w(r20)
        L43:
            int r1 = r0.f61s
            if (r1 != 0) goto L51
            r1 = 1
            r0.f61s = r1
            int r1 = r13.v(r2)
            r0.f60r = r1
            return
        L51:
            int r6 = r0.f60r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5c
            r7 = r8
            goto L68
        L5c:
            java.lang.Object r7 = m2.r.l(r20)
            y0.l r7 = (y0.l) r7
            a0.p r7 = r7.f10857o
            int r7 = r13.p(r7)
        L68:
            if (r7 == r8) goto L73
            java.lang.Object r1 = m2.r.l(r20)
            y0.l r1 = (y0.l) r1
            int r1 = r1.f10858p
            r6 = r7
        L73:
            int r7 = r13.v(r2)
            if (r7 == r6) goto Lb7
            boolean r2 = r13.o(r2, r6)
            if (r2 != 0) goto Lb7
            a0.p[] r2 = r0.f67d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.f51h
            if (r10 != 0) goto L91
            goto La3
        L91:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L98
            long r4 = r18 - r4
            goto L9a
        L98:
            r4 = r18
        L9a:
            float r4 = (float) r4
            float r5 = r0.f56n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La3:
            int r2 = r2.f3420j
            int r3 = r3.f3420j
            if (r2 <= r3) goto Lae
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lae
            goto Lb6
        Lae:
            if (r2 >= r3) goto Lb7
            long r2 = r0.i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb7
        Lb6:
            r7 = r6
        Lb7:
            if (r7 != r6) goto Lba
            goto Lbb
        Lba:
            r1 = 3
        Lbb:
            r0.f61s = r1
            r0.f60r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.c.s(long, long, long, java.util.List, y0.m[]):void");
    }

    public final int v(long j5) {
        long j6;
        B0.i iVar = (B0.i) this.f50g;
        synchronized (iVar) {
            j6 = iVar.f219k;
        }
        long j7 = (long) (j6 * this.f55m);
        this.f50g.getClass();
        long j8 = (long) (j7 / this.f59q);
        if (!this.f57o.isEmpty()) {
            int i = 1;
            while (i < this.f57o.size() - 1 && ((C0000a) this.f57o.get(i)).f45a < j8) {
                i++;
            }
            C0000a c0000a = (C0000a) this.f57o.get(i - 1);
            C0000a c0000a2 = (C0000a) this.f57o.get(i);
            long j9 = c0000a.f45a;
            long j10 = c0000a.f46b;
            j8 = j10 + ((long) (((j8 - j9) / (c0000a2.f45a - j9)) * (c0000a2.f46b - j10)));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f65b; i6++) {
            if (j5 == Long.MIN_VALUE || !o(j5, i6)) {
                if (g(i6).f3420j <= j8) {
                    return i6;
                }
                i5 = i6;
            }
        }
        return i5;
    }
}
