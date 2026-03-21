package D0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0027b f508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f515h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f523q;

    public v(Context context) {
        DisplayManager displayManager;
        C0027b c0027b = new C0027b();
        c0027b.f389a = new C0026a();
        c0027b.f390b = new C0026a();
        c0027b.f392d = -9223372036854775807L;
        this.f508a = c0027b;
        t tVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new t(this, displayManager, 0);
        this.f509b = tVar;
        this.f510c = tVar != null ? u.f503p : null;
        this.f517k = -9223372036854775807L;
        this.f518l = -9223372036854775807L;
        this.f513f = -1.0f;
        this.i = 1.0f;
        this.f516j = 0;
    }

    public static void a(v vVar, Display display) {
        vVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            vVar.f517k = refreshRate;
            vVar.f518l = (refreshRate * 80) / 100;
        } else {
            AbstractC0360m.y("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            vVar.f517k = -9223372036854775807L;
            vVar.f518l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (AbstractC0370w.f5326a < 30 || (surface = this.f512e) == null || this.f516j == Integer.MIN_VALUE || this.f515h == 0.0f) {
            return;
        }
        this.f515h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e5) {
            AbstractC0360m.m("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = d0.AbstractC0370w.f5326a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f512e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            D0.b r0 = r9.f508a
            D0.a r2 = r0.f389a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            D0.a r2 = r0.f389a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            D0.a r2 = r0.f389a
            long r4 = r2.f385e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f386f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f513f
        L3b:
            float r4 = r9.f514g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            return
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            D0.a r1 = r0.f389a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            D0.a r1 = r0.f389a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            D0.a r0 = r0.f389a
            long r0 = r0.f386f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f514g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f393e
            if (r0 < r1) goto L8d
        L87:
            r9.f514g = r2
            r0 = 0
            r9.d(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.v.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r5) {
        /*
            r4 = this;
            int r0 = d0.AbstractC0370w.f5326a
            r1 = 30
            if (r0 < r1) goto L41
            android.view.Surface r0 = r4.f512e
            if (r0 == 0) goto L41
            int r1 = r4.f516j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L41
        L11:
            boolean r1 = r4.f511d
            r2 = 0
            if (r1 == 0) goto L22
            float r1 = r4.f514g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            float r3 = r4.i
            float r1 = r1 * r3
            goto L23
        L22:
            r1 = r2
        L23:
            if (r5 != 0) goto L2c
            float r5 = r4.f515h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2c
            return
        L2c:
            r4.f515h = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L34
            r5 = 0
            goto L35
        L34:
            r5 = 1
        L35:
            A3.b.q(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L39
            goto L41
        L39:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            d0.AbstractC0360m.m(r0, r1, r5)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.v.d(boolean):void");
    }
}
