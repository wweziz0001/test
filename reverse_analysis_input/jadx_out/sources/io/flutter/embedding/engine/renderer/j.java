package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FlutterJNI f6645m;

    public j(long j5, FlutterJNI flutterJNI) {
        this.f6644l = j5;
        this.f6645m = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f6645m;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f6644l);
        }
    }
}
