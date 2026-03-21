package I2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends G2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile G2.r f1035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G2.e f1038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N2.a f1039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f1040f;

    public h(i iVar, boolean z4, boolean z5, G2.e eVar, N2.a aVar) {
        this.f1040f = iVar;
        this.f1036b = z4;
        this.f1037c = z5;
        this.f1038d = eVar;
        this.f1039e = aVar;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        if (this.f1036b) {
            aVar.K();
            return null;
        }
        G2.r rVarD = this.f1035a;
        if (rVarD == null) {
            rVarD = this.f1038d.d(this.f1040f, this.f1039e);
            this.f1035a = rVarD;
        }
        return rVarD.b(aVar);
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        if (this.f1037c) {
            bVar.p();
            return;
        }
        G2.r rVarD = this.f1035a;
        if (rVarD == null) {
            rVarD = this.f1038d.d(this.f1040f, this.f1039e);
            this.f1035a = rVarD;
        }
        rVarD.c(bVar, obj);
    }
}
