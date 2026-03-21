package u3;

import java.util.Objects;

/* JADX INFO: renamed from: u3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0895a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f10254a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0895a.class != obj.getClass()) {
            return false;
        }
        return this.f10254a.equals(((C0895a) obj).f10254a);
    }

    public final int hashCode() {
        return Objects.hash(this.f10254a);
    }
}
