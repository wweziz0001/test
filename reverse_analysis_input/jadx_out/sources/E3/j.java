package E3;

import M3.p;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f675l = new j();

    @Override // E3.i
    public final i c(h hVar) {
        N3.h.e(hVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // E3.i
    public final g l(h hVar) {
        N3.h.e(hVar, "key");
        return null;
    }

    @Override // E3.i
    public final i o(i iVar) {
        N3.h.e(iVar, "context");
        return iVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // E3.i
    public final Object k(Object obj, p pVar) {
        return obj;
    }
}
