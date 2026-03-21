package c4;

import V3.AbstractC0144v;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Runnable f5097n;

    public j(Runnable runnable, long j5, i iVar) {
        super(j5, iVar);
        this.f5097n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5097n.run();
        } finally {
            this.f5095m.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f5097n;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0144v.e(runnable));
        sb.append(", ");
        sb.append(this.f5094l);
        sb.append(", ");
        sb.append(this.f5095m);
        sb.append(']');
        return sb.toString();
    }
}
