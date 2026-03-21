package r;

/* JADX INFO: loaded from: classes.dex */
public final class e extends D1.b {
    @Override // D1.b
    public final void L(f fVar, f fVar2) {
        fVar.f9393b = fVar2;
    }

    @Override // D1.b
    public final void M(f fVar, Thread thread) {
        fVar.f9392a = thread;
    }

    @Override // D1.b
    public final boolean h(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f9399b != cVar) {
                    return false;
                }
                gVar.f9399b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.b
    public final boolean i(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f9398a != obj) {
                    return false;
                }
                gVar.f9398a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.b
    public final boolean j(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f9400c != fVar) {
                    return false;
                }
                gVar.f9400c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
