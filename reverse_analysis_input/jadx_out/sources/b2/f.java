package b2;

import q2.InterfaceFutureC0744b;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f4894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceFutureC0744b f4895m;

    public f(k kVar, InterfaceFutureC0744b interfaceFutureC0744b) {
        this.f4894l = kVar;
        this.f4895m = interfaceFutureC0744b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4894l.f4903a != this) {
            return;
        }
        if (i.f4901f.h(this.f4894l, this, i.f(this.f4895m))) {
            i.c(this.f4894l);
        }
    }
}
