package U2;

import Z1.f;
import n3.C0704n;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f2284q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0704n f2285r;

    public c(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        super(10);
        this.f2285r = c0704n;
        this.f2284q = new b(interfaceC0706p, 0);
    }

    @Override // Z1.f
    public final Object p(String str) {
        return this.f2285r.a(str);
    }

    @Override // Z1.f
    public final String q() {
        return this.f2285r.f8938a;
    }

    @Override // Z1.f
    public final d s() {
        return this.f2284q;
    }

    @Override // Z1.f
    public final boolean w() {
        return this.f2285r.b("transactionId");
    }
}
