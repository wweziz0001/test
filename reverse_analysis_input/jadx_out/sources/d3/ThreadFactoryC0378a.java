package d3;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: d3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0378a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5427a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder("flutter-worker-");
        int i = this.f5427a;
        this.f5427a = i + 1;
        sb.append(i);
        thread.setName(sb.toString());
        return thread;
    }
}
