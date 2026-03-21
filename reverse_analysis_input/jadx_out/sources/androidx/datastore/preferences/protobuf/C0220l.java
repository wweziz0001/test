package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0220l extends Z1.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f4176v = Logger.getLogger(C0220l.class.getName());

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f4177w = i0.f4165d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public E f4178q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f4179r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4180s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4181t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final OutputStream f4182u;

    public C0220l(OutputStream outputStream, int i) {
        super(13);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f4179r = new byte[iMax];
        this.f4180s = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f4182u = outputStream;
    }

    public static int X(int i) {
        return n0(i) + 1;
    }

    public static int Y(int i, C0215g c0215g) {
        int iN0 = n0(i);
        int size = c0215g.size();
        return p0(size) + size + iN0;
    }

    public static int Z(int i) {
        return n0(i) + 8;
    }

    public static int a0(int i, int i5) {
        return r0(i5) + n0(i);
    }

    public static int b0(int i) {
        return n0(i) + 4;
    }

    public static int c0(int i) {
        return n0(i) + 8;
    }

    public static int d0(int i) {
        return n0(i) + 4;
    }

    public static int e0(int i, AbstractC0209a abstractC0209a, V v4) {
        return abstractC0209a.a(v4) + (n0(i) * 2);
    }

    public static int f0(int i, int i5) {
        return r0(i5) + n0(i);
    }

    public static int g0(long j5, int i) {
        return r0(j5) + n0(i);
    }

    public static int h0(int i) {
        return n0(i) + 4;
    }

    public static int i0(int i) {
        return n0(i) + 8;
    }

    public static int j0(int i, int i5) {
        return p0((i5 >> 31) ^ (i5 << 1)) + n0(i);
    }

    public static int k0(long j5, int i) {
        return r0((j5 >> 63) ^ (j5 << 1)) + n0(i);
    }

    public static int l0(String str, int i) {
        return m0(str) + n0(i);
    }

    public static int m0(String str) {
        int length;
        try {
            length = l0.a(str);
        } catch (k0 unused) {
            length = str.getBytes(AbstractC0231x.f4217a).length;
        }
        return p0(length) + length;
    }

    public static int n0(int i) {
        return p0(i << 3);
    }

    public static int o0(int i, int i5) {
        return p0(i5) + n0(i);
    }

    public static int p0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int q0(long j5, int i) {
        return r0(j5) + n0(i);
    }

    public static int r0(long j5) {
        return (640 - (Long.numberOfLeadingZeros(j5) * 9)) >>> 6;
    }

    public final void A0(int i) throws IOException {
        t0(4);
        S(i);
    }

    public final void B0(long j5, int i) {
        t0(18);
        U(i, 1);
        T(j5);
    }

    public final void C0(long j5) throws IOException {
        t0(8);
        T(j5);
    }

    public final void D0(int i, int i5) {
        t0(20);
        U(i, 0);
        if (i5 >= 0) {
            V(i5);
        } else {
            W(i5);
        }
    }

    public final void E0(int i) throws IOException {
        if (i >= 0) {
            J0(i);
        } else {
            L0(i);
        }
    }

    public final void F0(String str, int i) throws IOException {
        H0(i, 2);
        G0(str);
    }

    public final void G0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iP0 = p0(length);
            int i = iP0 + length;
            int i5 = this.f4180s;
            if (i > i5) {
                byte[] bArr = new byte[length];
                int iV = l0.f4183a.v(str, bArr, 0, length);
                J0(iV);
                v0(bArr, 0, iV);
                return;
            }
            if (i > i5 - this.f4181t) {
                s0();
            }
            int iP02 = p0(str.length());
            int i6 = this.f4181t;
            byte[] bArr2 = this.f4179r;
            try {
                if (iP02 == iP0) {
                    int i7 = i6 + iP02;
                    this.f4181t = i7;
                    int iV2 = l0.f4183a.v(str, bArr2, i7, i5 - i7);
                    this.f4181t = i6;
                    V((iV2 - i6) - iP02);
                    this.f4181t = iV2;
                } else {
                    int iA = l0.a(str);
                    V(iA);
                    this.f4181t = l0.f4183a.v(str, bArr2, this.f4181t, iA);
                }
            } catch (k0 e5) {
                this.f4181t = i6;
                throw e5;
            } catch (ArrayIndexOutOfBoundsException e6) {
                throw new K3.b(e6);
            }
        } catch (k0 e7) {
            f4176v.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
            byte[] bytes = str.getBytes(AbstractC0231x.f4217a);
            try {
                J0(bytes.length);
                R(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e8) {
                throw new K3.b(e8);
            }
        }
    }

    public final void H0(int i, int i5) {
        J0((i << 3) | i5);
    }

    public final void I0(int i, int i5) {
        t0(20);
        U(i, 0);
        V(i5);
    }

    public final void J0(int i) {
        t0(5);
        V(i);
    }

    public final void K0(long j5, int i) {
        t0(20);
        U(i, 0);
        W(j5);
    }

    public final void L0(long j5) throws IOException {
        t0(10);
        W(j5);
    }

    @Override // Z1.f
    public final void R(byte[] bArr, int i, int i5) throws IOException {
        v0(bArr, i, i5);
    }

    public final void S(int i) {
        int i5 = this.f4181t;
        int i6 = i5 + 1;
        this.f4181t = i6;
        byte[] bArr = this.f4179r;
        bArr[i5] = (byte) (i & 255);
        int i7 = i5 + 2;
        this.f4181t = i7;
        bArr[i6] = (byte) ((i >> 8) & 255);
        int i8 = i5 + 3;
        this.f4181t = i8;
        bArr[i7] = (byte) ((i >> 16) & 255);
        this.f4181t = i5 + 4;
        bArr[i8] = (byte) ((i >> 24) & 255);
    }

    public final void T(long j5) {
        int i = this.f4181t;
        int i5 = i + 1;
        this.f4181t = i5;
        byte[] bArr = this.f4179r;
        bArr[i] = (byte) (j5 & 255);
        int i6 = i + 2;
        this.f4181t = i6;
        bArr[i5] = (byte) ((j5 >> 8) & 255);
        int i7 = i + 3;
        this.f4181t = i7;
        bArr[i6] = (byte) ((j5 >> 16) & 255);
        int i8 = i + 4;
        this.f4181t = i8;
        bArr[i7] = (byte) (255 & (j5 >> 24));
        int i9 = i + 5;
        this.f4181t = i9;
        bArr[i8] = (byte) (((int) (j5 >> 32)) & 255);
        int i10 = i + 6;
        this.f4181t = i10;
        bArr[i9] = (byte) (((int) (j5 >> 40)) & 255);
        int i11 = i + 7;
        this.f4181t = i11;
        bArr[i10] = (byte) (((int) (j5 >> 48)) & 255);
        this.f4181t = i + 8;
        bArr[i11] = (byte) (((int) (j5 >> 56)) & 255);
    }

    public final void U(int i, int i5) {
        V((i << 3) | i5);
    }

    public final void V(int i) {
        boolean z4 = f4177w;
        byte[] bArr = this.f4179r;
        if (z4) {
            while ((i & (-128)) != 0) {
                int i5 = this.f4181t;
                this.f4181t = i5 + 1;
                i0.j(bArr, i5, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i6 = this.f4181t;
            this.f4181t = i6 + 1;
            i0.j(bArr, i6, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i7 = this.f4181t;
            this.f4181t = i7 + 1;
            bArr[i7] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i8 = this.f4181t;
        this.f4181t = i8 + 1;
        bArr[i8] = (byte) i;
    }

    public final void W(long j5) {
        boolean z4 = f4177w;
        byte[] bArr = this.f4179r;
        if (z4) {
            while ((j5 & (-128)) != 0) {
                int i = this.f4181t;
                this.f4181t = i + 1;
                i0.j(bArr, i, (byte) ((((int) j5) | 128) & 255));
                j5 >>>= 7;
            }
            int i5 = this.f4181t;
            this.f4181t = i5 + 1;
            i0.j(bArr, i5, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            int i6 = this.f4181t;
            this.f4181t = i6 + 1;
            bArr[i6] = (byte) ((((int) j5) | 128) & 255);
            j5 >>>= 7;
        }
        int i7 = this.f4181t;
        this.f4181t = i7 + 1;
        bArr[i7] = (byte) j5;
    }

    public final void s0() throws IOException {
        this.f4182u.write(this.f4179r, 0, this.f4181t);
        this.f4181t = 0;
    }

    public final void t0(int i) throws IOException {
        if (this.f4180s - this.f4181t < i) {
            s0();
        }
    }

    public final void u0(byte b4) throws IOException {
        if (this.f4181t == this.f4180s) {
            s0();
        }
        int i = this.f4181t;
        this.f4181t = i + 1;
        this.f4179r[i] = b4;
    }

    public final void v0(byte[] bArr, int i, int i5) throws IOException {
        int i6 = this.f4181t;
        int i7 = this.f4180s;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f4179r;
        if (i8 >= i5) {
            System.arraycopy(bArr, i, bArr2, i6, i5);
            this.f4181t += i5;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i6, i8);
        int i9 = i + i8;
        int i10 = i5 - i8;
        this.f4181t = i7;
        s0();
        if (i10 > i7) {
            this.f4182u.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f4181t = i10;
        }
    }

    public final void w0(int i, boolean z4) {
        t0(11);
        U(i, 0);
        byte b4 = z4 ? (byte) 1 : (byte) 0;
        int i5 = this.f4181t;
        this.f4181t = i5 + 1;
        this.f4179r[i5] = b4;
    }

    public final void x0(int i, C0215g c0215g) {
        H0(i, 2);
        y0(c0215g);
    }

    public final void y0(C0215g c0215g) {
        J0(c0215g.size());
        R(c0215g.f4147m, c0215g.j(), c0215g.size());
    }

    public final void z0(int i, int i5) {
        t0(14);
        U(i, 5);
        S(i5);
    }
}
