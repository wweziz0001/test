package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0339t implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0339t f5249b = new C0339t(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5250a;

    public /* synthetic */ C0339t(int i) {
        this.f5250a = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final boolean a(Class cls) {
        switch (this.f5250a) {
            case 0:
                return AbstractC0342w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final b0 b(Class cls) {
        switch (this.f5250a) {
            case 0:
                if (!AbstractC0342w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (b0) AbstractC0342w.l(cls.asSubclass(AbstractC0342w.class)).k(3);
                } catch (Exception e5) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
