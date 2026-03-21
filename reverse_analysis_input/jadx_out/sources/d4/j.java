package d4;

import a4.u;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends u {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicReferenceArray f5449p;

    public j(long j5, j jVar, int i) {
        super(j5, jVar, i);
        this.f5449p = new AtomicReferenceArray(i.f5448f);
    }

    @Override // a4.u
    public final int f() {
        return i.f5448f;
    }

    @Override // a4.u
    public final void g(int i, E3.i iVar) {
        this.f5449p.set(i, i.f5447e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f3625n + ", hashCode=" + hashCode() + ']';
    }
}
