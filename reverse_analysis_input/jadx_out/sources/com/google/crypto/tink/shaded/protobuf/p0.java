package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends D1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5240a;

    public /* synthetic */ p0(int i) {
        this.f5240a = i;
    }

    public static int X(long j5, byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            D1.b bVar = r0.f5248a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i5 == 1) {
            return r0.c(i, o0.g(j5, bArr));
        }
        if (i5 == 2) {
            return r0.d(i, o0.g(j5, bArr), o0.g(j5 + 1, bArr));
        }
        throw new AssertionError();
    }

    @Override // D1.b
    public final int J(byte[] bArr, int i, int i5) {
        int i6;
        int i7 = i;
        switch (this.f5240a) {
            case 0:
                break;
            default:
                if ((i7 | i5 | (bArr.length - i5)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i5)));
                }
                long j5 = i7;
                int i8 = (int) (((long) i5) - j5);
                long j6 = 1;
                if (i8 < 16) {
                    i6 = 0;
                } else {
                    int i9 = 8 - (((int) j5) & 7);
                    long j7 = j5;
                    i6 = 0;
                    while (true) {
                        if (i6 < i9) {
                            long j8 = j7 + 1;
                            if (o0.g(j7, bArr) >= 0) {
                                i6++;
                                j7 = j8;
                            }
                        } else {
                            while (true) {
                                int i10 = i6 + 8;
                                if (i10 <= i8) {
                                    if ((o0.f5235b.h(o0.f5238e + j7, bArr) & (-9187201950435737472L)) == 0) {
                                        j7 += 8;
                                        i6 = i10;
                                    }
                                }
                            }
                            while (true) {
                                if (i6 < i8) {
                                    long j9 = j7 + 1;
                                    if (o0.g(j7, bArr) >= 0) {
                                        i6++;
                                        j7 = j9;
                                    }
                                } else {
                                    i6 = i8;
                                }
                            }
                        }
                    }
                }
                int i11 = i8 - i6;
                long j10 = j5 + ((long) i6);
                while (true) {
                    byte bG = 0;
                    while (true) {
                        if (i11 > 0) {
                            long j11 = j10 + j6;
                            bG = o0.g(j10, bArr);
                            if (bG >= 0) {
                                i11--;
                                j10 = j11;
                            } else {
                                j10 = j11;
                            }
                        }
                    }
                    if (i11 == 0) {
                        return 0;
                    }
                    int i12 = i11 - 1;
                    if (bG < -32) {
                        if (i12 == 0) {
                            return bG;
                        }
                        i11 -= 2;
                        if (bG >= -62) {
                            long j12 = j10 + j6;
                            if (o0.g(j10, bArr) <= -65) {
                                j10 = j12;
                                j6 = 1;
                            }
                        }
                    } else if (bG < -16) {
                        if (i12 < 2) {
                            return X(j10, bArr, bG, i12);
                        }
                        i11 -= 3;
                        long j13 = j10 + j6;
                        byte bG2 = o0.g(j10, bArr);
                        if (bG2 <= -65 && ((bG != -32 || bG2 >= -96) && (bG != -19 || bG2 < -96))) {
                            j10 += 2;
                            if (o0.g(j13, bArr) <= -65) {
                                j6 = 1;
                            }
                        }
                    } else {
                        if (i12 < 3) {
                            return X(j10, bArr, bG, i12);
                        }
                        i11 -= 4;
                        long j14 = j10 + j6;
                        byte bG3 = o0.g(j10, bArr);
                        if (bG3 <= -65) {
                            if ((((bG3 + 112) + (bG << 28)) >> 30) == 0) {
                                long j15 = j10 + 2;
                                if (o0.g(j14, bArr) <= -65) {
                                    j10 += 3;
                                    if (o0.g(j15, bArr) <= -65) {
                                        j6 = 1;
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
        }
        while (i7 < i5 && bArr[i7] >= 0) {
            i7++;
        }
        if (i7 >= i5) {
            return 0;
        }
        while (i7 < i5) {
            int i13 = i7 + 1;
            byte b4 = bArr[i7];
            if (b4 < 0) {
                if (b4 < -32) {
                    if (i13 >= i5) {
                        return b4;
                    }
                    if (b4 >= -62) {
                        i7 += 2;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (b4 < -16) {
                    if (i13 >= i5 - 1) {
                        return r0.a(bArr, i13, i5);
                    }
                    int i14 = i7 + 2;
                    byte b5 = bArr[i13];
                    if (b5 <= -65 && ((b4 != -32 || b5 >= -96) && (b4 != -19 || b5 < -96))) {
                        i7 += 3;
                        if (bArr[i14] > -65) {
                        }
                    }
                    return -1;
                }
                if (i13 >= i5 - 2) {
                    return r0.a(bArr, i13, i5);
                }
                int i15 = i7 + 2;
                byte b6 = bArr[i13];
                if (b6 <= -65) {
                    if ((((b6 + 112) + (b4 << 28)) >> 30) == 0) {
                        int i16 = i7 + 3;
                        if (bArr[i15] <= -65) {
                            i7 += 4;
                            if (bArr[i16] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i7 = i13;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    @Override // D1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String t(byte[] r11, int r12, int r13) throws com.google.crypto.tink.shaded.protobuf.C {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.p0.t(byte[], int, int):java.lang.String");
    }

    @Override // D1.b
    public final int v(String str, byte[] bArr, int i, int i5) {
        int i6;
        int i7;
        char cCharAt;
        long j5;
        String str2;
        String str3;
        int i8;
        char cCharAt2;
        switch (this.f5240a) {
            case 0:
                int length = str.length();
                int i9 = i5 + i;
                int i10 = 0;
                while (i10 < length && (i7 = i10 + i) < i9 && (cCharAt = str.charAt(i10)) < 128) {
                    bArr[i7] = (byte) cCharAt;
                    i10++;
                }
                if (i10 == length) {
                    return i + length;
                }
                int i11 = i + i10;
                while (i10 < length) {
                    char cCharAt3 = str.charAt(i10);
                    if (cCharAt3 < 128 && i11 < i9) {
                        bArr[i11] = (byte) cCharAt3;
                        i11++;
                    } else if (cCharAt3 < 2048 && i11 <= i9 - 2) {
                        int i12 = i11 + 1;
                        bArr[i11] = (byte) ((cCharAt3 >>> 6) | 960);
                        i11 += 2;
                        bArr[i12] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i11 > i9 - 3) {
                            if (i11 > i9 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i6 = i10 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i6)))) {
                                    throw new q0(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i11);
                            }
                            int i13 = i10 + 1;
                            if (i13 != str.length()) {
                                char cCharAt4 = str.charAt(i13);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i11] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i11 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i14 = i11 + 3;
                                    bArr[i11 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i11 += 4;
                                    bArr[i14] = (byte) ((codePoint & 63) | 128);
                                    i10 = i13;
                                } else {
                                    i10 = i13;
                                }
                            }
                            throw new q0(i10 - 1, length);
                        }
                        bArr[i11] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i15 = i11 + 2;
                        bArr[i11 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i11 += 3;
                        bArr[i15] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i10++;
                }
                return i11;
            default:
                long j6 = i;
                long j7 = ((long) i5) + j6;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i5 || bArr.length - i5 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i5));
                }
                int i16 = 0;
                while (true) {
                    j5 = 1;
                    if (i16 < length2 && (cCharAt2 = str.charAt(i16)) < 128) {
                        o0.o(bArr, j6, (byte) cCharAt2);
                        i16++;
                        j6 = 1 + j6;
                    }
                }
                if (i16 != length2) {
                    while (i16 < length2) {
                        char cCharAt5 = str.charAt(i16);
                        if (cCharAt5 < 128 && j6 < j7) {
                            o0.o(bArr, j6, (byte) cCharAt5);
                            str3 = str5;
                            j6 += j5;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j6 > j7 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j6 > j7 - 3) {
                                if (j6 > j7 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i8 = i16 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i8)))) {
                                        throw new q0(i16, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j6);
                                }
                                int i17 = i16 + 1;
                                if (i17 != length2) {
                                    char cCharAt6 = str.charAt(i17);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        o0.o(bArr, j6, (byte) ((codePoint2 >>> 18) | 240));
                                        o0.o(bArr, j6 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j8 = 3 + j6;
                                        o0.o(bArr, j6 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j6 += 4;
                                        o0.o(bArr, j8, (byte) ((codePoint2 & 63) | 128));
                                        i16 = i17;
                                    } else {
                                        i16 = i17;
                                    }
                                }
                                throw new q0(i16 - 1, length2);
                            }
                            o0.o(bArr, j6, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j9 = j6 + 2;
                            o0.o(bArr, j6 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j6 += 3;
                            o0.o(bArr, j9, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j10 = j6 + j5;
                            o0.o(bArr, j6, (byte) ((cCharAt5 >>> 6) | 960));
                            j6 += 2;
                            o0.o(bArr, j10, (byte) ((cCharAt5 & '?') | 128));
                        }
                        i16++;
                        str4 = str2;
                        str5 = str3;
                        j5 = 1;
                    }
                }
                return (int) j6;
        }
    }
}
