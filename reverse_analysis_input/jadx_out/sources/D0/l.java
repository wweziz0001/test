package D0;

import a0.e0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f458m;

    public /* synthetic */ l(m mVar, B b4, int i) {
        this.f457l = i;
        this.f458m = b4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f457l) {
            case 0:
                this.f458m.getClass();
                break;
            case 1:
                this.f458m.f();
                break;
            default:
                this.f458m.h();
                break;
        }
    }

    public /* synthetic */ l(m mVar, B b4, e0 e0Var) {
        this.f457l = 0;
        this.f458m = b4;
    }
}
