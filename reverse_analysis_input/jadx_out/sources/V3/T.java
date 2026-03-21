package V3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class T extends Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2391n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(P p4) {
        super(true);
        boolean z4 = true;
        I(p4);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z.f2407m;
        InterfaceC0132i interfaceC0132i = (InterfaceC0132i) atomicReferenceFieldUpdater.get(this);
        C0133j c0133j = interfaceC0132i instanceof C0133j ? (C0133j) interfaceC0132i : null;
        if (c0133j == null) {
            z4 = false;
            break;
        }
        Z zN = c0133j.n();
        while (!zN.C()) {
            InterfaceC0132i interfaceC0132i2 = (InterfaceC0132i) atomicReferenceFieldUpdater.get(zN);
            C0133j c0133j2 = interfaceC0132i2 instanceof C0133j ? (C0133j) interfaceC0132i2 : null;
            if (c0133j2 == null) {
                z4 = false;
                break;
            }
            zN = c0133j2.n();
        }
        this.f2391n = z4;
    }

    @Override // V3.Z
    public final boolean C() {
        return this.f2391n;
    }

    @Override // V3.Z
    public final boolean D() {
        return true;
    }
}
