package l2;

import D0.n;

/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n f8220o = new n(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8221l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile h f8222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f8223n;

    public j(h hVar) {
        this.f8222m = hVar;
    }

    @Override // l2.h
    public final Object get() {
        h hVar = this.f8222m;
        n nVar = f8220o;
        if (hVar != nVar) {
            synchronized (this.f8221l) {
                try {
                    if (this.f8222m != nVar) {
                        Object obj = this.f8222m.get();
                        this.f8223n = obj;
                        this.f8222m = nVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f8223n;
    }

    public final String toString() {
        Object obj = this.f8222m;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f8220o) {
            obj = "<supplier that returned " + this.f8223n + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
