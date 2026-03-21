package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.AbstractActivityC0255w;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Runnable f3750m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0255w f3752o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f3749l = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3751n = false;

    public l(AbstractActivityC0255w abstractActivityC0255w) {
        this.f3752o = abstractActivityC0255w;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3750m = runnable;
        View decorView = this.f3752o.getWindow().getDecorView();
        if (!this.f3751n) {
            decorView.postOnAnimation(new A3.c(this, 8));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // androidx.activity.k
    public final void f(View view) {
        if (this.f3751n) {
            return;
        }
        this.f3751n = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z4;
        Runnable runnable = this.f3750m;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f3749l) {
                this.f3751n = false;
                this.f3752o.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f3750m = null;
        n nVar = this.f3752o.mFullyDrawnReporter;
        synchronized (nVar.f3753a) {
            z4 = nVar.f3754b;
        }
        if (z4) {
            this.f3751n = false;
            this.f3752o.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3752o.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
