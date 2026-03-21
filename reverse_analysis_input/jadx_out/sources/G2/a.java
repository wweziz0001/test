package G2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f887d = new a("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f890c;

    static {
        new a("\n", "  ", true);
    }

    public a(String str, String str2, boolean z4) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f888a = str;
        this.f889b = str2;
        this.f890c = z4;
    }
}
