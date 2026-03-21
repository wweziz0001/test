package u0;

import F0.K;
import F0.s;
import a0.C0157H;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import e0.n;
import java.util.Locale;
import java.util.TreeMap;
import t0.C0851h;
import t0.C0853j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10189h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10190j;

    public e(String str, String str2, long j5, int i, int i5, int i6, int[] iArr, TreeMap treeMap) {
        this.f10182a = 2;
        this.f10183b = str;
        this.f10184c = str2;
        this.f10188g = j5;
        this.f10190j = 0L;
        this.f10187f = i;
        this.f10189h = i5;
        this.i = i6;
        this.f10185d = iArr;
        this.f10186e = treeMap;
    }

    @Override // u0.i
    public void a(C0363p c0363p, long j5, int i, boolean z4) throws C0157H {
        int i5;
        Object obj = this.f10183b;
        int i6 = 1;
        switch (this.f10182a) {
            case 0:
                try {
                    int i7 = c0363p.f5313a[0] & 31;
                    AbstractC0360m.i((K) this.f10186e);
                    if (i7 > 0 && i7 < 24) {
                        int iA = c0363p.a();
                        this.i = g() + this.i;
                        ((K) this.f10186e).a(c0363p, iA, 0);
                        this.i += iA;
                        this.f10187f = (c0363p.f5313a[0] & 31) == 5 ? 1 : 0;
                    } else if (i7 == 24) {
                        c0363p.v();
                        while (c0363p.a() > 4) {
                            int iB = c0363p.B();
                            this.i = g() + this.i;
                            ((K) this.f10186e).a(c0363p, iB, 0);
                            this.i += iB;
                        }
                        this.f10187f = 0;
                    } else {
                        if (i7 != 28) {
                            throw C0157H.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i7)), null);
                        }
                        byte[] bArr = c0363p.f5313a;
                        byte b4 = bArr[0];
                        byte b5 = bArr[1];
                        int i8 = (b4 & 224) | (b5 & 31);
                        boolean z5 = (b5 & 128) > 0;
                        boolean z6 = (b5 & 64) > 0;
                        C0363p c0363p2 = (C0363p) obj;
                        if (z5) {
                            this.i = g() + this.i;
                            byte[] bArr2 = c0363p.f5313a;
                            i5 = 1;
                            bArr2[1] = (byte) i8;
                            c0363p2.getClass();
                            c0363p2.F(bArr2.length, bArr2);
                            c0363p2.H(1);
                        } else {
                            i5 = 1;
                            int iA2 = C0851h.a(this.f10189h);
                            if (i != iA2) {
                                int i9 = AbstractC0370w.f5326a;
                                Locale locale = Locale.US;
                                AbstractC0360m.y("RtpH264Reader", "Received RTP packet with unexpected sequence number. Expected: " + iA2 + "; received: " + i + ". Dropping packet.");
                            } else {
                                byte[] bArr3 = c0363p.f5313a;
                                c0363p2.getClass();
                                c0363p2.F(bArr3.length, bArr3);
                                c0363p2.H(2);
                            }
                        }
                        int iA3 = c0363p2.a();
                        ((K) this.f10186e).a(c0363p2, iA3, 0);
                        this.i += iA3;
                        if (z6) {
                            this.f10187f = (i8 & 31) == 5 ? i5 : 0;
                        }
                    }
                    if (z4) {
                        if (this.f10188g == -9223372036854775807L) {
                            this.f10188g = j5;
                        }
                        ((K) this.f10186e).b(i4.a.Z(this.f10190j, j5, this.f10188g, 90000), this.f10187f, this.i, 0, null);
                        this.i = 0;
                    }
                    this.f10189h = i;
                    return;
                } catch (IndexOutOfBoundsException e5) {
                    throw C0157H.b(null, e5);
                }
            default:
                byte[] bArr4 = c0363p.f5313a;
                if (bArr4.length == 0) {
                    throw C0157H.b("Empty RTP data packet.", null);
                }
                int i10 = (bArr4[0] >> 1) & 63;
                AbstractC0360m.i((K) this.f10186e);
                C0363p c0363p3 = (C0363p) this.f10184c;
                if (i10 >= 0 && i10 < 48) {
                    int iA4 = c0363p.a();
                    int i11 = this.i;
                    c0363p3.H(0);
                    int iA5 = c0363p3.a();
                    K k4 = (K) this.f10186e;
                    k4.getClass();
                    k4.a(c0363p3, iA5, 0);
                    this.i = iA5 + i11;
                    ((K) this.f10186e).a(c0363p, iA4, 0);
                    this.i += iA4;
                    int i12 = (c0363p.f5313a[0] >> 1) & 63;
                    if (i12 != 19 && i12 != 20) {
                        i6 = 0;
                    }
                    this.f10187f = i6;
                } else {
                    if (i10 == 48) {
                        throw new UnsupportedOperationException("need to implement processAggregationPacket");
                    }
                    if (i10 != 49) {
                        throw C0157H.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i10)), null);
                    }
                    byte[] bArr5 = c0363p.f5313a;
                    if (bArr5.length < 3) {
                        throw C0157H.b("Malformed FU header.", null);
                    }
                    int i13 = bArr5[1] & 7;
                    byte b6 = bArr5[2];
                    int i14 = b6 & 63;
                    boolean z7 = (b6 & 128) > 0;
                    boolean z8 = (b6 & 64) > 0;
                    C0363p c0363p4 = (C0363p) obj;
                    if (z7) {
                        int i15 = this.i;
                        c0363p3.H(0);
                        int iA6 = c0363p3.a();
                        K k5 = (K) this.f10186e;
                        k5.getClass();
                        k5.a(c0363p3, iA6, 0);
                        this.i = iA6 + i15;
                        byte[] bArr6 = c0363p.f5313a;
                        bArr6[1] = (byte) ((i14 << 1) & 127);
                        bArr6[2] = (byte) i13;
                        c0363p4.getClass();
                        c0363p4.F(bArr6.length, bArr6);
                        c0363p4.H(1);
                    } else {
                        int i16 = (this.f10189h + 1) % 65535;
                        if (i != i16) {
                            int i17 = AbstractC0370w.f5326a;
                            Locale locale2 = Locale.US;
                            AbstractC0360m.y("RtpH265Reader", "Received RTP packet with unexpected sequence number. Expected: " + i16 + "; received: " + i + ". Dropping packet.");
                        } else {
                            c0363p4.getClass();
                            c0363p4.F(bArr5.length, bArr5);
                            c0363p4.H(3);
                        }
                    }
                    int iA7 = c0363p4.a();
                    ((K) this.f10186e).a(c0363p4, iA7, 0);
                    this.i += iA7;
                    if (z8) {
                        this.f10187f = (i14 == 19 || i14 == 20) ? 1 : 0;
                    }
                }
                if (z4) {
                    if (this.f10188g == -9223372036854775807L) {
                        this.f10188g = j5;
                    }
                    ((K) this.f10186e).b(i4.a.Z(this.f10190j, j5, this.f10188g, 90000), this.f10187f, this.i, 0, null);
                    this.i = 0;
                }
                this.f10189h = i;
                return;
        }
    }

    @Override // u0.i
    public void b(long j5, long j6) {
        switch (this.f10182a) {
            case 0:
                this.f10188g = j5;
                this.i = 0;
                this.f10190j = j6;
                break;
            default:
                this.f10188g = j5;
                this.i = 0;
                this.f10190j = j6;
                break;
        }
    }

    @Override // u0.i
    public void c(long j5) {
        int i = this.f10182a;
    }

    @Override // u0.i
    public void d(s sVar, int i) {
        switch (this.f10182a) {
            case 0:
                K k4 = sVar.k(i, 2);
                this.f10186e = k4;
                int i5 = AbstractC0370w.f5326a;
                k4.c(((C0853j) this.f10185d).f9904c);
                break;
            default:
                K k5 = sVar.k(i, 2);
                this.f10186e = k5;
                k5.c(((C0853j) this.f10185d).f9904c);
                break;
        }
    }

    public int g() {
        C0363p c0363p = (C0363p) this.f10184c;
        c0363p.H(0);
        int iA = c0363p.a();
        K k4 = (K) this.f10186e;
        k4.getClass();
        k4.a(c0363p, iA, 0);
        return iA;
    }

    public e(C0853j c0853j, int i) {
        this.f10182a = i;
        switch (i) {
            case 1:
                this.f10183b = new C0363p();
                this.f10184c = new C0363p(n.f5545a);
                this.f10185d = c0853j;
                this.f10188g = -9223372036854775807L;
                this.f10189h = -1;
                break;
            default:
                this.f10184c = new C0363p(n.f5545a);
                this.f10185d = c0853j;
                this.f10183b = new C0363p();
                this.f10188g = -9223372036854775807L;
                this.f10189h = -1;
                break;
        }
    }

    private final void e(long j5) {
    }

    private final void f(long j5) {
    }
}
