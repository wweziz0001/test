package f0;

import d0.AbstractC0360m;
import java.io.InputStream;

/* JADX INFO: renamed from: f0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0415j extends InputStream {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0413h f5674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0417l f5675m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5677o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5678p = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f5676n = new byte[1];

    public C0415j(InterfaceC0413h interfaceC0413h, C0417l c0417l) {
        this.f5674l = interfaceC0413h;
        this.f5675m = c0417l;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5678p) {
            return;
        }
        this.f5674l.close();
        this.f5678p = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f5676n;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) {
        AbstractC0360m.h(!this.f5678p);
        boolean z4 = this.f5677o;
        InterfaceC0413h interfaceC0413h = this.f5674l;
        if (!z4) {
            interfaceC0413h.p(this.f5675m);
            this.f5677o = true;
        }
        int i6 = interfaceC0413h.read(bArr, i, i5);
        if (i6 == -1) {
            return -1;
        }
        return i6;
    }
}
