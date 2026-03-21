package y2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f10961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F2.a f10962b;

    public p(Class cls, F2.a aVar) {
        this.f10961a = cls;
        this.f10962b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f10961a.equals(this.f10961a) && pVar.f10962b.equals(this.f10962b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10961a, this.f10962b);
    }

    public final String toString() {
        return this.f10961a.getSimpleName() + ", object identifier: " + this.f10962b;
    }
}
