package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0218j;
import b3.AbstractC0307a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0331k extends AbstractC0218j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteArrayInputStream f5216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f5217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5221h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5222j = Integer.MAX_VALUE;

    public C0331k(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = A.f5128a;
        this.f5216c = byteArrayInputStream;
        this.f5217d = new byte[4096];
        this.f5218e = 0;
        this.f5220g = 0;
        this.i = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final String A() throws C {
        int iM = M();
        byte[] bArr = this.f5217d;
        if (iM > 0) {
            int i = this.f5218e;
            int i5 = this.f5220g;
            if (iM <= i - i5) {
                String str = new String(bArr, i5, iM, A.f5128a);
                this.f5220g += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM > this.f5218e) {
            return new String(H(iM), A.f5128a);
        }
        Q(iM);
        String str2 = new String(bArr, this.f5220g, iM, A.f5128a);
        this.f5220g += iM;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final String B() throws IOException {
        int iM = M();
        int i = this.f5220g;
        int i5 = this.f5218e;
        int i6 = i5 - i;
        byte[] bArrH = this.f5217d;
        if (iM <= i6 && iM > 0) {
            this.f5220g = i + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            i = 0;
            if (iM <= i5) {
                Q(iM);
                this.f5220g = iM;
            } else {
                bArrH = H(iM);
            }
        }
        return r0.f5248a.t(bArrH, i, iM);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int C() throws C {
        if (g()) {
            this.f5221h = 0;
            return 0;
        }
        int iM = M();
        this.f5221h = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw C.a();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int D() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long E() {
        return N();
    }

    public final byte[] H(int i) throws IOException {
        byte[] bArrI = I(i);
        if (bArrI != null) {
            return bArrI;
        }
        int i5 = this.f5220g;
        int i6 = this.f5218e;
        int length = i6 - i5;
        this.i += i6;
        this.f5220g = 0;
        this.f5218e = 0;
        ArrayList<byte[]> arrayListJ = J(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f5217d, i5, bArr, 0, length);
        for (byte[] bArr2 : arrayListJ) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] I(int i) throws IOException {
        if (i == 0) {
            return A.f5129b;
        }
        if (i < 0) {
            throw C.e();
        }
        int i5 = this.i;
        int i6 = this.f5220g;
        int i7 = i5 + i6 + i;
        if (i7 - Integer.MAX_VALUE > 0) {
            throw new C("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.f5222j;
        if (i7 > i8) {
            R((i8 - i5) - i6);
            throw C.g();
        }
        int i9 = this.f5218e - i6;
        int i10 = i - i9;
        ByteArrayInputStream byteArrayInputStream = this.f5216c;
        if (i10 >= 4096) {
            try {
                if (i10 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (C e5) {
                e5.f5130l = true;
                throw e5;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f5217d, this.f5220g, bArr, 0, i9);
        this.i += this.f5218e;
        this.f5220g = 0;
        this.f5218e = 0;
        while (i9 < i) {
            try {
                int i11 = byteArrayInputStream.read(bArr, i9, i - i9);
                if (i11 == -1) {
                    throw C.g();
                }
                this.i += i11;
                i9 += i11;
            } catch (C e6) {
                e6.f5130l = true;
                throw e6;
            }
        }
        return bArr;
    }

    public final ArrayList J(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i5 = 0;
            while (i5 < iMin) {
                int i6 = this.f5216c.read(bArr, i5, iMin - i5);
                if (i6 == -1) {
                    throw C.g();
                }
                this.i += i6;
                i5 += i6;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() throws C {
        int i = this.f5220g;
        if (this.f5218e - i < 4) {
            Q(4);
            i = this.f5220g;
        }
        this.f5220g = i + 4;
        byte[] bArr = this.f5217d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long L() throws C {
        int i = this.f5220g;
        if (this.f5218e - i < 8) {
            Q(8);
            i = this.f5220g;
        }
        this.f5220g = i + 8;
        byte[] bArr = this.f5217d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int M() {
        int i;
        int i5 = this.f5220g;
        int i6 = this.f5218e;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f5217d;
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                this.f5220g = i7;
                return b4;
            }
            if (i6 - i7 >= 9) {
                int i8 = i5 + 2;
                int i9 = (bArr[i7] << 7) ^ b4;
                if (i9 < 0) {
                    i = i9 ^ (-128);
                } else {
                    int i10 = i5 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i = i11 ^ 16256;
                    } else {
                        int i12 = i5 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i = (-2080896) ^ i13;
                        } else {
                            i10 = i5 + 5;
                            byte b5 = bArr[i12];
                            int i14 = (i13 ^ (b5 << 28)) ^ 266354560;
                            if (b5 < 0) {
                                i12 = i5 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i5 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i5 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i5 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i5 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i14;
                            }
                            i = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.f5220g = i8;
                return i;
            }
        }
        return (int) O();
    }

    public final long N() {
        long j5;
        long j6;
        long j7;
        long j8;
        int i = this.f5220g;
        int i5 = this.f5218e;
        if (i5 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f5217d;
            byte b4 = bArr[i];
            if (b4 >= 0) {
                this.f5220g = i6;
                return b4;
            }
            if (i5 - i6 >= 9) {
                int i7 = i + 2;
                int i8 = (bArr[i6] << 7) ^ b4;
                if (i8 < 0) {
                    j5 = i8 ^ (-128);
                } else {
                    int i9 = i + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j5 = i10 ^ 16256;
                        i7 = i9;
                    } else {
                        int i11 = i + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            j8 = (-2080896) ^ i12;
                        } else {
                            long j9 = i12;
                            i7 = i + 5;
                            long j10 = j9 ^ (((long) bArr[i11]) << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                i11 = i + 6;
                                long j11 = j10 ^ (((long) bArr[i7]) << 35);
                                if (j11 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i7 = i + 7;
                                    j10 = j11 ^ (((long) bArr[i11]) << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i11 = i + 8;
                                        j11 = j10 ^ (((long) bArr[i7]) << 49);
                                        if (j11 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i7 = i + 9;
                                            long j12 = (j11 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                int i13 = i + 10;
                                                if (bArr[i7] >= 0) {
                                                    i7 = i13;
                                                }
                                            }
                                            j5 = j12;
                                        }
                                    }
                                }
                                j8 = j6 ^ j11;
                            }
                            j5 = j7 ^ j10;
                        }
                        i7 = i11;
                        j5 = j8;
                    }
                }
                this.f5220g = i7;
                return j5;
            }
        }
        return O();
    }

    public final long O() throws C {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f5220g == this.f5218e) {
                Q(1);
            }
            int i5 = this.f5220g;
            this.f5220g = i5 + 1;
            byte b4 = this.f5217d[i5];
            j5 |= ((long) (b4 & 127)) << i;
            if ((b4 & 128) == 0) {
                return j5;
            }
        }
        throw C.d();
    }

    public final void P() {
        int i = this.f5218e + this.f5219f;
        this.f5218e = i;
        int i5 = this.i + i;
        int i6 = this.f5222j;
        if (i5 <= i6) {
            this.f5219f = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f5219f = i7;
        this.f5218e = i - i7;
    }

    public final void Q(int i) throws C {
        if (S(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.f5220g) {
            throw C.g();
        }
        throw new C("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void R(int i) throws C {
        int i5 = this.f5218e;
        int i6 = this.f5220g;
        int i7 = i5 - i6;
        if (i <= i7 && i >= 0) {
            this.f5220g = i6 + i;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f5216c;
        if (i < 0) {
            throw C.e();
        }
        int i8 = this.i;
        int i9 = i8 + i6;
        int i10 = i9 + i;
        int i11 = this.f5222j;
        if (i10 > i11) {
            R((i11 - i8) - i6);
            throw C.g();
        }
        this.i = i9;
        this.f5218e = 0;
        this.f5220g = 0;
        while (i7 < i) {
            long j5 = i - i7;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j5);
                    if (jSkip < 0 || jSkip > j5) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i7 += (int) jSkip;
                    }
                } catch (C e5) {
                    e5.f5130l = true;
                    throw e5;
                }
            } catch (Throwable th) {
                this.i += i7;
                P();
                throw th;
            }
        }
        this.i += i7;
        P();
        if (i7 >= i) {
            return;
        }
        int i12 = this.f5218e;
        int i13 = i12 - this.f5220g;
        this.f5220g = i12;
        Q(1);
        while (true) {
            int i14 = i - i13;
            int i15 = this.f5218e;
            if (i14 <= i15) {
                this.f5220g = i14;
                return;
            } else {
                i13 += i15;
                this.f5220g = i15;
                Q(1);
            }
        }
    }

    public final boolean S(int i) throws IOException {
        int i5 = this.f5220g;
        int i6 = i5 + i;
        int i7 = this.f5218e;
        if (i6 <= i7) {
            throw new IllegalStateException(AbstractC0307a.h(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i8 = this.i;
        if (i > (Integer.MAX_VALUE - i8) - i5 || i8 + i5 + i > this.f5222j) {
            return false;
        }
        byte[] bArr = this.f5217d;
        if (i5 > 0) {
            if (i7 > i5) {
                System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
            }
            this.i += i5;
            this.f5218e -= i5;
            this.f5220g = 0;
        }
        int i9 = this.f5218e;
        int iMin = Math.min(bArr.length - i9, (Integer.MAX_VALUE - this.i) - i9);
        ByteArrayInputStream byteArrayInputStream = this.f5216c;
        try {
            int i10 = byteArrayInputStream.read(bArr, i9, iMin);
            if (i10 == 0 || i10 < -1 || i10 > bArr.length) {
                throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i10 + "\nThe InputStream implementation is buggy.");
            }
            if (i10 <= 0) {
                return false;
            }
            this.f5218e += i10;
            P();
            if (this.f5218e >= i) {
                return true;
            }
            return S(i);
        } catch (C e5) {
            e5.f5130l = true;
            throw e5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final void b(int i) throws C {
        if (this.f5221h != i) {
            throw new C("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int f() {
        return this.i + this.f5220g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final boolean g() {
        return this.f5220g == this.f5218e && !S(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final void j(int i) {
        this.f5222j = i;
        P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int l(int i) throws C {
        if (i < 0) {
            throw C.e();
        }
        int i5 = this.i + this.f5220g + i;
        int i6 = this.f5222j;
        if (i5 > i6) {
            throw C.g();
        }
        this.f5222j = i5;
        P();
        return i6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final boolean m() {
        return N() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final C0328h o() throws IOException {
        int iM = M();
        int i = this.f5218e;
        int i5 = this.f5220g;
        int i6 = i - i5;
        byte[] bArr = this.f5217d;
        if (iM <= i6 && iM > 0) {
            C0328h c0328hH = AbstractC0329i.h(bArr, i5, iM);
            this.f5220g += iM;
            return c0328hH;
        }
        if (iM == 0) {
            return AbstractC0329i.f5205m;
        }
        byte[] bArrI = I(iM);
        if (bArrI != null) {
            return AbstractC0329i.h(bArrI, 0, bArrI.length);
        }
        int i7 = this.f5220g;
        int i8 = this.f5218e;
        int length = i8 - i7;
        this.i += i8;
        this.f5220g = 0;
        this.f5218e = 0;
        ArrayList<byte[]> arrayListJ = J(iM - length);
        byte[] bArr2 = new byte[iM];
        System.arraycopy(bArr, i7, bArr2, 0, length);
        for (byte[] bArr3 : arrayListJ) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0328h c0328h = AbstractC0329i.f5205m;
        return new C0328h(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final double p() {
        return Double.longBitsToDouble(L());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int q() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int r() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long s() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final float t() {
        return Float.intBitsToFloat(K());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int u() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long v() {
        return N();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int w() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long x() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int y() {
        return AbstractC0218j.d(M());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long z() {
        return AbstractC0218j.e(N());
    }
}
