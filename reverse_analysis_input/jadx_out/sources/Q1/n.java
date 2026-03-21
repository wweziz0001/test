package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1831a;

    public n(g gVar) {
        this.f1831a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        return this.f1831a.equals(((n) obj).f1831a);
    }

    public final int hashCode() {
        return this.f1831a.hashCode() + (n.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f1831a + '}';
    }
}
