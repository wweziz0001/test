package androidx.fragment.app;

import android.animation.AnimatorSet;

/* JADX INFO: renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0244k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0244k f4390a = new C0244k();

    public final void a(AnimatorSet animatorSet) {
        N3.h.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j5) {
        N3.h.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j5);
    }
}
