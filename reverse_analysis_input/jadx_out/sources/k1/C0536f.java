package k1;

/* JADX INFO: renamed from: k1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0536f implements Comparable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0532b f7671m;

    public C0536f(int i, C0532b c0532b) {
        this.f7670l = i;
        this.f7671m = c0532b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f7670l, ((C0536f) obj).f7670l);
    }
}
