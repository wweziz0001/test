package a4;

import V3.InterfaceC0143u;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0143u {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E3.i f3593l;

    public e(E3.i iVar) {
        this.f3593l = iVar;
    }

    @Override // V3.InterfaceC0143u
    public final E3.i i() {
        return this.f3593l;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f3593l + ')';
    }
}
