package v;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f10290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f10291b;

    public k(Resources resources, Resources.Theme theme) {
        this.f10290a = resources;
        this.f10291b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f10290a.equals(kVar.f10290a) && Objects.equals(this.f10291b, kVar.f10291b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10290a, this.f10291b);
    }
}
