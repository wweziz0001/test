package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.ViewGroup;
import b3.AbstractC0307a;

/* JADX INFO: renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0241h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.D f4383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f4385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0242i f4386e;

    public C0241h(ViewGroup viewGroup, io.flutter.embedding.android.D d5, boolean z4, Y y, C0242i c0242i) {
        this.f4382a = viewGroup;
        this.f4383b = d5;
        this.f4384c = z4;
        this.f4385d = y;
        this.f4386e = c0242i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        N3.h.e(animator, "anim");
        ViewGroup viewGroup = this.f4382a;
        io.flutter.embedding.android.D d5 = this.f4383b;
        viewGroup.endViewTransition(d5);
        boolean z4 = this.f4384c;
        Y y = this.f4385d;
        if (z4) {
            int i = y.f4327a;
            N3.h.d(d5, "viewToAnimate");
            AbstractC0307a.a(i, d5, viewGroup);
        }
        C0242i c0242i = this.f4386e;
        ((Y) c0242i.f4387c.f1479a).c(c0242i);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + y + " has ended.");
        }
    }
}
