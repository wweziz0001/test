package t3;

import V3.InterfaceC0143u;
import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: t3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0878i extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J f10073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f10074r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0878i(J j5, List list, E3.d dVar) {
        super(2, dVar);
        this.f10073q = j5;
        this.f10074r = list;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new C0878i(this.f10073q, this.f10074r, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0878i) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f10072p;
        if (i == 0) {
            i4.a.Y(obj);
            Context context = this.f10073q.f10044l;
            if (context == null) {
                N3.h.g("context");
                throw null;
            }
            B0.d dVarA = K.a(context);
            C0877h c0877h = new C0877h(this.f10074r, null);
            this.f10072p = 1;
            obj = dVarA.b(new P.f(c0877h, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4.a.Y(obj);
        }
        return obj;
    }
}
