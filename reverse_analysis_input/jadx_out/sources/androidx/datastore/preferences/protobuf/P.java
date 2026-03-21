package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f4097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O f4098b;

    static {
        S s4 = S.f4099c;
        O o4 = null;
        try {
            o4 = (O) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4097a = o4;
        f4098b = new O();
    }
}
