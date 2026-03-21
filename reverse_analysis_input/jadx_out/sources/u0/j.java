package u0;

import F0.K;
import F0.s;
import android.util.Log;
import d0.AbstractC0370w;
import d0.C0363p;
import java.util.Locale;
import t0.C0851h;
import t0.C0853j;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0853j f10213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f10214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10215c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10216d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10217e = -1;

    public j(C0853j c0853j) {
        this.f10213a = c0853j;
    }

    @Override // u0.i
    public final void a(C0363p c0363p, long j5, int i, boolean z4) {
        int iA;
        this.f10214b.getClass();
        int i5 = this.f10217e;
        if (i5 != -1 && i != (iA = C0851h.a(i5))) {
            int i6 = AbstractC0370w.f5326a;
            Locale locale = Locale.US;
            Log.w("RtpPcmReader", "Received RTP packet with unexpected sequence number. Expected: " + iA + "; received: " + i + ".");
        }
        long jZ = i4.a.Z(this.f10216d, j5, this.f10215c, this.f10213a.f9903b);
        int iA2 = c0363p.a();
        this.f10214b.a(c0363p, iA2, 0);
        this.f10214b.b(jZ, 1, iA2, 0, null);
        this.f10217e = i;
    }

    @Override // u0.i
    public final void b(long j5, long j6) {
        this.f10215c = j5;
        this.f10216d = j6;
    }

    @Override // u0.i
    public final void c(long j5) {
        this.f10215c = j5;
    }

    @Override // u0.i
    public final void d(s sVar, int i) {
        K k4 = sVar.k(i, 1);
        this.f10214b = k4;
        k4.c(this.f10213a.f9904c);
    }
}
