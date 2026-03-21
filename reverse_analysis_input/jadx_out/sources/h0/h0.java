package h0;

import a0.AbstractC0169U;
import a0.C0190p;
import d0.AbstractC0360m;
import d0.InterfaceC0348a;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 implements o0, q0 {
    private r0 configuration;
    private int index;
    private int state;
    private x0.f0 stream;
    private boolean streamIsFinal;

    @Override // h0.o0
    public final void disable() {
        AbstractC0360m.h(this.state == 1);
        this.state = 0;
        this.stream = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // h0.o0
    public final void enable(r0 r0Var, C0190p[] c0190pArr, x0.f0 f0Var, long j5, boolean z4, boolean z5, long j6, long j7, x0.H h2) {
        AbstractC0360m.h(this.state == 0);
        this.configuration = r0Var;
        this.state = 1;
        onEnabled(z4);
        replaceStream(c0190pArr, f0Var, j6, j7, h2);
        onPositionReset(j5, z4);
    }

    public final r0 getConfiguration() {
        return this.configuration;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // h0.o0
    public U getMediaClock() {
        return null;
    }

    @Override // h0.o0
    public long getReadingPositionUs() {
        return Long.MIN_VALUE;
    }

    @Override // h0.o0
    public final int getState() {
        return this.state;
    }

    @Override // h0.o0
    public final x0.f0 getStream() {
        return this.stream;
    }

    @Override // h0.o0, h0.q0
    public final int getTrackType() {
        return -2;
    }

    @Override // h0.o0
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    @Override // h0.o0
    public final void init(int i, i0.j jVar, InterfaceC0348a interfaceC0348a) {
        this.index = i;
    }

    @Override // h0.o0
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    @Override // h0.o0
    public boolean isEnded() {
        return true;
    }

    @Override // h0.o0
    public boolean isReady() {
        return true;
    }

    @Override // h0.o0
    public final void replaceStream(C0190p[] c0190pArr, x0.f0 f0Var, long j5, long j6, x0.H h2) {
        AbstractC0360m.h(!this.streamIsFinal);
        this.stream = f0Var;
        onRendererOffsetChanged(j6);
    }

    @Override // h0.o0
    public final void reset() {
        AbstractC0360m.h(this.state == 0);
        onReset();
    }

    @Override // h0.o0
    public final void resetPosition(long j5) {
        this.streamIsFinal = false;
        onPositionReset(j5, false);
    }

    @Override // h0.o0
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // h0.o0
    public final void start() {
        AbstractC0360m.h(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // h0.o0
    public final void stop() {
        AbstractC0360m.h(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // h0.q0
    public int supportsFormat(C0190p c0190p) {
        return q0.e(0, 0, 0, 0);
    }

    @Override // h0.q0
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    @Override // h0.o0
    public final q0 getCapabilities() {
        return this;
    }

    @Override // h0.o0
    public final void maybeThrowStreamError() {
    }

    public void onDisabled() {
    }

    public void onReset() {
    }

    public void onStarted() {
    }

    public void onStopped() {
    }

    public void onEnabled(boolean z4) {
    }

    public void onRendererOffsetChanged(long j5) {
    }

    @Override // h0.o0
    public void setTimeline(AbstractC0169U abstractC0169U) {
    }

    @Override // h0.k0
    public void handleMessage(int i, Object obj) {
    }

    public void onPositionReset(long j5, boolean z4) {
    }
}
