package t3;

import V3.InterfaceC0143u;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class H extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10036p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f10037q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f10038r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f10039s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(String str, J j5, long j6, E3.d dVar) {
        super(2, dVar);
        this.f10037q = str;
        this.f10038r = j5;
        this.f10039s = j6;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new H(this.f10037q, this.f10038r, this.f10039s, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((H) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f10036p;
        if (i == 0) {
            i4.a.Y(obj);
            P.d dVar = new P.d(this.f10037q);
            Context context = this.f10038r.f10044l;
            if (context == null) {
                N3.h.g("context");
                throw null;
            }
            B0.d dVarA = K.a(context);
            G g5 = new G(dVar, this.f10039s, null);
            this.f10036p = 1;
            if (dVarA.b(new P.f(g5, null), this) == aVar) {
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
