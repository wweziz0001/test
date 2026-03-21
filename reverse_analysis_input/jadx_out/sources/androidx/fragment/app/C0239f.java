package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0239f extends X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0240g f4378c;

    public C0239f(C0240g c0240g) {
        this.f4378c = c0240g;
    }

    @Override // androidx.fragment.app.X
    public final void a(ViewGroup viewGroup) {
        N3.h.e(viewGroup, "container");
        Y y = (Y) this.f4378c.f1479a;
        io.flutter.embedding.android.D d5 = y.f4329c.f4425Q;
        d5.clearAnimation();
        viewGroup.endViewTransition(d5);
        y.c(this);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + y + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.X
    public final void b(ViewGroup viewGroup) {
        N3.h.e(viewGroup, "container");
        C0240g c0240g = this.f4378c;
        boolean zJ = c0240g.j();
        Y y = (Y) c0240g.f1479a;
        if (zJ) {
            y.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        io.flutter.embedding.android.D d5 = y.f4329c.f4425Q;
        N3.h.d(context, "context");
        Z1.e eVarP = c0240g.p(context);
        if (eVarP == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) eVarP.f3001m;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (y.f4327a != 1) {
            d5.startAnimation(animation);
            y.c(this);
            return;
        }
        viewGroup.startViewTransition(d5);
        RunnableC0256x runnableC0256x = new RunnableC0256x(animation, viewGroup, d5);
        runnableC0256x.setAnimationListener(new AnimationAnimationListenerC0238e(y, viewGroup, d5, this));
        d5.startAnimation(runnableC0256x);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + y + " has started.");
        }
    }
}
