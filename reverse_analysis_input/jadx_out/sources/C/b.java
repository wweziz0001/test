package C;

import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f277b;

    public b(Object obj, Parcelable parcelable) {
        this.f276a = obj;
        this.f277b = parcelable;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f276a, this.f276a) && Objects.equals(bVar.f277b, this.f277b);
    }

    public final int hashCode() {
        Object obj = this.f276a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Parcelable parcelable = this.f277b;
        return (parcelable != null ? parcelable.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f276a + " " + this.f277b + "}";
    }
}
