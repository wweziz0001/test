package N0;

import F0.D;
import F0.E;
import F0.F;
import F0.x;

/* JADX INFO: loaded from: classes.dex */
public final class d extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f1574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f1575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, E e5, E e6) {
        super(e5);
        this.f1575c = cVar;
        this.f1574b = e6;
    }

    @Override // F0.x, F0.E
    public final D g(long j5) {
        D dG = this.f1574b.g(j5);
        F f2 = dG.f687a;
        long j6 = f2.f690a;
        long j7 = this.f1575c.f1572m;
        F f5 = new F(j6, f2.f691b + j7);
        F f6 = dG.f688b;
        return new D(f5, new F(f6.f690a, f6.f691b + j7));
    }
}
