package j0;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Exception f7344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7345b = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7346c = -9223372036854775807L;

    public final void a(Exception exc) throws Exception {
        boolean z4;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f7344a == null) {
            this.f7344a = exc;
        }
        if (this.f7345b == -9223372036854775807L) {
            synchronized (v.f7349j0) {
                z4 = v.f7351l0 > 0;
            }
            if (!z4) {
                this.f7345b = 200 + jElapsedRealtime;
            }
        }
        long j5 = this.f7345b;
        if (j5 == -9223372036854775807L || jElapsedRealtime < j5) {
            this.f7346c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f7344a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f7344a;
        this.f7344a = null;
        this.f7345b = -9223372036854775807L;
        this.f7346c = -9223372036854775807L;
        throw exc3;
    }
}
