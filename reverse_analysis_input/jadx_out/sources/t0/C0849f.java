package t0;

import a.AbstractC0149a;
import android.os.SystemClock;
import d0.AbstractC0360m;
import d0.C0363p;
import java.util.TreeSet;
import m3.C0669c;
import u0.C0885a;
import u0.C0886b;
import u0.C0887c;
import u0.C0888d;

/* JADX INFO: renamed from: t0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0849f implements F0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0.i f9874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0363p f9875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f9876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0669c f9879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F0.s f9880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9881h;
    public volatile long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f9882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9885m;

    public C0849f(C0853j c0853j, int i) {
        u0.i c0888d;
        u0.i iVar;
        this.f9877d = i;
        String str = c0853j.f9904c.f3424n;
        str.getClass();
        switch (str) {
            case "video/3gpp":
                c0888d = new C0888d(c0853j, 0);
                iVar = c0888d;
                break;
            case "video/hevc":
                c0888d = new u0.e(c0853j, 1);
                iVar = c0888d;
                break;
            case "audio/amr-wb":
            case "audio/3gpp":
                c0888d = new C0887c(c0853j);
                iVar = c0888d;
                break;
            case "audio/mp4a-latm":
                c0888d = c0853j.f9906e.equals("MP4A-LATM") ? new u0.f(c0853j) : new C0885a(c0853j);
                iVar = c0888d;
                break;
            case "audio/ac3":
                c0888d = new C0886b(c0853j);
                iVar = c0888d;
                break;
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                c0888d = new u0.j(c0853j);
                iVar = c0888d;
                break;
            case "video/mp4v-es":
                c0888d = new u0.g(c0853j);
                iVar = c0888d;
                break;
            case "video/avc":
                c0888d = new u0.e(c0853j, 0);
                iVar = c0888d;
                break;
            case "audio/opus":
                c0888d = new u0.h(c0853j);
                iVar = c0888d;
                break;
            case "video/x-vnd.on2.vp8":
                c0888d = new u0.k(c0853j);
                iVar = c0888d;
                break;
            case "video/x-vnd.on2.vp9":
                c0888d = new C0888d(c0853j, 1);
                iVar = c0888d;
                break;
            default:
                iVar = null;
                break;
        }
        iVar.getClass();
        this.f9874a = iVar;
        this.f9875b = new C0363p(65507);
        this.f9876c = new C0363p();
        this.f9878e = new Object();
        this.f9879f = new C0669c();
        this.i = -9223372036854775807L;
        this.f9882j = -1;
        this.f9884l = -9223372036854775807L;
        this.f9885m = -9223372036854775807L;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        synchronized (this.f9878e) {
            try {
                if (!this.f9883k) {
                    this.f9883k = true;
                }
                this.f9884l = j5;
                this.f9885m = j6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.q
    public final int d(F0.r rVar, F0.u uVar) {
        byte[] bArr;
        this.f9880g.getClass();
        int i = rVar.read(this.f9875b.f5313a, 0, 65507);
        if (i == -1) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        this.f9875b.H(0);
        this.f9875b.G(i);
        C0363p c0363p = this.f9875b;
        C0851h c0851h = null;
        if (c0363p.a() >= 12) {
            int iV = c0363p.v();
            byte b4 = (byte) (iV >> 6);
            byte b5 = (byte) (iV & 15);
            boolean z4 = ((iV >> 4) & 1) == 1;
            if (b4 == 2) {
                int iV2 = c0363p.v();
                boolean z5 = ((iV2 >> 7) & 1) == 1;
                byte b6 = (byte) (iV2 & 127);
                int iB = c0363p.B();
                long jX = c0363p.x();
                int i5 = c0363p.i();
                byte[] bArr2 = C0851h.f9893g;
                if (b5 > 0) {
                    bArr = new byte[b5 * 4];
                    for (int i6 = 0; i6 < b5; i6++) {
                        c0363p.g(bArr, i6 * 4, 4);
                    }
                } else {
                    bArr = bArr2;
                }
                if (z4) {
                    c0363p.I(2);
                    short s4 = c0363p.s();
                    if (s4 != 0) {
                        c0363p.I(s4 * 4);
                    }
                }
                byte[] bArr3 = new byte[c0363p.a()];
                c0363p.g(bArr3, 0, c0363p.a());
                C0850g c0850g = new C0850g();
                c0850g.f9891f = bArr2;
                c0850g.f9892g = bArr2;
                c0850g.f9886a = z5;
                c0850g.f9887b = b6;
                AbstractC0360m.c(iB >= 0 && iB <= 65535);
                c0850g.f9888c = 65535 & iB;
                c0850g.f9889d = jX;
                c0850g.f9890e = i5;
                c0850g.f9891f = bArr;
                c0850g.f9892g = bArr3;
                c0851h = new C0851h(c0850g);
            }
        }
        if (c0851h == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = jElapsedRealtime - 30;
        C0669c c0669c = this.f9879f;
        synchronized (c0669c) {
            if (((TreeSet) c0669c.f8677d).size() >= 5000) {
                throw new IllegalStateException("Queue size limit of 5000 reached.");
            }
            int i7 = c0851h.f9896c;
            if (!c0669c.f8676c) {
                c0669c.d();
                c0669c.f8675b = AbstractC0149a.A(i7 - 1);
                c0669c.f8676c = true;
                c0669c.a(new C0852i(c0851h, jElapsedRealtime));
            } else if (Math.abs(C0669c.b(i7, C0851h.a(c0669c.f8674a))) >= 1000) {
                c0669c.f8675b = AbstractC0149a.A(i7 - 1);
                ((TreeSet) c0669c.f8677d).clear();
                c0669c.a(new C0852i(c0851h, jElapsedRealtime));
            } else if (C0669c.b(i7, c0669c.f8675b) > 0) {
                c0669c.a(new C0852i(c0851h, jElapsedRealtime));
            }
        }
        C0851h c0851hC = this.f9879f.c(j5);
        if (c0851hC == null) {
            return 0;
        }
        if (!this.f9881h) {
            if (this.i == -9223372036854775807L) {
                this.i = c0851hC.f9897d;
            }
            if (this.f9882j == -1) {
                this.f9882j = c0851hC.f9896c;
            }
            this.f9874a.c(this.i);
            this.f9881h = true;
        }
        synchronized (this.f9878e) {
            try {
                if (!this.f9883k) {
                    do {
                        C0363p c0363p2 = this.f9876c;
                        byte[] bArr4 = c0851hC.f9899f;
                        c0363p2.getClass();
                        c0363p2.F(bArr4.length, bArr4);
                        this.f9874a.a(this.f9876c, c0851hC.f9897d, c0851hC.f9896c, c0851hC.f9894a);
                        c0851hC = this.f9879f.c(j5);
                    } while (c0851hC != null);
                } else if (this.f9884l != -9223372036854775807L && this.f9885m != -9223372036854775807L) {
                    this.f9879f.d();
                    this.f9874a.b(this.f9884l, this.f9885m);
                    this.f9883k = false;
                    this.f9884l = -9223372036854775807L;
                    this.f9885m = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // F0.q
    public final boolean e(F0.r rVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // F0.q
    public final void j(F0.s sVar) {
        this.f9874a.d(sVar, this.f9877d);
        sVar.j();
        sVar.d(new F0.v(-9223372036854775807L));
        this.f9880g = sVar;
    }

    @Override // F0.q
    public final void release() {
    }
}
