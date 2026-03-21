package l1;

import F0.C0066m;
import d0.AbstractC0370w;
import d0.C0363p;
import d0.C0368u;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0368u f8182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f8183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8188h;
    public long i;

    public x(int i) {
        this.f8181a = i;
        switch (i) {
            case 1:
                this.f8182b = new C0368u(0L);
                this.f8187g = -9223372036854775807L;
                this.f8188h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.f8183c = new C0363p();
                break;
            default:
                this.f8182b = new C0368u(0L);
                this.f8187g = -9223372036854775807L;
                this.f8188h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.f8183c = new C0363p();
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(C0363p c0363p) {
        int i = c0363p.f5314b;
        if (c0363p.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c0363p.g(bArr, 0, 9);
        c0363p.H(i);
        byte b4 = bArr[0];
        if ((b4 & 196) == 68) {
            byte b5 = bArr[2];
            if ((b5 & 4) == 4) {
                byte b6 = bArr[4];
                if ((b6 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j5 = b4;
                    long j6 = b5;
                    return ((j6 & 3) << 13) | ((j5 & 3) << 28) | (((56 & j5) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j6 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b6) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(C0066m c0066m) {
        switch (this.f8181a) {
            case 0:
                byte[] bArr = AbstractC0370w.f5331f;
                C0363p c0363p = this.f8183c;
                c0363p.getClass();
                c0363p.F(bArr.length, bArr);
                this.f8184d = true;
                c0066m.f801q = 0;
                break;
            default:
                byte[] bArr2 = AbstractC0370w.f5331f;
                C0363p c0363p2 = this.f8183c;
                c0363p2.getClass();
                c0363p2.F(bArr2.length, bArr2);
                this.f8184d = true;
                c0066m.f801q = 0;
                break;
        }
    }
}
