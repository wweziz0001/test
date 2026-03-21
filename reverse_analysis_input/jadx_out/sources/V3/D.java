package V3;

/* JADX INFO: loaded from: classes.dex */
public final class D implements c0, M3.l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C f2374l;

    public D(C c5) {
        this.f2374l = c5;
    }

    public final void a(Throwable th) {
        this.f2374l.b();
    }

    @Override // M3.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        a((Throwable) obj);
        return B3.g.f275a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f2374l + ']';
    }
}
