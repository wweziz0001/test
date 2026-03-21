package i0;

import a0.AbstractC0169U;
import a0.C0167S;
import a0.C0168T;
import a0.C0190p;
import a0.C0197w;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import d0.AbstractC0370w;
import h0.C0464o;
import java.util.HashMap;
import x0.H;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f6386A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f6388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f6389c;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f6395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6396k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0464o f6399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public D0.d f6400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public D0.d f6401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public D0.d f6402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0190p f6403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0190p f6404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0190p f6405t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6408w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6409x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6410z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0168T f6391e = new C0168T();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0167S f6392f = new C0167S();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f6394h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f6393g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6390d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6397l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6398m = 0;

    public h(Context context, PlaybackSession playbackSession) {
        this.f6387a = context.getApplicationContext();
        this.f6389c = playbackSession;
        e eVar = new e();
        this.f6388b = eVar;
        eVar.f6382d = this;
    }

    public final boolean a(D0.d dVar) {
        String str;
        if (dVar != null) {
            String str2 = (String) dVar.f396n;
            e eVar = this.f6388b;
            synchronized (eVar) {
                str = eVar.f6384f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f6395j;
        if (builder != null && this.f6386A) {
            builder.setAudioUnderrunCount(this.f6410z);
            this.f6395j.setVideoFramesDropped(this.f6409x);
            this.f6395j.setVideoFramesPlayed(this.y);
            Long l3 = (Long) this.f6393g.get(this.i);
            this.f6395j.setNetworkTransferDurationMillis(l3 == null ? 0L : l3.longValue());
            Long l4 = (Long) this.f6394h.get(this.i);
            this.f6395j.setNetworkBytesRead(l4 == null ? 0L : l4.longValue());
            this.f6395j.setStreamSource((l4 == null || l4.longValue() <= 0) ? 0 : 1);
            this.f6389c.reportPlaybackMetrics(this.f6395j.build());
        }
        this.f6395j = null;
        this.i = null;
        this.f6410z = 0;
        this.f6409x = 0;
        this.y = 0;
        this.f6403r = null;
        this.f6404s = null;
        this.f6405t = null;
        this.f6386A = false;
    }

    public final void c(AbstractC0169U abstractC0169U, H h2) {
        int iB;
        PlaybackMetrics.Builder builder = this.f6395j;
        if (h2 == null || (iB = abstractC0169U.b(h2.f10531a)) == -1) {
            return;
        }
        C0167S c0167s = this.f6392f;
        int i = 0;
        abstractC0169U.f(iB, c0167s, false);
        int i5 = c0167s.f3238c;
        C0168T c0168t = this.f6391e;
        abstractC0169U.n(i5, c0168t);
        C0197w c0197w = c0168t.f3247c.f3154b;
        if (c0197w != null) {
            int iF = AbstractC0370w.F(c0197w.f3460a, c0197w.f3461b);
            i = iF != 0 ? iF != 1 ? iF != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (c0168t.f3256m != -9223372036854775807L && !c0168t.f3254k && !c0168t.i && !c0168t.a()) {
            builder.setMediaDurationMillis(AbstractC0370w.Z(c0168t.f3256m));
        }
        builder.setPlaybackType(c0168t.a() ? 2 : 1);
        this.f6386A = true;
    }

    public final void d(C0477a c0477a, String str) {
        H h2 = c0477a.f6355d;
        if ((h2 == null || !h2.b()) && str.equals(this.i)) {
            b();
        }
        this.f6393g.remove(str);
        this.f6394h.remove(str);
    }

    public final void e(int i, long j5, C0190p c0190p, int i5) {
        int i6;
        TrackChangeEvent.Builder timeSinceCreatedMillis = f.p(i).setTimeSinceCreatedMillis(j5 - this.f6390d);
        if (c0190p != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i5 != 1) {
                i6 = 3;
                if (i5 != 2) {
                    i6 = i5 != 3 ? 1 : 4;
                }
            } else {
                i6 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i6);
            String str = c0190p.f3423m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c0190p.f3424n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c0190p.f3421k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i7 = c0190p.f3420j;
            if (i7 != -1) {
                timeSinceCreatedMillis.setBitrate(i7);
            }
            int i8 = c0190p.f3431u;
            if (i8 != -1) {
                timeSinceCreatedMillis.setWidth(i8);
            }
            int i9 = c0190p.f3432v;
            if (i9 != -1) {
                timeSinceCreatedMillis.setHeight(i9);
            }
            int i10 = c0190p.f3402C;
            if (i10 != -1) {
                timeSinceCreatedMillis.setChannelCount(i10);
            }
            int i11 = c0190p.f3403D;
            if (i11 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i11);
            }
            String str4 = c0190p.f3415d;
            if (str4 != null) {
                int i12 = AbstractC0370w.f5326a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f2 = c0190p.f3433w;
            if (f2 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f2);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f6386A = true;
        this.f6389c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
