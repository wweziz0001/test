package y3;

/* JADX INFO: renamed from: y3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1030a extends Throwable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f11045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f11046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f11047n;

    public C1030a(String str, String str2, String str3) {
        this.f11045l = str;
        this.f11046m = str2;
        this.f11047n = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f11046m;
    }
}
