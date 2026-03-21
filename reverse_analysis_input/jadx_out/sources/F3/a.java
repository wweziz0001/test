package F3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a[] f862m;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f861l = aVar;
        f862m = new a[]{aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f862m.clone();
    }
}
