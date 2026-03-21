package x0;

import F0.C0067n;
import a0.C0150A;
import f.C0402a;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.e f10629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I2.g f10630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0402a f10631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A0.b f10632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10633e;

    public Z(Z1.e eVar, C0067n c0067n) {
        I2.g gVar = new I2.g(c0067n, 26);
        C0402a c0402a = new C0402a();
        A0.b bVar = new A0.b(1);
        this.f10629a = eVar;
        this.f10630b = gVar;
        this.f10631c = c0402a;
        this.f10632d = bVar;
        this.f10633e = 1048576;
    }

    @Override // x0.G
    public final J a(C0150A c0150a) {
        c0150a.f3154b.getClass();
        m0.i iVarB = this.f10631c.b(c0150a);
        A0.b bVar = this.f10632d;
        return new a0(c0150a, this.f10629a, this.f10630b, iVarB, bVar, this.f10633e, false);
    }
}
