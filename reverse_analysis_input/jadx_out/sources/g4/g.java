package g4;

import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FileInputStream f5849l;

    public g(FileInputStream fileInputStream) {
        this.f5849l = fileInputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5849l.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    @Override // g4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(g4.a r5, long r6) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return r0
        L7:
            if (r2 < 0) goto L6a
            r0 = 1
            g4.q r1 = r5.q(r0)     // Catch: java.lang.AssertionError -> L35
            int r2 = r1.f5868c     // Catch: java.lang.AssertionError -> L35
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.lang.AssertionError -> L35
            long r6 = java.lang.Math.min(r6, r2)     // Catch: java.lang.AssertionError -> L35
            int r6 = (int) r6     // Catch: java.lang.AssertionError -> L35
            java.io.FileInputStream r7 = r4.f5849l     // Catch: java.lang.AssertionError -> L35
            byte[] r2 = r1.f5866a     // Catch: java.lang.AssertionError -> L35
            int r3 = r1.f5868c     // Catch: java.lang.AssertionError -> L35
            int r6 = r7.read(r2, r3, r6)     // Catch: java.lang.AssertionError -> L35
            r7 = -1
            if (r6 != r7) goto L3a
            int r6 = r1.f5867b     // Catch: java.lang.AssertionError -> L35
            int r7 = r1.f5868c     // Catch: java.lang.AssertionError -> L35
            if (r6 != r7) goto L37
            g4.q r6 = r1.a()     // Catch: java.lang.AssertionError -> L35
            r5.f5829l = r6     // Catch: java.lang.AssertionError -> L35
            g4.r.a(r1)     // Catch: java.lang.AssertionError -> L35
            goto L37
        L35:
            r5 = move-exception
            goto L46
        L37:
            r5 = -1
            return r5
        L3a:
            int r7 = r1.f5868c     // Catch: java.lang.AssertionError -> L35
            int r7 = r7 + r6
            r1.f5868c = r7     // Catch: java.lang.AssertionError -> L35
            long r1 = r5.f5830m     // Catch: java.lang.AssertionError -> L35
            long r6 = (long) r6     // Catch: java.lang.AssertionError -> L35
            long r1 = r1 + r6
            r5.f5830m = r1     // Catch: java.lang.AssertionError -> L35
            return r6
        L46:
            int r6 = g4.k.f5855a
            java.lang.Throwable r6 = r5.getCause()
            r7 = 0
            if (r6 == 0) goto L60
            java.lang.String r6 = r5.getMessage()
            if (r6 == 0) goto L5c
            java.lang.String r1 = "getsockname failed"
            boolean r6 = U3.l.c0(r6, r1)
            goto L5d
        L5c:
            r6 = r7
        L5d:
            if (r6 == 0) goto L60
            goto L61
        L60:
            r0 = r7
        L61:
            if (r0 == 0) goto L69
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            throw r6
        L69:
            throw r5
        L6a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.g.d(g4.a, long):long");
    }

    public final String toString() {
        return "source(" + this.f5849l + ')';
    }
}
