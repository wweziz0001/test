package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0280w f4510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final EnumC0272n f4511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4512n;

    public S(C0280w c0280w, EnumC0272n enumC0272n) {
        N3.h.e(c0280w, "registry");
        N3.h.e(enumC0272n, "event");
        this.f4510l = c0280w;
        this.f4511m = enumC0272n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4512n) {
            return;
        }
        this.f4510l.e(this.f4511m);
        this.f4512n = true;
    }
}
