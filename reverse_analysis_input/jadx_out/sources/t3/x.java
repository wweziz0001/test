package t3;

import L.InterfaceC0100h;
import V3.InterfaceC0143u;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class x extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public N3.p f10128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f10131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N3.p f10132t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, J j5, N3.p pVar, E3.d dVar) {
        super(2, dVar);
        this.f10130r = str;
        this.f10131s = j5;
        this.f10132t = pVar;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new x(this.f10130r, this.f10131s, this.f10132t, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((x) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        N3.p pVar;
        F3.a aVar = F3.a.f861l;
        int i = this.f10129q;
        if (i == 0) {
            i4.a.Y(obj);
            P.d dVar = new P.d(this.f10130r);
            Context context = this.f10131s.f10044l;
            if (context == null) {
                N3.h.g("context");
                throw null;
            }
            C0883n c0883n = new C0883n(((InterfaceC0100h) K.a(context).f190l).getData(), dVar, 2);
            N3.p pVar2 = this.f10132t;
            this.f10128p = pVar2;
            this.f10129q = 1;
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
            pVar = this.f10128p;
            i4.a.Y(obj);
        }
        pVar.f1626l = obj;
        return B3.g.f275a;
    }
}
