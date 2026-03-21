package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0242i extends X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0240g f4387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f4388d;

    public C0242i(C0240g c0240g) {
        this.f4387c = c0240g;
    }

    @Override // androidx.fragment.app.X
    public final void a(ViewGroup viewGroup) {
        N3.h.e(viewGroup, "container");
        AnimatorSet animatorSet = this.f4388d;
        Y y = (Y) this.f4387c.f1479a;
        if (animatorSet == null) {
            y.c(this);
            return;
        }
        if (!y.f4333g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0244k.f4390a.a(animatorSet);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(y);
            sb.append(" has been canceled");
            sb.append(y.f4333g ? " with seeking." : ".");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // androidx.fragment.app.X
    public final void b(ViewGroup viewGroup) {
        N3.h.e(viewGroup, "container");
        Y y = (Y) this.f4387c.f1479a;
        AnimatorSet animatorSet = this.f4388d;
        if (animatorSet == null) {
            y.c(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + y + " has started.");
        }
    }

    @Override // androidx.fragment.app.X
    public final void c(androidx.activity.b bVar, ViewGroup viewGroup) {
        N3.h.e(bVar, "backEvent");
        N3.h.e(viewGroup, "container");
        C0240g c0240g = this.f4387c;
        AnimatorSet animatorSet = this.f4388d;
        Y y = (Y) c0240g.f1479a;
        if (animatorSet == null) {
            y.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !y.f4329c.f4451x) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + y);
        }
        long jA = C0243j.f4389a.a(animatorSet);
        long j5 = (long) (bVar.f3738c * jA);
        if (j5 == 0) {
            j5 = 1;
        }
        if (j5 == jA) {
            j5 = jA - 1;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j5 + " for Animator " + animatorSet + " on operation " + y);
        }
        C0244k.f4390a.b(animatorSet, j5);
    }

    @Override // androidx.fragment.app.X
    public final void d(ViewGroup viewGroup) {
        N3.h.e(viewGroup, "container");
        C0240g c0240g = this.f4387c;
        if (c0240g.j()) {
            return;
        }
        Context context = viewGroup.getContext();
        N3.h.d(context, "context");
        Z1.e eVarP = c0240g.p(context);
        this.f4388d = eVarP != null ? (AnimatorSet) eVarP.f3002n : null;
        Y y = (Y) c0240g.f1479a;
        r rVar = y.f4329c;
        boolean z4 = y.f4327a == 3;
        io.flutter.embedding.android.D d5 = rVar.f4425Q;
        viewGroup.startViewTransition(d5);
        AnimatorSet animatorSet = this.f4388d;
        if (animatorSet != null) {
            animatorSet.addListener(new C0241h(viewGroup, d5, z4, y, this));
        }
        AnimatorSet animatorSet2 = this.f4388d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(d5);
        }
    }
}
