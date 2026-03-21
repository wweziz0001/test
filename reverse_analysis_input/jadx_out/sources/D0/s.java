package D0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0365r;
import d0.InterfaceC0348a;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f492c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f495f;
    public boolean i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f493d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f494e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f496g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f497h = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f498j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0365r f499k = InterfaceC0348a.f5270a;

    public s(Context context, g gVar) {
        this.f490a = gVar;
        this.f491b = new v(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r23, long r25, long r27, long r29, boolean r31, D0.r r32) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.s.a(long, long, long, long, boolean, D0.r):int");
    }

    public final boolean b(boolean z4) {
        if (z4 && this.f493d == 3) {
            this.f497h = -9223372036854775807L;
            return true;
        }
        if (this.f497h == -9223372036854775807L) {
            return false;
        }
        this.f499k.getClass();
        if (SystemClock.elapsedRealtime() < this.f497h) {
            return true;
        }
        this.f497h = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z4) {
        this.i = z4;
        this.f499k.getClass();
        this.f497h = SystemClock.elapsedRealtime() + 5000;
    }

    public final void d(int i) {
        this.f493d = Math.min(this.f493d, i);
    }

    public final void e() {
        this.f492c = true;
        this.f499k.getClass();
        this.f495f = AbstractC0370w.M(SystemClock.elapsedRealtime());
        v vVar = this.f491b;
        vVar.f511d = true;
        vVar.f519m = 0L;
        vVar.f522p = -1L;
        vVar.f520n = -1L;
        t tVar = vVar.f509b;
        if (tVar != null) {
            u uVar = vVar.f510c;
            uVar.getClass();
            uVar.f505m.sendEmptyMessage(2);
            Handler handlerM = AbstractC0370w.m(null);
            DisplayManager displayManager = tVar.f501b;
            displayManager.registerDisplayListener(tVar, handlerM);
            v.a((v) tVar.f502c, displayManager.getDisplay(0));
        }
        vVar.d(false);
    }

    public final void f() {
        this.f492c = false;
        this.f497h = -9223372036854775807L;
        v vVar = this.f491b;
        vVar.f511d = false;
        t tVar = vVar.f509b;
        if (tVar != null) {
            tVar.f501b.unregisterDisplayListener(tVar);
            u uVar = vVar.f510c;
            uVar.getClass();
            uVar.f505m.sendEmptyMessage(3);
        }
        vVar.b();
    }

    public final void g(float f2) {
        v vVar = this.f491b;
        vVar.f513f = f2;
        C0027b c0027b = vVar.f508a;
        c0027b.f389a.c();
        c0027b.f390b.c();
        c0027b.f391c = false;
        c0027b.f392d = -9223372036854775807L;
        c0027b.f393e = 0;
        vVar.c();
    }

    public final void h(float f2) {
        AbstractC0360m.c(f2 > 0.0f);
        if (f2 == this.f498j) {
            return;
        }
        this.f498j = f2;
        v vVar = this.f491b;
        vVar.i = f2;
        vVar.f519m = 0L;
        vVar.f522p = -1L;
        vVar.f520n = -1L;
        vVar.d(false);
    }
}
