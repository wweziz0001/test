package x0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f10569m;

    public /* synthetic */ T(Y y, int i) {
        this.f10568l = i;
        this.f10569m = y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10568l) {
            case 0:
                this.f10569m.z();
                break;
            case 1:
                Y y = this.f10569m;
                if (!y.f10614Z) {
                    InterfaceC0959E interfaceC0959E = y.f10592C;
                    interfaceC0959E.getClass();
                    interfaceC0959E.d(y);
                }
                break;
            default:
                this.f10569m.f10608T = true;
                break;
        }
    }
}
