package d0;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: d0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0369v implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
