package D0;

import java.util.concurrent.Executor;
import n.C0681a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Executor {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f449l;

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f449l) {
            case 0:
                break;
            case 1:
                C0681a.X().f8743a.f8746b.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
