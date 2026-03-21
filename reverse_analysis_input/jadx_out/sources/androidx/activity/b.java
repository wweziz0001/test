package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3739d;

    public b(BackEvent backEvent) {
        N3.h.e(backEvent, "backEvent");
        a aVar = a.f3735a;
        float fD = aVar.d(backEvent);
        float fE = aVar.e(backEvent);
        float fB = aVar.b(backEvent);
        int iC = aVar.c(backEvent);
        this.f3736a = fD;
        this.f3737b = fE;
        this.f3738c = fB;
        this.f3739d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f3736a + ", touchY=" + this.f3737b + ", progress=" + this.f3738c + ", swipeEdge=" + this.f3739d + '}';
    }
}
