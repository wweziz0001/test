package m2;

import java.io.Serializable;

/* JADX INFO: renamed from: m2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0663w extends a0 implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A.c f8667l;

    public C0663w(A.c cVar) {
        this.f8667l = cVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f8667l.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0663w) {
            return this.f8667l.equals(((C0663w) obj).f8667l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8667l.hashCode();
    }

    public final String toString() {
        return this.f8667l.toString();
    }
}
