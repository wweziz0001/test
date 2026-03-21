package d4;

import F0.p;
import M3.l;
import V3.C0129f;
import V3.InterfaceC0128e;
import V3.l0;
import a4.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0128e, l0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0129f f5431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f5432m;

    public c(d dVar, C0129f c0129f) {
        this.f5432m = dVar;
        this.f5431l = c0129f;
    }

    @Override // V3.l0
    public final void a(u uVar, int i) {
        this.f5431l.a(uVar, i);
    }

    @Override // V3.InterfaceC0128e
    public final void g(Object obj, l lVar) {
        B3.g gVar = B3.g.f275a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f5433g;
        d dVar = this.f5432m;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f5431l.g(gVar, new b(dVar, 0, this));
    }

    @Override // E3.d
    public final E3.i getContext() {
        return this.f5431l.f2418p;
    }

    @Override // V3.InterfaceC0128e
    public final p h(Object obj, l lVar) {
        d dVar = this.f5432m;
        b bVar = new b(dVar, 1, this);
        p pVarH = this.f5431l.h((B3.g) obj, bVar);
        if (pVarH != null) {
            d.f5433g.set(dVar, null);
        }
        return pVarH;
    }

    @Override // E3.d
    public final void j(Object obj) {
        this.f5431l.j(obj);
    }

    @Override // V3.InterfaceC0128e
    public final void p(Object obj) {
        this.f5431l.p(obj);
    }
}
