package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0224p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0223o f4187a = new C0223o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0223o f4188b;

    static {
        S s4 = S.f4099c;
        C0223o c0223o = null;
        try {
            c0223o = (C0223o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4188b = c0223o;
    }
}
