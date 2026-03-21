package x0;

import d0.InterfaceC0351d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K implements InterfaceC0351d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m0.e f10537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f10538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u0.g f10539o;

    public /* synthetic */ K(m0.e eVar, Object obj, u0.g gVar, int i) {
        this.f10536l = i;
        this.f10537m = eVar;
        this.f10538n = obj;
        this.f10539o = gVar;
    }

    @Override // d0.InterfaceC0351d
    public final void accept(Object obj) {
        N n4 = (N) obj;
        switch (this.f10536l) {
            case 0:
                m0.e eVar = this.f10537m;
                n4.a(eVar.f8496a, eVar.f8497b, (C0984z) this.f10538n, this.f10539o);
                break;
            case 1:
                m0.e eVar2 = this.f10537m;
                n4.d(eVar2.f8496a, eVar2.f8497b, (C0984z) this.f10538n, this.f10539o);
                break;
            case 2:
                m0.e eVar3 = this.f10537m;
                n4.b(eVar3.f8496a, eVar3.f8497b, (C0984z) this.f10538n, this.f10539o);
                break;
            default:
                n4.f(this.f10537m.f8496a, (H) this.f10538n, this.f10539o);
                break;
        }
    }
}
