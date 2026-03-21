package io.flutter.embedding.android;

/* JADX INFO: loaded from: classes.dex */
public final class T implements io.flutter.embedding.engine.renderer.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f6549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f6550b;

    public T(V v4, Runnable runnable) {
        this.f6550b = v4;
        this.f6549a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void onFlutterUiDisplayed() {
        this.f6549a.run();
        io.flutter.embedding.engine.renderer.l lVar = this.f6550b.f6554m;
        if (lVar != null) {
            lVar.g(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void onFlutterUiNoLongerDisplayed() {
    }
}
