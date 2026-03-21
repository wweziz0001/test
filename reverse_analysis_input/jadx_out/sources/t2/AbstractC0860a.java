package t2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: t2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0860a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f10003a = c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int i, int i5, int i6, int i7, int[] iArr) {
        int i8 = iArr[i] + iArr[i5];
        iArr[i] = i8;
        int i9 = i8 ^ iArr[i7];
        int i10 = (i9 >>> (-16)) | (i9 << 16);
        iArr[i7] = i10;
        int i11 = iArr[i6] + i10;
        iArr[i6] = i11;
        int i12 = iArr[i5] ^ i11;
        int i13 = (i12 >>> (-12)) | (i12 << 12);
        iArr[i5] = i13;
        int i14 = iArr[i] + i13;
        iArr[i] = i14;
        int i15 = iArr[i7] ^ i14;
        int i16 = (i15 >>> (-8)) | (i15 << 8);
        iArr[i7] = i16;
        int i17 = iArr[i6] + i16;
        iArr[i6] = i17;
        int i18 = iArr[i5] ^ i17;
        iArr[i5] = (i18 >>> (-7)) | (i18 << 7);
    }

    public static void b(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            a(0, 4, 8, 12, iArr);
            a(1, 5, 9, 13, iArr);
            a(2, 6, 10, 14, iArr);
            a(3, 7, 11, 15, iArr);
            a(0, 5, 10, 15, iArr);
            a(1, 6, 11, 12, iArr);
            a(2, 7, 8, 13, iArr);
            a(3, 4, 9, 14, iArr);
        }
    }

    public static int[] c(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
