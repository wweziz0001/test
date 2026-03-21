package x0;

import d0.AbstractC0360m;
import java.util.List;
import m2.C0639F;

/* JADX INFO: renamed from: x0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0972m implements h0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m2.b0 f10737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10738m;

    public C0972m(List list, List list2) {
        C0639F c0639fN = m2.I.n();
        AbstractC0360m.c(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            c0639fN.a(new C0971l((h0) list.get(i), (List) list2.get(i)));
        }
        this.f10737l = c0639fN.g();
        this.f10738m = -9223372036854775807L;
    }

    @Override // x0.h0
    public final boolean c() {
        int i = 0;
        while (true) {
            m2.b0 b0Var = this.f10737l;
            if (i >= b0Var.size()) {
                return false;
            }
            if (((C0971l) b0Var.get(i)).c()) {
                return true;
            }
            i++;
        }
    }

    @Override // x0.h0
    public final long h() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            m2.b0 b0Var = this.f10737l;
            if (i >= b0Var.size()) {
                break;
            }
            C0971l c0971l = (C0971l) b0Var.get(i);
            long jH = c0971l.h();
            if ((c0971l.a().contains(1) || c0971l.a().contains(2) || c0971l.a().contains(4)) && jH != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jH);
            }
            if (jH != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jH);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f10738m = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j5 = this.f10738m;
        return j5 != -9223372036854775807L ? j5 : jMin2;
    }

    @Override // x0.h0
    public final long r() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            m2.b0 b0Var = this.f10737l;
            if (i >= b0Var.size()) {
                break;
            }
            long jR = ((C0971l) b0Var.get(i)).r();
            if (jR != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jR);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // x0.h0
    public final void u(long j5) {
        int i = 0;
        while (true) {
            m2.b0 b0Var = this.f10737l;
            if (i >= b0Var.size()) {
                return;
            }
            ((C0971l) b0Var.get(i)).u(j5);
            i++;
        }
    }

    @Override // x0.h0
    public final boolean v(h0.T t4) {
        boolean zV;
        boolean z4 = false;
        do {
            long jR = r();
            if (jR == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zV = false;
            while (true) {
                m2.b0 b0Var = this.f10737l;
                if (i >= b0Var.size()) {
                    break;
                }
                long jR2 = ((C0971l) b0Var.get(i)).r();
                boolean z5 = jR2 != Long.MIN_VALUE && jR2 <= t4.f6044a;
                if (jR2 == jR || z5) {
                    zV |= ((C0971l) b0Var.get(i)).v(t4);
                }
                i++;
            }
            z4 |= zV;
        } while (zV);
        return z4;
    }
}
