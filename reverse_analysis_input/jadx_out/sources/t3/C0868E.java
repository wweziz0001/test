package t3;

import V3.InterfaceC0143u;
import android.content.Context;

/* JADX INFO: renamed from: t3.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0868E extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f10026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f10027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ double f10028s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0868E(String str, J j5, double d5, E3.d dVar) {
        super(2, dVar);
        this.f10026q = str;
        this.f10027r = j5;
        this.f10028s = d5;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new C0868E(this.f10026q, this.f10027r, this.f10028s, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0868E) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f10025p;
        if (i == 0) {
            i4.a.Y(obj);
            P.d dVar = new P.d(this.f10026q);
            Context context = this.f10027r.f10044l;
            if (context == null) {
                N3.h.g("context");
                throw null;
            }
            B0.d dVarA = K.a(context);
            C0867D c0867d = new C0867D(dVar, this.f10028s, null);
            this.f10025p = 1;
            if (dVarA.b(new P.f(c0867d, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4.a.Y(obj);
        }
        return B3.g.f275a;
    }
}
