package B3;

import N3.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Throwable f270l;

    public c(Throwable th) {
        h.e(th, "exception");
        this.f270l = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (h.a(this.f270l, ((c) obj).f270l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f270l.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f270l + ')';
    }
}
