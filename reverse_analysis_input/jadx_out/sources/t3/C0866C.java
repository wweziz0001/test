package t3;

import V3.InterfaceC0143u;

/* JADX INFO: renamed from: t3.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0866C extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J f10019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10021s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0866C(J j5, String str, String str2, E3.d dVar) {
        super(2, dVar);
        this.f10019q = j5;
        this.f10020r = str;
        this.f10021s = str2;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new C0866C(this.f10019q, this.f10020r, this.f10021s, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0866C) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f10018p;
        if (i == 0) {
            i4.a.Y(obj);
            this.f10018p = 1;
            if (J.d(this.f10019q, this.f10020r, this.f10021s, this) == aVar) {
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
