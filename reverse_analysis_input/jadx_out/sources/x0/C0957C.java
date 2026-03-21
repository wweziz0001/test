package x0;

import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0167S;
import a0.C0168T;
import a0.C0176b;

/* JADX INFO: renamed from: x0.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0957C extends AbstractC0169U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0150A f10523b;

    public C0957C(C0150A c0150a) {
        this.f10523b = c0150a;
    }

    @Override // a0.AbstractC0169U
    public final int b(Object obj) {
        return obj == C0956B.f10520e ? 0 : -1;
    }

    @Override // a0.AbstractC0169U
    public final C0167S f(int i, C0167S c0167s, boolean z4) {
        c0167s.h(z4 ? 0 : null, z4 ? C0956B.f10520e : null, 0, -9223372036854775807L, 0L, C0176b.f3316c, true);
        return c0167s;
    }

    @Override // a0.AbstractC0169U
    public final int h() {
        return 1;
    }

    @Override // a0.AbstractC0169U
    public final Object l(int i) {
        return C0956B.f10520e;
    }

    @Override // a0.AbstractC0169U
    public final C0168T m(int i, C0168T c0168t, long j5) {
        Object obj = C0168T.f3243q;
        c0168t.b(this.f10523b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        c0168t.f3254k = true;
        return c0168t;
    }

    @Override // a0.AbstractC0169U
    public final int o() {
        return 1;
    }
}
