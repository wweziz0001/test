package Q1;

import android.net.Uri;

/* JADX INFO: renamed from: Q1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0120c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f1806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1807b;

    public C0120c(boolean z4, Uri uri) {
        this.f1806a = uri;
        this.f1807b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0120c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        N3.h.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C0120c c0120c = (C0120c) obj;
        return N3.h.a(this.f1806a, c0120c.f1806a) && this.f1807b == c0120c.f1807b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1807b) + (this.f1806a.hashCode() * 31);
    }
}
