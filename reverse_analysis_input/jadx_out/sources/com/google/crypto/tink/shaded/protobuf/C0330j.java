package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0218j;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0330j extends AbstractC0218j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f5209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5214h;
    public int i = Integer.MAX_VALUE;

    public C0330j(byte[] bArr, int i, int i5, boolean z4) {
        this.f5209c = bArr;
        this.f5210d = i5 + i;
        this.f5212f = i;
        this.f5213g = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final String A() throws C {
        int iJ = J();
        if (iJ > 0) {
            int i = this.f5210d;
            int i5 = this.f5212f;
            if (iJ <= i - i5) {
                String str = new String(this.f5209c, i5, iJ, A.f5128a);
                this.f5212f += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw C.e();
        }
        throw C.g();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final String B() throws C {
        int iJ = J();
        if (iJ > 0) {
            int i = this.f5210d;
            int i5 = this.f5212f;
            if (iJ <= i - i5) {
                String strT = r0.f5248a.t(this.f5209c, i5, iJ);
                this.f5212f += iJ;
                return strT;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw C.e();
        }
        throw C.g();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int C() throws C {
        if (g()) {
            this.f5214h = 0;
            return 0;
        }
        int iJ = J();
        this.f5214h = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw C.a();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int D() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long E() {
        return K();
    }

    public final int H() throws C {
        int i = this.f5212f;
        if (this.f5210d - i < 4) {
            throw C.g();
        }
        this.f5212f = i + 4;
        byte[] bArr = this.f5209c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() throws C {
        int i = this.f5212f;
        if (this.f5210d - i < 8) {
            throw C.g();
        }
        this.f5212f = i + 8;
        byte[] bArr = this.f5209c;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int J() {
        int i;
        int i5 = this.f5212f;
        int i6 = this.f5210d;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f5209c;
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                this.f5212f = i7;
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
                this.f5212f = i8;
                return i;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j5;
        long j6;
        long j7;
        long j8;
        int i = this.f5212f;
        int i5 = this.f5210d;
        if (i5 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f5209c;
            byte b4 = bArr[i];
            if (b4 >= 0) {
                this.f5212f = i6;
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
                this.f5212f = i7;
                return j5;
            }
        }
        return L();
    }

    public final long L() throws C {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i5 = this.f5212f;
            if (i5 == this.f5210d) {
                throw C.g();
            }
            this.f5212f = i5 + 1;
            byte b4 = this.f5209c[i5];
            j5 |= ((long) (b4 & 127)) << i;
            if ((b4 & 128) == 0) {
                return j5;
            }
        }
        throw C.d();
    }

    public final void M() {
        int i = this.f5210d + this.f5211e;
        this.f5210d = i;
        int i5 = i - this.f5213g;
        int i6 = this.i;
        if (i5 <= i6) {
            this.f5211e = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f5211e = i7;
        this.f5210d = i - i7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final void b(int i) throws C {
        if (this.f5214h != i) {
            throw new C("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int f() {
        return this.f5212f - this.f5213g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final boolean g() {
        return this.f5212f == this.f5210d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final void j(int i) {
        this.i = i;
        M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int l(int i) {
        if (i < 0) {
            throw C.e();
        }
        int iF = f() + i;
        if (iF < 0) {
            throw C.f();
        }
        int i5 = this.i;
        if (iF > i5) {
            throw C.g();
        }
        this.i = iF;
        M();
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final boolean m() {
        return K() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.crypto.tink.shaded.protobuf.C0328h o() throws com.google.crypto.tink.shaded.protobuf.C {
        /*
            r4 = this;
            int r0 = r4.J()
            byte[] r1 = r4.f5209c
            if (r0 <= 0) goto L19
            int r2 = r4.f5210d
            int r3 = r4.f5212f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.AbstractC0329i.h(r1, r3, r0)
            int r2 = r4.f5212f
            int r2 = r2 + r0
            r4.f5212f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.AbstractC0329i.f5205m
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f5210d
            int r3 = r4.f5212f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f5212f = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = com.google.crypto.tink.shaded.protobuf.A.f5129b
        L35:
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.AbstractC0329i.f5205m
            com.google.crypto.tink.shaded.protobuf.h r1 = new com.google.crypto.tink.shaded.protobuf.h
            r1.<init>(r0)
            return r1
        L3d:
            com.google.crypto.tink.shaded.protobuf.C r0 = com.google.crypto.tink.shaded.protobuf.C.e()
            throw r0
        L42:
            com.google.crypto.tink.shaded.protobuf.C r0 = com.google.crypto.tink.shaded.protobuf.C.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C0330j.o():com.google.crypto.tink.shaded.protobuf.h");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final double p() {
        return Double.longBitsToDouble(I());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int q() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int r() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long s() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final float t() {
        return Float.intBitsToFloat(H());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int u() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long v() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int w() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long x() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int y() {
        return AbstractC0218j.d(J());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long z() {
        return AbstractC0218j.e(K());
    }
}
