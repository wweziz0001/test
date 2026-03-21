package g0;

import p0.C0726b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Thread {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0726b f5794l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0726b c0726b) {
        super("ExoPlayer:SimpleDecoder");
        this.f5794l = c0726b;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C0726b c0726b = this.f5794l;
        c0726b.getClass();
        do {
            try {
            } catch (InterruptedException e5) {
                throw new IllegalStateException(e5);
            }
        } while (c0726b.h());
    }
}
