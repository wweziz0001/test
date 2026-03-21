package r;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f9405h;

    public i(j jVar) {
        this.f9405h = jVar;
    }

    @Override // r.g
    public final String g() {
        h hVar = (h) this.f9405h.f9406a.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f9401a + "]";
    }
}
