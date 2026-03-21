package androidx.media3.exoplayer.smoothstreaming;

import B0.t;
import Z1.e;
import a0.C0150A;
import a0.C0200z;
import f.C0402a;
import f0.InterfaceC0412g;
import h0.C0452c;
import java.util.List;
import m0.i;
import m3.C0675i;
import p1.b;
import v0.C0910c;
import x0.G;
import x0.J;

/* JADX INFO: loaded from: classes.dex */
public final class SsMediaSource$Factory implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0452c f4664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0412g f4665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0402a f4667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A0.b f4668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4669f;

    public SsMediaSource$Factory(InterfaceC0412g interfaceC0412g) {
        C0452c c0452c = new C0452c();
        c0452c.f6102b = interfaceC0412g;
        c0452c.f6103c = new C0200z(7);
        this.f4664a = c0452c;
        this.f4665b = interfaceC0412g;
        this.f4667d = new C0402a();
        this.f4668e = new A0.b(1);
        this.f4669f = 30000L;
        this.f4666c = new b(17);
        c0452c.f6101a = true;
    }

    @Override // x0.G
    public final J a(C0150A c0150a) {
        c0150a.f3154b.getClass();
        C0675i c0675i = new C0675i(28);
        List list = c0150a.f3154b.f3462c;
        t eVar = !list.isEmpty() ? new e(c0675i, 20, list) : c0675i;
        i iVarB = this.f4667d.b(c0150a);
        A0.b bVar = this.f4668e;
        return new C0910c(c0150a, this.f4665b, eVar, this.f4664a, this.f4666c, iVarB, bVar, this.f4669f);
    }

    @Override // x0.G
    public final void b(boolean z4) {
        this.f4664a.f6101a = z4;
    }

    @Override // x0.G
    public final void c(C0200z c0200z) {
        this.f4664a.f6103c = c0200z;
    }
}
