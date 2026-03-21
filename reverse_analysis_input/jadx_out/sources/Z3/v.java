package Z3;

import V3.C0142t;
import V3.InterfaceC0132i;
import V3.P;
import V3.Z;

/* JADX INFO: loaded from: classes.dex */
public final class v extends N3.i implements M3.p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f3145m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s sVar) {
        super(2);
        this.f3145m = sVar;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        E3.g gVar = (E3.g) obj2;
        E3.h key = gVar.getKey();
        E3.g gVarL = this.f3145m.f3139p.l(key);
        if (key != C0142t.f2444m) {
            return Integer.valueOf(gVar != gVarL ? Integer.MIN_VALUE : iIntValue + 1);
        }
        P p4 = (P) gVarL;
        P parent = (P) gVar;
        while (true) {
            if (parent != null) {
                if (parent == p4 || !(parent instanceof a4.t)) {
                    break;
                }
                InterfaceC0132i interfaceC0132i = (InterfaceC0132i) Z.f2407m.get((Z) parent);
                parent = interfaceC0132i != null ? interfaceC0132i.getParent() : null;
            } else {
                parent = null;
                break;
            }
        }
        if (parent == p4) {
            if (p4 != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + p4 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
