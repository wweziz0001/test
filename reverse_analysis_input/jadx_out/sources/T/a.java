package T;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f2042m;

    public a(f fVar) {
        this.f2042m = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j5, byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        if (j5 < 0) {
            return -1;
        }
        try {
            long j6 = this.f2041l;
            f fVar = this.f2042m;
            if (j6 != j5) {
                if (j6 >= 0 && j5 >= j6 + ((long) fVar.f2045l.available())) {
                    return -1;
                }
                fVar.b(j5);
                this.f2041l = j5;
            }
            if (i5 > fVar.f2045l.available()) {
                i5 = fVar.f2045l.available();
            }
            int i6 = fVar.read(bArr, i, i5);
            if (i6 >= 0) {
                this.f2041l += (long) i6;
                return i6;
            }
        } catch (IOException unused) {
        }
        this.f2041l = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
