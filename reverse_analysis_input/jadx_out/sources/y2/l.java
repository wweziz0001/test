package y2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f10950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f10951b;

    public l(Class cls, Class cls2) {
        this.f10950a = cls;
        this.f10951b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f10950a.equals(this.f10950a) && lVar.f10951b.equals(this.f10951b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10950a, this.f10951b);
    }

    public final String toString() {
        return this.f10950a.getSimpleName() + " with primitive type: " + this.f10951b.getSimpleName();
    }
}
