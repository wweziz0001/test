package r1;

import c1.C0318a;
import java.util.ArrayList;
import m2.C0640G;
import m2.b0;
import z0.InterfaceC1059a;

/* JADX INFO: renamed from: r1.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0757H implements InterfaceC1059a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f9437a;

    @Override // z0.InterfaceC1059a
    public m2.I a(long j5) {
        int iF = f(j5);
        if (iF == 0) {
            C0640G c0640g = m2.I.f8549m;
            return b0.f8583p;
        }
        C0318a c0318a = (C0318a) this.f9437a.get(iF - 1);
        long j6 = c0318a.f5031d;
        if (j6 == -9223372036854775807L || j5 < j6) {
            return c0318a.f5028a;
        }
        C0640G c0640g2 = m2.I.f8549m;
        return b0.f8583p;
    }

    @Override // z0.InterfaceC1059a
    public long b(long j5) {
        ArrayList arrayList = this.f9437a;
        if (arrayList.isEmpty() || j5 < ((C0318a) arrayList.get(0)).f5029b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j6 = ((C0318a) arrayList.get(i)).f5029b;
            if (j5 == j6) {
                return j6;
            }
            if (j5 < j6) {
                C0318a c0318a = (C0318a) arrayList.get(i - 1);
                long j7 = c0318a.f5031d;
                return (j7 == -9223372036854775807L || j7 > j5) ? c0318a.f5029b : j7;
            }
        }
        C0318a c0318a2 = (C0318a) m2.r.l(arrayList);
        long j8 = c0318a2.f5031d;
        return (j8 == -9223372036854775807L || j5 < j8) ? c0318a2.f5029b : j8;
    }

    @Override // z0.InterfaceC1059a
    public long c(long j5) {
        ArrayList arrayList = this.f9437a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j5 < ((C0318a) arrayList.get(0)).f5029b) {
            return ((C0318a) arrayList.get(0)).f5029b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C0318a c0318a = (C0318a) arrayList.get(i);
            if (j5 < c0318a.f5029b) {
                long j6 = ((C0318a) arrayList.get(i - 1)).f5031d;
                long j7 = c0318a.f5029b;
                return (j6 == -9223372036854775807L || j6 <= j5 || j6 >= j7) ? j7 : j6;
            }
        }
        long j8 = ((C0318a) m2.r.l(arrayList)).f5031d;
        if (j8 == -9223372036854775807L || j5 >= j8) {
            return Long.MIN_VALUE;
        }
        return j8;
    }

    @Override // z0.InterfaceC1059a
    public void clear() {
        this.f9437a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // z0.InterfaceC1059a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(c1.C0318a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f5029b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            d0.AbstractC0360m.c(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f5031d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f9437a
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            c1.a r7 = (c1.C0318a) r7
            long r7 = r7.f5029b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            c1.a r7 = (c1.C0318a) r7
            long r7 = r7.f5029b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C0757H.d(c1.a, long):boolean");
    }

    @Override // z0.InterfaceC1059a
    public void e(long j5) {
        int iF = f(j5);
        if (iF == 0) {
            return;
        }
        ArrayList arrayList = this.f9437a;
        long j6 = ((C0318a) arrayList.get(iF - 1)).f5031d;
        if (j6 == -9223372036854775807L || j6 >= j5) {
            iF--;
        }
        arrayList.subList(0, iF).clear();
    }

    public int f(long j5) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9437a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j5 < ((C0318a) arrayList.get(i)).f5029b) {
                return i;
            }
            i++;
        }
    }
}
