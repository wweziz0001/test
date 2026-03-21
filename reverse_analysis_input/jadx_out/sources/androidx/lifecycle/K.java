package androidx.lifecycle;

import v1.C0916f;

/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC0276s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f4493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4494c;

    public K(String str, J j5) {
        this.f4492a = str;
        this.f4493b = j5;
    }

    @Override // androidx.lifecycle.InterfaceC0276s
    public final void b(InterfaceC0278u interfaceC0278u, EnumC0272n enumC0272n) {
        if (enumC0272n == EnumC0272n.ON_DESTROY) {
            this.f4494c = false;
            interfaceC0278u.getLifecycle().b(this);
        }
    }

    public final void c(C0916f c0916f, AbstractC0274p abstractC0274p) {
        N3.h.e(c0916f, "registry");
        N3.h.e(abstractC0274p, "lifecycle");
        if (this.f4494c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f4494c = true;
        abstractC0274p.a(this);
        c0916f.c(this.f4492a, this.f4493b.f4491e);
    }
}
