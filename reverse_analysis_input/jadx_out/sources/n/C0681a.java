package n;

import D0.j;

/* JADX INFO: renamed from: n.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0681a extends D1.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0681a f8741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f8742c = new j(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0684d f8743a = new C0684d();

    public static C0681a X() {
        if (f8741b != null) {
            return f8741b;
        }
        synchronized (C0681a.class) {
            try {
                if (f8741b == null) {
                    f8741b = new C0681a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8741b;
    }
}
