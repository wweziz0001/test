package x0;

import a0.AbstractC0156G;
import a0.C0150A;
import a0.C0153D;
import a0.C0189o;
import a0.C0190p;
import a0.C0194t;
import a0.C0195u;
import a0.C0196v;
import a0.C0197w;
import a0.C0198x;
import android.net.Uri;
import d0.AbstractC0360m;
import f0.InterfaceC0403A;
import java.util.Collections;
import java.util.List;
import m2.C0640G;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends AbstractC0960a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0190p f10739u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0150A f10740v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f10741w;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f10742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0150A f10743t;

    static {
        C0189o c0189o = new C0189o();
        c0189o.f3387m = AbstractC0156G.m("audio/raw");
        c0189o.f3366B = 2;
        c0189o.f3367C = 44100;
        c0189o.f3368D = 2;
        C0190p c0190p = new C0190p(c0189o);
        f10739u = c0190p;
        F0.u uVar = new F0.u();
        C0640G c0640g = m2.I.f8549m;
        m2.b0 b0Var = m2.b0.f8583p;
        List listEmptyList = Collections.emptyList();
        m2.b0 b0Var2 = m2.b0.f8583p;
        C0195u c0195u = new C0195u();
        C0198x c0198x = C0198x.f3466a;
        Uri uri = Uri.EMPTY;
        f10740v = new C0150A("SilenceMediaSource", new C0194t(uVar), uri != null ? new C0197w(uri, c0190p.f3424n, null, listEmptyList, b0Var2, null, -9223372036854775807L) : null, new C0196v(c0195u), C0153D.f3185B, c0198x);
        f10741w = new byte[4096];
    }

    public m0(long j5, C0150A c0150a) {
        AbstractC0360m.c(j5 >= 0);
        this.f10742s = j5;
        this.f10743t = c0150a;
    }

    @Override // x0.J
    public final synchronized C0150A a() {
        return this.f10743t;
    }

    @Override // x0.J
    public final synchronized void b(C0150A c0150a) {
        this.f10743t = c0150a;
    }

    @Override // x0.J
    public final F c(H h2, B0.f fVar, long j5) {
        return new k0(this.f10742s);
    }

    @Override // x0.AbstractC0960a
    public final void p(InterfaceC0403A interfaceC0403A) {
        r(new n0(this.f10742s, true, false, a()));
    }

    @Override // x0.J
    public final void e() {
    }

    @Override // x0.AbstractC0960a
    public final void t() {
    }

    @Override // x0.J
    public final void d(F f2) {
    }
}
