package e3;

/* JADX INFO: renamed from: e3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0395d implements InterfaceC0393b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0394c f5627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0397f f5628b;

    public C0395d(C0397f c0397f, C0394c c0394c) {
        this.f5628b = c0397f;
        this.f5627a = c0394c;
    }

    @Override // e3.InterfaceC0393b
    public final void onEngineWillDestroy() {
        this.f5628b.f5635a.remove(this.f5627a);
    }

    @Override // e3.InterfaceC0393b
    public final void onPreEngineRestart() {
    }
}
