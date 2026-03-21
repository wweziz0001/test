package A;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Thread {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f33l;

    public l(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f33l = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f33l);
        super.run();
    }
}
