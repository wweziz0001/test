package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3735a = new a();

    public final BackEvent a(float f2, float f5, float f6, int i) {
        return new BackEvent(f2, f5, f6, i);
    }

    public final float b(BackEvent backEvent) {
        N3.h.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        N3.h.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        N3.h.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        N3.h.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
