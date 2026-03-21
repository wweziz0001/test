package Z3;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient Y3.h f3095l;

    public a(Y3.h hVar) {
        super("Flow was aborted, no more elements needed");
        this.f3095l = hVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
