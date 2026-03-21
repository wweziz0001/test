package V1;

import M3.q;

/* JADX INFO: loaded from: classes.dex */
public final class g extends G3.f implements q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Y3.h f2358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object[] f2359r;

    @Override // G3.b
    public final Object l(Object obj) {
        c cVar;
        c cVar2;
        F3.a aVar = F3.a.f861l;
        int i = this.f2357p;
        if (i == 0) {
            i4.a.Y(obj);
            Y3.h hVar = this.f2358q;
            c[] cVarArr = (c[]) this.f2359r;
            int length = cVarArr.length;
            int i5 = 0;
            while (true) {
                cVar = a.f2350a;
                if (i5 >= length) {
                    cVar2 = null;
                    break;
                }
                cVar2 = cVarArr[i5];
                if (!N3.h.a(cVar2, cVar)) {
                    break;
                }
                i5++;
            }
            if (cVar2 != null) {
                cVar = cVar2;
            }
            this.f2357p = 1;
            if (hVar.k(cVar, this) == aVar) {
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
