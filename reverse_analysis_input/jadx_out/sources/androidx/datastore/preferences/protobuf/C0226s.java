package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0226s implements K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0226s f4213b = new C0226s(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4214a;

    public /* synthetic */ C0226s(int i) {
        this.f4214a = i;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean a(Class cls) {
        switch (this.f4214a) {
            case 0:
                return AbstractC0229v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final U b(Class cls) {
        switch (this.f4214a) {
            case 0:
                if (!AbstractC0229v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (U) AbstractC0229v.f(cls.asSubclass(AbstractC0229v.class)).e(3);
                } catch (Exception e5) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
