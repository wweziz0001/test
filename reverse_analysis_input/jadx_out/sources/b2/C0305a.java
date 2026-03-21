package b2;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: b2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0305a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0305a f4878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0305a f4879d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellationException f4881b;

    static {
        if (i.f4899d) {
            f4879d = null;
            f4878c = null;
        } else {
            f4879d = new C0305a(false, null);
            f4878c = new C0305a(true, null);
        }
    }

    public C0305a(boolean z4, CancellationException cancellationException) {
        this.f4880a = z4;
        this.f4881b = cancellationException;
    }
}
