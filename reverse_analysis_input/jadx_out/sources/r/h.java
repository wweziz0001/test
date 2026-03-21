package r;

import b2.C0306b;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f9401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f9402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f9403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9404d;

    public final void finalize() {
        k kVar;
        j jVar = this.f9402b;
        if (jVar != null) {
            i iVar = jVar.f9407b;
            if (!iVar.isDone()) {
                C0306b c0306b = new C0306b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f9401a, 2);
                iVar.getClass();
                if (g.f9396f.i(iVar, null, new C0747b(c0306b))) {
                    g.c(iVar);
                }
            }
        }
        if (this.f9404d || (kVar = this.f9403c) == null) {
            return;
        }
        kVar.i(null);
    }
}
