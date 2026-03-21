package v3;

import java.util.Objects;

/* JADX INFO: renamed from: v3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0929j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f10381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f10382b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0929j.class != obj.getClass()) {
            return false;
        }
        C0929j c0929j = (C0929j) obj;
        return this.f10381a.equals(c0929j.f10381a) && this.f10382b.equals(c0929j.f10382b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10381a, this.f10382b);
    }
}
