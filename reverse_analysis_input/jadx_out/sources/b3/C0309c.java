package b3;

import android.util.Log;
import dev.fluttercommunity.workmanager.BackgroundWorker;
import n3.InterfaceC0706p;

/* JADX INFO: renamed from: b3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0309c implements InterfaceC0706p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BackgroundWorker f4910a;

    public C0309c(BackgroundWorker backgroundWorker) {
        this.f4910a = backgroundWorker;
    }

    @Override // n3.InterfaceC0706p
    public final void error(String str, String str2, Object obj) {
        N3.h.e(str, "errorCode");
        Log.e("BackgroundWorker", "errorCode: " + str + ", errorMessage: " + str2);
        Q1.l lVar = new Q1.l();
        h3.f fVar = BackgroundWorker.f5451w;
        this.f4910a.f(lVar);
    }

    @Override // n3.InterfaceC0706p
    public final void notImplemented() {
        Q1.l lVar = new Q1.l();
        h3.f fVar = BackgroundWorker.f5451w;
        this.f4910a.f(lVar);
    }

    @Override // n3.InterfaceC0706p
    public final void success(Object obj) {
        Q1.o nVar = obj != null ? ((Boolean) obj).equals(Boolean.TRUE) : false ? new Q1.n(Q1.g.f1823c) : new Q1.m();
        h3.f fVar = BackgroundWorker.f5451w;
        this.f4910a.f(nVar);
    }
}
