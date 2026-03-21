package t0;

import a0.AbstractC0169U;
import a0.C0167S;
import a0.C0168T;
import x0.AbstractC0982x;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0982x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(AbstractC0169U abstractC0169U, int i) {
        super(abstractC0169U);
        this.f9963c = i;
    }

    @Override // x0.AbstractC0982x, a0.AbstractC0169U
    public final C0167S f(int i, C0167S c0167s, boolean z4) {
        switch (this.f9963c) {
            case 0:
                super.f(i, c0167s, z4);
                c0167s.f3241f = true;
                break;
            default:
                super.f(i, c0167s, z4);
                c0167s.f3241f = true;
                break;
        }
        return c0167s;
    }

    @Override // x0.AbstractC0982x, a0.AbstractC0169U
    public final C0168T m(int i, C0168T c0168t, long j5) {
        switch (this.f9963c) {
            case 0:
                super.m(i, c0168t, j5);
                c0168t.f3254k = true;
                break;
            default:
                super.m(i, c0168t, j5);
                c0168t.f3254k = true;
                break;
        }
        return c0168t;
    }
}
