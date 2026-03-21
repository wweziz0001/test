package a0;

import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: renamed from: a0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0191q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3437b;

    static {
        AbstractC0370w.G(0);
        AbstractC0370w.G(1);
    }

    public C0191q(String str, String str2) {
        this.f3436a = AbstractC0370w.N(str);
        this.f3437b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0191q.class != obj.getClass()) {
            return false;
        }
        C0191q c0191q = (C0191q) obj;
        return Objects.equals(this.f3436a, c0191q.f3436a) && Objects.equals(this.f3437b, c0191q.f3437b);
    }

    public final int hashCode() {
        int iHashCode = this.f3437b.hashCode() * 31;
        String str = this.f3436a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
