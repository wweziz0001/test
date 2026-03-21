package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class D implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K[] f4068a;

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean a(Class cls) {
        for (K k4 : this.f4068a) {
            if (k4.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final U b(Class cls) {
        for (K k4 : this.f4068a) {
            if (k4.a(cls)) {
                return k4.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
