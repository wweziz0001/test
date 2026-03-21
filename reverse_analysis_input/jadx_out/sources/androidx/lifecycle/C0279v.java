package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0279v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0273o f4541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0276s f4542b;

    public final void a(InterfaceC0278u interfaceC0278u, EnumC0272n enumC0272n) {
        EnumC0273o enumC0273oA = enumC0272n.a();
        EnumC0273o enumC0273o = this.f4541a;
        N3.h.e(enumC0273o, "state1");
        if (enumC0273oA.compareTo(enumC0273o) < 0) {
            enumC0273o = enumC0273oA;
        }
        this.f4541a = enumC0273o;
        this.f4542b.b(interfaceC0278u, enumC0272n);
        this.f4541a = enumC0273oA;
    }
}
