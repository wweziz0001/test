package F0;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f715a;

    public synchronized boolean a() {
        if (this.f715a) {
            return false;
        }
        this.f715a = true;
        notifyAll();
        return true;
    }
}
