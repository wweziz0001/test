package h0;

import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: h0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0462m implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0.f f6226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6233h;
    public final HashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6234j;

    public C0462m(B0.f fVar, int i, int i5, int i6, int i7, int i8, boolean z4, int i9) {
        a(i6, 0, "bufferForPlaybackMs", "0");
        a(i7, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i6, "minBufferMs", "bufferForPlaybackMs");
        a(i, i7, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i5, i, "maxBufferMs", "minBufferMs");
        a(i9, 0, "backBufferDurationMs", "0");
        this.f6226a = fVar;
        this.f6227b = AbstractC0370w.M(i);
        this.f6228c = AbstractC0370w.M(i5);
        this.f6229d = AbstractC0370w.M(i6);
        this.f6230e = AbstractC0370w.M(i7);
        this.f6231f = i8;
        this.f6232g = z4;
        this.f6233h = AbstractC0370w.M(i9);
        this.i = new HashMap();
        this.f6234j = -1L;
    }

    public static void a(int i, int i5, String str, String str2) {
        AbstractC0360m.b(str + " cannot be less than " + str2, i >= i5);
    }

    public final int b() {
        Iterator it = this.i.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C0461l) it.next()).f6217b;
        }
        return i;
    }

    public final boolean c(P p4) {
        int i;
        C0461l c0461l = (C0461l) this.i.get(p4.f6038a);
        c0461l.getClass();
        B0.f fVar = this.f6226a;
        synchronized (fVar) {
            i = fVar.f194d * fVar.f192b;
        }
        boolean z4 = true;
        boolean z5 = i >= b();
        float f2 = p4.f6040c;
        long j5 = this.f6228c;
        long jMin = this.f6227b;
        if (f2 > 1.0f) {
            jMin = Math.min(AbstractC0370w.x(jMin, f2), j5);
        }
        long jMax = Math.max(jMin, 500000L);
        long j6 = p4.f6039b;
        if (j6 < jMax) {
            if (!this.f6232g && z5) {
                z4 = false;
            }
            c0461l.f6216a = z4;
            if (!z4 && j6 < 500000) {
                AbstractC0360m.y("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j6 >= j5 || z5) {
            c0461l.f6216a = false;
        }
        return c0461l.f6216a;
    }

    public final void d() {
        if (!this.i.isEmpty()) {
            this.f6226a.a(b());
            return;
        }
        B0.f fVar = this.f6226a;
        synchronized (fVar) {
            if (fVar.f191a) {
                fVar.a(0);
            }
        }
    }
}
