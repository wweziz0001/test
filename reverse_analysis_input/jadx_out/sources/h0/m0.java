package h0;

import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0167S;
import a0.C0168T;
import a0.C0176b;
import a0.C0197w;
import x0.AbstractC0982x;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends AbstractC0982x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6235c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6236d;

    public m0(AbstractC0169U abstractC0169U, C0150A c0150a) {
        super(abstractC0169U);
        this.f6236d = c0150a;
    }

    @Override // x0.AbstractC0982x, a0.AbstractC0169U
    public C0167S f(int i, C0167S c0167s, boolean z4) {
        switch (this.f6235c) {
            case 0:
                AbstractC0169U abstractC0169U = this.f10811b;
                C0167S c0167sF = abstractC0169U.f(i, c0167s, z4);
                if (abstractC0169U.m(c0167sF.f3238c, (C0168T) this.f6236d, 0L).a()) {
                    c0167sF.h(c0167s.f3236a, c0167s.f3237b, c0167s.f3238c, c0167s.f3239d, c0167s.f3240e, C0176b.f3316c, true);
                } else {
                    c0167sF.f3241f = true;
                }
                return c0167sF;
            default:
                return super.f(i, c0167s, z4);
        }
    }

    @Override // x0.AbstractC0982x, a0.AbstractC0169U
    public C0168T m(int i, C0168T c0168t, long j5) {
        switch (this.f6235c) {
            case 1:
                super.m(i, c0168t, j5);
                C0150A c0150a = (C0150A) this.f6236d;
                c0168t.f3247c = c0150a;
                C0197w c0197w = c0150a.f3154b;
                if (c0197w != null) {
                    String str = c0197w.f3464e;
                }
                c0168t.getClass();
                return c0168t;
            default:
                return super.m(i, c0168t, j5);
        }
    }

    public m0(AbstractC0169U abstractC0169U) {
        super(abstractC0169U);
        this.f6236d = new C0168T();
    }
}
