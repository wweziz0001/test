package T1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f2154m;

    public /* synthetic */ f(g gVar, int i) {
        this.f2153l = i;
        this.f2154m = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2153l) {
            case 0:
                g.a(this.f2154m);
                break;
            default:
                g.b(this.f2154m);
                break;
        }
    }
}
