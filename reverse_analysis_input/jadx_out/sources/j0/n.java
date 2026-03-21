package j0;

import android.media.AudioTrack;
import androidx.lifecycle.E;
import d0.AbstractC0370w;
import d0.C0365r;
import d0.InterfaceC0348a;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f7294A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f7295B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f7296C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f7297D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f7298E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f7299F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f7300G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f7301H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C0365r f7302I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f7303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f7304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f7305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f7307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7310h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Method f7314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f7315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f7318q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f7320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f7322u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7323v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f7325x;
    public long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f7326z;

    public n(E e5) {
        this.f7303a = e5;
        try {
            this.f7314m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f7304b = new long[10];
        this.f7302I = InterfaceC0348a.f5270a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022e A[Catch: Exception -> 0x0244, TRY_LEAVE, TryCatch #0 {Exception -> 0x0244, blocks: (B:88:0x0205, B:90:0x022e), top: B:132:0x0205 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r28) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.n.a(boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r11 = this;
            d0.r r0 = r11.f7302I
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r11.f7325x
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 2
            if (r2 == 0) goto L46
            android.media.AudioTrack r2 = r11.f7305c
            r2.getClass()
            int r2 = r2.getPlayState()
            if (r2 != r3) goto L23
            long r0 = r11.f7326z
            return r0
        L23:
            long r0 = d0.AbstractC0370w.M(r0)
            long r2 = r11.f7325x
            long r0 = r0 - r2
            float r2 = r11.i
            long r3 = d0.AbstractC0370w.x(r0, r2)
            int r0 = r11.f7308f
            long r5 = (long) r0
            r7 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r9 = java.math.RoundingMode.UP
            long r0 = d0.AbstractC0370w.U(r3, r5, r7, r9)
            long r2 = r11.f7294A
            long r4 = r11.f7326z
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L46:
            long r6 = r11.f7319r
            long r6 = r0 - r6
            r8 = 5
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto Lb7
            android.media.AudioTrack r2 = r11.f7305c
            r2.getClass()
            int r6 = r2.getPlayState()
            r7 = 1
            if (r6 != r7) goto L5d
            goto Lb5
        L5d:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            boolean r2 = r11.f7309g
            r9 = 0
            if (r2 == 0) goto L7b
            if (r6 != r3) goto L78
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L78
            long r2 = r11.f7320s
            r11.f7322u = r2
        L78:
            long r2 = r11.f7322u
            long r7 = r7 + r2
        L7b:
            int r2 = d0.AbstractC0370w.f5326a
            r3 = 29
            if (r2 > r3) goto L99
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L97
            long r2 = r11.f7320s
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L97
            r2 = 3
            if (r6 != r2) goto L97
            long r2 = r11.y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb5
            r11.y = r0
            goto Lb5
        L97:
            r11.y = r4
        L99:
            long r2 = r11.f7320s
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto Lb3
            boolean r4 = r11.f7300G
            if (r4 == 0) goto Lac
            long r4 = r11.f7301H
            long r4 = r4 + r2
            r11.f7301H = r4
            r2 = 0
            r11.f7300G = r2
            goto Lb3
        Lac:
            long r2 = r11.f7321t
            r4 = 1
            long r2 = r2 + r4
            r11.f7321t = r2
        Lb3:
            r11.f7320s = r7
        Lb5:
            r11.f7319r = r0
        Lb7:
            long r0 = r11.f7320s
            long r2 = r11.f7301H
            long r0 = r0 + r2
            long r2 = r11.f7321t
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.n.b():long");
    }

    public final boolean c(long j5) {
        long jA = a(false);
        int i = this.f7308f;
        int i5 = AbstractC0370w.f5326a;
        if (j5 <= AbstractC0370w.U(jA, i, 1000000L, RoundingMode.UP)) {
            if (!this.f7309g) {
                return false;
            }
            AudioTrack audioTrack = this.f7305c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || b() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f7312k = 0L;
        this.f7324w = 0;
        this.f7323v = 0;
        this.f7313l = 0L;
        this.f7296C = 0L;
        this.f7299F = 0L;
        this.f7311j = false;
    }
}
