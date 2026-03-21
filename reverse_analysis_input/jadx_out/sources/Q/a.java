package Q;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1703b;

    public /* synthetic */ a(String str, int i) {
        this.f1702a = i;
        this.f1703b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1702a) {
            case 0:
                Thread thread = new Thread(runnable, this.f1703b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f1703b);
        }
    }
}
