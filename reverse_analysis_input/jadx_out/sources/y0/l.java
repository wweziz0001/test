package y0;

import a0.C0190p;
import f0.C0417l;
import f0.InterfaceC0413h;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends AbstractC0997e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f10902u;

    public l(InterfaceC0413h interfaceC0413h, C0417l c0417l, C0190p c0190p, int i, Object obj, long j5, long j6, long j7) {
        super(interfaceC0413h, c0417l, 1, c0190p, i, obj, j5, j6);
        c0190p.getClass();
        this.f10902u = j7;
    }

    public long a() {
        long j5 = this.f10902u;
        if (j5 != -1) {
            return 1 + j5;
        }
        return -1L;
    }

    public abstract boolean b();
}
