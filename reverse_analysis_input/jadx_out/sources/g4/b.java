package g4;

import a.AbstractC0149a;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable, Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f5831o = new b(new byte[0]);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f5832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient int f5833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient String f5834n;

    public b(byte[] bArr) {
        N3.h.e(bArr, "data");
        this.f5832l = bArr;
    }

    public static int e(b bVar, b bVar2) {
        bVar.getClass();
        N3.h.e(bVar2, "other");
        return bVar.d(0, bVar2.f5832l);
    }

    public static int i(b bVar, b bVar2) {
        bVar.getClass();
        N3.h.e(bVar2, "other");
        return bVar.h(-1234567890, bVar2.f5832l);
    }

    public static /* synthetic */ b m(b bVar, int i, int i5, int i6) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = -1234567890;
        }
        return bVar.l(i, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(g4.b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            N3.h.e(r10, r0)
            int r0 = r9.b()
            int r1 = r10.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.b.compareTo(g4.b):int");
    }

    public int b() {
        return this.f5832l.length;
    }

    public String c() {
        byte[] bArr = this.f5832l;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b4 : bArr) {
            int i5 = i + 1;
            char[] cArr2 = h4.a.f6328a;
            cArr[i] = cArr2[(b4 >> 4) & 15];
            i += 2;
            cArr[i5] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    public int d(int i, byte[] bArr) {
        N3.h.e(bArr, "other");
        byte[] bArr2 = this.f5832l;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax <= length) {
            while (!AbstractC0149a.d(iMax, 0, bArr.length, bArr2, bArr)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int iB = bVar.b();
            byte[] bArr = this.f5832l;
            if (iB == bArr.length && bVar.j(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f5832l;
    }

    public byte g(int i) {
        return this.f5832l[i];
    }

    public int h(int i, byte[] bArr) {
        N3.h.e(bArr, "other");
        if (i == -1234567890) {
            i = b();
        }
        byte[] bArr2 = this.f5832l;
        for (int iMin = Math.min(i, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (AbstractC0149a.d(iMin, 0, bArr.length, bArr2, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i = this.f5833m;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f5832l);
        this.f5833m = iHashCode;
        return iHashCode;
    }

    public boolean j(int i, int i5, int i6, byte[] bArr) {
        N3.h.e(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f5832l;
            if (i <= bArr2.length - i6 && i5 >= 0 && i5 <= bArr.length - i6 && AbstractC0149a.d(i, i5, i6, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean k(int i, b bVar, int i5) {
        N3.h.e(bVar, "other");
        return bVar.j(0, i, i5, this.f5832l);
    }

    public b l(int i, int i5) {
        if (i5 == -1234567890) {
            i5 = b();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f5832l;
        if (i5 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (i5 - i < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i5 == bArr.length) {
            return this;
        }
        Z1.f.i(i5, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i5);
        N3.h.d(bArrCopyOfRange, "copyOfRange(...)");
        return new b(bArrCopyOfRange);
    }

    public final String n() {
        String str = this.f5834n;
        if (str != null) {
            return str;
        }
        byte[] bArrF = f();
        N3.h.e(bArrF, "<this>");
        String str2 = new String(bArrF, U3.a.f2287a);
        this.f5834n = str2;
        return str2;
    }

    public void o(a aVar, int i) {
        N3.h.e(aVar, "buffer");
        aVar.t(this.f5832l, 0, i);
    }

    public String toString() {
        b bVar;
        byte b4;
        int i;
        byte[] bArr = this.f5832l;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        loop0: while (true) {
            if (i5 >= length) {
                break;
            }
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                int i8 = i7 + 1;
                if (i7 == 64) {
                    break;
                }
                if ((b5 != 10 && b5 != 13 && ((b5 >= 0 && b5 < 32) || (127 <= b5 && b5 < 160))) || b5 == 65533) {
                    break;
                }
                i6 += b5 < 65536 ? 1 : 2;
                i5++;
                while (true) {
                    i7 = i8;
                    if (i5 < length && (b4 = bArr[i5]) >= 0) {
                        i5++;
                        i8 = i7 + 1;
                        if (i7 == 64) {
                            break loop0;
                        }
                        if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && b4 < 32) || (127 <= b4 && b4 < 160))) || b4 == 65533) {
                            break loop0;
                        }
                        i6 += b4 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b5 >> 5) == -2) {
                int i9 = i5 + 1;
                if (length > i9) {
                    byte b6 = bArr[i9];
                    if ((b6 & 192) == 128) {
                        int i10 = (b6 ^ 3968) ^ (b5 << 6);
                        if (i10 >= 128) {
                            i = i7 + 1;
                            if (i7 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                break;
                            }
                            i6 += i10 < 65536 ? 1 : 2;
                            i5 += 2;
                            i7 = i;
                        } else if (i7 != 64) {
                            break;
                        }
                    } else if (i7 != 64) {
                        break;
                    }
                } else if (i7 != 64) {
                    break;
                }
            } else if ((b5 >> 4) == -2) {
                int i11 = i5 + 2;
                if (length > i11) {
                    byte b7 = bArr[i5 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i11];
                        if ((b8 & 192) == 128) {
                            int i12 = ((b8 ^ (-123008)) ^ (b7 << 6)) ^ (b5 << 12);
                            if (i12 < 2048) {
                                if (i7 != 64) {
                                    break;
                                }
                            } else if (55296 > i12 || i12 >= 57344) {
                                i = i7 + 1;
                                if (i7 == 64) {
                                    break;
                                }
                                if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                    break;
                                }
                                i6 += i12 < 65536 ? 1 : 2;
                                i5 += 3;
                                i7 = i;
                            } else if (i7 != 64) {
                                break;
                            }
                        } else if (i7 != 64) {
                            break;
                        }
                    } else if (i7 != 64) {
                        break;
                    }
                } else if (i7 != 64) {
                    break;
                }
            } else if ((b5 >> 3) == -2) {
                int i13 = i5 + 3;
                if (length > i13) {
                    byte b9 = bArr[i5 + 1];
                    if ((b9 & 192) == 128) {
                        byte b10 = bArr[i5 + 2];
                        if ((b10 & 192) == 128) {
                            byte b11 = bArr[i13];
                            if ((b11 & 192) == 128) {
                                int i14 = (((b11 ^ 3678080) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b5 << 18);
                                if (i14 > 1114111) {
                                    if (i7 != 64) {
                                        break;
                                    }
                                } else if (55296 > i14 || i14 >= 57344) {
                                    if (i14 >= 65536) {
                                        i = i7 + 1;
                                        if (i7 == 64) {
                                            break;
                                        }
                                        if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                            break;
                                        }
                                        i6 += i14 < 65536 ? 1 : 2;
                                        i5 += 4;
                                        i7 = i;
                                    } else if (i7 != 64) {
                                        break;
                                    }
                                } else if (i7 != 64) {
                                    break;
                                }
                            } else if (i7 != 64) {
                                break;
                            }
                        } else if (i7 != 64) {
                            break;
                        }
                    } else if (i7 != 64) {
                        break;
                    }
                } else if (i7 != 64) {
                    break;
                }
            } else if (i7 != 64) {
                break;
            }
        }
        i6 = -1;
        if (i6 != -1) {
            String strN = n();
            String strSubstring = strN.substring(0, i6);
            N3.h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strL0 = U3.l.l0(U3.l.l0(U3.l.l0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i6 >= strN.length()) {
                return "[text=" + strL0 + ']';
            }
            return "[size=" + bArr.length + " text=" + strL0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 == bArr.length) {
            bVar = this;
        } else {
            Z1.f.i(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            N3.h.d(bArrCopyOfRange, "copyOfRange(...)");
            bVar = new b(bArrCopyOfRange);
        }
        sb.append(bVar.c());
        sb.append("…]");
        return sb.toString();
    }
}
