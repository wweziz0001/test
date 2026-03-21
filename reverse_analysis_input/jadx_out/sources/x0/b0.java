package x0;

import Q1.C0118a;
import android.media.MediaCodec;
import com.google.crypto.tink.shaded.protobuf.C0324d;
import d0.AbstractC0370w;
import d0.C0363p;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0.f f10652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f10654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z0.b f10655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z0.b f10656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Z0.b f10657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10658g;

    public b0(B0.f fVar) {
        this.f10652a = fVar;
        int i = fVar.f192b;
        this.f10653b = i;
        this.f10654c = new C0363p(32);
        Z0.b bVar = new Z0.b(0L, i);
        this.f10655d = bVar;
        this.f10656e = bVar;
        this.f10657f = bVar;
    }

    public static Z0.b d(Z0.b bVar, long j5, ByteBuffer byteBuffer, int i) {
        while (j5 >= bVar.f2829m) {
            bVar = (Z0.b) bVar.f2831o;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (bVar.f2829m - j5));
            B0.a aVar = (B0.a) bVar.f2830n;
            byteBuffer.put(aVar.f181a, ((int) (j5 - bVar.f2828l)) + aVar.f182b, iMin);
            i -= iMin;
            j5 += (long) iMin;
            if (j5 == bVar.f2829m) {
                bVar = (Z0.b) bVar.f2831o;
            }
        }
        return bVar;
    }

    public static Z0.b e(Z0.b bVar, long j5, byte[] bArr, int i) {
        while (j5 >= bVar.f2829m) {
            bVar = (Z0.b) bVar.f2831o;
        }
        int i5 = i;
        while (i5 > 0) {
            int iMin = Math.min(i5, (int) (bVar.f2829m - j5));
            B0.a aVar = (B0.a) bVar.f2830n;
            System.arraycopy(aVar.f181a, ((int) (j5 - bVar.f2828l)) + aVar.f182b, bArr, i - i5, iMin);
            i5 -= iMin;
            j5 += (long) iMin;
            if (j5 == bVar.f2829m) {
                bVar = (Z0.b) bVar.f2831o;
            }
        }
        return bVar;
    }

    public static Z0.b f(Z0.b bVar, g0.e eVar, C0324d c0324d, C0363p c0363p) {
        int iB;
        if (eVar.e(1073741824)) {
            long j5 = c0324d.f5188b;
            c0363p.E(1);
            Z0.b bVarE = e(bVar, j5, c0363p.f5313a, 1);
            long j6 = j5 + 1;
            byte b4 = c0363p.f5313a[0];
            boolean z4 = (b4 & 128) != 0;
            int i = b4 & 127;
            C0118a c0118a = eVar.f5786o;
            byte[] bArr = (byte[]) c0118a.f1799e;
            if (bArr == null) {
                c0118a.f1799e = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            bVar = e(bVarE, j6, (byte[]) c0118a.f1799e, i);
            long j7 = j6 + ((long) i);
            if (z4) {
                c0363p.E(2);
                bVar = e(bVar, j7, c0363p.f5313a, 2);
                j7 += 2;
                iB = c0363p.B();
            } else {
                iB = 1;
            }
            int[] iArr = (int[]) c0118a.f1801g;
            if (iArr == null || iArr.length < iB) {
                iArr = new int[iB];
            }
            int[] iArr2 = (int[]) c0118a.f1802h;
            if (iArr2 == null || iArr2.length < iB) {
                iArr2 = new int[iB];
            }
            if (z4) {
                int i5 = iB * 6;
                c0363p.E(i5);
                bVar = e(bVar, j7, c0363p.f5313a, i5);
                j7 += (long) i5;
                c0363p.H(0);
                for (int i6 = 0; i6 < iB; i6++) {
                    iArr[i6] = c0363p.B();
                    iArr2[i6] = c0363p.z();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c0324d.f5187a - ((int) (j7 - c0324d.f5188b));
            }
            F0.J j8 = (F0.J) c0324d.f5189c;
            int i7 = AbstractC0370w.f5326a;
            byte[] bArr2 = j8.f700b;
            byte[] bArr3 = (byte[]) c0118a.f1799e;
            c0118a.f1796b = iB;
            c0118a.f1801g = iArr;
            c0118a.f1802h = iArr2;
            c0118a.f1800f = bArr2;
            c0118a.f1799e = bArr3;
            int i8 = j8.f699a;
            c0118a.f1795a = i8;
            int i9 = j8.f701c;
            c0118a.f1797c = i9;
            int i10 = j8.f702d;
            c0118a.f1798d = i10;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) c0118a.i;
            cryptoInfo.numSubSamples = iB;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i8;
            if (AbstractC0370w.f5326a >= 24) {
                Z1.c cVar = (Z1.c) c0118a.f1803j;
                cVar.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) cVar.f2997m;
                pattern.set(i9, i10);
                ((MediaCodec.CryptoInfo) cVar.f2996l).setPattern(pattern);
            }
            long j9 = c0324d.f5188b;
            int i11 = (int) (j7 - j9);
            c0324d.f5188b = j9 + ((long) i11);
            c0324d.f5187a -= i11;
        }
        if (!eVar.e(268435456)) {
            eVar.j(c0324d.f5187a);
            return d(bVar, c0324d.f5188b, eVar.f5787p, c0324d.f5187a);
        }
        c0363p.E(4);
        Z0.b bVarE2 = e(bVar, c0324d.f5188b, c0363p.f5313a, 4);
        int iZ = c0363p.z();
        c0324d.f5188b += 4;
        c0324d.f5187a -= 4;
        eVar.j(iZ);
        Z0.b bVarD = d(bVarE2, c0324d.f5188b, eVar.f5787p, iZ);
        c0324d.f5188b += (long) iZ;
        int i12 = c0324d.f5187a - iZ;
        c0324d.f5187a = i12;
        ByteBuffer byteBuffer = eVar.f5790s;
        if (byteBuffer == null || byteBuffer.capacity() < i12) {
            eVar.f5790s = ByteBuffer.allocate(i12);
        } else {
            eVar.f5790s.clear();
        }
        return d(bVarD, c0324d.f5188b, eVar.f5790s, c0324d.f5187a);
    }

    public final void a(Z0.b bVar) {
        if (((B0.a) bVar.f2830n) == null) {
            return;
        }
        B0.f fVar = this.f10652a;
        synchronized (fVar) {
            Z0.b bVar2 = bVar;
            while (bVar2 != null) {
                try {
                    B0.a[] aVarArr = fVar.f196f;
                    int i = fVar.f195e;
                    fVar.f195e = i + 1;
                    B0.a aVar = (B0.a) bVar2.f2830n;
                    aVar.getClass();
                    aVarArr[i] = aVar;
                    fVar.f194d--;
                    bVar2 = (Z0.b) bVar2.f2831o;
                    if (bVar2 == null || ((B0.a) bVar2.f2830n) == null) {
                        bVar2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            fVar.notifyAll();
        }
        bVar.f2830n = null;
        bVar.f2831o = null;
    }

    public final void b(long j5) {
        Z0.b bVar;
        if (j5 == -1) {
            return;
        }
        while (true) {
            bVar = this.f10655d;
            if (j5 < bVar.f2829m) {
                break;
            }
            B0.f fVar = this.f10652a;
            B0.a aVar = (B0.a) bVar.f2830n;
            synchronized (fVar) {
                B0.a[] aVarArr = fVar.f196f;
                int i = fVar.f195e;
                fVar.f195e = i + 1;
                aVarArr[i] = aVar;
                fVar.f194d--;
                fVar.notifyAll();
            }
            Z0.b bVar2 = this.f10655d;
            bVar2.f2830n = null;
            Z0.b bVar3 = (Z0.b) bVar2.f2831o;
            bVar2.f2831o = null;
            this.f10655d = bVar3;
        }
        if (this.f10656e.f2828l < bVar.f2828l) {
            this.f10656e = bVar;
        }
    }

    public final int c(int i) {
        B0.a aVar;
        Z0.b bVar = this.f10657f;
        if (((B0.a) bVar.f2830n) == null) {
            B0.f fVar = this.f10652a;
            synchronized (fVar) {
                try {
                    int i5 = fVar.f194d + 1;
                    fVar.f194d = i5;
                    int i6 = fVar.f195e;
                    if (i6 > 0) {
                        B0.a[] aVarArr = fVar.f196f;
                        int i7 = i6 - 1;
                        fVar.f195e = i7;
                        aVar = aVarArr[i7];
                        aVar.getClass();
                        fVar.f196f[fVar.f195e] = null;
                    } else {
                        B0.a aVar2 = new B0.a(0, new byte[fVar.f192b]);
                        B0.a[] aVarArr2 = fVar.f196f;
                        if (i5 > aVarArr2.length) {
                            fVar.f196f = (B0.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Z0.b bVar2 = new Z0.b(this.f10657f.f2829m, this.f10653b);
            bVar.f2830n = aVar;
            bVar.f2831o = bVar2;
        }
        return Math.min(i, (int) (this.f10657f.f2829m - this.f10658g));
    }
}
