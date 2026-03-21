package g4;

import a.AbstractC0149a;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class o extends InputStream {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f5862l;

    public o(p pVar) {
        this.f5862l = pVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        p pVar = this.f5862l;
        if (pVar.f5865n) {
            throw new IOException("closed");
        }
        return (int) Math.min(pVar.f5864m.f5830m, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5862l.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        p pVar = this.f5862l;
        if (pVar.f5865n) {
            throw new IOException("closed");
        }
        a aVar = pVar.f5864m;
        if (aVar.f5830m == 0 && pVar.f5863l.d(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.f() & 255;
    }

    public final String toString() {
        return this.f5862l + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        N3.h.e(bArr, "data");
        p pVar = this.f5862l;
        if (!pVar.f5865n) {
            AbstractC0149a.f(bArr.length, i, i5);
            a aVar = pVar.f5864m;
            if (aVar.f5830m == 0 && pVar.f5863l.d(aVar, 8192L) == -1) {
                return -1;
            }
            return aVar.read(bArr, i, i5);
        }
        throw new IOException("closed");
    }
}
