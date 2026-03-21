package b3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f4921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f4922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ h[] f4923n;

    static {
        h hVar = new h("ONE_OFF", 0);
        f4921l = hVar;
        h hVar2 = new h("PERIODIC", 1);
        f4922m = hVar2;
        f4923n = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f4923n.clone();
    }
}
