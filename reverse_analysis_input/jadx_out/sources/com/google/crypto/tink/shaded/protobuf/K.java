package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class K implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P[] f5146a;

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final boolean a(Class cls) {
        for (P p4 : this.f5146a) {
            if (p4.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final b0 b(Class cls) {
        for (P p4 : this.f5146a) {
            if (p4.a(cls)) {
                return p4.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
