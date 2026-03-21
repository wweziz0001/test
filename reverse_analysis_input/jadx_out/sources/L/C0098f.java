package L;

/* JADX INFO: renamed from: L.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0098f extends G3.f implements M3.l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1384p;

    @Override // M3.l
    public final Object c(Object obj) {
        C0098f c0098f = new C0098f(1, (E3.d) obj);
        B3.g gVar = B3.g.f275a;
        c0098f.l(gVar);
        return gVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        int i = this.f1384p;
        if (i == 0) {
            i4.a.Y(obj);
            this.f1384p = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i4.a.Y(obj);
        return B3.g.f275a;
    }
}
