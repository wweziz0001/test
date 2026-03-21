package c4;

import V3.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends I {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f5093n;

    public g(int i, int i5, long j5, String str) {
        this.f5093n = new b(i, i5, j5, str);
    }

    @Override // V3.AbstractC0141s
    public final void n(E3.i iVar, Runnable runnable) {
        b.c(this.f5093n, runnable, false, 6);
    }

    @Override // V3.AbstractC0141s
    public final void p(E3.i iVar, Runnable runnable) {
        b.c(this.f5093n, runnable, true, 2);
    }
}
