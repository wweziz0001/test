package B0;

import android.net.Uri;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.C0415j;
import f0.C0417l;
import f0.C0431z;
import f0.InterfaceC0413h;
import java.util.Collections;
import java.util.Map;
import x0.C0984z;

/* JADX INFO: loaded from: classes.dex */
public final class u implements o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0417l f246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0431z f248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile Object f250q;

    public u(InterfaceC0413h interfaceC0413h, Uri uri, int i, t tVar) {
        Map mapEmptyMap = Collections.emptyMap();
        AbstractC0360m.j(uri, "The uri must be set.");
        C0417l c0417l = new C0417l(uri, 1, null, mapEmptyMap, 0L, -1L, null, 1);
        this.f248o = new C0431z(interfaceC0413h);
        this.f246m = c0417l;
        this.f247n = i;
        this.f249p = tVar;
        this.f245l = C0984z.f10817b.getAndIncrement();
    }

    @Override // B0.o
    public final void e() {
        this.f248o.f5734m = 0L;
        C0415j c0415j = new C0415j(this.f248o, this.f246m);
        try {
            c0415j.f5674l.p(c0415j.f5675m);
            c0415j.f5677o = true;
            Uri uriR = this.f248o.f5733l.r();
            uriR.getClass();
            this.f250q = this.f249p.l(uriR, c0415j);
        } finally {
            AbstractC0370w.g(c0415j);
        }
    }

    @Override // B0.o
    public final void g() {
    }
}
