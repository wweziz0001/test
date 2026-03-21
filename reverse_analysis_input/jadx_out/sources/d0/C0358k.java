package d0;

import a0.C0187m;

/* JADX INFO: renamed from: d0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0358k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0187m f5292b = new C0187m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5294d;

    public C0358k(Object obj) {
        this.f5291a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0358k.class != obj.getClass()) {
            return false;
        }
        return this.f5291a.equals(((C0358k) obj).f5291a);
    }

    public final int hashCode() {
        return this.f5291a.hashCode();
    }
}
