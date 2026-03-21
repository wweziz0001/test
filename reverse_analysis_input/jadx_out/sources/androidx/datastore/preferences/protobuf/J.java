package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f4077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f4078b;

    static {
        S s4 = S.f4099c;
        I i = null;
        try {
            i = (I) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4077a = i;
        f4078b = new I();
    }
}
