package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1830a = g.f1823c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f1830a.equals(((l) obj).f1830a);
    }

    public final int hashCode() {
        return this.f1830a.hashCode() + (l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f1830a + '}';
    }
}
