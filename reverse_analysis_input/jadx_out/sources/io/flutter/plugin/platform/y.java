package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6835m;

    public /* synthetic */ y(Object obj, int i) {
        this.f6834l = i;
        this.f6835m = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6834l) {
            case 0:
                N1.i iVar = (N1.i) this.f6835m;
                ((View) iVar.f1587m).postDelayed((l) iVar.f1588n, 128L);
                break;
            default:
                z zVar = (z) this.f6835m;
                zVar.f6836l.getViewTreeObserver().removeOnDrawListener(zVar);
                break;
        }
    }
}
