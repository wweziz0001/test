package t3;

import V3.InterfaceC0143u;
import android.content.Context;

/* JADX INFO: renamed from: t3.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0865B extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f10015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f10016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f10017s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0865B(String str, J j5, boolean z4, E3.d dVar) {
        super(2, dVar);
        this.f10015q = str;
        this.f10016r = j5;
        this.f10017s = z4;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new C0865B(this.f10015q, this.f10016r, this.f10017s, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0865B) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f10014p;
        if (i == 0) {
            i4.a.Y(obj);
            P.d dVar = new P.d(this.f10015q);
            Context context = this.f10016r.f10044l;
            if (context == null) {
                N3.h.g("context");
                throw null;
            }
            B0.d dVarA = K.a(context);
            C0864A c0864a = new C0864A(dVar, this.f10017s, null);
            this.f10014p = 1;
            if (dVarA.b(new P.f(c0864a, null), this) == aVar) {
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
