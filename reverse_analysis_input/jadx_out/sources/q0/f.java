package q0;

import F0.N;
import Q1.C0118a;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import d0.AbstractC0370w;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f implements m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f9259g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f9260h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f9261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f9262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f9263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f9264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N f9265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9266f;

    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        N n4 = new N();
        this.f9261a = mediaCodec;
        this.f9262b = handlerThread;
        this.f9265e = n4;
        this.f9264d = new AtomicReference();
    }

    public static e f() {
        ArrayDeque arrayDeque = f9259g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new e();
                }
                return (e) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q0.m
    public final void a(Bundle bundle) {
        e();
        d dVar = this.f9263c;
        int i = AbstractC0370w.f5326a;
        dVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // q0.m
    public final void b(int i, C0118a c0118a, long j5, int i5) {
        e();
        e eVarF = f();
        eVarF.f9254a = i;
        eVarF.f9255b = 0;
        eVarF.f9257d = j5;
        eVarF.f9258e = i5;
        int i6 = c0118a.f1796b;
        MediaCodec.CryptoInfo cryptoInfo = eVarF.f9256c;
        cryptoInfo.numSubSamples = i6;
        int[] iArr = (int[]) c0118a.f1801g;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = (int[]) c0118a.f1802h;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = (byte[]) c0118a.f1800f;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = (byte[]) c0118a.f1799e;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c0118a.f1795a;
        if (AbstractC0370w.f5326a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c0118a.f1797c, c0118a.f1798d));
        }
        this.f9263c.obtainMessage(2, eVarF).sendToTarget();
    }

    @Override // q0.m
    public final void c(int i, int i5, long j5, int i6) {
        e();
        e eVarF = f();
        eVarF.f9254a = i;
        eVarF.f9255b = i5;
        eVarF.f9257d = j5;
        eVarF.f9258e = i6;
        d dVar = this.f9263c;
        int i7 = AbstractC0370w.f5326a;
        dVar.obtainMessage(1, eVarF).sendToTarget();
    }

    @Override // q0.m
    public final void d() {
        if (this.f9266f) {
            flush();
            this.f9262b.quit();
        }
        this.f9266f = false;
    }

    @Override // q0.m
    public final void e() {
        RuntimeException runtimeException = (RuntimeException) this.f9264d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // q0.m
    public final void flush() {
        if (this.f9266f) {
            try {
                d dVar = this.f9263c;
                dVar.getClass();
                dVar.removeCallbacksAndMessages(null);
                N n4 = this.f9265e;
                synchronized (n4) {
                    n4.f715a = false;
                }
                d dVar2 = this.f9263c;
                dVar2.getClass();
                dVar2.obtainMessage(3).sendToTarget();
                synchronized (n4) {
                    while (!n4.f715a) {
                        n4.wait();
                    }
                }
            } catch (InterruptedException e5) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e5);
            }
        }
    }

    @Override // q0.m
    public final void start() {
        if (this.f9266f) {
            return;
        }
        HandlerThread handlerThread = this.f9262b;
        handlerThread.start();
        this.f9263c = new d(this, handlerThread.getLooper());
        this.f9266f = true;
    }
}
