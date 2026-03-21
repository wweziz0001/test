package l0;

import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7861e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f7857a = str;
        this.f7858b = str2;
        this.f7859c = str3;
        this.f7860d = str4;
        this.f7861e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = iVar.f7857a;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f7857a, str) && Objects.equals(this.f7858b, iVar.f7858b) && Objects.equals(this.f7859c, iVar.f7859c) && Objects.equals(this.f7860d, iVar.f7860d) && Objects.equals(this.f7861e, iVar.f7861e);
    }

    public final int hashCode() {
        String str = this.f7857a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7858b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7859c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f7860d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f7861e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
