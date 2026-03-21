package j4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f7470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P2.c f7471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Exception f7472n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Serializable f7473o;

    public c(boolean z4, P2.c cVar, Exception exc, Serializable serializable) {
        this.f7470l = z4;
        this.f7471m = cVar;
        this.f7472n = exc;
        this.f7473o = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P2.c cVar = this.f7471m;
        if (!this.f7470l) {
            cVar.notImplemented();
            return;
        }
        Exception exc = this.f7472n;
        if (exc == null) {
            cVar.success(this.f7473o);
        } else {
            exc.printStackTrace();
            cVar.error("exception", exc.getMessage(), null);
        }
    }
}
