package r1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: r1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0752C implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public OverScroller f9426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Interpolator f9427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9430r;

    public RunnableC0752C(RecyclerView recyclerView) {
        this.f9430r = recyclerView;
        InterpolatorC0772m interpolatorC0772m = RecyclerView.f4696v0;
        this.f9427o = interpolatorC0772m;
        this.f9428p = false;
        this.f9429q = false;
        this.f9426n = new OverScroller(recyclerView.getContext(), interpolatorC0772m);
    }

    public final void a() {
        if (this.f9428p) {
            this.f9429q = true;
            return;
        }
        RecyclerView recyclerView = this.f9430r;
        recyclerView.removeCallbacks(this);
        Field field = D.I.f300a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f9430r;
        if (recyclerView.f4745t == null) {
            recyclerView.removeCallbacks(this);
            this.f9426n.abortAnimation();
            return;
        }
        this.f9429q = false;
        this.f9428p = true;
        recyclerView.d();
        OverScroller overScroller = this.f9426n;
        recyclerView.f4745t.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i = currX - this.f9424l;
            int i5 = currY - this.f9425m;
            this.f9424l = currX;
            this.f9425m = currY;
            RecyclerView recyclerView2 = this.f9430r;
            int[] iArr = recyclerView.f4737o0;
            if (recyclerView2.f(i, i5, 1, iArr, null)) {
                i -= iArr[0];
                i5 -= iArr[1];
            }
            if (!recyclerView.f4746u.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i, i5);
            }
            recyclerView.g(null, 1);
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z4 = (i == 0 && i5 == 0) || (i != 0 && recyclerView.f4745t.b() && i == 0) || (i5 != 0 && recyclerView.f4745t.c() && i5 == 0);
            if (overScroller.isFinished() || !(z4 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                D0.e eVar = recyclerView.f4726h0;
                eVar.getClass();
                eVar.f399c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0767h runnableC0767h = recyclerView.f4725g0;
                if (runnableC0767h != null) {
                    runnableC0767h.a(recyclerView, i, i5);
                }
            }
        }
        this.f9428p = false;
        if (this.f9429q) {
            a();
        }
    }
}
