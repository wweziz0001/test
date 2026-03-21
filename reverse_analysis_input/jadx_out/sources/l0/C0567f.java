package l0;

import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: renamed from: l0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0567f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7848c;

    public C0567f(String str, String str2, String str3) {
        this.f7846a = str;
        this.f7847b = str2;
        this.f7848c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0567f.class != obj.getClass()) {
            return false;
        }
        C0567f c0567f = (C0567f) obj;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f7846a, c0567f.f7846a) && Objects.equals(this.f7847b, c0567f.f7847b) && Objects.equals(this.f7848c, c0567f.f7848c);
    }

    public final int hashCode() {
        int iHashCode = this.f7846a.hashCode() * 31;
        String str = this.f7847b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7848c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
