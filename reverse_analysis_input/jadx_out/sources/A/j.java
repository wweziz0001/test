package A;

import F0.C0066m;
import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import d0.AbstractC0349b;
import d0.C0362o;
import d0.C0363p;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m.B0;
import q0.w;
import t0.p;
import t0.q;
import x0.e0;
import x0.f0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements w, f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f26l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f27m;

    public /* synthetic */ j(int i, Object obj) {
        this.f26l = i;
        this.f27m = obj;
    }

    @Override // x0.f0
    public void a() throws K3.b {
        K3.b bVar = ((q) this.f27m).f9960w;
        if (bVar != null) {
            throw bVar;
        }
    }

    @Override // q0.w
    public boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // q0.w
    public int c() {
        if (((MediaCodecInfo[]) this.f27m) == null) {
            this.f27m = new MediaCodecList(this.f26l).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f27m).length;
    }

    @Override // x0.f0
    public int d(long j5) {
        q qVar = (q) this.f27m;
        if (qVar.f9943B) {
            return -3;
        }
        p pVar = (p) qVar.f9953p.get(this.f26l);
        e0 e0Var = pVar.f9938c;
        int iP = e0Var.p(j5, pVar.f9939d);
        e0Var.C(iP);
        return iP;
    }

    @Override // q0.w
    public MediaCodecInfo e(int i) {
        if (((MediaCodecInfo[]) this.f27m) == null) {
            this.f27m = new MediaCodecList(this.f26l).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f27m)[i];
    }

    public void f(long j5) {
        int i = this.f26l;
        long[] jArr = (long[]) this.f27m;
        if (i == jArr.length) {
            this.f27m = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = (long[]) this.f27m;
        int i5 = this.f26l;
        this.f26l = i5 + 1;
        jArr2[i5] = j5;
    }

    public void g(long[] jArr) {
        int length = this.f26l + jArr.length;
        long[] jArr2 = (long[]) this.f27m;
        if (length > jArr2.length) {
            this.f27m = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f27m, this.f26l, jArr.length);
        this.f26l = length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l1.F h(int r6, d0.C0362o r7) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.j.h(int, d0.o):l1.F");
    }

    public long i(int i) {
        if (i >= 0 && i < this.f26l) {
            return ((long[]) this.f27m)[i];
        }
        StringBuilder sbJ = B0.j(i, "Invalid index ", ", size is ");
        sbJ.append(this.f26l);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    @Override // x0.f0
    public boolean isReady() {
        q qVar = (q) this.f27m;
        if (!qVar.f9943B) {
            p pVar = (p) qVar.f9953p.get(this.f26l);
            if (pVar.f9938c.s(pVar.f9939d)) {
                return true;
            }
        }
        return false;
    }

    @Override // q0.w
    public boolean j(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // x0.f0
    public int k(Z1.e eVar, g0.e eVar2, int i) {
        q qVar = (q) this.f27m;
        if (qVar.f9943B) {
            return -3;
        }
        p pVar = (p) qVar.f9953p.get(this.f26l);
        return pVar.f9938c.x(eVar, eVar2, i, pVar.f9939d);
    }

    @Override // q0.w
    public boolean l() {
        return true;
    }

    public List m(C0362o c0362o) {
        String str;
        int i;
        List listSingletonList;
        boolean zN = n(32);
        List list = (List) this.f27m;
        if (zN) {
            return list;
        }
        C0363p c0363p = new C0363p((byte[]) c0362o.f5309o);
        while (c0363p.a() > 0) {
            int iV = c0363p.v();
            int iV2 = c0363p.f5314b + c0363p.v();
            if (iV == 134) {
                ArrayList arrayList = new ArrayList();
                int iV3 = c0363p.v() & 31;
                for (int i5 = 0; i5 < iV3; i5++) {
                    String strT = c0363p.t(3, StandardCharsets.UTF_8);
                    int iV4 = c0363p.v();
                    boolean z4 = (iV4 & 128) != 0;
                    if (z4) {
                        i = iV4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bV = (byte) c0363p.v();
                    c0363p.I(1);
                    if (z4) {
                        boolean z5 = (bV & 64) != 0;
                        byte[] bArr = AbstractC0349b.f5271a;
                        listSingletonList = Collections.singletonList(z5 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C0189o c0189o = new C0189o();
                    c0189o.f3387m = AbstractC0156G.m(str);
                    c0189o.f3379d = strT;
                    c0189o.f3371G = i;
                    c0189o.f3390p = listSingletonList;
                    arrayList.add(new C0190p(c0189o));
                }
                list = arrayList;
            }
            c0363p.H(iV2);
        }
        return list;
    }

    public boolean n(int i) {
        return (i & this.f26l) != 0;
    }

    public long o(C0066m c0066m) {
        C0363p c0363p = (C0363p) this.f27m;
        int i = 0;
        c0066m.t(c0363p.f5313a, 0, 1, false);
        int i5 = c0363p.f5313a[0] & 255;
        if (i5 == 0) {
            return Long.MIN_VALUE;
        }
        int i6 = 128;
        int i7 = 0;
        while ((i5 & i6) == 0) {
            i6 >>= 1;
            i7++;
        }
        int i8 = i5 & (~i6);
        c0066m.t(c0363p.f5313a, 1, i7, false);
        while (i < i7) {
            i++;
            i8 = (c0363p.f5313a[i] & 255) + (i8 << 8);
        }
        this.f26l = i7 + 1 + this.f26l;
        return i8;
    }

    public /* synthetic */ j(Object obj, int i) {
        this.f27m = obj;
        this.f26l = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(int i, byte b4) {
        this(32, 4);
        switch (i) {
            case 4:
                break;
            default:
                this.f27m = new C0363p(8);
                break;
        }
    }

    public j(int i, int i5) {
        switch (i5) {
            case 4:
                this.f27m = new long[i];
                return;
            default:
                if (i > 0) {
                    this.f27m = new Object[i];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }
}
