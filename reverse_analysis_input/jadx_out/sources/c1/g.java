package c1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f5039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f5040m;

    public g(long j5, byte[] bArr) {
        this.f5039l = j5;
        this.f5040m = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f5039l, ((g) obj).f5039l);
    }
}
