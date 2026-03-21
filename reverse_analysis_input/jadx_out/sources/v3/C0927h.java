package v3;

import java.util.Objects;

/* JADX INFO: renamed from: v3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0927h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f10377a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0927h.class != obj.getClass()) {
            return false;
        }
        return this.f10377a.equals(((C0927h) obj).f10377a);
    }

    public final int hashCode() {
        return Objects.hash(this.f10377a);
    }
}
