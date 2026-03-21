package x0;

import d0.InterfaceC0351d;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements InterfaceC0351d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m0.e f10540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0984z f10541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u0.g f10542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ IOException f10543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f10544p;

    public /* synthetic */ L(m0.e eVar, C0984z c0984z, u0.g gVar, IOException iOException, boolean z4) {
        this.f10540l = eVar;
        this.f10541m = c0984z;
        this.f10542n = gVar;
        this.f10543o = iOException;
        this.f10544p = z4;
    }

    @Override // d0.InterfaceC0351d
    public final void accept(Object obj) {
        N n4 = (N) obj;
        m0.e eVar = this.f10540l;
        n4.e(eVar.f8496a, eVar.f8497b, this.f10541m, this.f10542n, this.f10543o, this.f10544p);
    }
}
