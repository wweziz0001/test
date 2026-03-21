package n3;

import a0.C0200z;

/* JADX INFO: renamed from: n3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0707q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0696f f8940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0708r f8942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0200z f8943d;

    public C0707q(InterfaceC0696f interfaceC0696f, String str) {
        this(interfaceC0696f, str, x.f8947a, null);
    }

    public final void a(String str, Object obj, InterfaceC0706p interfaceC0706p) {
        this.f8940a.h(this.f8941b, this.f8942c.d(new C0704n(obj, str)), interfaceC0706p == null ? null : new C0691a(this, 1, interfaceC0706p));
    }

    public final void b(InterfaceC0705o interfaceC0705o) {
        String str = this.f8941b;
        InterfaceC0696f interfaceC0696f = this.f8940a;
        C0200z c0200z = this.f8943d;
        if (c0200z != null) {
            interfaceC0696f.d(str, interfaceC0705o != null ? new Z1.e(this, interfaceC0705o, 18, false) : null, c0200z);
        } else {
            interfaceC0696f.k(str, interfaceC0705o != null ? new Z1.e(this, interfaceC0705o, 18, false) : null);
        }
    }

    public C0707q(InterfaceC0696f interfaceC0696f, String str, InterfaceC0708r interfaceC0708r, C0200z c0200z) {
        this.f8940a = interfaceC0696f;
        this.f8941b = str;
        this.f8942c = interfaceC0708r;
        this.f8943d = c0200z;
    }
}
