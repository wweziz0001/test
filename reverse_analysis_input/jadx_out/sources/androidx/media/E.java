package androidx.media;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4573c;

    public E(int i, String str, int i5) {
        this.f4571a = str;
        this.f4572b = i;
        this.f4573c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e5 = (E) obj;
        int i = this.f4573c;
        String str = this.f4571a;
        int i5 = this.f4572b;
        return (i5 < 0 || e5.f4572b < 0) ? TextUtils.equals(str, e5.f4571a) && i == e5.f4573c : TextUtils.equals(str, e5.f4571a) && i5 == e5.f4572b && i == e5.f4573c;
    }

    public final int hashCode() {
        return Objects.hash(this.f4571a, Integer.valueOf(this.f4573c));
    }
}
