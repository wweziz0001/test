package X0;

import F0.C0066m;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f2603d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2604a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2606c;

    public static long a(int i, boolean z4, byte[] bArr) {
        long j5 = ((long) bArr[0]) & 255;
        if (z4) {
            j5 &= ~f2603d[i - 1];
        }
        for (int i5 = 1; i5 < i; i5++) {
            j5 = (j5 << 8) | (((long) bArr[i5]) & 255);
        }
        return j5;
    }

    public static int b(int i) {
        for (int i5 = 0; i5 < 8; i5++) {
            if ((f2603d[i5] & ((long) i)) != 0) {
                return i5 + 1;
            }
        }
        return -1;
    }

    public final long c(C0066m c0066m, boolean z4, boolean z5, int i) throws EOFException, InterruptedIOException {
        int i5 = this.f2605b;
        byte[] bArr = this.f2604a;
        if (i5 == 0) {
            if (!c0066m.l(bArr, 0, 1, z4)) {
                return -1L;
            }
            int iB = b(bArr[0] & 255);
            this.f2606c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f2605b = 1;
        }
        int i6 = this.f2606c;
        if (i6 > i) {
            this.f2605b = 0;
            return -2L;
        }
        if (i6 != 1) {
            c0066m.l(bArr, 1, i6 - 1, false);
        }
        this.f2605b = 0;
        return a(this.f2606c, z5, bArr);
    }
}
