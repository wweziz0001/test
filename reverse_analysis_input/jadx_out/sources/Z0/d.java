package Z0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2834c;

    public j0.e a() {
        if (this.f2832a || !(this.f2833b || this.f2834c)) {
            return new j0.e(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
