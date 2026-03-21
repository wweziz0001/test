package C0;

import B0.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f279m;

    public a(ExecutorService executorService, l lVar) {
        this.f278l = executorService;
        this.f279m = lVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f278l.execute(runnable);
    }
}
