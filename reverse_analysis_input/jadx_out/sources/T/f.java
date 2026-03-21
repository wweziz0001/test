package T;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f2045l.mark(Integer.MAX_VALUE);
    }

    public final void b(long j5) throws IOException {
        int i = this.f2047n;
        if (i > j5) {
            this.f2047n = 0;
            this.f2045l.reset();
        } else {
            j5 -= (long) i;
        }
        a((int) j5);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f2045l.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
