package c4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f5091o = new d(k.f5100c, k.f5101d, k.f5102e, k.f5098a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // V3.AbstractC0141s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
