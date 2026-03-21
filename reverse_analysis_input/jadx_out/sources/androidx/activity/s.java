package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M3.l f3763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M3.l f3764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M3.a f3765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M3.a f3766d;

    public s(M3.l lVar, M3.l lVar2, M3.a aVar, M3.a aVar2) {
        this.f3763a = lVar;
        this.f3764b = lVar2;
        this.f3765c = aVar;
        this.f3766d = aVar2;
    }

    public final void onBackCancelled() {
        this.f3766d.d();
    }

    public final void onBackInvoked() {
        this.f3765c.d();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        N3.h.e(backEvent, "backEvent");
        this.f3764b.c(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        N3.h.e(backEvent, "backEvent");
        this.f3763a.c(new b(backEvent));
    }
}
