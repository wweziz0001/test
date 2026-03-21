package t0;

import F0.C0066m;
import android.os.Handler;
import d0.AbstractC0370w;

/* JADX INFO: renamed from: t0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0848e implements B0.o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u f9863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final I2.g f9864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Z1.e f9865o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p1.b f9867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC0847d f9868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0849f f9869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0066m f9870t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f9871u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile long f9873w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f9866p = AbstractC0370w.m(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile long f9872v = -9223372036854775807L;

    public C0848e(int i, u uVar, I2.g gVar, Z1.e eVar, p1.b bVar) {
        this.f9862l = i;
        this.f9863m = uVar;
        this.f9864n = gVar;
        this.f9865o = eVar;
        this.f9867q = bVar;
    }

    @Override // B0.o
    public final void e() {
        if (this.f9871u) {
            this.f9871u = false;
        }
        try {
            if (this.f9868r == null) {
                InterfaceC0847d interfaceC0847dK = this.f9867q.k(this.f9862l);
                this.f9868r = interfaceC0847dK;
                this.f9866p.post(new Q.l(this, interfaceC0847dK.g(), this.f9868r, 4));
                InterfaceC0847d interfaceC0847d = this.f9868r;
                interfaceC0847d.getClass();
                this.f9870t = new C0066m(interfaceC0847d, 0L, -1L);
                C0849f c0849f = new C0849f(this.f9863m.f9972a, this.f9862l);
                this.f9869s = c0849f;
                c0849f.j(this.f9865o);
            }
            while (!this.f9871u) {
                if (this.f9872v != -9223372036854775807L) {
                    C0849f c0849f2 = this.f9869s;
                    c0849f2.getClass();
                    c0849f2.b(this.f9873w, this.f9872v);
                    this.f9872v = -9223372036854775807L;
                }
                C0849f c0849f3 = this.f9869s;
                c0849f3.getClass();
                C0066m c0066m = this.f9870t;
                c0066m.getClass();
                if (c0849f3.d(c0066m, new F0.u()) == -1) {
                    break;
                }
            }
            this.f9871u = false;
            InterfaceC0847d interfaceC0847d2 = this.f9868r;
            interfaceC0847d2.getClass();
            if (interfaceC0847d2.h()) {
                Z1.f.g(this.f9868r);
                this.f9868r = null;
            }
        } catch (Throwable th) {
            InterfaceC0847d interfaceC0847d3 = this.f9868r;
            interfaceC0847d3.getClass();
            if (interfaceC0847d3.h()) {
                Z1.f.g(this.f9868r);
                this.f9868r = null;
            }
            throw th;
        }
    }

    @Override // B0.o
    public final void g() {
        this.f9871u = true;
    }
}
