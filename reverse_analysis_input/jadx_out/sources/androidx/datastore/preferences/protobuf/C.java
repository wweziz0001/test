package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f4066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f4067b;

    static {
        S s4 = S.f4099c;
        B b4 = null;
        try {
            b4 = (B) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4066a = b4;
        f4067b = new B();
    }
}
