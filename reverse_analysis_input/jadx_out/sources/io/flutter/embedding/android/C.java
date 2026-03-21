package io.flutter.embedding.android;

/* JADX INFO: loaded from: classes.dex */
public final class C implements io.flutter.embedding.engine.renderer.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.l f6493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A3.c f6494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f6495c;

    public C(D d5, io.flutter.embedding.engine.renderer.l lVar, A3.c cVar) {
        this.f6495c = d5;
        this.f6493a = lVar;
        this.f6494b = cVar;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void onFlutterUiDisplayed() {
        C0503w c0503w;
        this.f6493a.g(this);
        this.f6494b.run();
        D d5 = this.f6495c;
        if ((d5.f6508o instanceof C0503w) || (c0503w = d5.f6507n) == null) {
            return;
        }
        c0503w.c();
        C0503w c0503w2 = d5.f6507n;
        if (c0503w2 != null) {
            c0503w2.f6611l.close();
            d5.removeView(d5.f6507n);
            d5.f6507n = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void onFlutterUiNoLongerDisplayed() {
    }
}
