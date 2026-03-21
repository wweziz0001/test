package j0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Executor {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Handler f7347l;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f7347l.post(runnable);
    }
}
