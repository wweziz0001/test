package t0;

import android.net.Uri;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.AbstractC0408c;
import f0.C0417l;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: t0.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0842F extends AbstractC0408c implements InterfaceC0847d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedBlockingQueue f9835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f9836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f9837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9838s;

    public C0842F() {
        super(true);
        this.f9836q = 8000L;
        this.f9835p = new LinkedBlockingQueue();
        this.f9837r = new byte[0];
        this.f9838s = -1;
    }

    @Override // t0.InterfaceC0847d
    public final String g() {
        AbstractC0360m.h(this.f9838s != -1);
        int i = this.f9838s;
        int i5 = this.f9838s + 1;
        int i6 = AbstractC0370w.f5326a;
        Locale locale = Locale.US;
        return AbstractC0307a.g(i, i5, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // t0.InterfaceC0847d
    public final boolean h() {
        return false;
    }

    @Override // t0.InterfaceC0847d
    public final int o() {
        return this.f9838s;
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) {
        this.f9838s = c0417l.f5686a.getPort();
        return -1L;
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        return null;
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int iMin = Math.min(i5, this.f9837r.length);
        System.arraycopy(this.f9837r, 0, bArr, i, iMin);
        byte[] bArr2 = this.f9837r;
        this.f9837r = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i5) {
            return iMin;
        }
        try {
            byte[] bArr3 = (byte[]) this.f9835p.poll(this.f9836q, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int iMin2 = Math.min(i5 - iMin, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i + iMin, iMin2);
            if (iMin2 < bArr3.length) {
                this.f9837r = Arrays.copyOfRange(bArr3, iMin2, bArr3.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // f0.InterfaceC0413h
    public final void close() {
    }

    @Override // t0.InterfaceC0847d
    public final C0842F x() {
        return this;
    }
}
