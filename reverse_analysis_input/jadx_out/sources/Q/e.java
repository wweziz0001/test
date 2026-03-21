package Q;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1706b;

    public e(f fVar) {
        this.f1706b = fVar;
    }

    @Override // i4.a
    public final void I(Throwable th) {
        this.f1706b.f1707a.d(th);
    }

    @Override // i4.a
    public final void J(Z1.i iVar) {
        f fVar = this.f1706b;
        fVar.f1709c = iVar;
        Z1.i iVar2 = fVar.f1709c;
        new A0.b(20);
        d dVar = fVar.f1707a.f1721h;
        Z1.c cVar = new Z1.c();
        cVar.f2996l = iVar2;
        cVar.f2997m = dVar;
        fVar.f1708b = cVar;
        j jVar = fVar.f1707a;
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        jVar.f1714a.writeLock().lock();
        try {
            jVar.f1716c = 1;
            arrayList.addAll(jVar.f1715b);
            jVar.f1715b.clear();
            jVar.f1714a.writeLock().unlock();
            jVar.f1717d.post(new h(arrayList, jVar.f1716c, null));
        } catch (Throwable th) {
            jVar.f1714a.writeLock().unlock();
            throw th;
        }
    }
}
