package g4;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class m extends OutputStream {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f5858l;

    public m(n nVar) {
        this.f5858l = nVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f5858l.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        n nVar = this.f5858l;
        if (nVar.f5861n) {
            return;
        }
        nVar.flush();
    }

    public final String toString() {
        return this.f5858l + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        n nVar = this.f5858l;
        if (nVar.f5861n) {
            throw new IOException("closed");
        }
        nVar.f5860m.u((byte) i);
        nVar.a();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i5) throws IOException {
        N3.h.e(bArr, "data");
        n nVar = this.f5858l;
        if (!nVar.f5861n) {
            nVar.f5860m.t(bArr, i, i5);
            nVar.a();
            return;
        }
        throw new IOException("closed");
    }
}
