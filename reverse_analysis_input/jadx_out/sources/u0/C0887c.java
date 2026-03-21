package u0;

import F0.K;
import F0.s;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import java.util.Locale;
import t0.C0851h;
import t0.C0853j;

/* JADX INFO: renamed from: u0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0887c implements i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f10162h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0853j f10163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public K f10166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10169g;

    public C0887c(C0853j c0853j) {
        this.f10163a = c0853j;
        String str = c0853j.f9904c.f3424n;
        str.getClass();
        this.f10164b = "audio/amr-wb".equals(str);
        this.f10165c = c0853j.f9903b;
        this.f10167e = -9223372036854775807L;
        this.f10169g = -1;
        this.f10168f = 0L;
    }

    @Override // u0.i
    public final void a(C0363p c0363p, long j5, int i5, boolean z4) {
        int iA;
        AbstractC0360m.i(this.f10166d);
        int i6 = this.f10169g;
        if (i6 != -1 && i5 != (iA = C0851h.a(i6))) {
            int i7 = AbstractC0370w.f5326a;
            Locale locale = Locale.US;
            AbstractC0360m.y("RtpAmrReader", "Received RTP packet with unexpected sequence number. Expected: " + iA + "; received: " + i5 + ".");
        }
        c0363p.I(1);
        int iF = (c0363p.f() >> 3) & 15;
        boolean z5 = (iF >= 0 && iF <= 8) || iF == 15;
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        boolean z6 = this.f10164b;
        sb.append(z6 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(iF);
        AbstractC0360m.b(sb.toString(), z5);
        int i8 = z6 ? i[iF] : f10162h[iF];
        int iA2 = c0363p.a();
        AbstractC0360m.b("compound payload not supported currently", iA2 == i8);
        this.f10166d.a(c0363p, iA2, 0);
        this.f10166d.b(i4.a.Z(this.f10168f, j5, this.f10167e, this.f10165c), 1, iA2, 0, null);
        this.f10169g = i5;
    }

    @Override // u0.i
    public final void b(long j5, long j6) {
        this.f10167e = j5;
        this.f10168f = j6;
    }

    @Override // u0.i
    public final void c(long j5) {
        this.f10167e = j5;
    }

    @Override // u0.i
    public final void d(s sVar, int i5) {
        K k4 = sVar.k(i5, 1);
        this.f10166d = k4;
        k4.c(this.f10163a.f9904c);
    }
}
