package V3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: V3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0137n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2432b = AtomicIntegerFieldUpdater.newUpdater(C0137n.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f2433a;

    public C0137n(Throwable th, boolean z4) {
        this.f2433a = th;
        this._handled = z4 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f2433a + ']';
    }
}
