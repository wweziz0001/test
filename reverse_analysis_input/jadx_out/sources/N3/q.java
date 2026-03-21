package N3;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f1627a;

    static {
        r rVar = null;
        try {
            rVar = (r) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (rVar == null) {
            rVar = new r();
        }
        f1627a = rVar;
    }

    public static e a(Class cls) {
        f1627a.getClass();
        return new e(cls);
    }
}
