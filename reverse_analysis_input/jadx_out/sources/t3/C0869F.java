package t3;

import V3.InterfaceC0143u;

/* JADX INFO: renamed from: t3.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0869F extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J f10030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10032s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0869F(J j5, String str, String str2, E3.d dVar) {
        super(2, dVar);
        this.f10030q = j5;
        this.f10031r = str;
        this.f10032s = str2;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new C0869F(this.f10030q, this.f10031r, this.f10032s, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0869F) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f10029p;
        if (i == 0) {
            i4.a.Y(obj);
            this.f10029p = 1;
            if (J.d(this.f10030q, this.f10031r, this.f10032s, this) == aVar) {
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
