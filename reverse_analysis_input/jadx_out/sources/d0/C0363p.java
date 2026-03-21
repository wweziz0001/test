package d0;

import b3.AbstractC0307a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m2.M;

/* JADX INFO: renamed from: d0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0363p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f5310d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f5311e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M f5312f = M.n(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5315c;

    public C0363p() {
        this.f5313a = AbstractC0370w.f5331f;
    }

    public final long A() {
        long jP = p();
        if (jP >= 0) {
            return jP;
        }
        throw new IllegalStateException("Top bit not zero: " + jP);
    }

    public final int B() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        int i5 = i + 1;
        this.f5314b = i5;
        int i6 = (bArr[i] & 255) << 8;
        this.f5314b = i + 2;
        return (bArr[i5] & 255) | i6;
    }

    public final long C() {
        int i;
        int i5;
        long j5 = this.f5313a[this.f5314b];
        int i6 = 7;
        while (true) {
            if (i6 < 0) {
                break;
            }
            int i7 = 1 << i6;
            if ((((long) i7) & j5) != 0) {
                i6--;
            } else if (i6 < 6) {
                j5 &= (long) (i7 - 1);
                i5 = 7 - i6;
            } else if (i6 == 7) {
                i5 = 1;
            }
        }
        i5 = 0;
        if (i5 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j5);
        }
        for (i = 1; i < i5; i++) {
            byte b4 = this.f5313a[this.f5314b + i];
            if ((b4 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j5);
            }
            j5 = (j5 << 6) | ((long) (b4 & 63));
        }
        this.f5314b += i5;
        return j5;
    }

    public final Charset D() {
        if (a() >= 3) {
            byte[] bArr = this.f5313a;
            int i = this.f5314b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f5314b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f5313a;
        int i5 = this.f5314b;
        byte b4 = bArr2[i5];
        if (b4 == -2 && bArr2[i5 + 1] == -1) {
            this.f5314b = i5 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b4 != -1 || bArr2[i5 + 1] != -2) {
            return null;
        }
        this.f5314b = i5 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void E(int i) {
        byte[] bArr = this.f5313a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        F(i, bArr);
    }

    public final void F(int i, byte[] bArr) {
        this.f5313a = bArr;
        this.f5315c = i;
        this.f5314b = 0;
    }

    public final void G(int i) {
        AbstractC0360m.c(i >= 0 && i <= this.f5313a.length);
        this.f5315c = i;
    }

    public final void H(int i) {
        AbstractC0360m.c(i >= 0 && i <= this.f5315c);
        this.f5314b = i;
    }

    public final void I(int i) {
        H(this.f5314b + i);
    }

    public final int a() {
        return this.f5315c - this.f5314b;
    }

    public final void b(int i) {
        byte[] bArr = this.f5313a;
        if (i > bArr.length) {
            this.f5313a = Arrays.copyOf(bArr, i);
        }
    }

    public final int c() {
        return this.f5314b;
    }

    public final char d(Charset charset) {
        AbstractC0360m.b("Unsupported charset: " + charset, f5312f.contains(charset));
        return (char) (e(charset) >> 16);
    }

    public final int e(Charset charset) {
        byte b4;
        int i;
        byte b5;
        byte b6;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            long j5 = this.f5313a[this.f5314b] & 255;
            char c5 = (char) j5;
            D1.b.k(((long) c5) == j5, "Out of range: %s", j5);
            b4 = (byte) c5;
            i = 1;
        } else {
            i = 2;
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f5313a;
                int i5 = this.f5314b;
                b5 = bArr[i5];
                b6 = bArr[i5 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f5313a;
                int i6 = this.f5314b;
                b5 = bArr2[i6 + 1];
                b6 = bArr2[i6];
            }
            b4 = (byte) ((char) ((b6 & 255) | (b5 << 8)));
        }
        long j6 = b4;
        char c6 = (char) j6;
        D1.b.k(((long) c6) == j6, "Out of range: %s", j6);
        return (c6 << 16) + i;
    }

    public final int f() {
        return this.f5313a[this.f5314b] & 255;
    }

    public final void g(byte[] bArr, int i, int i5) {
        System.arraycopy(this.f5313a, this.f5314b, bArr, i, i5);
        this.f5314b += i5;
    }

    public final char h(Charset charset, char[] cArr) {
        int iE = e(charset);
        if (iE != 0) {
            char c5 = (char) (iE >> 16);
            for (char c6 : cArr) {
                if (c6 == c5) {
                    this.f5314b += iE & 65535;
                    return c5;
                }
            }
        }
        return (char) 0;
    }

    public final int i() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        int i5 = i + 1;
        this.f5314b = i5;
        int i6 = (bArr[i] & 255) << 24;
        int i7 = i + 2;
        this.f5314b = i7;
        int i8 = ((bArr[i5] & 255) << 16) | i6;
        int i9 = i + 3;
        this.f5314b = i9;
        int i10 = i8 | ((bArr[i7] & 255) << 8);
        this.f5314b = i + 4;
        return (bArr[i9] & 255) | i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j(java.nio.charset.Charset r5) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0363p.j(java.nio.charset.Charset):java.lang.String");
    }

    public final int k() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        int i5 = i + 1;
        this.f5314b = i5;
        int i6 = bArr[i] & 255;
        int i7 = i + 2;
        this.f5314b = i7;
        int i8 = ((bArr[i5] & 255) << 8) | i6;
        int i9 = i + 3;
        this.f5314b = i9;
        int i10 = i8 | ((bArr[i7] & 255) << 16);
        this.f5314b = i + 4;
        return ((bArr[i9] & 255) << 24) | i10;
    }

    public final long l() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        int i5 = i + 1;
        this.f5314b = i5;
        long j5 = ((long) bArr[i]) & 255;
        int i6 = i + 2;
        this.f5314b = i6;
        long j6 = j5 | ((((long) bArr[i5]) & 255) << 8);
        int i7 = i + 3;
        this.f5314b = i7;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 4;
        this.f5314b = i8;
        long j8 = j7 | ((((long) bArr[i7]) & 255) << 24);
        int i9 = i + 5;
        this.f5314b = i9;
        long j9 = j8 | ((((long) bArr[i8]) & 255) << 32);
        int i10 = i + 6;
        this.f5314b = i10;
        long j10 = j9 | ((((long) bArr[i9]) & 255) << 40);
        int i11 = i + 7;
        this.f5314b = i11;
        long j11 = j10 | ((((long) bArr[i10]) & 255) << 48);
        this.f5314b = i + 8;
        return ((((long) bArr[i11]) & 255) << 56) | j11;
    }

    public final long m() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        int i5 = i + 1;
        this.f5314b = i5;
        long j5 = ((long) bArr[i]) & 255;
        int i6 = i + 2;
        this.f5314b = i6;
        long j6 = j5 | ((((long) bArr[i5]) & 255) << 8);
        int i7 = i + 3;
        this.f5314b = i7;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 16);
        this.f5314b = i + 4;
        return ((((long) bArr[i7]) & 255) << 24) | j7;
    }

    public final int n() {
        int iK = k();
        if (iK >= 0) {
            return iK;
        }
        throw new IllegalStateException(AbstractC0307a.i("Top bit not zero: ", iK));
    }

    public final int o() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        int i5 = i + 1;
        this.f5314b = i5;
        int i6 = bArr[i] & 255;
        this.f5314b = i + 2;
        return ((bArr[i5] & 255) << 8) | i6;
    }

    public final long p() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        int i5 = i + 1;
        this.f5314b = i5;
        long j5 = (((long) bArr[i]) & 255) << 56;
        int i6 = i + 2;
        this.f5314b = i6;
        long j6 = j5 | ((((long) bArr[i5]) & 255) << 48);
        int i7 = i + 3;
        this.f5314b = i7;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 4;
        this.f5314b = i8;
        long j8 = j7 | ((((long) bArr[i7]) & 255) << 32);
        int i9 = i + 5;
        this.f5314b = i9;
        long j9 = j8 | ((((long) bArr[i8]) & 255) << 24);
        int i10 = i + 6;
        this.f5314b = i10;
        long j10 = j9 | ((((long) bArr[i9]) & 255) << 16);
        int i11 = i + 7;
        this.f5314b = i11;
        long j11 = j10 | ((((long) bArr[i10]) & 255) << 8);
        this.f5314b = i + 8;
        return (((long) bArr[i11]) & 255) | j11;
    }

    public final String q() {
        if (a() == 0) {
            return null;
        }
        int i = this.f5314b;
        while (i < this.f5315c && this.f5313a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f5313a;
        int i5 = this.f5314b;
        int i6 = AbstractC0370w.f5326a;
        String str = new String(bArr, i5, i - i5, StandardCharsets.UTF_8);
        this.f5314b = i;
        if (i < this.f5315c) {
            this.f5314b = i + 1;
        }
        return str;
    }

    public final String r(int i) {
        if (i == 0) {
            return "";
        }
        int i5 = this.f5314b;
        int i6 = (i5 + i) - 1;
        int i7 = (i6 >= this.f5315c || this.f5313a[i6] != 0) ? i : i - 1;
        byte[] bArr = this.f5313a;
        int i8 = AbstractC0370w.f5326a;
        String str = new String(bArr, i5, i7, StandardCharsets.UTF_8);
        this.f5314b += i;
        return str;
    }

    public final short s() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        int i5 = i + 1;
        this.f5314b = i5;
        int i6 = (bArr[i] & 255) << 8;
        this.f5314b = i + 2;
        return (short) ((bArr[i5] & 255) | i6);
    }

    public final String t(int i, Charset charset) {
        String str = new String(this.f5313a, this.f5314b, i, charset);
        this.f5314b += i;
        return str;
    }

    public final int u() {
        return (v() << 21) | (v() << 14) | (v() << 7) | v();
    }

    public final int v() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        this.f5314b = i + 1;
        return bArr[i] & 255;
    }

    public final int w() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        int i5 = i + 1;
        this.f5314b = i5;
        int i6 = (bArr[i] & 255) << 8;
        this.f5314b = i + 2;
        int i7 = (bArr[i5] & 255) | i6;
        this.f5314b = i + 4;
        return i7;
    }

    public final long x() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        int i5 = i + 1;
        this.f5314b = i5;
        long j5 = (((long) bArr[i]) & 255) << 24;
        int i6 = i + 2;
        this.f5314b = i6;
        long j6 = j5 | ((((long) bArr[i5]) & 255) << 16);
        int i7 = i + 3;
        this.f5314b = i7;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 8);
        this.f5314b = i + 4;
        return (((long) bArr[i7]) & 255) | j7;
    }

    public final int y() {
        byte[] bArr = this.f5313a;
        int i = this.f5314b;
        int i5 = i + 1;
        this.f5314b = i5;
        int i6 = (bArr[i] & 255) << 16;
        int i7 = i + 2;
        this.f5314b = i7;
        int i8 = ((bArr[i5] & 255) << 8) | i6;
        this.f5314b = i + 3;
        return (bArr[i7] & 255) | i8;
    }

    public final int z() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(AbstractC0307a.i("Top bit not zero: ", i));
    }

    public C0363p(int i) {
        this.f5313a = new byte[i];
        this.f5315c = i;
    }

    public C0363p(byte[] bArr) {
        this.f5313a = bArr;
        this.f5315c = bArr.length;
    }

    public C0363p(int i, byte[] bArr) {
        this.f5313a = bArr;
        this.f5315c = i;
    }
}
