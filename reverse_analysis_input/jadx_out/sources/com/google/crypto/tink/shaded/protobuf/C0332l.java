package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0332l extends Z1.f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Logger f5223u = Logger.getLogger(C0332l.class.getName());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f5224v = o0.f5237d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public L f5225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f5226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f5227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5228t;

    public C0332l(int i, byte[] bArr) {
        super(16);
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f5226r = bArr;
        this.f5228t = 0;
        this.f5227s = i;
    }

    public static int S(int i) {
        return k0(i) + 1;
    }

    public static int T(int i, AbstractC0329i abstractC0329i) {
        return U(abstractC0329i) + k0(i);
    }

    public static int U(AbstractC0329i abstractC0329i) {
        int size = abstractC0329i.size();
        return m0(size) + size;
    }

    public static int V(int i) {
        return k0(i) + 8;
    }

    public static int W(int i, int i5) {
        return c0(i5) + k0(i);
    }

    public static int X(int i) {
        return k0(i) + 4;
    }

    public static int Y(int i) {
        return k0(i) + 8;
    }

    public static int Z(int i) {
        return k0(i) + 4;
    }

    public static int a0(int i, AbstractC0321a abstractC0321a, c0 c0Var) {
        return abstractC0321a.b(c0Var) + (k0(i) * 2);
    }

    public static int b0(int i, int i5) {
        return c0(i5) + k0(i);
    }

    public static int c0(int i) {
        if (i >= 0) {
            return m0(i);
        }
        return 10;
    }

    public static int d0(long j5, int i) {
        return o0(j5) + k0(i);
    }

    public static int e0(int i) {
        return k0(i) + 4;
    }

    public static int f0(int i) {
        return k0(i) + 8;
    }

    public static int g0(int i, int i5) {
        return m0((i5 >> 31) ^ (i5 << 1)) + k0(i);
    }

    public static int h0(long j5, int i) {
        return o0((j5 >> 63) ^ (j5 << 1)) + k0(i);
    }

    public static int i0(String str, int i) {
        return j0(str) + k0(i);
    }

    public static int j0(String str) {
        int length;
        try {
            length = r0.b(str);
        } catch (q0 unused) {
            length = str.getBytes(A.f5128a).length;
        }
        return m0(length) + length;
    }

    public static int k0(int i) {
        return m0(i << 3);
    }

    public static int l0(int i, int i5) {
        return m0(i5) + k0(i);
    }

    public static int m0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int n0(long j5, int i) {
        return o0(j5) + k0(i);
    }

    public static int o0(long j5) {
        int i;
        if (((-128) & j5) == 0) {
            return 1;
        }
        if (j5 < 0) {
            return 10;
        }
        if (((-34359738368L) & j5) != 0) {
            j5 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j5) != 0) {
            i += 2;
            j5 >>>= 14;
        }
        return (j5 & (-16384)) != 0 ? i + 1 : i;
    }

    public final void A0(long j5) throws K3.b {
        byte[] bArr = this.f5226r;
        boolean z4 = f5224v;
        int i = this.f5227s;
        if (z4 && i - this.f5228t >= 10) {
            while ((j5 & (-128)) != 0) {
                int i5 = this.f5228t;
                this.f5228t = i5 + 1;
                o0.o(bArr, i5, (byte) ((((int) j5) & 127) | 128));
                j5 >>>= 7;
            }
            int i6 = this.f5228t;
            this.f5228t = i6 + 1;
            o0.o(bArr, i6, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            try {
                int i7 = this.f5228t;
                this.f5228t = i7 + 1;
                bArr[i7] = (byte) ((((int) j5) & 127) | 128);
                j5 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new K3.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5228t), Integer.valueOf(i), 1), e5);
            }
        }
        int i8 = this.f5228t;
        this.f5228t = i8 + 1;
        bArr[i8] = (byte) j5;
    }

    public final void p0(byte b4) throws K3.b {
        try {
            byte[] bArr = this.f5226r;
            int i = this.f5228t;
            this.f5228t = i + 1;
            bArr[i] = b4;
        } catch (IndexOutOfBoundsException e5) {
            throw new K3.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5228t), Integer.valueOf(this.f5227s), 1), e5);
        }
    }

    public final void q0(byte[] bArr, int i, int i5) throws K3.b {
        try {
            System.arraycopy(bArr, i, this.f5226r, this.f5228t, i5);
            this.f5228t += i5;
        } catch (IndexOutOfBoundsException e5) {
            throw new K3.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5228t), Integer.valueOf(this.f5227s), Integer.valueOf(i5)), e5);
        }
    }

    public final void r0(AbstractC0329i abstractC0329i) throws K3.b {
        y0(abstractC0329i.size());
        C0328h c0328h = (C0328h) abstractC0329i;
        q0(c0328h.f5203o, c0328h.k(), c0328h.size());
    }

    public final void s0(int i, int i5) throws K3.b {
        x0(i, 5);
        t0(i5);
    }

    public final void t0(int i) throws K3.b {
        try {
            byte[] bArr = this.f5226r;
            int i5 = this.f5228t;
            int i6 = i5 + 1;
            this.f5228t = i6;
            bArr[i5] = (byte) (i & 255);
            int i7 = i5 + 2;
            this.f5228t = i7;
            bArr[i6] = (byte) ((i >> 8) & 255);
            int i8 = i5 + 3;
            this.f5228t = i8;
            bArr[i7] = (byte) ((i >> 16) & 255);
            this.f5228t = i5 + 4;
            bArr[i8] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new K3.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5228t), Integer.valueOf(this.f5227s), 1), e5);
        }
    }

    public final void u0(long j5, int i) throws K3.b {
        x0(i, 1);
        v0(j5);
    }

    public final void v0(long j5) throws K3.b {
        try {
            byte[] bArr = this.f5226r;
            int i = this.f5228t;
            int i5 = i + 1;
            this.f5228t = i5;
            bArr[i] = (byte) (((int) j5) & 255);
            int i6 = i + 2;
            this.f5228t = i6;
            bArr[i5] = (byte) (((int) (j5 >> 8)) & 255);
            int i7 = i + 3;
            this.f5228t = i7;
            bArr[i6] = (byte) (((int) (j5 >> 16)) & 255);
            int i8 = i + 4;
            this.f5228t = i8;
            bArr[i7] = (byte) (((int) (j5 >> 24)) & 255);
            int i9 = i + 5;
            this.f5228t = i9;
            bArr[i8] = (byte) (((int) (j5 >> 32)) & 255);
            int i10 = i + 6;
            this.f5228t = i10;
            bArr[i9] = (byte) (((int) (j5 >> 40)) & 255);
            int i11 = i + 7;
            this.f5228t = i11;
            bArr[i10] = (byte) (((int) (j5 >> 48)) & 255);
            this.f5228t = i + 8;
            bArr[i11] = (byte) (((int) (j5 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new K3.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5228t), Integer.valueOf(this.f5227s), 1), e5);
        }
    }

    public final void w0(int i) throws K3.b {
        if (i >= 0) {
            y0(i);
        } else {
            A0(i);
        }
    }

    public final void x0(int i, int i5) throws K3.b {
        y0((i << 3) | i5);
    }

    public final void y0(int i) throws K3.b {
        while (true) {
            int i5 = i & (-128);
            byte[] bArr = this.f5226r;
            if (i5 == 0) {
                int i6 = this.f5228t;
                this.f5228t = i6 + 1;
                bArr[i6] = (byte) i;
                return;
            } else {
                try {
                    int i7 = this.f5228t;
                    this.f5228t = i7 + 1;
                    bArr[i7] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e5) {
                    throw new K3.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5228t), Integer.valueOf(this.f5227s), 1), e5);
                }
            }
            throw new K3.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5228t), Integer.valueOf(this.f5227s), 1), e5);
        }
    }

    public final void z0(long j5, int i) throws K3.b {
        x0(i, 0);
        A0(j5);
    }
}
