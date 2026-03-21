package x0;

import a0.AbstractC0169U;
import a0.C0167S;
import a0.C0168T;
import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: renamed from: x0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0956B extends AbstractC0982x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f10520e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10522d;

    public C0956B(AbstractC0169U abstractC0169U, Object obj, Object obj2) {
        super(abstractC0169U);
        this.f10521c = obj;
        this.f10522d = obj2;
    }

    @Override // x0.AbstractC0982x, a0.AbstractC0169U
    public final int b(Object obj) {
        Object obj2;
        if (f10520e.equals(obj) && (obj2 = this.f10522d) != null) {
            obj = obj2;
        }
        return this.f10811b.b(obj);
    }

    @Override // x0.AbstractC0982x, a0.AbstractC0169U
    public final C0167S f(int i, C0167S c0167s, boolean z4) {
        this.f10811b.f(i, c0167s, z4);
        if (Objects.equals(c0167s.f3237b, this.f10522d) && z4) {
            c0167s.f3237b = f10520e;
        }
        return c0167s;
    }

    @Override // x0.AbstractC0982x, a0.AbstractC0169U
    public final Object l(int i) {
        Object objL = this.f10811b.l(i);
        int i5 = AbstractC0370w.f5326a;
        return Objects.equals(objL, this.f10522d) ? f10520e : objL;
    }

    @Override // x0.AbstractC0982x, a0.AbstractC0169U
    public final C0168T m(int i, C0168T c0168t, long j5) {
        this.f10811b.m(i, c0168t, j5);
        if (Objects.equals(c0168t.f3245a, this.f10521c)) {
            c0168t.f3245a = C0168T.f3243q;
        }
        return c0168t;
    }
}
