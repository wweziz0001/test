package G2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final I2.p f906l = new I2.p(false);

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof j) && ((j) obj).f906l.equals(this.f906l));
    }

    public final int hashCode() {
        return this.f906l.hashCode();
    }
}
