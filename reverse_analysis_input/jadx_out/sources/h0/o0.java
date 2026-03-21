package h0;

import a0.AbstractC0169U;
import a0.C0190p;
import d0.InterfaceC0348a;

/* JADX INFO: loaded from: classes.dex */
public interface o0 extends k0 {
    void disable();

    void enable(r0 r0Var, C0190p[] c0190pArr, x0.f0 f0Var, long j5, boolean z4, boolean z5, long j6, long j7, x0.H h2);

    q0 getCapabilities();

    U getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    x0.f0 getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void init(int i, i0.j jVar, InterfaceC0348a interfaceC0348a);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError();

    void release();

    void render(long j5, long j6);

    void replaceStream(C0190p[] c0190pArr, x0.f0 f0Var, long j5, long j6, x0.H h2);

    void reset();

    void resetPosition(long j5);

    void setCurrentStreamFinal();

    void setTimeline(AbstractC0169U abstractC0169U);

    void start();

    void stop();

    default void enableMayRenderStartOfStream() {
    }

    default void setPlaybackSpeed(float f2, float f5) {
    }
}
