package t3;

import L.InterfaceC0100h;
import V3.InterfaceC0143u;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class o extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public N3.p f10090p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10092r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f10093s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N3.p f10094t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, J j5, N3.p pVar, E3.d dVar) {
        super(2, dVar);
        this.f10092r = str;
        this.f10093s = j5;
        this.f10094t = pVar;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new o(this.f10092r, this.f10093s, this.f10094t, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((o) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        N3.p pVar;
        F3.a aVar = F3.a.f861l;
        int i = this.f10091q;
        if (i == 0) {
            i4.a.Y(obj);
            P.d dVar = new P.d(this.f10092r);
            Context context = this.f10093s.f10044l;
            if (context == null) {
                N3.h.g("context");
                throw null;
            }
            C0883n c0883n = new C0883n(((InterfaceC0100h) K.a(context).f190l).getData(), dVar, 0);
            N3.p pVar2 = this.f10094t;
            this.f10090p = pVar2;
            this.f10091q = 1;
            Object objC = Y3.w.c(c0883n, this);
            if (objC == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f10090p;
            i4.a.Y(obj);
        }
        pVar.f1626l = obj;
        return B3.g.f275a;
    }
}
