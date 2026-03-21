package g4;

import a.AbstractC0149a;
import b3.AbstractC0307a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t, ReadableByteChannel, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q f5829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5830m;

    public final byte a(long j5) {
        AbstractC0149a.f(this.f5830m, j5, 1L);
        q qVar = this.f5829l;
        if (qVar == null) {
            N3.h.b(null);
            throw null;
        }
        long j6 = this.f5830m;
        if (j6 - j5 < j5) {
            while (j6 > j5) {
                qVar = qVar.f5872g;
                N3.h.b(qVar);
                j6 -= (long) (qVar.f5868c - qVar.f5867b);
            }
            return qVar.f5866a[(int) ((((long) qVar.f5867b) + j5) - j6)];
        }
        long j7 = 0;
        while (true) {
            int i = qVar.f5868c;
            int i5 = qVar.f5867b;
            long j8 = ((long) (i - i5)) + j7;
            if (j8 > j5) {
                return qVar.f5866a[(int) ((((long) i5) + j5) - j7)];
            }
            qVar = qVar.f5871f;
            N3.h.b(qVar);
            j7 = j8;
        }
    }

    public final long b(b bVar) {
        int i;
        int i5;
        N3.h.e(bVar, "targetBytes");
        q qVar = this.f5829l;
        if (qVar == null) {
            return -1L;
        }
        long j5 = this.f5830m;
        long j6 = 0;
        byte[] bArr = bVar.f5832l;
        if (j5 < 0) {
            while (j5 > 0) {
                qVar = qVar.f5872g;
                N3.h.b(qVar);
                j5 -= (long) (qVar.f5868c - qVar.f5867b);
            }
            if (bArr.length == 2) {
                byte b4 = bArr[0];
                byte b5 = bArr[1];
                while (j5 < this.f5830m) {
                    i = (int) ((((long) qVar.f5867b) + j6) - j5);
                    int i6 = qVar.f5868c;
                    while (i < i6) {
                        byte b6 = qVar.f5866a[i];
                        if (b6 == b4 || b6 == b5) {
                            i5 = qVar.f5867b;
                        } else {
                            i++;
                        }
                    }
                    j6 = ((long) (qVar.f5868c - qVar.f5867b)) + j5;
                    qVar = qVar.f5871f;
                    N3.h.b(qVar);
                    j5 = j6;
                }
                return -1L;
            }
            while (j5 < this.f5830m) {
                i = (int) ((((long) qVar.f5867b) + j6) - j5);
                int i7 = qVar.f5868c;
                while (i < i7) {
                    byte b7 = qVar.f5866a[i];
                    for (byte b8 : bArr) {
                        if (b7 == b8) {
                            i5 = qVar.f5867b;
                        }
                    }
                    i++;
                }
                j6 = ((long) (qVar.f5868c - qVar.f5867b)) + j5;
                qVar = qVar.f5871f;
                N3.h.b(qVar);
                j5 = j6;
            }
            return -1L;
        }
        j5 = 0;
        while (true) {
            long j7 = ((long) (qVar.f5868c - qVar.f5867b)) + j5;
            if (j7 > 0) {
                break;
            }
            qVar = qVar.f5871f;
            N3.h.b(qVar);
            j5 = j7;
        }
        if (bArr.length == 2) {
            byte b9 = bArr[0];
            byte b10 = bArr[1];
            while (j5 < this.f5830m) {
                i = (int) ((((long) qVar.f5867b) + j6) - j5);
                int i8 = qVar.f5868c;
                while (i < i8) {
                    byte b11 = qVar.f5866a[i];
                    if (b11 == b9 || b11 == b10) {
                        i5 = qVar.f5867b;
                    } else {
                        i++;
                    }
                }
                j6 = ((long) (qVar.f5868c - qVar.f5867b)) + j5;
                qVar = qVar.f5871f;
                N3.h.b(qVar);
                j5 = j6;
            }
            return -1L;
        }
        while (j5 < this.f5830m) {
            i = (int) ((((long) qVar.f5867b) + j6) - j5);
            int i9 = qVar.f5868c;
            while (i < i9) {
                byte b12 = qVar.f5866a[i];
                for (byte b13 : bArr) {
                    if (b12 == b13) {
                        i5 = qVar.f5867b;
                    }
                }
                i++;
            }
            j6 = ((long) (qVar.f5868c - qVar.f5867b)) + j5;
            qVar = qVar.f5871f;
            N3.h.b(qVar);
            j5 = j6;
        }
        return -1L;
        return ((long) (i - i5)) + j5;
    }

    public final boolean c(b bVar) {
        N3.h.e(bVar, "bytes");
        byte[] bArr = bVar.f5832l;
        int length = bArr.length;
        if (length < 0 || this.f5830m < length || bArr.length < length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (a(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object clone() {
        a aVar = new a();
        if (this.f5830m != 0) {
            q qVar = this.f5829l;
            N3.h.b(qVar);
            q qVarC = qVar.c();
            aVar.f5829l = qVarC;
            qVarC.f5872g = qVarC;
            qVarC.f5871f = qVarC;
            for (q qVar2 = qVar.f5871f; qVar2 != qVar; qVar2 = qVar2.f5871f) {
                q qVar3 = qVarC.f5872g;
                N3.h.b(qVar3);
                N3.h.b(qVar2);
                qVar3.b(qVar2.c());
            }
            aVar.f5830m = this.f5830m;
        }
        return aVar;
    }

    @Override // g4.t
    public final long d(a aVar, long j5) {
        N3.h.e(aVar, "sink");
        if (j5 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        long j6 = this.f5830m;
        if (j6 == 0) {
            return -1L;
        }
        if (j5 > j6) {
            j5 = j6;
        }
        aVar.r(this, j5);
        return j5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                long j5 = this.f5830m;
                a aVar = (a) obj;
                if (j5 == aVar.f5830m) {
                    if (j5 != 0) {
                        q qVar = this.f5829l;
                        N3.h.b(qVar);
                        q qVar2 = aVar.f5829l;
                        N3.h.b(qVar2);
                        int i = qVar.f5867b;
                        int i5 = qVar2.f5867b;
                        long j6 = 0;
                        while (j6 < this.f5830m) {
                            long jMin = Math.min(qVar.f5868c - i, qVar2.f5868c - i5);
                            long j7 = 0;
                            while (j7 < jMin) {
                                int i6 = i + 1;
                                byte b4 = qVar.f5866a[i];
                                int i7 = i5 + 1;
                                if (b4 == qVar2.f5866a[i5]) {
                                    j7++;
                                    i5 = i7;
                                    i = i6;
                                }
                            }
                            if (i == qVar.f5868c) {
                                q qVar3 = qVar.f5871f;
                                N3.h.b(qVar3);
                                i = qVar3.f5867b;
                                qVar = qVar3;
                            }
                            if (i5 == qVar2.f5868c) {
                                qVar2 = qVar2.f5871f;
                                N3.h.b(qVar2);
                                i5 = qVar2.f5867b;
                            }
                            j6 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final byte f() throws EOFException {
        if (this.f5830m == 0) {
            throw new EOFException();
        }
        q qVar = this.f5829l;
        N3.h.b(qVar);
        int i = qVar.f5867b;
        int i5 = qVar.f5868c;
        int i6 = i + 1;
        byte b4 = qVar.f5866a[i];
        this.f5830m--;
        if (i6 == i5) {
            this.f5829l = qVar.a();
            r.a(qVar);
        } else {
            qVar.f5867b = i6;
        }
        return b4;
    }

    public final int hashCode() {
        q qVar = this.f5829l;
        if (qVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i5 = qVar.f5868c;
            for (int i6 = qVar.f5867b; i6 < i5; i6++) {
                i = (i * 31) + qVar.f5866a[i6];
            }
            qVar = qVar.f5871f;
            N3.h.b(qVar);
        } while (qVar != this.f5829l);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] k(long j5) throws EOFException {
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j5).toString());
        }
        if (this.f5830m < j5) {
            throw new EOFException();
        }
        int i = (int) j5;
        byte[] bArr = new byte[i];
        int i5 = 0;
        while (i5 < i) {
            int i6 = read(bArr, i5, i - i5);
            if (i6 == -1) {
                throw new EOFException();
            }
            i5 += i6;
        }
        return bArr;
    }

    public final b l(long j5) throws EOFException {
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j5).toString());
        }
        if (this.f5830m < j5) {
            throw new EOFException();
        }
        if (j5 < 4096) {
            return new b(k(j5));
        }
        b bVarP = p((int) j5);
        o(j5);
        return bVarP;
    }

    public final int n() throws EOFException {
        if (this.f5830m < 4) {
            throw new EOFException();
        }
        q qVar = this.f5829l;
        N3.h.b(qVar);
        int i = qVar.f5867b;
        int i5 = qVar.f5868c;
        if (i5 - i < 4) {
            return ((f() & 255) << 24) | ((f() & 255) << 16) | ((f() & 255) << 8) | (f() & 255);
        }
        byte[] bArr = qVar.f5866a;
        int i6 = i + 3;
        int i7 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i8 = i + 4;
        int i9 = i7 | (bArr[i6] & 255);
        this.f5830m -= 4;
        if (i8 == i5) {
            this.f5829l = qVar.a();
            r.a(qVar);
        } else {
            qVar.f5867b = i8;
        }
        return i9;
    }

    public final void o(long j5) throws EOFException {
        while (j5 > 0) {
            q qVar = this.f5829l;
            if (qVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j5, qVar.f5868c - qVar.f5867b);
            long j6 = iMin;
            this.f5830m -= j6;
            j5 -= j6;
            int i = qVar.f5867b + iMin;
            qVar.f5867b = i;
            if (i == qVar.f5868c) {
                this.f5829l = qVar.a();
                r.a(qVar);
            }
        }
    }

    public final b p(int i) {
        if (i == 0) {
            return b.f5831o;
        }
        AbstractC0149a.f(this.f5830m, 0L, i);
        q qVar = this.f5829l;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i) {
            N3.h.b(qVar);
            int i8 = qVar.f5868c;
            int i9 = qVar.f5867b;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            qVar = qVar.f5871f;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        q qVar2 = this.f5829l;
        int i10 = 0;
        while (i5 < i) {
            N3.h.b(qVar2);
            bArr[i10] = qVar2.f5866a;
            i5 += qVar2.f5868c - qVar2.f5867b;
            iArr[i10] = Math.min(i5, i);
            iArr[i10 + i7] = qVar2.f5867b;
            qVar2.f5869d = true;
            i10++;
            qVar2 = qVar2.f5871f;
        }
        return new s(bArr, iArr);
    }

    public final q q(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f5829l;
        if (qVar == null) {
            q qVarB = r.b();
            this.f5829l = qVarB;
            qVarB.f5872g = qVarB;
            qVarB.f5871f = qVarB;
            return qVarB;
        }
        q qVar2 = qVar.f5872g;
        N3.h.b(qVar2);
        if (qVar2.f5868c + i <= 8192 && qVar2.f5870e) {
            return qVar2;
        }
        q qVarB2 = r.b();
        qVar2.b(qVarB2);
        return qVarB2;
    }

    public final void r(a aVar, long j5) {
        q qVarB;
        N3.h.e(aVar, "source");
        if (aVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0149a.f(aVar.f5830m, 0L, j5);
        while (j5 > 0) {
            q qVar = aVar.f5829l;
            N3.h.b(qVar);
            int i = qVar.f5868c;
            q qVar2 = aVar.f5829l;
            N3.h.b(qVar2);
            long j6 = i - qVar2.f5867b;
            int i5 = 0;
            if (j5 < j6) {
                q qVar3 = this.f5829l;
                q qVar4 = qVar3 != null ? qVar3.f5872g : null;
                if (qVar4 != null && qVar4.f5870e) {
                    if ((((long) qVar4.f5868c) + j5) - ((long) (qVar4.f5869d ? 0 : qVar4.f5867b)) <= 8192) {
                        q qVar5 = aVar.f5829l;
                        N3.h.b(qVar5);
                        qVar5.d(qVar4, (int) j5);
                        aVar.f5830m -= j5;
                        this.f5830m += j5;
                        return;
                    }
                }
                q qVar6 = aVar.f5829l;
                N3.h.b(qVar6);
                int i6 = (int) j5;
                if (i6 <= 0 || i6 > qVar6.f5868c - qVar6.f5867b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i6 >= 1024) {
                    qVarB = qVar6.c();
                } else {
                    qVarB = r.b();
                    int i7 = qVar6.f5867b;
                    C3.e.T(0, i7, i7 + i6, qVar6.f5866a, qVarB.f5866a);
                }
                qVarB.f5868c = qVarB.f5867b + i6;
                qVar6.f5867b += i6;
                q qVar7 = qVar6.f5872g;
                N3.h.b(qVar7);
                qVar7.b(qVarB);
                aVar.f5829l = qVarB;
            }
            q qVar8 = aVar.f5829l;
            N3.h.b(qVar8);
            long j7 = qVar8.f5868c - qVar8.f5867b;
            aVar.f5829l = qVar8.a();
            q qVar9 = this.f5829l;
            if (qVar9 == null) {
                this.f5829l = qVar8;
                qVar8.f5872g = qVar8;
                qVar8.f5871f = qVar8;
            } else {
                q qVar10 = qVar9.f5872g;
                N3.h.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f5872g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                N3.h.b(qVar11);
                if (qVar11.f5870e) {
                    int i8 = qVar8.f5868c - qVar8.f5867b;
                    q qVar12 = qVar8.f5872g;
                    N3.h.b(qVar12);
                    int i9 = 8192 - qVar12.f5868c;
                    q qVar13 = qVar8.f5872g;
                    N3.h.b(qVar13);
                    if (!qVar13.f5869d) {
                        q qVar14 = qVar8.f5872g;
                        N3.h.b(qVar14);
                        i5 = qVar14.f5867b;
                    }
                    if (i8 <= i9 + i5) {
                        q qVar15 = qVar8.f5872g;
                        N3.h.b(qVar15);
                        qVar8.d(qVar15, i8);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            aVar.f5830m -= j7;
            this.f5830m += j7;
            j5 -= j7;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        N3.h.e(byteBuffer, "sink");
        q qVar = this.f5829l;
        if (qVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), qVar.f5868c - qVar.f5867b);
        byteBuffer.put(qVar.f5866a, qVar.f5867b, iMin);
        int i = qVar.f5867b + iMin;
        qVar.f5867b = i;
        this.f5830m -= (long) iMin;
        if (i == qVar.f5868c) {
            this.f5829l = qVar.a();
            r.a(qVar);
        }
        return iMin;
    }

    public final void s(b bVar) {
        N3.h.e(bVar, "byteString");
        bVar.o(this, bVar.b());
    }

    public final void t(byte[] bArr, int i, int i5) {
        N3.h.e(bArr, "source");
        long j5 = i5;
        AbstractC0149a.f(bArr.length, i, j5);
        int i6 = i5 + i;
        while (i < i6) {
            q qVarQ = q(1);
            int iMin = Math.min(i6 - i, 8192 - qVarQ.f5868c);
            int i7 = i + iMin;
            C3.e.T(qVarQ.f5868c, i, i7, bArr, qVarQ.f5866a);
            qVarQ.f5868c += iMin;
            i = i7;
        }
        this.f5830m += j5;
    }

    public final String toString() {
        long j5 = this.f5830m;
        if (j5 <= 2147483647L) {
            return p((int) j5).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f5830m).toString());
    }

    public final void u(int i) {
        q qVarQ = q(1);
        int i5 = qVarQ.f5868c;
        qVarQ.f5868c = i5 + 1;
        qVarQ.f5866a[i5] = (byte) i;
        this.f5830m++;
    }

    public final void v(String str) {
        char cCharAt;
        N3.h.e(str, "string");
        int length = str.length();
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0307a.h(length, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length > str.length()) {
            StringBuilder sbJ = B0.j(length, "endIndex > string.length: ", " > ");
            sbJ.append(str.length());
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        int i = 0;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                q qVarQ = q(1);
                int i5 = qVarQ.f5868c - i;
                int iMin = Math.min(length, 8192 - i5);
                int i6 = i + 1;
                byte[] bArr = qVarQ.f5866a;
                bArr[i + i5] = (byte) cCharAt2;
                while (true) {
                    i = i6;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i6 = i + 1;
                    bArr[i + i5] = (byte) cCharAt;
                }
                int i7 = qVarQ.f5868c;
                int i8 = (i5 + i) - i7;
                qVarQ.f5868c = i7 + i8;
                this.f5830m += (long) i8;
            } else {
                if (cCharAt2 < 2048) {
                    q qVarQ2 = q(2);
                    int i9 = qVarQ2.f5868c;
                    byte[] bArr2 = qVarQ2.f5866a;
                    bArr2[i9] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    qVarQ2.f5868c = i9 + 2;
                    this.f5830m += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    q qVarQ3 = q(3);
                    int i10 = qVarQ3.f5868c;
                    byte[] bArr3 = qVarQ3.f5866a;
                    bArr3[i10] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    qVarQ3.f5868c = i10 + 3;
                    this.f5830m += 3;
                } else {
                    int i11 = i + 1;
                    char cCharAt3 = i11 < length ? str.charAt(i11) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        u(63);
                        i = i11;
                    } else {
                        int i12 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        q qVarQ4 = q(4);
                        int i13 = qVarQ4.f5868c;
                        byte[] bArr4 = qVarQ4.f5866a;
                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                        qVarQ4.f5868c = i13 + 4;
                        this.f5830m += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        N3.h.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            q qVarQ = q(1);
            int iMin = Math.min(i, 8192 - qVarQ.f5868c);
            byteBuffer.get(qVarQ.f5866a, qVarQ.f5868c, iMin);
            i -= iMin;
            qVarQ.f5868c += iMin;
        }
        this.f5830m += (long) iRemaining;
        return iRemaining;
    }

    public final int read(byte[] bArr, int i, int i5) {
        N3.h.e(bArr, "sink");
        AbstractC0149a.f(bArr.length, i, i5);
        q qVar = this.f5829l;
        if (qVar == null) {
            return -1;
        }
        int iMin = Math.min(i5, qVar.f5868c - qVar.f5867b);
        int i6 = qVar.f5867b;
        C3.e.T(i, i6, i6 + iMin, qVar.f5866a, bArr);
        int i7 = qVar.f5867b + iMin;
        qVar.f5867b = i7;
        this.f5830m -= (long) iMin;
        if (i7 == qVar.f5868c) {
            this.f5829l = qVar.a();
            r.a(qVar);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
