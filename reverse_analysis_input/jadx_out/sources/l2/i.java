package l2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient Object f8216l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f8217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile transient boolean f8218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient Object f8219o;

    public i(h hVar) {
        this.f8217m = hVar;
    }

    @Override // l2.h
    public final Object get() {
        if (!this.f8218n) {
            synchronized (this.f8216l) {
                try {
                    if (!this.f8218n) {
                        Object obj = this.f8217m.get();
                        this.f8219o = obj;
                        this.f8218n = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f8219o;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f8218n) {
            obj = "<supplier that returned " + this.f8219o + ">";
        } else {
            obj = this.f8217m;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
