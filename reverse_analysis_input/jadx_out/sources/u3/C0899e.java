package u3;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: u3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0899e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f10259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f10260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f10261c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0899e.class != obj.getClass()) {
            return false;
        }
        C0899e c0899e = (C0899e) obj;
        return this.f10259a.equals(c0899e.f10259a) && this.f10260b.equals(c0899e.f10260b) && this.f10261c.equals(c0899e.f10261c);
    }

    public final int hashCode() {
        return Objects.hash(this.f10259a, this.f10260b, this.f10261c);
    }
}
