package b2;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i4.a {
    @Override // i4.a
    public final void L(h hVar, h hVar2) {
        hVar.f4898b = hVar2;
    }

    @Override // i4.a
    public final void M(h hVar, Thread thread) {
        hVar.f4897a = thread;
    }

    @Override // i4.a
    public final boolean g(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f4904b != dVar) {
                    return false;
                }
                iVar.f4904b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i4.a
    public final boolean h(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f4903a != obj) {
                    return false;
                }
                iVar.f4903a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i4.a
    public final boolean i(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f4905c != hVar) {
                    return false;
                }
                iVar.f4905c = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
