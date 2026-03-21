package V3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: V3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0130g extends C0137n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2419c = AtomicIntegerFieldUpdater.newUpdater(C0130g.class, "_resumed");
    private volatile int _resumed;

    public C0130g(C0129f c0129f, Throwable th, boolean z4) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0129f + " was cancelled normally");
        }
        super(th, z4);
        this._resumed = 0;
    }
}
