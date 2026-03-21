package i0;

import A0.m;
import a0.AbstractC0158I;
import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0153D;
import a0.C0155F;
import a0.C0159J;
import a0.C0160K;
import a0.C0161L;
import a0.C0163N;
import a0.C0167S;
import a0.C0168T;
import a0.C0174Z;
import a0.C0177c;
import a0.InterfaceC0162M;
import a0.InterfaceC0164O;
import a0.b0;
import a0.e0;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0359l;
import d0.C0365r;
import d0.C0367t;
import d0.InterfaceC0348a;
import d0.InterfaceC0356i;
import h0.C0444C;
import h0.C0448G;
import h0.C0464o;
import h0.C0473y;
import h0.C0474z;
import java.io.IOException;
import java.util.List;
import m2.I;
import m2.g0;
import x0.C0984z;
import x0.H;
import x0.N;
import y2.n;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0162M, N, m0.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0348a f6362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0167S f6363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0168T f6364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n f6365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SparseArray f6366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0359l f6367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC0164O f6368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0367t f6369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6370t;

    public c(InterfaceC0348a interfaceC0348a) {
        interfaceC0348a.getClass();
        this.f6362l = interfaceC0348a;
        int i = AbstractC0370w.f5326a;
        Looper looperMyLooper = Looper.myLooper();
        this.f6367q = new C0359l(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, interfaceC0348a, new C0473y(23));
        C0167S c0167s = new C0167S();
        this.f6363m = c0167s;
        this.f6364n = new C0168T();
        this.f6365o = new n(c0167s);
        this.f6366p = new SparseArray();
    }

    @Override // x0.N
    public final void a(int i, H h2, C0984z c0984z, u0.g gVar) {
        l(j(i, h2), 1000, new b(20));
    }

    @Override // x0.N
    public final void b(int i, H h2, C0984z c0984z, u0.g gVar) {
        l(j(i, h2), 1002, new b(12));
    }

    @Override // x0.N
    public final void c(int i, H h2, u0.g gVar) {
        C0477a c0477aJ = j(i, h2);
        l(c0477aJ, 1004, new A0.g(c0477aJ, 3, gVar));
    }

    @Override // x0.N
    public final void d(int i, H h2, C0984z c0984z, u0.g gVar) {
        l(j(i, h2), 1001, new b(13));
    }

    @Override // x0.N
    public final void e(int i, H h2, C0984z c0984z, u0.g gVar, IOException iOException, boolean z4) {
        C0477a c0477aJ = j(i, h2);
        l(c0477aJ, 1003, new I2.g(c0477aJ, c0984z, gVar, iOException, z4));
    }

    @Override // x0.N
    public final void f(int i, H h2, u0.g gVar) {
        l(j(i, h2), 1005, new b(11));
    }

    public final C0477a g() {
        return i((H) this.f6365o.f10957d);
    }

    public final C0477a h(AbstractC0169U abstractC0169U, int i, H h2) {
        H h5 = abstractC0169U.p() ? null : h2;
        ((C0365r) this.f6362l).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = abstractC0169U.equals(((C0448G) this.f6368r).z()) && i == ((C0448G) this.f6368r).w();
        long jZ = 0;
        if (h5 == null || !h5.b()) {
            if (z4) {
                C0448G c0448g = (C0448G) this.f6368r;
                c0448g.d0();
                jZ = c0448g.t(c0448g.f5945d0);
            } else if (!abstractC0169U.p()) {
                jZ = AbstractC0370w.Z(abstractC0169U.m(i, this.f6364n, 0L).f3255l);
            }
        } else if (z4 && ((C0448G) this.f6368r).u() == h5.f10532b && ((C0448G) this.f6368r).v() == h5.f10533c) {
            jZ = ((C0448G) this.f6368r).x();
        }
        H h6 = (H) this.f6365o.f10957d;
        AbstractC0169U abstractC0169UZ = ((C0448G) this.f6368r).z();
        int iW = ((C0448G) this.f6368r).w();
        long jX = ((C0448G) this.f6368r).x();
        C0448G c0448g2 = (C0448G) this.f6368r;
        c0448g2.d0();
        return new C0477a(jElapsedRealtime, abstractC0169U, i, h5, jZ, abstractC0169UZ, iW, h6, jX, AbstractC0370w.Z(c0448g2.f5945d0.f6190r));
    }

    public final C0477a i(H h2) {
        this.f6368r.getClass();
        AbstractC0169U abstractC0169U = h2 == null ? null : (AbstractC0169U) ((g0) this.f6365o.f10956c).get(h2);
        if (h2 != null && abstractC0169U != null) {
            return h(abstractC0169U, abstractC0169U.g(h2.f10531a, this.f6363m).f3238c, h2);
        }
        int iW = ((C0448G) this.f6368r).w();
        AbstractC0169U abstractC0169UZ = ((C0448G) this.f6368r).z();
        if (iW >= abstractC0169UZ.o()) {
            abstractC0169UZ = AbstractC0169U.f3260a;
        }
        return h(abstractC0169UZ, iW, null);
    }

    public final C0477a j(int i, H h2) {
        this.f6368r.getClass();
        if (h2 != null) {
            return ((AbstractC0169U) ((g0) this.f6365o.f10956c).get(h2)) != null ? i(h2) : h(AbstractC0169U.f3260a, i, h2);
        }
        AbstractC0169U abstractC0169UZ = ((C0448G) this.f6368r).z();
        if (i >= abstractC0169UZ.o()) {
            abstractC0169UZ = AbstractC0169U.f3260a;
        }
        return h(abstractC0169UZ, i, null);
    }

    public final C0477a k() {
        return i((H) this.f6365o.f10959f);
    }

    public final void l(C0477a c0477a, int i, InterfaceC0356i interfaceC0356i) {
        this.f6366p.put(i, c0477a);
        this.f6367q.e(i, interfaceC0356i);
    }

    public final void m(InterfaceC0164O interfaceC0164O, Looper looper) {
        AbstractC0360m.h(this.f6368r == null || ((I) this.f6365o.f10955b).isEmpty());
        interfaceC0164O.getClass();
        this.f6368r = interfaceC0164O;
        this.f6369s = ((C0365r) this.f6362l).a(looper, null);
        C0359l c0359l = this.f6367q;
        this.f6367q = new C0359l(c0359l.f5298d, looper, c0359l.f5295a, new A0.g(this, 2, interfaceC0164O), c0359l.i);
    }

    @Override // a0.InterfaceC0162M
    public final void onAudioAttributesChanged(C0177c c0177c) {
        l(k(), 20, new C0473y(10));
    }

    @Override // a0.InterfaceC0162M
    public final void onAvailableCommandsChanged(C0160K c0160k) {
        l(g(), 13, new C0473y(3));
    }

    @Override // a0.InterfaceC0162M
    public final void onCues(List list) {
        l(g(), 27, new C0473y(22));
    }

    @Override // a0.InterfaceC0162M
    public final void onIsLoadingChanged(boolean z4) {
        l(g(), 3, new b(18));
    }

    @Override // a0.InterfaceC0162M
    public final void onIsPlayingChanged(boolean z4) {
        l(g(), 7, new C0473y(14));
    }

    @Override // a0.InterfaceC0162M
    public final void onMediaItemTransition(C0150A c0150a, int i) {
        l(g(), 1, new C0473y(5));
    }

    @Override // a0.InterfaceC0162M
    public final void onMediaMetadataChanged(C0153D c0153d) {
        l(g(), 14, new b(10));
    }

    @Override // a0.InterfaceC0162M, r0.InterfaceC0749b
    public final void onMetadata(C0155F c0155f) {
        l(g(), 28, new C0473y(11));
    }

    @Override // a0.InterfaceC0162M
    public final void onPlayWhenReadyChanged(boolean z4, int i) {
        l(g(), 5, new C0473y(20));
    }

    @Override // a0.InterfaceC0162M
    public final void onPlaybackParametersChanged(C0159J c0159j) {
        l(g(), 12, new C0473y(2));
    }

    @Override // a0.InterfaceC0162M
    public final void onPlaybackStateChanged(int i) {
        l(g(), 4, new C0473y(26));
    }

    @Override // a0.InterfaceC0162M
    public final void onPlaybackSuppressionReasonChanged(int i) {
        l(g(), 6, new C0473y(16));
    }

    @Override // a0.InterfaceC0162M
    public final void onPlayerError(AbstractC0158I abstractC0158I) {
        H h2;
        C0464o c0464o = (C0464o) abstractC0158I;
        C0477a c0477aG = (c0464o == null || (h2 = c0464o.f6250s) == null) ? g() : i(h2);
        l(c0477aG, 10, new I2.g(c0477aG, (Object) c0464o, 14));
    }

    @Override // a0.InterfaceC0162M
    public final void onPlayerErrorChanged(AbstractC0158I abstractC0158I) {
        H h2;
        C0464o c0464o = (C0464o) abstractC0158I;
        C0477a c0477aG = (c0464o == null || (h2 = c0464o.f6250s) == null) ? g() : i(h2);
        l(c0477aG, 10, new C0473y(c0477aG, c0464o));
    }

    @Override // a0.InterfaceC0162M
    public final void onPlayerStateChanged(boolean z4, int i) {
        l(g(), -1, new C0473y(9));
    }

    @Override // a0.InterfaceC0162M
    public final void onPositionDiscontinuity(int i) {
    }

    @Override // a0.InterfaceC0162M
    public final void onRepeatModeChanged(int i) {
        l(g(), 8, new b(2));
    }

    @Override // a0.InterfaceC0162M
    public final void onShuffleModeEnabledChanged(boolean z4) {
        l(g(), 9, new b(6));
    }

    @Override // a0.InterfaceC0162M
    public final void onSkipSilenceEnabledChanged(boolean z4) {
        l(k(), 23, new C0473y(6));
    }

    @Override // a0.InterfaceC0162M
    public final void onSurfaceSizeChanged(int i, int i5) {
        l(k(), 24, new b(7));
    }

    @Override // a0.InterfaceC0162M
    public final void onTimelineChanged(AbstractC0169U abstractC0169U, int i) {
        InterfaceC0164O interfaceC0164O = this.f6368r;
        interfaceC0164O.getClass();
        n nVar = this.f6365o;
        nVar.f10957d = n.f(interfaceC0164O, (I) nVar.f10955b, (H) nVar.f10958e, (C0167S) nVar.f10954a);
        nVar.k(((C0448G) interfaceC0164O).z());
        l(g(), 0, new C0473y(4));
    }

    @Override // a0.InterfaceC0162M
    public final void onTrackSelectionParametersChanged(C0174Z c0174z) {
        C0477a c0477aG = g();
        l(c0477aG, 19, new b(c0477aG, (m) c0174z));
    }

    @Override // a0.InterfaceC0162M
    public final void onTracksChanged(b0 b0Var) {
        l(g(), 2, new C0473y(12));
    }

    @Override // a0.InterfaceC0162M
    public final void onVideoSizeChanged(e0 e0Var) {
        C0477a c0477aK = k();
        l(c0477aK, 25, new C0444C(c0477aK, e0Var));
    }

    @Override // a0.InterfaceC0162M
    public final void onVolumeChanged(float f2) {
        l(k(), 22, new C0473y(7));
    }

    @Override // a0.InterfaceC0162M
    public final void onPositionDiscontinuity(C0163N c0163n, C0163N c0163n2, int i) {
        if (i == 1) {
            this.f6370t = false;
        }
        InterfaceC0164O interfaceC0164O = this.f6368r;
        interfaceC0164O.getClass();
        n nVar = this.f6365o;
        nVar.f10957d = n.f(interfaceC0164O, (I) nVar.f10955b, (H) nVar.f10958e, (C0167S) nVar.f10954a);
        C0477a c0477aG = g();
        l(c0477aG, 11, new C0474z(c0477aG, i, c0163n, c0163n2));
    }

    @Override // a0.InterfaceC0162M
    public final void onCues(c0.c cVar) {
        l(g(), 27, new b(1));
    }

    @Override // a0.InterfaceC0162M
    public final void onRenderedFirstFrame() {
    }

    @Override // a0.InterfaceC0162M
    public final void onLoadingChanged(boolean z4) {
    }

    @Override // a0.InterfaceC0162M
    public final void onEvents(InterfaceC0164O interfaceC0164O, C0161L c0161l) {
    }
}
