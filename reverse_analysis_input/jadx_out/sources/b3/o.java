package b3;

import Q1.C;

/* JADX INFO: loaded from: classes.dex */
public final class o extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4929c;

    public o(String str) {
        this.f4929c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && N3.h.a(this.f4929c, ((o) obj).f4929c);
    }

    public final int hashCode() {
        return this.f4929c.hashCode();
    }

    public final String toString() {
        return "ByUniqueName(uniqueName=" + this.f4929c + ')';
    }
}
