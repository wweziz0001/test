package q0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.datastore.preferences.protobuf.C0219k;
import h0.C0449H;
import java.util.ArrayDeque;
import m3.C0675i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f9268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f9269c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f9274h;
    public MediaFormat i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f9275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f9276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IllegalStateException f9279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0675i f9280o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9267a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0219k f9270d = new C0219k(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0219k f9271e = new C0219k(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f9272f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f9273g = new ArrayDeque();

    public g(HandlerThread handlerThread) {
        this.f9268b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f9273g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        C0219k c0219k = this.f9270d;
        c0219k.f4173c = c0219k.f4172b;
        C0219k c0219k2 = this.f9271e;
        c0219k2.f4173c = c0219k2.f4172b;
        this.f9272f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f9267a) {
            this.f9276k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f9267a) {
            this.f9275j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        C0449H c0449h;
        synchronized (this.f9267a) {
            this.f9270d.a(i);
            C0675i c0675i = this.f9280o;
            if (c0675i != null && (c0449h = ((r) c0675i.f8712m).f9330Q) != null) {
                c0449h.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        C0449H c0449h;
        synchronized (this.f9267a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.f9271e.a(-2);
                    this.f9273g.add(mediaFormat);
                    this.i = null;
                }
                this.f9271e.a(i);
                this.f9272f.add(bufferInfo);
                C0675i c0675i = this.f9280o;
                if (c0675i != null && (c0449h = ((r) c0675i.f8712m).f9330Q) != null) {
                    c0449h.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f9267a) {
            this.f9271e.a(-2);
            this.f9273g.add(mediaFormat);
            this.i = null;
        }
    }
}
