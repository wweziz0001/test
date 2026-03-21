package g4;

import a.AbstractC0149a;
import b3.AbstractC0307a;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient byte[][] f5876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient int[] f5877q;

    public s(byte[][] bArr, int[] iArr) {
        super(b.f5831o.f5832l);
        this.f5876p = bArr;
        this.f5877q = iArr;
    }

    @Override // g4.b
    public final int b() {
        return this.f5877q[this.f5876p.length - 1];
    }

    @Override // g4.b
    public final String c() {
        return new b(p()).c();
    }

    @Override // g4.b
    public final int d(int i, byte[] bArr) {
        N3.h.e(bArr, "other");
        return new b(p()).d(i, bArr);
    }

    @Override // g4.b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.b() == b() && k(0, bVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // g4.b
    public final byte[] f() {
        return p();
    }

    @Override // g4.b
    public final byte g(int i) {
        byte[][] bArr = this.f5876p;
        int length = bArr.length - 1;
        int[] iArr = this.f5877q;
        AbstractC0149a.f(iArr[length], i, 1L);
        int iE = h4.a.e(this, i);
        return bArr[iE][(i - (iE == 0 ? 0 : iArr[iE - 1])) + iArr[bArr.length + iE]];
    }

    @Override // g4.b
    public final int h(int i, byte[] bArr) {
        N3.h.e(bArr, "other");
        return new b(p()).h(i, bArr);
    }

    @Override // g4.b
    public final int hashCode() {
        int i = this.f5833m;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f5876p;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.f5877q;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            byte[] bArr2 = bArr[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr2[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        this.f5833m = i6;
        return i6;
    }

    @Override // g4.b
    public final boolean j(int i, int i5, int i6, byte[] bArr) {
        N3.h.e(bArr, "other");
        if (i < 0 || i > b() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int i7 = i6 + i;
        int iE = h4.a.e(this, i);
        while (i < i7) {
            int[] iArr = this.f5877q;
            int i8 = iE == 0 ? 0 : iArr[iE - 1];
            int i9 = iArr[iE] - i8;
            byte[][] bArr2 = this.f5876p;
            int i10 = iArr[bArr2.length + iE];
            int iMin = Math.min(i7, i9 + i8) - i;
            if (!AbstractC0149a.d((i - i8) + i10, i5, iMin, bArr2[iE], bArr)) {
                return false;
            }
            i5 += iMin;
            i += iMin;
            iE++;
        }
        return true;
    }

    @Override // g4.b
    public final boolean k(int i, b bVar, int i5) {
        N3.h.e(bVar, "other");
        if (i < 0 || i > b() - i5) {
            return false;
        }
        int i6 = i5 + i;
        int iE = h4.a.e(this, i);
        int i7 = 0;
        while (i < i6) {
            int[] iArr = this.f5877q;
            int i8 = iE == 0 ? 0 : iArr[iE - 1];
            int i9 = iArr[iE] - i8;
            byte[][] bArr = this.f5876p;
            int i10 = iArr[bArr.length + iE];
            int iMin = Math.min(i6, i9 + i8) - i;
            if (!bVar.j(i7, (i - i8) + i10, iMin, bArr[iE])) {
                return false;
            }
            i7 += iMin;
            i += iMin;
            iE++;
        }
        return true;
    }

    @Override // g4.b
    public final b l(int i, int i5) {
        if (i5 == -1234567890) {
            i5 = b();
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0307a.h(i, "beginIndex=", " < 0").toString());
        }
        if (i5 > b()) {
            StringBuilder sbJ = B0.j(i5, "endIndex=", " > length(");
            sbJ.append(b());
            sbJ.append(')');
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        int i6 = i5 - i;
        if (i6 < 0) {
            throw new IllegalArgumentException(AbstractC0307a.g(i5, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i5 == b()) {
            return this;
        }
        if (i == i5) {
            return b.f5831o;
        }
        int iE = h4.a.e(this, i);
        int iE2 = h4.a.e(this, i5 - 1);
        byte[][] bArr = this.f5876p;
        byte[][] bArr2 = (byte[][]) C3.e.V(bArr, iE, iE2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f5877q;
        if (iE <= iE2) {
            int i7 = iE;
            int i8 = 0;
            while (true) {
                iArr[i8] = Math.min(iArr2[i7] - i, i6);
                int i9 = i8 + 1;
                iArr[i8 + bArr2.length] = iArr2[bArr.length + i7];
                if (i7 == iE2) {
                    break;
                }
                i7++;
                i8 = i9;
            }
        }
        int i10 = iE != 0 ? iArr2[iE - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i10) + iArr[length];
        return new s(bArr2, iArr);
    }

    @Override // g4.b
    public final void o(a aVar, int i) {
        N3.h.e(aVar, "buffer");
        int iE = h4.a.e(this, 0);
        int i5 = 0;
        while (i5 < i) {
            int[] iArr = this.f5877q;
            int i6 = iE == 0 ? 0 : iArr[iE - 1];
            int i7 = iArr[iE] - i6;
            byte[][] bArr = this.f5876p;
            int i8 = iArr[bArr.length + iE];
            int iMin = Math.min(i, i7 + i6) - i5;
            int i9 = (i5 - i6) + i8;
            q qVar = new q(bArr[iE], i9, i9 + iMin, true);
            q qVar2 = aVar.f5829l;
            if (qVar2 == null) {
                qVar.f5872g = qVar;
                qVar.f5871f = qVar;
                aVar.f5829l = qVar;
            } else {
                q qVar3 = qVar2.f5872g;
                N3.h.b(qVar3);
                qVar3.b(qVar);
            }
            i5 += iMin;
            iE++;
        }
        aVar.f5830m += (long) i;
    }

    public final byte[] p() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f5876p;
        int length = bArr2.length;
        int i = 0;
        int i5 = 0;
        int i6 = 0;
        while (i < length) {
            int[] iArr = this.f5877q;
            int i7 = iArr[length + i];
            int i8 = iArr[i];
            int i9 = i8 - i5;
            C3.e.T(i6, i7, i7 + i9, bArr2[i], bArr);
            i6 += i9;
            i++;
            i5 = i8;
        }
        return bArr;
    }

    @Override // g4.b
    public final String toString() {
        return new b(p()).toString();
    }
}
