package X0;

import F0.C0066m;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2488a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2489b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f2490c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B0.d f2491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2494g;

    public final long a(C0066m c0066m, int i) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f2488a;
        c0066m.l(bArr, 0, i, false);
        long j5 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            j5 = (j5 << 8) | ((long) (bArr[i5] & 255));
        }
        return j5;
    }
}
