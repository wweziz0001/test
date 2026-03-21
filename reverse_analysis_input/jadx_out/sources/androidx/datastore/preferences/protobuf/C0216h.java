package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0216h extends AbstractC0218j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4153h;
    public int i = Integer.MAX_VALUE;

    public C0216h(byte[] bArr, int i, int i5, boolean z4) {
        this.f4148c = bArr;
        this.f4149d = i5 + i;
        this.f4151f = i;
        this.f4152g = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final String A() throws C0233z {
        int iJ = J();
        if (iJ > 0) {
            int i = this.f4149d;
            int i5 = this.f4151f;
            if (iJ <= i - i5) {
                String str = new String(this.f4148c, i5, iJ, AbstractC0231x.f4217a);
                this.f4151f += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw C0233z.d();
        }
        throw C0233z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final String B() throws C0233z {
        int iJ = J();
        if (iJ > 0) {
            int i = this.f4149d;
            int i5 = this.f4151f;
            if (iJ <= i - i5) {
                String strT = l0.f4183a.t(this.f4148c, i5, iJ);
                this.f4151f += iJ;
                return strT;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw C0233z.d();
        }
        throw C0233z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int C() throws C0233z {
        if (g()) {
            this.f4153h = 0;
            return 0;
        }
        int iJ = J();
        this.f4153h = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new C0233z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int D() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long E() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final boolean F(int i) throws C0233z {
        int i5 = i & 7;
        int i6 = 0;
        if (i5 != 0) {
            if (i5 == 1) {
                N(8);
                return true;
            }
            if (i5 == 2) {
                N(J());
                return true;
            }
            if (i5 == 3) {
                G();
                b(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw C0233z.b();
            }
            N(4);
            return true;
        }
        int i7 = this.f4149d - this.f4151f;
        byte[] bArr = this.f4148c;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f4151f;
                this.f4151f = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw C0233z.c();
        }
        while (i6 < 10) {
            int i9 = this.f4151f;
            if (i9 == this.f4149d) {
                throw C0233z.e();
            }
            this.f4151f = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw C0233z.c();
        return true;
    }

    public final int H() throws C0233z {
        int i = this.f4151f;
        if (this.f4149d - i < 4) {
            throw C0233z.e();
        }
        this.f4151f = i + 4;
        byte[] bArr = this.f4148c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() throws C0233z {
        int i = this.f4151f;
        if (this.f4149d - i < 8) {
            throw C0233z.e();
        }
        this.f4151f = i + 8;
        byte[] bArr = this.f4148c;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int J() {
        int i;
        int i5 = this.f4151f;
        int i6 = this.f4149d;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f4148c;
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                this.f4151f = i7;
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
                this.f4151f = i8;
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
        int i = this.f4151f;
        int i5 = this.f4149d;
        if (i5 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f4148c;
            byte b4 = bArr[i];
            if (b4 >= 0) {
                this.f4151f = i6;
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
                this.f4151f = i7;
                return j5;
            }
        }
        return L();
    }

    public final long L() throws C0233z {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i5 = this.f4151f;
            if (i5 == this.f4149d) {
                throw C0233z.e();
            }
            this.f4151f = i5 + 1;
            byte b4 = this.f4148c[i5];
            j5 |= ((long) (b4 & 127)) << i;
            if ((b4 & 128) == 0) {
                return j5;
            }
        }
        throw C0233z.c();
    }

    public final void M() {
        int i = this.f4149d + this.f4150e;
        this.f4149d = i;
        int i5 = i - this.f4152g;
        int i6 = this.i;
        if (i5 <= i6) {
            this.f4150e = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f4150e = i7;
        this.f4149d = i - i7;
    }

    public final void N(int i) throws C0233z {
        if (i >= 0) {
            int i5 = this.f4149d;
            int i6 = this.f4151f;
            if (i <= i5 - i6) {
                this.f4151f = i6 + i;
                return;
            }
        }
        if (i >= 0) {
            throw C0233z.e();
        }
        throw C0233z.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final void b(int i) throws C0233z {
        if (this.f4153h != i) {
            throw new C0233z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int f() {
        return this.f4151f - this.f4152g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final boolean g() {
        return this.f4151f == this.f4149d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final void j(int i) {
        this.i = i;
        M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final int l(int i) throws C0233z {
        if (i < 0) {
            throw C0233z.d();
        }
        int iF = f() + i;
        if (iF < 0) {
            throw new C0233z("Failed to parse the message.");
        }
        int i5 = this.i;
        if (iF > i5) {
            throw C0233z.e();
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
    public final androidx.datastore.preferences.protobuf.C0215g n() throws androidx.datastore.preferences.protobuf.C0233z {
        /*
            r4 = this;
            int r0 = r4.J()
            byte[] r1 = r4.f4148c
            if (r0 <= 0) goto L19
            int r2 = r4.f4149d
            int r3 = r4.f4151f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.C0215g.h(r1, r3, r0)
            int r2 = r4.f4151f
            int r2 = r2 + r0
            r4.f4151f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            androidx.datastore.preferences.protobuf.g r0 = androidx.datastore.preferences.protobuf.C0215g.f4144n
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f4149d
            int r3 = r4.f4151f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f4151f = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = androidx.datastore.preferences.protobuf.AbstractC0231x.f4218b
        L35:
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.C0215g.f4144n
            androidx.datastore.preferences.protobuf.g r1 = new androidx.datastore.preferences.protobuf.g
            r1.<init>(r0)
            return r1
        L3d:
            androidx.datastore.preferences.protobuf.z r0 = androidx.datastore.preferences.protobuf.C0233z.d()
            throw r0
        L42:
            androidx.datastore.preferences.protobuf.z r0 = androidx.datastore.preferences.protobuf.C0233z.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0216h.n():androidx.datastore.preferences.protobuf.g");
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
        int iJ = J();
        return (-(iJ & 1)) ^ (iJ >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218j
    public final long z() {
        long jK = K();
        return (-(jK & 1)) ^ (jK >>> 1);
    }
}
