package android.support.v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f3714a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Looper looper) {
        super(looper);
        this.f3714a = pVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        q qVar;
        p pVar;
        n nVar;
        if (message.what == 1) {
            synchronized (this.f3714a.mLock) {
                qVar = this.f3714a.mSessionImpl.get();
                pVar = this.f3714a;
                nVar = pVar.mCallbackHandler;
            }
            if (qVar == null || pVar != qVar.a() || nVar == null) {
                return;
            }
            qVar.d((androidx.media.B) message.obj);
            this.f3714a.handleMediaPlayPauseIfPendingOnHandler(qVar, nVar);
            qVar.d(null);
        }
    }
}
