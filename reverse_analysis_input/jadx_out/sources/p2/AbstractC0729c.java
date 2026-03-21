package p2;

import java.util.Arrays;

/* JADX INFO: renamed from: p2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0729c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f9200a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i5 = 0; i5 < 26; i5++) {
            byte b4 = (byte) (i5 + 10);
            bArr[i5 + 65] = b4;
            bArr[i5 + 97] = b4;
        }
        f9200a = bArr;
    }
}
