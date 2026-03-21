package h0;

import a0.AbstractC0169U;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0365r;
import d0.InterfaceC0348a;
import java.util.Objects;

/* JADX INFO: renamed from: h0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0457h implements o0, q0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public A0.u f6147B;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6149m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r0 f6151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i0.j f6153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0365r f6154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x0.f0 f6156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0190p[] f6157u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f6158v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f6159w;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6161z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f6148l = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z1.e f6150n = new Z1.e((char) 0, 10);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f6160x = Long.MIN_VALUE;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC0169U f6146A = AbstractC0169U.f3260a;

    public AbstractC0457h(int i) {
        this.f6149m = i;
    }

    @Override // h0.q0
    public final void clearListener() {
        synchronized (this.f6148l) {
            this.f6147B = null;
        }
    }

    @Override // h0.o0
    public final void disable() {
        AbstractC0360m.h(this.f6155s == 1);
        this.f6150n.c();
        this.f6155s = 0;
        this.f6156t = null;
        this.f6157u = null;
        this.y = false;
        j();
    }

    @Override // h0.o0
    public final void enable(r0 r0Var, C0190p[] c0190pArr, x0.f0 f0Var, long j5, boolean z4, boolean z5, long j6, long j7, x0.H h2) {
        AbstractC0360m.h(this.f6155s == 0);
        this.f6151o = r0Var;
        this.f6155s = 1;
        k(z4, z5);
        replaceStream(c0190pArr, f0Var, j6, j7, h2);
        this.y = false;
        this.f6159w = j6;
        this.f6160x = j6;
        l(j6, z4);
    }

    @Override // h0.o0
    public U getMediaClock() {
        return null;
    }

    @Override // h0.o0
    public final long getReadingPositionUs() {
        return this.f6160x;
    }

    @Override // h0.o0
    public final int getState() {
        return this.f6155s;
    }

    @Override // h0.o0
    public final x0.f0 getStream() {
        return this.f6156t;
    }

    @Override // h0.o0, h0.q0
    public final int getTrackType() {
        return this.f6149m;
    }

    @Override // h0.o0
    public final boolean hasReadStreamToEnd() {
        return this.f6160x == Long.MIN_VALUE;
    }

    public final C0464o i(Exception exc, C0190p c0190p, boolean z4, int i) {
        int iSupportsFormat;
        if (c0190p == null || this.f6161z) {
            iSupportsFormat = 4;
        } else {
            this.f6161z = true;
            try {
                iSupportsFormat = supportsFormat(c0190p) & 7;
            } catch (C0464o unused) {
                iSupportsFormat = 4;
            } finally {
                this.f6161z = false;
            }
        }
        return new C0464o(1, exc, i, getName(), this.f6152p, c0190p, c0190p == null ? 4 : iSupportsFormat, z4);
    }

    @Override // h0.o0
    public final void init(int i, i0.j jVar, InterfaceC0348a interfaceC0348a) {
        this.f6152p = i;
        this.f6153q = jVar;
        this.f6154r = (C0365r) interfaceC0348a;
    }

    @Override // h0.o0
    public final boolean isCurrentStreamFinal() {
        return this.y;
    }

    @Override // h0.o0
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    public abstract void j();

    public abstract void l(long j5, boolean z4);

    @Override // h0.o0
    public final void maybeThrowStreamError() {
        x0.f0 f0Var = this.f6156t;
        f0Var.getClass();
        f0Var.a();
    }

    public final int r(Z1.e eVar, g0.e eVar2, int i) {
        x0.f0 f0Var = this.f6156t;
        f0Var.getClass();
        int iK = f0Var.k(eVar, eVar2, i);
        if (iK == -4) {
            if (eVar2.e(4)) {
                this.f6160x = Long.MIN_VALUE;
                return this.y ? -4 : -3;
            }
            long j5 = eVar2.f5789r + this.f6158v;
            eVar2.f5789r = j5;
            this.f6160x = Math.max(this.f6160x, j5);
        } else if (iK == -5) {
            C0190p c0190p = (C0190p) eVar.f3002n;
            c0190p.getClass();
            long j6 = c0190p.f3429s;
            if (j6 != Long.MAX_VALUE) {
                C0189o c0189oA = c0190p.a();
                c0189oA.f3392r = j6 + this.f6158v;
                eVar.f3002n = new C0190p(c0189oA);
            }
        }
        return iK;
    }

    @Override // h0.o0
    public final void release() {
        AbstractC0360m.h(this.f6155s == 0);
        m();
    }

    @Override // h0.o0
    public final void replaceStream(C0190p[] c0190pArr, x0.f0 f0Var, long j5, long j6, x0.H h2) {
        AbstractC0360m.h(!this.y);
        this.f6156t = f0Var;
        if (this.f6160x == Long.MIN_VALUE) {
            this.f6160x = j5;
        }
        this.f6157u = c0190pArr;
        this.f6158v = j6;
        q(c0190pArr, j5, j6, h2);
    }

    @Override // h0.o0
    public final void reset() {
        AbstractC0360m.h(this.f6155s == 0);
        this.f6150n.c();
        n();
    }

    @Override // h0.o0
    public final void resetPosition(long j5) {
        this.y = false;
        this.f6159w = j5;
        this.f6160x = j5;
        l(j5, false);
    }

    @Override // h0.o0
    public final void setCurrentStreamFinal() {
        this.y = true;
    }

    @Override // h0.q0
    public final void setListener(p0 p0Var) {
        synchronized (this.f6148l) {
            this.f6147B = (A0.u) p0Var;
        }
    }

    @Override // h0.o0
    public final void setTimeline(AbstractC0169U abstractC0169U) {
        AbstractC0169U abstractC0169U2 = this.f6146A;
        int i = AbstractC0370w.f5326a;
        if (Objects.equals(abstractC0169U2, abstractC0169U)) {
            return;
        }
        this.f6146A = abstractC0169U;
    }

    @Override // h0.o0
    public final void start() {
        AbstractC0360m.h(this.f6155s == 1);
        this.f6155s = 2;
        o();
    }

    @Override // h0.o0
    public final void stop() {
        AbstractC0360m.h(this.f6155s == 2);
        this.f6155s = 1;
        p();
    }

    @Override // h0.q0
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    @Override // h0.o0
    public final q0 getCapabilities() {
        return this;
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    @Override // h0.k0
    public void handleMessage(int i, Object obj) {
    }

    public void k(boolean z4, boolean z5) {
    }

    public void q(C0190p[] c0190pArr, long j5, long j6, x0.H h2) {
    }
}
