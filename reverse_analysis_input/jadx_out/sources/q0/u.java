package q0;

import android.text.TextUtils;
import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9369c;

    public u(String str, boolean z4, boolean z5) {
        this.f9367a = str;
        this.f9368b = z4;
        this.f9369c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != u.class) {
            return false;
        }
        u uVar = (u) obj;
        return TextUtils.equals(this.f9367a, uVar.f9367a) && this.f9368b == uVar.f9368b && this.f9369c == uVar.f9369c;
    }

    public final int hashCode() {
        return ((AbstractC0307a.e(31, this.f9367a, 31) + (this.f9368b ? 1231 : 1237)) * 31) + (this.f9369c ? 1231 : 1237);
    }
}
