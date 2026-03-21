package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H extends I {
    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void a(long j5, Object obj) {
        ((AbstractC0322b) ((InterfaceC0345z) o0.f5235b.i(j5, obj))).f5180l = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void b(long j5, Object obj, Object obj2) {
        n0 n0Var = o0.f5235b;
        InterfaceC0345z interfaceC0345zC = (InterfaceC0345z) n0Var.i(j5, obj);
        InterfaceC0345z interfaceC0345z = (InterfaceC0345z) n0Var.i(j5, obj2);
        int size = interfaceC0345zC.size();
        int size2 = interfaceC0345z.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0322b) interfaceC0345zC).f5180l) {
                interfaceC0345zC = interfaceC0345zC.c(size2 + size);
            }
            interfaceC0345zC.addAll(interfaceC0345z);
        }
        if (size > 0) {
            interfaceC0345z = interfaceC0345zC;
        }
        o0.v(j5, obj, interfaceC0345z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final List c(long j5, Object obj) {
        InterfaceC0345z interfaceC0345z = (InterfaceC0345z) o0.f5235b.i(j5, obj);
        if (((AbstractC0322b) interfaceC0345z).f5180l) {
            return interfaceC0345z;
        }
        int size = interfaceC0345z.size();
        InterfaceC0345z interfaceC0345zC = interfaceC0345z.c(size == 0 ? 10 : size * 2);
        o0.v(j5, obj, interfaceC0345zC);
        return interfaceC0345zC;
    }
}
