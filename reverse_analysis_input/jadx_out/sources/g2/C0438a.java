package g2;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: g2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0438a implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f5825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f5826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f5827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f5828o;

    public C0438a(List list, Boolean bool, String str, List list2) {
        this.f5825l = list;
        this.f5826m = bool;
        this.f5827n = str;
        this.f5828o = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0438a.class != obj.getClass()) {
            return false;
        }
        C0438a c0438a = (C0438a) obj;
        List list = c0438a.f5825l;
        List list2 = this.f5825l;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        Boolean bool = c0438a.f5826m;
        Boolean bool2 = this.f5826m;
        if (bool2 == null ? bool != null : !bool2.equals(bool)) {
            return false;
        }
        String str = c0438a.f5827n;
        String str2 = this.f5827n;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list3 = c0438a.f5828o;
        List list4 = this.f5828o;
        return list4 != null ? list4.equals(list3) : list3 == null;
    }

    public final int hashCode() {
        List list = this.f5825l;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        Boolean bool = this.f5826m;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f5827n;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        List list2 = this.f5828o;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }
}
