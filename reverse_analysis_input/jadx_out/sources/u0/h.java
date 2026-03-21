package u0;

import F0.AbstractC0055b;
import F0.K;
import F0.s;
import a0.C0189o;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import m.B0;
import t0.C0851h;
import t0.C0853j;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0853j f10206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f10207b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10209d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10212g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10208c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10210e = -1;

    public h(C0853j c0853j) {
        this.f10206a = c0853j;
    }

    @Override // u0.i
    public final void a(C0363p c0363p, long j5, int i, boolean z4) {
        AbstractC0360m.i(this.f10207b);
        if (!this.f10211f) {
            int i5 = c0363p.f5314b;
            AbstractC0360m.b("ID Header has insufficient data", c0363p.f5315c > 18);
            AbstractC0360m.b("ID Header missing", c0363p.t(8, StandardCharsets.UTF_8).equals("OpusHead"));
            AbstractC0360m.b("version number must always be 1", c0363p.v() == 1);
            c0363p.H(i5);
            ArrayList arrayListC = AbstractC0055b.c(c0363p.f5313a);
            C0189o c0189oA = this.f10206a.f9904c.a();
            c0189oA.f3390p = arrayListC;
            B0.k(c0189oA, this.f10207b);
            this.f10211f = true;
        } else if (this.f10212g) {
            int iA = C0851h.a(this.f10210e);
            if (i != iA) {
                int i6 = AbstractC0370w.f5326a;
                Locale locale = Locale.US;
                AbstractC0360m.y("RtpOpusReader", "Received RTP packet with unexpected sequence number. Expected: " + iA + "; received: " + i + ".");
            }
            int iA2 = c0363p.a();
            this.f10207b.a(c0363p, iA2, 0);
            this.f10207b.b(i4.a.Z(this.f10209d, j5, this.f10208c, 48000), 1, iA2, 0, null);
        } else {
            AbstractC0360m.b("Comment Header has insufficient data", c0363p.f5315c >= 8);
            AbstractC0360m.b("Comment Header should follow ID Header", c0363p.t(8, StandardCharsets.UTF_8).equals("OpusTags"));
            this.f10212g = true;
        }
        this.f10210e = i;
    }

    @Override // u0.i
    public final void b(long j5, long j6) {
        this.f10208c = j5;
        this.f10209d = j6;
    }

    @Override // u0.i
    public final void c(long j5) {
        this.f10208c = j5;
    }

    @Override // u0.i
    public final void d(s sVar, int i) {
        K k4 = sVar.k(i, 1);
        this.f10207b = k4;
        k4.c(this.f10206a.f9904c);
    }
}
