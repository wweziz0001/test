package T2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0.d f2205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f2206b;

    public f(B0.d dVar, Runnable runnable) {
        this.f2205a = dVar;
        this.f2206b = runnable;
    }

    public final Integer a() {
        B0.d dVar = this.f2205a;
        if (dVar != null) {
            return Integer.valueOf(((e) dVar.f190l).f2195c);
        }
        return null;
    }
}
