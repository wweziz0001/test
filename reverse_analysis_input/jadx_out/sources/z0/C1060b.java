package z0;

import c1.C0318a;
import d0.AbstractC0360m;
import java.util.ArrayList;
import m2.C0634A;
import m2.C0639F;
import m2.C0658q;
import m2.I;
import m2.Z;
import m2.b0;
import m2.i0;
import y3.C1013H;

/* JADX INFO: renamed from: z0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1060b implements InterfaceC1059a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0634A f11119b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11120a = new ArrayList();

    static {
        Z z4 = Z.f8576l;
        C1013H c1013h = new C1013H(19);
        z4.getClass();
        C0658q c0658q = new C0658q(c1013h, z4);
        i0 i0Var = i0.f8623l;
        C1013H c1013h2 = new C1013H(20);
        i0Var.getClass();
        f11119b = new C0634A(c0658q, new C0658q(c1013h2, i0Var));
    }

    @Override // z0.InterfaceC1059a
    public final I a(long j5) {
        ArrayList arrayList = this.f11120a;
        if (!arrayList.isEmpty()) {
            if (j5 >= ((C0318a) arrayList.get(0)).f5029b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    C0318a c0318a = (C0318a) arrayList.get(i);
                    if (j5 >= c0318a.f5029b && j5 < c0318a.f5031d) {
                        arrayList2.add(c0318a);
                    }
                    if (j5 < c0318a.f5029b) {
                        break;
                    }
                }
                b0 b0VarX = I.x(f11119b, arrayList2);
                C0639F c0639fN = I.n();
                for (int i5 = 0; i5 < b0VarX.size(); i5++) {
                    c0639fN.d(((C0318a) b0VarX.get(i5)).f5028a);
                }
                return c0639fN.g();
            }
        }
        return I.s();
    }

    @Override // z0.InterfaceC1059a
    public final long b(long j5) {
        ArrayList arrayList = this.f11120a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j5 < ((C0318a) arrayList.get(0)).f5029b) {
            return -9223372036854775807L;
        }
        long jMax = ((C0318a) arrayList.get(0)).f5029b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j6 = ((C0318a) arrayList.get(i)).f5029b;
            long j7 = ((C0318a) arrayList.get(i)).f5031d;
            if (j7 > j5) {
                if (j6 > j5) {
                    break;
                }
                jMax = Math.max(jMax, j6);
            } else {
                jMax = Math.max(jMax, j7);
            }
        }
        return jMax;
    }

    @Override // z0.InterfaceC1059a
    public final long c(long j5) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f11120a;
            if (i >= arrayList.size()) {
                break;
            }
            long j6 = ((C0318a) arrayList.get(i)).f5029b;
            long j7 = ((C0318a) arrayList.get(i)).f5031d;
            if (j5 < j6) {
                jMin = jMin == -9223372036854775807L ? j6 : Math.min(jMin, j6);
            } else {
                if (j5 < j7) {
                    jMin = jMin == -9223372036854775807L ? j7 : Math.min(jMin, j7);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // z0.InterfaceC1059a
    public final void clear() {
        this.f11120a.clear();
    }

    @Override // z0.InterfaceC1059a
    public final boolean d(C0318a c0318a, long j5) {
        long j6 = c0318a.f5029b;
        AbstractC0360m.c(j6 != -9223372036854775807L);
        AbstractC0360m.c(c0318a.f5030c != -9223372036854775807L);
        boolean z4 = j6 <= j5 && j5 < c0318a.f5031d;
        ArrayList arrayList = this.f11120a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j6 >= ((C0318a) arrayList.get(size)).f5029b) {
                arrayList.add(size + 1, c0318a);
                return z4;
            }
        }
        arrayList.add(0, c0318a);
        return z4;
    }

    @Override // z0.InterfaceC1059a
    public final void e(long j5) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11120a;
            if (i >= arrayList.size()) {
                return;
            }
            long j6 = ((C0318a) arrayList.get(i)).f5029b;
            if (j5 > j6 && j5 > ((C0318a) arrayList.get(i)).f5031d) {
                arrayList.remove(i);
                i--;
            } else if (j5 < j6) {
                return;
            }
            i++;
        }
    }
}
