package x0;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f10720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f10721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f10722c;

    public i0() {
        this(new Random());
    }

    public final i0 a() {
        return new i0(new Random(this.f10720a.nextLong()));
    }

    public final i0 b(int i, int i5) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i5];
        int i6 = 0;
        while (true) {
            random = this.f10720a;
            iArr = this.f10721b;
            if (i6 >= i5) {
                break;
            }
            iArr2[i6] = random.nextInt(iArr.length + 1);
            int i7 = i6 + 1;
            int iNextInt = random.nextInt(i7);
            iArr3[i6] = iArr3[iNextInt];
            iArr3[iNextInt] = i6 + i;
            i6 = i7;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i5];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < iArr.length + i5; i10++) {
            if (i8 >= i5 || i9 != iArr2[i8]) {
                int i11 = i9 + 1;
                int i12 = iArr[i9];
                iArr4[i10] = i12;
                if (i12 >= i) {
                    iArr4[i10] = i12 + i5;
                }
                i9 = i11;
            } else {
                iArr4[i10] = iArr3[i8];
                i8++;
            }
        }
        return new i0(iArr4, new Random(random.nextLong()));
    }

    public final i0 c(int i, int i5) {
        int i6 = i5 - i;
        int[] iArr = this.f10721b;
        int[] iArr2 = new int[iArr.length - i6];
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            if (i9 < i || i9 >= i5) {
                int i10 = i8 - i7;
                if (i9 >= i) {
                    i9 -= i6;
                }
                iArr2[i10] = i9;
            } else {
                i7++;
            }
        }
        return new i0(iArr2, new Random(this.f10720a.nextLong()));
    }

    public i0(int[] iArr, Random random) {
        this.f10721b = iArr;
        this.f10720a = random;
        this.f10722c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f10722c[iArr[i]] = i;
        }
    }

    public i0(Random random) {
        this(new int[0], random);
    }
}
