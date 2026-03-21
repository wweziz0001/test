package androidx.fragment.app;

import D.ViewTreeObserverOnPreDrawListenerC0017q;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0256x extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewGroup f4463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final io.flutter.embedding.android.D f4464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4467p;

    public RunnableC0256x(Animation animation, ViewGroup viewGroup, io.flutter.embedding.android.D d5) {
        super(false);
        this.f4467p = true;
        this.f4463l = viewGroup;
        this.f4464m = d5;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j5, Transformation transformation) {
        this.f4467p = true;
        if (this.f4465n) {
            return !this.f4466o;
        }
        if (!super.getTransformation(j5, transformation)) {
            this.f4465n = true;
            ViewTreeObserverOnPreDrawListenerC0017q.a(this.f4463l, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f4465n;
        ViewGroup viewGroup = this.f4463l;
        if (z4 || !this.f4467p) {
            viewGroup.endViewTransition(this.f4464m);
            this.f4466o = true;
        } else {
            this.f4467p = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j5, Transformation transformation, float f2) {
        this.f4467p = true;
        if (this.f4465n) {
            return !this.f4466o;
        }
        if (!super.getTransformation(j5, transformation, f2)) {
            this.f4465n = true;
            ViewTreeObserverOnPreDrawListenerC0017q.a(this.f4463l, this);
        }
        return true;
    }
}
