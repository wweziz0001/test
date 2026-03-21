package x0;

import a0.AbstractC0169U;
import a0.C0167S;
import a0.C0168T;
import a0.C0176b;
import d0.AbstractC0370w;

/* JADX INFO: renamed from: x0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0964e extends AbstractC0982x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10674f;

    public C0964e(AbstractC0169U abstractC0169U, long j5, long j6) throws C0965f {
        super(abstractC0169U);
        boolean z4 = false;
        if (abstractC0169U.h() != 1) {
            throw new C0965f(0);
        }
        C0168T c0168tM = abstractC0169U.m(0, new C0168T(), 0L);
        long jMax = Math.max(0L, j5);
        if (!c0168tM.f3254k && jMax != 0 && !c0168tM.f3252h) {
            throw new C0965f(1);
        }
        long jMax2 = j6 == Long.MIN_VALUE ? c0168tM.f3256m : Math.max(0L, j6);
        long j7 = c0168tM.f3256m;
        if (j7 != -9223372036854775807L) {
            jMax2 = jMax2 > j7 ? j7 : jMax2;
            if (jMax > jMax2) {
                throw new C0965f(2, jMax, jMax2);
            }
        }
        this.f10671c = jMax;
        this.f10672d = jMax2;
        this.f10673e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (c0168tM.i && (jMax2 == -9223372036854775807L || (j7 != -9223372036854775807L && jMax2 == j7))) {
            z4 = true;
        }
        this.f10674f = z4;
    }

    @Override // x0.AbstractC0982x, a0.AbstractC0169U
    public final C0167S f(int i, C0167S c0167s, boolean z4) {
        this.f10811b.f(0, c0167s, z4);
        long j5 = c0167s.f3240e - this.f10671c;
        long j6 = this.f10673e;
        c0167s.h(c0167s.f3236a, c0167s.f3237b, 0, j6 == -9223372036854775807L ? -9223372036854775807L : j6 - j5, j5, C0176b.f3316c, false);
        return c0167s;
    }

    @Override // x0.AbstractC0982x, a0.AbstractC0169U
    public final C0168T m(int i, C0168T c0168t, long j5) {
        this.f10811b.m(0, c0168t, 0L);
        long j6 = c0168t.f3259p;
        long j7 = this.f10671c;
        c0168t.f3259p = j6 + j7;
        c0168t.f3256m = this.f10673e;
        c0168t.i = this.f10674f;
        long j8 = c0168t.f3255l;
        if (j8 != -9223372036854775807L) {
            long jMax = Math.max(j8, j7);
            c0168t.f3255l = jMax;
            long j9 = this.f10672d;
            if (j9 != -9223372036854775807L) {
                jMax = Math.min(jMax, j9);
            }
            c0168t.f3255l = jMax - j7;
        }
        long jZ = AbstractC0370w.Z(j7);
        long j10 = c0168t.f3249e;
        if (j10 != -9223372036854775807L) {
            c0168t.f3249e = j10 + jZ;
        }
        long j11 = c0168t.f3250f;
        if (j11 != -9223372036854775807L) {
            c0168t.f3250f = j11 + jZ;
        }
        return c0168t;
    }
}
