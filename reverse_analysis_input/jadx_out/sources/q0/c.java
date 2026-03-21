package q0;

import Q1.C0118a;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.datastore.preferences.protobuf.C0219k;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.nio.ByteBuffer;
import java.util.HashSet;
import m3.C0675i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MediaCodec f9247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f9248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f9249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Z1.s f9250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9252q = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, Z1.s sVar) {
        this.f9247l = mediaCodec;
        this.f9248m = new g(handlerThread);
        this.f9249n = mVar;
        this.f9250o = sVar;
    }

    public static void e(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        Z1.s sVar;
        LoudnessCodecController loudnessCodecController;
        g gVar = cVar.f9248m;
        AbstractC0360m.h(gVar.f9269c == null);
        HandlerThread handlerThread = gVar.f9268b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = cVar.f9247l;
        mediaCodec.setCallback(gVar, handler);
        gVar.f9269c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        cVar.f9249n.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (AbstractC0370w.f5326a >= 35 && (sVar = cVar.f9250o) != null && ((loudnessCodecController = (LoudnessCodecController) sVar.f3087o) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            AbstractC0360m.h(((HashSet) sVar.f3085m).add(mediaCodec));
        }
        cVar.f9252q = 1;
    }

    public static String m(String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // q0.l
    public final void a(Bundle bundle) {
        this.f9249n.a(bundle);
    }

    @Override // q0.l
    public final void b(int i, C0118a c0118a, long j5, int i5) {
        this.f9249n.b(i, c0118a, j5, i5);
    }

    @Override // q0.l
    public final void c(int i, int i5, long j5, int i6) {
        this.f9249n.c(i, i5, j5, i6);
    }

    @Override // q0.l
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        int i;
        this.f9249n.e();
        g gVar = this.f9248m;
        synchronized (gVar.f9267a) {
            try {
                IllegalStateException illegalStateException = gVar.f9279n;
                if (illegalStateException != null) {
                    gVar.f9279n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = gVar.f9275j;
                if (codecException != null) {
                    gVar.f9275j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = gVar.f9276k;
                if (cryptoException != null) {
                    gVar.f9276k = null;
                    throw cryptoException;
                }
                i = -1;
                if (!(gVar.f9277l > 0 || gVar.f9278m)) {
                    C0219k c0219k = gVar.f9271e;
                    int i5 = c0219k.f4172b;
                    int i6 = c0219k.f4173c;
                    if (!(i5 == i6)) {
                        if (i5 == i6) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = ((int[]) c0219k.f4175e)[i5];
                        c0219k.f4172b = c0219k.f4174d & (i5 + 1);
                        if (i >= 0) {
                            AbstractC0360m.i(gVar.f9274h);
                            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) gVar.f9272f.remove();
                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                        } else if (i == -2) {
                            gVar.f9274h = (MediaFormat) gVar.f9273g.remove();
                        }
                    }
                }
            } finally {
            }
        }
        return i;
    }

    @Override // q0.l
    public final boolean f(C0675i c0675i) {
        g gVar = this.f9248m;
        synchronized (gVar.f9267a) {
            gVar.f9280o = c0675i;
        }
        return true;
    }

    @Override // q0.l
    public final void flush() {
        this.f9249n.flush();
        this.f9247l.flush();
        g gVar = this.f9248m;
        synchronized (gVar.f9267a) {
            gVar.f9277l++;
            Handler handler = gVar.f9269c;
            int i = AbstractC0370w.f5326a;
            handler.post(new A3.c(gVar, 18));
        }
        this.f9247l.start();
    }

    @Override // q0.l
    public final void g(long j5, int i) {
        this.f9247l.releaseOutputBuffer(i, j5);
    }

    @Override // q0.l
    public final void h() {
        this.f9247l.detachOutputSurface();
    }

    @Override // q0.l
    public final ByteBuffer i(int i) {
        return this.f9247l.getInputBuffer(i);
    }

    @Override // q0.l
    public final void j(Surface surface) {
        this.f9247l.setOutputSurface(surface);
    }

    @Override // q0.l
    public final void k(int i) {
        this.f9247l.releaseOutputBuffer(i, false);
    }

    @Override // q0.l
    public final ByteBuffer l(int i) {
        return this.f9247l.getOutputBuffer(i);
    }

    @Override // q0.l
    public final int p() {
        int i;
        this.f9249n.e();
        g gVar = this.f9248m;
        synchronized (gVar.f9267a) {
            try {
                IllegalStateException illegalStateException = gVar.f9279n;
                if (illegalStateException != null) {
                    gVar.f9279n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = gVar.f9275j;
                if (codecException != null) {
                    gVar.f9275j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = gVar.f9276k;
                if (cryptoException != null) {
                    gVar.f9276k = null;
                    throw cryptoException;
                }
                i = -1;
                if (!(gVar.f9277l > 0 || gVar.f9278m)) {
                    C0219k c0219k = gVar.f9270d;
                    int i5 = c0219k.f4172b;
                    int i6 = c0219k.f4173c;
                    if (!(i5 == i6)) {
                        if (i5 == i6) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = ((int[]) c0219k.f4175e)[i5];
                        c0219k.f4172b = (i5 + 1) & c0219k.f4174d;
                    }
                }
            } finally {
            }
        }
        return i;
    }

    @Override // q0.l
    public final void q(int i) {
        this.f9247l.setVideoScalingMode(i);
    }

    @Override // q0.l
    public final void release() {
        Z1.s sVar;
        Z1.s sVar2;
        try {
            if (this.f9252q == 1) {
                this.f9249n.d();
                g gVar = this.f9248m;
                synchronized (gVar.f9267a) {
                    gVar.f9278m = true;
                    gVar.f9268b.quit();
                    gVar.a();
                }
            }
            this.f9252q = 2;
            if (this.f9251p) {
                return;
            }
            try {
                int i = AbstractC0370w.f5326a;
                if (i >= 30 && i < 33) {
                    this.f9247l.stop();
                }
                if (i >= 35 && (sVar2 = this.f9250o) != null) {
                    sVar2.P(this.f9247l);
                }
                this.f9247l.release();
                this.f9251p = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f9251p) {
                try {
                    int i5 = AbstractC0370w.f5326a;
                    if (i5 >= 30 && i5 < 33) {
                        this.f9247l.stop();
                    }
                    if (i5 >= 35 && (sVar = this.f9250o) != null) {
                        sVar.P(this.f9247l);
                    }
                    this.f9247l.release();
                    this.f9251p = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // q0.l
    public final void s(D0.f fVar, Handler handler) {
        this.f9247l.setOnFrameRenderedListener(new C0741a(this, fVar, 0), handler);
    }

    @Override // q0.l
    public final MediaFormat w() {
        MediaFormat mediaFormat;
        g gVar = this.f9248m;
        synchronized (gVar.f9267a) {
            try {
                mediaFormat = gVar.f9274h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }
}
