package r;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0746a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0746a f9378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0746a f9379c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationException f9380a;

    static {
        if (g.f9394d) {
            f9379c = null;
            f9378b = null;
        } else {
            f9379c = new C0746a(false, null);
            f9378b = new C0746a(true, null);
        }
    }

    public C0746a(boolean z4, CancellationException cancellationException) {
        this.f9380a = cancellationException;
    }
}
