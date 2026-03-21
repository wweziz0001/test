package io.flutter.embedding.android;

import java.util.Iterator;

/* JADX INFO: renamed from: io.flutter.embedding.android.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0489h implements io.flutter.embedding.engine.renderer.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6569b;

    public /* synthetic */ C0489h(Object obj, int i) {
        this.f6568a = i;
        this.f6569b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void onFlutterUiDisplayed() {
        switch (this.f6568a) {
            case 0:
                C0492k c0492k = (C0492k) this.f6569b;
                c0492k.f6572a.onFlutterUiDisplayed();
                c0492k.f6579h = true;
                c0492k.i = true;
                break;
            case 1:
                D d5 = (D) this.f6569b;
                d5.f6511r = true;
                Iterator it = d5.f6510q.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.m) it.next()).onFlutterUiDisplayed();
                }
                break;
            default:
                V v4 = (V) this.f6569b;
                v4.f6553l.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.l lVar = v4.f6554m;
                if (lVar != null) {
                    lVar.g(this);
                }
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void onFlutterUiNoLongerDisplayed() {
        switch (this.f6568a) {
            case 0:
                C0492k c0492k = (C0492k) this.f6569b;
                c0492k.f6572a.onFlutterUiNoLongerDisplayed();
                c0492k.f6579h = false;
                break;
            case 1:
                D d5 = (D) this.f6569b;
                d5.f6511r = false;
                Iterator it = d5.f6510q.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.m) it.next()).onFlutterUiNoLongerDisplayed();
                }
                break;
        }
    }

    private final void a() {
    }
}
