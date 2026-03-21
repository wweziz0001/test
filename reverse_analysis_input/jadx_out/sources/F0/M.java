package F0;

import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f714e;

    public M() {
        this.f710a = 1;
        this.f711b = AbstractC0370w.f5331f;
    }

    public void a() {
        int i;
        int i5;
        switch (this.f710a) {
            case 1:
                int i6 = this.f712c;
                AbstractC0360m.h(i6 >= 0 && (i6 < (i = this.f714e) || (i6 == i && this.f713d == 0)));
                break;
            default:
                int i7 = this.f713d;
                AbstractC0360m.h(i7 >= 0 && (i7 < (i5 = this.f712c) || (i7 == i5 && this.f714e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f714e - this.f712c) * 8) - this.f713d;
    }

    public void c() {
        switch (this.f710a) {
            case 1:
                if (this.f713d != 0) {
                    this.f713d = 0;
                    this.f712c++;
                    a();
                    break;
                }
                break;
            default:
                int i = this.f714e;
                if (i > 0) {
                    u(8 - i);
                }
                break;
        }
    }

    public boolean d(int i) {
        int i5 = this.f713d;
        int i6 = i / 8;
        int i7 = i5 + i6;
        int i8 = (this.f714e + i) - (i6 * 8);
        if (i8 > 7) {
            i7++;
            i8 -= 8;
        }
        while (true) {
            i5++;
            if (i5 > i7 || i7 >= this.f712c) {
                break;
            }
            if (s(i5)) {
                i7++;
                i5 += 2;
            }
        }
        int i9 = this.f712c;
        if (i7 >= i9) {
            return i7 == i9 && i8 == 0;
        }
        return true;
    }

    public boolean e() {
        int i = this.f713d;
        int i5 = this.f714e;
        int i6 = 0;
        while (this.f713d < this.f712c && !h()) {
            i6++;
        }
        boolean z4 = this.f713d == this.f712c;
        this.f713d = i;
        this.f714e = i5;
        return !z4 && d((i6 * 2) + 1);
    }

    public int f() {
        AbstractC0360m.h(this.f713d == 0);
        return this.f712c;
    }

    public int g() {
        return (this.f712c * 8) + this.f713d;
    }

    public boolean h() {
        switch (this.f710a) {
            case 0:
                boolean z4 = (((this.f711b[this.f713d] & 255) >> this.f714e) & 1) == 1;
                u(1);
                return z4;
            case 1:
                boolean z5 = (this.f711b[this.f712c] & (128 >> this.f713d)) != 0;
                t();
                return z5;
            default:
                boolean z6 = (this.f711b[this.f713d] & (128 >> this.f714e)) != 0;
                t();
                return z6;
        }
    }

    public int i(int i) {
        switch (this.f710a) {
            case 0:
                int i5 = this.f713d;
                int iMin = Math.min(i, 8 - this.f714e);
                int i6 = i5 + 1;
                byte[] bArr = this.f711b;
                int i7 = ((bArr[i5] & 255) >> this.f714e) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i7 |= (bArr[i6] & 255) << iMin;
                    iMin += 8;
                    i6++;
                }
                int i8 = i7 & ((-1) >>> (32 - i));
                u(i);
                return i8;
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.f713d += i;
                int i9 = 0;
                while (true) {
                    int i10 = this.f713d;
                    if (i10 <= 8) {
                        byte[] bArr2 = this.f711b;
                        int i11 = this.f712c;
                        int i12 = ((-1) >>> (32 - i)) & (i9 | ((bArr2[i11] & 255) >> (8 - i10)));
                        if (i10 == 8) {
                            this.f713d = 0;
                            this.f712c = i11 + 1;
                        }
                        a();
                        return i12;
                    }
                    int i13 = i10 - 8;
                    this.f713d = i13;
                    byte[] bArr3 = this.f711b;
                    int i14 = this.f712c;
                    this.f712c = i14 + 1;
                    i9 |= (bArr3[i14] & 255) << i13;
                }
                break;
            default:
                this.f714e += i;
                int i15 = 0;
                while (true) {
                    int i16 = this.f714e;
                    if (i16 <= 8) {
                        byte[] bArr4 = this.f711b;
                        int i17 = this.f713d;
                        int i18 = ((-1) >>> (32 - i)) & (i15 | ((bArr4[i17] & 255) >> (8 - i16)));
                        if (i16 == 8) {
                            this.f714e = 0;
                            this.f713d = i17 + (s(i17 + 1) ? 2 : 1);
                        }
                        a();
                        return i18;
                    }
                    int i19 = i16 - 8;
                    this.f714e = i19;
                    byte[] bArr5 = this.f711b;
                    int i20 = this.f713d;
                    i15 |= (bArr5[i20] & 255) << i19;
                    if (!s(i20 + 1)) {
                        i = 1;
                    }
                    this.f713d = i20 + i;
                }
                break;
        }
    }

    public void j(int i, byte[] bArr) {
        int i5 = i >> 3;
        for (int i6 = 0; i6 < i5; i6++) {
            byte[] bArr2 = this.f711b;
            int i7 = this.f712c;
            int i8 = i7 + 1;
            this.f712c = i8;
            byte b4 = bArr2[i7];
            int i9 = this.f713d;
            byte b5 = (byte) (b4 << i9);
            bArr[i6] = b5;
            bArr[i6] = (byte) (((255 & bArr2[i8]) >> (8 - i9)) | b5);
        }
        int i10 = i & 7;
        if (i10 == 0) {
            return;
        }
        byte b6 = (byte) (bArr[i5] & (255 >> i10));
        bArr[i5] = b6;
        int i11 = this.f713d;
        if (i11 + i10 > 8) {
            byte[] bArr3 = this.f711b;
            int i12 = this.f712c;
            this.f712c = i12 + 1;
            bArr[i5] = (byte) (b6 | ((bArr3[i12] & 255) << i11));
            this.f713d = i11 - 8;
        }
        int i13 = this.f713d + i10;
        this.f713d = i13;
        byte[] bArr4 = this.f711b;
        int i14 = this.f712c;
        bArr[i5] = (byte) (((byte) (((255 & bArr4[i14]) >> (8 - i13)) << (8 - i10))) | bArr[i5]);
        if (i13 == 8) {
            this.f713d = 0;
            this.f712c = i14 + 1;
        }
        a();
    }

    public long k(int i) {
        if (i <= 32) {
            int i5 = i(i);
            int i6 = AbstractC0370w.f5326a;
            return 4294967295L & ((long) i5);
        }
        int i7 = i(i - 32);
        int i8 = i(32);
        int i9 = AbstractC0370w.f5326a;
        return (4294967295L & ((long) i8)) | ((((long) i7) & 4294967295L) << 32);
    }

    public void l(int i, byte[] bArr) {
        AbstractC0360m.h(this.f713d == 0);
        System.arraycopy(this.f711b, this.f712c, bArr, 0, i);
        this.f712c += i;
        a();
    }

    public int m() {
        int i = 0;
        while (!h()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? i(i) : 0);
    }

    public int n() {
        int iM = m();
        return ((iM + 1) / 2) * (iM % 2 == 0 ? -1 : 1);
    }

    public int o() {
        return m();
    }

    public void p(int i, byte[] bArr) {
        this.f711b = bArr;
        this.f712c = 0;
        this.f713d = 0;
        this.f714e = i;
    }

    public void q(C0363p c0363p) {
        p(c0363p.f5315c, c0363p.f5313a);
        r(c0363p.f5314b * 8);
    }

    public void r(int i) {
        int i5 = i / 8;
        this.f712c = i5;
        this.f713d = i - (i5 * 8);
        a();
    }

    public boolean s(int i) {
        if (2 <= i && i < this.f712c) {
            byte[] bArr = this.f711b;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void t() {
        switch (this.f710a) {
            case 1:
                int i = this.f713d + 1;
                this.f713d = i;
                if (i == 8) {
                    this.f713d = 0;
                    this.f712c++;
                }
                a();
                break;
            default:
                int i5 = this.f714e + 1;
                this.f714e = i5;
                if (i5 == 8) {
                    this.f714e = 0;
                    int i6 = this.f713d;
                    this.f713d = i6 + (s(i6 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void u(int i) {
        int i5;
        switch (this.f710a) {
            case 0:
                int i6 = i / 8;
                int i7 = this.f713d + i6;
                this.f713d = i7;
                int i8 = (i - (i6 * 8)) + this.f714e;
                this.f714e = i8;
                boolean z4 = true;
                if (i8 > 7) {
                    this.f713d = i7 + 1;
                    this.f714e = i8 - 8;
                }
                int i9 = this.f713d;
                if (i9 < 0 || (i9 >= (i5 = this.f712c) && (i9 != i5 || this.f714e != 0))) {
                    z4 = false;
                }
                AbstractC0360m.h(z4);
                break;
            case 1:
                int i10 = i / 8;
                int i11 = this.f712c + i10;
                this.f712c = i11;
                int i12 = (i - (i10 * 8)) + this.f713d;
                this.f713d = i12;
                if (i12 > 7) {
                    this.f712c = i11 + 1;
                    this.f713d = i12 - 8;
                }
                a();
                break;
            default:
                int i13 = this.f713d;
                int i14 = i / 8;
                int i15 = i13 + i14;
                this.f713d = i15;
                int i16 = (i - (i14 * 8)) + this.f714e;
                this.f714e = i16;
                if (i16 > 7) {
                    this.f713d = i15 + 1;
                    this.f714e = i16 - 8;
                }
                while (true) {
                    i13++;
                    if (i13 > this.f713d) {
                        a();
                        break;
                    } else if (s(i13)) {
                        this.f713d++;
                        i13 += 2;
                    }
                }
                break;
        }
    }

    public void v(int i) {
        AbstractC0360m.h(this.f713d == 0);
        this.f712c += i;
        a();
    }

    public M(byte[] bArr) {
        this.f710a = 0;
        this.f711b = bArr;
        this.f712c = bArr.length;
    }

    public M(byte[] bArr, int i, int i5) {
        this.f710a = 3;
        this.f711b = bArr;
        this.f713d = i;
        this.f712c = i5;
        this.f714e = 0;
        a();
    }

    public M(int i, byte[] bArr) {
        this.f710a = 1;
        this.f711b = bArr;
        this.f714e = i;
    }

    public M(int i, int i5) {
        this.f710a = 2;
        this.f712c = i;
        this.f713d = i5;
        this.f711b = new byte[(i5 * 2) - 1];
        this.f714e = 0;
    }
}
