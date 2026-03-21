package a4;

/* JADX INFO: loaded from: classes.dex */
public final class g extends RuntimeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient E3.i f3595l;

    public g(E3.i iVar) {
        this.f3595l = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3595l.toString();
    }
}
