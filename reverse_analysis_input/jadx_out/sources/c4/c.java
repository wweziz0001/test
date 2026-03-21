package c4;

import V3.AbstractC0141s;
import V3.I;
import a4.w;
import b3.AbstractC0307a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c extends I implements Executor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f5089n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AbstractC0141s f5090o;

    static {
        l lVar = l.f5106n;
        int i = w.f3627a;
        if (64 >= i) {
            i = 64;
        }
        int iK = a4.a.k("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        lVar.getClass();
        if (iK < 1) {
            throw new IllegalArgumentException(AbstractC0307a.i("Expected positive parallelism level, but got ", iK).toString());
        }
        AbstractC0141s iVar = lVar;
        if (iK < k.f5101d) {
            if (iK < 1) {
                throw new IllegalArgumentException(AbstractC0307a.i("Expected positive parallelism level, but got ", iK).toString());
            }
            iVar = new a4.i(lVar, iK);
        }
        f5090o = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        n(E3.j.f675l, runnable);
    }

    @Override // V3.AbstractC0141s
    public final void n(E3.i iVar, Runnable runnable) {
        f5090o.n(iVar, runnable);
    }

    @Override // V3.AbstractC0141s
    public final void p(E3.i iVar, Runnable runnable) {
        f5090o.p(iVar, runnable);
    }

    @Override // V3.AbstractC0141s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
