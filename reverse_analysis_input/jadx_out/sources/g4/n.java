package g4;

import java.io.Closeable;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Closeable, Flushable, WritableByteChannel {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f5859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f5860m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5861n;

    public n(c cVar) {
        this.f5859l = cVar;
    }

    public final void a() {
        if (this.f5861n) {
            throw new IllegalStateException("closed");
        }
        a aVar = this.f5860m;
        long j5 = aVar.f5830m;
        if (j5 == 0) {
            j5 = 0;
        } else {
            q qVar = aVar.f5829l;
            N3.h.b(qVar);
            q qVar2 = qVar.f5872g;
            N3.h.b(qVar2);
            int i = qVar2.f5868c;
            if (i < 8192 && qVar2.f5870e) {
                j5 -= (long) (i - qVar2.f5867b);
            }
        }
        if (j5 > 0) {
            this.f5859l.a(aVar, j5);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        c cVar = this.f5859l;
        if (this.f5861n) {
            return;
        }
        try {
            a aVar = this.f5860m;
            long j5 = aVar.f5830m;
            if (j5 > 0) {
                cVar.a(aVar, j5);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            cVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f5861n = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f5861n) {
            throw new IllegalStateException("closed");
        }
        a aVar = this.f5860m;
        long j5 = aVar.f5830m;
        c cVar = this.f5859l;
        if (j5 > 0) {
            cVar.a(aVar, j5);
        }
        cVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f5861n;
    }

    public final String toString() {
        return "buffer(" + this.f5859l + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        N3.h.e(byteBuffer, "source");
        if (this.f5861n) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f5860m.write(byteBuffer);
        a();
        return iWrite;
    }
}
