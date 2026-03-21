package g4;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class p implements t, ReadableByteChannel {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f5863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f5864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5865n;

    public p(t tVar) {
        N3.h.e(tVar, "source");
        this.f5863l = tVar;
        this.f5864m = new a();
    }

    public final int a() throws EOFException {
        k(4L);
        int iN = this.f5864m.n();
        return ((iN & 255) << 24) | (((-16777216) & iN) >>> 24) | ((16711680 & iN) >>> 8) | ((65280 & iN) << 8);
    }

    public final long b() throws EOFException {
        long jN;
        k(8L);
        a aVar = this.f5864m;
        if (aVar.f5830m < 8) {
            throw new EOFException();
        }
        q qVar = aVar.f5829l;
        N3.h.b(qVar);
        int i = qVar.f5867b;
        int i5 = qVar.f5868c;
        if (i5 - i < 8) {
            jN = ((((long) aVar.n()) & 4294967295L) << 32) | (4294967295L & ((long) aVar.n()));
        } else {
            byte[] bArr = qVar.f5866a;
            int i6 = i + 7;
            long j5 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i7 = i + 8;
            long j6 = j5 | (((long) bArr[i6]) & 255);
            aVar.f5830m -= 8;
            if (i7 == i5) {
                aVar.f5829l = qVar.a();
                r.a(qVar);
            } else {
                qVar.f5867b = i7;
            }
            jN = j6;
        }
        return ((jN & 255) << 56) | (((-72057594037927936L) & jN) >>> 56) | ((71776119061217280L & jN) >>> 40) | ((280375465082880L & jN) >>> 24) | ((1095216660480L & jN) >>> 8) | ((4278190080L & jN) << 8) | ((16711680 & jN) << 24) | ((65280 & jN) << 40);
    }

    public final short c() throws EOFException {
        short sF;
        k(2L);
        a aVar = this.f5864m;
        if (aVar.f5830m < 2) {
            throw new EOFException();
        }
        q qVar = aVar.f5829l;
        N3.h.b(qVar);
        int i = qVar.f5867b;
        int i5 = qVar.f5868c;
        if (i5 - i < 2) {
            sF = (short) ((aVar.f() & 255) | ((aVar.f() & 255) << 8));
        } else {
            int i6 = i + 1;
            byte[] bArr = qVar.f5866a;
            int i7 = (bArr[i] & 255) << 8;
            int i8 = i + 2;
            int i9 = (bArr[i6] & 255) | i7;
            aVar.f5830m -= 2;
            if (i8 == i5) {
                aVar.f5829l = qVar.a();
                r.a(qVar);
            } else {
                qVar.f5867b = i8;
            }
            sF = (short) i9;
        }
        return (short) (((sF & 255) << 8) | ((65280 & sF) >>> 8));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f5865n) {
            return;
        }
        this.f5865n = true;
        this.f5863l.close();
        a aVar = this.f5864m;
        aVar.o(aVar.f5830m);
    }

    @Override // g4.t
    public final long d(a aVar, long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        if (this.f5865n) {
            throw new IllegalStateException("closed");
        }
        a aVar2 = this.f5864m;
        if (aVar2.f5830m == 0 && this.f5863l.d(aVar2, 8192L) == -1) {
            return -1L;
        }
        return aVar2.d(aVar, Math.min(j5, aVar2.f5830m));
    }

    public final String f(long j5) throws EOFException {
        k(j5);
        a aVar = this.f5864m;
        aVar.getClass();
        Charset charset = U3.a.f2287a;
        N3.h.e(charset, "charset");
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j5).toString());
        }
        if (aVar.f5830m < j5) {
            throw new EOFException();
        }
        if (j5 == 0) {
            return "";
        }
        q qVar = aVar.f5829l;
        N3.h.b(qVar);
        int i = qVar.f5867b;
        if (((long) i) + j5 > qVar.f5868c) {
            return new String(aVar.k(j5), charset);
        }
        int i5 = (int) j5;
        String str = new String(qVar.f5866a, i, i5, charset);
        int i6 = qVar.f5867b + i5;
        qVar.f5867b = i6;
        aVar.f5830m -= j5;
        if (i6 == qVar.f5868c) {
            aVar.f5829l = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f5865n;
    }

    public final void k(long j5) throws EOFException {
        a aVar;
        if (j5 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        if (this.f5865n) {
            throw new IllegalStateException("closed");
        }
        do {
            aVar = this.f5864m;
            if (aVar.f5830m >= j5) {
                return;
            }
        } while (this.f5863l.d(aVar, 8192L) != -1);
        throw new EOFException();
    }

    public final void l(long j5) throws EOFException {
        if (this.f5865n) {
            throw new IllegalStateException("closed");
        }
        while (j5 > 0) {
            a aVar = this.f5864m;
            if (aVar.f5830m == 0 && this.f5863l.d(aVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j5, aVar.f5830m);
            aVar.o(jMin);
            j5 -= jMin;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        N3.h.e(byteBuffer, "sink");
        a aVar = this.f5864m;
        if (aVar.f5830m == 0 && this.f5863l.d(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f5863l + ')';
    }
}
