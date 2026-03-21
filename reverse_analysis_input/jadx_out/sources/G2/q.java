package G2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f911a;

    public q(r rVar) {
        this.f911a = rVar;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) {
        if (aVar.E() != 9) {
            return this.f911a.b(aVar);
        }
        aVar.A();
        return null;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.p();
        } else {
            this.f911a.c(bVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f911a + "]";
    }
}
