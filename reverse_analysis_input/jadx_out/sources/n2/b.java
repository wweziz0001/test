package n2;

import Q1.C;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static {
        new C0690a();
    }

    public static byte[] a(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i5 = 0;
            while (i5 < iMin2) {
                int i6 = inputStream.read(bArr, i5, iMin2 - i5);
                if (i6 == -1) {
                    return a(arrayDeque, i);
                }
                i5 += i6;
                i += i6;
            }
            iMin = C.o0(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
