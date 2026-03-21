package A;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class m implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new l(runnable, this.f34a, this.f35b);
    }
}
