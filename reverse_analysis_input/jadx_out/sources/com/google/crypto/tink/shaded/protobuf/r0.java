package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D1.b f5248a;

    static {
        f5248a = (o0.f5237d && o0.f5236c && !AbstractC0323c.a()) ? new p0(1) : new p0(0);
    }

    public static int a(byte[] bArr, int i, int i5) {
        byte b4 = bArr[i - 1];
        int i6 = i5 - i;
        if (i6 == 0) {
            if (b4 > -12) {
                b4 = -1;
            }
            return b4;
        }
        if (i6 == 1) {
            return c(b4, bArr[i]);
        }
        if (i6 == 2) {
            return d(b4, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char cCharAt = str.charAt(i5);
            if (cCharAt < 2048) {
                i6 += (127 - cCharAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) < 65536) {
                                throw new q0(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i6) + 4294967296L));
    }

    public static int c(int i, int i5) {
        if (i > -12 || i5 > -65) {
            return -1;
        }
        return i ^ (i5 << 8);
    }

    public static int d(int i, int i5, int i6) {
        if (i > -12 || i5 > -65 || i6 > -65) {
            return -1;
        }
        return (i ^ (i5 << 8)) ^ (i6 << 16);
    }

    public static boolean e(byte[] bArr, int i, int i5) {
        return f5248a.J(bArr, i, i5) == 0;
    }
}
