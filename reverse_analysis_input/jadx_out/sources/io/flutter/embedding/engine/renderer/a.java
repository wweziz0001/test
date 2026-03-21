package io.flutter.embedding.engine.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f6624a;

    public a(l lVar) {
        this.f6624a = lVar;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void onFlutterUiDisplayed() {
        this.f6624a.f6666d = true;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void onFlutterUiNoLongerDisplayed() {
        this.f6624a.f6666d = false;
    }
}
